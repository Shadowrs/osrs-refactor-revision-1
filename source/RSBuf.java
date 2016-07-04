import java.math.BigInteger;

public class RSBuf extends Class104 {
	static Class84 aClass84_1175;
	public int pos;
	public static int[] SHIFTS = new int[256];
	public byte[] backing;

	public void writebyte(final int var1) {
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

	public void writeString(final String var1) {
		final int var2 = var1.indexOf(0);
		if (var2 >= 0)
			throw new IllegalArgumentException("");
		else {
			pos += Class33.method156(var1, 0, var1.length(), backing, pos);
			backing[++pos - 1] = 0;
		}
	}

	public void method564(final CharSequence var1) {
		final int var2 = Class104_Sub20.method560(var1);
		backing[++pos - 1] = 0;
		method569(var2);
		pos += Class91.method410(backing, pos, var1);
	}

	public byte method565() {
		return backing[++pos - 1];
	}

	public int method566() {
		pos += 4;
		return (backing[pos - 4] & 255) + ((backing[pos - 2] & 255) << 16)
				+ ((backing[pos - 1] & 255) << 24) + ((backing[pos - 3] & 255) << 8);
	}

	public int method567() {
		pos += 3;
		return (backing[pos - 3] & 255) + ((backing[pos - 1] & 255) << 16)
				+ ((backing[pos - 2] & 255) << 8);
	}

	public void method568(final int var1) {
		if ((var1 >= 0) && (var1 < 128))
			writebyte(var1);
		else if ((var1 >= 0) && (var1 < '\u8000'))
			writeShort(var1 + '\u8000');
		else
			throw new IllegalArgumentException();
	}

	public void method569(final int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0)
						writebyte((var1 >>> 28) | 128);

					writebyte((var1 >>> 21) | 128);
				}

				writebyte((var1 >>> 14) | 128);
			}

			writebyte((var1 >>> 7) | 128);
		}

		writebyte(var1 & 127);
	}

	public int readUByte() {
		return backing[++pos - 1] & 255;
	}

	public int readLEShort() {
		pos += 2;
		return ((backing[pos - 2] & 255) << 8) + (backing[pos - 1] & 255);
	}

	public int method572() {
		pos += 2;
		int var1 = ((backing[pos - 2] & 255) << 8) + (backing[pos - 1] & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public int method573() {
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

	public int method576() {
		return (backing[++pos - 1] - 128) & 255;
	}

	public void readBytes(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var3 + var2); ++var4)
			var1[var4] = backing[++pos - 1];

	}

	public int method578() {
		final int var1 = backing[pos] & 255;
		return var1 < 128 ? readUByte() - 64 : readLEShort() - '\uc000';
	}

	public int method579() {
		return backing[pos] < 0 ? readLEInt() & Integer.MAX_VALUE : readLEShort();
	}

	public int method580() {
		byte var1 = backing[++pos - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = backing[++pos - 1])
			var2 = (var2 | (var1 & 127)) << 7;

		return var2 | var1;
	}

	public String method581() {
		final byte var1 = backing[++pos - 1];
		if (var1 != 0)
			throw new IllegalStateException("");
		else {
			final int var2 = method580();
			if ((var2 + pos) > backing.length)
				throw new IllegalStateException("");
			else {
				final byte[] var3 = backing;
				final int var4 = pos;
				final char[] var5 = new char[var2];
				int var6 = 0;
				int var7 = var4;

				int var10;
				for (final int var8 = var2 + var4; var7 < var8; var5[var6++] = (char) var10) {
					final int var9 = var3[var7++] & 255;
					if (var9 < 128) {
						if (var9 == 0)
							var10 = '\ufffd';
						else
							var10 = var9;
					} else if (var9 < 192)
						var10 = '\ufffd';
					else if (var9 < 224) {
						if ((var7 < var8) && ((var3[var7] & 192) == 128)) {
							var10 = ((var9 & 31) << 6) | (var3[var7++] & 63);
							if (var10 < 128)
								var10 = '\ufffd';
						} else
							var10 = '\ufffd';
					} else if (var9 < 240) {
						if (((1 + var7) < var8) && ((var3[var7] & 192) == 128) && ((var3[1 + var7] & 192) == 128)) {
							var10 = ((var9 & 15) << 12) | ((var3[var7++] & 63) << 6) | (var3[var7++] & 63);
							if (var10 < 2048)
								var10 = '\ufffd';
						} else
							var10 = '\ufffd';
					} else if (var9 < 248) {
						if (((2 + var7) < var8) && ((var3[var7] & 192) == 128) && ((var3[var7 + 1] & 192) == 128)
								&& ((var3[2 + var7] & 192) == 128)) {
							var10 = ((var9 & 7) << 18) | ((var3[var7++] & 63) << 12) | ((var3[var7++] & 63) << 6)
									| (var3[var7++] & 63);
							if ((var10 >= 65536) && (var10 <= 1114111))
								var10 = '\ufffd';
							else
								var10 = '\ufffd';
						} else
							var10 = '\ufffd';
					} else
						var10 = '\ufffd';
				}

				final String var11 = new String(var5, 0, var6);
				pos += var2;
				return var11;
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

	public int method583(final int var1) {
		final byte[] var2 = backing;
		final int var3 = pos;
		int var4 = -1;

		for (int var5 = var1; var5 < var3; ++var5)
			var4 = (var4 >>> 8) ^ SHIFTS[(var4 ^ var2[var5]) & 255];

		var4 = ~var4;
		writeInt(var4);
		return var4;
	}

	public void method584(final int var1) {
		backing[++pos - 1] = (byte) (0 - var1);
	}

	public void writeByteA(final int var1) {
		backing[++pos - 1] = (byte) (var1 + 128);
	}

	public void method586(final int var1) {
		backing[++pos - 1] = (byte) (128 - var1);
	}

	public void method587(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) var1;
	}

	public int method588() {
		return (128 - backing[++pos - 1]) & 255;
	}

	public byte method589() {
		return (byte) (backing[++pos - 1] - 128);
	}

	public byte method590() {
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

	public int readShort() {
		pos += 2;
		return (backing[pos - 2] & 255) + ((backing[pos - 1] & 255) << 8);
	}

	public int method594() {
		pos += 2;
		return ((backing[pos - 1] - 128) & 255) + ((backing[pos - 2] & 255) << 8);
	}

	public int readShortN() {
		pos += 2;
		return ((backing[pos - 2] - 128) & 255) + ((backing[pos - 1] & 255) << 8);
	}

	public int method596() {
		pos += 2;
		int var1 = ((backing[pos - 1] - 128) & 255) + ((backing[pos - 2] & 255) << 8);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public int method597() {
		pos += 2;
		int var1 = ((backing[pos - 1] & 255) << 8) + ((backing[pos - 2] - 128) & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public void method598(final int var1) {
		backing[++pos - 1] = (byte) var1;
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 24);
	}

	public int readsmart() {
		final int var1 = backing[pos] & 255;
		return var1 < 128 ? readUByte() : readLEShort() - '\u8000';
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

	public int readByteN() {
		return (0 - backing[++pos - 1]) & 255;
	}

	public String readString() {
		final int start = pos;

		while (backing[++pos - 1] != 0)
			;

		final int next = pos - start - 1;
		return next == 0 ? "" : client.decodeStr(backing, start, next);
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

	public void writeLEIntA(final int var1) {
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

	public void method617(final byte[] var1, final int var2, final int var3) {
		for (int var4 = (var3 + var2) - 1; var4 >= var2; --var4)
			var1[var4] = backing[++pos - 1];

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
