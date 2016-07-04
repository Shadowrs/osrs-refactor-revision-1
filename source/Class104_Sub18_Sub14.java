public class Class104_Sub18_Sub14 extends Class104_Sub18 {
	public static Class61 aClass61_1463;
	public static Class56 aClass56_1462 = new Class56(64);
	public int anInt1464 = 0;

	void method783(final RSBuf var1, final int var2) {
		if (var2 == 2)
			anInt1464 = var1.readLEShort();

	}

	public void method784(final RSBuf var1) {
		while (true) {
			final int var2 = var1.method570();
			if (var2 == 0)
				return;

			method783(var1, var2);
		}
	}

	static final void method785(final Class17 var0, final Class67[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2)
			for (var3 = 0; var3 < 104; ++var3)
				for (var4 = 0; var4 < 104; ++var4)
					if ((Class76.aByteArrayArrayArray600[var2][var3][var4] & 1) == 1) {
						var5 = var2;
						if ((Class76.aByteArrayArrayArray600[1][var3][var4] & 2) == 2)
							var5 = var2 - 1;

						if (var5 >= 0)
							var1[var5].method307(var3, var4);
					}

		Class76.anInt599 += (int) (Math.random() * 5.0D) - 2;
		if (Class76.anInt599 < -8)
			Class76.anInt599 = -8;

		if (Class76.anInt599 > 8)
			Class76.anInt599 = 8;

		Class76.anInt616 += (int) (Math.random() * 5.0D) - 2;
		if (Class76.anInt616 < -16)
			Class76.anInt616 = -16;

		if (Class76.anInt616 > 16)
			Class76.anInt616 = 16;

		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		for (var2 = 0; var2 < 4; ++var2) {
			final byte[][] var6 = Class76.aByteArrayArrayArray605[var2];
			var7 = (int) Math.sqrt(5100.0D);
			var8 = (var7 * 768) >> 8;

			int var17;
			int var18;
			for (var9 = 1; var9 < 103; ++var9)
				for (var10 = 1; var10 < 103; ++var10) {
					var11 = Class76.anIntArrayArrayArray611[var2][var10 + 1][var9]
							- Class76.anIntArrayArrayArray611[var2][var10 - 1][var9];
					var12 = Class76.anIntArrayArrayArray611[var2][var10][1 + var9]
							- Class76.anIntArrayArrayArray611[var2][var10][var9 - 1];
					var13 = (int) Math.sqrt((var11 * var11) + 65536 + (var12 * var12));
					var14 = (var11 << 8) / var13;
					var15 = 65536 / var13;
					var16 = (var12 << 8) / var13;
					var17 = 96 + (((var14 * -50) + (-10 * var15) + (-50 * var16)) / var8);
					var18 = (var6[var10][var9] >> 1) + (var6[var10][1 + var9] >> 3) + (var6[var10][var9 - 1] >> 2)
							+ (var6[var10 + 1][var9] >> 3) + (var6[var10 - 1][var9] >> 2);
					Class7.anIntArrayArray41[var10][var9] = var17 - var18;
				}

			for (var9 = 0; var9 < 104; ++var9) {
				Class23.anIntArray237[var9] = 0;
				Class101.anIntArray811[var9] = 0;
				Class76.anIntArray615[var9] = 0;
				Class2_Sub2.anIntArray866[var9] = 0;
				Class76.anIntArray607[var9] = 0;
			}

			for (var9 = -5; var9 < 109; ++var9) {
				for (var10 = 0; var10 < 104; ++var10) {
					var11 = var9 + 5;
					if ((var11 >= 0) && (var11 < 104)) {
						var12 = Class76.aByteArrayArrayArray603[var2][var11][var10] & 255;
						if (var12 > 0) {
							final Class104_Sub18_Sub1 var19 = Class31.method150(var12 - 1);
							Class23.anIntArray237[var10] += var19.anInt1190;
							Class101.anIntArray811[var10] += var19.anInt1189;
							Class76.anIntArray615[var10] += var19.anInt1192;
							Class2_Sub2.anIntArray866[var10] += var19.anInt1193;
							++Class76.anIntArray607[var10];
						}
					}

					var12 = var9 - 5;
					if ((var12 >= 0) && (var12 < 104)) {
						var13 = Class76.aByteArrayArrayArray603[var2][var12][var10] & 255;
						if (var13 > 0) {
							final Class104_Sub18_Sub1 var20 = Class31.method150(var13 - 1);
							Class23.anIntArray237[var10] -= var20.anInt1190;
							Class101.anIntArray811[var10] -= var20.anInt1189;
							Class76.anIntArray615[var10] -= var20.anInt1192;
							Class2_Sub2.anIntArray866[var10] -= var20.anInt1193;
							--Class76.anIntArray607[var10];
						}
					}
				}

				if ((var9 >= 1) && (var9 < 103)) {
					var10 = 0;
					var11 = 0;
					var12 = 0;
					var13 = 0;
					var14 = 0;

					for (var15 = -5; var15 < 109; ++var15) {
						var16 = 5 + var15;
						if ((var16 >= 0) && (var16 < 104)) {
							var10 += Class23.anIntArray237[var16];
							var11 += Class101.anIntArray811[var16];
							var12 += Class76.anIntArray615[var16];
							var13 += Class2_Sub2.anIntArray866[var16];
							var14 += Class76.anIntArray607[var16];
						}

						var17 = var15 - 5;
						if ((var17 >= 0) && (var17 < 104)) {
							var10 -= Class23.anIntArray237[var17];
							var11 -= Class101.anIntArray811[var17];
							var12 -= Class76.anIntArray615[var17];
							var13 -= Class2_Sub2.anIntArray866[var17];
							var14 -= Class76.anIntArray607[var17];
						}

						if ((var15 >= 1) && (var15 < 103)) {
							if (client.aBool1794 && ((Class76.aByteArrayArrayArray600[0][var9][var15] & 2) == 0)) {
								if ((Class76.aByteArrayArrayArray600[var2][var9][var15] & 16) != 0)
									continue;

								if ((Class76.aByteArrayArrayArray600[var2][var9][var15] & 8) != 0)
									var18 = 0;
								else if ((var2 > 0) && ((Class76.aByteArrayArrayArray600[1][var9][var15] & 2) != 0))
									var18 = var2 - 1;
								else
									var18 = var2;

								if (client.anInt1988 != var18)
									continue;
							}

							if (var2 < Class76.anInt601)
								Class76.anInt601 = var2;

							var18 = Class76.aByteArrayArrayArray603[var2][var9][var15] & 255;
							final int var21 = Class76.aByteArrayArrayArray602[var2][var9][var15] & 255;
							if ((var18 > 0) || (var21 > 0)) {
								final int var22 = Class76.anIntArrayArrayArray611[var2][var9][var15];
								final int var23 = Class76.anIntArrayArrayArray611[var2][1 + var9][var15];
								final int var24 = Class76.anIntArrayArrayArray611[var2][1 + var9][var15 + 1];
								final int var25 = Class76.anIntArrayArrayArray611[var2][var9][1 + var15];
								final int var26 = Class7.anIntArrayArray41[var9][var15];
								final int var27 = Class7.anIntArrayArray41[var9 + 1][var15];
								final int var28 = Class7.anIntArrayArray41[1 + var9][var15 + 1];
								final int var29 = Class7.anIntArrayArray41[var9][var15 + 1];
								int var30 = -1;
								int var31 = -1;
								int var32;
								int var33;
								if (var18 > 0) {
									var32 = (var10 * 256) / var13;
									var33 = var11 / var14;
									int var34 = var12 / var14;
									var30 = Class1.method15(var32, var33, var34);
									var32 = (var32 + Class76.anInt599) & 255;
									var34 += Class76.anInt616;
									if (var34 < 0)
										var34 = 0;
									else if (var34 > 255)
										var34 = 255;

									var31 = Class1.method15(var32, var33, var34);
								}

								if (var2 > 0) {
									boolean var47 = true;
									if ((var18 == 0) && (Class76.aByteArrayArrayArray609[var2][var9][var15] != 0))
										var47 = false;

									if ((var21 > 0) && !Class65.method298(var21 - 1).aBool1378)
										var47 = false;

									if (var47 && (var23 == var22) && (var24 == var22) && (var22 == var25))
										Class41.anIntArrayArrayArray369[var2][var9][var15] |= 2340;
								}

								var32 = 0;
								if (var31 != -1)
									var32 = Class104_Sub18_Sub17_Sub4.anIntArray1685[Class61.method282(var31, 96,
											(byte) 12)];

								if (var21 == 0)
									var0.method73(var2, var9, var15, 0, 0, -1, var22, var23, var24, var25,
											Class61.method282(var30, var26, (byte) -9),
											Class61.method282(var30, var27, (byte) 40),
											Class61.method282(var30, var28, (byte) 8),
											Class61.method282(var30, var29, (byte) 12), 0, 0, 0, 0, var32, 0);
								else {
									var33 = Class76.aByteArrayArrayArray609[var2][var9][var15] + 1;
									final byte var48 = Class76.aByteArrayArrayArray604[var2][var9][var15];
									final Class104_Sub18_Sub7 var35 = Class65.method298(var21 - 1);
									int var36 = var35.anInt1377;
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) {
										var37 = Class104_Sub18_Sub17_Sub4.anInterface2_1686.method1(var36, -2145324813);
										var38 = -1;
									} else if (var35.anInt1376 == 16711935) {
										var38 = -2;
										var36 = -1;
										var37 = -2;
									} else {
										var38 = Class1.method15(var35.anInt1379, var35.anInt1383, var35.anInt1375);
										var39 = (var35.anInt1379 + Class76.anInt599) & 255;
										var40 = var35.anInt1375 + Class76.anInt616;
										if (var40 < 0)
											var40 = 0;
										else if (var40 > 255)
											var40 = 255;

										var37 = Class1.method15(var39, var35.anInt1383, var40);
									}

									var39 = 0;
									if (var37 != -2)
										var39 = Class104_Sub18_Sub17_Sub4.anIntArray1685[Class104_Sub12.method541(var37,
												96, -1871888009)];

									if (var35.anInt1384 != -1) {
										var40 = (Class76.anInt599 + var35.anInt1380) & 255;
										int var41 = var35.anInt1385 + Class76.anInt616;
										if (var41 < 0)
											var41 = 0;
										else if (var41 > 255)
											var41 = 255;

										var37 = Class1.method15(var40, var35.anInt1382, var41);
										var39 = Class104_Sub18_Sub17_Sub4.anIntArray1685[Class104_Sub12.method541(var37,
												96, -1844126251)];
									}

									var0.method73(var2, var9, var15, var33, var48, var36, var22, var23, var24, var25,
											Class61.method282(var30, var26, (byte) 34),
											Class61.method282(var30, var27, (byte) 60),
											Class61.method282(var30, var28, (byte) 46),
											Class61.method282(var30, var29, (byte) -116),
											Class104_Sub12.method541(var38, var26, -1310531349),
											Class104_Sub12.method541(var38, var27, -1334586386),
											Class104_Sub12.method541(var38, var28, -1441637592),
											Class104_Sub12.method541(var38, var29, -2040205630), var32, var39);
								}
							}
						}
					}
				}
			}

			for (var9 = 1; var9 < 103; ++var9)
				for (var10 = 1; var10 < 103; ++var10) {
					if ((Class76.aByteArrayArrayArray600[var2][var10][var9] & 8) != 0)
						var15 = 0;
					else if ((var2 > 0) && ((Class76.aByteArrayArrayArray600[1][var10][var9] & 2) != 0))
						var15 = var2 - 1;
					else
						var15 = var2;

					var0.method72(var2, var10, var9, var15);
				}

			Class76.aByteArrayArrayArray603[var2] = null;
			Class76.aByteArrayArrayArray602[var2] = null;
			Class76.aByteArrayArrayArray609[var2] = null;
			Class76.aByteArrayArrayArray604[var2] = null;
			Class76.aByteArrayArrayArray605[var2] = null;
		}

		var0.method108(-50, -10, -50);

		for (var2 = 0; var2 < 104; ++var2)
			for (var3 = 0; var3 < 104; ++var3)
				if ((Class76.aByteArrayArrayArray600[1][var2][var3] & 2) == 2)
					var0.method71(var2, var3);

		var2 = 1;
		var3 = 2;
		var4 = 4;

		for (var5 = 0; var5 < 4; ++var5) {
			if (var5 > 0) {
				var2 <<= 3;
				var3 <<= 3;
				var4 <<= 3;
			}

			for (int var43 = 0; var43 <= var5; ++var43)
				for (int var44 = 0; var44 <= 104; ++var44)
					for (int var45 = 0; var45 <= 104; ++var45) {
						short var46;
						if ((Class41.anIntArrayArrayArray369[var43][var45][var44] & var2) != 0) {
							var7 = var44;
							var8 = var44;
							var9 = var43;

							for (var10 = var43; (var7 > 0)
									&& ((Class41.anIntArrayArrayArray369[var43][var45][var7 - 1] & var2) != 0); --var7)
								;

							while ((var8 < 104)
									&& ((Class41.anIntArrayArrayArray369[var43][var45][1 + var8] & var2) != 0))
								++var8;

							label343: while (var9 > 0) {
								for (var11 = var7; var11 <= var8; ++var11)
									if ((Class41.anIntArrayArrayArray369[var9 - 1][var45][var11] & var2) == 0)
										break label343;

								--var9;
							}

							label332: while (var10 < var5) {
								for (var11 = var7; var11 <= var8; ++var11)
									if ((Class41.anIntArrayArrayArray369[var10 + 1][var45][var11] & var2) == 0)
										break label332;

								++var10;
							}

							var11 = ((var8 - var7) + 1) * ((1 + var10) - var9);
							if (var11 >= 8) {
								var46 = 240;
								var13 = Class76.anIntArrayArrayArray611[var10][var45][var7] - var46;
								var14 = Class76.anIntArrayArrayArray611[var9][var45][var7];
								Class17.method109(var5, 1, 128 * var45, 128 * var45, var7 * 128, (var8 * 128) + 128,
										var13, var14);

								for (var15 = var9; var15 <= var10; ++var15)
									for (var16 = var7; var16 <= var8; ++var16)
										Class41.anIntArrayArrayArray369[var15][var45][var16] &= ~var2;
							}
						}

						if ((Class41.anIntArrayArrayArray369[var43][var45][var44] & var3) != 0) {
							var7 = var45;
							var8 = var45;
							var9 = var43;

							for (var10 = var43; (var7 > 0)
									&& ((Class41.anIntArrayArrayArray369[var43][var7 - 1][var44] & var3) != 0); --var7)
								;

							while ((var8 < 104)
									&& ((Class41.anIntArrayArrayArray369[var43][1 + var8][var44] & var3) != 0))
								++var8;

							label396: while (var9 > 0) {
								for (var11 = var7; var11 <= var8; ++var11)
									if ((Class41.anIntArrayArrayArray369[var9 - 1][var11][var44] & var3) == 0)
										break label396;

								--var9;
							}

							label385: while (var10 < var5) {
								for (var11 = var7; var11 <= var8; ++var11)
									if ((Class41.anIntArrayArrayArray369[1 + var10][var11][var44] & var3) == 0)
										break label385;

								++var10;
							}

							var11 = ((var10 + 1) - var9) * (1 + (var8 - var7));
							if (var11 >= 8) {
								var46 = 240;
								var13 = Class76.anIntArrayArrayArray611[var10][var7][var44] - var46;
								var14 = Class76.anIntArrayArrayArray611[var9][var7][var44];
								Class17.method109(var5, 2, 128 * var7, 128 + (128 * var8), var44 * 128, var44 * 128,
										var13, var14);

								for (var15 = var9; var15 <= var10; ++var15)
									for (var16 = var7; var16 <= var8; ++var16)
										Class41.anIntArrayArrayArray369[var15][var16][var44] &= ~var3;
							}
						}

						if ((Class41.anIntArrayArrayArray369[var43][var45][var44] & var4) != 0) {
							var7 = var45;
							var8 = var45;
							var9 = var44;

							for (var10 = var44; (var9 > 0)
									&& ((Class41.anIntArrayArrayArray369[var43][var45][var9 - 1] & var4) != 0); --var9)
								;

							while ((var10 < 104)
									&& ((Class41.anIntArrayArrayArray369[var43][var45][var10 + 1] & var4) != 0))
								++var10;

							label449: while (var7 > 0) {
								for (var11 = var9; var11 <= var10; ++var11)
									if ((Class41.anIntArrayArrayArray369[var43][var7 - 1][var11] & var4) == 0)
										break label449;

								--var7;
							}

							label438: while (var8 < 104) {
								for (var11 = var9; var11 <= var10; ++var11)
									if ((Class41.anIntArrayArrayArray369[var43][1 + var8][var11] & var4) == 0)
										break label438;

								++var8;
							}

							if ((((var8 - var7) + 1) * (1 + (var10 - var9))) >= 4) {
								var11 = Class76.anIntArrayArrayArray611[var43][var7][var9];
								Class17.method109(var5, 4, var7 * 128, (128 * var8) + 128, 128 * var9,
										128 + (var10 * 128), var11, var11);

								for (var12 = var7; var12 <= var8; ++var12)
									for (var13 = var9; var13 <= var10; ++var13)
										Class41.anIntArrayArrayArray369[var43][var12][var13] &= ~var4;
							}
						}
					}
		}

	}
}
