public class Class95 {
	public static int[] anIntArray746 = new int[] { 0, 2, 0, 0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 6, -2,
			0, 0, 0, -2, 10, 0, 0, -2, 0, 0, 15, 0, 0, 0, 0, 0, 0, -2, 0, 1, 0, 0, 0, 0, 0, 0, 12, 0, 6, 0, 0, 5, 0, 0,
			0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 0, 0, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 5, 8, -2, 4, 3, 2, 0,
			0, -2, 0, 0, 0, 0, 2, 0, 0, -1, 0, 10, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 4, 0, 0, -2, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 2, 0, 0, -1, 6, -2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0,
			6, 0, 0, 0, -1, 0, 0, -2, -2, 6, 0, 4, 2, 5, 0, 0, 6, 0, 0, 0, 6, 0, 0, 0, 7, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0,
			0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 5, 0, 3, 6, 0, 0, 2, 0, 0, 28, 7, 0, 8, 0, 0, 0, 0, -2, 0, 0, 6, 0, 0, 0, 5,
			0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 14, 3, 0, 0, 0, 0, 6, 0, 0, 0, 0 };

	static final void method424(final boolean var0) {
		client.aBool1847 = var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var8;
		int var9;
		int var10;
		if (!client.aBool1847) {
			var1 = client.aClass104_Sub21_Sub1_1963.method571();
			var2 = client.aClass104_Sub21_Sub1_1963.method593();
			var3 = (client.anInt1929 - client.aClass104_Sub21_Sub1_1963.anInt1172) / 16;
			Class13.anIntArrayArray87 = new int[var3][4];

			for (var4 = 0; var4 < var3; ++var4)
				for (var5 = 0; var5 < 4; ++var5)
					Class13.anIntArrayArray87[var4][var5] = client.aClass104_Sub21_Sub1_1963.method601();

			var4 = client.aClass104_Sub21_Sub1_1963.method607();
			var5 = client.aClass104_Sub21_Sub1_1963.method571();
			var6 = client.aClass104_Sub21_Sub1_1963.method595();
			Class47.anIntArray406 = new int[var3];
			Class40.anIntArray360 = new int[var3];
			Class75.anIntArray597 = new int[var3];
			Class104_Sub15.aByteArrayArray1124 = new byte[var3][];
			Class70.aByteArrayArray574 = new byte[var3][];
			boolean var7 = false;
			if ((((var5 / 8) == 48) || ((var5 / 8) == 49)) && ((var6 / 8) == 48))
				var7 = true;

			if (((var5 / 8) == 48) && ((var6 / 8) == 148))
				var7 = true;

			var3 = 0;

			for (var8 = (var5 - 6) / 8; var8 <= ((6 + var5) / 8); ++var8)
				for (var9 = (var6 - 6) / 8; var9 <= ((6 + var6) / 8); ++var9) {
					var10 = (var8 << 8) + var9;
					if (!var7 || ((var9 != 49) && (var9 != 149) && (var9 != 147) && (var8 != 50)
							&& ((var8 != 49) || (var9 != 47)))) {
						Class47.anIntArray406[var3] = var10;
						Class40.anIntArray360[var3] = Class67.aClass61_Sub1_555.method271("m" + var8 + "_" + var9);
						Class75.anIntArray597[var3] = Class67.aClass61_Sub1_555.method271("l" + var8 + "_" + var9);
						++var3;
					}
				}

			Class19.method120(var5, var6, var4, var2, var1);
		} else {
			var1 = client.aClass104_Sub21_Sub1_1963.method595();
			client.aClass104_Sub21_Sub1_1963.method624();

			for (var2 = 0; var2 < 4; ++var2)
				for (var3 = 0; var3 < 13; ++var3)
					for (var4 = 0; var4 < 13; ++var4) {
						var5 = client.aClass104_Sub21_Sub1_1963.method625(1);
						if (var5 == 1)
							client.anIntArrayArrayArray1848[var2][var3][var4] = client.aClass104_Sub21_Sub1_1963
									.method625(26);
						else
							client.anIntArrayArrayArray1848[var2][var3][var4] = -1;
					}

			client.aClass104_Sub21_Sub1_1963.method629();
			var2 = (client.anInt1929 - client.aClass104_Sub21_Sub1_1963.anInt1172) / 16;
			Class13.anIntArrayArray87 = new int[var2][4];

			for (var3 = 0; var3 < var2; ++var3)
				for (var4 = 0; var4 < 4; ++var4)
					Class13.anIntArrayArray87[var3][var4] = client.aClass104_Sub21_Sub1_1963.method601();

			var3 = client.aClass104_Sub21_Sub1_1963.method595();
			var4 = client.aClass104_Sub21_Sub1_1963.method607();
			var5 = client.aClass104_Sub21_Sub1_1963.method593();
			var6 = client.aClass104_Sub21_Sub1_1963.method595();
			Class47.anIntArray406 = new int[var2];
			Class40.anIntArray360 = new int[var2];
			Class75.anIntArray597 = new int[var2];
			Class104_Sub15.aByteArrayArray1124 = new byte[var2][];
			Class70.aByteArrayArray574 = new byte[var2][];
			var2 = 0;

			for (int var16 = 0; var16 < 4; ++var16)
				for (var8 = 0; var8 < 13; ++var8)
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = client.anIntArrayArrayArray1848[var16][var8][var9];
						if (var10 != -1) {
							final int var11 = (var10 >> 14) & 1023;
							final int var12 = (var10 >> 3) & 2047;
							int var13 = (var12 / 8) + ((var11 / 8) << 8);

							int var14;
							for (var14 = 0; var14 < var2; ++var14)
								if (var13 == Class47.anIntArray406[var14]) {
									var13 = -1;
									break;
								}

							if (var13 != -1) {
								Class47.anIntArray406[var2] = var13;
								var14 = (var13 >> 8) & 255;
								final int var15 = var13 & 255;
								Class40.anIntArray360[var2] = Class67.aClass61_Sub1_555
										.method271("m" + var14 + "_" + var15);
								Class75.anIntArray597[var2] = Class67.aClass61_Sub1_555
										.method271("l" + var14 + "_" + var15);
								++var2;
							}
						}
					}

			Class19.method120(var1, var6, var4, var5, var3);
		}

	}

	static final void method425(final Class104_Sub12 var0) {
		final int var1 = var0.anInt982;
		if (var1 == 324) {
			if (client.anInt1887 == -1) {
				client.anInt1887 = var0.anInt1002;
				client.anInt2049 = var0.anInt1003;
			}

			if (client.aClass85_2047.aBool661)
				var0.anInt1002 = client.anInt1887;
			else
				var0.anInt1002 = client.anInt2049;

		} else if (var1 == 325) {
			if (client.anInt1887 == -1) {
				client.anInt1887 = var0.anInt1002;
				client.anInt2049 = var0.anInt1003;
			}

			if (client.aClass85_2047.aBool661)
				var0.anInt1002 = client.anInt2049;
			else
				var0.anInt1002 = client.anInt1887;

		} else if (var1 == 327) {
			var0.anInt1043 = 150;
			var0.anInt1019 = (int) (Math.sin(client.anInt1799 / 40.0D) * 256.0D) & 2047;
			var0.anInt1010 = 5;
			var0.anInt1011 = 0;
		} else if (var1 == 328) {
			var0.anInt1043 = 150;
			var0.anInt1019 = (int) (Math.sin(client.anInt1799 / 40.0D) * 256.0D) & 2047;
			var0.anInt1010 = 5;
			var0.anInt1011 = 1;
		}
	}

	public static void method426(final Class61 var0) {
		Class12.aClass61_76 = var0;
		Class104_Sub18_Sub6.anInt1373 = Class12.aClass61_76.method266(16);
	}
}
