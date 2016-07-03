public class Class104_Sub18_Sub16_Sub4 extends Class104_Sub18_Sub16 {
	int anInt1529 = 0;
	int anInt1585 = 0;
	byte aByte1544 = 0;
	int anInt1545 = 0;
	public boolean aBool1551 = false;
	int[] anIntArray1530;
	int[] anIntArray1531;
	int[] anIntArray1584;
	int[] anIntArray1534;
	int[] anIntArray1533;
	int[] anIntArray1536;
	int[] anIntArray1583;
	int[] anIntArray1538;
	int[] anIntArray1539;
	byte[] aByteArray1540;
	byte[] aByteArray1535;
	short[] aShortArray1525;
	byte[] aByteArray1542;
	int[] anIntArray1546;
	int[] anIntArray1579;
	int[] anIntArray1570;
	static byte[] aByteArray1575 = new byte[1];
	int anInt1552;
	int anInt1553;
	int anInt1554;
	int anInt1556;
	int anInt1555;
	static int anInt1567;
	static int anInt1576;
	static int anInt1577;
	public static int anInt1548 = 0;
	static byte[] aByteArray1532 = new byte[1];
	int[][] anIntArrayArray1549;
	int[][] anIntArrayArray1550;
	static Class104_Sub18_Sub16_Sub4 aClass104_Sub18_Sub16_Sub4_1564 = new Class104_Sub18_Sub16_Sub4();
	static Class104_Sub18_Sub16_Sub4 aClass104_Sub18_Sub16_Sub4_1527 = new Class104_Sub18_Sub16_Sub4();
	static boolean[] aBoolArray1557 = new boolean[4096];
	static boolean[] aBoolArray1558 = new boolean[4096];
	static int[] anIntArray1559 = new int[4096];
	static int[] anIntArray1560 = new int[4096];
	static int[] anIntArray1561 = new int[4096];
	static int[] anIntArray1581 = new int[4096];
	static int[] anIntArray1563 = new int[4096];
	static int[] anIntArray1582 = new int[4096];
	static int[] anIntArray1565 = new int[1600];
	static int[][] anIntArrayArray1566 = new int[1600][512];
	static int[] anIntArray1572 = new int[12];
	static int[][] anIntArrayArray1568 = new int[12][2000];
	static int[] anIntArray1569 = new int[2000];
	static int[] anIntArray1562 = new int[2000];
	static int[] anIntArray1571 = new int[12];
	static int[] anIntArray1547 = new int[10];
	static int[] anIntArray1543 = new int[10];
	static int[] anIntArray1541 = new int[10];
	public static boolean aBool1578 = false;
	public static int anInt1526 = 0;
	public static int anInt1580 = 0;
	public static int[] anIntArray1537 = new int[1000];
	static int[] anIntArray1573;
	static int[] anIntArray1528;
	static int[] anIntArray1574;
	static int[] anIntArray1586;

	public Class104_Sub18_Sub16_Sub4(final Class104_Sub18_Sub16_Sub4[] var1, final int var2) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		anInt1529 = 0;
		anInt1585 = 0;
		anInt1545 = 0;
		aByte1544 = -1;

		int var7;
		Class104_Sub18_Sub16_Sub4 var8;
		for (var7 = 0; var7 < var2; ++var7) {
			var8 = var1[var7];
			if (var8 != null) {
				anInt1529 += var8.anInt1529;
				anInt1585 += var8.anInt1585;
				anInt1545 += var8.anInt1545;
				if (var8.aByteArray1540 != null)
					var3 = true;
				else {
					if (aByte1544 == -1)
						aByte1544 = var8.aByte1544;

					if (aByte1544 != var8.aByte1544)
						var3 = true;
				}

				var4 |= var8.aByteArray1535 != null;
				var5 |= var8.aShortArray1525 != null;
				var6 |= var8.aByteArray1542 != null;
			}
		}

		anIntArray1530 = new int[anInt1529];
		anIntArray1531 = new int[anInt1529];
		anIntArray1584 = new int[anInt1529];
		anIntArray1534 = new int[anInt1585];
		anIntArray1533 = new int[anInt1585];
		anIntArray1536 = new int[anInt1585];
		anIntArray1583 = new int[anInt1585];
		anIntArray1538 = new int[anInt1585];
		anIntArray1539 = new int[anInt1585];
		if (var3)
			aByteArray1540 = new byte[anInt1585];

		if (var4)
			aByteArray1535 = new byte[anInt1585];

		if (var5)
			aShortArray1525 = new short[anInt1585];

		if (var6)
			aByteArray1542 = new byte[anInt1585];

		if (anInt1545 > 0) {
			anIntArray1546 = new int[anInt1545];
			anIntArray1579 = new int[anInt1545];
			anIntArray1570 = new int[anInt1545];
		}

		anInt1529 = 0;
		anInt1585 = 0;
		anInt1545 = 0;

		for (var7 = 0; var7 < var2; ++var7) {
			var8 = var1[var7];
			if (var8 != null) {
				int var9;
				for (var9 = 0; var9 < var8.anInt1585; ++var9) {
					anIntArray1534[anInt1585] = var8.anIntArray1534[var9] + anInt1529;
					anIntArray1533[anInt1585] = var8.anIntArray1533[var9] + anInt1529;
					anIntArray1536[anInt1585] = var8.anIntArray1536[var9] + anInt1529;
					anIntArray1583[anInt1585] = var8.anIntArray1583[var9];
					anIntArray1538[anInt1585] = var8.anIntArray1538[var9];
					anIntArray1539[anInt1585] = var8.anIntArray1539[var9];
					if (var3)
						if (var8.aByteArray1540 != null)
							aByteArray1540[anInt1585] = var8.aByteArray1540[var9];
						else
							aByteArray1540[anInt1585] = var8.aByte1544;

					if (var4 && (var8.aByteArray1535 != null))
						aByteArray1535[anInt1585] = var8.aByteArray1535[var9];

					if (var5)
						if (var8.aShortArray1525 != null)
							aShortArray1525[anInt1585] = var8.aShortArray1525[var9];
						else
							aShortArray1525[anInt1585] = -1;

					if (var6)
						if ((var8.aByteArray1542 != null) && (var8.aByteArray1542[var9] != -1))
							aByteArray1542[anInt1585] = (byte) (var8.aByteArray1542[var9] + anInt1545);
						else
							aByteArray1542[anInt1585] = -1;

					++anInt1585;
				}

				for (var9 = 0; var9 < var8.anInt1545; ++var9) {
					anIntArray1546[anInt1545] = var8.anIntArray1546[var9] + anInt1529;
					anIntArray1579[anInt1545] = var8.anIntArray1579[var9] + anInt1529;
					anIntArray1570[anInt1545] = var8.anIntArray1570[var9] + anInt1529;
					++anInt1545;
				}

				for (var9 = 0; var9 < var8.anInt1529; ++var9) {
					anIntArray1530[anInt1529] = var8.anIntArray1530[var9];
					anIntArray1531[anInt1529] = var8.anIntArray1531[var9];
					anIntArray1584[anInt1529] = var8.anIntArray1584[var9];
					++anInt1529;
				}
			}
		}

	}

	public Class104_Sub18_Sub16_Sub4 method811(final boolean var1) {
		if (!var1 && (aByteArray1575.length < anInt1585))
			aByteArray1575 = new byte[anInt1585 + 100];

		return method830(var1, aClass104_Sub18_Sub16_Sub4_1564, aByteArray1575);
	}

	public void method812() {
		if (anInt1552 != 1) {
			anInt1552 = 1;
			anInt1467 = 0;
			anInt1553 = 0;
			anInt1554 = 0;

			for (int var1 = 0; var1 < anInt1529; ++var1) {
				final int var2 = anIntArray1530[var1];
				final int var3 = anIntArray1531[var1];
				final int var4 = anIntArray1584[var1];
				if (-var3 > anInt1467)
					anInt1467 = -var3;

				if (var3 > anInt1553)
					anInt1553 = var3;

				final int var5 = (var2 * var2) + (var4 * var4);
				if (var5 > anInt1554)
					anInt1554 = var5;
			}

			anInt1554 = (int) (Math.sqrt(anInt1554) + 0.99D);
			anInt1556 = (int) (Math.sqrt((anInt1554 * anInt1554) + (anInt1467 * anInt1467)) + 0.99D);
			anInt1555 = anInt1556 + (int) (Math.sqrt((anInt1554 * anInt1554) + (anInt1553 * anInt1553)) + 0.99D);
		}
	}

	void method813() {
		if (anInt1552 != 2) {
			anInt1552 = 2;
			anInt1554 = 0;

			for (int var1 = 0; var1 < anInt1529; ++var1) {
				final int var2 = anIntArray1530[var1];
				final int var3 = anIntArray1531[var1];
				final int var4 = anIntArray1584[var1];
				final int var5 = (var2 * var2) + (var4 * var4) + (var3 * var3);
				if (var5 > anInt1554)
					anInt1554 = var5;
			}

			anInt1554 = (int) (Math.sqrt(anInt1554) + 0.99D);
			anInt1556 = anInt1554;
			anInt1555 = anInt1554 + anInt1554;
		}
	}

	public int method814() {
		method812();
		return anInt1554;
	}

	public void method815(final Class104_Sub18_Sub15 var1, final int var2) {
		if (anIntArrayArray1549 != null) {
			final Class5 var3 = var1.aClass5Array1465[var2];
			final Class104_Sub23 var4 = var3.aClass104_Sub23_23;
			anInt1567 = 0;
			anInt1576 = 0;
			anInt1577 = 0;

			for (int var5 = 0; var5 < var3.anInt24; ++var5) {
				final int var6 = var3.anIntArray25[var5];
				method817(var4.anIntArray1179[var6], var4.anIntArrayArray1177[var6], var3.anIntArray26[var5],
						var3.anIntArray27[var5], var3.anIntArray28[var5]);
			}

			anInt1552 = 0;
		}
	}

	public void method816(final Class104_Sub18_Sub15 var1, final int var2, final Class104_Sub18_Sub15 var3,
			final int var4, final int[] var5) {
		if (var2 != -1)
			if ((var5 != null) && (var4 != -1)) {
				final Class5 var6 = var1.aClass5Array1465[var2];
				final Class5 var7 = var3.aClass5Array1465[var4];
				final Class104_Sub23 var8 = var6.aClass104_Sub23_23;
				anInt1567 = 0;
				anInt1576 = 0;
				anInt1577 = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.anInt24; ++var11) {
					for (var12 = var6.anIntArray25[var11]; var12 > var10; var10 = var5[var13++])
						;

					if ((var12 != var10) || (var8.anIntArray1179[var12] == 0))
						method817(var8.anIntArray1179[var12], var8.anIntArrayArray1177[var12], var6.anIntArray26[var11],
								var6.anIntArray27[var11], var6.anIntArray28[var11]);
				}

				anInt1567 = 0;
				anInt1576 = 0;
				anInt1577 = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.anInt24; ++var11) {
					for (var12 = var7.anIntArray25[var11]; var12 > var10; var10 = var5[var13++])
						;

					if ((var12 == var10) || (var8.anIntArray1179[var12] == 0))
						method817(var8.anIntArray1179[var12], var8.anIntArrayArray1177[var12], var7.anIntArray26[var11],
								var7.anIntArray27[var11], var7.anIntArray28[var11]);
				}

				anInt1552 = 0;
			} else
				method815(var1, var2);
	}

	void method817(final int var1, final int[] var2, final int var3, final int var4, final int var5) {
		final int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			anInt1567 = 0;
			anInt1576 = 0;
			anInt1577 = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				final int var9 = var2[var8];
				if (var9 < anIntArrayArray1549.length) {
					final int[] var10 = anIntArrayArray1549[var9];

					for (var11 = 0; var11 < var10.length; ++var11) {
						var12 = var10[var11];
						anInt1567 += anIntArray1530[var12];
						anInt1576 += anIntArray1531[var12];
						anInt1577 += anIntArray1584[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				anInt1567 = (anInt1567 / var7) + var3;
				anInt1576 = (anInt1576 / var7) + var4;
				anInt1577 = (anInt1577 / var7) + var5;
			} else {
				anInt1567 = var3;
				anInt1576 = var4;
				anInt1577 = var5;
			}

		} else {
			int[] var13;
			int var14;
			if (var1 == 1)
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < anIntArrayArray1549.length) {
						var13 = anIntArrayArray1549[var8];

						for (var14 = 0; var14 < var13.length; ++var14) {
							var11 = var13[var14];
							anIntArray1530[var11] += var3;
							anIntArray1531[var11] += var4;
							anIntArray1584[var11] += var5;
						}
					}
				}
			else if (var1 == 2)
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < anIntArrayArray1549.length) {
						var13 = anIntArrayArray1549[var8];

						for (var14 = 0; var14 < var13.length; ++var14) {
							var11 = var13[var14];
							anIntArray1530[var11] -= anInt1567;
							anIntArray1531[var11] -= anInt1576;
							anIntArray1584[var11] -= anInt1577;
							var12 = (var3 & 255) * 8;
							final int var15 = (var4 & 255) * 8;
							final int var16 = (var5 & 255) * 8;
							int var17;
							int var18;
							int var19;
							if (var16 != 0) {
								var17 = anIntArray1573[var16];
								var18 = anIntArray1528[var16];
								var19 = ((anIntArray1531[var11] * var17) + (anIntArray1530[var11] * var18)) >> 16;
								anIntArray1531[var11] = ((anIntArray1531[var11] * var18)
										- (anIntArray1530[var11] * var17)) >> 16;
								anIntArray1530[var11] = var19;
							}

							if (var12 != 0) {
								var17 = anIntArray1573[var12];
								var18 = anIntArray1528[var12];
								var19 = ((anIntArray1531[var11] * var18) - (anIntArray1584[var11] * var17)) >> 16;
								anIntArray1584[var11] = ((anIntArray1531[var11] * var17)
										+ (anIntArray1584[var11] * var18)) >> 16;
								anIntArray1531[var11] = var19;
							}

							if (var15 != 0) {
								var17 = anIntArray1573[var15];
								var18 = anIntArray1528[var15];
								var19 = ((anIntArray1584[var11] * var17) + (anIntArray1530[var11] * var18)) >> 16;
								anIntArray1584[var11] = ((anIntArray1584[var11] * var18)
										- (anIntArray1530[var11] * var17)) >> 16;
								anIntArray1530[var11] = var19;
							}

							anIntArray1530[var11] += anInt1567;
							anIntArray1531[var11] += anInt1576;
							anIntArray1584[var11] += anInt1577;
						}
					}
				}
			else if (var1 == 3)
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < anIntArrayArray1549.length) {
						var13 = anIntArrayArray1549[var8];

						for (var14 = 0; var14 < var13.length; ++var14) {
							var11 = var13[var14];
							anIntArray1530[var11] -= anInt1567;
							anIntArray1531[var11] -= anInt1576;
							anIntArray1584[var11] -= anInt1577;
							anIntArray1530[var11] = (anIntArray1530[var11] * var3) / 128;
							anIntArray1531[var11] = (anIntArray1531[var11] * var4) / 128;
							anIntArray1584[var11] = (anIntArray1584[var11] * var5) / 128;
							anIntArray1530[var11] += anInt1567;
							anIntArray1531[var11] += anInt1576;
							anIntArray1584[var11] += anInt1577;
						}
					}
				}
			else if (var1 == 5)
				if ((anIntArrayArray1550 != null) && (aByteArray1535 != null))
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < anIntArrayArray1550.length) {
							var13 = anIntArrayArray1550[var8];

							for (var14 = 0; var14 < var13.length; ++var14) {
								var11 = var13[var14];
								var12 = (aByteArray1535[var11] & 255) + (var3 * 8);
								if (var12 < 0)
									var12 = 0;
								else if (var12 > 255)
									var12 = 255;

								aByteArray1535[var11] = (byte) var12;
							}
						}
					}
		}
	}

	public void method818() {
		for (int var1 = 0; var1 < anInt1529; ++var1) {
			final int var2 = anIntArray1530[var1];
			anIntArray1530[var1] = anIntArray1584[var1];
			anIntArray1584[var1] = -var2;
		}

		anInt1552 = 0;
	}

	public void method819() {
		for (int var1 = 0; var1 < anInt1529; ++var1) {
			anIntArray1530[var1] = -anIntArray1530[var1];
			anIntArray1584[var1] = -anIntArray1584[var1];
		}

		anInt1552 = 0;
	}

	public void method820() {
		for (int var1 = 0; var1 < anInt1529; ++var1) {
			final int var2 = anIntArray1584[var1];
			anIntArray1584[var1] = anIntArray1530[var1];
			anIntArray1530[var1] = -var2;
		}

		anInt1552 = 0;
	}

	public void method821(final int var1) {
		final int var2 = anIntArray1573[var1];
		final int var3 = anIntArray1528[var1];

		for (int var4 = 0; var4 < anInt1529; ++var4) {
			final int var5 = ((anIntArray1531[var4] * var3) - (anIntArray1584[var4] * var2)) >> 16;
			anIntArray1584[var4] = ((anIntArray1531[var4] * var2) + (anIntArray1584[var4] * var3)) >> 16;
			anIntArray1531[var4] = var5;
		}

		anInt1552 = 0;
	}

	public void method822(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1529; ++var4) {
			anIntArray1530[var4] += var1;
			anIntArray1531[var4] += var2;
			anIntArray1584[var4] += var3;
		}

		anInt1552 = 0;
	}

	public void method823(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1529; ++var4) {
			anIntArray1530[var4] = (anIntArray1530[var4] * var1) / 128;
			anIntArray1531[var4] = (anIntArray1531[var4] * var2) / 128;
			anIntArray1584[var4] = (anIntArray1584[var4] * var3) / 128;
		}

		anInt1552 = 0;
	}

	public final void method824(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		anIntArray1565[0] = -1;
		if ((anInt1552 != 2) && (anInt1552 != 1))
			method813();

		final int var8 = Class104_Sub18_Sub17_Sub4.anInt1677;
		final int var9 = Class104_Sub18_Sub17_Sub4.anInt1688;
		final int var12 = anIntArray1573[var2];
		final int var13 = anIntArray1528[var2];
		final int var14 = anIntArray1573[var3];
		final int var15 = anIntArray1528[var3];
		final int var16 = anIntArray1573[var4];
		final int var17 = anIntArray1528[var4];
		final int var18 = ((var6 * var16) + (var7 * var17)) >> 16;

		for (int var19 = 0; var19 < anInt1529; ++var19) {
			int var20 = anIntArray1530[var19];
			int var21 = anIntArray1531[var19];
			int var22 = anIntArray1584[var19];
			int var23;
			if (var3 != 0) {
				var23 = ((var21 * var14) + (var20 * var15)) >> 16;
				var21 = ((var21 * var15) - (var20 * var14)) >> 16;
				var20 = var23;
			}

			if (var2 != 0) {
				var23 = ((var22 * var12) + (var20 * var13)) >> 16;
				var22 = ((var22 * var13) - (var20 * var12)) >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = ((var21 * var17) - (var22 * var16)) >> 16;
			var22 = ((var21 * var16) + (var22 * var17)) >> 16;
			anIntArray1561[var19] = var22 - var18;
			anIntArray1559[var19] = var8 + ((var20 << 9) / var22);
			anIntArray1560[var19] = var9 + ((var23 << 9) / var22);
			if (anInt1545 > 0) {
				anIntArray1581[var19] = var20;
				anIntArray1563[var19] = var23;
				anIntArray1582[var19] = var22;
			}
		}

		try {
			method827(false, false, 0);
		} catch (final Exception var25) {
			;
		}

	}

	@Override
	void method787(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int var9) {
		anIntArray1565[0] = -1;
		if (anInt1552 != 1)
			method812();

		final int var10 = ((var8 * var5) - (var6 * var4)) >> 16;
		final int var11 = ((var7 * var2) + (var10 * var3)) >> 16;
		final int var12 = (anInt1554 * var3) >> 16;
		final int var13 = var11 + var12;
		if ((var13 > 50) && (var11 < 3500)) {
			final int var14 = ((var8 * var4) + (var6 * var5)) >> 16;
			int var15 = (var14 - anInt1554) << 9;
			if ((var15 / var13) < Class104_Sub18_Sub17_Sub4.anInt1681) {
				int var16 = (var14 + anInt1554) << 9;
				if ((var16 / var13) > Class104_Sub18_Sub17_Sub4.anInt1689) {
					final int var17 = ((var7 * var3) - (var10 * var2)) >> 16;
					final int var18 = (anInt1554 * var2) >> 16;
					int var19 = (var17 + var18) << 9;
					if ((var19 / var13) > Class104_Sub18_Sub17_Sub4.anInt1682) {
						final int var20 = var18 + ((anInt1467 * var3) >> 16);
						int var21 = (var17 - var20) << 9;
						if ((var21 / var13) < Class104_Sub18_Sub17_Sub4.anInt1684) {
							final int var22 = var12 + ((anInt1467 * var2) >> 16);
							boolean var23 = false;
							boolean var24 = false;
							if ((var11 - var22) <= 50)
								var24 = true;

							final boolean var25 = var24 || (anInt1545 > 0);
							boolean var26 = false;
							int var27;
							int var28;
							int var29;
							if ((var9 > 0) && aBool1578) {
								var27 = var11 - var12;
								if (var27 <= 50)
									var27 = 50;

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var27;
								} else {
									var16 /= var13;
									var15 /= var27;
								}

								if (var17 > 0) {
									var21 /= var13;
									var19 /= var27;
								} else {
									var19 /= var13;
									var21 /= var27;
								}

								var28 = anInt1526 - Class104_Sub18_Sub17_Sub4.anInt1677;
								var29 = anInt1580 - Class104_Sub18_Sub17_Sub4.anInt1688;
								if ((var28 > var15) && (var28 < var16) && (var29 > var21) && (var29 < var19))
									if (aBool1551)
										anIntArray1537[anInt1548++] = var9;
									else
										var26 = true;
							}

							var27 = Class104_Sub18_Sub17_Sub4.anInt1677;
							var28 = Class104_Sub18_Sub17_Sub4.anInt1688;
							var29 = 0;
							int var30 = 0;
							if (var1 != 0) {
								var29 = anIntArray1573[var1];
								var30 = anIntArray1528[var1];
							}

							for (int var31 = 0; var31 < anInt1529; ++var31) {
								int var32 = anIntArray1530[var31];
								int var33 = anIntArray1531[var31];
								int var34 = anIntArray1584[var31];
								int var35;
								if (var1 != 0) {
									var35 = ((var34 * var29) + (var32 * var30)) >> 16;
									var34 = ((var34 * var30) - (var32 * var29)) >> 16;
									var32 = var35;
								}

								var32 += var6;
								var33 += var7;
								var34 += var8;
								var35 = ((var34 * var4) + (var32 * var5)) >> 16;
								var34 = ((var34 * var5) - (var32 * var4)) >> 16;
								var32 = var35;
								var35 = ((var33 * var3) - (var34 * var2)) >> 16;
								var34 = ((var33 * var2) + (var34 * var3)) >> 16;
								anIntArray1561[var31] = var34 - var11;
								if (var34 >= 50) {
									anIntArray1559[var31] = var27 + ((var32 << 9) / var34);
									anIntArray1560[var31] = var28 + ((var35 << 9) / var34);
								} else {
									anIntArray1559[var31] = -5000;
									var23 = true;
								}

								if (var25) {
									anIntArray1581[var31] = var32;
									anIntArray1563[var31] = var35;
									anIntArray1582[var31] = var34;
								}
							}

							try {
								method827(var23, var26, var9);
							} catch (final Exception var37) {
								;
							}

						}
					}
				}
			}
		}
	}

	final void method825(final int var1) {
		if (aBoolArray1558[var1])
			method832(var1);
		else {
			final int var2 = anIntArray1534[var1];
			final int var3 = anIntArray1533[var1];
			final int var4 = anIntArray1536[var1];
			Class104_Sub18_Sub17_Sub4.aBool1675 = aBoolArray1557[var1];
			if (aByteArray1535 == null)
				Class104_Sub18_Sub17_Sub4.anInt1674 = 0;
			else
				Class104_Sub18_Sub17_Sub4.anInt1674 = aByteArray1535[var1] & 255;

			if ((aShortArray1525 != null) && (aShortArray1525[var1] != -1)) {
				int var6;
				int var7;
				int var8;
				if ((aByteArray1542 != null) && (aByteArray1542[var1] != -1)) {
					final int var5 = aByteArray1542[var1] & 255;
					var6 = anIntArray1546[var5];
					var7 = anIntArray1579[var5];
					var8 = anIntArray1570[var5];
				} else {
					var6 = var2;
					var7 = var3;
					var8 = var4;
				}

				if (anIntArray1539[var1] == -1)
					Class104_Sub18_Sub17_Sub4.method924(anIntArray1560[var2], anIntArray1560[var3],
							anIntArray1560[var4], anIntArray1559[var2], anIntArray1559[var3], anIntArray1559[var4],
							anIntArray1583[var1], anIntArray1583[var1], anIntArray1583[var1], anIntArray1581[var6],
							anIntArray1581[var7], anIntArray1581[var8], anIntArray1563[var6], anIntArray1563[var7],
							anIntArray1563[var8], anIntArray1582[var6], anIntArray1582[var7], anIntArray1582[var8],
							aShortArray1525[var1]);
				else
					Class104_Sub18_Sub17_Sub4.method924(anIntArray1560[var2], anIntArray1560[var3],
							anIntArray1560[var4], anIntArray1559[var2], anIntArray1559[var3], anIntArray1559[var4],
							anIntArray1583[var1], anIntArray1538[var1], anIntArray1539[var1], anIntArray1581[var6],
							anIntArray1581[var7], anIntArray1581[var8], anIntArray1563[var6], anIntArray1563[var7],
							anIntArray1563[var8], anIntArray1582[var6], anIntArray1582[var7], anIntArray1582[var8],
							aShortArray1525[var1]);
			} else if (anIntArray1539[var1] == -1)
				Class104_Sub18_Sub17_Sub4.method922(anIntArray1560[var2], anIntArray1560[var3], anIntArray1560[var4],
						anIntArray1559[var2], anIntArray1559[var3], anIntArray1559[var4],
						anIntArray1574[anIntArray1583[var1]]);
			else
				Class104_Sub18_Sub17_Sub4.method929(anIntArray1560[var2], anIntArray1560[var3], anIntArray1560[var4],
						anIntArray1559[var2], anIntArray1559[var3], anIntArray1559[var4], anIntArray1583[var1],
						anIntArray1538[var1], anIntArray1539[var1]);

		}
	}

	final boolean method826(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8) {
		return (var2 < var3) && (var2 < var4) && (var2 < var5) ? false
				: ((var2 > var3) && (var2 > var4) && (var2 > var5) ? false
						: ((var1 < var6) && (var1 < var7) && (var1 < var8) ? false
								: (var1 <= var6) || (var1 <= var7) || (var1 <= var8)));
	}

	final void method827(final boolean var1, boolean var2, final int var3) {
		if (anInt1555 < 1600) {
			int var4;
			for (var4 = 0; var4 < anInt1555; ++var4)
				anIntArray1565[var4] = 0;

			int var5;
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			int var12;
			int var13;
			int var15;
			for (var4 = 0; var4 < anInt1585; ++var4)
				if (anIntArray1539[var4] != -2) {
					var5 = anIntArray1534[var4];
					var6 = anIntArray1533[var4];
					var7 = anIntArray1536[var4];
					var8 = anIntArray1559[var5];
					var9 = anIntArray1559[var6];
					var10 = anIntArray1559[var7];
					int var11;
					if (var1 && ((var8 == -5000) || (var9 == -5000) || (var10 == -5000))) {
						var11 = anIntArray1581[var5];
						var12 = anIntArray1581[var6];
						var13 = anIntArray1581[var7];
						int var14 = anIntArray1563[var5];
						var15 = anIntArray1563[var6];
						int var16 = anIntArray1563[var7];
						int var17 = anIntArray1582[var5];
						final int var18 = anIntArray1582[var6];
						int var19 = anIntArray1582[var7];
						var11 -= var12;
						var13 -= var12;
						var14 -= var15;
						var16 -= var15;
						var17 -= var18;
						var19 -= var18;
						final int var20 = (var14 * var19) - (var17 * var16);
						final int var21 = (var17 * var13) - (var11 * var19);
						final int var22 = (var11 * var16) - (var14 * var13);
						if (((var12 * var20) + (var15 * var21) + (var18 * var22)) > 0) {
							aBoolArray1558[var4] = true;
							final int var23 = ((anIntArray1561[var5] + anIntArray1561[var6] + anIntArray1561[var7]) / 3)
									+ anInt1556;
							anIntArrayArray1566[var23][anIntArray1565[var23]++] = var4;
						}
					} else {
						if (var2 && method826(anInt1526, anInt1580, anIntArray1560[var5], anIntArray1560[var6],
								anIntArray1560[var7], var8, var9, var10)) {
							anIntArray1537[anInt1548++] = var3;
							var2 = false;
						}

						if ((((var8 - var9) * (anIntArray1560[var7] - anIntArray1560[var6]))
								- ((anIntArray1560[var5] - anIntArray1560[var6]) * (var10 - var9))) > 0) {
							aBoolArray1558[var4] = false;
							if ((var8 >= 0) && (var9 >= 0) && (var10 >= 0)
									&& (var8 <= Class104_Sub18_Sub17_Sub4.anInt1683)
									&& (var9 <= Class104_Sub18_Sub17_Sub4.anInt1683)
									&& (var10 <= Class104_Sub18_Sub17_Sub4.anInt1683))
								aBoolArray1557[var4] = false;
							else
								aBoolArray1557[var4] = true;

							var11 = ((anIntArray1561[var5] + anIntArray1561[var6] + anIntArray1561[var7]) / 3)
									+ anInt1556;
							anIntArrayArray1566[var11][anIntArray1565[var11]++] = var4;
						}
					}
				}

			int[] var24;
			if (aByteArray1540 == null)
				for (var4 = anInt1555 - 1; var4 >= 0; --var4) {
					var5 = anIntArray1565[var4];
					if (var5 > 0) {
						var24 = anIntArrayArray1566[var4];

						for (var7 = 0; var7 < var5; ++var7)
							method825(var24[var7]);
					}
				}
			else {
				for (var4 = 0; var4 < 12; ++var4) {
					anIntArray1572[var4] = 0;
					anIntArray1571[var4] = 0;
				}

				for (var4 = anInt1555 - 1; var4 >= 0; --var4) {
					var5 = anIntArray1565[var4];
					if (var5 > 0) {
						var24 = anIntArrayArray1566[var4];

						for (var7 = 0; var7 < var5; ++var7) {
							var8 = var24[var7];
							final byte var28 = aByteArray1540[var8];
							var10 = anIntArray1572[var28]++;
							anIntArrayArray1568[var28][var10] = var8;
							if (var28 < 10)
								anIntArray1571[var28] += var4;
							else if (var28 == 10)
								anIntArray1569[var10] = var4;
							else
								anIntArray1562[var10] = var4;
						}
					}
				}

				var4 = 0;
				if ((anIntArray1572[1] > 0) || (anIntArray1572[2] > 0))
					var4 = (anIntArray1571[1] + anIntArray1571[2]) / (anIntArray1572[1] + anIntArray1572[2]);

				var5 = 0;
				if ((anIntArray1572[3] > 0) || (anIntArray1572[4] > 0))
					var5 = (anIntArray1571[3] + anIntArray1571[4]) / (anIntArray1572[3] + anIntArray1572[4]);

				var6 = 0;
				if ((anIntArray1572[6] > 0) || (anIntArray1572[8] > 0))
					var6 = (anIntArray1571[6] + anIntArray1571[8]) / (anIntArray1572[6] + anIntArray1572[8]);

				var8 = 0;
				var9 = anIntArray1572[10];
				int[] var25 = anIntArrayArray1568[10];
				int[] var26 = anIntArray1569;
				if (var8 == var9) {
					var8 = 0;
					var9 = anIntArray1572[11];
					var25 = anIntArrayArray1568[11];
					var26 = anIntArray1562;
				}

				if (var8 < var9)
					var7 = var26[var8];
				else
					var7 = -1000;

				for (var12 = 0; var12 < 10; ++var12) {
					while ((var12 == 0) && (var7 > var4)) {
						method825(var25[var8++]);
						if ((var8 == var9) && (var25 != anIntArrayArray1568[11])) {
							var8 = 0;
							var9 = anIntArray1572[11];
							var25 = anIntArrayArray1568[11];
							var26 = anIntArray1562;
						}

						if (var8 < var9)
							var7 = var26[var8];
						else
							var7 = -1000;
					}

					while ((var12 == 3) && (var7 > var5)) {
						method825(var25[var8++]);
						if ((var8 == var9) && (var25 != anIntArrayArray1568[11])) {
							var8 = 0;
							var9 = anIntArray1572[11];
							var25 = anIntArrayArray1568[11];
							var26 = anIntArray1562;
						}

						if (var8 < var9)
							var7 = var26[var8];
						else
							var7 = -1000;
					}

					while ((var12 == 5) && (var7 > var6)) {
						method825(var25[var8++]);
						if ((var8 == var9) && (var25 != anIntArrayArray1568[11])) {
							var8 = 0;
							var9 = anIntArray1572[11];
							var25 = anIntArrayArray1568[11];
							var26 = anIntArray1562;
						}

						if (var8 < var9)
							var7 = var26[var8];
						else
							var7 = -1000;
					}

					var13 = anIntArray1572[var12];
					final int[] var27 = anIntArrayArray1568[var12];

					for (var15 = 0; var15 < var13; ++var15)
						method825(var27[var15]);
				}

				while (var7 != -1000) {
					method825(var25[var8++]);
					if ((var8 == var9) && (var25 != anIntArrayArray1568[11])) {
						var8 = 0;
						var25 = anIntArrayArray1568[11];
						var9 = anIntArray1572[11];
						var26 = anIntArray1562;
					}

					if (var8 < var9)
						var7 = var26[var8];
					else
						var7 = -1000;
				}

			}
		}
	}

	public final void method828(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8) {
		anIntArray1565[0] = -1;
		if ((anInt1552 != 2) && (anInt1552 != 1))
			method813();

		final int var9 = Class104_Sub18_Sub17_Sub4.anInt1677;
		final int var10 = Class104_Sub18_Sub17_Sub4.anInt1688;
		final int var13 = anIntArray1573[var2];
		final int var14 = anIntArray1528[var2];
		final int var15 = anIntArray1573[var3];
		final int var16 = anIntArray1528[var3];
		final int var17 = anIntArray1573[var4];
		final int var18 = anIntArray1528[var4];
		final int var19 = ((var6 * var17) + (var7 * var18)) >> 16;

		for (int var20 = 0; var20 < anInt1529; ++var20) {
			int var21 = anIntArray1530[var20];
			int var22 = anIntArray1531[var20];
			int var23 = anIntArray1584[var20];
			int var24;
			if (var3 != 0) {
				var24 = ((var22 * var15) + (var21 * var16)) >> 16;
				var22 = ((var22 * var16) - (var21 * var15)) >> 16;
				var21 = var24;
			}

			if (var2 != 0) {
				var24 = ((var23 * var13) + (var21 * var14)) >> 16;
				var23 = ((var23 * var14) - (var21 * var13)) >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = ((var22 * var18) - (var23 * var17)) >> 16;
			var23 = ((var22 * var17) + (var23 * var18)) >> 16;
			anIntArray1561[var20] = var23 - var19;
			anIntArray1559[var20] = var9 + ((var21 << 9) / var8);
			anIntArray1560[var20] = var10 + ((var24 << 9) / var8);
			if (anInt1545 > 0) {
				anIntArray1581[var20] = var21;
				anIntArray1563[var20] = var24;
				anIntArray1582[var20] = var23;
			}
		}

		try {
			method827(false, false, 0);
		} catch (final Exception var26) {
			;
		}

	}

	public Class104_Sub18_Sub16_Sub4 method829(final boolean var1) {
		if (!var1 && (aByteArray1532.length < anInt1585))
			aByteArray1532 = new byte[anInt1585 + 100];

		return method830(var1, aClass104_Sub18_Sub16_Sub4_1527, aByteArray1532);
	}

	Class104_Sub18_Sub16_Sub4 method830(final boolean var1, final Class104_Sub18_Sub16_Sub4 var2, final byte[] var3) {
		var2.anInt1529 = anInt1529;
		var2.anInt1585 = anInt1585;
		var2.anInt1545 = anInt1545;
		if ((var2.anIntArray1530 == null) || (var2.anIntArray1530.length < anInt1529)) {
			var2.anIntArray1530 = new int[anInt1529 + 100];
			var2.anIntArray1531 = new int[anInt1529 + 100];
			var2.anIntArray1584 = new int[anInt1529 + 100];
		}

		int var4;
		for (var4 = 0; var4 < anInt1529; ++var4) {
			var2.anIntArray1530[var4] = anIntArray1530[var4];
			var2.anIntArray1531[var4] = anIntArray1531[var4];
			var2.anIntArray1584[var4] = anIntArray1584[var4];
		}

		if (var1)
			var2.aByteArray1535 = aByteArray1535;
		else {
			var2.aByteArray1535 = var3;
			if (aByteArray1535 == null)
				for (var4 = 0; var4 < anInt1585; ++var4)
					var2.aByteArray1535[var4] = 0;
			else
				for (var4 = 0; var4 < anInt1585; ++var4)
					var2.aByteArray1535[var4] = aByteArray1535[var4];
		}

		var2.anIntArray1534 = anIntArray1534;
		var2.anIntArray1533 = anIntArray1533;
		var2.anIntArray1536 = anIntArray1536;
		var2.anIntArray1583 = anIntArray1583;
		var2.anIntArray1538 = anIntArray1538;
		var2.anIntArray1539 = anIntArray1539;
		var2.aByteArray1540 = aByteArray1540;
		var2.aByteArray1542 = aByteArray1542;
		var2.aShortArray1525 = aShortArray1525;
		var2.aByte1544 = aByte1544;
		var2.anIntArray1546 = anIntArray1546;
		var2.anIntArray1579 = anIntArray1579;
		var2.anIntArray1570 = anIntArray1570;
		var2.anIntArrayArray1549 = anIntArrayArray1549;
		var2.anIntArrayArray1550 = anIntArrayArray1550;
		var2.aBool1551 = aBool1551;
		var2.anInt1552 = 0;
		return var2;
	}

	static {
		anIntArray1573 = Class104_Sub18_Sub17_Sub4.anIntArray1680;
		anIntArray1528 = Class104_Sub18_Sub17_Sub4.anIntArray1678;
		anIntArray1574 = Class104_Sub18_Sub17_Sub4.anIntArray1685;
		anIntArray1586 = Class104_Sub18_Sub17_Sub4.anIntArray1671;
	}

	Class104_Sub18_Sub16_Sub4() {
	}

	public Class104_Sub18_Sub16_Sub4 method831(final int[][] var1, final int var2, final int var3, final int var4,
			final boolean var5, final int var6) {
		method812();
		int var7 = var2 - anInt1554;
		int var8 = var2 + anInt1554;
		int var9 = var4 - anInt1554;
		int var10 = var4 + anInt1554;
		if ((var7 >= 0) && (((var8 + 128) >> 7) < var1.length) && (var9 >= 0)
				&& (((var10 + 128) >> 7) < var1[0].length)) {
			var7 >>= 7;
			var8 = (var8 + 127) >> 7;
			var9 >>= 7;
			var10 = (var10 + 127) >> 7;
			if ((var1[var7][var9] == var3) && (var1[var8][var9] == var3) && (var1[var7][var10] == var3)
					&& (var1[var8][var10] == var3))
				return this;
			else {
				Class104_Sub18_Sub16_Sub4 var11;
				if (var5) {
					var11 = new Class104_Sub18_Sub16_Sub4();
					var11.anInt1529 = anInt1529;
					var11.anInt1585 = anInt1585;
					var11.anInt1545 = anInt1545;
					var11.anIntArray1530 = anIntArray1530;
					var11.anIntArray1584 = anIntArray1584;
					var11.anIntArray1534 = anIntArray1534;
					var11.anIntArray1533 = anIntArray1533;
					var11.anIntArray1536 = anIntArray1536;
					var11.anIntArray1583 = anIntArray1583;
					var11.anIntArray1538 = anIntArray1538;
					var11.anIntArray1539 = anIntArray1539;
					var11.aByteArray1540 = aByteArray1540;
					var11.aByteArray1535 = aByteArray1535;
					var11.aByteArray1542 = aByteArray1542;
					var11.aShortArray1525 = aShortArray1525;
					var11.aByte1544 = aByte1544;
					var11.anIntArray1546 = anIntArray1546;
					var11.anIntArray1579 = anIntArray1579;
					var11.anIntArray1570 = anIntArray1570;
					var11.anIntArrayArray1549 = anIntArrayArray1549;
					var11.anIntArrayArray1550 = anIntArrayArray1550;
					var11.aBool1551 = aBool1551;
					var11.anIntArray1531 = new int[var11.anInt1529];
				} else
					var11 = this;

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0)
					for (var12 = 0; var12 < var11.anInt1529; ++var12) {
						var13 = anIntArray1530[var12] + var2;
						var14 = anIntArray1584[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = ((var1[var17][var18] * (128 - var15)) + (var1[var17 + 1][var18] * var15)) >> 7;
						var20 = ((var1[var17][var18 + 1] * (128 - var15)) + (var1[var17 + 1][var18 + 1] * var15)) >> 7;
						var21 = ((var19 * (128 - var16)) + (var20 * var16)) >> 7;
						var11.anIntArray1531[var12] = (anIntArray1531[var12] + var21) - var3;
					}
				else
					for (var12 = 0; var12 < var11.anInt1529; ++var12) {
						var13 = (-anIntArray1531[var12] << 16) / anInt1467;
						if (var13 < var6) {
							var14 = anIntArray1530[var12] + var2;
							var15 = anIntArray1584[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = ((var1[var18][var19] * (128 - var16)) + (var1[var18 + 1][var19] * var16)) >> 7;
							var21 = ((var1[var18][var19 + 1] * (128 - var16))
									+ (var1[var18 + 1][var19 + 1] * var16)) >> 7;
							final int var22 = ((var20 * (128 - var17)) + (var21 * var17)) >> 7;
							var11.anIntArray1531[var12] = anIntArray1531[var12]
									+ (((var22 - var3) * (var6 - var13)) / var6);
						}
					}

				var11.anInt1552 = 0;
				return var11;
			}
		} else
			return this;
	}

	final void method832(final int var1) {
		final int var2 = Class104_Sub18_Sub17_Sub4.anInt1677;
		final int var3 = Class104_Sub18_Sub17_Sub4.anInt1688;
		int var4 = 0;
		final int var5 = anIntArray1534[var1];
		final int var6 = anIntArray1533[var1];
		final int var7 = anIntArray1536[var1];
		final int var8 = anIntArray1582[var5];
		final int var9 = anIntArray1582[var6];
		final int var10 = anIntArray1582[var7];
		if (aByteArray1535 == null)
			Class104_Sub18_Sub17_Sub4.anInt1674 = 0;
		else
			Class104_Sub18_Sub17_Sub4.anInt1674 = aByteArray1535[var1] & 255;

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			anIntArray1547[var4] = anIntArray1559[var5];
			anIntArray1543[var4] = anIntArray1560[var5];
			anIntArray1541[var4++] = anIntArray1583[var1];
		} else {
			var11 = anIntArray1581[var5];
			var12 = anIntArray1563[var5];
			var13 = anIntArray1583[var1];
			if (var10 >= 50) {
				var14 = (50 - var8) * anIntArray1586[var10 - var8];
				anIntArray1547[var4] = var2 + (((var11 + (((anIntArray1581[var7] - var11) * var14) >> 16)) << 9) / 50);
				anIntArray1543[var4] = var3 + (((var12 + (((anIntArray1563[var7] - var12) * var14) >> 16)) << 9) / 50);
				anIntArray1541[var4++] = var13 + (((anIntArray1539[var1] - var13) * var14) >> 16);
			}

			if (var9 >= 50) {
				var14 = (50 - var8) * anIntArray1586[var9 - var8];
				anIntArray1547[var4] = var2 + (((var11 + (((anIntArray1581[var6] - var11) * var14) >> 16)) << 9) / 50);
				anIntArray1543[var4] = var3 + (((var12 + (((anIntArray1563[var6] - var12) * var14) >> 16)) << 9) / 50);
				anIntArray1541[var4++] = var13 + (((anIntArray1538[var1] - var13) * var14) >> 16);
			}
		}

		if (var9 >= 50) {
			anIntArray1547[var4] = anIntArray1559[var6];
			anIntArray1543[var4] = anIntArray1560[var6];
			anIntArray1541[var4++] = anIntArray1538[var1];
		} else {
			var11 = anIntArray1581[var6];
			var12 = anIntArray1563[var6];
			var13 = anIntArray1538[var1];
			if (var8 >= 50) {
				var14 = (50 - var9) * anIntArray1586[var8 - var9];
				anIntArray1547[var4] = var2 + (((var11 + (((anIntArray1581[var5] - var11) * var14) >> 16)) << 9) / 50);
				anIntArray1543[var4] = var3 + (((var12 + (((anIntArray1563[var5] - var12) * var14) >> 16)) << 9) / 50);
				anIntArray1541[var4++] = var13 + (((anIntArray1583[var1] - var13) * var14) >> 16);
			}

			if (var10 >= 50) {
				var14 = (50 - var9) * anIntArray1586[var10 - var9];
				anIntArray1547[var4] = var2 + (((var11 + (((anIntArray1581[var7] - var11) * var14) >> 16)) << 9) / 50);
				anIntArray1543[var4] = var3 + (((var12 + (((anIntArray1563[var7] - var12) * var14) >> 16)) << 9) / 50);
				anIntArray1541[var4++] = var13 + (((anIntArray1539[var1] - var13) * var14) >> 16);
			}
		}

		if (var10 >= 50) {
			anIntArray1547[var4] = anIntArray1559[var7];
			anIntArray1543[var4] = anIntArray1560[var7];
			anIntArray1541[var4++] = anIntArray1539[var1];
		} else {
			var11 = anIntArray1581[var7];
			var12 = anIntArray1563[var7];
			var13 = anIntArray1539[var1];
			if (var9 >= 50) {
				var14 = (50 - var10) * anIntArray1586[var9 - var10];
				anIntArray1547[var4] = var2 + (((var11 + (((anIntArray1581[var6] - var11) * var14) >> 16)) << 9) / 50);
				anIntArray1543[var4] = var3 + (((var12 + (((anIntArray1563[var6] - var12) * var14) >> 16)) << 9) / 50);
				anIntArray1541[var4++] = var13 + (((anIntArray1538[var1] - var13) * var14) >> 16);
			}

			if (var8 >= 50) {
				var14 = (50 - var10) * anIntArray1586[var8 - var10];
				anIntArray1547[var4] = var2 + (((var11 + (((anIntArray1581[var5] - var11) * var14) >> 16)) << 9) / 50);
				anIntArray1543[var4] = var3 + (((var12 + (((anIntArray1563[var5] - var12) * var14) >> 16)) << 9) / 50);
				anIntArray1541[var4++] = var13 + (((anIntArray1583[var1] - var13) * var14) >> 16);
			}
		}

		var11 = anIntArray1547[0];
		var12 = anIntArray1547[1];
		var13 = anIntArray1547[2];
		var14 = anIntArray1543[0];
		final int var15 = anIntArray1543[1];
		final int var16 = anIntArray1543[2];
		Class104_Sub18_Sub17_Sub4.aBool1675 = false;
		int var17;
		int var18;
		int var19;
		int var20;
		if (var4 == 3) {
			if ((var11 < 0) || (var12 < 0) || (var13 < 0) || (var11 > Class104_Sub18_Sub17_Sub4.anInt1683)
					|| (var12 > Class104_Sub18_Sub17_Sub4.anInt1683) || (var13 > Class104_Sub18_Sub17_Sub4.anInt1683))
				Class104_Sub18_Sub17_Sub4.aBool1675 = true;

			if ((aShortArray1525 != null) && (aShortArray1525[var1] != -1)) {
				if ((aByteArray1542 != null) && (aByteArray1542[var1] != -1)) {
					var17 = aByteArray1542[var1] & 255;
					var18 = anIntArray1546[var17];
					var19 = anIntArray1579[var17];
					var20 = anIntArray1570[var17];
				} else {
					var18 = var5;
					var19 = var6;
					var20 = var7;
				}

				if (anIntArray1539[var1] == -1)
					Class104_Sub18_Sub17_Sub4.method924(var14, var15, var16, var11, var12, var13, anIntArray1583[var1],
							anIntArray1583[var1], anIntArray1583[var1], anIntArray1581[var18], anIntArray1581[var19],
							anIntArray1581[var20], anIntArray1563[var18], anIntArray1563[var19], anIntArray1563[var20],
							anIntArray1582[var18], anIntArray1582[var19], anIntArray1582[var20], aShortArray1525[var1]);
				else
					Class104_Sub18_Sub17_Sub4.method924(var14, var15, var16, var11, var12, var13, anIntArray1541[0],
							anIntArray1541[1], anIntArray1541[2], anIntArray1581[var18], anIntArray1581[var19],
							anIntArray1581[var20], anIntArray1563[var18], anIntArray1563[var19], anIntArray1563[var20],
							anIntArray1582[var18], anIntArray1582[var19], anIntArray1582[var20], aShortArray1525[var1]);
			} else if (anIntArray1539[var1] == -1)
				Class104_Sub18_Sub17_Sub4.method922(var14, var15, var16, var11, var12, var13,
						anIntArray1574[anIntArray1583[var1]]);
			else
				Class104_Sub18_Sub17_Sub4.method929(var14, var15, var16, var11, var12, var13, anIntArray1541[0],
						anIntArray1541[1], anIntArray1541[2]);
		}

		if (var4 == 4) {
			if ((var11 < 0) || (var12 < 0) || (var13 < 0) || (var11 > Class104_Sub18_Sub17_Sub4.anInt1683)
					|| (var12 > Class104_Sub18_Sub17_Sub4.anInt1683) || (var13 > Class104_Sub18_Sub17_Sub4.anInt1683)
					|| (anIntArray1547[3] < 0) || (anIntArray1547[3] > Class104_Sub18_Sub17_Sub4.anInt1683))
				Class104_Sub18_Sub17_Sub4.aBool1675 = true;

			if ((aShortArray1525 != null) && (aShortArray1525[var1] != -1)) {
				if ((aByteArray1542 != null) && (aByteArray1542[var1] != -1)) {
					var17 = aByteArray1542[var1] & 255;
					var18 = anIntArray1546[var17];
					var19 = anIntArray1579[var17];
					var20 = anIntArray1570[var17];
				} else {
					var18 = var5;
					var19 = var6;
					var20 = var7;
				}

				final short var21 = aShortArray1525[var1];
				if (anIntArray1539[var1] == -1) {
					Class104_Sub18_Sub17_Sub4.method924(var14, var15, var16, var11, var12, var13, anIntArray1583[var1],
							anIntArray1583[var1], anIntArray1583[var1], anIntArray1581[var18], anIntArray1581[var19],
							anIntArray1581[var20], anIntArray1563[var18], anIntArray1563[var19], anIntArray1563[var20],
							anIntArray1582[var18], anIntArray1582[var19], anIntArray1582[var20], var21);
					Class104_Sub18_Sub17_Sub4.method924(var14, var16, anIntArray1543[3], var11, var13,
							anIntArray1547[3], anIntArray1583[var1], anIntArray1583[var1], anIntArray1583[var1],
							anIntArray1581[var18], anIntArray1581[var19], anIntArray1581[var20], anIntArray1563[var18],
							anIntArray1563[var19], anIntArray1563[var20], anIntArray1582[var18], anIntArray1582[var19],
							anIntArray1582[var20], var21);
				} else {
					Class104_Sub18_Sub17_Sub4.method924(var14, var15, var16, var11, var12, var13, anIntArray1541[0],
							anIntArray1541[1], anIntArray1541[2], anIntArray1581[var18], anIntArray1581[var19],
							anIntArray1581[var20], anIntArray1563[var18], anIntArray1563[var19], anIntArray1563[var20],
							anIntArray1582[var18], anIntArray1582[var19], anIntArray1582[var20], var21);
					Class104_Sub18_Sub17_Sub4.method924(var14, var16, anIntArray1543[3], var11, var13,
							anIntArray1547[3], anIntArray1541[0], anIntArray1541[2], anIntArray1541[3],
							anIntArray1581[var18], anIntArray1581[var19], anIntArray1581[var20], anIntArray1563[var18],
							anIntArray1563[var19], anIntArray1563[var20], anIntArray1582[var18], anIntArray1582[var19],
							anIntArray1582[var20], var21);
				}
			} else if (anIntArray1539[var1] == -1) {
				var18 = anIntArray1574[anIntArray1583[var1]];
				Class104_Sub18_Sub17_Sub4.method922(var14, var15, var16, var11, var12, var13, var18);
				Class104_Sub18_Sub17_Sub4.method922(var14, var16, anIntArray1543[3], var11, var13, anIntArray1547[3],
						var18);
			} else {
				Class104_Sub18_Sub17_Sub4.method929(var14, var15, var16, var11, var12, var13, anIntArray1541[0],
						anIntArray1541[1], anIntArray1541[2]);
				Class104_Sub18_Sub17_Sub4.method929(var14, var16, anIntArray1543[3], var11, var13, anIntArray1547[3],
						anIntArray1541[0], anIntArray1541[2], anIntArray1541[3]);
			}
		}

	}
}
