public class Class104_Sub18_Sub17_Sub4 extends Class104_Sub18_Sub17 {
	static int anInt1677;
	static int anInt1688;
	static int anInt1689;
	static int anInt1681;
	static int anInt1682;
	static int anInt1684;
	public static Interface2 anInterface2_1686;
	static boolean aBool1675 = false;
	static boolean aBool1672 = false;
	static boolean aBool1690 = false;
	public static boolean aBool1673 = true;
	static int anInt1674 = 0;
	static int[] anIntArray1676 = new int[1024];
	public static int[] anIntArray1685 = new int[65536];
	static int[] anIntArray1687 = new int[512];
	static int[] anIntArray1671 = new int[2048];
	public static int[] anIntArray1680 = new int[2048];
	public static int[] anIntArray1678 = new int[2048];
	static int anInt1683;
	static int anInt1679;

	static final void method914(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, int var10, int var11, final int var12, final int var13, final int var14) {
		if (aBool1675) {
			if (var6 > anInt1683)
				var6 = anInt1683;

			if (var5 < 0)
				var5 = 0;
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var15 = var6 - var5;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (aBool1672) {
				var16 = var5 - anInt1677;
				var9 += (var12 >> 3) * var16;
				var10 += (var13 >> 3) * var16;
				var11 += (var14 >> 3) * var16;
				var17 = var11 >> 12;
				if (var17 != 0) {
					var18 = var9 / var17;
					var19 = var10 / var17;
					if (var18 < 0)
						var18 = 0;
					else if (var18 > 4032)
						var18 = 4032;
				} else {
					var18 = 0;
					var19 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var17 = var11 >> 12;
				if (var17 != 0) {
					var20 = var9 / var17;
					var21 = var10 / var17;
					if (var20 < 0)
						var20 = 0;
					else if (var20 > 4032)
						var20 = 4032;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var2 = (var18 << 20) + var19;
				var22 = (((var20 - var18) >> 3) << 20) + ((var21 - var19) >> 3);
				var15 >>= 3;
				var8 <<= 3;
				var23 = var7 >> 8;
				if (aBool1690) {
					if (var15 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var17 = var11 >> 12;
							if (var17 != 0) {
								var20 = var9 / var17;
								var21 = var10 / var17;
								if (var20 < 0)
									var20 = 0;
								else if (var20 > 4032)
									var20 = 4032;
							} else {
								var20 = 0;
								var21 = 0;
							}

							var2 = (var18 << 20) + var19;
							var22 = (((var20 - var18) >> 3) << 20) + ((var21 - var19) >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var15;
						} while (var15 > 0);

					var15 = (var6 - var5) & 7;
					if (var15 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							--var15;
						} while (var15 > 0);
				} else {
					if (var15 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var17 = var11 >> 12;
							if (var17 != 0) {
								var20 = var9 / var17;
								var21 = var10 / var17;
								if (var20 < 0)
									var20 = 0;
								else if (var20 > 4032)
									var20 = 4032;
							} else {
								var20 = 0;
								var21 = 0;
							}

							var2 = (var18 << 20) + var19;
							var22 = (((var20 - var18) >> 3) << 20) + ((var21 - var19) >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var15;
						} while (var15 > 0);

					var15 = (var6 - var5) & 7;
					if (var15 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							--var15;
						} while (var15 > 0);
				}
			} else {
				var16 = var5 - anInt1677;
				var9 += (var12 >> 3) * var16;
				var10 += (var13 >> 3) * var16;
				var11 += (var14 >> 3) * var16;
				var17 = var11 >> 14;
				if (var17 != 0) {
					var18 = var9 / var17;
					var19 = var10 / var17;
					if (var18 < 0)
						var18 = 0;
					else if (var18 > 16256)
						var18 = 16256;
				} else {
					var18 = 0;
					var19 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var17 = var11 >> 14;
				if (var17 != 0) {
					var20 = var9 / var17;
					var21 = var10 / var17;
					if (var20 < 0)
						var20 = 0;
					else if (var20 > 16256)
						var20 = 16256;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var2 = (var18 << 18) + var19;
				var22 = (((var20 - var18) >> 3) << 18) + ((var21 - var19) >> 3);
				var15 >>= 3;
				var8 <<= 3;
				var23 = var7 >> 8;
				if (aBool1690) {
					if (var15 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var17 = var11 >> 14;
							if (var17 != 0) {
								var20 = var9 / var17;
								var21 = var10 / var17;
								if (var20 < 0)
									var20 = 0;
								else if (var20 > 16256)
									var20 = 16256;
							} else {
								var20 = 0;
								var21 = 0;
							}

							var2 = (var18 << 18) + var19;
							var22 = (((var20 - var18) >> 3) << 18) + ((var21 - var19) >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var15;
						} while (var15 > 0);

					var15 = (var6 - var5) & 7;
					if (var15 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							--var15;
						} while (var15 > 0);
				} else {
					if (var15 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var17 = var11 >> 14;
							if (var17 != 0) {
								var20 = var9 / var17;
								var21 = var10 / var17;
								if (var20 < 0)
									var20 = 0;
								else if (var20 > 16256)
									var20 = 16256;
							} else {
								var20 = 0;
								var21 = 0;
							}

							var2 = (var18 << 18) + var19;
							var22 = (((var20 - var18) >> 3) << 18) + ((var21 - var19) >> 3);
							var7 += var8;
							var23 = var7 >> 8;
							--var15;
						} while (var15 > 0);

					var15 = (var6 - var5) & 7;
					if (var15 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							--var15;
						} while (var15 > 0);
				}
			}

		}
	}

	static int method915(final int var0, final double var1) {
		double var3 = (var0 >> 16) / 256.0D;
		double var5 = ((var0 >> 8) & 255) / 256.0D;
		double var7 = (var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		final int var9 = (int) (var3 * 256.0D);
		final int var10 = (int) (var5 * 256.0D);
		final int var11 = (int) (var7 * 256.0D);
		return (var9 << 16) + (var10 << 8) + var11;
	}

	public static final void method916() {
		anInt1677 = anInt1683 / 2;
		anInt1688 = anInt1679 / 2;
		anInt1689 = -anInt1677;
		anInt1681 = anInt1683 - anInt1677;
		anInt1682 = -anInt1688;
		anInt1684 = anInt1679 - anInt1688;
	}

	public static final void method917(final Interface2 var0) {
		anInterface2_1686 = var0;
	}

	public static final void method918(final double var0) {
		method919(var0, 0, 512);
	}

	static final void method919(double var0, final int var2, final int var3) {
		var0 += (Math.random() * 0.03D) - 0.015D;
		int var4 = var2 * 128;

		for (int var5 = var2; var5 < var3; ++var5) {
			final double var6 = ((var5 >> 3) / 64.0D) + 0.0078125D;
			final double var8 = ((var5 & 7) / 8.0D) + 0.0625D;

			for (int var10 = 0; var10 < 128; ++var10) {
				final double var11 = var10 / 128.0D;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0D) {
					double var19;
					if (var11 < 0.5D)
						var19 = var11 * (1.0D + var8);
					else
						var19 = (var11 + var8) - (var11 * var8);

					final double var21 = (2.0D * var11) - var19;
					double var23 = var6 + 0.3333333333333333D;
					if (var23 > 1.0D)
						--var23;

					double var27 = var6 - 0.3333333333333333D;
					if (var27 < 0.0D)
						++var27;

					if ((6.0D * var23) < 1.0D)
						var13 = var21 + ((var19 - var21) * 6.0D * var23);
					else if ((2.0D * var23) < 1.0D)
						var13 = var19;
					else if ((3.0D * var23) < 2.0D)
						var13 = var21 + ((var19 - var21) * (0.6666666666666666D - var23) * 6.0D);
					else
						var13 = var21;

					if ((6.0D * var6) < 1.0D)
						var15 = var21 + ((var19 - var21) * 6.0D * var6);
					else if ((2.0D * var6) < 1.0D)
						var15 = var19;
					else if ((3.0D * var6) < 2.0D)
						var15 = var21 + ((var19 - var21) * (0.6666666666666666D - var6) * 6.0D);
					else
						var15 = var21;

					if ((6.0D * var27) < 1.0D)
						var17 = var21 + ((var19 - var21) * 6.0D * var27);
					else if ((2.0D * var27) < 1.0D)
						var17 = var19;
					else if ((3.0D * var27) < 2.0D)
						var17 = var21 + ((var19 - var21) * (0.6666666666666666D - var27) * 6.0D);
					else
						var17 = var21;
				}

				final int var29 = (int) (var13 * 256.0D);
				final int var30 = (int) (var15 * 256.0D);
				final int var31 = (int) (var17 * 256.0D);
				int var32 = (var29 << 16) + (var30 << 8) + var31;
				var32 = method915(var32, var0);
				if (var32 == 0)
					var32 = 1;

				anIntArray1685[var4++] = var32;
			}
		}

	}

	public static void method920(final int var0, final int var1, final int var2) {
		aBool1675 = (var0 < 0) || (var0 > anInt1683) || (var1 < 0) || (var1 > anInt1683) || (var2 < 0)
				|| (var2 > anInt1683);
	}

	static final void method921(final int[] var0, int var1, int var2, int var3, int var4, int var5, int var6,
			int var7) {
		if (aBool1675) {
			if (var5 > anInt1683)
				var5 = anInt1683;

			if (var4 < 0)
				var4 = 0;
		}

		if (var4 < var5) {
			var1 += var4;
			var6 += var7 * var4;
			int var8;
			int var9;
			int var10;
			if (aBool1673) {
				var3 = (var5 - var4) >> 2;
				var7 <<= 2;
				if (anInt1674 == 0) {
					if (var3 > 0)
						do {
							var2 = anIntArray1685[var6 >> 8];
							var6 += var7;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);

					var3 = (var5 - var4) & 3;
					if (var3 > 0) {
						var2 = anIntArray1685[var6 >> 8];

						do {
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}
				} else {
					var8 = anInt1674;
					var9 = 256 - anInt1674;
					if (var3 > 0)
						do {
							var2 = anIntArray1685[var6 >> 8];
							var6 += var7;
							var2 = ((((var2 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var2 & '\uff00') * var9) >> 8) & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((((var10 & 16711935) * var8) >> 8) & 16711935)
									+ ((((var10 & '\uff00') * var8) >> 8) & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((((var10 & 16711935) * var8) >> 8) & 16711935)
									+ ((((var10 & '\uff00') * var8) >> 8) & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((((var10 & 16711935) * var8) >> 8) & 16711935)
									+ ((((var10 & '\uff00') * var8) >> 8) & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((((var10 & 16711935) * var8) >> 8) & 16711935)
									+ ((((var10 & '\uff00') * var8) >> 8) & '\uff00');
							--var3;
						} while (var3 > 0);

					var3 = (var5 - var4) & 3;
					if (var3 > 0) {
						var2 = anIntArray1685[var6 >> 8];
						var2 = ((((var2 & 16711935) * var9) >> 8) & 16711935)
								+ ((((var2 & '\uff00') * var9) >> 8) & '\uff00');

						do {
							var10 = var0[var1];
							var0[var1++] = var2 + ((((var10 & 16711935) * var8) >> 8) & 16711935)
									+ ((((var10 & '\uff00') * var8) >> 8) & '\uff00');
							--var3;
						} while (var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4;
				if (anInt1674 == 0)
					do {
						var0[var1++] = anIntArray1685[var6 >> 8];
						var6 += var7;
						--var3;
					} while (var3 > 0);
				else {
					var8 = anInt1674;
					var9 = 256 - anInt1674;

					do {
						var2 = anIntArray1685[var6 >> 8];
						var6 += var7;
						var2 = ((((var2 & 16711935) * var9) >> 8) & 16711935)
								+ ((((var2 & '\uff00') * var9) >> 8) & '\uff00');
						var10 = var0[var1];
						var0[var1++] = var2 + ((((var10 & 16711935) * var8) >> 8) & 16711935)
								+ ((((var10 & '\uff00') * var8) >> 8) & '\uff00');
						--var3;
					} while (var3 > 0);
				}

			}
		}
	}

	public static final void method922(int var0, int var1, int var2, int var3, int var4, int var5, final int var6) {
		int var7 = 0;
		if (var1 != var0)
			var7 = ((var4 - var3) << 16) / (var1 - var0);

		int var8 = 0;
		if (var2 != var1)
			var8 = ((var5 - var4) << 16) / (var2 - var1);

		int var9 = 0;
		if (var2 != var0)
			var9 = ((var3 - var5) << 16) / (var0 - var2);

		if ((var0 <= var1) && (var0 <= var2)) {
			if (var0 < anInt1679) {
				if (var1 > anInt1679)
					var1 = anInt1679;

				if (var2 > anInt1679)
					var2 = anInt1679;

				if (var1 < var2) {
					var5 = var3 <<= 16;
					if (var0 < 0) {
						var5 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var4 <<= 16;
					if (var1 < 0) {
						var4 -= var8 * var1;
						var1 = 0;
					}

					if (((var0 != var1) && (var9 < var7)) || ((var0 == var1) && (var9 > var8))) {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1676[var0];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method923(anIntArray1474, var0, var6, 0, var5 >> 16, var4 >> 16);
									var5 += var9;
									var4 += var8;
									var0 += anInt1469;
								}

							method923(anIntArray1474, var0, var6, 0, var5 >> 16, var3 >> 16);
							var5 += var9;
							var3 += var7;
							var0 += anInt1469;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1676[var0];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method923(anIntArray1474, var0, var6, 0, var4 >> 16, var5 >> 16);
									var5 += var9;
									var4 += var8;
									var0 += anInt1469;
								}

							method923(anIntArray1474, var0, var6, 0, var3 >> 16, var5 >> 16);
							var5 += var9;
							var3 += var7;
							var0 += anInt1469;
						}
					}
				} else {
					var4 = var3 <<= 16;
					if (var0 < 0) {
						var4 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var5 <<= 16;
					if (var2 < 0) {
						var5 -= var8 * var2;
						var2 = 0;
					}

					if (((var0 != var2) && (var9 < var7)) || ((var0 == var2) && (var8 > var7))) {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1676[var0];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method923(anIntArray1474, var0, var6, 0, var5 >> 16, var3 >> 16);
									var5 += var8;
									var3 += var7;
									var0 += anInt1469;
								}

							method923(anIntArray1474, var0, var6, 0, var4 >> 16, var3 >> 16);
							var4 += var9;
							var3 += var7;
							var0 += anInt1469;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1676[var0];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method923(anIntArray1474, var0, var6, 0, var3 >> 16, var5 >> 16);
									var5 += var8;
									var3 += var7;
									var0 += anInt1469;
								}

							method923(anIntArray1474, var0, var6, 0, var3 >> 16, var4 >> 16);
							var4 += var9;
							var3 += var7;
							var0 += anInt1469;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < anInt1679) {
				if (var2 > anInt1679)
					var2 = anInt1679;

				if (var0 > anInt1679)
					var0 = anInt1679;

				if (var2 < var0) {
					var3 = var4 <<= 16;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var5 <<= 16;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}

					if (((var1 != var2) && (var7 < var8)) || ((var1 == var2) && (var7 > var9))) {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1676[var1];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method923(anIntArray1474, var1, var6, 0, var3 >> 16, var5 >> 16);
									var3 += var7;
									var5 += var9;
									var1 += anInt1469;
								}

							method923(anIntArray1474, var1, var6, 0, var3 >> 16, var4 >> 16);
							var3 += var7;
							var4 += var8;
							var1 += anInt1469;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1676[var1];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method923(anIntArray1474, var1, var6, 0, var5 >> 16, var3 >> 16);
									var3 += var7;
									var5 += var9;
									var1 += anInt1469;
								}

							method923(anIntArray1474, var1, var6, 0, var4 >> 16, var3 >> 16);
							var3 += var7;
							var4 += var8;
							var1 += anInt1469;
						}
					}
				} else {
					var5 = var4 <<= 16;
					if (var1 < 0) {
						var5 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var3 <<= 16;
					if (var0 < 0) {
						var3 -= var9 * var0;
						var0 = 0;
					}

					if (var7 < var8) {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1676[var1];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method923(anIntArray1474, var1, var6, 0, var3 >> 16, var4 >> 16);
									var3 += var9;
									var4 += var8;
									var1 += anInt1469;
								}

							method923(anIntArray1474, var1, var6, 0, var5 >> 16, var4 >> 16);
							var5 += var7;
							var4 += var8;
							var1 += anInt1469;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1676[var1];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method923(anIntArray1474, var1, var6, 0, var4 >> 16, var3 >> 16);
									var3 += var9;
									var4 += var8;
									var1 += anInt1469;
								}

							method923(anIntArray1474, var1, var6, 0, var4 >> 16, var5 >> 16);
							var5 += var7;
							var4 += var8;
							var1 += anInt1469;
						}
					}
				}
			}
		} else if (var2 < anInt1679) {
			if (var0 > anInt1679)
				var0 = anInt1679;

			if (var1 > anInt1679)
				var1 = anInt1679;

			if (var0 < var1) {
				var4 = var5 <<= 16;
				if (var2 < 0) {
					var4 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var3 <<= 16;
				if (var0 < 0) {
					var3 -= var7 * var0;
					var0 = 0;
				}

				if (var8 < var9) {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1676[var2];

					while (true) {
						--var0;
						if (var0 < 0)
							while (true) {
								--var1;
								if (var1 < 0)
									return;

								method923(anIntArray1474, var2, var6, 0, var4 >> 16, var3 >> 16);
								var4 += var8;
								var3 += var7;
								var2 += anInt1469;
							}

						method923(anIntArray1474, var2, var6, 0, var4 >> 16, var5 >> 16);
						var4 += var8;
						var5 += var9;
						var2 += anInt1469;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1676[var2];

					while (true) {
						--var0;
						if (var0 < 0)
							while (true) {
								--var1;
								if (var1 < 0)
									return;

								method923(anIntArray1474, var2, var6, 0, var3 >> 16, var4 >> 16);
								var4 += var8;
								var3 += var7;
								var2 += anInt1469;
							}

						method923(anIntArray1474, var2, var6, 0, var5 >> 16, var4 >> 16);
						var4 += var8;
						var5 += var9;
						var2 += anInt1469;
					}
				}
			} else {
				var3 = var5 <<= 16;
				if (var2 < 0) {
					var3 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var4 <<= 16;
				if (var1 < 0) {
					var4 -= var7 * var1;
					var1 = 0;
				}

				if (var8 < var9) {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1676[var2];

					while (true) {
						--var1;
						if (var1 < 0)
							while (true) {
								--var0;
								if (var0 < 0)
									return;

								method923(anIntArray1474, var2, var6, 0, var4 >> 16, var5 >> 16);
								var4 += var7;
								var5 += var9;
								var2 += anInt1469;
							}

						method923(anIntArray1474, var2, var6, 0, var3 >> 16, var5 >> 16);
						var3 += var8;
						var5 += var9;
						var2 += anInt1469;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1676[var2];

					while (true) {
						--var1;
						if (var1 < 0)
							while (true) {
								--var0;
								if (var0 < 0)
									return;

								method923(anIntArray1474, var2, var6, 0, var5 >> 16, var4 >> 16);
								var4 += var7;
								var5 += var9;
								var2 += anInt1469;
							}

						method923(anIntArray1474, var2, var6, 0, var5 >> 16, var3 >> 16);
						var3 += var8;
						var5 += var9;
						var2 += anInt1469;
					}
				}
			}
		}
	}

	static final void method923(final int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (aBool1675) {
			if (var5 > anInt1683)
				var5 = anInt1683;

			if (var4 < 0)
				var4 = 0;
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = (var5 - var4) >> 2;
			if (anInt1674 != 0) {
				if (anInt1674 == 254)
					while (true) {
						--var3;
						if (var3 < 0) {
							var3 = (var5 - var4) & 3;

							while (true) {
								--var3;
								if (var3 < 0)
									return;

								var0[var1++] = var0[var1];
							}
						}

						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
					}
				else {
					final int var6 = anInt1674;
					final int var7 = 256 - anInt1674;
					var2 = ((((var2 & 16711935) * var7) >> 8) & 16711935)
							+ ((((var2 & '\uff00') * var7) >> 8) & '\uff00');

					while (true) {
						--var3;
						int var8;
						if (var3 < 0) {
							var3 = (var5 - var4) & 3;

							while (true) {
								--var3;
								if (var3 < 0)
									return;

								var8 = var0[var1];
								var0[var1++] = var2 + ((((var8 & 16711935) * var6) >> 8) & 16711935)
										+ ((((var8 & '\uff00') * var6) >> 8) & '\uff00');
							}
						}

						var8 = var0[var1];
						var0[var1++] = var2 + ((((var8 & 16711935) * var6) >> 8) & 16711935)
								+ ((((var8 & '\uff00') * var6) >> 8) & '\uff00');
						var8 = var0[var1];
						var0[var1++] = var2 + ((((var8 & 16711935) * var6) >> 8) & 16711935)
								+ ((((var8 & '\uff00') * var6) >> 8) & '\uff00');
						var8 = var0[var1];
						var0[var1++] = var2 + ((((var8 & 16711935) * var6) >> 8) & 16711935)
								+ ((((var8 & '\uff00') * var6) >> 8) & '\uff00');
						var8 = var0[var1];
						var0[var1++] = var2 + ((((var8 & 16711935) * var6) >> 8) & 16711935)
								+ ((((var8 & '\uff00') * var6) >> 8) & '\uff00');
					}
				}
			} else
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = (var5 - var4) & 3;

						while (true) {
							--var3;
							if (var3 < 0)
								return;

							var0[var1++] = var2;
						}
					}

					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
		}
	}

	static final void method924(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, final int var9, int var10, int var11, final int var12, int var13, int var14, final int var15,
			int var16, int var17, final int var18) {
		final int[] var19 = anInterface2_1686.method4(var18, -112476939);
		int var20;
		if (var19 == null) {
			var20 = anInterface2_1686.method1(var18, -2127473748);
			method929(var0, var1, var2, var3, var4, var5, method926(var20, var6), method926(var20, var7),
					method926(var20, var8));
		} else {
			aBool1672 = anInterface2_1686.method3(var18, 2131682911);
			aBool1690 = anInterface2_1686.method2(var18, 264071661);
			var20 = var4 - var3;
			final int var21 = var1 - var0;
			final int var22 = var5 - var3;
			final int var23 = var2 - var0;
			final int var24 = var7 - var6;
			final int var25 = var8 - var6;
			int var26 = 0;
			if (var1 != var0)
				var26 = ((var4 - var3) << 16) / (var1 - var0);

			int var27 = 0;
			if (var2 != var1)
				var27 = ((var5 - var4) << 16) / (var2 - var1);

			int var28 = 0;
			if (var2 != var0)
				var28 = ((var3 - var5) << 16) / (var0 - var2);

			final int var29 = (var20 * var23) - (var22 * var21);
			if (var29 != 0) {
				final int var30 = (((var24 * var23) - (var25 * var21)) << 9) / var29;
				final int var31 = (((var25 * var20) - (var24 * var22)) << 9) / var29;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var32 = ((var11 * var12) - (var14 * var9)) << 14;
				final int var33 = ((var14 * var15) - (var17 * var12)) << 8;
				final int var34 = ((var17 * var9) - (var11 * var15)) << 5;
				int var35 = ((var10 * var12) - (var13 * var9)) << 14;
				final int var36 = ((var13 * var15) - (var16 * var12)) << 8;
				final int var37 = ((var16 * var9) - (var10 * var15)) << 5;
				int var38 = ((var13 * var11) - (var10 * var14)) << 14;
				final int var39 = ((var16 * var14) - (var13 * var17)) << 8;
				final int var40 = ((var10 * var17) - (var16 * var11)) << 5;
				int var41;
				if ((var0 <= var1) && (var0 <= var2)) {
					if (var0 < anInt1679) {
						if (var1 > anInt1679)
							var1 = anInt1679;

						if (var2 > anInt1679)
							var2 = anInt1679;

						var6 = ((var6 << 9) - (var30 * var3)) + var30;
						if (var1 < var2) {
							var5 = var3 <<= 16;
							if (var0 < 0) {
								var5 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var4 <<= 16;
							if (var1 < 0) {
								var4 -= var27 * var1;
								var1 = 0;
							}

							var41 = var0 - anInt1688;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (((var0 != var1) && (var28 < var26)) || ((var0 == var1) && (var28 > var27))) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1676[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method914(anIntArray1474, var19, 0, 0, var0, var5 >> 16, var4 >> 16, var6,
													var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method914(anIntArray1474, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var30,
											var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1676[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method914(anIntArray1474, var19, 0, 0, var0, var4 >> 16, var5 >> 16, var6,
													var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method914(anIntArray1474, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var30,
											var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var4 = var3 <<= 16;
							if (var0 < 0) {
								var4 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var5 <<= 16;
							if (var2 < 0) {
								var5 -= var27 * var2;
								var2 = 0;
							}

							var41 = var0 - anInt1688;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (((var0 == var2) || (var28 >= var26)) && ((var0 != var2) || (var27 <= var26))) {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1676[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method914(anIntArray1474, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6,
													var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method914(anIntArray1474, var19, 0, 0, var0, var3 >> 16, var4 >> 16, var6, var30,
											var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1676[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method914(anIntArray1474, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6,
													var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method914(anIntArray1474, var19, 0, 0, var0, var4 >> 16, var3 >> 16, var6, var30,
											var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt1679) {
						if (var2 > anInt1679)
							var2 = anInt1679;

						if (var0 > anInt1679)
							var0 = anInt1679;

						var7 = ((var7 << 9) - (var30 * var4)) + var30;
						if (var2 < var0) {
							var3 = var4 <<= 16;
							if (var1 < 0) {
								var3 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var5 <<= 16;
							if (var2 < 0) {
								var5 -= var28 * var2;
								var2 = 0;
							}

							var41 = var1 - anInt1688;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (((var1 != var2) && (var26 < var27)) || ((var1 == var2) && (var26 > var28))) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1676[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method914(anIntArray1474, var19, 0, 0, var1, var3 >> 16, var5 >> 16, var7,
													var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method914(anIntArray1474, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var30,
											var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1676[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method914(anIntArray1474, var19, 0, 0, var1, var5 >> 16, var3 >> 16, var7,
													var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method914(anIntArray1474, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var30,
											var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var5 = var4 <<= 16;
							if (var1 < 0) {
								var5 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var3 <<= 16;
							if (var0 < 0) {
								var3 -= var28 * var0;
								var0 = 0;
							}

							var41 = var1 - anInt1688;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var26 < var27) {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1676[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method914(anIntArray1474, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7,
													var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method914(anIntArray1474, var19, 0, 0, var1, var5 >> 16, var4 >> 16, var7, var30,
											var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1676[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method914(anIntArray1474, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7,
													var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method914(anIntArray1474, var19, 0, 0, var1, var4 >> 16, var5 >> 16, var7, var30,
											var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var2 < anInt1679) {
					if (var0 > anInt1679)
						var0 = anInt1679;

					if (var1 > anInt1679)
						var1 = anInt1679;

					var8 = ((var8 << 9) - (var30 * var5)) + var30;
					if (var0 < var1) {
						var4 = var5 <<= 16;
						if (var2 < 0) {
							var4 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var3 <<= 16;
						if (var0 < 0) {
							var3 -= var26 * var0;
							var0 = 0;
						}

						var41 = var2 - anInt1688;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1676[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method914(anIntArray1474, var19, 0, 0, var2, var4 >> 16, var3 >> 16, var8,
												var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += anInt1469;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}

								method914(anIntArray1474, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var30, var32,
										var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += anInt1469;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1676[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method914(anIntArray1474, var19, 0, 0, var2, var3 >> 16, var4 >> 16, var8,
												var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += anInt1469;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}

								method914(anIntArray1474, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var30, var32,
										var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += anInt1469;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					} else {
						var3 = var5 <<= 16;
						if (var2 < 0) {
							var3 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var4 <<= 16;
						if (var1 < 0) {
							var4 -= var26 * var1;
							var1 = 0;
						}

						var41 = var2 - anInt1688;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1676[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method914(anIntArray1474, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8,
												var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += anInt1469;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}

								method914(anIntArray1474, var19, 0, 0, var2, var3 >> 16, var5 >> 16, var8, var30, var32,
										var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += anInt1469;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1676[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method914(anIntArray1474, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8,
												var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += anInt1469;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}

								method914(anIntArray1474, var19, 0, 0, var2, var5 >> 16, var3 >> 16, var8, var30, var32,
										var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += anInt1469;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					}
				}
			}
		}
	}

	static final void method925(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, final int var9, int var10, int var11, final int var12, int var13, int var14, final int var15,
			int var16, int var17, final int var18) {
		final int[] var19 = anInterface2_1686.method4(var18, -112476939);
		int var20;
		if (var19 == null) {
			var20 = anInterface2_1686.method1(var18, -2136958796);
			method929(var0, var1, var2, var3, var4, var5, method926(var20, var6), method926(var20, var7),
					method926(var20, var8));
		} else {
			aBool1672 = anInterface2_1686.method3(var18, 1541127083);
			aBool1690 = anInterface2_1686.method2(var18, -1689975063);
			var20 = var4 - var3;
			final int var21 = var1 - var0;
			final int var22 = var5 - var3;
			final int var23 = var2 - var0;
			final int var24 = var7 - var6;
			final int var25 = var8 - var6;
			int var26 = 0;
			if (var1 != var0)
				var26 = ((var4 - var3) << 16) / (var1 - var0);

			int var27 = 0;
			if (var2 != var1)
				var27 = ((var5 - var4) << 16) / (var2 - var1);

			int var28 = 0;
			if (var2 != var0)
				var28 = ((var3 - var5) << 16) / (var0 - var2);

			final int var29 = (var20 * var23) - (var22 * var21);
			if (var29 != 0) {
				final int var30 = (((var24 * var23) - (var25 * var21)) << 9) / var29;
				final int var31 = (((var25 * var20) - (var24 * var22)) << 9) / var29;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var32 = ((var11 * var12) - (var14 * var9)) << 14;
				final int var33 = ((var14 * var15) - (var17 * var12)) << 5;
				final int var34 = ((var17 * var9) - (var11 * var15)) << 5;
				int var35 = ((var10 * var12) - (var13 * var9)) << 14;
				final int var36 = ((var13 * var15) - (var16 * var12)) << 5;
				final int var37 = ((var16 * var9) - (var10 * var15)) << 5;
				int var38 = ((var13 * var11) - (var10 * var14)) << 14;
				final int var39 = ((var16 * var14) - (var13 * var17)) << 5;
				final int var40 = ((var10 * var17) - (var16 * var11)) << 5;
				int var41;
				if ((var0 <= var1) && (var0 <= var2)) {
					if (var0 < anInt1679) {
						if (var1 > anInt1679)
							var1 = anInt1679;

						if (var2 > anInt1679)
							var2 = anInt1679;

						var6 = ((var6 << 9) - (var30 * var3)) + var30;
						if (var1 < var2) {
							var5 = var3 <<= 16;
							if (var0 < 0) {
								var5 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var4 <<= 16;
							if (var1 < 0) {
								var4 -= var27 * var1;
								var1 = 0;
							}

							var41 = var0 - anInt1688;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (((var0 != var1) && (var28 < var26)) || ((var0 == var1) && (var28 > var27))) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1676[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method930(anIntArray1474, var19, 0, 0, var0, var5 >> 16, var4 >> 16, var6,
													var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method930(anIntArray1474, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var30,
											var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1676[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method930(anIntArray1474, var19, 0, 0, var0, var4 >> 16, var5 >> 16, var6,
													var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method930(anIntArray1474, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var30,
											var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var4 = var3 <<= 16;
							if (var0 < 0) {
								var4 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var5 <<= 16;
							if (var2 < 0) {
								var5 -= var27 * var2;
								var2 = 0;
							}

							var41 = var0 - anInt1688;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (((var0 == var2) || (var28 >= var26)) && ((var0 != var2) || (var27 <= var26))) {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1676[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method930(anIntArray1474, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6,
													var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method930(anIntArray1474, var19, 0, 0, var0, var3 >> 16, var4 >> 16, var6, var30,
											var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1676[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method930(anIntArray1474, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6,
													var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method930(anIntArray1474, var19, 0, 0, var0, var4 >> 16, var3 >> 16, var6, var30,
											var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt1679) {
						if (var2 > anInt1679)
							var2 = anInt1679;

						if (var0 > anInt1679)
							var0 = anInt1679;

						var7 = ((var7 << 9) - (var30 * var4)) + var30;
						if (var2 < var0) {
							var3 = var4 <<= 16;
							if (var1 < 0) {
								var3 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var5 <<= 16;
							if (var2 < 0) {
								var5 -= var28 * var2;
								var2 = 0;
							}

							var41 = var1 - anInt1688;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (((var1 != var2) && (var26 < var27)) || ((var1 == var2) && (var26 > var28))) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1676[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method930(anIntArray1474, var19, 0, 0, var1, var3 >> 16, var5 >> 16, var7,
													var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method930(anIntArray1474, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var30,
											var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1676[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method930(anIntArray1474, var19, 0, 0, var1, var5 >> 16, var3 >> 16, var7,
													var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method930(anIntArray1474, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var30,
											var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var5 = var4 <<= 16;
							if (var1 < 0) {
								var5 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var3 <<= 16;
							if (var0 < 0) {
								var3 -= var28 * var0;
								var0 = 0;
							}

							var41 = var1 - anInt1688;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var26 < var27) {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1676[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method930(anIntArray1474, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7,
													var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method930(anIntArray1474, var19, 0, 0, var1, var5 >> 16, var4 >> 16, var7, var30,
											var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1676[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method930(anIntArray1474, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7,
													var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += anInt1469;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}

									method930(anIntArray1474, var19, 0, 0, var1, var4 >> 16, var5 >> 16, var7, var30,
											var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += anInt1469;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var2 < anInt1679) {
					if (var0 > anInt1679)
						var0 = anInt1679;

					if (var1 > anInt1679)
						var1 = anInt1679;

					var8 = ((var8 << 9) - (var30 * var5)) + var30;
					if (var0 < var1) {
						var4 = var5 <<= 16;
						if (var2 < 0) {
							var4 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var3 <<= 16;
						if (var0 < 0) {
							var3 -= var26 * var0;
							var0 = 0;
						}

						var41 = var2 - anInt1688;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1676[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method930(anIntArray1474, var19, 0, 0, var2, var4 >> 16, var3 >> 16, var8,
												var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += anInt1469;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}

								method930(anIntArray1474, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var30, var32,
										var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += anInt1469;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1676[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method930(anIntArray1474, var19, 0, 0, var2, var3 >> 16, var4 >> 16, var8,
												var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += anInt1469;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}

								method930(anIntArray1474, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var30, var32,
										var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += anInt1469;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					} else {
						var3 = var5 <<= 16;
						if (var2 < 0) {
							var3 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var4 <<= 16;
						if (var1 < 0) {
							var4 -= var26 * var1;
							var1 = 0;
						}

						var41 = var2 - anInt1688;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1676[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method930(anIntArray1474, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8,
												var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += anInt1469;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}

								method930(anIntArray1474, var19, 0, 0, var2, var3 >> 16, var5 >> 16, var8, var30, var32,
										var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += anInt1469;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1676[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method930(anIntArray1474, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8,
												var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += anInt1469;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}

								method930(anIntArray1474, var19, 0, 0, var2, var5 >> 16, var3 >> 16, var8, var30, var32,
										var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += anInt1469;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					}
				}
			}
		}
	}

	static final int method926(final int var0, int var1) {
		var1 = (var1 * (var0 & 127)) >> 7;
		if (var1 < 2)
			var1 = 2;
		else if (var1 > 126)
			var1 = 126;

		return (var0 & '\uff80') + var1;
	}

	static {
		int var0;
		for (var0 = 1; var0 < 512; ++var0)
			anIntArray1687[var0] = '\u8000' / var0;

		for (var0 = 1; var0 < 2048; ++var0)
			anIntArray1671[var0] = 65536 / var0;

		for (var0 = 0; var0 < 2048; ++var0) {
			anIntArray1680[var0] = (int) (65536.0D * Math.sin(var0 * 0.0030679615D));
			anIntArray1678[var0] = (int) (65536.0D * Math.cos(var0 * 0.0030679615D));
		}

	}

	static final void method927(final int var0, final int var1, final int var2, final int var3) {
		anInt1683 = var2 - var0;
		anInt1679 = var3 - var1;
		method916();
		int var4;
		int var5;
		if (anIntArray1676.length < anInt1679) {
			var4 = anInt1679;
			--var4;
			var4 |= var4 >>> 1;
			var4 |= var4 >>> 2;
			var4 |= var4 >>> 4;
			var4 |= var4 >>> 8;
			var4 |= var4 >>> 16;
			var5 = var4 + 1;
			anIntArray1676 = new int[var5];
		}

		var5 = (var1 * anInt1469) + var0;

		for (var4 = 0; var4 < anInt1679; ++var4) {
			anIntArray1676[var4] = var5;
			var5 += anInt1469;
		}

	}

	public static final void method928(final int var0, final int var1) {
		final int var2 = anIntArray1676[0];
		final int var3 = var2 / anInt1469;
		final int var4 = var2 - (var3 * anInt1469);
		anInt1677 = var0 - var4;
		anInt1688 = var1 - var3;
		anInt1689 = -anInt1677;
		anInt1681 = anInt1683 - anInt1677;
		anInt1682 = -anInt1688;
		anInt1684 = anInt1679 - anInt1688;
	}

	Class104_Sub18_Sub17_Sub4() throws Throwable {
		throw new Error();
	}

	static final void method929(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		final int var9 = var4 - var3;
		final int var10 = var1 - var0;
		final int var11 = var5 - var3;
		final int var12 = var2 - var0;
		final int var13 = var7 - var6;
		final int var14 = var8 - var6;
		int var15;
		if (var2 != var1)
			var15 = ((var5 - var4) << 16) / (var2 - var1);
		else
			var15 = 0;

		int var16;
		if (var1 != var0)
			var16 = (var9 << 16) / var10;
		else
			var16 = 0;

		int var17;
		if (var2 != var0)
			var17 = (var11 << 16) / var12;
		else
			var17 = 0;

		final int var18 = (var9 * var12) - (var11 * var10);
		if (var18 != 0) {
			final int var19 = (((var13 * var12) - (var14 * var10)) << 8) / var18;
			final int var20 = (((var14 * var9) - (var13 * var11)) << 8) / var18;
			if ((var0 <= var1) && (var0 <= var2)) {
				if (var0 < anInt1679) {
					if (var1 > anInt1679)
						var1 = anInt1679;

					if (var2 > anInt1679)
						var2 = anInt1679;

					var6 = ((var6 << 8) - (var19 * var3)) + var19;
					if (var1 < var2) {
						var5 = var3 <<= 16;
						if (var0 < 0) {
							var5 -= var17 * var0;
							var3 -= var16 * var0;
							var6 -= var20 * var0;
							var0 = 0;
						}

						var4 <<= 16;
						if (var1 < 0) {
							var4 -= var15 * var1;
							var1 = 0;
						}

						if (((var0 == var1) || (var17 >= var16)) && ((var0 != var1) || (var17 <= var15))) {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray1676[var0];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method921(anIntArray1474, var0, 0, 0, var4 >> 16, var5 >> 16, var6, var19);
										var5 += var17;
										var4 += var15;
										var6 += var20;
										var0 += anInt1469;
									}

								method921(anIntArray1474, var0, 0, 0, var3 >> 16, var5 >> 16, var6, var19);
								var5 += var17;
								var3 += var16;
								var6 += var20;
								var0 += anInt1469;
							}
						} else {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray1676[var0];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method921(anIntArray1474, var0, 0, 0, var5 >> 16, var4 >> 16, var6, var19);
										var5 += var17;
										var4 += var15;
										var6 += var20;
										var0 += anInt1469;
									}

								method921(anIntArray1474, var0, 0, 0, var5 >> 16, var3 >> 16, var6, var19);
								var5 += var17;
								var3 += var16;
								var6 += var20;
								var0 += anInt1469;
							}
						}
					} else {
						var4 = var3 <<= 16;
						if (var0 < 0) {
							var4 -= var17 * var0;
							var3 -= var16 * var0;
							var6 -= var20 * var0;
							var0 = 0;
						}

						var5 <<= 16;
						if (var2 < 0) {
							var5 -= var15 * var2;
							var2 = 0;
						}

						if (((var0 != var2) && (var17 < var16)) || ((var0 == var2) && (var15 > var16))) {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray1676[var0];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method921(anIntArray1474, var0, 0, 0, var5 >> 16, var3 >> 16, var6, var19);
										var5 += var15;
										var3 += var16;
										var6 += var20;
										var0 += anInt1469;
									}

								method921(anIntArray1474, var0, 0, 0, var4 >> 16, var3 >> 16, var6, var19);
								var4 += var17;
								var3 += var16;
								var6 += var20;
								var0 += anInt1469;
							}
						} else {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray1676[var0];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method921(anIntArray1474, var0, 0, 0, var3 >> 16, var5 >> 16, var6, var19);
										var5 += var15;
										var3 += var16;
										var6 += var20;
										var0 += anInt1469;
									}

								method921(anIntArray1474, var0, 0, 0, var3 >> 16, var4 >> 16, var6, var19);
								var4 += var17;
								var3 += var16;
								var6 += var20;
								var0 += anInt1469;
							}
						}
					}
				}
			} else if (var1 <= var2) {
				if (var1 < anInt1679) {
					if (var2 > anInt1679)
						var2 = anInt1679;

					if (var0 > anInt1679)
						var0 = anInt1679;

					var7 = ((var7 << 8) - (var19 * var4)) + var19;
					if (var2 < var0) {
						var3 = var4 <<= 16;
						if (var1 < 0) {
							var3 -= var16 * var1;
							var4 -= var15 * var1;
							var7 -= var20 * var1;
							var1 = 0;
						}

						var5 <<= 16;
						if (var2 < 0) {
							var5 -= var17 * var2;
							var2 = 0;
						}

						if (((var1 == var2) || (var16 >= var15)) && ((var1 != var2) || (var16 <= var17))) {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray1676[var1];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method921(anIntArray1474, var1, 0, 0, var5 >> 16, var3 >> 16, var7, var19);
										var3 += var16;
										var5 += var17;
										var7 += var20;
										var1 += anInt1469;
									}

								method921(anIntArray1474, var1, 0, 0, var4 >> 16, var3 >> 16, var7, var19);
								var3 += var16;
								var4 += var15;
								var7 += var20;
								var1 += anInt1469;
							}
						} else {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray1676[var1];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method921(anIntArray1474, var1, 0, 0, var3 >> 16, var5 >> 16, var7, var19);
										var3 += var16;
										var5 += var17;
										var7 += var20;
										var1 += anInt1469;
									}

								method921(anIntArray1474, var1, 0, 0, var3 >> 16, var4 >> 16, var7, var19);
								var3 += var16;
								var4 += var15;
								var7 += var20;
								var1 += anInt1469;
							}
						}
					} else {
						var5 = var4 <<= 16;
						if (var1 < 0) {
							var5 -= var16 * var1;
							var4 -= var15 * var1;
							var7 -= var20 * var1;
							var1 = 0;
						}

						var3 <<= 16;
						if (var0 < 0) {
							var3 -= var17 * var0;
							var0 = 0;
						}

						if (var16 < var15) {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray1676[var1];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method921(anIntArray1474, var1, 0, 0, var3 >> 16, var4 >> 16, var7, var19);
										var3 += var17;
										var4 += var15;
										var7 += var20;
										var1 += anInt1469;
									}

								method921(anIntArray1474, var1, 0, 0, var5 >> 16, var4 >> 16, var7, var19);
								var5 += var16;
								var4 += var15;
								var7 += var20;
								var1 += anInt1469;
							}
						} else {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray1676[var1];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method921(anIntArray1474, var1, 0, 0, var4 >> 16, var3 >> 16, var7, var19);
										var3 += var17;
										var4 += var15;
										var7 += var20;
										var1 += anInt1469;
									}

								method921(anIntArray1474, var1, 0, 0, var4 >> 16, var5 >> 16, var7, var19);
								var5 += var16;
								var4 += var15;
								var7 += var20;
								var1 += anInt1469;
							}
						}
					}
				}
			} else if (var2 < anInt1679) {
				if (var0 > anInt1679)
					var0 = anInt1679;

				if (var1 > anInt1679)
					var1 = anInt1679;

				var8 = ((var8 << 8) - (var19 * var5)) + var19;
				if (var0 < var1) {
					var4 = var5 <<= 16;
					if (var2 < 0) {
						var4 -= var15 * var2;
						var5 -= var17 * var2;
						var8 -= var20 * var2;
						var2 = 0;
					}

					var3 <<= 16;
					if (var0 < 0) {
						var3 -= var16 * var0;
						var0 = 0;
					}

					if (var15 < var17) {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray1676[var2];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method921(anIntArray1474, var2, 0, 0, var4 >> 16, var3 >> 16, var8, var19);
									var4 += var15;
									var3 += var16;
									var8 += var20;
									var2 += anInt1469;
								}

							method921(anIntArray1474, var2, 0, 0, var4 >> 16, var5 >> 16, var8, var19);
							var4 += var15;
							var5 += var17;
							var8 += var20;
							var2 += anInt1469;
						}
					} else {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray1676[var2];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method921(anIntArray1474, var2, 0, 0, var3 >> 16, var4 >> 16, var8, var19);
									var4 += var15;
									var3 += var16;
									var8 += var20;
									var2 += anInt1469;
								}

							method921(anIntArray1474, var2, 0, 0, var5 >> 16, var4 >> 16, var8, var19);
							var4 += var15;
							var5 += var17;
							var8 += var20;
							var2 += anInt1469;
						}
					}
				} else {
					var3 = var5 <<= 16;
					if (var2 < 0) {
						var3 -= var15 * var2;
						var5 -= var17 * var2;
						var8 -= var20 * var2;
						var2 = 0;
					}

					var4 <<= 16;
					if (var1 < 0) {
						var4 -= var16 * var1;
						var1 = 0;
					}

					if (var15 < var17) {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray1676[var2];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method921(anIntArray1474, var2, 0, 0, var4 >> 16, var5 >> 16, var8, var19);
									var4 += var16;
									var5 += var17;
									var8 += var20;
									var2 += anInt1469;
								}

							method921(anIntArray1474, var2, 0, 0, var3 >> 16, var5 >> 16, var8, var19);
							var3 += var15;
							var5 += var17;
							var8 += var20;
							var2 += anInt1469;
						}
					} else {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray1676[var2];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method921(anIntArray1474, var2, 0, 0, var5 >> 16, var4 >> 16, var8, var19);
									var4 += var16;
									var5 += var17;
									var8 += var20;
									var2 += anInt1469;
								}

							method921(anIntArray1474, var2, 0, 0, var5 >> 16, var3 >> 16, var8, var19);
							var3 += var15;
							var5 += var17;
							var8 += var20;
							var2 += anInt1469;
						}
					}
				}
			}
		}
	}

	static final void method930(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, int var10, int var11, final int var12, final int var13, final int var14) {
		if (aBool1675) {
			if (var6 > anInt1683)
				var6 = anInt1683;

			if (var5 < 0)
				var5 = 0;
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var15 = var6 - var5;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (aBool1672) {
				var16 = var5 - anInt1677;
				var9 += var12 * var16;
				var10 += var13 * var16;
				var11 += var14 * var16;
				var17 = var11 >> 12;
				if (var17 != 0) {
					var18 = var9 / var17;
					var19 = var10 / var17;
				} else {
					var18 = 0;
					var19 = 0;
				}

				var9 += var12 * var15;
				var10 += var13 * var15;
				var11 += var14 * var15;
				var17 = var11 >> 12;
				if (var17 != 0) {
					var20 = var9 / var17;
					var21 = var10 / var17;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var2 = (var18 << 20) + var19;
				var22 = (((var20 - var18) / var15) << 20) + ((var21 - var19) / var15);
				var15 >>= 3;
				var8 <<= 3;
				var23 = var7 >> 8;
				if (aBool1690) {
					if (var15 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var7 += var8;
							var23 = var7 >> 8;
							--var15;
						} while (var15 > 0);

					var15 = (var6 - var5) & 7;
					if (var15 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							--var15;
						} while (var15 > 0);
				} else {
					if (var15 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							var7 += var8;
							var23 = var7 >> 8;
							--var15;
						} while (var15 > 0);

					var15 = (var6 - var5) & 7;
					if (var15 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							--var15;
						} while (var15 > 0);
				}
			} else {
				var16 = var5 - anInt1677;
				var9 += var12 * var16;
				var10 += var13 * var16;
				var11 += var14 * var16;
				var17 = var11 >> 14;
				if (var17 != 0) {
					var18 = var9 / var17;
					var19 = var10 / var17;
				} else {
					var18 = 0;
					var19 = 0;
				}

				var9 += var12 * var15;
				var10 += var13 * var15;
				var11 += var14 * var15;
				var17 = var11 >> 14;
				if (var17 != 0) {
					var20 = var9 / var17;
					var21 = var10 / var17;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var2 = (var18 << 18) + var19;
				var22 = (((var20 - var18) / var15) << 18) + ((var21 - var19) / var15);
				var15 >>= 3;
				var8 <<= 3;
				var23 = var7 >> 8;
				if (aBool1690) {
					if (var15 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							var7 += var8;
							var23 = var7 >> 8;
							--var15;
						} while (var15 > 0);

					var15 = (var6 - var5) & 7;
					if (var15 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var23) & -16711936)
									+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;
							var2 += var22;
							--var15;
						} while (var15 > 0);
				} else {
					if (var15 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							var7 += var8;
							var23 = var7 >> 8;
							--var15;
						} while (var15 > 0);

					var15 = (var6 - var5) & 7;
					if (var15 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var23) & -16711936)
										+ (((var3 & '\uff00') * var23) & 16711680)) >> 8;

							++var4;
							var2 += var22;
							--var15;
						} while (var15 > 0);
				}
			}

		}
	}

	public static final void method931() {
		method927(anInt1473, anInt1471, anInt1472, anInt1470);
	}
}
