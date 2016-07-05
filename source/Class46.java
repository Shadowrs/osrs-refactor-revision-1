import java.util.Date;

public class Class46 {
	static int anInt403;
	static int anInt399 = 0;
	static int anInt398 = 0;
	static int anInt401 = 0;
	static byte[][] aByteArrayArray400 = new byte[1000][];
	static byte[][] aByteArrayArray402 = new byte[250][];
	static byte[][] aByteArrayArray397 = new byte[50][];

	static synchronized byte[] method202(final int var0, final int var1) {
		byte[] var2;
		if ((var0 == 100) && (anInt399 > 0)) {
			var2 = aByteArrayArray400[--anInt399];
			aByteArrayArray400[anInt399] = null;
			return var2;
		} else if ((var0 == 5000) && (anInt398 > 0)) {
			var2 = aByteArrayArray402[--anInt398];
			aByteArrayArray402[anInt398] = null;
			return var2;
		} else if ((var0 == 30000) && (anInt401 > 0)) {
			var2 = aByteArrayArray397[--anInt401];
			aByteArrayArray397[anInt401] = null;
			return var2;
		} else
			return new byte[var0];
	}

	static void doCS(final CS var0) {
		final Object[] var1 = var0.params;
		final int var2 = ((Integer) var1[0]).intValue();
		CS2 cachedscript = Class42.getCS(var2);
		if (null != cachedscript) {
			int var4 = 0;
			int var5 = 0;
			int var6 = -1;
			int[] var7 = cachedscript.opcodeHeaders;
			int[] var8 = cachedscript.numberValuesToUse;
			final byte var9 = -1;
			Class90.totalActs = 0;

			int var12;
			try {
				Class90.cachedCsIntToUse = new int[cachedscript.anInt1279];
				int var10 = 0;
				Class90.cachedCsStrToUse = new String[cachedscript.anInt1281];
				int var11 = 0;

				int var13;
				String var14;
				for (var12 = 1; var12 < var1.length; ++var12)
					if (var1[var12] instanceof Integer) {
						var13 = ((Integer) var1[var12]).intValue();
						if (var13 == -2147483647)
							var13 = var0.anInt937;

						if (var13 == -2147483646)
							var13 = var0.anInt935;

						if (var13 == -2147483645)
							var13 = var0.ownerRSFaceHash != null ? var0.ownerRSFaceHash.anInt978 : -1;

						if (var13 == -2147483644)
							var13 = var0.anInt939;

						if (var13 == -2147483643)
							var13 = var0.ownerRSFaceHash != null ? var0.ownerRSFaceHash.anInt1018 : -1;

						if (var13 == -2147483642)
							var13 = null != var0.aClass104_Sub12_940 ? var0.aClass104_Sub12_940.anInt978 : -1;

						if (var13 == -2147483641)
							var13 = var0.aClass104_Sub12_940 != null ? var0.aClass104_Sub12_940.anInt1018 : -1;

						if (var13 == -2147483640)
							var13 = var0.anInt941;

						if (var13 == -2147483639)
							var13 = var0.anInt942;

						Class90.cachedCsIntToUse[var10++] = var13;
					} else if (var1[var12] instanceof String) {
						var14 = (String) var1[var12];
						if (var14.equals("event_opbase"))
							var14 = var0.aString943;

						Class90.cachedCsStrToUse[var11++] = var14;
					}

				var12 = 0;

				label2280: while (true) {
					++var12;
					if (var12 > 200000)
						throw new RuntimeException();

					++var6;
					int var44 = var7[var6];
					int var15;
					int var17;
					int var18;
					int var19;
					int var20;
					int var24;
					int[] var47;
					byte var57;
					String var80;
					if (var44 < 100) {
						if (var44 == 0) {
							Class90.anIntArray706[var4++] = var8[var6];
							continue;
						}

						if (var44 == 1) {
							var13 = var8[var6];
							Class90.anIntArray706[var4++] = Class71.anIntArray576[var13];
							continue;
						}

						if (var44 == 2) {
							var13 = var8[var6];
							--var4;
							Class71.anIntArray576[var13] = Class90.anIntArray706[var4];
							continue;
						}

						if (var44 == 3) {
							Class90.aStringArray712[var5++] = cachedscript.aStringArray1280[var6];
							continue;
						}

						if (var44 == 6) {
							var6 += var8[var6];
							continue;
						}

						if (var44 == 7) {
							var4 -= 2;
							if (Class90.anIntArray706[var4] != Class90.anIntArray706[1 + var4])
								var6 += var8[var6];
							continue;
						}

						if (var44 == 8) {
							var4 -= 2;
							if (Class90.anIntArray706[1 + var4] == Class90.anIntArray706[var4])
								var6 += var8[var6];
							continue;
						}

						if (var44 == 9) {
							var4 -= 2;
							if (Class90.anIntArray706[var4] < Class90.anIntArray706[var4 + 1])
								var6 += var8[var6];
							continue;
						}

						if (var44 == 10) {
							var4 -= 2;
							if (Class90.anIntArray706[var4] > Class90.anIntArray706[1 + var4])
								var6 += var8[var6];
							continue;
						}

						if (var44 == 21) {
							if (Class90.totalActs == 0)
								return;

							final Class100 var45 = Class90.aClass100Array714[--Class90.totalActs];
							cachedscript = var45.aClass104_Sub18_Sub4_796;
							var7 = cachedscript.opcodeHeaders;
							var8 = cachedscript.numberValuesToUse;
							var6 = var45.anInt795;
							Class90.cachedCsIntToUse = var45.anIntArray797;
							Class90.cachedCsStrToUse = var45.aStringArray798;
							continue;
						}

						if (var44 == 25) {
							var13 = var8[var6];
							Class90.anIntArray706[var4++] = Class52.method228(var13);
							continue;
						}

						if (var44 == 27) {
							var13 = var8[var6];
							--var4;
							var15 = Class90.anIntArray706[var4];
							final Class104_Sub18_Sub8 var72 = Class86.method396(var13);
							var17 = var72.anInt1388;
							var18 = var72.anInt1386;
							var19 = var72.anInt1390;
							var20 = Class71.anIntArray578[var19 - var18];
							if ((var15 < 0) || (var15 > var20))
								var15 = 0;

							var20 <<= var18;
							Class71.anIntArray576[var17] = (Class71.anIntArray576[var17] & ~var20)
									| ((var15 << var18) & var20);
							continue;
						}

						if (var44 == 31) {
							var4 -= 2;
							if (Class90.anIntArray706[var4] <= Class90.anIntArray706[var4 + 1])
								var6 += var8[var6];
							continue;
						}

						if (var44 == 32) {
							var4 -= 2;
							if (Class90.anIntArray706[var4] >= Class90.anIntArray706[1 + var4])
								var6 += var8[var6];
							continue;
						}

						if (var44 == 33) {
							Class90.anIntArray706[var4++] = Class90.cachedCsIntToUse[var8[var6]];
							continue;
						}

						int var10001;
						if (var44 == 34) {
							var10001 = var8[var6];
							--var4;
							Class90.cachedCsIntToUse[var10001] = Class90.anIntArray706[var4];
							continue;
						}

						if (var44 == 35) {
							Class90.aStringArray712[var5++] = Class90.cachedCsStrToUse[var8[var6]];
							continue;
						}

						if (var44 == 36) {
							var10001 = var8[var6];
							--var5;
							Class90.cachedCsStrToUse[var10001] = Class90.aStringArray712[var5];
							continue;
						}

						if (var44 == 37) {
							var13 = var8[var6];
							var5 -= var13;
							var80 = Class104_Sub11.method525(Class90.aStringArray712, var5, var13);
							Class90.aStringArray712[var5++] = var80;
							continue;
						}

						if (var44 == 38) {
							--var4;
							continue;
						}

						if (var44 == 39) {
							--var5;
							continue;
						}

						if (var44 == 40) {
							var13 = var8[var6];
							final CS2 var93 = Class42.getCS(var13);
							var47 = new int[var93.anInt1279];
							final String[] var69 = new String[var93.anInt1281];

							for (var18 = 0; var18 < var93.anInt1282; ++var18)
								var47[var18] = Class90.anIntArray706[var18 + (var4 - var93.anInt1282)];

							for (var18 = 0; var18 < var93.anInt1283; ++var18)
								var69[var18] = Class90.aStringArray712[var18 + (var5 - var93.anInt1283)];

							var4 -= var93.anInt1282;
							var5 -= var93.anInt1283;
							final Class100 var81 = new Class100();
							var81.aClass104_Sub18_Sub4_796 = cachedscript;
							var81.anInt795 = var6;
							var81.anIntArray797 = Class90.cachedCsIntToUse;
							var81.aStringArray798 = Class90.cachedCsStrToUse;
							Class90.aClass100Array714[++Class90.totalActs - 1] = var81;
							cachedscript = var93;
							var7 = var93.opcodeHeaders;
							var8 = var93.numberValuesToUse;
							var6 = -1;
							Class90.cachedCsIntToUse = var47;
							Class90.cachedCsStrToUse = var69;
							continue;
						}

						if (var44 == 42) {
							Class90.anIntArray706[var4++] = client.anIntArray1981[var8[var6]];
							continue;
						}

						if (var44 == 43) {
							var10001 = var8[var6];
							--var4;
							client.anIntArray1981[var10001] = Class90.anIntArray706[var4];
							continue;
						}

						if (var44 == 44) {
							var13 = var8[var6] >> 16;
							var15 = var8[var6] & '\uffff';
							--var4;
							var24 = Class90.anIntArray706[var4];
							if ((var24 >= 0) && (var24 <= 5000)) {
								Class90.anIntArray711[var13] = var24;
								var57 = -1;
								if (var15 == 105)
									var57 = 0;

								var18 = 0;

								while (true) {
									if (var18 >= var24)
										continue label2280;

									Class90.anIntArrayArray710[var13][var18] = var57;
									++var18;
								}
							}

							throw new RuntimeException();
						}

						if (var44 == 45) {
							var13 = var8[var6];
							--var4;
							var15 = Class90.anIntArray706[var4];
							if ((var15 >= 0) && (var15 < Class90.anIntArray711[var13])) {
								Class90.anIntArray706[var4++] = Class90.anIntArrayArray710[var13][var15];
								continue;
							}

							throw new RuntimeException();
						}

						if (var44 == 46) {
							var13 = var8[var6];
							var4 -= 2;
							var15 = Class90.anIntArray706[var4];
							if ((var15 >= 0) && (var15 < Class90.anIntArray711[var13])) {
								Class90.anIntArrayArray710[var13][var15] = Class90.anIntArray706[1 + var4];
								continue;
							}

							throw new RuntimeException();
						}

						if (var44 == 47) {
							var14 = client.aStringArray1865[var8[var6]];
							if (null == var14)
								var14 = "null";

							Class90.aStringArray712[var5++] = var14;
							continue;
						}

						if (var44 == 48) {
							var10001 = var8[var6];
							--var5;
							client.aStringArray1865[var10001] = Class90.aStringArray712[var5];
							continue;
						}
					}

					boolean var49;
					if (var8[var6] == 1)
						var49 = true;
					else
						var49 = false;

					Widget var21;
					Widget var22;
					Widget var23;
					if (var44 < 1000) {
						if (var44 == 100) {
							var4 -= 3;
							var15 = Class90.anIntArray706[var4];
							var24 = Class90.anIntArray706[var4 + 1];
							var17 = Class90.anIntArray706[2 + var4];
							if (var24 == 0)
								throw new RuntimeException();

							var23 = Class47.method210(var15);
							if (null == var23.aClass104_Sub12Array1020)
								var23.aClass104_Sub12Array1020 = new Widget[1 + var17];

							if (var23.aClass104_Sub12Array1020.length <= var17) {
								final Widget[] var76 = new Widget[1 + var17];

								for (var20 = 0; var20 < var23.aClass104_Sub12Array1020.length; ++var20)
									var76[var20] = var23.aClass104_Sub12Array1020[var20];

								var23.aClass104_Sub12Array1020 = var76;
							}

							if ((var17 > 0) && (var23.aClass104_Sub12Array1020[var17 - 1] == null))
								throw new RuntimeException("" + (var17 - 1));

							final Widget var77 = new Widget();
							var77.anInt980 = var24;
							var77.anInt1091 = var77.anInt978 = var23.anInt978;
							var77.anInt1018 = var17;
							var77.isHeaderless = true;
							var23.aClass104_Sub12Array1020[var17] = var77;
							if (var49)
								Class27.aClass104_Sub12_262 = var77;
							else
								Class84.aClass104_Sub12_660 = var77;

							Class79.setflags(var23);
							continue;
						}

						if (var44 == 101) {
							var21 = var49 ? Class27.aClass104_Sub12_262 : Class84.aClass104_Sub12_660;
							final Widget var71 = Class47.method210(var21.anInt978);
							var71.aClass104_Sub12Array1020[var21.anInt1018] = null;
							Class79.setflags(var71);
							continue;
						}

						if (var44 == 102) {
							--var4;
							var21 = Class47.method210(Class90.anIntArray706[var4]);
							var21.aClass104_Sub12Array1020 = null;
							Class79.setflags(var21);
							continue;
						}

						if (var44 == 200) {
							var4 -= 2;
							var15 = Class90.anIntArray706[var4];
							var24 = Class90.anIntArray706[1 + var4];
							var22 = Class29.method141(var15, var24);
							if ((null != var22) && (var24 != -1)) {
								Class90.anIntArray706[var4++] = 1;
								if (var49)
									Class27.aClass104_Sub12_262 = var22;
								else
									Class84.aClass104_Sub12_660 = var22;
								continue;
							}

							Class90.anIntArray706[var4++] = 0;
							continue;
						}
					} else if (((var44 >= 1000) && (var44 < 1100)) || ((var44 >= 2000) && (var44 < 2100))) {
						if (var44 >= 2000) {
							var44 -= 1000;
							--var4;
							var21 = Class47.method210(Class90.anIntArray706[var4]);
						} else
							var21 = var49 ? Class27.aClass104_Sub12_262 : Class84.aClass104_Sub12_660;

						if (var44 == 1000) {
							var4 -= 2;
							var21.anInt983 = Class90.anIntArray706[var4];
							var21.anInt1005 = Class90.anIntArray706[var4 + 1];
							Class79.setflags(var21);
							continue;
						}

						if (var44 == 1001) {
							var4 -= 2;
							var21.anInt987 = Class90.anIntArray706[var4];
							var21.anInt988 = Class90.anIntArray706[var4 + 1];
							Class79.setflags(var21);
							continue;
						}

						if (var44 == 1003) {
							--var4;
							final boolean var90 = Class90.anIntArray706[var4] == 1;
							if (var90 != var21.aBool1075) {
								var21.aBool1075 = var90;
								Class79.setflags(var21);
							}
							continue;
						}
					} else {
						String var16;
						if (((var44 < 1100) || (var44 >= 1200)) && ((var44 < 2100) || (var44 >= 2200))) {
							if (((var44 >= 1200) && (var44 < 1300)) || ((var44 >= 2200) && (var44 < 2300))) {
								if (var44 >= 2000) {
									var44 -= 1000;
									--var4;
									var21 = Class47.method210(Class90.anIntArray706[var4]);
								} else
									var21 = var49 ? Class27.aClass104_Sub12_262 : Class84.aClass104_Sub12_660;

								Class79.setflags(var21);
								if (var44 == 1200) {
									var4 -= 2;
									var24 = Class90.anIntArray706[var4];
									var17 = Class90.anIntArray706[1 + var4];
									var21.anInt986 = var24;
									var21.anInt1083 = var17;
									final ItemDef var79 = Class27.forId(var24);
									var21.anInt1043 = var79.anInt1426;
									var21.anInt1019 = var79.anInt1427;
									var21.anInt1012 = var79.anInt1446;
									var21.anInt1016 = var79.anInt1454;
									var21.anInt993 = var79.anInt1430;
									var21.anInt1021 = var79.anInt1425;
									if (var21.anInt987 > 0)
										var21.anInt1021 = (var21.anInt1021 * 32) / var21.anInt987;
									continue;
								}

								if (var44 == 1201) {
									var21.anInt1010 = 2;
									--var4;
									var21.anInt1011 = Class90.anIntArray706[var4];
									continue;
								}

								if (var44 == 1202) {
									var21.anInt1010 = 3;
									var21.anInt1011 = Class81.activePlayer.aClass85_1770
											.method390();
									continue;
								}
							} else if (((var44 < 1300) || (var44 >= 1400)) && ((var44 < 2300) || (var44 >= 2400))) {
								int[] var54;
								if (((var44 >= 1400) && (var44 < 1500)) || ((var44 >= 2400) && (var44 < 2500))) {
									if (var44 >= 2000) {
										var44 -= 1000;
										--var4;
										var21 = Class47.method210(Class90.anIntArray706[var4]);
									} else
										var21 = var49 ? Class27.aClass104_Sub12_262 : Class84.aClass104_Sub12_660;

									--var5;
									var16 = Class90.aStringArray712[var5];
									var54 = null;
									if ((var16.length() > 0) && (var16.charAt(var16.length() - 1) == 89)) {
										--var4;
										var18 = Class90.anIntArray706[var4];
										if (var18 > 0)
											for (var54 = new int[var18]; var18-- > 0; var54[var18] = Class90.anIntArray706[var4])
												--var4;

										var16 = var16.substring(0, var16.length() - 1);
									}

									Object[] var65 = new Object[var16.length() + 1];

									for (var19 = var65.length - 1; var19 >= 1; --var19)
										if (var16.charAt(var19 - 1) == 115) {
											--var5;
											var65[var19] = Class90.aStringArray712[var5];
										} else {
											--var4;
											var65[var19] = new Integer(Class90.anIntArray706[var4]);
										}

									--var4;
									var19 = Class90.anIntArray706[var4];
									if (var19 != -1)
										var65[0] = new Integer(var19);
									else
										var65 = null;

									if (var44 == 1400)
										var21.anObjectArray1047 = var65;

									if (var44 == 1401)
										var21.anObjectArray1050 = var65;

									if (var44 == 1402)
										var21.anObjectArray1046 = var65;

									if (var44 == 1403)
										var21.anObjectArray1051 = var65;

									if (var44 == 1404)
										var21.anObjectArray1033 = var65;

									if (var44 == 1405)
										var21.anObjectArray976 = var65;

									if (var44 == 1406)
										var21.anObjectArray1031 = var65;

									if (var44 == 1407) {
										var21.anObjectArray1034 = var65;
										var21.anIntArray1084 = var54;
									}

									if (var44 == 1408)
										var21.anObjectArray1064 = var65;

									if (var44 == 1409)
										var21.anObjectArray1042 = var65;

									if (var44 == 1410)
										var21.anObjectArray1055 = var65;

									if (var44 == 1411)
										var21.anObjectArray1048 = var65;

									if (var44 == 1412)
										var21.anObjectArray1052 = var65;

									if (var44 == 1414) {
										var21.anObjectArray1060 = var65;
										var21.anIntArray1061 = var54;
									}

									if (var44 == 1415) {
										var21.anObjectArray1062 = var65;
										var21.anIntArray1063 = var54;
									}

									if (var44 == 1416)
										var21.anObjectArray1056 = var65;

									if (var44 == 1417)
										var21.anObjectArray1026 = var65;

									if (var44 == 1418)
										var21.anObjectArray1067 = var65;

									if (var44 == 1419)
										var21.anObjectArray1068 = var65;

									if (var44 == 1420)
										var21.anObjectArray1072 = var65;

									if (var44 == 1421)
										var21.anObjectArray1070 = var65;

									if (var44 == 1422)
										var21.anObjectArray972 = var65;

									if (var44 == 1423)
										var21.anObjectArray1014 = var65;

									if (var44 == 1424)
										var21.anObjectArray1073 = var65;

									var21.aBool1008 = true;
									continue;
								}

								if (var44 < 1600) {
									var21 = var49 ? Class27.aClass104_Sub12_262 : Class84.aClass104_Sub12_660;
									if (var44 == 1500) {
										Class90.anIntArray706[var4++] = var21.anInt983;
										continue;
									}

									if (var44 == 1501) {
										Class90.anIntArray706[var4++] = var21.anInt1005;
										continue;
									}

									if (var44 == 1502) {
										Class90.anIntArray706[var4++] = var21.anInt987;
										continue;
									}

									if (var44 == 1503) {
										Class90.anIntArray706[var4++] = var21.anInt988;
										continue;
									}

									if (var44 == 1504) {
										Class90.anIntArray706[var4++] = var21.aBool1075 ? 1 : 0;
										continue;
									}

									if (var44 == 1505) {
										Class90.anIntArray706[var4++] = var21.anInt1091;
										continue;
									}
								} else if (var44 < 1700) {
									var21 = var49 ? Class27.aClass104_Sub12_262 : Class84.aClass104_Sub12_660;
									if (var44 == 1600) {
										Class90.anIntArray706[var4++] = var21.anInt991;
										continue;
									}

									if (var44 == 1601) {
										Class90.anIntArray706[var4++] = var21.anInt992;
										continue;
									}

									if (var44 == 1602) {
										Class90.aStringArray712[var5++] = var21.aString1025;
										continue;
									}

									if (var44 == 1603) {
										Class90.anIntArray706[var4++] = var21.anInt1079;
										continue;
									}

									if (var44 == 1604) {
										Class90.anIntArray706[var4++] = var21.anInt994;
										continue;
									}

									if (var44 == 1605) {
										Class90.anIntArray706[var4++] = var21.anInt1021;
										continue;
									}

									if (var44 == 1606) {
										Class90.anIntArray706[var4++] = var21.anInt1043;
										continue;
									}

									if (var44 == 1607) {
										Class90.anIntArray706[var4++] = var21.anInt1012;
										continue;
									}

									if (var44 == 1608) {
										Class90.anIntArray706[var4++] = var21.anInt1019;
										continue;
									}
								} else if (var44 < 1800) {
									var21 = var49 ? Class27.aClass104_Sub12_262 : Class84.aClass104_Sub12_660;
									if (var44 == 1700) {
										Class90.anIntArray706[var4++] = var21.anInt986;
										continue;
									}

									if (var44 == 1701) {
										if (var21.anInt986 != -1)
											Class90.anIntArray706[var4++] = var21.anInt1083;
										else
											Class90.anIntArray706[var4++] = 0;
										continue;
									}

									if (var44 == 1702) {
										Class90.anIntArray706[var4++] = var21.anInt1018;
										continue;
									}
								} else if (var44 < 1900) {
									var21 = var49 ? Class27.aClass104_Sub12_262 : Class84.aClass104_Sub12_660;
									if (var44 == 1800) {
										Class90.anIntArray706[var4++] = Class101
												.method464(Class104_Sub3.method485(var21));
										continue;
									}

									if (var44 == 1801) {
										--var4;
										var24 = Class90.anIntArray706[var4];
										--var24;
										if ((var21.aStringArray1039 != null) && (var24 < var21.aStringArray1039.length)
												&& (null != var21.aStringArray1039[var24])) {
											Class90.aStringArray712[var5++] = var21.aStringArray1039[var24];
											continue;
										}

										Class90.aStringArray712[var5++] = "";
										continue;
									}

									if (var44 == 1802) {
										if (var21.aString990 == null)
											Class90.aStringArray712[var5++] = "";
										else
											Class90.aStringArray712[var5++] = var21.aString990;
										continue;
									}
								} else if (var44 < 2600) {
									--var4;
									var21 = Class47.method210(Class90.anIntArray706[var4]);
									if (var44 == 2500) {
										Class90.anIntArray706[var4++] = var21.anInt983;
										continue;
									}

									if (var44 == 2501) {
										Class90.anIntArray706[var4++] = var21.anInt1005;
										continue;
									}

									if (var44 == 2502) {
										Class90.anIntArray706[var4++] = var21.anInt987;
										continue;
									}

									if (var44 == 2503) {
										Class90.anIntArray706[var4++] = var21.anInt988;
										continue;
									}

									if (var44 == 2504) {
										Class90.anIntArray706[var4++] = var21.aBool1075 ? 1 : 0;
										continue;
									}

									if (var44 == 2505) {
										Class90.anIntArray706[var4++] = var21.anInt1091;
										continue;
									}
								} else if (var44 < 2700) {
									--var4;
									var21 = Class47.method210(Class90.anIntArray706[var4]);
									if (var44 == 2600) {
										Class90.anIntArray706[var4++] = var21.anInt991;
										continue;
									}

									if (var44 == 2601) {
										Class90.anIntArray706[var4++] = var21.anInt992;
										continue;
									}

									if (var44 == 2602) {
										Class90.aStringArray712[var5++] = var21.aString1025;
										continue;
									}

									if (var44 == 2603) {
										Class90.anIntArray706[var4++] = var21.anInt1079;
										continue;
									}

									if (var44 == 2604) {
										Class90.anIntArray706[var4++] = var21.anInt994;
										continue;
									}

									if (var44 == 2605) {
										Class90.anIntArray706[var4++] = var21.anInt1021;
										continue;
									}

									if (var44 == 2606) {
										Class90.anIntArray706[var4++] = var21.anInt1043;
										continue;
									}

									if (var44 == 2607) {
										Class90.anIntArray706[var4++] = var21.anInt1012;
										continue;
									}

									if (var44 == 2608) {
										Class90.anIntArray706[var4++] = var21.anInt1019;
										continue;
									}
								} else if (var44 < 2800) {
									if (var44 == 2700) {
										--var4;
										var21 = Class47.method210(Class90.anIntArray706[var4]);
										Class90.anIntArray706[var4++] = var21.anInt986;
										continue;
									}

									if (var44 == 2701) {
										--var4;
										var21 = Class47.method210(Class90.anIntArray706[var4]);
										if (var21.anInt986 != -1)
											Class90.anIntArray706[var4++] = var21.anInt1083;
										else
											Class90.anIntArray706[var4++] = 0;
										continue;
									}

									if (var44 == 2702) {
										--var4;
										var15 = Class90.anIntArray706[var4];
										final Nodee var46 = (Nodee) client.aClass58_1795
												.method241(var15);
										if (null != var46)
											Class90.anIntArray706[var4++] = 1;
										else
											Class90.anIntArray706[var4++] = 0;
										continue;
									}
								} else if (var44 < 2900) {
									--var4;
									var21 = Class47.method210(Class90.anIntArray706[var4]);
									if (var44 == 2800) {
										Class90.anIntArray706[var4++] = Class101
												.method464(Class104_Sub3.method485(var21));
										continue;
									}

									if (var44 == 2801) {
										--var4;
										var24 = Class90.anIntArray706[var4];
										--var24;
										if ((null != var21.aStringArray1039) && (var24 < var21.aStringArray1039.length)
												&& (var21.aStringArray1039[var24] != null)) {
											Class90.aStringArray712[var5++] = var21.aStringArray1039[var24];
											continue;
										}

										Class90.aStringArray712[var5++] = "";
										continue;
									}

									if (var44 == 2802) {
										if (null == var21.aString990)
											Class90.aStringArray712[var5++] = "";
										else
											Class90.aStringArray712[var5++] = var21.aString990;
										continue;
									}
								} else if (var44 < 3200) {
									if (var44 == 3100) {
										--var5;
										var80 = Class90.aStringArray712[var5];
										Class15.chat(0, "", var80);
										continue;
									}

									if (var44 == 3101) {
										var4 -= 2;
										Class75.transform(Class81.activePlayer,
												Class90.anIntArray706[var4], Class90.anIntArray706[var4 + 1]);
										continue;
									}

									if (var44 == 3103) {
										client.secureBuf.putOpcode(129);

										for (Nodee var83 = (Nodee) client.aClass58_1795
												.method245(); null != var83; var83 = (Nodee) client.aClass58_1795
														.method243())
											if ((var83.anInt956 == 0) || (var83.anInt956 == 3))
												Class13.method56(var83, true);

										if (client.aClass104_Sub12_1951 != null) {
											Class79.setflags(client.aClass104_Sub12_1951);
											client.aClass104_Sub12_1951 = null;
										}
										continue;
									}

									if (var44 == 3104) {
										--var5;
										var80 = Class90.aStringArray712[var5];
										var24 = 0;
										if (Class72.method334(var80)) {
											var17 = Class66.method299(var80, 10, true);
											var24 = var17;
										}

										client.secureBuf.putOpcode(27);
										client.secureBuf.writeInt(var24);
										continue;
									}

									if (var44 == 3105) {
										--var5;
										var80 = Class90.aStringArray712[var5];
										client.secureBuf.putOpcode(223);
										client.secureBuf.writebyte(var80.length() + 1);
										client.secureBuf.writeCompactedString(var80);
										continue;
									}

									if (var44 == 3106) {
										--var5;
										var80 = Class90.aStringArray712[var5];
										client.secureBuf.putOpcode(127);
										client.secureBuf.writebyte(var80.length() + 1);
										client.secureBuf.writeCompactedString(var80);
										continue;
									}

									if (var44 == 3107) {
										--var4;
										var15 = Class90.anIntArray706[var4];
										--var5;
										var16 = Class90.aStringArray712[var5];
										Class15.method59(var15, var16);
										continue;
									}

									if (var44 == 3108) {
										var4 -= 3;
										var15 = Class90.anIntArray706[var4];
										var24 = Class90.anIntArray706[1 + var4];
										var17 = Class90.anIntArray706[2 + var4];
										var23 = Class47.method210(var17);
										Class61.method279(var23, var15, var24);
										continue;
									}

									if (var44 == 3109) {
										var4 -= 2;
										var15 = Class90.anIntArray706[var4];
										var24 = Class90.anIntArray706[var4 + 1];
										var22 = var49 ? Class27.aClass104_Sub12_262 : Class84.aClass104_Sub12_660;
										Class61.method279(var22, var15, var24);
										continue;
									}
								} else if (var44 < 3300) {
									if (var44 == 3200) {
										var4 -= 3;
										var15 = Class90.anIntArray706[var4];
										var24 = Class90.anIntArray706[var4 + 1];
										var17 = Class90.anIntArray706[var4 + 2];
										if ((client.anInt1827 != 0) && (var24 != 0) && (client.anInt2028 < 50)) {
											client.anIntArray2029[client.anInt2028] = var15;
											client.anIntArray1875[client.anInt2028] = var24;
											client.anIntArray2031[client.anInt2028] = var17;
											client.aClass82Array2033[client.anInt2028] = null;
											client.anIntArray2032[client.anInt2028] = 0;
											++client.anInt2028;
										}
										continue;
									}

									if (var44 == 3201) {
										--var4;
										Class67.method317(Class90.anIntArray706[var4]);
										continue;
									}

									if (var44 == 3202) {
										var4 -= 2;
										var15 = Class90.anIntArray706[var4];
										if ((client.anInt2022 != 0) && (var15 != -1)) {
											Class87.method400(Class106.aClass61_Sub1_827, var15, 0, client.anInt2022,
													false);
											client.aBool2041 = true;
										}
										continue;
									}
								} else if (var44 < 3400) {
									if (var44 == 3300) {
										Class90.anIntArray706[var4++] = client.currentTime;
										continue;
									}

									Class104_Sub2 var26;
									if (var44 == 3301) {
										var4 -= 2;
										var15 = Class90.anIntArray706[var4];
										var24 = Class90.anIntArray706[var4 + 1];
										var54 = Class90.anIntArray706;
										var18 = var4++;
										var26 = (Class104_Sub2) Class104_Sub2.aClass58_857.method241(var15);
										if (var26 == null)
											var19 = -1;
										else if ((var24 >= 0) && (var24 < var26.anIntArray856.length))
											var19 = var26.anIntArray856[var24];
										else
											var19 = -1;

										var54[var18] = var19;
										continue;
									}

									if (var44 == 3302) {
										var4 -= 2;
										var15 = Class90.anIntArray706[var4];
										var24 = Class90.anIntArray706[var4 + 1];
										Class90.anIntArray706[var4++] = Class88.method403(var15, var24);
										continue;
									}

									if (var44 == 3303) {
										var4 -= 2;
										var15 = Class90.anIntArray706[var4];
										var24 = Class90.anIntArray706[1 + var4];
										Class90.anIntArray706[var4++] = Applet_Sub1.method949(var15, var24);
										continue;
									}

									if (var44 == 3304) {
										--var4;
										var15 = Class90.anIntArray706[var4];
										var47 = Class90.anIntArray706;
										var17 = var4++;
										Class104_Sub18_Sub14 var25 = (Class104_Sub18_Sub14) Class104_Sub18_Sub14.aClass56_1462
												.method236(var15);
										Class104_Sub18_Sub14 var56;
										if (null != var25)
											var56 = var25;
										else {
											final byte[] var67 = Class104_Sub18_Sub14.aClass61_1463.decompress(5, var15);
											var25 = new Class104_Sub18_Sub14();
											if (null != var67)
												var25.method784(new RSBuf(var67));

											Class104_Sub18_Sub14.aClass56_1462.method238(var25, var15);
											var56 = var25;
										}

										var47[var17] = var56.anInt1464;
										continue;
									}

									if (var44 == 3305) {
										--var4;
										var15 = Class90.anIntArray706[var4];
										Class90.anIntArray706[var4++] = client.anIntArray1925[var15];
										continue;
									}

									if (var44 == 3306) {
										--var4;
										var15 = Class90.anIntArray706[var4];
										Class90.anIntArray706[var4++] = client.anIntArray1833[var15];
										continue;
									}

									if (var44 == 3307) {
										--var4;
										var15 = Class90.anIntArray706[var4];
										Class90.anIntArray706[var4++] = client.anIntArray1927[var15];
										continue;
									}

									if (var44 == 3308) {
										var15 = Class12.myplayerHeight;
										var24 = Class53.anInt436
												+ (Class81.activePlayer.anInt1695 >> 7);
										var17 = (Class81.activePlayer.anInt1694 >> 7)
												+ Class20.anInt206;
										Class90.anIntArray706[var4++] = var17 + (var24 << 14) + (var15 << 28);
										continue;
									}

									if (var44 == 3309) {
										--var4;
										var15 = Class90.anIntArray706[var4];
										Class90.anIntArray706[var4++] = (var15 >> 14) & 16383;
										continue;
									}

									if (var44 == 3310) {
										--var4;
										var15 = Class90.anIntArray706[var4];
										Class90.anIntArray706[var4++] = var15 >> 28;
										continue;
									}

									if (var44 == 3311) {
										--var4;
										var15 = Class90.anIntArray706[var4];
										Class90.anIntArray706[var4++] = var15 & 16383;
										continue;
									}

									if (var44 == 3312) {
										Class90.anIntArray706[var4++] = client.aBool1852 ? 1 : 0;
										continue;
									}

									if (var44 == 3313) {
										var4 -= 2;
										var15 = '\u8000' + Class90.anIntArray706[var4];
										var24 = Class90.anIntArray706[var4 + 1];
										var54 = Class90.anIntArray706;
										var18 = var4++;
										var26 = (Class104_Sub2) Class104_Sub2.aClass58_857.method241(var15);
										if (var26 == null)
											var19 = -1;
										else if ((var24 >= 0) && (var24 < var26.anIntArray856.length))
											var19 = var26.anIntArray856[var24];
										else
											var19 = -1;

										var54[var18] = var19;
										continue;
									}

									if (var44 == 3314) {
										var4 -= 2;
										var15 = Class90.anIntArray706[var4] + '\u8000';
										var24 = Class90.anIntArray706[1 + var4];
										Class90.anIntArray706[var4++] = Class88.method403(var15, var24);
										continue;
									}

									if (var44 == 3315) {
										var4 -= 2;
										var15 = '\u8000' + Class90.anIntArray706[var4];
										var24 = Class90.anIntArray706[1 + var4];
										Class90.anIntArray706[var4++] = Applet_Sub1.method949(var15, var24);
										continue;
									}

									if (var44 == 3316) {
										if (client.anInt1915 >= 2)
											Class90.anIntArray706[var4++] = client.anInt1915;
										else
											Class90.anIntArray706[var4++] = 0;
										continue;
									}

									if (var44 == 3317) {
										Class90.anIntArray706[var4++] = client.anInt1879;
										continue;
									}

									if (var44 == 3318) {
										Class90.anIntArray706[var4++] = client.anInt1939;
										continue;
									}

									if (var44 == 3321) {
										Class90.anIntArray706[var4++] = client.anInt1944;
										continue;
									}

									if (var44 == 3322) {
										Class90.anIntArray706[var4++] = client.anInt1953;
										continue;
									}

									if (var44 == 3323) {
										if (client.aBool1955)
											Class90.anIntArray706[var4++] = 1;
										else
											Class90.anIntArray706[var4++] = 0;
										continue;
									}
								} else if (var44 < 3500) {
									if (var44 == 3400) {
										var4 -= 2;
										var15 = Class90.anIntArray706[var4];
										var24 = Class90.anIntArray706[var4 + 1];
										Class104_Sub18_Sub10 var55 = Class104_Sub16.method552(var15);
										if (var55.aChar1405 != 115)
											;

										for (var18 = 0; var18 < var55.anInt1408; ++var18)
											if (var55.anIntArray1402[var18] == var24) {
												Class90.aStringArray712[var5++] = var55.aStringArray1411[var18];
												var55 = null;
												break;
											}

										if (null != var55)
											Class90.aStringArray712[var5++] = var55.aString1409;
										continue;
									}

									if (var44 == 3408) {
										var4 -= 4;
										var15 = Class90.anIntArray706[var4];
										var24 = Class90.anIntArray706[var4 + 1];
										var17 = Class90.anIntArray706[2 + var4];
										var18 = Class90.anIntArray706[var4 + 3];
										Class104_Sub18_Sub10 var64 = Class104_Sub16.method552(var17);
										if ((var15 == var64.anInt1404) && (var24 == var64.aChar1405)) {
											for (var20 = 0; var20 < var64.anInt1408; ++var20)
												if (var64.anIntArray1402[var20] == var18) {
													if (var24 == 115)
														Class90.aStringArray712[var5++] = var64.aStringArray1411[var20];
													else
														Class90.anIntArray706[var4++] = var64.anIntArray1410[var20];

													var64 = null;
													break;
												}

											if (null != var64)
												if (var24 == 115)
													Class90.aStringArray712[var5++] = var64.aString1409;
												else
													Class90.anIntArray706[var4++] = var64.anInt1407;
											continue;
										}

										if (var24 == 115)
											Class90.aStringArray712[var5++] = "null";
										else
											Class90.anIntArray706[var4++] = 0;
										continue;
									}
								} else {
									int var28;
									String var68;
									String var70;
									if (var44 < 3700) {
										if (var44 == 3600) {
											if (client.anInt2024 == 0)
												Class90.anIntArray706[var4++] = -2;
											else if (client.anInt2024 == 1)
												Class90.anIntArray706[var4++] = -1;
											else
												Class90.anIntArray706[var4++] = client.anInt1935;
											continue;
										}

										if (var44 == 3601) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											if ((client.anInt2024 == 2) && (var15 < client.anInt1935)) {
												Class90.aStringArray712[var5++] = client.aClass86Array1972[var15].aString675;
												continue;
											}

											Class90.aStringArray712[var5++] = "";
											continue;
										}

										if (var44 == 3602) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											if ((client.anInt2024 == 2) && (var15 < client.anInt1935)) {
												Class90.anIntArray706[var4++] = client.aClass86Array1972[var15].anInt676;
												continue;
											}

											Class90.anIntArray706[var4++] = 0;
											continue;
										}

										if (var44 == 3603) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											if ((client.anInt2024 == 2) && (var15 < client.anInt1935)) {
												Class90.anIntArray706[var4++] = client.aClass86Array1972[var15].anInt677;
												continue;
											}

											Class90.anIntArray706[var4++] = 0;
											continue;
										}

										if (var44 == 3604) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											--var4;
											var24 = Class90.anIntArray706[var4];
											client.secureBuf.putOpcode(252);
											client.secureBuf
													.writebyte(GameBuf.lengthOf(var80) + 1);
											client.secureBuf.writeCompactedString(var80);
											client.secureBuf.writeByteA(var24);
											continue;
										}

										if (var44 == 3605) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											Class61.method280(var80);
											continue;
										}

										if (var44 == 3606) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											Class15.method61(var80);
											continue;
										}

										if (var44 == 3607) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											Class53.method235(var80, false);
											continue;
										}

										if (var44 == 3608) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											if (var80 == null)
												continue;

											var16 = Class33.method155(var80, Class2.aClass101_8);
											if (var16 == null)
												continue;

											var17 = 0;

											while (true) {
												if (var17 >= client.anInt2045)
													continue label2280;

												final Class78 var62 = client.aClass78Array2046[var17];
												var68 = var62.aString625;
												var70 = Class33.method155(var68, Class2.aClass101_8);
												boolean var27;
												if ((null != var80) && (null != var68)) {
													if (!var80.startsWith("#") && !var68.startsWith("#"))
														var27 = var16.equals(var70);
													else
														var27 = var80.equals(var68);
												} else
													var27 = false;

												if (var27) {
													--client.anInt2045;

													for (var28 = var17; var28 < client.anInt2045; ++var28)
														client.aClass78Array2046[var28] = client.aClass78Array2046[1
																+ var28];

													client.anInt1846 = client.anInt1978;
													client.secureBuf.putOpcode(248);
													client.secureBuf
															.writebyte(GameBuf.lengthOf(var80));
													client.secureBuf.writeCompactedString(var80);
													continue label2280;
												}

												++var17;
											}
										}

										if (var44 == 3609) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											if (var80.startsWith(Class72.method335(0))
													|| var80.startsWith(Class72.method335(1)))
												var80 = var80.substring(7);

											Class90.anIntArray706[var4++] = BZip2Context.method154(var80) ? 1 : 0;
											continue;
										}

										String var59;
										String[] var84;
										if (var44 == 3611) {
											if (client.aString1829 != null) {
												var84 = Class90.aStringArray712;
												var24 = var5++;
												var59 = client.aString1829;
												var68 = BZip2Context.method151(Class65.method297(var59));
												if (var68 == null)
													var68 = "";

												var84[var24] = var68;
											} else
												Class90.aStringArray712[var5++] = "";
											continue;
										}

										if (var44 == 3612) {
											if (client.aString1829 != null)
												Class90.anIntArray706[var4++] = Class89.anInt704;
											else
												Class90.anIntArray706[var4++] = 0;
											continue;
										}

										if (var44 == 3613) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											if ((client.aString1829 != null) && (var15 < Class89.anInt704)) {
												Class90.aStringArray712[var5++] = Class104_Sub13.aClass104_Sub7Array1099[var15].aString947;
												continue;
											}

											Class90.aStringArray712[var5++] = "";
											continue;
										}

										if (var44 == 3614) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											if ((null != client.aString1829) && (var15 < Class89.anInt704)) {
												Class90.anIntArray706[var4++] = Class104_Sub13.aClass104_Sub7Array1099[var15].anInt950;
												continue;
											}

											Class90.anIntArray706[var4++] = 0;
											continue;
										}

										if (var44 == 3615) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											if ((client.aString1829 != null) && (var15 < Class89.anInt704)) {
												Class90.anIntArray706[var4++] = Class104_Sub13.aClass104_Sub7Array1099[var15].aByte949;
												continue;
											}

											Class90.anIntArray706[var4++] = 0;
											continue;
										}

										if (var44 == 3616) {
											Class90.anIntArray706[var4++] = Class103.aByte820;
											continue;
										}

										if (var44 == 3617) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											if (null != Class104_Sub13.aClass104_Sub7Array1099) {
												client.secureBuf.putOpcode(245);
												client.secureBuf
														.writebyte(GameBuf.lengthOf(var80));
												client.secureBuf.writeCompactedString(var80);
											}
											continue;
										}

										if (var44 == 3618) {
											Class90.anIntArray706[var4++] = Class97.aByte766;
											continue;
										}

										if (var44 == 3619) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											Class6.method32(var80);
											continue;
										}

										if (var44 == 3620) {
											Class1.writePkt185();
											continue;
										}

										if (var44 == 3621) {
											if (client.anInt2024 == 0)
												Class90.anIntArray706[var4++] = -1;
											else
												Class90.anIntArray706[var4++] = client.anInt2045;
											continue;
										}

										if (var44 == 3622) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											if ((client.anInt2024 != 0) && (var15 < client.anInt2045)) {
												Class90.aStringArray712[var5++] = client.aClass78Array2046[var15].aString625;
												continue;
											}

											Class90.aStringArray712[var5++] = "";
											continue;
										}

										if (var44 == 3623) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											if (var80.startsWith(Class72.method335(0))
													|| var80.startsWith(Class72.method335(1)))
												var80 = var80.substring(7);

											Class90.anIntArray706[var4++] = Class34.method166(var80) ? 1 : 0;
											continue;
										}

										if (var44 == 3624) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											if ((Class104_Sub13.aClass104_Sub7Array1099 != null)
													&& (var15 < Class89.anInt704)
													&& Class104_Sub13.aClass104_Sub7Array1099[var15].aString947
															.equalsIgnoreCase(
																	Class81.activePlayer.myName)) {
												Class90.anIntArray706[var4++] = 1;
												continue;
											}

											Class90.anIntArray706[var4++] = 0;
											continue;
										}

										if (var44 == 3625) {
											if (null != client.aString2012) {
												var84 = Class90.aStringArray712;
												var24 = var5++;
												var59 = client.aString2012;
												var68 = BZip2Context.method151(Class65.method297(var59));
												if (var68 == null)
													var68 = "";

												var84[var24] = var68;
											} else
												Class90.aStringArray712[var5++] = "";
											continue;
										}
									} else if (var44 < 4100) {
										if (var44 == 4000) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[var4 + 1];
											Class90.anIntArray706[var4++] = var24 + var15;
											continue;
										}

										if (var44 == 4001) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[var4 + 1];
											Class90.anIntArray706[var4++] = var15 - var24;
											continue;
										}

										if (var44 == 4002) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[var4 + 1];
											Class90.anIntArray706[var4++] = var15 * var24;
											continue;
										}

										if (var44 == 4003) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[var4 + 1];
											Class90.anIntArray706[var4++] = var15 / var24;
											continue;
										}

										if (var44 == 4004) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											Class90.anIntArray706[var4++] = (int) (Math.random() * var15);
											continue;
										}

										if (var44 == 4005) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											Class90.anIntArray706[var4++] = (int) (Math.random() * (var15 + 1));
											continue;
										}

										if (var44 == 4006) {
											var4 -= 5;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[var4 + 1];
											var17 = Class90.anIntArray706[var4 + 2];
											var18 = Class90.anIntArray706[3 + var4];
											var19 = Class90.anIntArray706[4 + var4];
											Class90.anIntArray706[var4++] = var15
													+ (((var24 - var15) * (var19 - var17)) / (var18 - var17));
											continue;
										}

										if (var44 == 4007) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[var4 + 1];
											Class90.anIntArray706[var4++] = ((var24 * var15) / 100) + var15;
											continue;
										}

										if (var44 == 4008) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[1 + var4];
											Class90.anIntArray706[var4++] = var15 | (1 << var24);
											continue;
										}

										if (var44 == 4009) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[1 + var4];
											Class90.anIntArray706[var4++] = var15 & (-1 - (1 << var24));
											continue;
										}

										if (var44 == 4010) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[1 + var4];
											Class90.anIntArray706[var4++] = (var15 & (1 << var24)) != 0 ? 1 : 0;
											continue;
										}

										if (var44 == 4011) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[1 + var4];
											Class90.anIntArray706[var4++] = var15 % var24;
											continue;
										}

										if (var44 == 4012) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[var4 + 1];
											if (var15 == 0)
												Class90.anIntArray706[var4++] = 0;
											else
												Class90.anIntArray706[var4++] = (int) Math.pow(var15, var24);
											continue;
										}

										if (var44 == 4013) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[1 + var4];
											if (var15 == 0)
												Class90.anIntArray706[var4++] = 0;
											else if (var24 == 0)
												Class90.anIntArray706[var4++] = Integer.MAX_VALUE;
											else
												Class90.anIntArray706[var4++] = (int) Math.pow(var15, 1.0D / var24);
											continue;
										}

										if (var44 == 4014) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[1 + var4];
											Class90.anIntArray706[var4++] = var15 & var24;
											continue;
										}

										if (var44 == 4015) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[var4 + 1];
											Class90.anIntArray706[var4++] = var15 | var24;
											continue;
										}
									} else if (var44 < 4200) {
										if (var44 == 4100) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											--var4;
											var24 = Class90.anIntArray706[var4];
											Class90.aStringArray712[var5++] = var80 + var24;
											continue;
										}

										if (var44 == 4101) {
											var5 -= 2;
											var80 = Class90.aStringArray712[var5];
											var16 = Class90.aStringArray712[1 + var5];
											Class90.aStringArray712[var5++] = var80 + var16;
											continue;
										}

										if (var44 == 4102) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											--var4;
											var24 = Class90.anIntArray706[var4];
											Class90.aStringArray712[var5++] = var80 + Class39.method179(var24, true);
											continue;
										}

										if (var44 == 4103) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											Class90.aStringArray712[var5++] = var80.toLowerCase();
											continue;
										}

										if (var44 == 4104) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											final long var29 = (var15 + 11745L) * 86400000L;
											Class90.aCalendar715.setTime(new Date(var29));
											var18 = Class90.aCalendar715.get(5);
											var19 = Class90.aCalendar715.get(2);
											var20 = Class90.aCalendar715.get(1);
											Class90.aStringArray712[var5++] = var18 + "-"
													+ Class90.aStringArray708[var19] + "-" + var20;
											continue;
										}

										if (var44 == 4105) {
											var5 -= 2;
											var80 = Class90.aStringArray712[var5];
											var16 = Class90.aStringArray712[1 + var5];
											if ((null != Class81.activePlayer.aClass85_1770)
													&& Class81.activePlayer.aClass85_1770.aBool661) {
												Class90.aStringArray712[var5++] = var16;
												continue;
											}

											Class90.aStringArray712[var5++] = var80;
											continue;
										}

										if (var44 == 4106) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											Class90.aStringArray712[var5++] = Integer.toString(var15);
											continue;
										}

										if (var44 == 4107) {
											var5 -= 2;
											final int[] var91 = Class90.anIntArray706;
											var24 = var4++;
											var68 = Class90.aStringArray712[var5];
											var70 = Class90.aStringArray712[1 + var5];
											var28 = var68.length();
											final int var31 = var70.length();
											int var32 = 0;
											int var33 = 0;
											byte var34 = 0;
											byte var35 = 0;

											label2099: while (true) {
												if (((var32 - var34) >= var28) && ((var33 - var35) >= var31)) {
													final int var85 = Math.min(var28, var31);

													int var86;
													char var89;
													for (var86 = 0; var86 < var85; ++var86) {
														char var87 = var68.charAt(var86);
														var89 = var70.charAt(var86);
														if ((var89 != var87) && (Character
																.toUpperCase(var87) != Character.toUpperCase(var89))) {
															var87 = Character.toLowerCase(var87);
															var89 = Character.toLowerCase(var89);
															if (var87 != var89) {
																var18 = Class69.method321(var87)
																		- Class69.method321(var89);
																break label2099;
															}
														}
													}

													var86 = var28 - var31;
													if (var86 != 0)
														var18 = var86;
													else {
														for (int var88 = 0; var88 < var85; ++var88) {
															var89 = var68.charAt(var88);
															final char var40 = var70.charAt(var88);
															if (var40 != var89) {
																var18 = Class69.method321(var89)
																		- Class69.method321(var40);
																break label2099;
															}
														}

														var18 = 0;
													}
													break;
												}

												if ((var32 - var34) >= var28) {
													var18 = -1;
													break;
												}

												if ((var33 - var35) >= var31) {
													var18 = 1;
													break;
												}

												char var36;
												if (var34 != 0) {
													var36 = (char) var34;
												} else
													var36 = var68.charAt(var32++);

												char var37;
												if (var35 != 0) {
													var37 = (char) var35;
												} else
													var37 = var70.charAt(var33++);

												byte var38;
												if (var36 == 198)
													var38 = 69;
												else if (var36 == 230)
													var38 = 101;
												else if (var36 == 223)
													var38 = 115;
												else if (var36 == 338)
													var38 = 69;
												else if (var36 == 339)
													var38 = 101;
												else
													var38 = 0;

												var34 = var38;
												byte var39;
												if (var37 == 198)
													var39 = 69;
												else if (var37 == 230)
													var39 = 101;
												else if (var37 == 223)
													var39 = 115;
												else if (var37 == 338)
													var39 = 69;
												else if (var37 == 339)
													var39 = 101;
												else
													var39 = 0;

												var35 = var39;
												var36 = Class84.method378(var36);
												var37 = Class84.method378(var37);
												if ((var37 != var36) && (Character.toUpperCase(var36) != Character
														.toUpperCase(var37))) {
													var36 = Character.toLowerCase(var36);
													var37 = Character.toLowerCase(var37);
													if (var37 != var36) {
														var18 = Class69.method321(var36) - Class69.method321(var37);
														break;
													}
												}
											}

											if (var18 > 0)
												var57 = 1;
											else if (var18 < 0)
												var57 = -1;
											else
												var57 = 0;

											var91[var24] = var57;
											continue;
										}

										byte[] var63;
										Class104_Sub18_Sub17_Sub2_Sub1 var74;
										if (var44 == 4108) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											var4 -= 2;
											var24 = Class90.anIntArray706[var4];
											var17 = Class90.anIntArray706[1 + var4];
											var63 = Class65.aClass61_Sub1_515.decompress(var17, 0);
											var74 = new Class104_Sub18_Sub17_Sub2_Sub1(var63);
											Class90.anIntArray706[var4++] = var74.method885(var80, var24);
											continue;
										}

										if (var44 == 4109) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											var4 -= 2;
											var24 = Class90.anIntArray706[var4];
											var17 = Class90.anIntArray706[var4 + 1];
											var63 = Class65.aClass61_Sub1_515.decompress(var17, 0);
											var74 = new Class104_Sub18_Sub17_Sub2_Sub1(var63);
											Class90.anIntArray706[var4++] = var74.method862(var80, var24);
											continue;
										}

										if (var44 == 4110) {
											var5 -= 2;
											var80 = Class90.aStringArray712[var5];
											var16 = Class90.aStringArray712[1 + var5];
											--var4;
											if (Class90.anIntArray706[var4] == 1)
												Class90.aStringArray712[var5++] = var80;
											else
												Class90.aStringArray712[var5++] = var16;
											continue;
										}

										if (var44 == 4111) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											Class90.aStringArray712[var5++] = client
													.fixed(var80);
											continue;
										}

										if (var44 == 4112) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											--var4;
											var24 = Class90.anIntArray706[var4];
											Class90.aStringArray712[var5++] = var80 + (char) var24;
											continue;
										}

										boolean var52;
										char var53;
										if (var44 == 4113) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											var47 = Class90.anIntArray706;
											var17 = var4++;
											var53 = (char) var15;
											if ((var53 >= 32) && (var53 <= 126))
												var52 = true;
											else if ((var53 >= 160) && (var53 <= 255))
												var52 = true;
											else if ((var53 != 8364) && (var53 != 338) && (var53 != 8212)
													&& (var53 != 339) && (var53 != 376))
												var52 = false;
											else
												var52 = true;

											var47[var17] = var52 ? 1 : 0;
											continue;
										}

										if (var44 == 4114) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											var47 = Class90.anIntArray706;
											var17 = var4++;
											var53 = (char) var15;
											var52 = ((var53 >= 48) && (var53 <= 57)) || ((var53 >= 65) && (var53 <= 90))
													|| ((var53 >= 97) && (var53 <= 122));
											var47[var17] = var52 ? 1 : 0;
											continue;
										}

										if (var44 == 4115) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											Class90.anIntArray706[var4++] = Class87.method399((char) var15) ? 1 : 0;
											continue;
										}

										if (var44 == 4116) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											var47 = Class90.anIntArray706;
											var17 = var4++;
											var53 = (char) var15;
											var52 = (var53 >= 48) && (var53 <= 57);
											var47[var17] = var52 ? 1 : 0;
											continue;
										}

										if (var44 == 4117) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											if (null != var80)
												Class90.anIntArray706[var4++] = var80.length();
											else
												Class90.anIntArray706[var4++] = 0;
											continue;
										}

										if (var44 == 4118) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											var4 -= 2;
											var24 = Class90.anIntArray706[var4];
											var17 = Class90.anIntArray706[var4 + 1];
											Class90.aStringArray712[var5++] = var80.substring(var24, var17);
											continue;
										}

										if (var44 == 4119) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											final StringBuilder var48 = new StringBuilder(var80.length());
											boolean var51 = false;

											for (var18 = 0; var18 < var80.length(); ++var18) {
												var53 = var80.charAt(var18);
												if (var53 == 60)
													var51 = true;
												else if (var53 == 62)
													var51 = false;
												else if (!var51)
													var48.append(var53);
											}

											Class90.aStringArray712[var5++] = var48.toString();
											continue;
										}

										if (var44 == 4120) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											--var4;
											var24 = Class90.anIntArray706[var4];
											Class90.anIntArray706[var4++] = var80.indexOf(var24);
											continue;
										}
									} else if (var44 < 4300) {
										if (var44 == 4200) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											Class90.aStringArray712[var5++] = Class27.forId(var15).aString1444;
											continue;
										}

										ItemDef var58;
										if (var44 == 4201) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[var4 + 1];
											var58 = Class27.forId(var15);
											if ((var24 >= 1) && (var24 <= 5)
													&& (var58.aStringArray1434[var24 - 1] != null)) {
												Class90.aStringArray712[var5++] = var58.aStringArray1434[var24 - 1];
												continue;
											}

											Class90.aStringArray712[var5++] = "";
											continue;
										}

										if (var44 == 4202) {
											var4 -= 2;
											var15 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[1 + var4];
											var58 = Class27.forId(var15);
											if ((var24 >= 1) && (var24 <= 5)
													&& (null != var58.aStringArray1435[var24 - 1])) {
												Class90.aStringArray712[var5++] = var58.aStringArray1435[var24 - 1];
												continue;
											}

											Class90.aStringArray712[var5++] = "";
											continue;
										}

										if (var44 == 4203) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											Class90.anIntArray706[var4++] = Class27.forId(var15).anInt1453;
											continue;
										}

										if (var44 == 4204) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											Class90.anIntArray706[var4++] = Class27.forId(var15).anInt1431 == 1 ? 1
													: 0;
											continue;
										}

										ItemDef var50;
										if (var44 == 4205) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											var50 = Class27.forId(var15);
											if ((var50.anInt1433 == -1) && (var50.anInt1442 >= 0)) {
												Class90.anIntArray706[var4++] = var50.anInt1442;
												continue;
											}

											Class90.anIntArray706[var4++] = var15;
											continue;
										}

										if (var44 == 4206) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											var50 = Class27.forId(var15);
											if ((var50.anInt1433 >= 0) && (var50.anInt1442 >= 0)) {
												Class90.anIntArray706[var4++] = var50.anInt1442;
												continue;
											}

											Class90.anIntArray706[var4++] = var15;
											continue;
										}

										if (var44 == 4207) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											Class90.anIntArray706[var4++] = Class27.forId(var15).aBool1440 ? 1 : 0;
											continue;
										}
									} else if (var44 < 5100) {
										if (var44 == 5000) {
											Class90.anIntArray706[var4++] = client.anInt2004;
											continue;
										}

										if (var44 == 5001) {
											var4 -= 3;
											client.anInt2004 = Class90.anIntArray706[var4];
											var24 = Class90.anIntArray706[1 + var4];
											final Class27[] var60 = Class30.method145();
											var18 = 0;

											Class27 var92;
											while (true) {
												if (var18 >= var60.length) {
													var92 = null;
													break;
												}

												final Class27 var75 = var60[var18];
												if (var24 == var75.anInt261) {
													var92 = var75;
													break;
												}

												++var18;
											}

											Class21.aClass27_222 = var92;
											if (Class21.aClass27_222 == null)
												Class21.aClass27_222 = Class27.aClass27_260;

											client.anInt2005 = Class90.anIntArray706[var4 + 2];
											client.secureBuf.putOpcode(167);
											client.secureBuf.writebyte(client.anInt2004);
											client.secureBuf.writebyte(Class21.aClass27_222.anInt261);
											client.secureBuf.writebyte(client.anInt2005);
											continue;
										}

										if (var44 == 5002) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											var4 -= 2;
											var24 = Class90.anIntArray706[var4];
											var17 = Class90.anIntArray706[1 + var4];
											client.secureBuf.putOpcode(96);
											client.secureBuf
													.writebyte(GameBuf.lengthOf(var80) + 2);
											client.secureBuf.writeCompactedString(var80);
											client.secureBuf.writebyte(var24 - 1);
											client.secureBuf.writebyte(var17);
											continue;
										}

										if (var44 == 5003) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											var16 = null;
											if (var15 < 100)
												var16 = client.aStringArray2001[var15];

											if (null == var16)
												var16 = "";

											Class90.aStringArray712[var5++] = var16;
											continue;
										}

										if (var44 == 5004) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											var24 = -1;
											if ((var15 < 100) && (client.aStringArray2001[var15] != null))
												var24 = client.anIntArray1998[var15];

											Class90.anIntArray706[var4++] = var24;
											continue;
										}

										if (var44 == 5005) {
											if (Class21.aClass27_222 == null)
												Class90.anIntArray706[var4++] = -1;
											else
												Class90.anIntArray706[var4++] = Class21.aClass27_222.anInt261;
											continue;
										}

										if (var44 == 5008) {
											--var5;
											var80 = Class90.aStringArray712[var5];
											if (var80.startsWith("::"))
												Class104_Sub13.method542(var80);
											else {
												var16 = var80.toLowerCase();
												byte var61 = 0;
												if (var16.startsWith("yellow:")) {
													var61 = 0;
													var80 = var80.substring("yellow:".length());
												} else if (var16.startsWith("red:")) {
													var61 = 1;
													var80 = var80.substring("red:".length());
												} else if (var16.startsWith("green:")) {
													var61 = 2;
													var80 = var80.substring("green:".length());
												} else if (var16.startsWith("cyan:")) {
													var61 = 3;
													var80 = var80.substring("cyan:".length());
												} else if (var16.startsWith("purple:")) {
													var61 = 4;
													var80 = var80.substring("purple:".length());
												} else if (var16.startsWith("white:")) {
													var61 = 5;
													var80 = var80.substring("white:".length());
												} else if (var16.startsWith("flash1:")) {
													var61 = 6;
													var80 = var80.substring("flash1:".length());
												} else if (var16.startsWith("flash2:")) {
													var61 = 7;
													var80 = var80.substring("flash2:".length());
												} else if (var16.startsWith("flash3:")) {
													var61 = 8;
													var80 = var80.substring("flash3:".length());
												} else if (var16.startsWith("glow1:")) {
													var61 = 9;
													var80 = var80.substring("glow1:".length());
												} else if (var16.startsWith("glow2:")) {
													var61 = 10;
													var80 = var80.substring("glow2:".length());
												} else if (var16.startsWith("glow3:")) {
													var61 = 11;
													var80 = var80.substring("glow3:".length());
												} else if (client.anInt1913 != 0)
													if (var16.startsWith("yellow:")) {
														var61 = 0;
														var80 = var80.substring("yellow:".length());
													} else if (var16.startsWith("red:")) {
														var61 = 1;
														var80 = var80.substring("red:".length());
													} else if (var16.startsWith("green:")) {
														var61 = 2;
														var80 = var80.substring("green:".length());
													} else if (var16.startsWith("cyan:")) {
														var61 = 3;
														var80 = var80.substring("cyan:".length());
													} else if (var16.startsWith("purple:")) {
														var61 = 4;
														var80 = var80.substring("purple:".length());
													} else if (var16.startsWith("white:")) {
														var61 = 5;
														var80 = var80.substring("white:".length());
													} else if (var16.startsWith("flash1:")) {
														var61 = 6;
														var80 = var80.substring("flash1:".length());
													} else if (var16.startsWith("flash2:")) {
														var61 = 7;
														var80 = var80.substring("flash2:".length());
													} else if (var16.startsWith("flash3:")) {
														var61 = 8;
														var80 = var80.substring("flash3:".length());
													} else if (var16.startsWith("glow1:")) {
														var61 = 9;
														var80 = var80.substring("glow1:".length());
													} else if (var16.startsWith("glow2:")) {
														var61 = 10;
														var80 = var80.substring("glow2:".length());
													} else if (var16.startsWith("glow3:")) {
														var61 = 11;
														var80 = var80.substring("glow3:".length());
													}

												var16 = var80.toLowerCase();
												byte var66 = 0;
												if (var16.startsWith("wave:")) {
													var66 = 1;
													var80 = var80.substring("wave:".length());
												} else if (var16.startsWith("wave2:")) {
													var66 = 2;
													var80 = var80.substring("wave2:".length());
												} else if (var16.startsWith("shake:")) {
													var66 = 3;
													var80 = var80.substring("shake:".length());
												} else if (var16.startsWith("scroll:")) {
													var66 = 4;
													var80 = var80.substring("scroll:".length());
												} else if (var16.startsWith("slide:")) {
													var66 = 5;
													var80 = var80.substring("slide:".length());
												} else if (client.anInt1913 != 0)
													if (var16.startsWith("wave:")) {
														var66 = 1;
														var80 = var80.substring("wave:".length());
													} else if (var16.startsWith("wave2:")) {
														var66 = 2;
														var80 = var80.substring("wave2:".length());
													} else if (var16.startsWith("shake:")) {
														var66 = 3;
														var80 = var80.substring("shake:".length());
													} else if (var16.startsWith("scroll:")) {
														var66 = 4;
														var80 = var80.substring("scroll:".length());
													} else if (var16.startsWith("slide:")) {
														var66 = 5;
														var80 = var80.substring("slide:".length());
													}

												client.secureBuf.putOpcode(205);
												client.secureBuf.writebyte(0);
												var19 = client.secureBuf.pos;
												client.secureBuf.writebyte(var61);
												client.secureBuf.writebyte(var66);
												Class41.method183(client.secureBuf, var80);
												client.secureBuf
														.method613(client.secureBuf.pos - var19);
											}
											continue;
										}

										if (var44 == 5009) {
											var5 -= 2;
											var80 = Class90.aStringArray712[var5];
											var16 = Class90.aStringArray712[1 + var5];
											client.secureBuf.putOpcode(211);
											client.secureBuf.writeShort(0);
											var17 = client.secureBuf.pos;
											client.secureBuf.writeCompactedString(var80);
											Class41.method183(client.secureBuf, var16);
											client.secureBuf
													.writeShortLE(client.secureBuf.pos - var17);
											continue;
										}

										if (var44 == 5010) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											var16 = null;
											if (var15 < 100)
												var16 = client.aStringArray1912[var15];

											if (var16 == null)
												var16 = "";

											Class90.aStringArray712[var5++] = var16;
											continue;
										}

										if (var44 == 5011) {
											--var4;
											var15 = Class90.anIntArray706[var4];
											var16 = null;
											if (var15 < 100)
												var16 = client.aStringArray2025[var15];

											if (null == var16)
												var16 = "";

											Class90.aStringArray712[var5++] = var16;
											continue;
										}

										if (var44 == 5015) {
											if ((Class81.activePlayer != null)
													&& (null != Class81.activePlayer.myName))
												var80 = Class81.activePlayer.myName;
											else
												var80 = "";

											Class90.aStringArray712[var5++] = var80;
											continue;
										}

										if (var44 == 5016) {
											Class90.anIntArray706[var4++] = client.anInt2005;
											continue;
										}

										if (var44 == 5017) {
											Class90.anIntArray706[var4++] = client.anInt2000;
											continue;
										}
									}
								}
							} else {
								if (var44 >= 2000) {
									var44 -= 1000;
									--var4;
									var21 = Class47.method210(Class90.anIntArray706[var4]);
								} else
									var21 = var49 ? Class27.aClass104_Sub12_262 : Class84.aClass104_Sub12_660;

								if (var44 == 1300) {
									--var4;
									var24 = Class90.anIntArray706[var4] - 1;
									if ((var24 >= 0) && (var24 <= 9)) {
										--var5;
										var21.method536(var24, Class90.aStringArray712[var5]);
										continue;
									}

									--var5;
									continue;
								}

								if (var44 == 1301) {
									var4 -= 2;
									var24 = Class90.anIntArray706[var4];
									var17 = Class90.anIntArray706[1 + var4];
									var21.aClass104_Sub12_1040 = Class29.method141(var24, var17);
									continue;
								}

								if (var44 == 1302) {
									--var4;
									var21.aBool1053 = Class90.anIntArray706[var4] == 1;
									continue;
								}

								if (var44 == 1303) {
									--var4;
									var21.anInt1041 = Class90.anIntArray706[var4];
									continue;
								}

								if (var44 == 1304) {
									--var4;
									var21.anInt1082 = Class90.anIntArray706[var4];
									continue;
								}

								if (var44 == 1305) {
									--var5;
									var21.aString990 = Class90.aStringArray712[var5];
									continue;
								}

								if (var44 == 1306) {
									--var5;
									var21.aString1036 = Class90.aStringArray712[var5];
									continue;
								}

								if (var44 == 1307) {
									var21.aStringArray1039 = null;
									continue;
								}
							}
						} else {
							if (var44 >= 2000) {
								var44 -= 1000;
								--var4;
								var21 = Class47.method210(Class90.anIntArray706[var4]);
							} else
								var21 = var49 ? Class27.aClass104_Sub12_262 : Class84.aClass104_Sub12_660;

							if (var44 == 1100) {
								var4 -= 2;
								var21.anInt991 = Class90.anIntArray706[var4];
								if (var21.anInt991 > (var21.anInt1079 - var21.anInt987))
									var21.anInt991 = var21.anInt1079 - var21.anInt987;

								if (var21.anInt991 < 0)
									var21.anInt991 = 0;

								var21.anInt992 = Class90.anIntArray706[var4 + 1];
								if (var21.anInt992 > (var21.anInt994 - var21.anInt988))
									var21.anInt992 = var21.anInt994 - var21.anInt988;

								if (var21.anInt992 < 0)
									var21.anInt992 = 0;

								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1101) {
								--var4;
								var21.anInt1017 = Class90.anIntArray706[var4];
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1102) {
								--var4;
								var21.aBool1088 = Class90.anIntArray706[var4] == 1;
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1103) {
								--var4;
								var21.anInt1000 = Class90.anIntArray706[var4];
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1104) {
								--var4;
								var21.anInt999 = Class90.anIntArray706[var4];
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1105) {
								--var4;
								var21.anInt1002 = Class90.anIntArray706[var4];
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1106) {
								--var4;
								var21.anInt979 = Class90.anIntArray706[var4];
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1107) {
								--var4;
								var21.aBool989 = Class90.anIntArray706[var4] == 1;
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1108) {
								var21.anInt1010 = 1;
								--var4;
								var21.anInt1011 = Class90.anIntArray706[var4];
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1109) {
								var4 -= 6;
								var21.anInt1016 = Class90.anIntArray706[var4];
								var21.anInt993 = Class90.anIntArray706[var4 + 1];
								var21.anInt1043 = Class90.anIntArray706[var4 + 2];
								var21.anInt1019 = Class90.anIntArray706[3 + var4];
								var21.anInt1012 = Class90.anIntArray706[4 + var4];
								var21.anInt1021 = Class90.anIntArray706[5 + var4];
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1110) {
								--var4;
								var24 = Class90.anIntArray706[var4];
								if (var24 != var21.anInt1058) {
									var21.anInt1058 = var24;
									var21.anInt974 = 0;
									var21.anInt1085 = 0;
									Class79.setflags(var21);
								}
								continue;
							}

							if (var44 == 1111) {
								--var4;
								var21.aBool1023 = Class90.anIntArray706[var4] == 1;
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1112) {
								--var5;
								var16 = Class90.aStringArray712[var5];
								if (!var16.equals(var21.aString1025)) {
									var21.aString1025 = var16;
									Class79.setflags(var21);
								}
								continue;
							}

							if (var44 == 1113) {
								--var4;
								var21.anInt1024 = Class90.anIntArray706[var4];
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1114) {
								var4 -= 3;
								var21.anInt1059 = Class90.anIntArray706[var4];
								var21.anInt1029 = Class90.anIntArray706[1 + var4];
								var21.anInt1027 = Class90.anIntArray706[var4 + 2];
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1115) {
								--var4;
								var21.aBool1030 = Class90.anIntArray706[var4] == 1;
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1116) {
								--var4;
								var21.anInt1006 = Class90.anIntArray706[var4];
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1117) {
								--var4;
								var21.anInt1007 = Class90.anIntArray706[var4];
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1118) {
								--var4;
								var21.aBool1044 = Class90.anIntArray706[var4] == 1;
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1119) {
								--var4;
								var21.aBool1009 = Class90.anIntArray706[var4] == 1;
								Class79.setflags(var21);
								continue;
							}

							if (var44 == 1120) {
								var4 -= 2;
								var21.anInt1079 = Class90.anIntArray706[var4];
								var21.anInt994 = Class90.anIntArray706[var4 + 1];
								Class79.setflags(var21);
								continue;
							}
						}
					}
					System.out.println("cs end - shouldn't get here m9");
					throw new IllegalStateException();
				}
			} catch (final Exception var43) {
				final StringBuilder var42 = new StringBuilder(30);
				var42.append("").append(cachedscript.nodeId).append(" ");

				for (var12 = Class90.totalActs - 1; var12 >= 0; --var12)
					var42.append("").append(Class90.aClass100Array714[var12].aClass104_Sub18_Sub4_796.nodeId)
							.append(" ");

				var42.append("").append(var9);
				Nodee.report(var42.toString(), var43);
			}
		}
	}

	static final void redrawComponent(final int var0) {
		Class66.redraw();
		Class25.method128();
		final int var1 = Class104_Sub23.method622(var0).anInt1412;
		if (var1 != 0) {
			final int var2 = Class71.anIntArray576[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					Class104_Sub18_Sub17_Sub4.method918(0.9D);
					((Class34) Class104_Sub18_Sub17_Sub4.anInterface2_1686).method162(0.9D);
				}

				if (var2 == 2) {
					Class104_Sub18_Sub17_Sub4.method918(0.8D);
					((Class34) Class104_Sub18_Sub17_Sub4.anInterface2_1686).method162(0.8D);
				}

				if (var2 == 3) {
					Class104_Sub18_Sub17_Sub4.method918(0.7D);
					((Class34) Class104_Sub18_Sub17_Sub4.anInterface2_1686).method162(0.7D);
				}

				if (var2 == 4) {
					Class104_Sub18_Sub17_Sub4.method918(0.6D);
					((Class34) Class104_Sub18_Sub17_Sub4.anInterface2_1686).method162(0.6D);
				}

				Class101.method466();
			}

			if (var1 == 3) {
				short var3 = 0;
				if (var2 == 0)
					var3 = 255;

				if (var2 == 1)
					var3 = 192;

				if (var2 == 2)
					var3 = 128;

				if (var2 == 3)
					var3 = 64;

				if (var2 == 4)
					var3 = 0;

				if (client.anInt2022 != var3) {
					if ((client.anInt2022 == 0) && (client.anInt2023 != -1)) {
						Class87.method400(Class27.aClass61_Sub1_264, client.anInt2023, 0, var3, false);
						client.aBool2041 = false;
					} else if (var3 == 0) {
						Class28.method138();
						client.aBool2041 = false;
					} else
						Class70.method328(var3);

					client.anInt2022 = var3;
				}
			}

			if (var1 == 4) {
				if (var2 == 0)
					client.anInt1827 = 127;

				if (var2 == 1)
					client.anInt1827 = 96;

				if (var2 == 2)
					client.anInt1827 = 64;

				if (var2 == 3)
					client.anInt1827 = 32;

				if (var2 == 4)
					client.anInt1827 = 0;
			}

			if (var1 == 5)
				client.anInt1920 = var2;

			if (var1 == 6)
				client.anInt1949 = var2;

			if (var1 == 9)
				client.anInt1839 = var2;

			if (var1 == 10) {
				if (var2 == 0)
					client.anInt2026 = 127;

				if (var2 == 1)
					client.anInt2026 = 96;

				if (var2 == 2)
					client.anInt2026 = 64;

				if (var2 == 3)
					client.anInt2026 = 32;

				if (var2 == 4)
					client.anInt2026 = 0;
			}

		}
	}

	public static Class3 method205(final int var0) {
		try {
			return new Class3_Sub1();
		} catch (final Throwable var2) {
			return null;
		}
	}

	static void method206() {
		int var0;
		if (client.anInt1816 == 0) {
			Class81.aClass17_643 = new Class17(4, 104, 104, Class76.anIntArrayArrayArray611);

			for (var0 = 0; var0 < 4; ++var0)
				client.aClass67Array1975[var0] = new Class67(104, 104);

			Class104_Sub2.aClass104_Sub18_Sub17_Sub1_861 = new Sprite(512, 512);
			Class66.aString540 = "Starting game engine...";
			Class66.anInt534 = 5;
			client.anInt1816 = 20;
		} else {
			int var2;
			int var3;
			int var4;
			int var5;
			if (client.anInt1816 == 20) {
				final int[] var21 = new int[9];

				for (var2 = 0; var2 < 9; ++var2) {
					var3 = 128 + (var2 * 32) + 15;
					var4 = 600 + (3 * var3);
					var5 = Class104_Sub18_Sub17_Sub4.anIntArray1680[var3];
					var21[var2] = (var5 * var4) >> 16;
				}

				Class17.method93(var21, 500, 800, 512, 334);
				Class66.aString540 = "Prepared visibility map";
				Class66.anInt534 = 10;
				client.anInt1816 = 30;
			} else if (client.anInt1816 == 30) {
				Class27.aClass61_Sub1_263 = JagFS.method423(0, false, true, true);
				Class104_Sub20.aClass61_Sub1_1171 = JagFS.method423(1, false, true, true);
				Class52.aClass61_Sub1_430 = JagFS.method423(2, true, false, true);
				Class29.aClass61_Sub1_278 = JagFS.method423(3, false, true, true);
				Class103.aClass61_Sub1_818 = JagFS.method423(4, false, true, true);
				Class67.fs = JagFS.method423(5, true, true, true);
				Class27.aClass61_Sub1_264 = JagFS.method423(6, true, true, false);
				Class1.aClass61_Sub1_2 = JagFS.method423(7, false, true, true);
				client.aClass61_Sub1_1820 = JagFS.method423(8, false, true, true);
				client.aClass61_Sub1_1838 = JagFS.method423(9, false, true, true);
				Class2.aClass61_Sub1_9 = JagFS.method423(10, false, true, true);
				Class106.aClass61_Sub1_827 = JagFS.method423(11, false, true, true);
				Class85.aClass61_Sub1_671 = JagFS.method423(12, false, true, true);
				Class65.aClass61_Sub1_515 = JagFS.method423(13, true, false, true);
				ObjectDefinition.aClass61_Sub1_1374 = JagFS.method423(14, false, true, false);
				Class100.aClass61_Sub1_800 = JagFS.method423(15, false, true, true);
				Class66.aString540 = "Connecting to update server";
				Class66.anInt534 = 20;
				client.anInt1816 = 40;
			} else if (client.anInt1816 == 40) {
				final byte var23 = 0;
				var0 = var23 + ((Class27.aClass61_Sub1_263.method493() * 4) / 100);
				var0 += (Class104_Sub20.aClass61_Sub1_1171.method493() * 4) / 100;
				var0 += (Class52.aClass61_Sub1_430.method493() * 2) / 100;
				var0 += (Class29.aClass61_Sub1_278.method493() * 2) / 100;
				var0 += (Class103.aClass61_Sub1_818.method493() * 6) / 100;
				var0 += (Class67.fs.method493() * 4) / 100;
				var0 += (Class27.aClass61_Sub1_264.method493() * 2) / 100;
				var0 += (Class1.aClass61_Sub1_2.method493() * 60) / 100;
				var0 += (client.aClass61_Sub1_1820.method493() * 2) / 100;
				var0 += (client.aClass61_Sub1_1838.method493() * 2) / 100;
				var0 += (Class2.aClass61_Sub1_9.method493() * 2) / 100;
				var0 += (Class106.aClass61_Sub1_827.method493() * 2) / 100;
				var0 += (Class85.aClass61_Sub1_671.method493() * 2) / 100;
				var0 += (Class65.aClass61_Sub1_515.method493() * 2) / 100;
				var0 += (ObjectDefinition.aClass61_Sub1_1374.method493() * 2) / 100;
				var0 += (Class100.aClass61_Sub1_800.method493() * 2) / 100;
				if (var0 != 100) {
					if (var0 != 0)
						Class66.aString540 = "Checking for updates - " + var0 + "%";

					Class66.anInt534 = 30;
				} else {
					Class66.aString540 = "Loaded update list";
					Class66.anInt534 = 30;
					client.anInt1816 = 45;
				}
			} else if (client.anInt1816 == 45) {
				Class48.method217(22050, !client.lowmvm, 2);
				final Class104_Sub8_Sub1 var20 = new Class104_Sub8_Sub1();
				var20.method638(9, 128);
				Class76.aClass99_620 = Class71.method329(Applet_Sub1.aClass11_1760, Class57.aCanvas468, 0, 22050);
				Class76.aClass99_620.method458(var20);
				Class104_Sub2.method480(Class100.aClass61_Sub1_800, ObjectDefinition.aClass61_Sub1_1374,
						Class103.aClass61_Sub1_818, var20);
				Class102_Sub1.aClass99_895 = Class71.method329(Applet_Sub1.aClass11_1760, Class57.aCanvas468, 1, 2048);
				Class79.aClass104_Sub8_Sub2_630 = new Class104_Sub8_Sub2();
				Class102_Sub1.aClass99_895.method458(Class79.aClass104_Sub8_Sub2_630);
				RSBuf.aClass84_1175 = new Class84(22050, Class99.anInt777);
				Class66.aString540 = "Prepared sound engine";
				Class66.anInt534 = 35;
				client.anInt1816 = 50;
			} else if (client.anInt1816 == 50) {
				var0 = 0;
				if (Class104_Sub7.aClass104_Sub18_Sub17_Sub2_Sub1_951 == null)
					Class104_Sub7.aClass104_Sub18_Sub17_Sub2_Sub1_951 = Class47.method214(client.aClass61_Sub1_1820,
							Class65.aClass61_Sub1_515, "p11_full", "");
				else
					++var0;

				if (null == Class29.aClass104_Sub18_Sub17_Sub2_Sub1_277)
					Class29.aClass104_Sub18_Sub17_Sub2_Sub1_277 = Class47.method214(client.aClass61_Sub1_1820,
							Class65.aClass61_Sub1_515, "p12_full", "");
				else
					++var0;

				if (Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36 == null)
					Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36 = Class47.method214(client.aClass61_Sub1_1820,
							Class65.aClass61_Sub1_515, "b12_full", "");
				else
					++var0;

				if (var0 < 3) {
					Class66.aString540 = "Loading fonts - " + ((var0 * 100) / 3) + "%";
					Class66.anInt534 = 40;
				} else {
					Class66.aString540 = "Loaded fonts";
					Class66.anInt534 = 40;
					client.anInt1816 = 60;
				}
			} else {
				Class61_Sub1 var6;
				Class61_Sub1 var7;
				if (client.anInt1816 == 60) {
					var6 = Class2.aClass61_Sub1_9;
					var7 = client.aClass61_Sub1_1820;
					var4 = 0;
					if (var6.method274("title.jpg", ""))
						++var4;

					if (var7.method274("logo", ""))
						++var4;

					if (var7.method274("titlebox", ""))
						++var4;

					if (var7.method274("titlebutton", ""))
						++var4;

					if (var7.method274("runes", ""))
						++var4;

					if (var7.method274("title_mute", ""))
						++var4;

					var7.method274("sl_back", "");
					var7.method274("sl_flags", "");
					var7.method274("sl_arrows", "");
					var7.method274("sl_stars", "");
					var7.method274("sl_button", "");
					var5 = FSManager.method436(-2042726381);
					if (var4 < var5) {
						Class66.aString540 = "Loading title screen - " + ((var4 * 100) / var5) + "%";
						Class66.anInt534 = 50;
					} else {
						Class66.aString540 = "Loaded title screen";
						Class66.anInt534 = 50;
						Class10.method40(5);
						client.anInt1816 = 70;
					}
				} else if (client.anInt1816 == 70) {
					if (!Class52.aClass61_Sub1_430.method261()) {
						Class66.aString540 = "Loading config - " + Class52.aClass61_Sub1_430.method490() + "%";
						Class66.anInt534 = 60;
					} else {
						final Class61_Sub1 var19 = Class52.aClass61_Sub1_430;
						Class49.aClass61_418 = var19;
						JagFS.method422(Class52.aClass61_Sub1_430);
						Class85.method392(Class52.aClass61_Sub1_430, Class1.aClass61_Sub1_2);
						Class22.method124(Class52.aClass61_Sub1_430, Class1.aClass61_Sub1_2, client.lowmvm);
						Class49.method223(Class52.aClass61_Sub1_430, Class1.aClass61_Sub1_2);
						var6 = Class52.aClass61_Sub1_430;
						var7 = Class1.aClass61_Sub1_2;
						final boolean var22 = client.aBool1852;
						final Class104_Sub18_Sub17_Sub2_Sub1 var8 = Class104_Sub7.aClass104_Sub18_Sub17_Sub2_Sub1_951;
						ItemDef.aClass61_1432 = var6;
						Class27.aClass61_265 = var7;
						Class79.aBool632 = var22;
						ItemDef.aClass61_1432.leng(10);
						client.aClass104_Sub18_Sub17_Sub2_Sub1_290 = var8;
						Class9.method38(Class52.aClass61_Sub1_430, Class27.aClass61_Sub1_263,
								Class104_Sub20.aClass61_Sub1_1171);
						final Class61_Sub1 var9 = Class52.aClass61_Sub1_430;
						final Class61_Sub1 var10 = Class1.aClass61_Sub1_2;
						Class104_Sub18_Sub5.aClass61_1307 = var9;
						Class104_Sub18_Sub5.aClass61_1311 = var10;
						final Class61_Sub1 var11 = Class52.aClass61_Sub1_430;
						Class104_Sub18_Sub8.aClass61_1389 = var11;
						Class95.method426(Class52.aClass61_Sub1_430);
						Class24.method126(Class29.aClass61_Sub1_278, Class1.aClass61_Sub1_2, client.aClass61_Sub1_1820,
								Class65.aClass61_Sub1_515);
						final Class61_Sub1 var12 = Class52.aClass61_Sub1_430;
						Class104_Sub18_Sub14.aClass61_1463 = var12;
						final Class61_Sub1 var13 = Class52.aClass61_Sub1_430;
						Class104_Sub18_Sub10.aClass61_1403 = var13;
						Class66.aString540 = "Loaded config";
						Class66.anInt534 = 60;
						client.anInt1816 = 80;
					}
				} else if (client.anInt1816 != 80) {
					if (client.anInt1816 == 90) {
						if (!client.aClass61_Sub1_1838.method261()) {
							Class66.aString540 = "Loading textures - " + client.aClass61_Sub1_1838.method490() + "%";
							Class66.anInt534 = 90;
						} else {
							final Class34 var18 = new Class34(client.aClass61_Sub1_1838, client.aClass61_Sub1_1820, 20,
									0.8D, client.lowmvm ? 64 : 128);
							Class104_Sub18_Sub17_Sub4.method917(var18);
							Class104_Sub18_Sub17_Sub4.method918(0.8D);
							Class66.aString540 = "Loaded textures";
							Class66.anInt534 = 90;
							client.anInt1816 = 110;
						}
					} else if (client.anInt1816 == 110) {
						Class2_Sub2.aClass72_865 = new Class72();
						Applet_Sub1.aClass11_1760.method43(Class2_Sub2.aClass72_865, 10);
						Class66.aString540 = "Loaded input handler";
						Class66.anInt534 = 94;
						client.anInt1816 = 120;
					} else if (client.anInt1816 == 120) {
						if (!Class2.aClass61_Sub1_9.method274("huffman", "")) {
							Class66.aString540 = "Loading wordpack - " + 0 + "%";
							Class66.anInt534 = 96;
						} else {
							final Class49 var1 = new Class49(Class2.aClass61_Sub1_9.method272("huffman", ""));
							Class47.method213(var1);
							Class66.aString540 = "Loaded wordpack";
							Class66.anInt534 = 96;
							client.anInt1816 = 130;
						}
					} else if (client.anInt1816 == 130) {
						if (!Class29.aClass61_Sub1_278.method261()) {
							Class66.aString540 = "Loading interfaces - "
									+ ((Class29.aClass61_Sub1_278.method490() * 4) / 5) + "%";
							Class66.anInt534 = 100;
						} else if (!Class85.aClass61_Sub1_671.method261()) {
							Class66.aString540 = "Loading interfaces - "
									+ (80 + (Class85.aClass61_Sub1_671.method490() / 6)) + "%";
							Class66.anInt534 = 100;
						} else if (!Class65.aClass61_Sub1_515.method261()) {
							Class66.aString540 = "Loading interfaces - "
									+ (96 + (Class65.aClass61_Sub1_515.method490() / 20)) + "%";
							Class66.anInt534 = 100;
						} else {
							Class66.aString540 = "Loaded interfaces";
							Class66.anInt534 = 100;
							client.anInt1816 = 140;
						}
					} else if (client.anInt1816 == 140)
						Class10.method40(10);
				} else {
					var0 = 0;
					if (Class12.aClass104_Sub18_Sub17_Sub1_75 == null)
						Class12.aClass104_Sub18_Sub17_Sub1_75 = Class88.method402(client.aClass61_Sub1_1820, "compass",
								"");
					else
						++var0;

					if (Class103.aClass104_Sub18_Sub17_Sub1_819 == null)
						Class103.aClass104_Sub18_Sub17_Sub1_819 = Class88.method402(client.aClass61_Sub1_1820,
								"mapedge", "");
					else
						++var0;

					if (null == Class99.aClass104_Sub18_Sub17_Sub3Array794)
						Class99.aClass104_Sub18_Sub17_Sub3Array794 = Class12.method50(client.aClass61_Sub1_1820,
								"mapscene", "");
					else
						++var0;

					if (Class104_Sub23.aClass104_Sub18_Sub17_Sub1Array1183 == null)
						Class104_Sub23.aClass104_Sub18_Sub17_Sub1Array1183 = Class48
								.method215(client.aClass61_Sub1_1820, "mapfunction", "");
					else
						++var0;

					if (null == Class77.aClass104_Sub18_Sub17_Sub1Array623)
						Class77.aClass104_Sub18_Sub17_Sub1Array623 = Class48.method215(client.aClass61_Sub1_1820,
								"hitmarks", "");
					else
						++var0;

					if (client.skulls == null)
						client.skulls = Class48.method215(client.aClass61_Sub1_1820,
								"headicons_pk", "");
					else
						++var0;

					if (null == Class70.prayers)
						Class70.prayers = Class48.method215(client.aClass61_Sub1_1820,
								"headicons_prayer", "");
					else
						++var0;

					if (Class104_Sub11.aClass104_Sub18_Sub17_Sub1Array969 == null)
						Class104_Sub11.aClass104_Sub18_Sub17_Sub1Array969 = Class48.method215(client.aClass61_Sub1_1820,
								"headicons_hint", "");
					else
						++var0;

					if (null == Class42.aClass104_Sub18_Sub17_Sub1Array372)
						Class42.aClass104_Sub18_Sub17_Sub1Array372 = Class48.method215(client.aClass61_Sub1_1820,
								"mapmarker", "");
					else
						++var0;

					if (null == Class104_Sub15.aClass104_Sub18_Sub17_Sub1Array1123)
						Class104_Sub15.aClass104_Sub18_Sub17_Sub1Array1123 = Class48
								.method215(client.aClass61_Sub1_1820, "cross", "");
					else
						++var0;

					if (Class44.aClass104_Sub18_Sub17_Sub1Array394 == null)
						Class44.aClass104_Sub18_Sub17_Sub1Array394 = Class48.method215(client.aClass61_Sub1_1820,
								"mapdots", "");
					else
						++var0;

					if (Class104_Sub23.aClass104_Sub18_Sub17_Sub3Array1182 == null)
						Class104_Sub23.aClass104_Sub18_Sub17_Sub3Array1182 = Class12.method50(client.aClass61_Sub1_1820,
								"scrollbar", "");
					else
						++var0;

					if (Class104_Sub15.aClass104_Sub18_Sub17_Sub3Array1125 == null)
						Class104_Sub15.aClass104_Sub18_Sub17_Sub3Array1125 = Class12.method50(client.aClass61_Sub1_1820,
								"mod_icons", "");
					else
						++var0;

					if (Class49.aClass104_Sub18_Sub17_Sub3_417 == null)
						Class49.aClass104_Sub18_Sub17_Sub3_417 = Class11.method48(client.aClass61_Sub1_1820, "mapback",
								"");
					else
						++var0;

					if (var0 < 14) {
						Class66.aString540 = "Loading sprites - " + ((100 * var0) / 14) + "%";
						Class66.anInt534 = 70;
					} else {
						Class104_Sub18_Sub17_Sub2.aClass104_Sub18_Sub17_Sub3Array1603 = Class104_Sub15.aClass104_Sub18_Sub17_Sub3Array1125;
						Class103.aClass104_Sub18_Sub17_Sub1_819.method859();
						var2 = (int) (Math.random() * 21.0D) - 10;
						var3 = (int) (Math.random() * 21.0D) - 10;
						var4 = (int) (Math.random() * 21.0D) - 10;
						var5 = (int) (Math.random() * 41.0D) - 20;

						int var14;
						for (var14 = 0; var14 < Class104_Sub23.aClass104_Sub18_Sub17_Sub1Array1183.length; ++var14)
							Class104_Sub23.aClass104_Sub18_Sub17_Sub1Array1183[var14].method834(var5 + var2,
									var3 + var5, var5 + var4);

						Class99.aClass104_Sub18_Sub17_Sub3Array794[0].method890(var2 + var5, var3 + var5, var4 + var5);
						Class30.anIntArray286 = new int[33];
						Class66.anIntArray549 = new int[33];
						Class42.anIntArray373 = new int[151];
						Class54.anIntArray448 = new int[151];

						int var15;
						int var16;
						int var17;
						for (var14 = 0; var14 < 33; ++var14) {
							var15 = 999;
							var16 = 0;

							for (var17 = 0; var17 < 34; ++var17)
								if (Class49.aClass104_Sub18_Sub17_Sub3_417.aByteArray1616[(var14
										* Class49.aClass104_Sub18_Sub17_Sub3_417.anInt1618) + var17] == 0) {
									if (var15 == 999)
										var15 = var17;
								} else if (var15 != 999) {
									var16 = var17;
									break;
								}

							Class30.anIntArray286[var14] = var15;
							Class66.anIntArray549[var14] = var16 - var15;
						}

						for (var14 = 5; var14 < 156; ++var14) {
							var15 = 999;
							var16 = 0;

							for (var17 = 25; var17 < 172; ++var17)
								if ((Class49.aClass104_Sub18_Sub17_Sub3_417.aByteArray1616[(var14
										* Class49.aClass104_Sub18_Sub17_Sub3_417.anInt1618) + var17] == 0)
										&& ((var17 > 34) || (var14 > 34))) {
									if (var15 == 999)
										var15 = var17;
								} else if (var15 != 999) {
									var16 = var17;
									break;
								}

							Class42.anIntArray373[var14 - 5] = var15 - 25;
							Class54.anIntArray448[var14 - 5] = var16 - var15;
						}

						Class66.aString540 = "Loaded sprites";
						Class66.anInt534 = 70;
						client.anInt1816 = 90;
					}
				}
			}
		}
	}

	public static void method207() {
		final Object var0 = Class52.anObject428;
		synchronized (var0) {
			if (Class52.anInt426 != 0) {
				Class52.anInt426 = 1;

				try {
					Class52.anObject428.wait();
				} catch (final InterruptedException var3) {
					;
				}
			}

		}
	}
}
