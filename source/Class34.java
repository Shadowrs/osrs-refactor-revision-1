public class Class34 implements Interface2 {
	Class59 aClass59_348 = new Class59();
	int anInt344 = 0;
	double aDouble346 = 1.0D;
	int anInt347 = 128;
	Class61 aClass61_342;
	int anInt343;
	Class104_Sub19[] aClass104_Sub19Array345;

	@Override
	public int method1(final int var1, final int var2) {
		return null != aClass104_Sub19Array345[var1] ? aClass104_Sub19Array345[var1].anInt1139 : 0;
	}

	public void method160() {
		for (final Class104_Sub19 element : aClass104_Sub19Array345)
			if (null != element)
				element.method557();

		aClass59_348 = new Class59();
		anInt344 = anInt343;
	}

	@Override
	public boolean method2(final int var1, final int var2) {
		return aClass104_Sub19Array345[var1].aBool1138;
	}

	@Override
	public boolean method3(final int var1, final int var2) {
		return anInt347 == 64;
	}

	public void method161(final int var1) {
		for (final Class104_Sub19 element : aClass104_Sub19Array345) {
			final Class104_Sub19 var3 = element;
			if ((null != var3) && (var3.anInt1144 != 0) && var3.aBool1141) {
				var3.method558(var1);
				var3.aBool1141 = false;
			}
		}

	}

	public Class34(final Class61 var1, final Class61 var2, final int var3, final double var4, final int var6) {
		aClass61_342 = var2;
		anInt343 = var3;
		anInt344 = anInt343;
		aDouble346 = var4;
		anInt347 = var6;
		final int[] var7 = var1.method265(0);
		final int var8 = var7.length;
		aClass104_Sub19Array345 = new Class104_Sub19[var1.method266(0)];

		for (int var9 = 0; var9 < var8; ++var9) {
			final Class104_Sub21 var10 = new Class104_Sub21(var1.method259(0, var7[var9]));
			aClass104_Sub19Array345[var7[var9]] = new Class104_Sub19(var10);
		}

	}

	@Override
	public int[] method4(final int var1, final int var2) {
		final Class104_Sub19 var3 = aClass104_Sub19Array345[var1];
		if (null != var3) {
			if (null != var3.anIntArray1146) {
				aClass59_348.method255(var3);
				var3.aBool1141 = true;
				return var3.anIntArray1146;
			}

			final boolean var4 = var3.method556(aDouble346, anInt347, aClass61_342);
			if (var4) {
				if (anInt344 == 0) {
					final Class104_Sub19 var5 = (Class104_Sub19) aClass59_348.method246();
					var5.method557();
				} else
					--anInt344;

				aClass59_348.method255(var3);
				var3.aBool1141 = true;
				return var3.anIntArray1146;
			}
		}

		return null;
	}

	public void method162(final double var1) {
		aDouble346 = var1;
		method160();
	}

	static final void method163(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final Class17 var6, final Class67 var7) {
		if (client.aBool1794 && ((Class76.aByteArrayArrayArray600[0][var1][var2] & 2) == 0)) {
			if ((Class76.aByteArrayArrayArray600[var0][var1][var2] & 16) != 0)
				return;

			int var8;
			if ((Class76.aByteArrayArrayArray600[var0][var1][var2] & 8) != 0)
				var8 = 0;
			else if ((var0 > 0) && ((Class76.aByteArrayArrayArray600[1][var1][var2] & 2) != 0))
				var8 = var0 - 1;
			else
				var8 = var0;

			if (client.anInt1988 != var8)
				return;
		}

		if (var0 < Class76.anInt601)
			Class76.anInt601 = var0;

		final Class104_Sub18_Sub6 var9 = Class104_Sub18_Sub12.method782(var3);
		int var10;
		int var11;
		if ((var4 != 1) && (var4 != 3)) {
			var10 = var9.anInt1365;
			var11 = var9.anInt1339;
		} else {
			var10 = var9.anInt1339;
			var11 = var9.anInt1365;
		}

		int var12;
		int var13;
		if ((var10 + var1) <= 104) {
			var12 = var1 + (var10 >> 1);
			var13 = ((var10 + 1) >> 1) + var1;
		} else {
			var12 = var1;
			var13 = var1 + 1;
		}

		int var14;
		int var15;
		if ((var11 + var2) <= 104) {
			var14 = var2 + (var11 >> 1);
			var15 = ((var11 + 1) >> 1) + var2;
		} else {
			var14 = var2;
			var15 = var2 + 1;
		}

		final int[][] var16 = Class76.anIntArrayArrayArray611[var0];
		final int var17 = (var16[var13][var15] + var16[var12][var14] + var16[var13][var14] + var16[var12][var15]) >> 2;
		final int var18 = (var10 << 6) + (var1 << 7);
		final int var19 = (var2 << 7) + (var11 << 6);
		int var20 = 1073741824 + (var3 << 14) + (var2 << 7) + var1;
		if (var9.anInt1342 == 0)
			var20 -= Integer.MIN_VALUE;

		int var21 = var5 + (var4 << 6);
		if (var9.anInt1358 == 1)
			var21 += 256;

		if (var9.method748())
			Class44.method190(var0, var1, var2, var9, var4);

		Object var22;
		if (var5 == 22) {
			if (!client.aBool1794 || (var9.anInt1342 != 0) || (var9.anInt1363 == 1) || var9.aBool1362) {
				if ((var9.anInt1346 == -1) && (null == var9.anIntArray1338))
					var22 = var9.method743(22, var4, var16, var18, var17, var19);
				else
					var22 = new Class104_Sub18_Sub16_Sub1(var3, 22, var4, var0, var1, var2, var9.anInt1346, true,
							(Class104_Sub18_Sub16) null);

				var6.method116(var0, var1, var2, var17, (Class104_Sub18_Sub16) var22, var20, var21);
				if ((var9.anInt1363 == 1) && (var7 != null))
					var7.method313(var1, var2);

			}
		} else {
			int var23;
			if ((var5 != 10) && (var5 != 11)) {
				if (var5 >= 12) {
					if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
						var22 = var9.method743(var5, var4, var16, var18, var17, var19);
					else
						var22 = new Class104_Sub18_Sub16_Sub1(var3, var5, var4, var0, var1, var2, var9.anInt1346, true,
								(Class104_Sub18_Sub16) null);

					var6.method83(var0, var1, var2, var17, 1, 1, (Class104_Sub18_Sub16) var22, 0, var20, var21);
					if ((var5 >= 12) && (var5 <= 17) && (var5 != 13) && (var0 > 0))
						Class41.anIntArrayArrayArray369[var0][var1][var2] |= 2340;

					if ((var9.anInt1363 != 0) && (null != var7))
						var7.method306(var1, var2, var10, var11, var9.aBool1340);

				} else if (var5 == 0) {
					if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
						var22 = var9.method743(0, var4, var16, var18, var17, var19);
					else
						var22 = new Class104_Sub18_Sub16_Sub1(var3, 0, var4, var0, var1, var2, var9.anInt1346, true,
								(Class104_Sub18_Sub16) null);

					var6.method75(var0, var1, var2, var17, (Class104_Sub18_Sub16) var22, (Class104_Sub18_Sub16) null,
							Class76.anIntArray606[var4], 0, var20, var21);
					if (var4 == 0) {
						if (var9.aBool1354) {
							Class76.aByteArrayArrayArray605[var0][var1][var2] = 50;
							Class76.aByteArrayArrayArray605[var0][var1][var2 + 1] = 50;
						}

						if (var9.aBool1345)
							Class41.anIntArrayArrayArray369[var0][var1][var2] |= 585;
					} else if (var4 == 1) {
						if (var9.aBool1354) {
							Class76.aByteArrayArrayArray605[var0][var1][1 + var2] = 50;
							Class76.aByteArrayArrayArray605[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var9.aBool1345)
							Class41.anIntArrayArrayArray369[var0][var1][1 + var2] |= 1170;
					} else if (var4 == 2) {
						if (var9.aBool1354) {
							Class76.aByteArrayArrayArray605[var0][1 + var1][var2] = 50;
							Class76.aByteArrayArrayArray605[var0][1 + var1][1 + var2] = 50;
						}

						if (var9.aBool1345)
							Class41.anIntArrayArrayArray369[var0][var1 + 1][var2] |= 585;
					} else if (var4 == 3) {
						if (var9.aBool1354) {
							Class76.aByteArrayArrayArray605[var0][var1][var2] = 50;
							Class76.aByteArrayArrayArray605[var0][1 + var1][var2] = 50;
						}

						if (var9.aBool1345)
							Class41.anIntArrayArrayArray369[var0][var1][var2] |= 1170;
					}

					if ((var9.anInt1363 != 0) && (null != var7))
						var7.method303(var1, var2, var5, var4, var9.aBool1340);

					if (var9.anInt1348 != 16)
						var6.method78(var0, var1, var2, var9.anInt1348);

				} else if (var5 == 1) {
					if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
						var22 = var9.method743(1, var4, var16, var18, var17, var19);
					else
						var22 = new Class104_Sub18_Sub16_Sub1(var3, 1, var4, var0, var1, var2, var9.anInt1346, true,
								(Class104_Sub18_Sub16) null);

					var6.method75(var0, var1, var2, var17, (Class104_Sub18_Sub16) var22, (Class104_Sub18_Sub16) null,
							Class76.anIntArray610[var4], 0, var20, var21);
					if (var9.aBool1354)
						if (var4 == 0)
							Class76.aByteArrayArrayArray605[var0][var1][1 + var2] = 50;
						else if (var4 == 1)
							Class76.aByteArrayArrayArray605[var0][var1 + 1][1 + var2] = 50;
						else if (var4 == 2)
							Class76.aByteArrayArrayArray605[var0][var1 + 1][var2] = 50;
						else if (var4 == 3)
							Class76.aByteArrayArrayArray605[var0][var1][var2] = 50;

					if ((var9.anInt1363 != 0) && (null != var7))
						var7.method303(var1, var2, var5, var4, var9.aBool1340);

				} else {
					int var26;
					Object var28;
					if (var5 == 2) {
						var26 = (1 + var4) & 3;
						Object var27;
						if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null)) {
							var27 = var9.method743(2, var4 + 4, var16, var18, var17, var19);
							var28 = var9.method743(2, var26, var16, var18, var17, var19);
						} else {
							var27 = new Class104_Sub18_Sub16_Sub1(var3, 2, var4 + 4, var0, var1, var2, var9.anInt1346,
									true, (Class104_Sub18_Sub16) null);
							var28 = new Class104_Sub18_Sub16_Sub1(var3, 2, var26, var0, var1, var2, var9.anInt1346,
									true, (Class104_Sub18_Sub16) null);
						}

						var6.method75(var0, var1, var2, var17, (Class104_Sub18_Sub16) var27,
								(Class104_Sub18_Sub16) var28, Class76.anIntArray606[var4], Class76.anIntArray606[var26],
								var20, var21);
						if (var9.aBool1345)
							if (var4 == 0) {
								Class41.anIntArrayArrayArray369[var0][var1][var2] |= 585;
								Class41.anIntArrayArrayArray369[var0][var1][1 + var2] |= 1170;
							} else if (var4 == 1) {
								Class41.anIntArrayArrayArray369[var0][var1][1 + var2] |= 1170;
								Class41.anIntArrayArrayArray369[var0][1 + var1][var2] |= 585;
							} else if (var4 == 2) {
								Class41.anIntArrayArrayArray369[var0][var1 + 1][var2] |= 585;
								Class41.anIntArrayArrayArray369[var0][var1][var2] |= 1170;
							} else if (var4 == 3) {
								Class41.anIntArrayArrayArray369[var0][var1][var2] |= 1170;
								Class41.anIntArrayArrayArray369[var0][var1][var2] |= 585;
							}

						if ((var9.anInt1363 != 0) && (var7 != null))
							var7.method303(var1, var2, var5, var4, var9.aBool1340);

						if (var9.anInt1348 != 16)
							var6.method78(var0, var1, var2, var9.anInt1348);

					} else if (var5 == 3) {
						if ((var9.anInt1346 == -1) && (null == var9.anIntArray1338))
							var22 = var9.method743(3, var4, var16, var18, var17, var19);
						else
							var22 = new Class104_Sub18_Sub16_Sub1(var3, 3, var4, var0, var1, var2, var9.anInt1346, true,
									(Class104_Sub18_Sub16) null);

						var6.method75(var0, var1, var2, var17, (Class104_Sub18_Sub16) var22,
								(Class104_Sub18_Sub16) null, Class76.anIntArray610[var4], 0, var20, var21);
						if (var9.aBool1354)
							if (var4 == 0)
								Class76.aByteArrayArrayArray605[var0][var1][1 + var2] = 50;
							else if (var4 == 1)
								Class76.aByteArrayArrayArray605[var0][var1 + 1][var2 + 1] = 50;
							else if (var4 == 2)
								Class76.aByteArrayArrayArray605[var0][1 + var1][var2] = 50;
							else if (var4 == 3)
								Class76.aByteArrayArrayArray605[var0][var1][var2] = 50;

						if ((var9.anInt1363 != 0) && (null != var7))
							var7.method303(var1, var2, var5, var4, var9.aBool1340);

					} else if (var5 == 9) {
						if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
							var22 = var9.method743(var5, var4, var16, var18, var17, var19);
						else
							var22 = new Class104_Sub18_Sub16_Sub1(var3, var5, var4, var0, var1, var2, var9.anInt1346,
									true, (Class104_Sub18_Sub16) null);

						var6.method83(var0, var1, var2, var17, 1, 1, (Class104_Sub18_Sub16) var22, 0, var20, var21);
						if ((var9.anInt1363 != 0) && (var7 != null))
							var7.method306(var1, var2, var10, var11, var9.aBool1340);

						if (var9.anInt1348 != 16)
							var6.method78(var0, var1, var2, var9.anInt1348);

					} else if (var5 == 4) {
						if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
							var22 = var9.method743(4, var4, var16, var18, var17, var19);
						else
							var22 = new Class104_Sub18_Sub16_Sub1(var3, 4, var4, var0, var1, var2, var9.anInt1346, true,
									(Class104_Sub18_Sub16) null);

						var6.method84(var0, var1, var2, var17, (Class104_Sub18_Sub16) var22,
								(Class104_Sub18_Sub16) null, Class76.anIntArray606[var4], 0, 0, 0, var20, var21);
					} else if (var5 == 5) {
						var26 = 16;
						var23 = var6.method85(var0, var1, var2);
						if (var23 != 0)
							var26 = Class104_Sub18_Sub12.method782((var23 >> 14) & 32767).anInt1348;

						if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
							var28 = var9.method743(4, var4, var16, var18, var17, var19);
						else
							var28 = new Class104_Sub18_Sub16_Sub1(var3, 4, var4, var0, var1, var2, var9.anInt1346, true,
									(Class104_Sub18_Sub16) null);

						var6.method84(var0, var1, var2, var17, (Class104_Sub18_Sub16) var28,
								(Class104_Sub18_Sub16) null, Class76.anIntArray606[var4], 0,
								Class76.anIntArray608[var4] * var26, Class76.anIntArray612[var4] * var26, var20, var21);
					} else if (var5 == 6) {
						var26 = 8;
						var23 = var6.method85(var0, var1, var2);
						if (var23 != 0)
							var26 = Class104_Sub18_Sub12.method782((var23 >> 14) & 32767).anInt1348 / 2;

						if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
							var28 = var9.method743(4, var4 + 4, var16, var18, var17, var19);
						else
							var28 = new Class104_Sub18_Sub16_Sub1(var3, 4, var4 + 4, var0, var1, var2, var9.anInt1346,
									true, (Class104_Sub18_Sub16) null);

						var6.method84(var0, var1, var2, var17, (Class104_Sub18_Sub16) var28,
								(Class104_Sub18_Sub16) null, 256, var4, Class76.anIntArray613[var4] * var26,
								var26 * Class76.anIntArray614[var4], var20, var21);
					} else if (var5 == 7) {
						var23 = (var4 + 2) & 3;
						if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
							var22 = var9.method743(4, 4 + var23, var16, var18, var17, var19);
						else
							var22 = new Class104_Sub18_Sub16_Sub1(var3, 4, var23 + 4, var0, var1, var2, var9.anInt1346,
									true, (Class104_Sub18_Sub16) null);

						var6.method84(var0, var1, var2, var17, (Class104_Sub18_Sub16) var22,
								(Class104_Sub18_Sub16) null, 256, var23, 0, 0, var20, var21);
					} else if (var5 == 8) {
						var26 = 8;
						var23 = var6.method85(var0, var1, var2);
						if (var23 != 0)
							var26 = Class104_Sub18_Sub12.method782((var23 >> 14) & 32767).anInt1348 / 2;

						final int var29 = (var4 + 2) & 3;
						Object var30;
						if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null)) {
							var28 = var9.method743(4, 4 + var4, var16, var18, var17, var19);
							var30 = var9.method743(4, 4 + var29, var16, var18, var17, var19);
						} else {
							var28 = new Class104_Sub18_Sub16_Sub1(var3, 4, 4 + var4, var0, var1, var2, var9.anInt1346,
									true, (Class104_Sub18_Sub16) null);
							var30 = new Class104_Sub18_Sub16_Sub1(var3, 4, 4 + var29, var0, var1, var2, var9.anInt1346,
									true, (Class104_Sub18_Sub16) null);
						}

						var6.method84(var0, var1, var2, var17, (Class104_Sub18_Sub16) var28,
								(Class104_Sub18_Sub16) var30, 256, var4, var26 * Class76.anIntArray613[var4],
								Class76.anIntArray614[var4] * var26, var20, var21);
					}
				}
			} else {
				if ((var9.anInt1346 == -1) && (null == var9.anIntArray1338))
					var22 = var9.method743(10, var4, var16, var18, var17, var19);
				else
					var22 = new Class104_Sub18_Sub16_Sub1(var3, 10, var4, var0, var1, var2, var9.anInt1346, true,
							(Class104_Sub18_Sub16) null);

				if ((var22 != null) && var6.method83(var0, var1, var2, var17, var10, var11,
						(Class104_Sub18_Sub16) var22, var5 == 11 ? 256 : 0, var20, var21) && var9.aBool1354) {
					var23 = 15;
					if (var22 instanceof Class104_Sub18_Sub16_Sub4) {
						var23 = ((Class104_Sub18_Sub16_Sub4) var22).method814() / 4;
						if (var23 > 30)
							var23 = 30;
					}

					for (int var24 = 0; var24 <= var10; ++var24)
						for (int var25 = 0; var25 <= var11; ++var25)
							if (var23 > Class76.aByteArrayArrayArray605[var0][var24 + var1][var25 + var2])
								Class76.aByteArrayArrayArray605[var0][var1 + var24][var2 + var25] = (byte) var23;
				}

				if ((var9.anInt1363 != 0) && (var7 != null))
					var7.method306(var1, var2, var10, var11, var9.aBool1340);

			}
		}
	}

	public static Class104_Sub18_Sub17_Sub1 method164() {
		final Class104_Sub18_Sub17_Sub1 var0 = new Class104_Sub18_Sub17_Sub1();
		var0.anInt1590 = Class12.anInt72;
		var0.anInt1591 = Class12.anInt69;
		var0.anInt1589 = Class12.anIntArray70[0];
		var0.anInt1587 = Class12.anIntArray71[0];
		var0.anInt1593 = Class78.anIntArray626[0];
		var0.anInt1588 = Class69.anIntArray564[0];
		final int var1 = var0.anInt1588 * var0.anInt1593;
		final byte[] var2 = Class41.aByteArrayArray368[0];
		var0.anIntArray1592 = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3)
			var0.anIntArray1592[var3] = Class12.anIntArray68[var2[var3] & 255];

		Class12.anIntArray70 = null;
		Class12.anIntArray71 = null;
		Class78.anIntArray626 = null;
		Class69.anIntArray564 = null;
		Class12.anIntArray68 = null;
		Class41.aByteArrayArray368 = null;
		return var0;
	}

	static Class104_Sub18_Sub15 method165(final int var0) {
		final Class104_Sub18_Sub15 var1 = (Class104_Sub18_Sub15) Class104_Sub18_Sub3.aClass56_1268.method236(var0);
		if (null != var1)
			return var1;
		else {
			final Class61 var2 = Class7.aClass61_43;
			final Class61 var3 = Class104_Sub18_Sub3.aClass61_1259;
			boolean var4 = true;
			final int[] var5 = var2.method265(var0);

			for (final int element : var5) {
				final byte[] var7 = var2.method262(var0, element);
				if (null == var7)
					var4 = false;
				else {
					final int var8 = ((var7[0] & 255) << 8) | (var7[1] & 255);
					final byte[] var9 = var3.method262(var8, 0);
					if (null == var9)
						var4 = false;
				}
			}

			Class104_Sub18_Sub15 var10;
			if (!var4)
				var10 = null;
			else
				try {
					var10 = new Class104_Sub18_Sub15(var2, var3, var0, false);
				} catch (final Exception var12) {
					var10 = null;
				}

			return var10;
		}
	}

	static boolean method166(final String var0) {
		if (var0 == null)
			return false;
		else {
			for (int var1 = 0; var1 < client.anInt2045; ++var1) {
				final Class78 var2 = client.aClass78Array2046[var1];
				if (var0.equalsIgnoreCase(var2.aString625))
					return true;

				if (var0.equalsIgnoreCase(var2.aString624))
					return true;
			}

			return false;
		}
	}
}
