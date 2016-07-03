public class Class98 {
	int anInt768;
	int anInt771;
	int[] anIntArray769;
	int[] anIntArray770;
	float[][] aFloatArrayArray772;
	int[] anIntArray767;

	float[] method443() {
		return aFloatArrayArray772[method445()];
	}

	Class98() {
		Class104_Sub5.method507(24);
		anInt768 = Class104_Sub5.method507(16);
		anInt771 = Class104_Sub5.method507(24);
		anIntArray769 = new int[anInt771];
		final boolean var1 = Class104_Sub5.method506() != 0;
		int var2;
		int var3;
		int var5;
		if (var1) {
			var2 = 0;

			for (var3 = Class104_Sub5.method507(5) + 1; var2 < anInt771; ++var3) {
				final int var4 = Class104_Sub5.method507(Class25.method129(anInt771 - var2, (byte) 86));

				for (var5 = 0; var5 < var4; ++var5)
					anIntArray769[var2++] = var3;
			}
		} else {
			final boolean var14 = Class104_Sub5.method506() != 0;

			for (var3 = 0; var3 < anInt771; ++var3)
				if (var14 && (Class104_Sub5.method506() == 0))
					anIntArray769[var3] = 0;
				else
					anIntArray769[var3] = Class104_Sub5.method507(5) + 1;
		}

		method444();
		var2 = Class104_Sub5.method507(4);
		if (var2 > 0) {
			final float var15 = Class104_Sub5.method501(Class104_Sub5.method507(32));
			final float var16 = Class104_Sub5.method501(Class104_Sub5.method507(32));
			var5 = Class104_Sub5.method507(4) + 1;
			final boolean var6 = Class104_Sub5.method506() != 0;
			int var7;
			if (var2 == 1)
				var7 = method446(anInt771, anInt768);
			else
				var7 = anInt771 * anInt768;

			anIntArray770 = new int[var7];

			int var8;
			for (var8 = 0; var8 < var7; ++var8)
				anIntArray770[var8] = Class104_Sub5.method507(var5);

			aFloatArrayArray772 = new float[anInt771][anInt768];
			float var9;
			int var10;
			int var11;
			if (var2 == 1)
				for (var8 = 0; var8 < anInt771; ++var8) {
					var9 = 0.0F;
					var10 = 1;

					for (var11 = 0; var11 < anInt768; ++var11) {
						final int var12 = (var8 / var10) % var7;
						final float var13 = (anIntArray770[var12] * var16) + var15 + var9;
						aFloatArrayArray772[var8][var11] = var13;
						if (var6)
							var9 = var13;

						var10 *= var7;
					}
				}
			else
				for (var8 = 0; var8 < anInt771; ++var8) {
					var9 = 0.0F;
					var10 = var8 * anInt768;

					for (var11 = 0; var11 < anInt768; ++var11) {
						final float var17 = (anIntArray770[var10] * var16) + var15 + var9;
						aFloatArrayArray772[var8][var11] = var17;
						if (var6)
							var9 = var17;

						++var10;
					}
				}
		}

	}

	void method444() {
		final int[] var1 = new int[anInt771];
		final int[] var2 = new int[33];

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < anInt771; ++var3) {
			var4 = anIntArray769[var3];
			if (var4 != 0) {
				var5 = 1 << (32 - var4);
				var6 = var2[var4];
				var1[var3] = var6;
				int var9;
				if ((var6 & var5) != 0)
					var7 = var2[var4 - 1];
				else {
					var7 = var6 | var5;

					for (var8 = var4 - 1; var8 >= 1; --var8) {
						var9 = var2[var8];
						if (var9 != var6)
							break;

						var10 = 1 << (32 - var8);
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}

						var2[var8] = var9 | var10;
					}
				}

				var2[var4] = var7;

				for (var8 = var4 + 1; var8 <= 32; ++var8) {
					var9 = var2[var8];
					if (var9 == var6)
						var2[var8] = var7;
				}
			}
		}

		anIntArray767 = new int[8];
		int var11 = 0;

		for (var3 = 0; var3 < anInt771; ++var3) {
			var4 = anIntArray769[var3];
			if (var4 != 0) {
				var5 = var1[var3];
				var6 = 0;

				for (var7 = 0; var7 < var4; ++var7) {
					var8 = Integer.MIN_VALUE >>> var7;
					if ((var5 & var8) != 0) {
						if (anIntArray767[var6] == 0)
							anIntArray767[var6] = var11;

						var6 = anIntArray767[var6];
					} else
						++var6;

					if (var6 >= anIntArray767.length) {
						final int[] var12 = new int[anIntArray767.length * 2];

						for (var10 = 0; var10 < anIntArray767.length; ++var10)
							var12[var10] = anIntArray767[var10];

						anIntArray767 = var12;
					}

					var8 >>>= 1;
				}

				anIntArray767[var6] = ~var3;
				if (var6 >= var11)
					var11 = var6 + 1;
			}
		}

	}

	int method445() {
		int var1;
		for (var1 = 0; anIntArray767[var1] >= 0; var1 = Class104_Sub5.method506() != 0 ? anIntArray767[var1] : var1 + 1)
			;

		return ~anIntArray767[var1];
	}

	static int method446(final int var0, final int var1) {
		int var2 = (int) Math.pow(var0, 1.0D / var1) + 1;

		while (true) {
			int var3 = var2;
			int var4 = var1;

			int var5;
			for (var5 = 1; var4 > 1; var4 >>= 1) {
				if ((var4 & 1) != 0)
					var5 *= var3;

				var3 *= var3;
			}

			int var6;
			if (var4 == 1)
				var6 = var3 * var5;
			else
				var6 = var5;

			if (var6 <= var0)
				return var2;

			--var2;
		}
	}
}
