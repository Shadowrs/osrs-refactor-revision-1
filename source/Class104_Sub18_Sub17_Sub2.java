import java.util.Random;

public abstract class Class104_Sub18_Sub17_Sub2 extends Class104_Sub18_Sub17 {
	public static Class104_Sub18_Sub17_Sub3[] aClass104_Sub18_Sub17_Sub3Array1603;
	byte[][] aByteArrayArray1606 = new byte[256][];
	public int anInt1600 = 0;
	int[] anIntArray1594;
	int[] anIntArray1599;
	int[] anIntArray1598;
	int[] anIntArray1601;
	int anInt1602;
	int anInt1596;
	static int anInt1612 = 0;
	static int anInt1611 = 256;
	static int anInt1610 = 0;
	static int anInt1605 = -1;
	static int anInt1609 = -1;
	static int anInt1608 = -1;
	static int anInt1613 = 0;
	static int anInt1607 = -1;
	static int anInt1595 = 0;
	static Random aRandom1614 = new Random();
	static String[] aStringArray1615 = new String[100];
	int[] anIntArray1604;
	byte[] aByteArray1597;

	Class104_Sub18_Sub17_Sub2(final byte[] var1) {
		method880(var1);
	}

	Class104_Sub18_Sub17_Sub2(final byte[] var1, final int[] var2, final int[] var3, final int[] var4, final int[] var5,
			final int[] var6, final byte[][] var7) {
		anIntArray1594 = var2;
		anIntArray1599 = var3;
		anIntArray1598 = var4;
		anIntArray1601 = var5;
		method880(var1);
		aByteArrayArray1606 = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var10 = 0; var10 < 256; ++var10) {
			if ((anIntArray1599[var10] < var8) && (anIntArray1601[var10] != 0))
				var8 = anIntArray1599[var10];

			if ((anIntArray1599[var10] + anIntArray1601[var10]) > var9)
				var9 = anIntArray1599[var10] + anIntArray1601[var10];
		}

		anInt1602 = anInt1600 - var8;
		anInt1596 = var9 - anInt1600;
	}

	int method860(int var1) {
		if (var1 == 160)
			var1 = 32;

		return anIntArray1604[var1 & 255];
	}

	int method861(final String var1, final int[] var2, final String[] var3) {
		if (var1 == null)
			return 0;
		else {
			int var4 = 0;
			int var5 = 0;
			final StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			final int var13 = var1.length();

			for (int var14 = 0; var14 < var13; ++var14) {
				char var15 = var1.charAt(var14);
				if (var15 == 60)
					var10 = var14;
				else {
					if ((var15 == 62) && (var10 != -1)) {
						final String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('\u003c');
						var6.append(var16);
						var6.append('\u003e');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += method860(60);
							if ((aByteArray1597 != null) && (var11 != -1))
								var4 += aByteArray1597[(var11 << 8) + 60];

							var11 = 60;
						} else if (var16.equals("gt")) {
							var4 += method860(62);
							if ((aByteArray1597 != null) && (var11 != -1))
								var4 += aByteArray1597[(var11 << 8) + 62];

							var11 = 62;
						} else if (var16.startsWith("img="))
							try {
								final String var17 = var16.substring(4);
								final int var18 = Class66.method299(var17, 10, true);
								var4 += aClass104_Sub18_Sub17_Sub3Array1603[var18].anInt1622;
								var11 = 0;
							} catch (final Exception var22) {
								;
							}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != -1) {
							var6.append(var15);
							var4 += method860(var15);
							if ((aByteArray1597 != null) && (var11 != -1))
								var4 += aByteArray1597[(var11 << 8) + var15];

							var11 = var15;
						}

						if (var15 == 32) {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if ((var2 != null) && (var4 > var2[var12 < var2.length ? var12 : var2.length - 1])
								&& (var7 >= 0)) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == 45) {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			final String var21 = var6.toString();
			if (var21.length() > var5)
				var3[var12++] = var21.substring(var5, var21.length());

			return var12;
		}
	}

	public int method862(final String var1, final int var2) {
		final int var3 = method861(var1, new int[] { var2 }, aStringArray1615);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			final int var6 = method883(aStringArray1615[var5]);
			if (var6 > var4)
				var4 = var6;
		}

		return var4;
	}

	public void drawstr(final String var1, final int var2, final int var3, final int var4, final int var5) {
		if (var1 != null) {
			method878(var4, var5);
			method886(var1, var2, var3);
		}
	}

	abstract void method864(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	public int method865(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8, int var9, int var10) {
		if (var1 == null)
			return 0;
		else {
			method878(var6, var7);
			if (var10 == 0)
				var10 = anInt1600;

			int[] var11 = new int[] { var4 };
			if ((var5 < (anInt1602 + anInt1596 + var10)) && (var5 < (var10 + var10)))
				var11 = null;

			final int var12 = method861(var1, var11, aStringArray1615);
			if ((var9 == 3) && (var12 == 1))
				var9 = 1;

			int var13;
			int var14;
			if (var9 == 0)
				var13 = var3 + anInt1602;
			else if (var9 == 1)
				var13 = var3 + anInt1602 + ((var5 - anInt1602 - anInt1596 - ((var12 - 1) * var10)) / 2);
			else if (var9 == 2)
				var13 = (var3 + var5) - anInt1596 - ((var12 - 1) * var10);
			else {
				var14 = (var5 - anInt1602 - anInt1596 - ((var12 - 1) * var10)) / (var12 + 1);
				if (var14 < 0)
					var14 = 0;

				var13 = var3 + anInt1602 + var14;
				var10 += var14;
			}

			for (var14 = 0; var14 < var12; ++var14) {
				if (var8 == 0)
					method886(aStringArray1615[var14], var2, var13);
				else if (var8 == 1)
					method886(aStringArray1615[var14], var2 + ((var4 - method883(aStringArray1615[var14])) / 2), var13);
				else if (var8 == 2)
					method886(aStringArray1615[var14], (var2 + var4) - method883(aStringArray1615[var14]), var13);
				else if (var14 == (var12 - 1))
					method886(aStringArray1615[var14], var2, var13);
				else {
					method870(aStringArray1615[var14], var4);
					method886(aStringArray1615[var14], var2, var13);
					anInt1612 = 0;
				}

				var13 += var10;
			}

			return var12;
		}
	}

	public void method866(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		if (var1 != null) {
			method878(var4, var5);
			final int[] var7 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); ++var8)
				var7[var8] = (int) (Math.sin((var8 / 2.0D) + (var6 / 5.0D)) * 5.0D);

			method872(var1, var2 - (method883(var1) / 2), var3, (int[]) null, var7);
		}
	}

	public void method867(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		if (var1 != null) {
			method878(var4, var5);
			final int[] var7 = new int[var1.length()];
			final int[] var8 = new int[var1.length()];

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = (int) (Math.sin((var9 / 5.0D) + (var6 / 5.0D)) * 5.0D);
				var8[var9] = (int) (Math.sin((var9 / 3.0D) + (var6 / 5.0D)) * 5.0D);
			}

			method872(var1, var2 - (method883(var1) / 2), var3, var7, var8);
		}
	}

	public void method868(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		if (var1 != null) {
			method878(var4, var5);
			double var8 = 7.0D - (var7 / 8.0D);
			if (var8 < 0.0D)
				var8 = 0.0D;

			final int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); ++var11)
				var10[var11] = (int) (Math.sin((var11 / 1.5D) + (var6 / 1.0D)) * var8);

			method872(var1, var2 - (method883(var1) / 2), var3, (int[]) null, var10);
		}
	}

	public void method869(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		if (var1 != null) {
			method878(var4, var5);
			aRandom1614.setSeed(var6);
			anInt1611 = 192 + (aRandom1614.nextInt() & 31);
			final int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = var8;
				if ((aRandom1614.nextInt() & 3) == 0)
					++var8;
			}

			method872(var1, var2, var3, var7, (int[]) null);
		}
	}

	void method870(final String var1, final int var2) {
		int var3 = 0;
		boolean var4 = false;

		for (int var5 = 0; var5 < var1.length(); ++var5) {
			final char var6 = var1.charAt(var5);
			if (var6 == 60)
				var4 = true;
			else if (var6 == 62)
				var4 = false;
			else if (!var4 && (var6 == 32))
				++var3;
		}

		if (var3 > 0)
			anInt1612 = ((var2 - method883(var1)) << 8) / var3;

	}

	void method871(final String var1) {
		try {
			if (var1.startsWith("col="))
				anInt1610 = Class15.method58(var1.substring(4), 16);
			else if (var1.equals("/col"))
				anInt1610 = anInt1595;
			else if (var1.startsWith("str="))
				anInt1605 = Class15.method58(var1.substring(4), 16);
			else if (var1.equals("str"))
				anInt1605 = 8388608;
			else if (var1.equals("/str"))
				anInt1605 = -1;
			else if (var1.startsWith("u="))
				anInt1609 = Class15.method58(var1.substring(2), 16);
			else if (var1.equals("u"))
				anInt1609 = 0;
			else if (var1.equals("/u"))
				anInt1609 = -1;
			else if (var1.startsWith("shad="))
				anInt1608 = Class15.method58(var1.substring(5), 16);
			else if (var1.equals("shad"))
				anInt1608 = 0;
			else if (var1.equals("/shad"))
				anInt1608 = anInt1607;
			else if (var1.equals("br"))
				method878(anInt1595, anInt1607);
		} catch (final Exception var3) {
			;
		}

	}

	void method872(final String var1, int var2, int var3, final int[] var4, final int[] var5) {
		var3 -= anInt1600;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;

		for (int var9 = 0; var9 < var1.length(); ++var9) {
			char var10 = var1.charAt(var9);
			if (var10 == 60)
				var6 = var9;
			else {
				int var12;
				int var13;
				int var15;
				if ((var10 == 62) && (var6 != -1)) {
					final String var11 = var1.substring(var6 + 1, var9);
					var6 = -1;
					if (var11.equals("lt"))
						var10 = 60;
					else {
						if (!var11.equals("gt")) {
							if (var11.startsWith("img="))
								try {
									if (var4 != null)
										var12 = var4[var8];
									else
										var12 = 0;

									if (var5 != null)
										var13 = var5[var8];
									else
										var13 = 0;

									++var8;
									final String var14 = var11.substring(4);
									var15 = Class66.method299(var14, 10, true);
									final Class104_Sub18_Sub17_Sub3 var17 = aClass104_Sub18_Sub17_Sub3Array1603[var15];
									var17.method889(var2 + var12, ((var3 + anInt1600) - var17.anInt1623) + var13);
									var2 += var17.anInt1622;
									var7 = -1;
								} catch (final Exception var21) {
									;
								}
							else
								method871(var11);
							continue;
						}

						var10 = 62;
					}
				}

				if (var10 == 160)
					var10 = 32;

				if (var6 == -1) {
					if ((aByteArray1597 != null) && (var7 != -1))
						var2 += aByteArray1597[(var7 << 8) + var10];

					final int var19 = anIntArray1598[var10];
					var12 = anIntArray1601[var10];
					if (var4 != null)
						var13 = var4[var8];
					else
						var13 = 0;

					if (var5 != null)
						var15 = var5[var8];
					else
						var15 = 0;

					++var8;
					if (var10 != 32) {
						if (anInt1611 == 256) {
							if (anInt1608 != -1)
								method875(aByteArrayArray1606[var10], var2 + anIntArray1594[var10] + 1 + var13,
										var3 + anIntArray1599[var10] + 1 + var15, var19, var12, anInt1608);

							method864(aByteArrayArray1606[var10], var2 + anIntArray1594[var10] + var13,
									var3 + anIntArray1599[var10] + var15, var19, var12, anInt1610);
						} else {
							if (anInt1608 != -1)
								method876(aByteArrayArray1606[var10], var2 + anIntArray1594[var10] + 1 + var13,
										var3 + anIntArray1599[var10] + 1 + var15, var19, var12, anInt1608, anInt1611);

							method884(aByteArrayArray1606[var10], var2 + anIntArray1594[var10] + var13,
									var3 + anIntArray1599[var10] + var15, var19, var12, anInt1610, anInt1611);
						}
					} else if (anInt1612 > 0) {
						anInt1613 += anInt1612;
						var2 += anInt1613 >> 8;
						anInt1613 &= 255;
					}

					final int var20 = anIntArray1604[var10];
					if (anInt1605 != -1)
						method796(var2, var3 + (int) (anInt1600 * 0.7D), var20, anInt1605);

					if (anInt1609 != -1)
						method796(var2, var3 + anInt1600, var20, anInt1609);

					var2 += var20;
					var7 = var10;
				}
			}
		}

	}

	static void method873(final int[] var0, final byte[] var1, final int var2, int var3, int var4, int var5,
			final int var6, final int var7, final int var8) {
		final int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;
			}

			for (var11 = var5; var11 < 0; ++var11)
				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

			var4 += var7;
			var3 += var8;
		}

	}

	static int method874(final byte[][] var0, final byte[][] var1, final int[] var2, final int[] var3, final int[] var4,
			final int var5, final int var6) {
		final int var7 = var2[var5];
		final int var8 = var7 + var4[var5];
		final int var9 = var2[var6];
		final int var10 = var9 + var4[var6];
		int var11 = var7;
		if (var9 > var7)
			var11 = var9;

		int var12 = var8;
		if (var10 < var8)
			var12 = var10;

		int var13 = var3[var5];
		if (var3[var6] < var13)
			var13 = var3[var6];

		final byte[] var14 = var1[var5];
		final byte[] var15 = var0[var6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;

		for (int var18 = var11; var18 < var12; ++var18) {
			final int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13)
				var13 = var19;
		}

		return -var13;
	}

	static void method875(final byte[] var0, int var1, int var2, int var3, int var4, final int var5) {
		int var6 = var1 + (var2 * anInt1469);
		int var7 = anInt1469 - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < anInt1471) {
			var10 = anInt1471 - var2;
			var4 -= var10;
			var2 = anInt1471;
			var9 += var10 * var3;
			var6 += var10 * anInt1469;
		}

		if ((var2 + var4) > anInt1470)
			var4 -= (var2 + var4) - anInt1470;

		if (var1 < anInt1473) {
			var10 = anInt1473 - var1;
			var3 -= var10;
			var1 = anInt1473;
			var9 += var10;
			var6 += var10;
			var8 += var10;
			var7 += var10;
		}

		if ((var1 + var3) > anInt1472) {
			var10 = (var1 + var3) - anInt1472;
			var3 -= var10;
			var8 += var10;
			var7 += var10;
		}

		if ((var3 > 0) && (var4 > 0))
			method873(anIntArray1474, var0, var5, var9, var6, var3, var4, var7, var8);
	}

	static void method876(final byte[] var0, int var1, int var2, int var3, int var4, final int var5, final int var6) {
		int var7 = var1 + (var2 * anInt1469);
		int var8 = anInt1469 - var3;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var2 < anInt1471) {
			var11 = anInt1471 - var2;
			var4 -= var11;
			var2 = anInt1471;
			var10 += var11 * var3;
			var7 += var11 * anInt1469;
		}

		if ((var2 + var4) > anInt1470)
			var4 -= (var2 + var4) - anInt1470;

		if (var1 < anInt1473) {
			var11 = anInt1473 - var1;
			var3 -= var11;
			var1 = anInt1473;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if ((var1 + var3) > anInt1472) {
			var11 = (var1 + var3) - anInt1472;
			var3 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if ((var3 > 0) && (var4 > 0))
			method877(anIntArray1474, var0, var5, var10, var7, var3, var4, var8, var9, var6);
	}

	static void method877(final int[] var0, final byte[] var1, int var2, int var3, int var4, final int var5,
			final int var6, final int var7, final int var8, int var9) {
		var2 = ((((var2 & 16711935) * var9) & -16711936) + (((var2 & '\uff00') * var9) & 16711680)) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = -var5; var11 < 0; ++var11)
				if (var1[var3++] != 0) {
					final int var12 = var0[var4];
					var0[var4++] = (((((var12 & 16711935) * var9) & -16711936)
							+ (((var12 & '\uff00') * var9) & 16711680)) >> 8) + var2;
				} else
					++var4;

			var4 += var7;
			var3 += var8;
		}

	}

	void method878(final int var1, final int var2) {
		anInt1605 = -1;
		anInt1609 = -1;
		anInt1607 = var2;
		anInt1608 = var2;
		anInt1595 = var1;
		anInt1610 = var1;
		anInt1611 = 256;
		anInt1612 = 0;
		anInt1613 = 0;
	}

	void method880(final byte[] var1) {
		anIntArray1604 = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < anIntArray1604.length; ++var2)
				anIntArray1604[var2] = var1[var2] & 255;

			anInt1600 = var1[256] & 255;
		} else {
			var2 = 0;

			for (int var3 = 0; var3 < 256; ++var3)
				anIntArray1604[var3] = var1[var2++] & 255;

			final int[] var4 = new int[256];
			final int[] var5 = new int[256];

			int var6;
			for (var6 = 0; var6 < 256; ++var6)
				var4[var6] = var1[var2++] & 255;

			for (var6 = 0; var6 < 256; ++var6)
				var5[var6] = var1[var2++] & 255;

			final byte[][] var7 = new byte[256][];

			int var10;
			for (int var8 = 0; var8 < 256; ++var8) {
				var7[var8] = new byte[var4[var8]];
				byte var9 = 0;

				for (var10 = 0; var10 < var7[var8].length; ++var10) {
					var9 += var1[var2++];
					var7[var8][var10] = var9;
				}
			}

			final byte[][] var11 = new byte[256][];

			int var13;
			for (var13 = 0; var13 < 256; ++var13) {
				var11[var13] = new byte[var4[var13]];
				byte var14 = 0;

				for (int var12 = 0; var12 < var11[var13].length; ++var12) {
					var14 += var1[var2++];
					var11[var13][var12] = var14;
				}
			}

			aByteArray1597 = new byte[65536];

			for (var13 = 0; var13 < 256; ++var13)
				if ((var13 != 32) && (var13 != 160))
					for (var10 = 0; var10 < 256; ++var10)
						if ((var10 != 32) && (var10 != 160))
							aByteArray1597[(var13 << 8) + var10] = (byte) method874(var7, var11, var5, anIntArray1604,
									var4, var13, var10);

			anInt1600 = var5[32] + var4[32];
		}

	}

	public void method881(final String var1, final int var2, final int var3, final int var4, final int var5) {
		if (var1 != null) {
			method878(var4, var5);
			method886(var1, var2 - method883(var1), var3);
		}
	}

	public void method882(final String var1, final int var2, final int var3, final int var4, final int var5) {
		if (var1 != null) {
			method878(var4, var5);
			method886(var1, var2 - (method883(var1) / 2), var3);
		}
	}

	public int method883(final String var1) {
		if (var1 == null)
			return 0;
		else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); ++var5) {
				char var6 = var1.charAt(var5);
				if (var6 == 60)
					var2 = var5;
				else {
					if ((var6 == 62) && (var2 != -1)) {
						final String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt"))
							var6 = 60;
						else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img="))
									try {
										final String var8 = var7.substring(4);
										final int var9 = Class66.method299(var8, 10, true);
										var4 += aClass104_Sub18_Sub17_Sub3Array1603[var9].anInt1622;
										var3 = -1;
									} catch (final Exception var12) {
										;
									}
								continue;
							}

							var6 = 62;
						}
					}

					if (var6 == 160)
						var6 = 32;

					if (var2 == -1) {
						var4 += anIntArray1604[var6];
						if ((aByteArray1597 != null) && (var3 != -1))
							var4 += aByteArray1597[(var3 << 8) + var6];

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	abstract void method884(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	public int method885(final String var1, final int var2) {
		return method861(var1, new int[] { var2 }, aStringArray1615);
	}

	void method886(final String var1, int var2, int var3) {
		var3 -= anInt1600;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6) {
			char var7 = var1.charAt(var6);
			if (var7 == 60)
				var4 = var6;
			else {
				int var10;
				if ((var7 == 62) && (var4 != -1)) {
					final String var8 = var1.substring(var4 + 1, var6);
					var4 = -1;
					if (var8.equals("lt"))
						var7 = 60;
					else {
						if (!var8.equals("gt")) {
							if (var8.startsWith("img="))
								try {
									final String var9 = var8.substring(4);
									var10 = Class66.method299(var9, 10, true);
									final Class104_Sub18_Sub17_Sub3 var12 = aClass104_Sub18_Sub17_Sub3Array1603[var10];
									var12.method889(var2, (var3 + anInt1600) - var12.anInt1623);
									var2 += var12.anInt1622;
									var5 = -1;
								} catch (final Exception var16) {
									;
								}
							else
								method871(var8);
							continue;
						}

						var7 = 62;
					}
				}

				if (var7 == 160)
					var7 = 32;

				if (var4 == -1) {
					if ((aByteArray1597 != null) && (var5 != -1))
						var2 += aByteArray1597[(var5 << 8) + var7];

					final int var14 = anIntArray1598[var7];
					var10 = anIntArray1601[var7];
					if (var7 != 32) {
						if (anInt1611 == 256) {
							if (anInt1608 != -1)
								method875(aByteArrayArray1606[var7], var2 + anIntArray1594[var7] + 1,
										var3 + anIntArray1599[var7] + 1, var14, var10, anInt1608);

							method864(aByteArrayArray1606[var7], var2 + anIntArray1594[var7],
									var3 + anIntArray1599[var7], var14, var10, anInt1610);
						} else {
							if (anInt1608 != -1)
								method876(aByteArrayArray1606[var7], var2 + anIntArray1594[var7] + 1,
										var3 + anIntArray1599[var7] + 1, var14, var10, anInt1608, anInt1611);

							method884(aByteArrayArray1606[var7], var2 + anIntArray1594[var7],
									var3 + anIntArray1599[var7], var14, var10, anInt1610, anInt1611);
						}
					} else if (anInt1612 > 0) {
						anInt1613 += anInt1612;
						var2 += anInt1613 >> 8;
						anInt1613 &= 255;
					}

					final int var15 = anIntArray1604[var7];
					if (anInt1605 != -1)
						method796(var2, var3 + (int) (anInt1600 * 0.7D), var15, anInt1605);

					if (anInt1609 != -1)
						method796(var2, var3 + anInt1600 + 1, var15, anInt1609);

					var2 += var15;
					var5 = var7;
				}
			}
		}

	}
}
