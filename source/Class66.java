public class Class66 {
	static Class104_Sub18_Sub17_Sub3 aClass104_Sub18_Sub17_Sub3_520;
	static Class104_Sub18_Sub17_Sub3[] aClass104_Sub18_Sub17_Sub3Array521;
	static Class104_Sub18_Sub17_Sub3 aClass104_Sub18_Sub17_Sub3_523;
	static int[] anIntArray525;
	static int[] anIntArray526;
	static int[] anIntArray529;
	static Class104_Sub18_Sub17_Sub1 aClass104_Sub18_Sub17_Sub1_531;
	static Class104_Sub18_Sub17_Sub3 aClass104_Sub18_Sub17_Sub3_538;
	static Class104_Sub18_Sub17_Sub3[] aClass104_Sub18_Sub17_Sub3Array544;
	public static Class13 aClass13_547;
	static Class8 aClass8_548;
	static int[] anIntArray549;
	static boolean aBool527 = false;
	static int[] anIntArray524 = new int[256];
	static int anInt518 = 0;
	static int anInt528 = 0;
	static int anInt530 = 0;
	static int anInt517 = 0;
	static int anInt532 = 0;
	static int anInt533 = 0;
	static int anInt534 = 10;
	static String aString540 = "";
	static int anInt536 = 0;
	static String aString537 = "";
	static String aString516 = "";
	static String aString539 = "";
	static String aString543 = "";
	static String aString522 = "";
	static int anInt535 = 0;
	static boolean aBool541 = false;
	static int anInt542 = 0;
	static int[] anIntArray519 = new int[] { 0, 1, 2, 3 };
	static int[] anIntArray545 = new int[] { 1, 1, 1, 1 };
	static int anInt546 = -1;

	public static int method299(final CharSequence var0, final int var1, final boolean var2) {
		if ((var1 >= 2) && (var1 <= 36)) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			final int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				final char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == 45) {
						var3 = true;
						continue;
					}

					if (var8 == 43)
						continue;
				}

				int var10;
				if ((var8 >= 48) && (var8 <= 57))
					var10 = var8 - 48;
				else if ((var8 >= 65) && (var8 <= 90))
					var10 = var8 - 55;
				else {
					if ((var8 < 97) || (var8 > 122))
						throw new NumberFormatException();

					var10 = var8 - 87;
				}

				if (var10 >= var1)
					throw new NumberFormatException();

				if (var3)
					var10 = -var10;

				final int var9 = (var5 * var1) + var10;
				if (var5 != (var9 / var1))
					throw new NumberFormatException();

				var5 = var9;
				var4 = true;
			}

			if (!var4)
				throw new NumberFormatException();
			else
				return var5;
		} else
			throw new IllegalArgumentException("");
	}

	static final void method300(final Widget[] var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6, final int var7, final int var8) {
		Class104_Sub18_Sub17.method800(var2, var3, var4, var5);
		Class104_Sub18_Sub17_Sub4.method931();

		for (int var9 = 0; var9 < var0.length; ++var9) {
			final Widget var10 = var0[var9];
			if ((var10 != null) && ((var1 == var10.anInt1091)
					|| ((var1 == -1412584499) && (var10 == client.aClass104_Sub12_1958)))) {
				int var11;
				if (var8 == -1) {
					client.anIntArray1993[client.anInt1982] = var6 + var10.anInt983;
					client.anIntArray1876[client.anInt1982] = var10.anInt1005 + var7;
					client.anIntArray1995[client.anInt1982] = var10.anInt987;
					client.anIntArray1996[client.anInt1982] = var10.anInt988;
					var11 = ++client.anInt1982 - 1;
				} else
					var11 = var8;

				var10.anInt1093 = var11;
				var10.anInt1094 = client.anInt1799;
				if (!var10.isHeaderless || !Class40.method182(var10)) {
					if (var10.anInt982 > 0)
						Class95.method425(var10);

					int var12 = var10.anInt983 + var6;
					int var13 = var10.anInt1005 + var7;
					int var14 = var10.anInt1000;
					int var15;
					int var16;
					if (var10 == client.aClass104_Sub12_1958) {
						if ((var1 != -1412584499) && !var10.aBool1053) {
							Class106.aClass104_Sub12Array828 = var0;
							Class78.anInt629 = var6;
							client.anInt1969 = var7;
							continue;
						}

						if (client.aBool1804 && client.aBool1987) {
							var15 = Class14.anInt91;
							var16 = Class14.anInt95;
							var15 -= client.anInt1976;
							var16 -= client.anInt1960;
							if (var15 < client.anInt2035)
								var15 = client.anInt2035;

							if ((var15 + var10.anInt987) > (client.aClass104_Sub12_2019.anInt987 + client.anInt2035))
								var15 = (client.anInt2035 + client.aClass104_Sub12_2019.anInt987) - var10.anInt987;

							if (var16 < client.anInt1964)
								var16 = client.anInt1964;

							if ((var10.anInt988 + var16) > (client.aClass104_Sub12_2019.anInt988 + client.anInt1964))
								var16 = (client.aClass104_Sub12_2019.anInt988 + client.anInt1964) - var10.anInt988;

							var12 = var15;
							var13 = var16;
						}

						if (!var10.aBool1053)
							var14 = 128;
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.anInt980 == 2) {
						var15 = var2;
						var16 = var3;
						var17 = var4;
						var18 = var5;
					} else if (var10.anInt980 == 9) {
						var19 = var12;
						var20 = var13;
						var21 = var12 + var10.anInt987;
						var22 = var13 + var10.anInt988;
						if (var21 < var12) {
							var19 = var21;
							var21 = var12;
						}

						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						++var21;
						++var22;
						var15 = var19 > var2 ? var19 : var2;
						var16 = var20 > var3 ? var20 : var3;
						var17 = var21 < var4 ? var21 : var4;
						var18 = var22 < var5 ? var22 : var5;
					} else {
						var19 = var12 + var10.anInt987;
						var20 = var10.anInt988 + var13;
						var15 = var12 > var2 ? var12 : var2;
						var16 = var13 > var3 ? var13 : var3;
						var17 = var19 < var4 ? var19 : var4;
						var18 = var20 < var5 ? var20 : var5;
					}

					if (!var10.isHeaderless || ((var15 < var17) && (var16 < var18))) {
						int var23;
						int var24;
						int var25;
						int var26;
						int var27;
						int var28;
						int var30;
						int var31;
						int var32;
						boolean var34;
						int var38;
						int var40;
						int var59;
						int var65;
						int var66;
						int var71;
						if (var10.anInt982 != 0) {
							if (var10.anInt982 == 1337) {
								client.anInt1841 = var12;
								client.anInt1845 = var13;
								var19 = var10.anInt987;
								var20 = var10.anInt988;
								Class104_Sub18_Sub17.method800(var12, var13, var12 + var19, var13 + var20);
								Class104_Sub18_Sub17_Sub4.method931();
								++client.anInt1892;
								Class104_Sub2.method479(true);
								Class104_Sub7.method510(true);
								Class104_Sub2.method479(false);
								Class104_Sub7.method510(false);
								Class88.method405();
								client.method149();
								if (!client.aBool2034) {
									var21 = client.anInt1962;
									if ((client.anInt1821 / 256) > var21)
										var21 = client.anInt1821 / 256;

									if (client.aBoolArray2036[4] && ((client.anIntArray2038[4] + 128) > var21))
										var21 = client.anIntArray2038[4] + 128;

									var22 = (client.anInt1866 + client.anInt1859) & 2047;
									var23 = Class50.anInt421;
									var24 = Class47.method211(Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695,
											Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694, Class12.anInt73)
											- 50;
									var25 = Class104_Sub2.anInt860;
									var26 = 600 + (var21 * 3);
									var27 = (2048 - var21) & 2047;
									var28 = (2048 - var22) & 2047;
									var59 = 0;
									var30 = 0;
									var31 = var26;
									if (var27 != 0) {
										var32 = Class104_Sub18_Sub17_Sub4.anIntArray1680[var27];
										var65 = Class104_Sub18_Sub17_Sub4.anIntArray1678[var27];
										var66 = ((var30 * var65) - (var26 * var32)) >> 16;
										var31 = ((var30 * var32) + (var65 * var26)) >> 16;
										var30 = var66;
									}

									if (var28 != 0) {
										var32 = Class104_Sub18_Sub17_Sub4.anIntArray1680[var28];
										var65 = Class104_Sub18_Sub17_Sub4.anIntArray1678[var28];
										var66 = ((var31 * var32) + (var65 * var59)) >> 16;
										var31 = ((var65 * var31) - (var32 * var59)) >> 16;
										var59 = var66;
									}

									Class85.anInt672 = var23 - var59;
									Class46.anInt403 = var24 - var30;
									Class99.anInt793 = var25 - var31;
									Class27.anInt266 = var21;
									Class44.anInt395 = var22;
								}

								if (!client.aBool2034) {
									var23 = 3;
									if (Class27.anInt266 < 310) {
										var24 = Class85.anInt672 >> 7;
										var25 = Class99.anInt793 >> 7;
										var26 = Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 >> 7;
										var27 = Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 >> 7;
										if ((Class76.aByteArrayArrayArray600[Class12.anInt73][var24][var25] & 4) != 0)
											var23 = Class12.anInt73;

										if (var26 > var24)
											var28 = var26 - var24;
										else
											var28 = var24 - var26;

										if (var27 > var25)
											var59 = var27 - var25;
										else
											var59 = var25 - var27;

										if (var28 > var59) {
											var30 = (65536 * var59) / var28;
											var31 = '\u8000';

											while (var24 != var26) {
												if (var24 < var26)
													++var24;
												else if (var24 > var26)
													--var24;

												if ((Class76.aByteArrayArrayArray600[Class12.anInt73][var24][var25]
														& 4) != 0)
													var23 = Class12.anInt73;

												var31 += var30;
												if (var31 >= 65536) {
													var31 -= 65536;
													if (var25 < var27)
														++var25;
													else if (var25 > var27)
														--var25;

													if ((Class76.aByteArrayArrayArray600[Class12.anInt73][var24][var25]
															& 4) != 0)
														var23 = Class12.anInt73;
												}
											}
										} else {
											var30 = (65536 * var28) / var59;
											var31 = '\u8000';

											while (var27 != var25) {
												if (var25 < var27)
													++var25;
												else if (var25 > var27)
													--var25;

												if ((Class76.aByteArrayArrayArray600[Class12.anInt73][var24][var25]
														& 4) != 0)
													var23 = Class12.anInt73;

												var31 += var30;
												if (var31 >= 65536) {
													var31 -= 65536;
													if (var24 < var26)
														++var24;
													else if (var24 > var26)
														--var24;

													if ((Class76.aByteArrayArrayArray600[Class12.anInt73][var24][var25]
															& 4) != 0)
														var23 = Class12.anInt73;
												}
											}
										}
									}

									if ((Class76.aByteArrayArrayArray600[Class12.anInt73][Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 >> 7][Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 >> 7]
											& 4) != 0)
										var23 = Class12.anInt73;

									var21 = var23;
								} else {
									var23 = Class47.method211(Class85.anInt672, Class99.anInt793, Class12.anInt73);
									if (((var23 - Class46.anInt403) < 800)
											&& ((Class76.aByteArrayArrayArray600[Class12.anInt73][Class85.anInt672 >> 7][Class99.anInt793 >> 7]
													& 4) != 0))
										var22 = Class12.anInt73;
									else
										var22 = 3;

									var21 = var22;
								}

								var22 = Class85.anInt672;
								var23 = Class46.anInt403;
								var24 = Class99.anInt793;
								var25 = Class27.anInt266;
								var26 = Class44.anInt395;

								for (var27 = 0; var27 < 5; ++var27)
									if (client.aBoolArray2036[var27]) {
										var28 = (int) (((Math.random() * (1 + (2 * client.anIntArray2039[var27])))
												- client.anIntArray2039[var27]) + (Math
														.sin(client.anIntArray2040[var27]
																* (client.anIntArray2020[var27] / 100.0D))
														* client.anIntArray2038[var27]));
										if (var27 == 0)
											Class85.anInt672 += var28;

										if (var27 == 1)
											Class46.anInt403 += var28;

										if (var27 == 2)
											Class99.anInt793 += var28;

										if (var27 == 3)
											Class44.anInt395 = (Class44.anInt395 + var28) & 2047;

										if (var27 == 4) {
											Class27.anInt266 += var28;
											if (Class27.anInt266 < 128)
												Class27.anInt266 = 128;

											if (Class27.anInt266 > 383)
												Class27.anInt266 = 383;
										}
									}

								var27 = Class14.anInt91;
								var28 = Class14.anInt95;
								if ((var27 >= var12) && (var27 < (var19 + var12)) && (var28 >= var13)
										&& (var28 < (var20 + var13))) {
									Class104_Sub18_Sub16_Sub4.aBool1578 = true;
									Class104_Sub18_Sub16_Sub4.anInt1548 = 0;
									Class104_Sub18_Sub16_Sub4.anInt1526 = Class14.anInt91 - var12;
									Class104_Sub18_Sub16_Sub4.anInt1580 = Class14.anInt95 - var13;
								} else {
									Class104_Sub18_Sub16_Sub4.aBool1578 = false;
									Class104_Sub18_Sub16_Sub4.anInt1548 = 0;
								}

								Class101.method465();
								Class104_Sub18_Sub17.method805(var12, var13, var19, var20, 0);
								Class101.method465();
								Class81.aClass17_643.method102(Class85.anInt672, Class46.anInt403, Class99.anInt793,
										Class27.anInt266, Class44.anInt395, var21);
								Class101.method465();
								Class81.aClass17_643.method77();
								client.anInt1881 = 0;

								for (var59 = -1; var59 < (client.anInt1832 + client.anInt1994); ++var59) {
									Object var67;
									if (var59 == -1)
										var67 = Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644;
									else if (var59 < client.anInt1994)
										var67 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[client.anIntArray1909[var59]];
									else
										var67 = client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[client.anIntArray1830[var59
												- client.anInt1994]];

									if ((null != var67) && ((Class104_Sub18_Sub16_Sub7) var67).method936(1531790724)) {
										Class104_Sub18_Sub2 var36;
										if (var67 instanceof Class104_Sub18_Sub16_Sub7_Sub2) {
											var36 = ((Class104_Sub18_Sub16_Sub7_Sub2) var67).aClass104_Sub18_Sub2_1788;
											if (var36.anIntArray1230 != null)
												var36 = var36.method677();

											if (null == var36)
												continue;
										}

										if (var59 >= client.anInt1994) {
											var36 = ((Class104_Sub18_Sub16_Sub7_Sub2) var67).aClass104_Sub18_Sub2_1788;
											if (var36.anIntArray1230 != null)
												var36 = var36.method677();

											if ((var36.anInt1252 >= 0)
													&& (var36.anInt1252 < Class70.aClass104_Sub18_Sub17_Sub1Array575.length)) {
												Class29.method142((Class104_Sub18_Sub16_Sub7) var67,
														15 + ((Class104_Sub18_Sub16_Sub7) var67).anInt1706);
												if (client.anInt1999 > -1)
													Class70.aClass104_Sub18_Sub17_Sub1Array575[var36.anInt1252]
															.method841((client.anInt1999 + var12) - 12,
																	(var13 + client.anInt1894) - 30);
											}

											if ((client.anInt1797 == 1)
													&& (client.anIntArray1830[var59
															- client.anInt1994] == client.anInt1808)
													&& ((client.anInt1799 % 20) < 10)) {
												Class29.method142((Class104_Sub18_Sub16_Sub7) var67,
														15 + ((Class104_Sub18_Sub16_Sub7) var67).anInt1706);
												if (client.anInt1999 > -1)
													Class104_Sub11.aClass104_Sub18_Sub17_Sub1Array969[0].method841(
															(client.anInt1999 + var12) - 12,
															(var13 + client.anInt1894) - 28);
											}
										} else {
											var31 = 30;
											final Class104_Sub18_Sub16_Sub7_Sub1 var37 = (Class104_Sub18_Sub16_Sub7_Sub1) var67;
											if ((var37.anInt1771 != -1) || (var37.anInt1784 != -1)) {
												Class29.method142((Class104_Sub18_Sub16_Sub7) var67,
														((Class104_Sub18_Sub16_Sub7) var67).anInt1706 + 15);
												if (client.anInt1999 > -1) {
													if (var37.anInt1771 != -1) {
														client.aClass104_Sub18_Sub17_Sub1Array291[var37.anInt1771]
																.method841((client.anInt1999 + var12) - 12,
																		(client.anInt1894 + var13) - var31);
														var31 += 25;
													}

													if (var37.anInt1784 != -1) {
														Class70.aClass104_Sub18_Sub17_Sub1Array575[var37.anInt1784]
																.method841((var12 + client.anInt1999) - 12,
																		(var13 + client.anInt1894) - var31);
														var31 += 25;
													}
												}
											}

											if ((var59 >= 0) && (client.anInt1797 == 10)
													&& (client.anIntArray1909[var59] == client.anInt1809)) {
												Class29.method142((Class104_Sub18_Sub16_Sub7) var67,
														15 + ((Class104_Sub18_Sub16_Sub7) var67).anInt1706);
												if (client.anInt1999 > -1)
													Class104_Sub11.aClass104_Sub18_Sub17_Sub1Array969[1].method841(
															(var12 + client.anInt1999) - 12,
															(var13 + client.anInt1894) - var31);
											}
										}

										if ((null != ((Class104_Sub18_Sub16_Sub7) var67).aString1723)
												&& ((var59 >= client.anInt1994) || (client.anInt2004 == 0)
														|| (client.anInt2004 == 3)
														|| ((client.anInt2004 == 1) && BZip2Context.method154(
																((Class104_Sub18_Sub16_Sub7_Sub1) var67).aString1780)))) {
											Class29.method142((Class104_Sub18_Sub16_Sub7) var67,
													((Class104_Sub18_Sub16_Sub7) var67).anInt1706);
											if ((client.anInt1999 > -1) && (client.anInt1881 < client.anInt1882)) {
												client.anIntArray1886[client.anInt1881] = Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36
														.method883(((Class104_Sub18_Sub16_Sub7) var67).aString1723) / 2;
												client.anIntArray1807[client.anInt1881] = Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.anInt1600;
												client.anIntArray1883[client.anInt1881] = client.anInt1999;
												client.anIntArray1884[client.anInt1881] = client.anInt1894;
												client.anIntArray2011[client.anInt1881] = ((Class104_Sub18_Sub16_Sub7) var67).anInt1731;
												client.anIntArray1888[client.anInt1881] = ((Class104_Sub18_Sub16_Sub7) var67).anInt1749;
												client.anIntArray1889[client.anInt1881] = ((Class104_Sub18_Sub16_Sub7) var67).anInt1713;
												client.aStringArray1890[client.anInt1881] = ((Class104_Sub18_Sub16_Sub7) var67).aString1723;
												++client.anInt1881;
											}
										}

										if (((Class104_Sub18_Sub16_Sub7) var67).anInt1714 > client.anInt1799) {
											Class29.method142((Class104_Sub18_Sub16_Sub7) var67,
													((Class104_Sub18_Sub16_Sub7) var67).anInt1706 + 15);
											if (client.anInt1999 > -1) {
												var31 = (((Class104_Sub18_Sub16_Sub7) var67).anInt1693 * 30)
														/ ((Class104_Sub18_Sub16_Sub7) var67).anInt1715;
												if (var31 > 30)
													var31 = 30;

												Class104_Sub18_Sub17.method805((var12 + client.anInt1999) - 15,
														(var13 + client.anInt1894) - 3, var31, 5, '\uff00');
												Class104_Sub18_Sub17.method805(
														var31 + ((client.anInt1999 + var12) - 15),
														(client.anInt1894 + var13) - 3, 30 - var31, 5, 16711680);
											}
										}

										for (var31 = 0; var31 < 4; ++var31)
											if (((Class104_Sub18_Sub16_Sub7) var67).anIntArray1712[var31] > client.anInt1799) {
												Class29.method142((Class104_Sub18_Sub16_Sub7) var67,
														((Class104_Sub18_Sub16_Sub7) var67).anInt1706 / 2);
												if (client.anInt1999 > -1) {
													if (var31 == 1)
														client.anInt1894 -= 20;

													if (var31 == 2) {
														client.anInt1999 -= 15;
														client.anInt1894 -= 10;
													}

													if (var31 == 3) {
														client.anInt1999 += 15;
														client.anInt1894 -= 10;
													}

													Class77.aClass104_Sub18_Sub17_Sub1Array623[((Class104_Sub18_Sub16_Sub7) var67).anIntArray1711[var31]]
															.method841((client.anInt1999 + var12) - 12,
																	(var13 + client.anInt1894) - 12);
													Class104_Sub7.aClass104_Sub18_Sub17_Sub2_Sub1_951.method882(
															Integer.toString(
																	((Class104_Sub18_Sub16_Sub7) var67).anIntArray1710[var31]),
															(client.anInt1999 + var12) - 1,
															var13 + client.anInt1894 + 3, 16777215, 0);
												}
											}
									}
								}

								int var42;
								for (var59 = 0; var59 < client.anInt1881; ++var59) {
									var30 = client.anIntArray1883[var59];
									var31 = client.anIntArray1884[var59];
									var32 = client.anIntArray1886[var59];
									var65 = client.anIntArray1807[var59];
									var34 = true;

									while (var34) {
										var34 = false;

										for (var38 = 0; var38 < var59; ++var38)
											if (((2 + var31) > (client.anIntArray1884[var38]
													- client.anIntArray1807[var38]))
													&& ((var31 - var65) < (2 + client.anIntArray1884[var38]))
													&& ((var30 - var32) < (client.anIntArray1886[var38]
															+ client.anIntArray1883[var38]))
													&& ((var30 + var32) > (client.anIntArray1883[var38]
															- client.anIntArray1886[var38]))
													&& ((client.anIntArray1884[var38]
															- client.anIntArray1807[var38]) < var31)) {
												var31 = client.anIntArray1884[var38] - client.anIntArray1807[var38];
												var34 = true;
											}
									}

									client.anInt1999 = client.anIntArray1883[var59];
									client.anInt1894 = client.anIntArray1884[var59] = var31;
									final String var39 = client.aStringArray1890[var59];
									if (client.anInt1949 == 0) {
										var40 = 16776960;
										if (client.anIntArray2011[var59] < 6)
											var40 = client.anIntArray2003[client.anIntArray2011[var59]];

										if (client.anIntArray2011[var59] == 6)
											var40 = (client.anInt1892 % 20) < 10 ? 16711680 : 16776960;

										if (client.anIntArray2011[var59] == 7)
											var40 = (client.anInt1892 % 20) < 10 ? 255 : '\uffff';

										if (client.anIntArray2011[var59] == 8)
											var40 = (client.anInt1892 % 20) < 10 ? '\ub000' : 8454016;

										if (client.anIntArray2011[var59] == 9) {
											var71 = 150 - client.anIntArray1889[var59];
											if (var71 < 50)
												var40 = (var71 * 1280) + 16711680;
											else if (var71 < 100)
												var40 = 16776960 - (327680 * (var71 - 50));
											else if (var71 < 150)
												var40 = '\uff00' + (5 * (var71 - 100));
										}

										if (client.anIntArray2011[var59] == 10) {
											var71 = 150 - client.anIntArray1889[var59];
											if (var71 < 50)
												var40 = (var71 * 5) + 16711680;
											else if (var71 < 100)
												var40 = 16711935 - (327680 * (var71 - 50));
											else if (var71 < 150)
												var40 = (((var71 - 100) * 327680) + 255) - ((var71 - 100) * 5);
										}

										if (client.anIntArray2011[var59] == 11) {
											var71 = 150 - client.anIntArray1889[var59];
											if (var71 < 50)
												var40 = 16777215 - (var71 * 327685);
											else if (var71 < 100)
												var40 = (327685 * (var71 - 50)) + '\uff00';
											else if (var71 < 150)
												var40 = 16777215 - (327680 * (var71 - 100));
										}

										if (client.anIntArray1888[var59] == 0)
											Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.method882(var39,
													client.anInt1999 + var12, client.anInt1894 + var13, var40, 0);

										if (client.anIntArray1888[var59] == 1)
											Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.method866(var39,
													var12 + client.anInt1999, client.anInt1894 + var13, var40, 0,
													client.anInt1892);

										if (client.anIntArray1888[var59] == 2)
											Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.method867(var39,
													var12 + client.anInt1999, var13 + client.anInt1894, var40, 0,
													client.anInt1892);

										if (client.anIntArray1888[var59] == 3)
											Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.method868(var39,
													var12 + client.anInt1999, client.anInt1894 + var13, var40, 0,
													client.anInt1892, 150 - client.anIntArray1889[var59]);

										if (client.anIntArray1888[var59] == 4) {
											var71 = ((150 - client.anIntArray1889[var59])
													* (Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.method883(var39)
															+ 100))
													/ 150;
											Class104_Sub18_Sub17.method792((client.anInt1999 + var12) - 50, var13,
													var12 + client.anInt1999 + 50, var13 + var20);
											Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.drawstr(var39,
													(50 + client.anInt1999 + var12) - var71, var13 + client.anInt1894,
													var40, 0);
											Class104_Sub18_Sub17.method800(var12, var13, var12 + var19, var20 + var13);
										}

										if (client.anIntArray1888[var59] == 5) {
											var71 = 150 - client.anIntArray1889[var59];
											var42 = 0;
											if (var71 < 25)
												var42 = var71 - 25;
											else if (var71 > 125)
												var42 = var71 - 125;

											Class104_Sub18_Sub17.method792(var12,
													(var13 + client.anInt1894)
															- Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.anInt1600 - 1,
													var12 + var19, client.anInt1894 + var13 + 5);
											Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.method882(var39,
													var12 + client.anInt1999, var13 + client.anInt1894 + var42, var40,
													0);
											Class104_Sub18_Sub17.method800(var12, var13, var12 + var19, var13 + var20);
										}
									} else
										Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.method882(var39,
												var12 + client.anInt1999, client.anInt1894 + var13, 16776960, 0);
								}

								Class103.method468(var12, var13);
								((Class34) Class104_Sub18_Sub17_Sub4.anInterface2_1686).method161(client.anInt1867);
								Class104_Sub16.method551(var12, var13);
								Class85.anInt672 = var22;
								Class46.anInt403 = var23;
								Class99.anInt793 = var24;
								Class27.anInt266 = var25;
								Class44.anInt395 = var26;
								if (client.aBool1798) {
									final byte var64 = 0;
									var30 = var64 + Class87.anInt684 + Class87.anInt682;
									if (var30 == 0)
										client.aBool1798 = false;
								}

								if (client.aBool1798) {
									Class104_Sub18_Sub17.method805(var12, var13, var19, var20, 0);
									Class104_Sub15.drawLoading("Loading - please wait.", false);
								}

								if (!client.aBool1798 && !client.aBool1930 && (var27 >= var12)
										&& (var27 < (var19 + var12)) && (var28 >= var13) && (var28 < (var13 + var20))) {
									if ((client.anInt1941 == 0) && !client.aBool1943)
										Class60.method256("Walk here", "", 23, 0, var27 - var12, var28 - var13);

									var59 = -1;

									for (var30 = 0; var30 < Class104_Sub18_Sub16_Sub4.anInt1548; ++var30) {
										var31 = Class104_Sub18_Sub16_Sub4.anIntArray1537[var30];
										var32 = var31 & 127;
										var65 = (var31 >> 7) & 127;
										var66 = (var31 >> 29) & 3;
										var38 = (var31 >> 14) & 32767;
										if (var59 != var31) {
											var59 = var31;
											if ((var66 == 2) && (Class81.aClass17_643.method89(Class12.anInt73, var32,
													var65, var31) >= 0)) {
												ObjectDefinition var43 = Class104_Sub18_Sub12.forId(var38);
												if (var43.anIntArray1338 != null)
													var43 = var43.method747();

												if (var43 == null)
													continue;

												if (client.anInt1941 == 1)
													Class60.method256("Use",
															client.aString1942 + " " + "->" + " "
																	+ Class70.method326('\uffff') + var43.aString1331,
															1, var31, var32, var65);
												else if (client.aBool1943) {
													if ((Class11.anInt66 & 4) == 4)
														Class60.method256(client.aString1914,
																client.aString1946 + " " + "->" + " "
																		+ Class70.method326('\uffff')
																		+ var43.aString1331,
																2, var31, var32, var65);
												} else {
													String[] var44 = var43.aStringArray1349;
													if (client.aBool1870)
														var44 = Class9.method37(var44);

													if (null != var44)
														for (var42 = 4; var42 >= 0; --var42)
															if (null != var44[var42]) {
																short var45 = 0;
																if (var42 == 0)
																	var45 = 3;

																if (var42 == 1)
																	var45 = 4;

																if (var42 == 2)
																	var45 = 5;

																if (var42 == 3)
																	var45 = 6;

																if (var42 == 4)
																	var45 = 1001;

																Class60.method256(var44[var42],
																		Class70.method326('\uffff') + var43.aString1331,
																		var45, var31, var32, var65);
															}

													Class60.method256("Examine",
															Class70.method326('\uffff') + var43.aString1331, 1002,
															var43.anInt1330 << 14, var32, var65);
												}
											}

											Class104_Sub18_Sub16_Sub7_Sub2 var46;
											Class104_Sub18_Sub16_Sub7_Sub1 var73;
											if (var66 == 1) {
												final Class104_Sub18_Sub16_Sub7_Sub2 var68 = client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var38];
												if ((var68.aClass104_Sub18_Sub2_1788.anInt1240 == 1)
														&& ((var68.anInt1695 & 127) == 64)
														&& ((var68.anInt1694 & 127) == 64)) {
													for (var71 = 0; var71 < client.anInt1832; ++var71) {
														var46 = client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[client.anIntArray1830[var71]];
														if ((var46 != null) && (var68 != var46)
																&& (var46.aClass104_Sub18_Sub2_1788.anInt1240 == 1)
																&& (var46.anInt1695 == var68.anInt1695)
																&& (var68.anInt1694 == var46.anInt1694))
															Class100.method463(var46.aClass104_Sub18_Sub2_1788,
																	client.anIntArray1830[var71], var32, var65);
													}

													for (var71 = 0; var71 < client.anInt1994; ++var71) {
														var73 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[client.anIntArray1909[var71]];
														if ((var73 != null) && (var73.anInt1695 == var68.anInt1695)
																&& (var68.anInt1694 == var73.anInt1694))
															Class81.method355(var73, client.anIntArray1909[var71],
																	var32, var65);
													}
												}

												Class100.method463(var68.aClass104_Sub18_Sub2_1788, var38, var32,
														var65);
											}

											if (var66 == 0) {
												final Class104_Sub18_Sub16_Sub7_Sub1 var69 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var38];
												if (((var69.anInt1695 & 127) == 64)
														&& ((var69.anInt1694 & 127) == 64)) {
													for (var71 = 0; var71 < client.anInt1832; ++var71) {
														var46 = client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[client.anIntArray1830[var71]];
														if ((var46 != null)
																&& (var46.aClass104_Sub18_Sub2_1788.anInt1240 == 1)
																&& (var46.anInt1695 == var69.anInt1695)
																&& (var46.anInt1694 == var69.anInt1694))
															Class100.method463(var46.aClass104_Sub18_Sub2_1788,
																	client.anIntArray1830[var71], var32, var65);
													}

													for (var71 = 0; var71 < client.anInt1994; ++var71) {
														var73 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[client.anIntArray1909[var71]];
														if ((var73 != null) && (var73 != var69)
																&& (var69.anInt1695 == var73.anInt1695)
																&& (var73.anInt1694 == var69.anInt1694))
															Class81.method355(var73, client.anIntArray1909[var71],
																	var32, var65);
													}
												}

												Class81.method355(var69, var38, var32, var65);
											}

											if (var66 == 3) {
												final Class59 var70 = client.aClass59ArrayArrayArray1952[Class12.anInt73][var32][var65];
												if (var70 != null)
													for (Class104_Sub18_Sub16_Sub6 var72 = (Class104_Sub18_Sub16_Sub6) var70
															.method254(); var72 != null; var72 = (Class104_Sub18_Sub16_Sub6) var70
																	.method253()) {
														final Class104_Sub18_Sub12 var74 = Class27
																.method137(var72.anInt1691);
														if (client.anInt1941 == 1)
															Class60.method256("Use",
																	client.aString1942 + " " + "->" + " "
																			+ Class70.method326(16748608)
																			+ var74.aString1444,
																	16, var72.anInt1691, var32, var65);
														else if (client.aBool1943) {
															if ((Class11.anInt66 & 1) == 1)
																Class60.method256(client.aString1914,
																		client.aString1946 + " " + "->" + " "
																				+ Class70.method326(16748608)
																				+ var74.aString1444,
																		17, var72.anInt1691, var32, var65);
														} else {
															String[] var47 = var74.aStringArray1434;
															if (client.aBool1870)
																var47 = Class9.method37(var47);

															for (int var48 = 4; var48 >= 0; --var48)
																if ((var47 != null) && (var47[var48] != null)) {
																	byte var49 = 0;
																	if (var48 == 0)
																		var49 = 18;

																	if (var48 == 1)
																		var49 = 19;

																	if (var48 == 2)
																		var49 = 20;

																	if (var48 == 3)
																		var49 = 21;

																	if (var48 == 4)
																		var49 = 22;

																	Class60.method256(var47[var48],
																			Class70.method326(16748608)
																					+ var74.aString1444,
																			var49, var72.anInt1691, var32, var65);
																} else if (var48 == 2)
																	Class60.method256("Take",
																			Class70.method326(16748608)
																					+ var74.aString1444,
																			20, var72.anInt1691, var32, var65);

															Class60.method256("Examine",
																	Class70.method326(16748608) + var74.aString1444,
																	1004, var72.anInt1691, var32, var65);
														}
													}
											}
										}
									}
								}

								Class104_Sub18_Sub17.method800(var2, var3, var4, var5);
								continue;
							}

							if (var10.anInt982 == 1338) {
								Class26.method134(var12, var13, var11);
								Class104_Sub18_Sub17.method800(var2, var3, var4, var5);
								continue;
							}
						}

						var19 = Class14.anInt91;
						var20 = Class14.anInt95;
						String var50;
						String var51;
						String var54;
						if (!client.aBool1930 && (var19 >= var15) && (var20 >= var16) && (var19 < var17)
								&& (var20 < var18)) {
							var21 = var19 - var12;
							var22 = var20 - var13;
							if (var10.anInt981 == 1)
								Class60.method256(var10.aString1054, "", 24, 0, 0, var10.anInt978);

							if ((var10.anInt981 == 2) && !client.aBool1943)
								if (Class101.method464(Class104_Sub3.method485(var10)) == 0)
									var50 = null;
								else if ((null != var10.aString1036) && (var10.aString1036.trim().length() != 0))
									var50 = var10.aString1036;
								else
									var50 = null;

							if (var10.anInt981 == 3)
								Class60.method256("Close", "", 26, 0, 0, var10.anInt978);

							if (var10.anInt981 == 4)
								Class60.method256(var10.aString1054, "", 28, 0, 0, var10.anInt978);

							if (var10.anInt981 == 5)
								Class60.method256(var10.aString1054, "", 29, 0, 0, var10.anInt978);

							if ((var10.anInt981 == 6) && (client.aClass104_Sub12_1951 == null))
								Class60.method256(var10.aString1054, "", 30, 0, -1, var10.anInt978);

							if (var10.anInt980 == 2) {
								var23 = 0;

								for (var24 = 0; var24 < var10.anInt988; ++var24)
									for (var25 = 0; var25 < var10.anInt987; ++var25) {
										var26 = var25 * (var10.anInt1038 + 32);
										var27 = var24 * (32 + var10.anInt1032);
										if (var23 < 20) {
											var26 += var10.anIntArray1049[var23];
											var27 += var10.anIntArray1057[var23];
										}

										if ((var21 >= var26) && (var22 >= var27) && (var21 < (32 + var26))
												&& (var22 < (32 + var27))) {
											client.anInt1924 = var23;
											Class89.aClass104_Sub12_705 = var10;
											if (var10.anIntArray1080[var23] > 0)
												label1803: {
													final Class104_Sub18_Sub12 var52 = Class27
															.method137(var10.anIntArray1080[var23] - 1);
													boolean var29;
													if (client.anInt1941 == 1) {
														var30 = Class104_Sub3.method485(var10);
														var29 = ((var30 >> 30) & 1) != 0;
														if (var29) {
															if ((var10.anInt978 != Class14.anInt105)
																	|| (Class7.anInt44 != var23))
																Class60.method256("Use",
																		client.aString1942 + " " + "->" + " "
																				+ Class70.method326(16748608)
																				+ var52.aString1444,
																		31, var52.anInt1418, var23, var10.anInt978);
															break label1803;
														}
													}

													if (client.aBool1943) {
														var30 = Class104_Sub3.method485(var10);
														var29 = ((var30 >> 30) & 1) != 0;
														if (var29) {
															if ((Class11.anInt66 & 16) == 16)
																Class60.method256(client.aString1914,
																		client.aString1946 + " " + "->" + " "
																				+ Class70.method326(16748608)
																				+ var52.aString1444,
																		32, var52.anInt1418, var23, var10.anInt978);
															break label1803;
														}
													}

													String[] var53 = var52.aStringArray1435;
													if (client.aBool1870)
														var53 = Class9.method37(var53);

													var31 = Class104_Sub3.method485(var10);
													final boolean var62 = ((var31 >> 30) & 1) != 0;
													if (var62)
														for (var32 = 4; var32 >= 3; --var32)
															if ((null != var53) && (null != var53[var32])) {
																byte var33;
																if (var32 == 3)
																	var33 = 36;
																else
																	var33 = 37;

																Class60.method256(var53[var32],
																		Class70.method326(16748608) + var52.aString1444,
																		var33, var52.anInt1418, var23, var10.anInt978);
															} else if (var32 == 4)
																Class60.method256("Drop",
																		Class70.method326(16748608) + var52.aString1444,
																		37, var52.anInt1418, var23, var10.anInt978);

													var65 = Class104_Sub3.method485(var10);
													final boolean var63 = ((var65 >> 31) & 1) != 0;
													if (var63)
														Class60.method256("Use",
																Class70.method326(16748608) + var52.aString1444, 38,
																var52.anInt1418, var23, var10.anInt978);

													var38 = Class104_Sub3.method485(var10);
													var34 = ((var38 >> 30) & 1) != 0;
													byte var41;
													if (var34 && (null != var53))
														for (var40 = 2; var40 >= 0; --var40)
															if (null != var53[var40]) {
																var41 = 0;
																if (var40 == 0)
																	var41 = 33;

																if (var40 == 1)
																	var41 = 34;

																if (var40 == 2)
																	var41 = 35;

																Class60.method256(var53[var40],
																		Class70.method326(16748608) + var52.aString1444,
																		var41, var52.anInt1418, var23, var10.anInt978);
															}

													var53 = var10.aStringArray1028;
													if (client.aBool1870)
														var53 = Class9.method37(var53);

													if (null != var53)
														for (var40 = 4; var40 >= 0; --var40)
															if (var53[var40] != null) {
																var41 = 0;
																if (var40 == 0)
																	var41 = 39;

																if (var40 == 1)
																	var41 = 40;

																if (var40 == 2)
																	var41 = 41;

																if (var40 == 3)
																	var41 = 42;

																if (var40 == 4)
																	var41 = 43;

																Class60.method256(var53[var40],
																		Class70.method326(16748608) + var52.aString1444,
																		var41, var52.anInt1418, var23, var10.anInt978);
															}

													Class60.method256("Examine",
															Class70.method326(16748608) + var52.aString1444, 1005,
															var52.anInt1418, var23, var10.anInt978);
												}
										}

										++var23;
									}
							}

							if (var10.isHeaderless)
								if (client.aBool1943) {
									var24 = Class104_Sub3.method485(var10);
									final boolean var57 = ((var24 >> 21) & 1) != 0;
									if (var57 && ((Class11.anInt66 & 32) == 32))
										Class60.method256(client.aString1914,
												client.aString1946 + " " + "->" + " " + var10.aString990, 58, 0,
												var10.anInt1018, var10.anInt978);
								} else {
									for (var23 = 9; var23 >= 5; --var23) {
										var51 = Class24.method127(var10, var23);
										if (null != var51)
											Class60.method256(var51, var10.aString990, 1007, 1 + var23, var10.anInt1018,
													var10.anInt978);
									}

									var50 = JagFS2.method68(var10);
									if (var50 != null)
										Class60.method256(var50, var10.aString990, 25, 0, var10.anInt1018,
												var10.anInt978);

									for (var24 = 4; var24 >= 0; --var24) {
										var54 = Class24.method127(var10, var24);
										if (var54 != null)
											Class60.method256(var54, var10.aString990, 57, 1 + var24, var10.anInt1018,
													var10.anInt978);
									}

									if (Class33.method157(Class104_Sub3.method485(var10)))
										Class60.method256("Continue", "", 30, 0, var10.anInt1018, var10.anInt978);
								}
						}

						if (var10.anInt980 == 0) {
							if (!var10.isHeaderless && Class40.method182(var10) && (var10 != Class76.aClass104_Sub12_619))
								continue;

							if (!var10.isHeaderless) {
								if (var10.anInt992 > (var10.anInt994 - var10.anInt988))
									var10.anInt992 = var10.anInt994 - var10.anInt988;

								if (var10.anInt992 < 0)
									var10.anInt992 = 0;
							}

							method300(var0, var10.anInt978, var15, var16, var17, var18, var12 - var10.anInt991,
									var13 - var10.anInt992, var11);
							if (var10.aClass104_Sub12Array1020 != null)
								method300(var10.aClass104_Sub12Array1020, var10.anInt978, var15, var16, var17, var18,
										var12 - var10.anInt991, var13 - var10.anInt992, var11);

							final Nodee var55 = (Nodee) client.aClass58_1795.method241(var10.anInt978);
							if (null != var55) {
								if ((var55.anInt956 == 0) && (Class14.anInt91 >= var15) && (Class14.anInt95 >= var16)
										&& (Class14.anInt91 < var17) && (Class14.anInt95 < var18) && !client.aBool1930
										&& !client.aBool1956) {
									client.aStringArray1863[0] = "Cancel";
									client.aStringArray1936[0] = "";
									client.anIntArray1933[0] = 1006;
									client.anInt1805 = 1;
								}

								Class104_Sub18_Sub11.method770(var55.rsfaceID, var15, var16, var17, var18, var12, var13,
										var11);
							}

							Class104_Sub18_Sub17.method800(var2, var3, var4, var5);
							Class104_Sub18_Sub17_Sub4.method931();
						}

						if (client.aBoolArray1992[var11] || (client.anInt1997 > 1)) {
							if ((var10.anInt980 == 0) && !var10.isHeaderless && (var10.anInt994 > var10.anInt988)) {
								var21 = var12 + var10.anInt987;
								var22 = var10.anInt992;
								var23 = var10.anInt988;
								var24 = var10.anInt994;
								Class104_Sub23.aClass104_Sub18_Sub17_Sub3Array1182[0].method889(var21, var13);
								Class104_Sub23.aClass104_Sub18_Sub17_Sub3Array1182[1].method889(var21,
										(var13 + var23) - 16);
								Class104_Sub18_Sub17.method805(var21, var13 + 16, 16, var23 - 32,
										client.anInt1796 * 2301979);
								var25 = (var23 * (var23 - 32)) / var24;
								if (var25 < 8)
									var25 = 8;

								var26 = (var22 * (var23 - 32 - var25)) / (var24 - var23);
								Class104_Sub18_Sub17.method805(var21, var26 + 16 + var13, 16, var25,
										client.anInt1974 * 5063219);
								Class104_Sub18_Sub17.method797(var21, var26 + 16 + var13, var25, client.anInt1871);
								Class104_Sub18_Sub17.method797(1 + var21, var26 + 16 + var13, var25, client.anInt1871);
								Class104_Sub18_Sub17.method796(var21, 16 + var13 + var26, 16, client.anInt1871);
								Class104_Sub18_Sub17.method796(var21, var26 + var13 + 17, 16, client.anInt1871);
								Class104_Sub18_Sub17.method797(15 + var21, var26 + 16 + var13, var25,
										client.anInt1959 * 3353893);
								Class104_Sub18_Sub17.method797(14 + var21, var26 + 17 + var13, var25 - 1,
										client.anInt1959 * 3353893);
								Class104_Sub18_Sub17.method796(var21, 15 + var13 + var26 + var25, 16,
										client.anInt1959 * 3353893);
								Class104_Sub18_Sub17.method796(1 + var21, var26 + var13 + 14 + var25, 15,
										client.anInt1959 * 3353893);
							}

							if (var10.anInt980 != 1)
								if (var10.anInt980 == 2) {
									var21 = 0;

									for (var22 = 0; var22 < var10.anInt988; ++var22)
										for (var23 = 0; var23 < var10.anInt987; ++var23) {
											var24 = var12 + ((32 + var10.anInt1038) * var23);
											var25 = var13 + (var22 * (var10.anInt1032 + 32));
											if (var21 < 20) {
												var24 += var10.anIntArray1049[var21];
												var25 += var10.anIntArray1057[var21];
											}

											if (var10.anIntArray1080[var21] <= 0) {
												if ((null != var10.anIntArray1035) && (var21 < 20)) {
													final Class104_Sub18_Sub17_Sub1 var83 = var10.method533(var21,
															2127306834);
													if (null != var83)
														var83.method841(var24, var25);
													else if (Widget.aBool1065)
														Class79.setflags(var10);
												}
											} else {
												var28 = var10.anIntArray1080[var21] - 1;
												if ((((32 + var24) > var2) && (var24 < var4) && ((32 + var25) > var3)
														&& (var25 < var5))
														|| ((Class67.aClass104_Sub12_556 == var10)
																&& (client.anInt1901 == var21))) {
													Class104_Sub18_Sub17_Sub1 var80;
													if ((client.anInt1941 == 1) && (Class7.anInt44 == var21)
															&& (var10.anInt978 == Class14.anInt105))
														var80 = Widget.method539(var28,
																var10.anIntArray1081[var21], 2, 0, false);
													else
														var80 = Widget.method539(var28,
																var10.anIntArray1081[var21], 1, 3153952, false);

													if (var80 != null) {
														if ((var10 == Class67.aClass104_Sub12_556)
																&& (var21 == client.anInt1901)) {
															var26 = Class14.anInt91 - client.anInt1902;
															var27 = Class14.anInt95 - client.anInt1903;
															if ((var26 < 5) && (var26 > -5))
																var26 = 0;

															if ((var27 < 5) && (var27 > -5))
																var27 = 0;

															if (client.anInt1793 < 5) {
																var26 = 0;
																var27 = 0;
															}

															var80.method844(var24 + var26, var27 + var25, 128);
															if (var1 != -1) {
																final Widget var35 = var0[var1 & '\uffff'];
																if (((var27 + var25) < Class104_Sub18_Sub17.anInt1471)
																		&& (var35.anInt992 > 0)) {
																	var31 = ((Class104_Sub18_Sub17.anInt1471 - var25
																			- var27) * client.anInt1867) / 3;
																	if (var31 > (client.anInt1867 * 10))
																		var31 = client.anInt1867 * 10;

																	if (var31 > var35.anInt992)
																		var31 = var35.anInt992;

																	var35.anInt992 -= var31;
																	client.anInt1903 += var31;
																	Class79.setflags(var35);
																}

																if (((var25 + var27
																		+ 32) > Class104_Sub18_Sub17.anInt1470)
																		&& (var35.anInt992 < (var35.anInt994
																				- var35.anInt988))) {
																	var31 = (client.anInt1867 * ((32 + var25 + var27)
																			- Class104_Sub18_Sub17.anInt1470)) / 3;
																	if (var31 > (client.anInt1867 * 10))
																		var31 = client.anInt1867 * 10;

																	if (var31 > (var35.anInt994 - var35.anInt988
																			- var35.anInt992))
																		var31 = var35.anInt994 - var35.anInt988
																				- var35.anInt992;

																	var35.anInt992 += var31;
																	client.anInt1903 -= var31;
																	Class79.setflags(var35);
																}
															}
														} else if ((Class30.aClass104_Sub12_288 == var10)
																&& (var21 == client.anInt1900))
															var80.method844(var24, var25, 128);
														else
															var80.method841(var24, var25);
													} else
														Class79.setflags(var10);
												}
											}

											++var21;
										}
								} else if (var10.anInt980 == 3) {
									if (Class80.method353(var10)) {
										var21 = var10.anInt996;
										if ((Class76.aClass104_Sub12_619 == var10) && (var10.anInt998 != 0))
											var21 = var10.anInt998;
									} else {
										var21 = var10.anInt1017;
										if ((Class76.aClass104_Sub12_619 == var10) && (var10.anInt997 != 0))
											var21 = var10.anInt997;
									}

									if (var14 == 0) {
										if (var10.aBool1088)
											Class104_Sub18_Sub17.method805(var12, var13, var10.anInt987, var10.anInt988,
													var21);
										else
											Class104_Sub18_Sub17.method806(var12, var13, var10.anInt987, var10.anInt988,
													var21);
									} else if (var10.aBool1088)
										Class104_Sub18_Sub17.method802(var12, var13, var10.anInt987, var10.anInt988,
												var21, 256 - (var14 & 255));
									else
										Class104_Sub18_Sub17.method789(var12, var13, var10.anInt987, var10.anInt988,
												var21, 256 - (var14 & 255));
								} else {
									Class104_Sub18_Sub17_Sub2_Sub1 var79;
									if (var10.anInt980 == 4) {
										var79 = var10.method531();
										if (var79 == null) {
											if (Widget.aBool1065)
												Class79.setflags(var10);
										} else {
											var50 = var10.aString1025;
											if (Class80.method353(var10)) {
												var22 = var10.anInt996;
												if ((Class76.aClass104_Sub12_619 == var10) && (var10.anInt998 != 0))
													var22 = var10.anInt998;

												if (var10.aString1004.length() > 0)
													var50 = var10.aString1004;
											} else {
												var22 = var10.anInt1017;
												if ((Class76.aClass104_Sub12_619 == var10) && (var10.anInt997 != 0))
													var22 = var10.anInt997;
											}

											if (var10.isHeaderless && (var10.anInt986 != -1)) {
												final Class104_Sub18_Sub12 var77 = Class27.method137(var10.anInt986);
												var50 = var77.aString1444;
												if (var50 == null)
													var50 = "null";

												if (((var77.anInt1431 == 1) || (var10.anInt1083 != 1))
														&& (var10.anInt1083 != -1))
													var50 = Class70.method326(16748608) + var50 + "</col>" + " "
															+ '\u0078' + Nodee.method518(var10.anInt1083);
											}

											if (var10 == client.aClass104_Sub12_1951) {
												var50 = "Please wait...";
												var22 = var10.anInt1017;
											}

											if (!var10.isHeaderless)
												var50 = Class104_Sub23.method621(var50, var10);

											var79.method865(var50, var12, var13, var10.anInt987, var10.anInt988, var22,
													var10.aBool1030 ? 0 : -1, var10.anInt1059, var10.anInt1029,
													var10.anInt1027);
										}
									} else if (var10.anInt980 == 5) {
										Class104_Sub18_Sub17_Sub1 var81;
										if (!var10.isHeaderless) {
											var81 = var10.method535(Class80.method353(var10));
											if (var81 != null)
												var81.method841(var12, var13);
											else if (Widget.aBool1065)
												Class79.setflags(var10);
										} else {
											if (var10.anInt986 != -1)
												var81 = Widget.method539(var10.anInt986, var10.anInt1083,
														var10.anInt1006, var10.anInt1007, false);
											else
												var81 = var10.method535(false);

											if (null == var81) {
												if (Widget.aBool1065)
													Class79.setflags(var10);
											} else {
												var22 = var81.anInt1590;
												var23 = var81.anInt1591;
												if (!var10.aBool989) {
													var24 = (var10.anInt987 * 4096) / var22;
													if (var10.anInt979 != 0)
														var81.method850(var12 + (var10.anInt987 / 2),
																var13 + (var10.anInt988 / 2), var10.anInt979, var24);
													else if (var14 != 0)
														var81.method846(var12, var13, var10.anInt987, var10.anInt988,
																256 - (var14 & 255));
													else if ((var22 == var10.anInt987) && (var10.anInt988 == var23))
														var81.method841(var12, var13);
													else
														var81.method835(var12, var13, var10.anInt987, var10.anInt988);
												} else {
													Class104_Sub18_Sub17.method792(var12, var13, var12 + var10.anInt987,
															var13 + var10.anInt988);
													var24 = ((var22 - 1) + var10.anInt987) / var22;
													var25 = ((var23 - 1) + var10.anInt988) / var23;

													for (var26 = 0; var26 < var24; ++var26)
														for (var27 = 0; var27 < var25; ++var27)
															if (var10.anInt979 != 0)
																var81.method850(var12 + (var26 * var22) + (var22 / 2),
																		(var23 / 2) + (var27 * var23) + var13,
																		var10.anInt979, 4096);
															else if (var14 != 0)
																var81.method844(var12 + (var26 * var22),
																		var13 + (var27 * var23), 256 - (var14 & 255));
															else
																var81.method841(var12 + (var26 * var22),
																		var13 + (var27 * var23));

													Class104_Sub18_Sub17.method800(var2, var3, var4, var5);
												}
											}
										}
									} else {
										Class104_Sub18_Sub12 var78;
										if (var10.anInt980 == 6) {
											final boolean var58 = Class80.method353(var10);
											if (var58)
												var22 = var10.anInt1015;
											else
												var22 = var10.anInt1058;

											Class104_Sub18_Sub16_Sub4 var76 = null;
											var24 = 0;
											if (var10.anInt986 != -1) {
												var78 = Class27.method137(var10.anInt986);
												if (var78 != null) {
													var78 = var78.method776(var10.anInt1083);
													var76 = var78.method779(1);
													if (null != var76) {
														var76.method812();
														var24 = var76.anInt1467 / 2;
													} else
														Class79.setflags(var10);
												}
											} else if (var10.anInt1010 == 5) {
												if (var10.anInt1011 == 0)
													var76 = client.aClass85_2047.method389((Class104_Sub18_Sub3) null,
															-1, (Class104_Sub18_Sub3) null, -1);
												else
													var76 = Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644
															.method788(-78901604);
											} else if (var22 == -1) {
												var76 = var10.method532((Class104_Sub18_Sub3) null, -1, var58,
														Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.aClass85_1770);
												if ((null == var76) && Widget.aBool1065)
													Class79.setflags(var10);
											} else {
												final Class104_Sub18_Sub3 var82 = Class70.method327(var22);
												var76 = var10.method532(var82, var10.anInt974, var58,
														Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.aClass85_1770);
												if ((var76 == null) && Widget.aBool1065)
													Class79.setflags(var10);
											}

											Class104_Sub18_Sub17_Sub4.method928(var12 + (var10.anInt987 / 2),
													var13 + (var10.anInt988 / 2));
											var25 = (var10.anInt1021
													* Class104_Sub18_Sub17_Sub4.anIntArray1680[var10.anInt1043]) >> 16;
											var26 = (Class104_Sub18_Sub17_Sub4.anIntArray1678[var10.anInt1043]
													* var10.anInt1021) >> 16;
											if (null != var76)
												if (!var10.isHeaderless)
													var76.method824(0, var10.anInt1019, 0, var10.anInt1043, 0, var25,
															var26);
												else {
													var76.method812();
													if (var10.aBool1023)
														var76.method828(0, var10.anInt1019, var10.anInt1012,
																var10.anInt1043, var10.anInt1016,
																var24 + var25 + var10.anInt993, var10.anInt993 + var26,
																var10.anInt1021);
													else
														var76.method824(0, var10.anInt1019, var10.anInt1012,
																var10.anInt1043, var10.anInt1016,
																var24 + var25 + var10.anInt993, var26 + var10.anInt993);
												}

											Class104_Sub18_Sub17_Sub4.method916();
										} else {
											if (var10.anInt980 == 7) {
												var79 = var10.method531();
												if (null == var79) {
													if (Widget.aBool1065)
														Class79.setflags(var10);
													continue;
												}

												var22 = 0;

												for (var23 = 0; var23 < var10.anInt988; ++var23)
													for (var24 = 0; var24 < var10.anInt987; ++var24) {
														if (var10.anIntArray1080[var22] > 0) {
															var78 = Class27.method137(var10.anIntArray1080[var22] - 1);
															String var56;
															if ((var78.anInt1431 != 1)
																	&& (var10.anIntArray1081[var22] == 1))
																var56 = Class70.method326(16748608) + var78.aString1444
																		+ "</col>";
															else
																var56 = Class70.method326(16748608) + var78.aString1444
																		+ "</col>" + " " + '\u0078' + Nodee
																				.method518(var10.anIntArray1081[var22]);

															var27 = (var24 * (115 + var10.anInt1038)) + var12;
															var28 = ((var10.anInt1032 + 12) * var23) + var13;
															if (var10.anInt1059 == 0)
																var79.drawstr(var56, var27, var28, var10.anInt1017,
																		var10.aBool1030 ? 0 : -1);
															else if (var10.anInt1059 == 1)
																var79.method882(var56, (var10.anInt987 / 2) + var27,
																		var28, var10.anInt1017,
																		var10.aBool1030 ? 0 : -1);
															else
																var79.method881(var56, (var10.anInt987 + var27) - 1,
																		var28, var10.anInt1017,
																		var10.aBool1030 ? 0 : -1);
														}

														++var22;
													}
											}

											if ((var10.anInt980 == 8) && (Class20.aClass104_Sub12_207 == var10)
													&& (client.anInt1864 == client.anInt1940)) {
												var21 = 0;
												var22 = 0;
												final Class104_Sub18_Sub17_Sub2_Sub1 var75 = Class29.aClass104_Sub18_Sub17_Sub2_Sub1_277;
												var51 = var10.aString1025;

												for (var51 = Class104_Sub23.method621(var51, var10); var51
														.length() > 0; var22 += 1 + var75.anInt1600) {
													var26 = var51.indexOf("<br>");
													if (var26 != -1) {
														var54 = var51.substring(0, var26);
														var51 = var51.substring(var26 + 4);
													} else {
														var54 = var51;
														var51 = "";
													}

													var27 = var75.method883(var54);
													if (var27 > var21)
														var21 = var27;
												}

												var21 += 6;
												var22 += 7;
												var26 = (var10.anInt987 + var12) - 5 - var21;
												var27 = 5 + var10.anInt988 + var13;
												if (var26 < (var12 + 5))
													var26 = var12 + 5;

												if ((var26 + var21) > var4)
													var26 = var4 - var21;

												if ((var22 + var27) > var5)
													var27 = var5 - var22;

												Class104_Sub18_Sub17.method805(var26, var27, var21, var22, 16777120);
												Class104_Sub18_Sub17.method806(var26, var27, var21, var22, 0);
												var51 = var10.aString1025;
												var28 = 2 + var75.anInt1600 + var27;

												for (var51 = Class104_Sub23.method621(var51, var10); var51
														.length() > 0; var28 += 1 + var75.anInt1600) {
													var59 = var51.indexOf("<br>");
													if (var59 != -1) {
														var54 = var51.substring(0, var59);
														var51 = var51.substring(var59 + 4);
													} else {
														var54 = var51;
														var51 = "";
													}

													var75.drawstr(var54, var26 + 3, var28, 0, -1);
												}
											}

											if (var10.anInt980 == 9)
												if (var10.anInt999 == 1)
													Class104_Sub18_Sub17.method803(var12, var13, var10.anInt987 + var12,
															var10.anInt988 + var13, var10.anInt1017);
												else {
													var21 = var10.anInt987 >= 0 ? var10.anInt987 : -var10.anInt987;
													var22 = var10.anInt988 >= 0 ? var10.anInt988 : -var10.anInt988;
													var23 = var21;
													if (var21 < var22)
														var23 = var22;

													if (var23 != 0) {
														var24 = (var10.anInt987 << 16) / var23;
														var25 = (var10.anInt988 << 16) / var23;
														if (var25 <= var24)
															var24 = -var24;
														else
															var25 = -var25;

														var26 = (var25 * var10.anInt999) >> 17;
														var27 = (1 + (var10.anInt999 * var25)) >> 17;
														var28 = (var24 * var10.anInt999) >> 17;
														var59 = (1 + (var10.anInt999 * var24)) >> 17;
														var30 = var12 + var26;
														var31 = var12 - var27;
														var32 = (var12 + var10.anInt987) - var27;
														var65 = var26 + var12 + var10.anInt987;
														var66 = var13 + var28;
														var38 = var13 - var59;
														var40 = (var13 + var10.anInt988) - var59;
														var71 = var13 + var10.anInt988 + var28;
														Class104_Sub18_Sub17_Sub4.method920(var30, var31, var32);
														Class104_Sub18_Sub17_Sub4.method922(var66, var38, var40, var30,
																var31, var32, var10.anInt1017);
														Class104_Sub18_Sub17_Sub4.method920(var30, var32, var65);
														Class104_Sub18_Sub17_Sub4.method922(var66, var40, var71, var30,
																var32, var65, var10.anInt1017);
													}
												}
										}
									}
								}
						}
					}
				}
			}
		}

	}

	static void redraw() {
		for (Nodee var0 = (Nodee) client.aClass58_1795
				.method245(); null != var0; var0 = (Nodee) client.aClass58_1795.method243()) {
			final int var1 = var0.rsfaceID;
			if (Class104_Sub7.loaded(var1)) {
				boolean var2 = true;
				final Widget[] var3 = Class22.widgets[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4)
					if (var3[var4] != null) {
						var2 = var3[var4].isHeaderless;
						break;
					}

				if (!var2) {
					var4 = (int) var0.nodeId;
					final Widget var5 = Class47.method210(var4);
					if (var5 != null)
						Class79.setflags(var5);
				}
			}
		}

	}

	static final void method302(final int var0, final int var1, final int var2, final int var3,
			final Class104_Sub18_Sub17_Sub1 var4) {
		if (null != var4) {
			final int var5 = (client.anInt1866 + client.anInt1862) & 2047;
			final int var6 = (var2 * var2) + (var3 * var3);
			if (var6 <= 6400) {
				int var7 = Class104_Sub18_Sub17_Sub4.anIntArray1680[var5];
				int var8 = Class104_Sub18_Sub17_Sub4.anIntArray1678[var5];
				var7 = (var7 * 256) / (client.anInt1921 + 256);
				var8 = (var8 * 256) / (256 + client.anInt1921);
				final int var9 = ((var8 * var2) + (var7 * var3)) >> 16;
				final int var10 = ((var3 * var8) - (var7 * var2)) >> 16;
				if (var6 > 2500)
					var4.method852(Class49.aClass104_Sub18_Sub17_Sub3_417,
							4 + ((var9 + var0 + 94) - (var4.anInt1590 / 2)),
							(var1 + 83) - var10 - (var4.anInt1591 / 2) - 4);
				else
					var4.method841(4 + ((var0 + 94 + var9) - (var4.anInt1590 / 2)),
							(83 + var1) - var10 - (var4.anInt1591 / 2) - 4);

			}
		}
	}
}
