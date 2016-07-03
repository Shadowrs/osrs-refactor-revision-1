import java.math.BigInteger;

public class Class104_Sub21 extends Class104 {
	static Class84 aClass84_1175;
	public int anInt1172;
	public static int[] anIntArray1173 = new int[256];
	public byte[] aByteArray1174;

	public void method561(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) var1;
	}

	public void method562(final long var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) ((int) (var1 >> 56));
		aByteArray1174[++anInt1172 - 1] = (byte) ((int) (var1 >> 48));
		aByteArray1174[++anInt1172 - 1] = (byte) ((int) (var1 >> 40));
		aByteArray1174[++anInt1172 - 1] = (byte) ((int) (var1 >> 32));
		aByteArray1174[++anInt1172 - 1] = (byte) ((int) (var1 >> 24));
		aByteArray1174[++anInt1172 - 1] = (byte) ((int) (var1 >> 16));
		aByteArray1174[++anInt1172 - 1] = (byte) ((int) (var1 >> 8));
		aByteArray1174[++anInt1172 - 1] = (byte) ((int) var1);
	}

	public void method563(final String var1) {
		final int var2 = var1.indexOf(0);
		if (var2 >= 0)
			throw new IllegalArgumentException("");
		else {
			anInt1172 += Class33.method156(var1, 0, var1.length(), aByteArray1174, anInt1172);
			aByteArray1174[++anInt1172 - 1] = 0;
		}
	}

	public void method564(final CharSequence var1) {
		final int var2 = Class104_Sub20.method560(var1);
		aByteArray1174[++anInt1172 - 1] = 0;
		method569(var2);
		anInt1172 += Class91.method410(aByteArray1174, anInt1172, var1);
	}

	public byte method565() {
		return aByteArray1174[++anInt1172 - 1];
	}

	public int method566() {
		anInt1172 += 4;
		return (aByteArray1174[anInt1172 - 4] & 255) + ((aByteArray1174[anInt1172 - 2] & 255) << 16)
				+ ((aByteArray1174[anInt1172 - 1] & 255) << 24) + ((aByteArray1174[anInt1172 - 3] & 255) << 8);
	}

	public int method567() {
		anInt1172 += 3;
		return (aByteArray1174[anInt1172 - 3] & 255) + ((aByteArray1174[anInt1172 - 1] & 255) << 16)
				+ ((aByteArray1174[anInt1172 - 2] & 255) << 8);
	}

	public void method568(final int var1) {
		if ((var1 >= 0) && (var1 < 128))
			method561(var1);
		else if ((var1 >= 0) && (var1 < '\u8000'))
			method603(var1 + '\u8000');
		else
			throw new IllegalArgumentException();
	}

	public void method569(final int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0)
						method561((var1 >>> 28) | 128);

					method561((var1 >>> 21) | 128);
				}

				method561((var1 >>> 14) | 128);
			}

			method561((var1 >>> 7) | 128);
		}

		method561(var1 & 127);
	}

	public int method570() {
		return aByteArray1174[++anInt1172 - 1] & 255;
	}

	public int method571() {
		anInt1172 += 2;
		return ((aByteArray1174[anInt1172 - 2] & 255) << 8) + (aByteArray1174[anInt1172 - 1] & 255);
	}

	public int method572() {
		anInt1172 += 2;
		int var1 = ((aByteArray1174[anInt1172 - 2] & 255) << 8) + (aByteArray1174[anInt1172 - 1] & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public int method573() {
		anInt1172 += 4;
		return ((aByteArray1174[anInt1172 - 3] & 255) << 24) + ((aByteArray1174[anInt1172 - 4] & 255) << 16)
				+ ((aByteArray1174[anInt1172 - 1] & 255) << 8) + (aByteArray1174[anInt1172 - 2] & 255);
	}

	public int method574() {
		anInt1172 += 4;
		return ((aByteArray1174[anInt1172 - 2] & 255) << 8) + ((aByteArray1174[anInt1172 - 3] & 255) << 16)
				+ ((aByteArray1174[anInt1172 - 4] & 255) << 24) + (aByteArray1174[anInt1172 - 1] & 255);
	}

	public long method575() {
		final long var1 = method574() & 4294967295L;
		final long var3 = method574() & 4294967295L;
		return (var1 << 32) + var3;
	}

	public int method576() {
		return (aByteArray1174[++anInt1172 - 1] - 128) & 255;
	}

	public void method577(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var3 + var2); ++var4)
			var1[var4] = aByteArray1174[++anInt1172 - 1];

	}

	public int method578() {
		final int var1 = aByteArray1174[anInt1172] & 255;
		return var1 < 128 ? method570() - 64 : method571() - '\uc000';
	}

	public int method579() {
		return aByteArray1174[anInt1172] < 0 ? method574() & Integer.MAX_VALUE : method571();
	}

	public int method580() {
		byte var1 = aByteArray1174[++anInt1172 - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = aByteArray1174[++anInt1172 - 1])
			var2 = (var2 | (var1 & 127)) << 7;

		return var2 | var1;
	}

	public String method581() {
		final byte var1 = aByteArray1174[++anInt1172 - 1];
		if (var1 != 0)
			throw new IllegalStateException("");
		else {
			final int var2 = method580();
			if ((var2 + anInt1172) > aByteArray1174.length)
				throw new IllegalStateException("");
			else {
				final byte[] var3 = aByteArray1174;
				final int var4 = anInt1172;
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
				anInt1172 += var2;
				return var11;
			}
		}
	}

	public void method582(final BigInteger var1, final BigInteger var2) {
		final int var3 = anInt1172;
		anInt1172 = 0;
		final byte[] var4 = new byte[var3];
		method577(var4, 0, var3);
		final BigInteger var5 = new BigInteger(var4);
		final BigInteger var6 = var5.modPow(var1, var2);
		final byte[] var7 = var6.toByteArray();
		anInt1172 = 0;
		method603(var7.length);
		method615(var7, 0, var7.length);
	}

	public int method583(final int var1) {
		final byte[] var2 = aByteArray1174;
		final int var3 = anInt1172;
		int var4 = -1;

		for (int var5 = var1; var5 < var3; ++var5)
			var4 = (var4 >>> 8) ^ anIntArray1173[(var4 ^ var2[var5]) & 255];

		var4 = ~var4;
		method619(var4);
		return var4;
	}

	public void method584(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) (0 - var1);
	}

	public void method585(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 + 128);
	}

	public void method586(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) (128 - var1);
	}

	public void method587(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 16);
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 8);
		aByteArray1174[++anInt1172 - 1] = (byte) var1;
	}

	public int method588() {
		return (128 - aByteArray1174[++anInt1172 - 1]) & 255;
	}

	public byte method589() {
		return (byte) (aByteArray1174[++anInt1172 - 1] - 128);
	}

	public byte method590() {
		return (byte) (128 - aByteArray1174[++anInt1172 - 1]);
	}

	public void method591(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 8);
		aByteArray1174[++anInt1172 - 1] = (byte) (128 + var1);
	}

	public void method592(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) (128 + var1);
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 8);
	}

	public int method593() {
		anInt1172 += 2;
		return (aByteArray1174[anInt1172 - 2] & 255) + ((aByteArray1174[anInt1172 - 1] & 255) << 8);
	}

	public int method594() {
		anInt1172 += 2;
		return ((aByteArray1174[anInt1172 - 1] - 128) & 255) + ((aByteArray1174[anInt1172 - 2] & 255) << 8);
	}

	public int method595() {
		anInt1172 += 2;
		return ((aByteArray1174[anInt1172 - 2] - 128) & 255) + ((aByteArray1174[anInt1172 - 1] & 255) << 8);
	}

	public int method596() {
		anInt1172 += 2;
		int var1 = ((aByteArray1174[anInt1172 - 1] - 128) & 255) + ((aByteArray1174[anInt1172 - 2] & 255) << 8);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public int method597() {
		anInt1172 += 2;
		int var1 = ((aByteArray1174[anInt1172 - 1] & 255) << 8) + ((aByteArray1174[anInt1172 - 2] - 128) & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public void method598(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) var1;
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 8);
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 16);
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 24);
	}

	public int method599() {
		final int var1 = aByteArray1174[anInt1172] & 255;
		return var1 < 128 ? method570() : method571() - '\u8000';
	}

	public void method600(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 16);
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 24);
		aByteArray1174[++anInt1172 - 1] = (byte) var1;
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 8);
	}

	public int method601() {
		anInt1172 += 4;
		return ((aByteArray1174[anInt1172 - 4] & 255) << 8) + ((aByteArray1174[anInt1172 - 2] & 255) << 24)
				+ ((aByteArray1174[anInt1172 - 1] & 255) << 16) + (aByteArray1174[anInt1172 - 3] & 255);
	}

	static {
		for (int var0 = 0; var0 < 256; ++var0) {
			int var1 = var0;

			for (int var2 = 0; var2 < 8; ++var2)
				if ((var1 & 1) == 1)
					var1 = (var1 >>> 1) ^ -306674912;
				else
					var1 >>>= 1;

			anIntArray1173[var0] = var1;
		}

	}

	public boolean method602() {
		anInt1172 -= 4;
		final byte[] var1 = aByteArray1174;
		final int var2 = anInt1172;
		int var3 = -1;

		int var4;
		for (var4 = 0; var4 < var2; ++var4)
			var3 = (var3 >>> 8) ^ anIntArray1173[(var3 ^ var1[var4]) & 255];

		var3 = ~var3;
		var4 = method574();
		return var4 == var3;
	}

	public void method603(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 8);
		aByteArray1174[++anInt1172 - 1] = (byte) var1;
	}

	public String method604() {
		if (aByteArray1174[anInt1172] == 0) {
			++anInt1172;
			return null;
		} else
			return method608();
	}

	public void method605(final int[] var1, final int var2, final int var3) {
		final int var4 = anInt1172;
		anInt1172 = var2;
		final int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = method574();
			int var8 = method574();
			int var9 = -957401312;
			final int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var7 -= (((var8 << 4) ^ (var8 >>> 5)) + var8) ^ (var9 + var1[var9 & 3])) {
				var8 -= (((var7 << 4) ^ (var7 >>> 5)) + var7) ^ (var1[(var9 >>> 11) & 3] + var9);
				var9 -= var10;
			}

			anInt1172 -= 8;
			method619(var7);
			method619(var8);
		}

		anInt1172 = var4;
	}

	public void method606(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) var1;
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 8);
	}

	public int method607() {
		return (0 - aByteArray1174[++anInt1172 - 1]) & 255;
	}

	public String method608() {
		final int var1 = anInt1172;

		while (aByteArray1174[++anInt1172 - 1] != 0)
			;

		final int var2 = anInt1172 - var1 - 1;
		return var2 == 0 ? "" : Class104_Sub18_Sub6.method751(aByteArray1174, var1, var2);
	}

	public void method609(final int var1) {
		aByteArray1174[anInt1172 - var1 - 4] = (byte) (var1 >> 24);
		aByteArray1174[anInt1172 - var1 - 3] = (byte) (var1 >> 16);
		aByteArray1174[anInt1172 - var1 - 2] = (byte) (var1 >> 8);
		aByteArray1174[anInt1172 - var1 - 1] = (byte) var1;
	}

	public void method610(final int var1) {
		aByteArray1174[anInt1172 - var1 - 2] = (byte) (var1 >> 8);
		aByteArray1174[anInt1172 - var1 - 1] = (byte) var1;
	}

	public int method611() {
		anInt1172 += 2;
		int var1 = ((aByteArray1174[anInt1172 - 1] & 255) << 8) + (aByteArray1174[anInt1172 - 2] & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public void method612(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 8);
		aByteArray1174[++anInt1172 - 1] = (byte) var1;
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 24);
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 16);
	}

	public void method613(final int var1) {
		aByteArray1174[anInt1172 - var1 - 1] = (byte) var1;
	}

	public int method614() {
		anInt1172 += 3;
		return (aByteArray1174[anInt1172 - 1] & 255) + ((aByteArray1174[anInt1172 - 2] & 255) << 8)
				+ ((aByteArray1174[anInt1172 - 3] & 255) << 16);
	}

	public void method615(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var3 + var2); ++var4)
			aByteArray1174[++anInt1172 - 1] = var1[var4];

	}

	public String method616() {
		final byte var1 = aByteArray1174[++anInt1172 - 1];
		if (var1 != 0)
			throw new IllegalStateException("");
		else {
			final int var2 = anInt1172;

			while (aByteArray1174[++anInt1172 - 1] != 0)
				;

			final int var3 = anInt1172 - var2 - 1;
			return var3 == 0 ? "" : Class104_Sub18_Sub6.method751(aByteArray1174, var2, var3);
		}
	}

	public void method617(final byte[] var1, final int var2, final int var3) {
		for (int var4 = (var3 + var2) - 1; var4 >= var2; --var4)
			var1[var4] = aByteArray1174[++anInt1172 - 1];

	}

	public void method618(final int[] var1, final int var2, final int var3) {
		final int var4 = anInt1172;
		anInt1172 = var2;
		final int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = method574();
			int var8 = method574();
			int var9 = 0;
			final int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var8 += (((var7 << 4) ^ (var7 >>> 5)) + var7)
					^ (var1[(var9 >>> 11) & 3] + var9)) {
				var7 += (((var8 << 4) ^ (var8 >>> 5)) + var8) ^ (var1[var9 & 3] + var9);
				var9 += var10;
			}

			anInt1172 -= 8;
			method619(var7);
			method619(var8);
		}

		anInt1172 = var4;
	}

	public Class104_Sub21(final int var1) {
		aByteArray1174 = Class46.method202(var1, 1985237951);
		anInt1172 = 0;
	}

	public void method619(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 24);
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 16);
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 >> 8);
		aByteArray1174[++anInt1172 - 1] = (byte) var1;
	}

	public Class104_Sub21(final byte[] var1) {
		aByteArray1174 = var1;
		anInt1172 = 0;
	}
}
