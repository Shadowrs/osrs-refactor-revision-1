public final class Class37 {
	int anInt355;
	int anInt350;
	int anInt353;
	int anInt354;
	int[] anIntArray351 = new int[256];
	int[] anIntArray352 = new int[256];

	final void method174() {
		anInt350 += ++anInt355;

		for (int var1 = 0; var1 < 256; ++var1) {
			final int var2 = anIntArray351[var1];
			if ((var1 & 2) == 0) {
				if ((var1 & 1) == 0)
					anInt353 ^= anInt353 << 13;
				else
					anInt353 ^= anInt353 >>> 6;
			} else if ((var1 & 1) == 0)
				anInt353 ^= anInt353 << 2;
			else
				anInt353 ^= anInt353 >>> 16;

			anInt353 += anIntArray351[(var1 + 128) & 255];
			int var3;
			anIntArray351[var1] = var3 = anInt350 + anInt353 + anIntArray351[(var2 & 1020) >> 2];
			anIntArray352[var1] = anInt350 = var2 + anIntArray351[((var3 >> 8) & 1020) >> 2];
		}

	}

	final int method175() {
		if ((--anInt354 + 1) == 0) {
			method174();
			anInt354 = 255;
		}

		return anIntArray352[anInt354];
	}

	final void method176() {
		int var1 = -1640531527;
		int var2 = -1640531527;
		int var3 = -1640531527;
		int var4 = -1640531527;
		int var5 = -1640531527;
		int var6 = -1640531527;
		int var7 = -1640531527;
		int var8 = -1640531527;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
		}

		for (var9 = 0; var9 < 256; var9 += 8) {
			var8 += anIntArray352[var9];
			var7 += anIntArray352[var9 + 1];
			var6 += anIntArray352[2 + var9];
			var5 += anIntArray352[3 + var9];
			var4 += anIntArray352[var9 + 4];
			var3 += anIntArray352[5 + var9];
			var2 += anIntArray352[6 + var9];
			var1 += anIntArray352[var9 + 7];
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
			anIntArray351[var9] = var8;
			anIntArray351[1 + var9] = var7;
			anIntArray351[2 + var9] = var6;
			anIntArray351[var9 + 3] = var5;
			anIntArray351[var9 + 4] = var4;
			anIntArray351[var9 + 5] = var3;
			anIntArray351[6 + var9] = var2;
			anIntArray351[var9 + 7] = var1;
		}

		for (var9 = 0; var9 < 256; var9 += 8) {
			var8 += anIntArray351[var9];
			var7 += anIntArray351[var9 + 1];
			var6 += anIntArray351[2 + var9];
			var5 += anIntArray351[var9 + 3];
			var4 += anIntArray351[4 + var9];
			var3 += anIntArray351[5 + var9];
			var2 += anIntArray351[6 + var9];
			var1 += anIntArray351[var9 + 7];
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
			anIntArray351[var9] = var8;
			anIntArray351[var9 + 1] = var7;
			anIntArray351[2 + var9] = var6;
			anIntArray351[3 + var9] = var5;
			anIntArray351[var9 + 4] = var4;
			anIntArray351[5 + var9] = var3;
			anIntArray351[var9 + 6] = var2;
			anIntArray351[7 + var9] = var1;
		}

		method174();
		anInt354 = 256;
	}

	Class37(final int[] var1) {
		for (int var2 = 0; var2 < var1.length; ++var2)
			anIntArray352[var2] = var1[var2];

		method176();
	}

	static byte method177(final char var0) {
		byte var1;
		if (((var0 <= 0) || (var0 >= 128)) && ((var0 < 160) || (var0 > 255))) {
			if (var0 == 8364)
				var1 = -128;
			else if (var0 == 8218)
				var1 = -126;
			else if (var0 == 402)
				var1 = -125;
			else if (var0 == 8222)
				var1 = -124;
			else if (var0 == 8230)
				var1 = -123;
			else if (var0 == 8224)
				var1 = -122;
			else if (var0 == 8225)
				var1 = -121;
			else if (var0 == 710)
				var1 = -120;
			else if (var0 == 8240)
				var1 = -119;
			else if (var0 == 352)
				var1 = -118;
			else if (var0 == 8249)
				var1 = -117;
			else if (var0 == 338)
				var1 = -116;
			else if (var0 == 381)
				var1 = -114;
			else if (var0 == 8216)
				var1 = -111;
			else if (var0 == 8217)
				var1 = -110;
			else if (var0 == 8220)
				var1 = -109;
			else if (var0 == 8221)
				var1 = -108;
			else if (var0 == 8226)
				var1 = -107;
			else if (var0 == 8211)
				var1 = -106;
			else if (var0 == 8212)
				var1 = -105;
			else if (var0 == 732)
				var1 = -104;
			else if (var0 == 8482)
				var1 = -103;
			else if (var0 == 353)
				var1 = -102;
			else if (var0 == 8250)
				var1 = -101;
			else if (var0 == 339)
				var1 = -100;
			else if (var0 == 382)
				var1 = -98;
			else if (var0 == 376)
				var1 = -97;
			else
				var1 = 63;
		} else
			var1 = (byte) var0;

		return var1;
	}
}
