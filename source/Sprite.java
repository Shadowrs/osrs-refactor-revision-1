import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public final class Sprite extends Class104_Sub18_Sub17 {
	public int[] anIntArray1592;
	public int anInt1590;
	int anInt1593;
	public int anInt1591;
	int anInt1588;
	int anInt1587;
	int anInt1589;

	public Sprite(final int var1, final int var2) {
		anIntArray1592 = new int[var1 * var2];
		anInt1593 = anInt1590 = var1;
		anInt1588 = anInt1591 = var2;
		anInt1587 = 0;
		anInt1589 = 0;
	}

	public void method833() {
		method790(anIntArray1592, anInt1593, anInt1588);
	}

	public void method834(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anIntArray1592.length; ++var4) {
			final int var5 = anIntArray1592[var4];
			if (var5 != 0) {
				int var6 = (var5 >> 16) & 255;
				var6 += var1;
				if (var6 < 1)
					var6 = 1;
				else if (var6 > 255)
					var6 = 255;

				int var7 = (var5 >> 8) & 255;
				var7 += var2;
				if (var7 < 1)
					var7 = 1;
				else if (var7 > 255)
					var7 = 255;

				int var8 = var5 & 255;
				var8 += var3;
				if (var8 < 1)
					var8 = 1;
				else if (var8 > 255)
					var8 = 255;

				anIntArray1592[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}

	}

	public void method835(int var1, int var2, int var3, int var4) {
		if ((var3 > 0) && (var4 > 0)) {
			final int var5 = anInt1593;
			final int var6 = anInt1588;
			int var7 = 0;
			int var8 = 0;
			final int var9 = anInt1590;
			final int var10 = anInt1591;
			final int var11 = (var9 << 16) / var3;
			final int var12 = (var10 << 16) / var4;
			int var13;
			if (anInt1589 > 0) {
				var13 = (((anInt1589 << 16) + var11) - 1) / var11;
				var1 += var13;
				var7 += (var13 * var11) - (anInt1589 << 16);
			}

			if (anInt1587 > 0) {
				var13 = (((anInt1587 << 16) + var12) - 1) / var12;
				var2 += var13;
				var8 += (var13 * var12) - (anInt1587 << 16);
			}

			if (var5 < var9)
				var3 = ((((var5 << 16) - var7) + var11) - 1) / var11;

			if (var6 < var10)
				var4 = ((((var6 << 16) - var8) + var12) - 1) / var12;

			var13 = var1 + (var2 * anInt1469);
			int var14 = anInt1469 - var3;
			if ((var2 + var4) > anInt1470)
				var4 -= (var2 + var4) - anInt1470;

			int var15;
			if (var2 < anInt1471) {
				var15 = anInt1471 - var2;
				var4 -= var15;
				var13 += var15 * anInt1469;
				var8 += var12 * var15;
			}

			if ((var1 + var3) > anInt1472) {
				var15 = (var1 + var3) - anInt1472;
				var3 -= var15;
				var14 += var15;
			}

			if (var1 < anInt1473) {
				var15 = anInt1473 - var1;
				var3 -= var15;
				var13 += var15;
				var7 += var11 * var15;
				var14 += var15;
			}

			method842(anIntArray1474, anIntArray1592, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
		}
	}

	public void method836(int var1, int var2, final int var3, final int var4, final int var5, final int var6,
			final double var7, final int var9) {
		try {
			final int var10 = -var3 / 2;
			final int var11 = -var4 / 2;
			int var12 = (int) (Math.sin(var7) * 65536.0D);
			int var13 = (int) (Math.cos(var7) * 65536.0D);
			var12 = (var12 * var9) >> 8;
			var13 = (var13 * var9) >> 8;
			int var14 = (var5 << 16) + (var11 * var12) + (var10 * var13);
			int var15 = (var6 << 16) + ((var11 * var13) - (var10 * var12));
			int var16 = var1 + (var2 * anInt1469);

			for (var2 = 0; var2 < var4; ++var2) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0; ++var1) {
					final int var20 = anIntArray1592[(var18 >> 16) + ((var19 >> 16) * anInt1593)];
					if (var20 != 0)
						anIntArray1474[var17++] = var20;
					else
						++var17;

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += anInt1469;
			}
		} catch (final Exception var22) {
			;
		}

	}

	public void method837() {
		final int[] var1 = new int[anInt1593 * anInt1588];
		int var2 = 0;

		for (int var3 = 0; var3 < anInt1588; ++var3)
			for (int var4 = anInt1593 - 1; var4 >= 0; --var4)
				var1[var2++] = anIntArray1592[var4 + (var3 * anInt1593)];

		anIntArray1592 = var1;
		anInt1589 = anInt1590 - anInt1593 - anInt1589;
	}

	public void method838(int var1, int var2) {
		var1 += anInt1589;
		var2 += anInt1587;
		int var3 = var1 + (var2 * anInt1469);
		int var4 = 0;
		int var5 = anInt1588;
		int var6 = anInt1593;
		int var7 = anInt1469 - var6;
		int var8 = 0;
		int var9;
		if (var2 < anInt1471) {
			var9 = anInt1471 - var2;
			var5 -= var9;
			var2 = anInt1471;
			var4 += var9 * var6;
			var3 += var9 * anInt1469;
		}

		if ((var2 + var5) > anInt1470)
			var5 -= (var2 + var5) - anInt1470;

		if (var1 < anInt1473) {
			var9 = anInt1473 - var1;
			var6 -= var9;
			var1 = anInt1473;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if ((var1 + var6) > anInt1472) {
			var9 = (var1 + var6) - anInt1472;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if ((var6 > 0) && (var5 > 0))
			method840(anIntArray1474, anIntArray1592, var4, var3, var6, var5, var7, var8);
	}

	public void method839(final int var1) {
		for (int var2 = anInt1588 - 1; var2 > 0; --var2) {
			final int var3 = var2 * anInt1593;

			for (int var4 = anInt1593 - 1; var4 > 0; --var4)
				if ((anIntArray1592[var4 + var3] == 0) && (anIntArray1592[(var4 + var3) - 1 - anInt1593] != 0))
					anIntArray1592[var4 + var3] = var1;
		}

	}

	Sprite() {
	}

	static void method840(final int[] var0, final int[] var1, int var2, int var3, final int var4, final int var5,
			final int var6, final int var7) {
		for (int var8 = -var5; var8 < 0; ++var8) {
			int var9;
			for (var9 = (var3 + var4) - 3; var3 < var9; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++])
				;

			var3 += var6;
			var2 += var7;
		}

	}

	public void draw(int var1, int var2) {
		var1 += anInt1589;
		var2 += anInt1587;
		int var3 = var1 + (var2 * anInt1469);
		int var4 = 0;
		int var5 = anInt1588;
		int var6 = anInt1593;
		int var7 = anInt1469 - var6;
		int var8 = 0;
		int var9;
		if (var2 < anInt1471) {
			var9 = anInt1471 - var2;
			var5 -= var9;
			var2 = anInt1471;
			var4 += var9 * var6;
			var3 += var9 * anInt1469;
		}

		if ((var2 + var5) > anInt1470)
			var5 -= (var2 + var5) - anInt1470;

		if (var1 < anInt1473) {
			var9 = anInt1473 - var1;
			var6 -= var9;
			var1 = anInt1473;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if ((var1 + var6) > anInt1472) {
			var9 = (var1 + var6) - anInt1472;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if ((var6 > 0) && (var5 > 0))
			method858(anIntArray1474, anIntArray1592, 0, var4, var3, var6, var5, var7, var8);
	}

	static void method842(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11) {
		final int var12 = var3;

		for (int var13 = -var8; var13 < 0; ++var13) {
			final int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0)
					var0[var5++] = var2;
				else
					++var5;

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}

	public Sprite(final byte[] var1, final Component var2) {
		try {
			final Image var3 = Toolkit.getDefaultToolkit().createImage(var1);
			final MediaTracker var4 = new MediaTracker(var2);
			var4.addImage(var3, 0);
			var4.waitForAll();
			anInt1593 = var3.getWidth(var2);
			anInt1588 = var3.getHeight(var2);
			anInt1590 = anInt1593;
			anInt1591 = anInt1588;
			anInt1589 = 0;
			anInt1587 = 0;
			anIntArray1592 = new int[anInt1593 * anInt1588];
			final PixelGrabber var5 = new PixelGrabber(var3, 0, 0, anInt1593, anInt1588, anIntArray1592, 0, anInt1593);
			var5.grabPixels();
		} catch (final InterruptedException var6) {
			;
		}

	}

	static void method843(final int[] var0, final int[] var1, int var2, int var3, int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9, int var10) {
		final int var11 = 256 - var9;
		int var12 = ((var10 & 16711935) * var11) & -16711936;
		int var13 = ((var10 & '\uff00') * var11) & 16711680;
		var10 = (var12 | var13) >>> 8;

		for (int var14 = -var6; var14 < 0; ++var14) {
			for (int var15 = -var5; var15 < 0; ++var15) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var12 = ((var2 & 16711935) * var9) & -16711936;
					var13 = ((var2 & '\uff00') * var9) & 16711680;
					var0[var4++] = ((var12 | var13) >>> 8) + var10;
				} else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method844(int var1, int var2, final int var3) {
		var1 += anInt1589;
		var2 += anInt1587;
		int var4 = var1 + (var2 * anInt1469);
		int var5 = 0;
		int var6 = anInt1588;
		int var7 = anInt1593;
		int var8 = anInt1469 - var7;
		int var9 = 0;
		int var10;
		if (var2 < anInt1471) {
			var10 = anInt1471 - var2;
			var6 -= var10;
			var2 = anInt1471;
			var5 += var10 * var7;
			var4 += var10 * anInt1469;
		}

		if ((var2 + var6) > anInt1470)
			var6 -= (var2 + var6) - anInt1470;

		if (var1 < anInt1473) {
			var10 = anInt1473 - var1;
			var7 -= var10;
			var1 = anInt1473;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if ((var1 + var7) > anInt1472) {
			var10 = (var1 + var7) - anInt1472;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if ((var7 > 0) && (var6 > 0))
			method845(anIntArray1474, anIntArray1592, 0, var5, var4, var7, var6, var8, var9, var3);
	}

	static void method845(final int[] var0, final int[] var1, int var2, int var3, int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9) {
		final int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; ++var11) {
			for (int var12 = -var5; var12 < 0; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					final int var13 = var0[var4];
					var0[var4++] = (((((var2 & 16711935) * var9) + ((var13 & 16711935) * var10)) & -16711936)
							+ ((((var2 & '\uff00') * var9) + ((var13 & '\uff00') * var10)) & 16711680)) >> 8;
				} else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method846(int var1, int var2, int var3, int var4, final int var5) {
		if ((var3 > 0) && (var4 > 0)) {
			final int var6 = anInt1593;
			final int var7 = anInt1588;
			int var8 = 0;
			int var9 = 0;
			final int var10 = anInt1590;
			final int var11 = anInt1591;
			final int var12 = (var10 << 16) / var3;
			final int var13 = (var11 << 16) / var4;
			int var14;
			if (anInt1589 > 0) {
				var14 = (((anInt1589 << 16) + var12) - 1) / var12;
				var1 += var14;
				var8 += (var14 * var12) - (anInt1589 << 16);
			}

			if (anInt1587 > 0) {
				var14 = (((anInt1587 << 16) + var13) - 1) / var13;
				var2 += var14;
				var9 += (var14 * var13) - (anInt1587 << 16);
			}

			if (var6 < var10)
				var3 = ((((var6 << 16) - var8) + var12) - 1) / var12;

			if (var7 < var11)
				var4 = ((((var7 << 16) - var9) + var13) - 1) / var13;

			var14 = var1 + (var2 * anInt1469);
			int var15 = anInt1469 - var3;
			if ((var2 + var4) > anInt1470)
				var4 -= (var2 + var4) - anInt1470;

			int var16;
			if (var2 < anInt1471) {
				var16 = anInt1471 - var2;
				var4 -= var16;
				var14 += var16 * anInt1469;
				var9 += var13 * var16;
			}

			if ((var1 + var3) > anInt1472) {
				var16 = (var1 + var3) - anInt1472;
				var3 -= var16;
				var15 += var16;
			}

			if (var1 < anInt1473) {
				var16 = anInt1473 - var1;
				var3 -= var16;
				var14 += var16;
				var8 += var12 * var16;
				var15 += var16;
			}

			method847(anIntArray1474, anIntArray1592, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6,
					var5);
		}
	}

	static void method847(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11, final int var12) {
		final int var13 = 256 - var12;
		final int var14 = var3;

		for (int var15 = -var8; var15 < 0; ++var15) {
			final int var16 = (var4 >> 16) * var11;

			for (int var17 = -var7; var17 < 0; ++var17) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					final int var18 = var0[var5];
					var0[var5++] = (((((var2 & 16711935) * var12) + ((var18 & 16711935) * var13)) & -16711936)
							+ ((((var2 & '\uff00') * var12) + ((var18 & '\uff00') * var13)) & 16711680)) >> 8;
				} else
					++var5;

				var3 += var9;
			}

			var4 += var10;
			var3 = var14;
			var5 += var6;
		}

	}

	public void method848(int var1, int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int[] var9, final int[] var10) {
		try {
			final int var11 = -var3 / 2;
			final int var12 = -var4 / 2;
			int var13 = (int) (Math.sin(var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(var7 / 326.11D) * 65536.0D);
			var13 = (var13 * var8) >> 8;
			var14 = (var14 * var8) >> 8;
			int var15 = (var5 << 16) + (var12 * var13) + (var11 * var14);
			int var16 = (var6 << 16) + ((var12 * var14) - (var11 * var13));
			int var17 = var1 + (var2 * anInt1469);

			for (var2 = 0; var2 < var4; ++var2) {
				final int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + (var14 * var18);
				int var21 = var16 - (var13 * var18);

				for (var1 = -var10[var2]; var1 < 0; ++var1) {
					anIntArray1474[var19++] = anIntArray1592[(var20 >> 16) + ((var21 >> 16) * anInt1593)];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += anInt1469;
			}
		} catch (final Exception var23) {
			;
		}

	}

	void method849(int var1, int var2, final int var3, final int var4, final int var5, final int var6) {
		if (var6 != 0) {
			var1 -= anInt1589 << 4;
			var2 -= anInt1587 << 4;
			final double var7 = (var5 & '\uffff') * 9.587379924285257E-5D;
			final int var9 = (int) Math.floor((Math.sin(var7) * var6) + 0.5D);
			final int var10 = (int) Math.floor((Math.cos(var7) * var6) + 0.5D);
			final int var11 = (-var1 * var10) + (-var2 * var9);
			final int var12 = (-(-var1) * var9) + (-var2 * var10);
			final int var13 = (((anInt1593 << 4) - var1) * var10) + (-var2 * var9);
			final int var14 = (-((anInt1593 << 4) - var1) * var9) + (-var2 * var10);
			final int var15 = (-var1 * var10) + (((anInt1588 << 4) - var2) * var9);
			final int var16 = (-(-var1) * var9) + (((anInt1588 << 4) - var2) * var10);
			final int var17 = (((anInt1593 << 4) - var1) * var10) + (((anInt1588 << 4) - var2) * var9);
			final int var18 = (-((anInt1593 << 4) - var1) * var9) + (((anInt1588 << 4) - var2) * var10);
			int var19;
			int var20;
			if (var11 < var13) {
				var19 = var11;
				var20 = var13;
			} else {
				var19 = var13;
				var20 = var11;
			}

			if (var15 < var19)
				var19 = var15;

			if (var17 < var19)
				var19 = var17;

			if (var15 > var20)
				var20 = var15;

			if (var17 > var20)
				var20 = var17;

			int var21;
			int var22;
			if (var12 < var14) {
				var21 = var12;
				var22 = var14;
			} else {
				var21 = var14;
				var22 = var12;
			}

			if (var16 < var21)
				var21 = var16;

			if (var18 < var21)
				var21 = var18;

			if (var16 > var22)
				var22 = var16;

			if (var18 > var22)
				var22 = var18;

			var19 >>= 12;
			var20 = (var20 + 4095) >> 12;
			var21 >>= 12;
			var22 = (var22 + 4095) >> 12;
			var19 += var3;
			var20 += var3;
			var21 += var4;
			var22 += var4;
			var19 >>= 4;
			var20 = (var20 + 15) >> 4;
			var21 >>= 4;
			var22 = (var22 + 15) >> 4;
			if (var19 < anInt1473)
				var19 = anInt1473;

			if (var20 > anInt1472)
				var20 = anInt1472;

			if (var21 < anInt1471)
				var21 = anInt1471;

			if (var22 > anInt1470)
				var22 = anInt1470;

			var20 = var19 - var20;
			if (var20 < 0) {
				var22 = var21 - var22;
				if (var22 < 0) {
					int var23 = (var21 * anInt1469) + var19;
					final double var24 = 1.6777216E7D / var6;
					final int var26 = (int) Math.floor((Math.sin(var7) * var24) + 0.5D);
					final int var27 = (int) Math.floor((Math.cos(var7) * var24) + 0.5D);
					final int var28 = ((var19 << 4) + 8) - var3;
					final int var29 = ((var21 << 4) + 8) - var4;
					int var30 = (var1 << 8) - ((var29 * var26) >> 4);
					int var31 = (var2 << 8) + ((var29 * var27) >> 4);
					int var32;
					int var33;
					int var34;
					int var35;
					int var36;
					int var37;
					int var38;
					if (var27 == 0) {
						if (var26 == 0)
							for (var32 = var22; var32 < 0; var23 += anInt1469) {
								var33 = var23;
								var34 = var30;
								var35 = var31;
								var36 = var20;
								if ((var30 >= 0) && (var31 >= 0) && ((var30 - (anInt1593 << 12)) < 0)
										&& ((var31 - (anInt1588 << 12)) < 0))
									for (; var36 < 0; ++var36) {
										var37 = anIntArray1592[((var35 >> 12) * anInt1593) + (var34 >> 12)];
										if (var37 != 0)
											anIntArray1474[var33++] = var37;
										else
											++var33;
									}

								++var32;
							}
						else if (var26 < 0)
							for (var32 = var22; var32 < 0; var23 += anInt1469) {
								var33 = var23;
								var34 = var30;
								var35 = var31 + ((var28 * var26) >> 4);
								var36 = var20;
								if ((var30 >= 0) && ((var30 - (anInt1593 << 12)) < 0)) {
									if ((var38 = var35 - (anInt1588 << 12)) >= 0) {
										var38 = (var26 - var38) / var26;
										var36 = var20 + var38;
										var35 += var26 * var38;
										var33 = var23 + var38;
									}

									if ((var38 = (var35 - var26) / var26) > var36)
										var36 = var38;

									while (var36 < 0) {
										var37 = anIntArray1592[((var35 >> 12) * anInt1593) + (var34 >> 12)];
										if (var37 != 0)
											anIntArray1474[var33++] = var37;
										else
											++var33;

										var35 += var26;
										++var36;
									}
								}

								++var32;
								var30 -= var26;
							}
						else
							for (var32 = var22; var32 < 0; var23 += anInt1469) {
								var33 = var23;
								var34 = var30;
								var35 = var31 + ((var28 * var26) >> 4);
								var36 = var20;
								if ((var30 >= 0) && ((var30 - (anInt1593 << 12)) < 0)) {
									if (var35 < 0) {
										var38 = (var26 - 1 - var35) / var26;
										var36 = var20 + var38;
										var35 += var26 * var38;
										var33 = var23 + var38;
									}

									if ((var38 = ((1 + var35) - (anInt1588 << 12) - var26) / var26) > var36)
										var36 = var38;

									while (var36 < 0) {
										var37 = anIntArray1592[((var35 >> 12) * anInt1593) + (var34 >> 12)];
										if (var37 != 0)
											anIntArray1474[var33++] = var37;
										else
											++var33;

										var35 += var26;
										++var36;
									}
								}

								++var32;
								var30 -= var26;
							}
					} else if (var27 < 0) {
						if (var26 == 0)
							for (var32 = var22; var32 < 0; var23 += anInt1469) {
								var33 = var23;
								var34 = var30 + ((var28 * var27) >> 4);
								var35 = var31;
								var36 = var20;
								if ((var31 >= 0) && ((var31 - (anInt1588 << 12)) < 0)) {
									if ((var38 = var34 - (anInt1593 << 12)) >= 0) {
										var38 = (var27 - var38) / var27;
										var36 = var20 + var38;
										var34 += var27 * var38;
										var33 = var23 + var38;
									}

									if ((var38 = (var34 - var27) / var27) > var36)
										var36 = var38;

									while (var36 < 0) {
										var37 = anIntArray1592[((var35 >> 12) * anInt1593) + (var34 >> 12)];
										if (var37 != 0)
											anIntArray1474[var33++] = var37;
										else
											++var33;

										var34 += var27;
										++var36;
									}
								}

								++var32;
								var31 += var27;
							}
						else if (var26 < 0)
							for (var32 = var22; var32 < 0; var23 += anInt1469) {
								var33 = var23;
								var34 = var30 + ((var28 * var27) >> 4);
								var35 = var31 + ((var28 * var26) >> 4);
								var36 = var20;
								if ((var38 = var34 - (anInt1593 << 12)) >= 0) {
									var38 = (var27 - var38) / var27;
									var36 = var20 + var38;
									var34 += var27 * var38;
									var35 += var26 * var38;
									var33 = var23 + var38;
								}

								if ((var38 = (var34 - var27) / var27) > var36)
									var36 = var38;

								if ((var38 = var35 - (anInt1588 << 12)) >= 0) {
									var38 = (var26 - var38) / var26;
									var36 += var38;
									var34 += var27 * var38;
									var35 += var26 * var38;
									var33 += var38;
								}

								if ((var38 = (var35 - var26) / var26) > var36)
									var36 = var38;

								while (var36 < 0) {
									var37 = anIntArray1592[((var35 >> 12) * anInt1593) + (var34 >> 12)];
									if (var37 != 0)
										anIntArray1474[var33++] = var37;
									else
										++var33;

									var34 += var27;
									var35 += var26;
									++var36;
								}

								++var32;
								var30 -= var26;
								var31 += var27;
							}
						else
							for (var32 = var22; var32 < 0; var23 += anInt1469) {
								var33 = var23;
								var34 = var30 + ((var28 * var27) >> 4);
								var35 = var31 + ((var28 * var26) >> 4);
								var36 = var20;
								if ((var38 = var34 - (anInt1593 << 12)) >= 0) {
									var38 = (var27 - var38) / var27;
									var36 = var20 + var38;
									var34 += var27 * var38;
									var35 += var26 * var38;
									var33 = var23 + var38;
								}

								if ((var38 = (var34 - var27) / var27) > var36)
									var36 = var38;

								if (var35 < 0) {
									var38 = (var26 - 1 - var35) / var26;
									var36 += var38;
									var34 += var27 * var38;
									var35 += var26 * var38;
									var33 += var38;
								}

								if ((var38 = ((1 + var35) - (anInt1588 << 12) - var26) / var26) > var36)
									var36 = var38;

								while (var36 < 0) {
									var37 = anIntArray1592[((var35 >> 12) * anInt1593) + (var34 >> 12)];
									if (var37 != 0)
										anIntArray1474[var33++] = var37;
									else
										++var33;

									var34 += var27;
									var35 += var26;
									++var36;
								}

								++var32;
								var30 -= var26;
								var31 += var27;
							}
					} else if (var26 == 0)
						for (var32 = var22; var32 < 0; var23 += anInt1469) {
							var33 = var23;
							var34 = var30 + ((var28 * var27) >> 4);
							var35 = var31;
							var36 = var20;
							if ((var31 >= 0) && ((var31 - (anInt1588 << 12)) < 0)) {
								if (var34 < 0) {
									var38 = (var27 - 1 - var34) / var27;
									var36 = var20 + var38;
									var34 += var27 * var38;
									var33 = var23 + var38;
								}

								if ((var38 = ((1 + var34) - (anInt1593 << 12) - var27) / var27) > var36)
									var36 = var38;

								while (var36 < 0) {
									var37 = anIntArray1592[((var35 >> 12) * anInt1593) + (var34 >> 12)];
									if (var37 != 0)
										anIntArray1474[var33++] = var37;
									else
										++var33;

									var34 += var27;
									++var36;
								}
							}

							++var32;
							var31 += var27;
						}
					else if (var26 < 0)
						for (var32 = var22; var32 < 0; var23 += anInt1469) {
							var33 = var23;
							var34 = var30 + ((var28 * var27) >> 4);
							var35 = var31 + ((var28 * var26) >> 4);
							var36 = var20;
							if (var34 < 0) {
								var38 = (var27 - 1 - var34) / var27;
								var36 = var20 + var38;
								var34 += var27 * var38;
								var35 += var26 * var38;
								var33 = var23 + var38;
							}

							if ((var38 = ((1 + var34) - (anInt1593 << 12) - var27) / var27) > var36)
								var36 = var38;

							if ((var38 = var35 - (anInt1588 << 12)) >= 0) {
								var38 = (var26 - var38) / var26;
								var36 += var38;
								var34 += var27 * var38;
								var35 += var26 * var38;
								var33 += var38;
							}

							if ((var38 = (var35 - var26) / var26) > var36)
								var36 = var38;

							while (var36 < 0) {
								var37 = anIntArray1592[((var35 >> 12) * anInt1593) + (var34 >> 12)];
								if (var37 != 0)
									anIntArray1474[var33++] = var37;
								else
									++var33;

								var34 += var27;
								var35 += var26;
								++var36;
							}

							++var32;
							var30 -= var26;
							var31 += var27;
						}
					else
						for (var32 = var22; var32 < 0; var23 += anInt1469) {
							var33 = var23;
							var34 = var30 + ((var28 * var27) >> 4);
							var35 = var31 + ((var28 * var26) >> 4);
							var36 = var20;
							if (var34 < 0) {
								var38 = (var27 - 1 - var34) / var27;
								var36 = var20 + var38;
								var34 += var27 * var38;
								var35 += var26 * var38;
								var33 = var23 + var38;
							}

							if ((var38 = ((1 + var34) - (anInt1593 << 12) - var27) / var27) > var36)
								var36 = var38;

							if (var35 < 0) {
								var38 = (var26 - 1 - var35) / var26;
								var36 += var38;
								var34 += var27 * var38;
								var35 += var26 * var38;
								var33 += var38;
							}

							if ((var38 = ((1 + var35) - (anInt1588 << 12) - var26) / var26) > var36)
								var36 = var38;

							while (var36 < 0) {
								var37 = anIntArray1592[((var35 >> 12) * anInt1593) + (var34 >> 12)];
								if (var37 != 0)
									anIntArray1474[var33++] = var37;
								else
									++var33;

								var34 += var27;
								var35 += var26;
								++var36;
							}

							++var32;
							var30 -= var26;
							var31 += var27;
						}

				}
			}
		}
	}

	public void method850(final int var1, final int var2, final int var3, final int var4) {
		method849(anInt1590 << 3, anInt1591 << 3, var1 << 4, var2 << 4, var3, var4);
	}

	static void method851(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			final int var7, final int var8, final int var9, final int var10, final byte[] var11) {
		final int var12 = -(var6 >> 2);
		var6 = -(var6 & 3);

		for (int var13 = -var7; var13 < 0; ++var13) {
			int var14;
			for (var14 = var12; var14 < 0; ++var14) {
				var2 = var1[var3++];
				if ((var2 != 0) && (var11[var5] == 0))
					var0[var4++] = var2;
				else
					++var4;

				++var5;
				var2 = var1[var3++];
				if ((var2 != 0) && (var11[var5] == 0))
					var0[var4++] = var2;
				else
					++var4;

				++var5;
				var2 = var1[var3++];
				if ((var2 != 0) && (var11[var5] == 0))
					var0[var4++] = var2;
				else
					++var4;

				++var5;
				var2 = var1[var3++];
				if ((var2 != 0) && (var11[var5] == 0))
					var0[var4++] = var2;
				else
					++var4;

				++var5;
			}

			for (var14 = var6; var14 < 0; ++var14) {
				var2 = var1[var3++];
				if ((var2 != 0) && (var11[var5] == 0))
					var0[var4++] = var2;
				else
					++var4;

				++var5;
			}

			var4 += var8;
			var3 += var9;
			var5 += var10;
		}

	}

	public void method852(final Class104_Sub18_Sub17_Sub3 var1, int var2, int var3) {
		if (((anInt1472 - anInt1473) == var1.anInt1618) && ((anInt1470 - anInt1471) == var1.anInt1619)) {
			var2 += anInt1589;
			var3 += anInt1587;
			int var4 = var2 + (var3 * anInt1469);
			int var5 = 0;
			int var6 = anInt1588;
			int var7 = anInt1593;
			int var8 = anInt1469 - var7;
			int var9 = 0;
			int var10;
			if (var3 < anInt1471) {
				var10 = anInt1471 - var3;
				var6 -= var10;
				var3 = anInt1471;
				var5 += var10 * var7;
				var4 += var10 * anInt1469;
			}

			if ((var3 + var6) > anInt1470)
				var6 -= (var3 + var6) - anInt1470;

			if (var2 < anInt1473) {
				var10 = anInt1473 - var2;
				var7 -= var10;
				var2 = anInt1473;
				var5 += var10;
				var4 += var10;
				var9 += var10;
				var8 += var10;
			}

			if ((var2 + var7) > anInt1472) {
				var10 = (var2 + var7) - anInt1472;
				var7 -= var10;
				var9 += var10;
				var8 += var10;
			}

			if ((var7 > 0) && (var6 > 0)) {
				var10 = (var2 - anInt1473) + ((var3 - anInt1471) * var1.anInt1618);
				final int var11 = var1.anInt1618 - var7;
				method851(anIntArray1474, anIntArray1592, 0, var5, var4, var10, var7, var6, var8, var9, var11,
						var1.aByteArray1616);
			}
		} else
			throw new IllegalStateException();
	}

	public void method853(int var1, int var2, final int var3, final int var4) {
		var1 += anInt1589;
		var2 += anInt1587;
		int var5 = var1 + (var2 * anInt1469);
		int var6 = 0;
		int var7 = anInt1588;
		int var8 = anInt1593;
		int var9 = anInt1469 - var8;
		int var10 = 0;
		int var11;
		if (var2 < anInt1471) {
			var11 = anInt1471 - var2;
			var7 -= var11;
			var2 = anInt1471;
			var6 += var11 * var8;
			var5 += var11 * anInt1469;
		}

		if ((var2 + var7) > anInt1470)
			var7 -= (var2 + var7) - anInt1470;

		if (var1 < anInt1473) {
			var11 = anInt1473 - var1;
			var8 -= var11;
			var1 = anInt1473;
			var6 += var11;
			var5 += var11;
			var10 += var11;
			var9 += var11;
		}

		if ((var1 + var8) > anInt1472) {
			var11 = (var1 + var8) - anInt1472;
			var8 -= var11;
			var10 += var11;
			var9 += var11;
		}

		if ((var8 > 0) && (var7 > 0))
			method843(anIntArray1474, anIntArray1592, 0, var6, var5, var8, var7, var9, var10, var3, var4);
	}

	public void method854() {
		final int[] var1 = new int[anInt1593 * anInt1588];
		int var2 = 0;

		for (int var3 = anInt1588 - 1; var3 >= 0; --var3)
			for (int var4 = 0; var4 < anInt1593; ++var4)
				var1[var2++] = anIntArray1592[var4 + (var3 * anInt1593)];

		anIntArray1592 = var1;
		anInt1587 = anInt1591 - anInt1588 - anInt1587;
	}

	public void method855(final int var1) {
		final int[] var2 = new int[anInt1593 * anInt1588];
		int var3 = 0;

		for (int var4 = 0; var4 < anInt1588; ++var4)
			for (int var5 = 0; var5 < anInt1593; ++var5) {
				int var6 = anIntArray1592[var3];
				if (var6 == 0)
					if ((var5 > 0) && (anIntArray1592[var3 - 1] != 0))
						var6 = var1;
					else if ((var4 > 0) && (anIntArray1592[var3 - anInt1593] != 0))
						var6 = var1;
					else if ((var5 < (anInt1593 - 1)) && (anIntArray1592[var3 + 1] != 0))
						var6 = var1;
					else if ((var4 < (anInt1588 - 1)) && (anIntArray1592[var3 + anInt1593] != 0))
						var6 = var1;

				var2[var3++] = var6;
			}

		anIntArray1592 = var2;
	}

	public Sprite method856() {
		final Sprite var1 = new Sprite(anInt1593, anInt1588);
		var1.anInt1590 = anInt1590;
		var1.anInt1591 = anInt1591;
		var1.anInt1589 = anInt1590 - anInt1593 - anInt1589;
		var1.anInt1587 = anInt1587;

		for (int var2 = 0; var2 < anInt1588; ++var2)
			for (int var3 = 0; var3 < anInt1593; ++var3)
				var1.anIntArray1592[(var2 * anInt1593) + var3] = anIntArray1592[((var2 * anInt1593) + anInt1593) - 1
						- var3];

		return var1;
	}

	public void method857(final int var1) {
		if ((anInt1593 != anInt1590) || (anInt1588 != anInt1591)) {
			int var2 = var1;
			if (var1 > anInt1589)
				var2 = anInt1589;

			int var3 = var1;
			if ((var1 + anInt1589 + anInt1593) > anInt1590)
				var3 = anInt1590 - anInt1589 - anInt1593;

			int var4 = var1;
			if (var1 > anInt1587)
				var4 = anInt1587;

			int var5 = var1;
			if ((var1 + anInt1587 + anInt1588) > anInt1591)
				var5 = anInt1591 - anInt1587 - anInt1588;

			final int var6 = anInt1593 + var2 + var3;
			final int var7 = anInt1588 + var4 + var5;
			final int[] var8 = new int[var6 * var7];

			for (int var9 = 0; var9 < anInt1588; ++var9)
				for (int var10 = 0; var10 < anInt1593; ++var10)
					var8[((var9 + var4) * var6) + var10 + var2] = anIntArray1592[(var9 * anInt1593) + var10];

			anIntArray1592 = var8;
			anInt1593 = var6;
			anInt1588 = var7;
			anInt1589 -= var2;
			anInt1587 -= var4;
		}
	}

	static void method858(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			final int var7, final int var8) {
		final int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;

				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;

				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;

				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method859() {
		if ((anInt1593 != anInt1590) || (anInt1588 != anInt1591)) {
			final int[] var1 = new int[anInt1590 * anInt1591];

			for (int var2 = 0; var2 < anInt1588; ++var2)
				for (int var3 = 0; var3 < anInt1593; ++var3)
					var1[((var2 + anInt1587) * anInt1590) + var3 + anInt1589] = anIntArray1592[(var2 * anInt1593)
							+ var3];

			anIntArray1592 = var1;
			anInt1593 = anInt1590;
			anInt1588 = anInt1591;
			anInt1589 = 0;
			anInt1587 = 0;
		}
	}
}
