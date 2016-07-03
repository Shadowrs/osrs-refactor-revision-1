public class Class104_Sub18_Sub17 extends Class104_Sub18 {
	public static int[] anIntArray1474;
	public static int anInt1469;
	public static int anInt1468;
	protected static int anInt1473 = 0;
	public static int anInt1471 = 0;
	protected static int anInt1472 = 0;
	public static int anInt1470 = 0;

	public static void method789(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5) {
		method804(var0, var1, var2, var4, var5);
		method804(var0, (var1 + var3) - 1, var2, var4, var5);
		if (var3 >= 3) {
			method798(var0, var1 + 1, var3 - 2, var4, var5);
			method798((var0 + var2) - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	public static void method790(final int[] var0, final int var1, final int var2) {
		anIntArray1474 = var0;
		anInt1469 = var1;
		anInt1468 = var2;
		method800(0, 0, var1, var2);
	}

	public static void method791() {
		anInt1473 = 0;
		anInt1471 = 0;
		anInt1472 = anInt1469;
		anInt1470 = anInt1468;
	}

	public static void method792(final int var0, final int var1, final int var2, final int var3) {
		if (anInt1473 < var0)
			anInt1473 = var0;

		if (anInt1471 < var1)
			anInt1471 = var1;

		if (anInt1472 > var2)
			anInt1472 = var2;

		if (anInt1470 > var3)
			anInt1470 = var3;

	}

	public static void method793(final int[] var0) {
		var0[0] = anInt1473;
		var0[1] = anInt1471;
		var0[2] = anInt1472;
		var0[3] = anInt1470;
	}

	public static void method794() {
		int var0 = 0;

		int var1;
		for (var1 = (anInt1469 * anInt1468) - 7; var0 < var1; anIntArray1474[var0++] = 0) {
			anIntArray1474[var0++] = 0;
			anIntArray1474[var0++] = 0;
			anIntArray1474[var0++] = 0;
			anIntArray1474[var0++] = 0;
			anIntArray1474[var0++] = 0;
			anIntArray1474[var0++] = 0;
			anIntArray1474[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; anIntArray1474[var0++] = 0)
			;

	}

	public static void method795(int var0, int var1, int var2, int var3, final int var4, final int var5) {
		int var6 = 0;
		final int var7 = 65536 / var3;
		if (var0 < anInt1473) {
			var2 -= anInt1473 - var0;
			var0 = anInt1473;
		}

		if (var1 < anInt1471) {
			var6 += (anInt1471 - var1) * var7;
			var3 -= anInt1471 - var1;
			var1 = anInt1471;
		}

		if ((var0 + var2) > anInt1472)
			var2 = anInt1472 - var0;

		if ((var1 + var3) > anInt1470)
			var3 = anInt1470 - var1;

		final int var8 = anInt1469 - var2;
		int var9 = var0 + (var1 * anInt1469);

		for (int var10 = -var3; var10 < 0; ++var10) {
			final int var11 = (65536 - var6) >> 8;
			final int var12 = var6 >> 8;
			final int var13 = (((((var4 & 16711935) * var11) + ((var5 & 16711935) * var12)) & -16711936)
					+ ((((var4 & '\uff00') * var11) + ((var5 & '\uff00') * var12)) & 16711680)) >>> 8;

			for (int var14 = -var2; var14 < 0; ++var14)
				anIntArray1474[var9++] = var13;

			var9 += var8;
			var6 += var7;
		}

	}

	public static void method796(int var0, final int var1, int var2, final int var3) {
		if ((var1 >= anInt1471) && (var1 < anInt1470)) {
			if (var0 < anInt1473) {
				var2 -= anInt1473 - var0;
				var0 = anInt1473;
			}

			if ((var0 + var2) > anInt1472)
				var2 = anInt1472 - var0;

			final int var4 = var0 + (var1 * anInt1469);

			for (int var5 = 0; var5 < var2; ++var5)
				anIntArray1474[var4 + var5] = var3;

		}
	}

	public static void method797(final int var0, int var1, int var2, final int var3) {
		if ((var0 >= anInt1473) && (var0 < anInt1472)) {
			if (var1 < anInt1471) {
				var2 -= anInt1471 - var1;
				var1 = anInt1471;
			}

			if ((var1 + var2) > anInt1470)
				var2 = anInt1470 - var1;

			final int var4 = var0 + (var1 * anInt1469);

			for (int var5 = 0; var5 < var2; ++var5)
				anIntArray1474[var4 + (var5 * anInt1469)] = var3;

		}
	}

	static void method798(final int var0, int var1, int var2, final int var3, final int var4) {
		if ((var0 >= anInt1473) && (var0 < anInt1472)) {
			if (var1 < anInt1471) {
				var2 -= anInt1471 - var1;
				var1 = anInt1471;
			}

			if ((var1 + var2) > anInt1470)
				var2 = anInt1470 - var1;

			final int var5 = 256 - var4;
			final int var6 = ((var3 >> 16) & 255) * var4;
			final int var7 = ((var3 >> 8) & 255) * var4;
			final int var8 = (var3 & 255) * var4;
			int var9 = var0 + (var1 * anInt1469);

			for (int var10 = 0; var10 < var2; ++var10) {
				final int var11 = ((anIntArray1474[var9] >> 16) & 255) * var5;
				final int var12 = ((anIntArray1474[var9] >> 8) & 255) * var5;
				final int var13 = (anIntArray1474[var9] & 255) * var5;
				final int var14 = (((var6 + var11) >> 8) << 16) + (((var7 + var12) >> 8) << 8) + ((var8 + var13) >> 8);
				anIntArray1474[var9] = var14;
				var9 += anInt1469;
			}

		}
	}

	public static void method799(int var0, int var1, final int var2, final int[] var3, final int[] var4) {
		int var5 = var0 + (var1 * anInt1469);

		for (var1 = 0; var1 < var3.length; ++var1) {
			int var6 = var5 + var3[var1];

			for (var0 = -var4[var1]; var0 < 0; ++var0)
				anIntArray1474[var6++] = var2;

			var5 += anInt1469;
		}

	}

	public static void method800(int var0, int var1, int var2, int var3) {
		if (var0 < 0)
			var0 = 0;

		if (var1 < 0)
			var1 = 0;

		if (var2 > anInt1469)
			var2 = anInt1469;

		if (var3 > anInt1468)
			var3 = anInt1468;

		anInt1473 = var0;
		anInt1471 = var1;
		anInt1472 = var2;
		anInt1470 = var3;
	}

	public static void method801(final int[] var0) {
		anInt1473 = var0[0];
		anInt1471 = var0[1];
		anInt1472 = var0[2];
		anInt1470 = var0[3];
	}

	public static void method802(int var0, int var1, int var2, int var3, int var4, final int var5) {
		if (var0 < anInt1473) {
			var2 -= anInt1473 - var0;
			var0 = anInt1473;
		}

		if (var1 < anInt1471) {
			var3 -= anInt1471 - var1;
			var1 = anInt1471;
		}

		if ((var0 + var2) > anInt1472)
			var2 = anInt1472 - var0;

		if ((var1 + var3) > anInt1470)
			var3 = anInt1470 - var1;

		var4 = ((((var4 & 16711935) * var5) >> 8) & 16711935) + ((((var4 & '\uff00') * var5) >> 8) & '\uff00');
		final int var6 = 256 - var5;
		final int var7 = anInt1469 - var2;
		int var8 = var0 + (var1 * anInt1469);

		for (int var9 = 0; var9 < var3; ++var9) {
			for (int var10 = -var2; var10 < 0; ++var10) {
				int var11 = anIntArray1474[var8];
				var11 = ((((var11 & 16711935) * var6) >> 8) & 16711935)
						+ ((((var11 & '\uff00') * var6) >> 8) & '\uff00');
				anIntArray1474[var8++] = var4 + var11;
			}

			var8 += var7;
		}

	}

	public static void method803(int var0, int var1, int var2, int var3, final int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0)
				method796(var0, var1, var2 + 1, var4);
			else
				method796(var0 + var2, var1, -var2 + 1, var4);

		} else if (var2 == 0) {
			if (var3 >= 0)
				method797(var0, var1, var3 + 1, var4);
			else
				method797(var0, var1 + var3, -var3 + 1, var4);

		} else {
			if ((var2 + var3) < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += '\u8000';
				var3 <<= 16;
				var5 = (int) Math.floor(((double) var3 / (double) var2) + 0.5D);
				var2 += var0;
				if (var0 < anInt1473) {
					var1 += var5 * (anInt1473 - var0);
					var0 = anInt1473;
				}

				if (var2 >= anInt1472)
					var2 = anInt1472 - 1;

				while (var0 <= var2) {
					var6 = var1 >> 16;
					if ((var6 >= anInt1471) && (var6 < anInt1470))
						anIntArray1474[var0 + (var6 * anInt1469)] = var4;

					var1 += var5;
					++var0;
				}
			} else {
				var0 <<= 16;
				var0 += '\u8000';
				var2 <<= 16;
				var5 = (int) Math.floor(((double) var2 / (double) var3) + 0.5D);
				var3 += var1;
				if (var1 < anInt1471) {
					var0 += var5 * (anInt1471 - var1);
					var1 = anInt1471;
				}

				if (var3 >= anInt1470)
					var3 = anInt1470 - 1;

				while (var1 <= var3) {
					var6 = var0 >> 16;
					if ((var6 >= anInt1473) && (var6 < anInt1472))
						anIntArray1474[var6 + (var1 * anInt1469)] = var4;

					var0 += var5;
					++var1;
				}
			}

		}
	}

	static void method804(int var0, final int var1, int var2, final int var3, final int var4) {
		if ((var1 >= anInt1471) && (var1 < anInt1470)) {
			if (var0 < anInt1473) {
				var2 -= anInt1473 - var0;
				var0 = anInt1473;
			}

			if ((var0 + var2) > anInt1472)
				var2 = anInt1472 - var0;

			final int var5 = 256 - var4;
			final int var6 = ((var3 >> 16) & 255) * var4;
			final int var7 = ((var3 >> 8) & 255) * var4;
			final int var8 = (var3 & 255) * var4;
			int var9 = var0 + (var1 * anInt1469);

			for (int var10 = 0; var10 < var2; ++var10) {
				final int var11 = ((anIntArray1474[var9] >> 16) & 255) * var5;
				final int var12 = ((anIntArray1474[var9] >> 8) & 255) * var5;
				final int var13 = (anIntArray1474[var9] & 255) * var5;
				final int var14 = (((var6 + var11) >> 8) << 16) + (((var7 + var12) >> 8) << 8) + ((var8 + var13) >> 8);
				anIntArray1474[var9++] = var14;
			}

		}
	}

	public static void method805(int var0, int var1, int var2, int var3, final int var4) {
		if (var0 < anInt1473) {
			var2 -= anInt1473 - var0;
			var0 = anInt1473;
		}

		if (var1 < anInt1471) {
			var3 -= anInt1471 - var1;
			var1 = anInt1471;
		}

		if ((var0 + var2) > anInt1472)
			var2 = anInt1472 - var0;

		if ((var1 + var3) > anInt1470)
			var3 = anInt1470 - var1;

		final int var5 = anInt1469 - var2;
		int var6 = var0 + (var1 * anInt1469);

		for (int var7 = -var3; var7 < 0; ++var7) {
			for (int var8 = -var2; var8 < 0; ++var8)
				anIntArray1474[var6++] = var4;

			var6 += var5;
		}

	}

	public static void method806(final int var0, final int var1, final int var2, final int var3, final int var4) {
		method796(var0, var1, var2, var4);
		method796(var0, (var1 + var3) - 1, var2, var4);
		method797(var0, var1, var3, var4);
		method797((var0 + var2) - 1, var1, var3, var4);
	}
}
