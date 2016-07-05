public final class Class44 {
	int anInt376;
	int anInt377;
	int anInt378;
	int anInt379;
	int anInt380;
	int anInt381;
	int anInt382;
	int anInt383;
	int anInt384;
	int anInt385;
	int anInt386;
	int anInt387;
	int anInt388;
	int anInt389;
	int anInt390;
	int anInt391;
	int anInt392;
	int anInt393;
	static Sprite[] aClass104_Sub18_Sub17_Sub1Array394;
	static int anInt395;

	public static String method189(final CharSequence var0) {
		String var1 = Class36.method169(Class65.method297(var0));
		if (var1 == null)
			var1 = "";

		return var1;
	}

	static void method190(final int var0, final int var1, final int var2, final ObjectDefinition var3,
			final int var4) {
		final Class104_Sub1 var5 = new Class104_Sub1();
		var5.anInt839 = var0;
		var5.anInt846 = var1 * 128;
		var5.anInt843 = var2 * 128;
		int var6 = var3.anInt1365;
		int var7 = var3.anInt1339;
		if ((var4 == 1) || (var4 == 3)) {
			var6 = var3.anInt1339;
			var7 = var3.anInt1365;
		}

		var5.anInt842 = (var6 + var1) * 128;
		var5.anInt847 = (var2 + var7) * 128;
		var5.anInt845 = var3.anInt1333;
		var5.anInt844 = var3.anInt1369 * 128;
		var5.anInt838 = var3.anInt1370;
		var5.anInt848 = var3.anInt1323;
		var5.anIntArray841 = var3.anIntArray1372;
		if (null != var3.anIntArray1338) {
			var5.aClass104_Sub18_Sub6_852 = var3;
			var5.method476();
		}

		Class104_Sub1.aClass59_849.method248(var5);
		if (null != var5.anIntArray841)
			var5.anInt850 = var5.anInt838 + (int) (Math.random() * (var5.anInt848 - var5.anInt838));

	}

	static final void method191(final int var0, final int var1, final int var2, final int var3, final int var4) {
		int var5 = Class81.aClass17_643.method85(var0, var1, var2);
		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		if (var5 != 0) {
			var6 = Class81.aClass17_643.method89(var0, var1, var2, var5);
			var7 = (var6 >> 6) & 3;
			var8 = var6 & 31;
			var9 = var3;
			if (var5 > 0)
				var9 = var4;

			final int[] var10 = Class104_Sub2.aClass104_Sub18_Sub17_Sub1_861.anIntArray1592;
			var11 = (4 * var1) + 24624 + ((103 - var2) * 2048);
			var12 = (var5 >> 14) & 32767;
			final ObjectDefinition var13 = ItemDef.forId(var12);
			if (var13.anInt1341 != -1) {
				final Class104_Sub18_Sub17_Sub3 var14 = Class99.aClass104_Sub18_Sub17_Sub3Array794[var13.anInt1341];
				if (var14 != null) {
					final int var15 = ((var13.anInt1365 * 4) - var14.anInt1618) / 2;
					final int var16 = ((var13.anInt1339 * 4) - var14.anInt1619) / 2;
					var14.method889(var15 + 48 + (var1 * 4), 48 + ((104 - var2 - var13.anInt1339) * 4) + var16);
				}
			} else {
				if ((var8 == 0) || (var8 == 2))
					if (var7 == 0) {
						var10[var11] = var9;
						var10[512 + var11] = var9;
						var10[1024 + var11] = var9;
						var10[var11 + 1536] = var9;
					} else if (var7 == 1) {
						var10[var11] = var9;
						var10[var11 + 1] = var9;
						var10[var11 + 2] = var9;
						var10[var11 + 3] = var9;
					} else if (var7 == 2) {
						var10[3 + var11] = var9;
						var10[512 + var11 + 3] = var9;
						var10[3 + var11 + 1024] = var9;
						var10[1536 + var11 + 3] = var9;
					} else if (var7 == 3) {
						var10[1536 + var11] = var9;
						var10[1 + 1536 + var11] = var9;
						var10[2 + var11 + 1536] = var9;
						var10[var11 + 1536 + 3] = var9;
					}

				if (var8 == 3)
					if (var7 == 0)
						var10[var11] = var9;
					else if (var7 == 1)
						var10[var11 + 3] = var9;
					else if (var7 == 2)
						var10[var11 + 3 + 1536] = var9;
					else if (var7 == 3)
						var10[var11 + 1536] = var9;

				if (var8 == 2)
					if (var7 == 3) {
						var10[var11] = var9;
						var10[var11 + 512] = var9;
						var10[var11 + 1024] = var9;
						var10[var11 + 1536] = var9;
					} else if (var7 == 0) {
						var10[var11] = var9;
						var10[1 + var11] = var9;
						var10[var11 + 2] = var9;
						var10[var11 + 3] = var9;
					} else if (var7 == 1) {
						var10[var11 + 3] = var9;
						var10[512 + 3 + var11] = var9;
						var10[3 + var11 + 1024] = var9;
						var10[1536 + 3 + var11] = var9;
					} else if (var7 == 2) {
						var10[var11 + 1536] = var9;
						var10[var11 + 1536 + 1] = var9;
						var10[2 + 1536 + var11] = var9;
						var10[3 + 1536 + var11] = var9;
					}
			}
		}

		var5 = Class81.aClass17_643.method87(var0, var1, var2);
		if (var5 != 0) {
			var6 = Class81.aClass17_643.method89(var0, var1, var2, var5);
			var7 = (var6 >> 6) & 3;
			var8 = var6 & 31;
			var9 = (var5 >> 14) & 32767;
			final ObjectDefinition var23 = ItemDef.forId(var9);
			int var18;
			if (var23.anInt1341 != -1) {
				final Class104_Sub18_Sub17_Sub3 var17 = Class99.aClass104_Sub18_Sub17_Sub3Array794[var23.anInt1341];
				if (null != var17) {
					var12 = ((var23.anInt1365 * 4) - var17.anInt1618) / 2;
					var18 = ((var23.anInt1339 * 4) - var17.anInt1619) / 2;
					var17.method889(var12 + 48 + (4 * var1), 48 + ((104 - var2 - var23.anInt1339) * 4) + var18);
				}
			} else if (var8 == 9) {
				var11 = 15658734;
				if (var5 > 0)
					var11 = 15597568;

				final int[] var19 = Class104_Sub2.aClass104_Sub18_Sub17_Sub1_861.anIntArray1592;
				var18 = (4 * var1) + 24624 + ((103 - var2) * 2048);
				if ((var7 != 0) && (var7 != 2)) {
					var19[var18] = var11;
					var19[var18 + 512 + 1] = var11;
					var19[var18 + 1024 + 2] = var11;
					var19[3 + var18 + 1536] = var11;
				} else {
					var19[var18 + 1536] = var11;
					var19[1024 + var18 + 1] = var11;
					var19[2 + var18 + 512] = var11;
					var19[3 + var18] = var11;
				}
			}
		}

		var5 = Class81.aClass17_643.method88(var0, var1, var2);
		if (var5 != 0) {
			var6 = (var5 >> 14) & 32767;
			final ObjectDefinition var20 = ItemDef.forId(var6);
			if (var20.anInt1341 != -1) {
				final Class104_Sub18_Sub17_Sub3 var21 = Class99.aClass104_Sub18_Sub17_Sub3Array794[var20.anInt1341];
				if (null != var21) {
					var9 = ((var20.anInt1365 * 4) - var21.anInt1618) / 2;
					final int var22 = ((var20.anInt1339 * 4) - var21.anInt1619) / 2;
					var21.method889((var1 * 4) + 48 + var9, ((104 - var2 - var20.anInt1339) * 4) + 48 + var22);
				}
			}
		}

	}

	static final void method192(final int var0, final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < client.anInt1982; ++var4)
			if (((client.anIntArray1995[var4] + client.anIntArray1993[var4]) > var0)
					&& (client.anIntArray1993[var4] < (var2 + var0))
					&& ((client.anIntArray1996[var4] + client.anIntArray1876[var4]) > var1)
					&& (client.anIntArray1876[var4] < (var3 + var1)))
				client.rsfacesFlag[var4] = true;

	}

	static Widget method193(final Widget var0) {
		Widget var1 = var0;
		final int var2 = Class25.method130(Class104_Sub3.method485(var0), -204868796);
		Widget var3;
		if (var2 == 0)
			var3 = null;
		else {
			int var4 = 0;

			while (true) {
				if (var4 >= var2) {
					var3 = var1;
					break;
				}

				var1 = Class47.forHash(var1.anInt1091);
				if (var1 == null) {
					var3 = null;
					break;
				}

				++var4;
			}
		}

		Widget var5 = var3;
		if (var3 == null)
			var5 = var0.aClass104_Sub12_1040;

		return var5;
	}
}
