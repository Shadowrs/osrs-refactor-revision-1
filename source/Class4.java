public class Class4 {
	static float aFloat16;
	static int anInt17;
	static float[][] aFloatArrayArray14 = new float[2][8];
	static int[][] anIntArrayArray15 = new int[2][8];
	int[] anIntArray11 = new int[2];
	int[][][] anIntArrayArrayArray18 = new int[2][2][4];
	int[][][] anIntArrayArrayArray12 = new int[2][2][4];
	int[] anIntArray13 = new int[2];

	float method27(final int var1, final int var2, final float var3) {
		float var4 = anIntArrayArrayArray12[var1][0][var2]
				+ (var3 * (anIntArrayArrayArray12[var1][1][var2] - anIntArrayArrayArray12[var1][0][var2]));
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	static float method28(final float var0) {
		final float var1 = 32.703197F * (float) Math.pow(2.0D, var0);
		return (var1 * 3.1415927F) / 11025.0F;
	}

	float method29(final int var1, final int var2, final float var3) {
		float var4 = anIntArrayArrayArray18[var1][0][var2]
				+ (var3 * (anIntArrayArrayArray18[var1][1][var2] - anIntArrayArrayArray18[var1][0][var2]));
		var4 *= 1.2207031E-4F;
		return method28(var4);
	}

	int method30(final int var1, final float var2) {
		float var3;
		if (var1 == 0) {
			var3 = anIntArray13[0] + ((anIntArray13[1] - anIntArray13[0]) * var2);
			var3 *= 0.0030517578F;
			aFloat16 = (float) Math.pow(0.1D, var3 / 20.0F);
			anInt17 = (int) (aFloat16 * 65536.0F);
		}

		if (anIntArray11[var1] == 0)
			return 0;
		else {
			var3 = method27(var1, 0, var2);
			aFloatArrayArray14[var1][0] = -2.0F * var3 * (float) Math.cos(method29(var1, 0, var2));
			aFloatArrayArray14[var1][1] = var3 * var3;

			int var4;
			for (var4 = 1; var4 < anIntArray11[var1]; ++var4) {
				var3 = method27(var1, var4, var2);
				final float var5 = -2.0F * var3 * (float) Math.cos(method29(var1, var4, var2));
				final float var6 = var3 * var3;
				aFloatArrayArray14[var1][(var4 * 2) + 1] = aFloatArrayArray14[var1][(var4 * 2) - 1] * var6;
				aFloatArrayArray14[var1][var4 * 2] = (aFloatArrayArray14[var1][(var4 * 2) - 1] * var5)
						+ (aFloatArrayArray14[var1][(var4 * 2) - 2] * var6);

				for (int var7 = (var4 * 2) - 1; var7 >= 2; --var7)
					aFloatArrayArray14[var1][var7] += (aFloatArrayArray14[var1][var7 - 1] * var5)
							+ (aFloatArrayArray14[var1][var7 - 2] * var6);

				aFloatArrayArray14[var1][1] += (aFloatArrayArray14[var1][0] * var5) + var6;
				aFloatArrayArray14[var1][0] += var5;
			}

			if (var1 == 0)
				for (var4 = 0; var4 < (anIntArray11[0] * 2); ++var4)
					aFloatArrayArray14[0][var4] *= aFloat16;

			for (var4 = 0; var4 < (anIntArray11[var1] * 2); ++var4)
				anIntArrayArray15[var1][var4] = (int) (aFloatArrayArray14[var1][var4] * 65536.0F);

			return anIntArray11[var1] * 2;
		}
	}

	final void method31(final Class104_Sub21 var1, final Class74 var2) {
		final int var3 = var1.method570();
		anIntArray11[0] = var3 >> 4;
		anIntArray11[1] = var3 & 15;
		if (var3 != 0) {
			anIntArray13[0] = var1.method571();
			anIntArray13[1] = var1.method571();
			final int var4 = var1.method570();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5)
				for (var6 = 0; var6 < anIntArray11[var5]; ++var6) {
					anIntArrayArrayArray18[var5][0][var6] = var1.method571();
					anIntArrayArrayArray12[var5][0][var6] = var1.method571();
				}

			for (var5 = 0; var5 < 2; ++var5)
				for (var6 = 0; var6 < anIntArray11[var5]; ++var6)
					if ((var4 & (1 << (var5 * 4) << var6)) != 0) {
						anIntArrayArrayArray18[var5][1][var6] = var1.method571();
						anIntArrayArrayArray12[var5][1][var6] = var1.method571();
					} else {
						anIntArrayArrayArray18[var5][1][var6] = anIntArrayArrayArray18[var5][0][var6];
						anIntArrayArrayArray12[var5][1][var6] = anIntArrayArrayArray12[var5][0][var6];
					}

			if ((var4 != 0) || (anIntArray13[1] != anIntArray13[0]))
				var2.method338(var1);
		} else {
			final int[] var7 = anIntArray13;
			anIntArray13[1] = 0;
			var7[0] = 0;
		}

	}
}
