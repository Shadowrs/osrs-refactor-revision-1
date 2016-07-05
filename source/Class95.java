import java.util.Arrays;

public class Class95 {
	public static int[] PACKETSIZES = new int[] { 0, 2, 0, 0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 6, -2,
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
		int count;
		int var4;
		int cx;
		int cz;
		int rx;
		int rz;
		int regionid;
		if (!client.dynamicRegion) {
			var1 = client.gamecon.readShort(); // L Y
			var2 = client.gamecon.readLEShort(); // L X
			count = (client.pktSize - client.gamecon.pos) / 16;
			Class13.xteakeys = new int[count][4];
			System.out.println("region count: "+count);

			for (var4 = 0; var4 < count; ++var4) {
				for (cx = 0; cx < 4; ++cx)
					Class13.xteakeys[var4][cx] = client.gamecon.readIntV1();
				System.out.printf("region %d/%d xteas: "+Arrays.toString(Class13.xteakeys[var4])+" \n", (var4+1), count);
			}

			var4 = client.gamecon.readUByteN(); // HEIGHT
			cx = client.gamecon.readShort(); // C X
			cz = client.gamecon.readLEShortA(); // C Y
			Class47.mapCoordinates = new int[count];
			Class40.mapFileIds = new int[count];
			Class75.landscapeFileIds = new int[count];
			Class104_Sub15.terrainData = new byte[count][];
			Class70.landscapedata = new byte[count][];
			boolean force = false;
			if ((((cx / 8) == 48) || ((cx / 8) == 49)) && ((cz / 8) == 48))
				force = true;

			if (((cx / 8) == 48) && ((cz / 8) == 148))
				force = true;

			count = 0;

			for (rx = (cx - 6) / 8; rx <= ((6 + cx) / 8); ++rx)
				for (rz = (cz - 6) / 8; rz <= ((6 + cz) / 8); ++rz) {
					regionid = (rx << 8) + rz;
					if (!force || ((rz != 49) && (rz != 149) && (rz != 147) && (rx != 50)
							&& ((rx != 49) || (rz != 47)))) {
						Class47.mapCoordinates[count] = regionid;
						Class40.mapFileIds[count] = Class67.fs.getArchiveIDForName("m" + rx + "_" + rz);
						Class75.landscapeFileIds[count] = Class67.fs.getArchiveIDForName("l" + rx + "_" + rz);
						System.out.println("region id "+regionid+" uses file id "+Class40.mapFileIds[count]+" and "+Class75.landscapeFileIds[count]);
						++count;
					}
				}

			System.out.printf("rx: %d, ry: %d, h:%d, lx:%d, ly:%d \n", cx, cz, var4, var2, var1);
			
			Class19.method120(cx, cz, var4, var2, var1);
		} else {
			var1 = client.gamecon.readLEShortA();
			client.gamecon.initbits();

			for (var2 = 0; var2 < 4; ++var2)
				for (count = 0; count < 13; ++count)
					for (var4 = 0; var4 < 13; ++var4) {
						cx = client.gamecon.readbits(1);
						if (cx == 1)
							client.anIntArrayArrayArray1848[var2][count][var4] = client.gamecon
									.readbits(26);
						else
							client.anIntArrayArrayArray1848[var2][count][var4] = -1;
					}

			client.gamecon.endbits();
			var2 = (client.pktSize - client.gamecon.pos) / 16;
			Class13.xteakeys = new int[var2][4];

			for (count = 0; count < var2; ++count)
				for (var4 = 0; var4 < 4; ++var4)
					Class13.xteakeys[count][var4] = client.gamecon.readIntV1();

			count = client.gamecon.readLEShortA();
			var4 = client.gamecon.readUByteN();
			cx = client.gamecon.readLEShort();
			cz = client.gamecon.readLEShortA();
			Class47.mapCoordinates = new int[var2];
			Class40.mapFileIds = new int[var2];
			Class75.landscapeFileIds = new int[var2];
			Class104_Sub15.terrainData = new byte[var2][];
			Class70.landscapedata = new byte[var2][];
			var2 = 0;

			for (int var16 = 0; var16 < 4; ++var16)
				for (rx = 0; rx < 13; ++rx)
					for (rz = 0; rz < 13; ++rz) {
						regionid = client.anIntArrayArrayArray1848[var16][rx][rz];
						if (regionid != -1) {
							final int var11 = (regionid >> 14) & 1023;
							final int var12 = (regionid >> 3) & 2047;
							int var13 = (var12 / 8) + ((var11 / 8) << 8);

							int var14;
							for (var14 = 0; var14 < var2; ++var14)
								if (var13 == Class47.mapCoordinates[var14]) {
									var13 = -1;
									break;
								}

							if (var13 != -1) {
								Class47.mapCoordinates[var2] = var13;
								var14 = (var13 >> 8) & 255;
								final int var15 = var13 & 255;
								Class40.mapFileIds[var2] = Class67.fs
										.getArchiveIDForName("m" + var14 + "_" + var15);
								Class75.landscapeFileIds[var2] = Class67.fs
										.getArchiveIDForName("l" + var14 + "_" + var15);
								++var2;
							}
						}
					}

			Class19.method120(var1, cz, var4, cx, count);
		}

	}

	static final void method425(final Widget var0) {
		final int var1 = var0.anInt982;
		if (var1 == 324) {
			if (client.anInt1887 == -1) {
				client.anInt1887 = var0.anInt1002;
				client.anInt2049 = var0.anInt1003;
			}

			if (client.aClass85_2047.female)
				var0.anInt1002 = client.anInt1887;
			else
				var0.anInt1002 = client.anInt2049;

		} else if (var1 == 325) {
			if (client.anInt1887 == -1) {
				client.anInt1887 = var0.anInt1002;
				client.anInt2049 = var0.anInt1003;
			}

			if (client.aClass85_2047.female)
				var0.anInt1002 = client.anInt2049;
			else
				var0.anInt1002 = client.anInt1887;

		} else if (var1 == 327) {
			var0.anInt1043 = 150;
			var0.anInt1019 = (int) (Math.sin(client.currentTime / 40.0D) * 256.0D) & 2047;
			var0.anInt1010 = 5;
			var0.anInt1011 = 0;
		} else if (var1 == 328) {
			var0.anInt1043 = 150;
			var0.anInt1019 = (int) (Math.sin(client.currentTime / 40.0D) * 256.0D) & 2047;
			var0.anInt1010 = 5;
			var0.anInt1011 = 1;
		}
	}

	public static void method426(final Class61 var0) {
		Class12.aClass61_76 = var0;
		ObjectDefinition.anInt1373 = Class12.aClass61_76.leng(16);
	}
}
