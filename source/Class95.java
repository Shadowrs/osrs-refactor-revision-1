public class Class95 {
	public static int[] anIntArray746 = new int[] { 0, 2, 0, 0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 6, -2,
			0, 0, 0, -2, 10, 0, 0, -2, 0, 0, 15, 0, 0, 0, 0, 0, 0, -2, 0, 1, 0, 0, 0, 0, 0, 0, 12, 0, 6, 0, 0, 5, 0, 0,
			0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 0, 0, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 5, 8, -2, 4, 3, 2, 0,
			0, -2, 0, 0, 0, 0, 2, 0, 0, -1, 0, 10, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 4, 0, 0, -2, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 2, 0, 0, -1, 6, -2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0,
			6, 0, 0, 0, -1, 0, 0, -2, -2, 6, 0, 4, 2, 5, 0, 0, 6, 0, 0, 0, 6, 0, 0, 0, 7, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0,
			0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 5, 0, 3, 6, 0, 0, 2, 0, 0, 28, 7, 0, 8, 0, 0, 0, 0, -2, 0, 0, 6, 0, 0, 0, 5,
			0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 14, 3, 0, 0, 0, 0, 6, 0, 0, 0, 0 };

	static final void readregionpacket(final boolean secondary) {
		client.dynamicRegion = secondary;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int xx;
		int yy;
		int regionid;
		if (!client.dynamicRegion) {
			var1 = client.gamecon.readLEShort(); // L Y
			var2 = client.gamecon.readShort(); // L X
			var3 = (client.pktSize - client.gamecon.pos) / 16;
			Class13.xteakeys = new int[var3][4];

			for (var4 = 0; var4 < var3; ++var4)
				for (var5 = 0; var5 < 4; ++var5)
					Class13.xteakeys[var4][var5] = client.gamecon.readInt();

			var4 = client.gamecon.readByteN(); // HEIGHT
			var5 = client.gamecon.readLEShort(); // C X
			var6 = client.gamecon.readShortN(); // C Y
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

			for (xx = (var5 - 6) / 8; xx <= ((6 + var5) / 8); ++xx)
				for (yy = (var6 - 6) / 8; yy <= ((6 + var6) / 8); ++yy) {
					regionid = (xx << 8) + yy;
					if (!var7 || ((yy != 49) && (yy != 149) && (yy != 147) && (xx != 50)
							&& ((xx != 49) || (yy != 47)))) {
						Class47.anIntArray406[var3] = regionid;
						Class40.anIntArray360[var3] = Class67.aClass61_Sub1_555.method271("m" + xx + "_" + yy);
						Class75.anIntArray597[var3] = Class67.aClass61_Sub1_555.method271("l" + xx + "_" + yy);
						++var3;
					}
				}

			System.out.printf("rx: %d, ry: %d, h:%d, lx:%d, ly:%d \n", var5, var6, var4, var2, var1);
			
			Class19.method120(var5, var6, var4, var2, var1);
		} else {
			var1 = client.gamecon.readShortN();
			client.gamecon.method624();

			for (var2 = 0; var2 < 4; ++var2)
				for (var3 = 0; var3 < 13; ++var3)
					for (var4 = 0; var4 < 13; ++var4) {
						var5 = client.gamecon.method625(1);
						if (var5 == 1)
							client.anIntArrayArrayArray1848[var2][var3][var4] = client.gamecon
									.method625(26);
						else
							client.anIntArrayArrayArray1848[var2][var3][var4] = -1;
					}

			client.gamecon.endbits();
			var2 = (client.pktSize - client.gamecon.pos) / 16;
			Class13.xteakeys = new int[var2][4];

			for (var3 = 0; var3 < var2; ++var3)
				for (var4 = 0; var4 < 4; ++var4)
					Class13.xteakeys[var3][var4] = client.gamecon.readInt();

			var3 = client.gamecon.readShortN();
			var4 = client.gamecon.readByteN();
			var5 = client.gamecon.readShort();
			var6 = client.gamecon.readShortN();
			Class47.anIntArray406 = new int[var2];
			Class40.anIntArray360 = new int[var2];
			Class75.anIntArray597 = new int[var2];
			Class104_Sub15.aByteArrayArray1124 = new byte[var2][];
			Class70.aByteArrayArray574 = new byte[var2][];
			var2 = 0;

			for (int var16 = 0; var16 < 4; ++var16)
				for (xx = 0; xx < 13; ++xx)
					for (yy = 0; yy < 13; ++yy) {
						regionid = client.anIntArrayArrayArray1848[var16][xx][yy];
						if (regionid != -1) {
							final int var11 = (regionid >> 14) & 1023;
							final int var12 = (regionid >> 3) & 2047;
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
