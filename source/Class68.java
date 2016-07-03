public class Class68 {
	int anInt560 = Class104_Sub5.method507(16);
	int anInt558 = Class104_Sub5.method507(24);
	int anInt561 = Class104_Sub5.method507(24);
	int anInt559 = Class104_Sub5.method507(24) + 1;
	int anInt557 = Class104_Sub5.method507(6) + 1;
	int anInt562 = Class104_Sub5.method507(8);
	int[] anIntArray563;

	void method320(final float[] var1, final int var2, final boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; ++var4)
			var1[var4] = 0.0F;

		if (!var3) {
			var4 = Class104_Sub5.aClass98Array912[anInt562].anInt768;
			final int var5 = anInt561 - anInt558;
			final int var6 = var5 / anInt559;
			final int[] var7 = new int[var6];

			for (int var8 = 0; var8 < 8; ++var8) {
				int var9 = 0;

				while (var9 < var6) {
					int var10;
					int var11;
					if (var8 == 0) {
						var10 = Class104_Sub5.aClass98Array912[anInt562].method445();

						for (var11 = var4 - 1; var11 >= 0; --var11) {
							if ((var9 + var11) < var6)
								var7[var9 + var11] = var10 % anInt557;

							var10 /= anInt557;
						}
					}

					for (var10 = 0; var10 < var4; ++var10) {
						var11 = var7[var9];
						final int var12 = anIntArray563[(var11 * 8) + var8];
						if (var12 >= 0) {
							final int var13 = anInt558 + (var9 * anInt559);
							final Class98 var14 = Class104_Sub5.aClass98Array912[var12];
							int var15;
							if (anInt560 == 0) {
								var15 = anInt559 / var14.anInt768;

								for (int var16 = 0; var16 < var15; ++var16) {
									final float[] var17 = var14.method443();

									for (int var18 = 0; var18 < var14.anInt768; ++var18)
										var1[var13 + var16 + (var18 * var15)] += var17[var18];
								}
							} else {
								var15 = 0;

								while (var15 < anInt559) {
									final float[] var19 = var14.method443();

									for (int var20 = 0; var20 < var14.anInt768; ++var20) {
										var1[var13 + var15] += var19[var20];
										++var15;
									}
								}
							}
						}

						++var9;
						if (var9 >= var6)
							break;
					}
				}
			}

		}
	}

	Class68() {
		final int[] var1 = new int[anInt557];

		int var2;
		for (var2 = 0; var2 < anInt557; ++var2) {
			int var3 = 0;
			final int var4 = Class104_Sub5.method507(3);
			final boolean var5 = Class104_Sub5.method506() != 0;
			if (var5)
				var3 = Class104_Sub5.method507(5);

			var1[var2] = (var3 << 3) | var4;
		}

		anIntArray563 = new int[anInt557 * 8];

		for (var2 = 0; var2 < (anInt557 * 8); ++var2)
			anIntArray563[var2] = (var1[var2 >> 3] & (1 << (var2 & 7))) != 0 ? Class104_Sub5.method507(8) : -1;

	}
}
