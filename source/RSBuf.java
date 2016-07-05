import java.math.BigInteger;

public class RSBuf extends Class104 {
	static Class84 aClass84_1175;
	public int pos;
	public static int[] SHIFTS = new int[256];
	public byte[] backing;

	public void writeByte(final int var1) {
		backing[++pos - 1] = (byte) var1;
	}

	public void writeLong(final long var1) {
		backing[++pos - 1] = (byte) ((int) (var1 >> 56));
		backing[++pos - 1] = (byte) ((int) (var1 >> 48));
		backing[++pos - 1] = (byte) ((int) (var1 >> 40));
		backing[++pos - 1] = (byte) ((int) (var1 >> 32));
		backing[++pos - 1] = (byte) ((int) (var1 >> 24));
		backing[++pos - 1] = (byte) ((int) (var1 >> 16));
		backing[++pos - 1] = (byte) ((int) (var1 >> 8));
		backing[++pos - 1] = (byte) ((int) var1);
	}

	public void writeCompactedString(final String str) {
		final int header = str.indexOf(0);
		if (header >= 0)
			throw new IllegalArgumentException("");
		else {
			pos += Class33.writeInto(str, 0, str.length(), backing, pos);
			backing[++pos - 1] = 0;
		}
	}

	public void writeSpecialString(final CharSequence seq) {
		final int len = Class104_Sub20.actualLen(seq);
		backing[++pos - 1] = 0;
		writeCompact(len);
		pos += Class91.writeCompactStrBytes(backing, pos, seq);
	}

	public byte readByte() {
		return backing[++pos - 1];
	}

	public int readInt() {
		pos += 4;
		return (backing[pos - 4] & 255) + ((backing[pos - 2] & 255) << 16)
				+ ((backing[pos - 1] & 255) << 24) + ((backing[pos - 3] & 255) << 8);
	}

	public int readSTribyte() {
		pos += 3;
		return (backing[pos - 3] & 255) + ((backing[pos - 1] & 255) << 16)
				+ ((backing[pos - 2] & 255) << 8);
	}

	public void writeSmart(final int var1) {
		if ((var1 >= 0) && (var1 < 128))
			writeByte(var1);
		else if ((var1 >= 0) && (var1 < '\u8000'))
			writeShort(var1 + '\u8000');
		else
			throw new IllegalArgumentException();
	}

	public void writeCompact(final int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0)
						writeByte((var1 >>> 28) | 128);

					writeByte((var1 >>> 21) | 128);
				}

				writeByte((var1 >>> 14) | 128);
			}

			writeByte((var1 >>> 7) | 128);
		}

		writeByte(var1 & 127);
	}

	public int readUByte() {
		return backing[++pos - 1] & 255;
	}

	public int readShort() {
		pos += 2;
		return ((backing[pos - 2] & 255) << 8) + (backing[pos - 1] & 255);
	}

	public int readUShort() {
		pos += 2;
		int var1 = ((backing[pos - 2] & 255) << 8) + (backing[pos - 1] & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public int readMInt() {
		pos += 4;
		return ((backing[pos - 3] & 255) << 24) + ((backing[pos - 4] & 255) << 16)
				+ ((backing[pos - 1] & 255) << 8) + (backing[pos - 2] & 255);
	}

	public int readLEInt() {
		pos += 4;
		return ((backing[pos - 2] & 255) << 8) + ((backing[pos - 3] & 255) << 16)
				+ ((backing[pos - 4] & 255) << 24) + (backing[pos - 1] & 255);
	}

	public long readLELong() {
		final long var1 = readLEInt() & 4294967295L;
		final long var3 = readLEInt() & 4294967295L;
		return (var1 << 32) + var3;
	}

	public int readUByteA() {
		return (backing[++pos - 1] - 128) & 255;
	}

	public void readBytes(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var3 + var2); ++var4)
			var1[var4] = backing[++pos - 1];

	}

	public int readCompact() {
		final int var1 = backing[pos] & 255;
		return var1 < 128 ? readUByte() - 64 : readShort() - '\uc000';
	}

	public int readSpecial() {
		return backing[pos] < 0 ? readLEInt() & Integer.MAX_VALUE : readShort();
	}

	public int length() {
		byte var1 = backing[++pos - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = backing[++pos - 1])
			var2 = (var2 | (var1 & 127)) << 7;

		return var2 | var1;
	}

	public String readStr() {
		final byte var1 = backing[++pos - 1];
		if (var1 != 0)
			throw new IllegalStateException("");
		else {
			final int len = length();
			if ((len + pos) > backing.length)
				throw new IllegalStateException("");
			else {
				final byte[] src = backing;
				final int start = pos;
				final char[] chars = new char[len];
				int count = 0;
				int caret = start;

				int c;
				for (final int var8 = len + start; caret < var8; chars[count++] = (char) c) {
					final int unsigned = src[caret++] & 255;
					if (unsigned < 128) {
						if (unsigned == 0)
							c = '\ufffd';
						else
							c = unsigned;
					} else if (unsigned < 192)
						c = '\ufffd';
					else if (unsigned < 224) {
						if ((caret < var8) && ((src[caret] & 192) == 128)) {
							c = ((unsigned & 31) << 6) | (src[caret++] & 63);
							if (c < 128)
								c = '\ufffd';
						} else
							c = '\ufffd';
					} else if (unsigned < 240) {
						if (((1 + caret) < var8) && ((src[caret] & 192) == 128) && ((src[1 + caret] & 192) == 128)) {
							c = ((unsigned & 15) << 12) | ((src[caret++] & 63) << 6) | (src[caret++] & 63);
							if (c < 2048)
								c = '\ufffd';
						} else
							c = '\ufffd';
					} else if (unsigned < 248) {
						if (((2 + caret) < var8) && ((src[caret] & 192) == 128) && ((src[caret + 1] & 192) == 128)
								&& ((src[2 + caret] & 192) == 128)) {
							c = ((unsigned & 7) << 18) | ((src[caret++] & 63) << 12) | ((src[caret++] & 63) << 6)
									| (src[caret++] & 63);
							if ((c >= 65536) && (c <= 1114111))
								c = '\ufffd';
							else
								c = '\ufffd';
						} else
							c = '\ufffd';
					} else
						c = '\ufffd';
				}

				final String r = new String(chars, 0, count);
				pos += len;
				return r;
			}
		}
	}

	public void doRSA(final BigInteger var1, final BigInteger var2) {
		final int var3 = pos;
		pos = 0;
		final byte[] var4 = new byte[var3];
		readBytes(var4, 0, var3);
		final BigInteger var5 = new BigInteger(var4);
		final BigInteger var6 = var5; // .modPow(var1, var2); // uncommented disabled rsa being applied
		final byte[] var7 = var6.toByteArray();
		pos = 0;
		writeShort(var7.length);
		appendBytes(var7, 0, var7.length);
	}

	public int writeAndGetHeader(final int start) {
		final byte[] src = backing;
		final int end = pos;
		int v = -1;

		for (int var5 = start; var5 < end; ++var5)
			v = (v >>> 8) ^ SHIFTS[(v ^ src[var5]) & 255];

		v = ~v;
		writeInt(v);
		return v;
	}

	public void writeByteN(final int var1) {
		backing[++pos - 1] = (byte) (0 - var1);
	}

	public void writeByteA(final int var1) {
		backing[++pos - 1] = (byte) (var1 + 128);
	}

	public void writeByteS(final int var1) {
		backing[++pos - 1] = (byte) (128 - var1);
	}

	public void writeTribyte(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) var1;
	}

	public int readUByteS() {
		return (128 - backing[++pos - 1]) & 255;
	}

	public byte readByteA() {
		return (byte) (backing[++pos - 1] - 128);
	}

	public byte readByteS() {
		return (byte) (128 - backing[++pos - 1]);
	}

	public void writeShortA(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) (128 + var1);
	}

	public void writeLEShortA(final int var1) {
		backing[++pos - 1] = (byte) (128 + var1);
		backing[++pos - 1] = (byte) (var1 >> 8);
	}

	public int readLEShort() {
		pos += 2;
		return (backing[pos - 2] & 255) + ((backing[pos - 1] & 255) << 8);
	}

	public int readUShortA() {
		pos += 2;
		return ((backing[pos - 1] - 128) & 255) + ((backing[pos - 2] & 255) << 8);
	}

	public int readLEShortA() {
		pos += 2;
		return ((backing[pos - 2] - 128) & 255) + ((backing[pos - 1] & 255) << 8);
	}

	public int readUShortLE() {
		pos += 2;
		int var1 = ((backing[pos - 1] - 128) & 255) + ((backing[pos - 2] & 255) << 8);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public int readULEShortA() {
		pos += 2;
		int var1 = ((backing[pos - 1] & 255) << 8) + ((backing[pos - 2] - 128) & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public void writeLEInt(final int var1) {
		backing[++pos - 1] = (byte) var1;
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 24);
	}

	public int readsmart() {
		final int var1 = backing[pos] & 255;
		return var1 < 128 ? readUByte() : readShort() - '\u8000';
	}

	public void putIntV2(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 24);
		backing[++pos - 1] = (byte) var1;
		backing[++pos - 1] = (byte) (var1 >> 8);
	}

	public int readIntV1() {
		pos += 4;
		return ((backing[pos - 4] & 255) << 8) + ((backing[pos - 2] & 255) << 24) + ((backing[pos - 1] & 255) << 16) + (backing[pos - 3] & 255);
	}

	static {
		for (int var0 = 0; var0 < 256; ++var0) {
			int var1 = var0;

			for (int var2 = 0; var2 < 8; ++var2)
				if ((var1 & 1) == 1)
					var1 = (var1 >>> 1) ^ -306674912;
				else
					var1 >>>= 1;

			SHIFTS[var0] = var1;
		}

	}

	public boolean method602() {
		pos -= 4;
		final byte[] var1 = backing;
		final int var2 = pos;
		int var3 = -1;

		int var4;
		for (var4 = 0; var4 < var2; ++var4)
			var3 = (var3 >>> 8) ^ SHIFTS[(var3 ^ var1[var4]) & 255];

		var3 = ~var3;
		var4 = readLEInt();
		return var4 == var3;
	}

	public void writeShort(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) var1;
	}

	public String method604() {
		if (backing[pos] == 0) {
			++pos;
			return null;
		} else
			return readString();
	}

	public void method605(final int[] var1, final int var2, final int var3) {
		final int var4 = pos;
		pos = var2;
		final int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = readLEInt();
			int var8 = readLEInt();
			int var9 = -957401312;
			final int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var7 -= (((var8 << 4) ^ (var8 >>> 5)) + var8) ^ (var9 + var1[var9 & 3])) {
				var8 -= (((var7 << 4) ^ (var7 >>> 5)) + var7) ^ (var1[(var9 >>> 11) & 3] + var9);
				var9 -= var10;
			}

			pos -= 8;
			writeInt(var7);
			writeInt(var8);
		}

		pos = var4;
	}

	public void writeLEShort(final int var1) {
		backing[++pos - 1] = (byte) var1;
		backing[++pos - 1] = (byte) (var1 >> 8);
	}

	public int readUByteN() {
		return (0 - backing[++pos - 1]) & 255;
	}

	public String readString() {
		final int start = pos;

		while (backing[++pos - 1] != 0) // 0 value terminator
			;

		final int length = pos - start - 1;
		return length == 0 ? "" : client.decodeStr(backing, start, length);
	}

	public void writeIntLE(final int var1) {
		backing[pos - var1 - 4] = (byte) (var1 >> 24);
		backing[pos - var1 - 3] = (byte) (var1 >> 16);
		backing[pos - var1 - 2] = (byte) (var1 >> 8);
		backing[pos - var1 - 1] = (byte) var1;
	}

	public void writeShortLE(final int var1) {
		backing[pos - var1 - 2] = (byte) (var1 >> 8);
		backing[pos - var1 - 1] = (byte) var1;
	}

	public int method611() {
		pos += 2;
		int var1 = ((backing[pos - 1] & 255) << 8) + (backing[pos - 2] & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public void writeIntV1(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) var1;
		backing[++pos - 1] = (byte) (var1 >> 24);
		backing[++pos - 1] = (byte) (var1 >> 16);
	}

	public void method613(final int var1) {
		backing[pos - var1 - 1] = (byte) var1;
	}

	public int method614() {
		pos += 3;
		return (backing[pos - 1] & 255) + ((backing[pos - 2] & 255) << 8)
				+ ((backing[pos - 3] & 255) << 16);
	}

	public void appendBytes(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var3 + var2); ++var4)
			backing[++pos - 1] = var1[var4];

	}

	public String method616() {
		final byte var1 = backing[++pos - 1];
		if (var1 != 0)
			throw new IllegalStateException("");
		else {
			final int var2 = pos;

			while (backing[++pos - 1] != 0)
				;

			final int var3 = pos - var2 - 1;
			return var3 == 0 ? "" : client.decodeStr(backing, var2, var3);
		}
	}

	public void writeIntoReverse(final byte[] to, final int start, final int size) {
		for (int var4 = (size + start) - 1; var4 >= start; --var4)
			to[var4] = backing[++pos - 1];

	}

	public void applyIsaac(final int[] var1, final int var2, final int var3) {
		final int var4 = pos;
		pos = var2;
		final int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = readLEInt();
			int var8 = readLEInt();
			int var9 = 0;
			final int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var8 += (((var7 << 4) ^ (var7 >>> 5)) + var7)
					^ (var1[(var9 >>> 11) & 3] + var9)) {
				var7 += (((var8 << 4) ^ (var8 >>> 5)) + var8) ^ (var1[var9 & 3] + var9);
				var9 += var10;
			}

			pos -= 8;
			writeInt(var7);
			writeInt(var8);
		}

		pos = var4;
	}

	public RSBuf(final int var1) {
		backing = Class46.method202(var1, 1985237951);
		pos = 0;
	}

	public void writeInt(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 24);
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) var1;
	}

	public RSBuf(final byte[] var1) {
		backing = var1;
		pos = 0;
	}
}
