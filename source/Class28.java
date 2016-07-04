public class Class28 {
	static Class1 aClass1_267;

	public static void method138() {
		Class29.aClass104_Sub8_Sub1_271.method665();
		Class29.anInt272 = 1;
		Class29.aClass61_273 = null;
	}

	static final void method139(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final Class17 var7, final Class67 var8) {
		final ObjectDefinition var9 = ItemDef.forId(var4);
		int var10;
		int var11;
		if ((var5 != 1) && (var5 != 3)) {
			var10 = var9.anInt1365;
			var11 = var9.anInt1339;
		} else {
			var10 = var9.anInt1339;
			var11 = var9.anInt1365;
		}

		int var12;
		int var13;
		if ((var2 + var10) <= 104) {
			var12 = var2 + (var10 >> 1);
			var13 = var2 + ((1 + var10) >> 1);
		} else {
			var12 = var2;
			var13 = var2 + 1;
		}

		int var14;
		int var15;
		if ((var3 + var11) <= 104) {
			var14 = (var11 >> 1) + var3;
			var15 = var3 + ((1 + var11) >> 1);
		} else {
			var14 = var3;
			var15 = 1 + var3;
		}

		final int[][] var16 = Class76.anIntArrayArrayArray611[var1];
		final int var17 = (var16[var13][var15] + var16[var13][var14] + var16[var12][var14] + var16[var12][var15]) >> 2;
		final int var18 = (var10 << 6) + (var2 << 7);
		final int var19 = (var3 << 7) + (var11 << 6);
		int var20 = 1073741824 + var2 + (var3 << 7) + (var4 << 14);
		if (var9.anInt1342 == 0)
			var20 -= Integer.MIN_VALUE;

		int var21 = var6 + (var5 << 6);
		if (var9.anInt1358 == 1)
			var21 += 256;

		Object var22;
		if (var6 == 22) {
			if ((var9.anInt1346 == -1) && (null == var9.anIntArray1338))
				var22 = var9.method750(22, var5, var16, var18, var17, var19);
			else
				var22 = new Class104_Sub18_Sub16_Sub1(var4, 22, var5, var1, var2, var3, var9.anInt1346, true,
						(Class104_Sub18_Sub16) null);

			var7.method116(var0, var2, var3, var17, (Class104_Sub18_Sub16) var22, var20, var21);
			if (var9.anInt1363 == 1)
				var8.method313(var2, var3);

		} else if ((var6 != 10) && (var6 != 11)) {
			if (var6 >= 12) {
				if ((var9.anInt1346 == -1) && (null == var9.anIntArray1338))
					var22 = var9.method750(var6, var5, var16, var18, var17, var19);
				else
					var22 = new Class104_Sub18_Sub16_Sub1(var4, var6, var5, var1, var2, var3, var9.anInt1346, true,
							(Class104_Sub18_Sub16) null);

				var7.method83(var0, var2, var3, var17, 1, 1, (Class104_Sub18_Sub16) var22, 0, var20, var21);
				if (var9.anInt1363 != 0)
					var8.method306(var2, var3, var10, var11, var9.aBool1340);

			} else if (var6 == 0) {
				if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
					var22 = var9.method750(0, var5, var16, var18, var17, var19);
				else
					var22 = new Class104_Sub18_Sub16_Sub1(var4, 0, var5, var1, var2, var3, var9.anInt1346, true,
							(Class104_Sub18_Sub16) null);

				var7.method75(var0, var2, var3, var17, (Class104_Sub18_Sub16) var22, (Class104_Sub18_Sub16) null,
						Class76.anIntArray606[var5], 0, var20, var21);
				if (var9.anInt1363 != 0)
					var8.method303(var2, var3, var6, var5, var9.aBool1340);

			} else if (var6 == 1) {
				if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
					var22 = var9.method750(1, var5, var16, var18, var17, var19);
				else
					var22 = new Class104_Sub18_Sub16_Sub1(var4, 1, var5, var1, var2, var3, var9.anInt1346, true,
							(Class104_Sub18_Sub16) null);

				var7.method75(var0, var2, var3, var17, (Class104_Sub18_Sub16) var22, (Class104_Sub18_Sub16) null,
						Class76.anIntArray610[var5], 0, var20, var21);
				if (var9.anInt1363 != 0)
					var8.method303(var2, var3, var6, var5, var9.aBool1340);

			} else {
				int var23;
				Object var25;
				if (var6 == 2) {
					var23 = (var5 + 1) & 3;
					Object var24;
					if ((var9.anInt1346 == -1) && (null == var9.anIntArray1338)) {
						var24 = var9.method750(2, var5 + 4, var16, var18, var17, var19);
						var25 = var9.method750(2, var23, var16, var18, var17, var19);
					} else {
						var24 = new Class104_Sub18_Sub16_Sub1(var4, 2, var5 + 4, var1, var2, var3, var9.anInt1346, true,
								(Class104_Sub18_Sub16) null);
						var25 = new Class104_Sub18_Sub16_Sub1(var4, 2, var23, var1, var2, var3, var9.anInt1346, true,
								(Class104_Sub18_Sub16) null);
					}

					var7.method75(var0, var2, var3, var17, (Class104_Sub18_Sub16) var24, (Class104_Sub18_Sub16) var25,
							Class76.anIntArray606[var5], Class76.anIntArray606[var23], var20, var21);
					if (var9.anInt1363 != 0)
						var8.method303(var2, var3, var6, var5, var9.aBool1340);

				} else if (var6 == 3) {
					if ((var9.anInt1346 == -1) && (null == var9.anIntArray1338))
						var22 = var9.method750(3, var5, var16, var18, var17, var19);
					else
						var22 = new Class104_Sub18_Sub16_Sub1(var4, 3, var5, var1, var2, var3, var9.anInt1346, true,
								(Class104_Sub18_Sub16) null);

					var7.method75(var0, var2, var3, var17, (Class104_Sub18_Sub16) var22, (Class104_Sub18_Sub16) null,
							Class76.anIntArray610[var5], 0, var20, var21);
					if (var9.anInt1363 != 0)
						var8.method303(var2, var3, var6, var5, var9.aBool1340);

				} else if (var6 == 9) {
					if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
						var22 = var9.method750(var6, var5, var16, var18, var17, var19);
					else
						var22 = new Class104_Sub18_Sub16_Sub1(var4, var6, var5, var1, var2, var3, var9.anInt1346, true,
								(Class104_Sub18_Sub16) null);

					var7.method83(var0, var2, var3, var17, 1, 1, (Class104_Sub18_Sub16) var22, 0, var20, var21);
					if (var9.anInt1363 != 0)
						var8.method306(var2, var3, var10, var11, var9.aBool1340);

				} else if (var6 == 4) {
					if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
						var22 = var9.method750(4, var5, var16, var18, var17, var19);
					else
						var22 = new Class104_Sub18_Sub16_Sub1(var4, 4, var5, var1, var2, var3, var9.anInt1346, true,
								(Class104_Sub18_Sub16) null);

					var7.method84(var0, var2, var3, var17, (Class104_Sub18_Sub16) var22, (Class104_Sub18_Sub16) null,
							Class76.anIntArray606[var5], 0, 0, 0, var20, var21);
				} else {
					int var26;
					if (var6 == 5) {
						var23 = 16;
						var26 = var7.method85(var0, var2, var3);
						if (var26 != 0)
							var23 = ItemDef.forId((var26 >> 14) & 32767).anInt1348;

						if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
							var25 = var9.method750(4, var5, var16, var18, var17, var19);
						else
							var25 = new Class104_Sub18_Sub16_Sub1(var4, 4, var5, var1, var2, var3, var9.anInt1346, true,
									(Class104_Sub18_Sub16) null);

						var7.method84(var0, var2, var3, var17, (Class104_Sub18_Sub16) var25,
								(Class104_Sub18_Sub16) null, Class76.anIntArray606[var5], 0,
								Class76.anIntArray608[var5] * var23, var23 * Class76.anIntArray612[var5], var20, var21);
					} else if (var6 == 6) {
						var23 = 8;
						var26 = var7.method85(var0, var2, var3);
						if (var26 != 0)
							var23 = ItemDef.forId((var26 >> 14) & 32767).anInt1348 / 2;

						if ((var9.anInt1346 == -1) && (null == var9.anIntArray1338))
							var25 = var9.method750(4, var5 + 4, var16, var18, var17, var19);
						else
							var25 = new Class104_Sub18_Sub16_Sub1(var4, 4, 4 + var5, var1, var2, var3, var9.anInt1346,
									true, (Class104_Sub18_Sub16) null);

						var7.method84(var0, var2, var3, var17, (Class104_Sub18_Sub16) var25,
								(Class104_Sub18_Sub16) null, 256, var5, Class76.anIntArray613[var5] * var23,
								var23 * Class76.anIntArray614[var5], var20, var21);
					} else if (var6 == 7) {
						var26 = (2 + var5) & 3;
						if ((var9.anInt1346 == -1) && (var9.anIntArray1338 == null))
							var22 = var9.method750(4, var26 + 4, var16, var18, var17, var19);
						else
							var22 = new Class104_Sub18_Sub16_Sub1(var4, 4, var26 + 4, var1, var2, var3, var9.anInt1346,
									true, (Class104_Sub18_Sub16) null);

						var7.method84(var0, var2, var3, var17, (Class104_Sub18_Sub16) var22,
								(Class104_Sub18_Sub16) null, 256, var26, 0, 0, var20, var21);
					} else if (var6 == 8) {
						var23 = 8;
						var26 = var7.method85(var0, var2, var3);
						if (var26 != 0)
							var23 = ItemDef.forId((var26 >> 14) & 32767).anInt1348 / 2;

						final int var27 = (var5 + 2) & 3;
						Object var28;
						if ((var9.anInt1346 == -1) && (null == var9.anIntArray1338)) {
							var25 = var9.method750(4, 4 + var5, var16, var18, var17, var19);
							var28 = var9.method750(4, 4 + var27, var16, var18, var17, var19);
						} else {
							var25 = new Class104_Sub18_Sub16_Sub1(var4, 4, var5 + 4, var1, var2, var3, var9.anInt1346,
									true, (Class104_Sub18_Sub16) null);
							var28 = new Class104_Sub18_Sub16_Sub1(var4, 4, 4 + var27, var1, var2, var3, var9.anInt1346,
									true, (Class104_Sub18_Sub16) null);
						}

						var7.method84(var0, var2, var3, var17, (Class104_Sub18_Sub16) var25,
								(Class104_Sub18_Sub16) var28, 256, var5, Class76.anIntArray613[var5] * var23,
								var23 * Class76.anIntArray614[var5], var20, var21);
					}
				}
			}
		} else {
			if ((var9.anInt1346 == -1) && (null == var9.anIntArray1338))
				var22 = var9.method750(10, var5, var16, var18, var17, var19);
			else
				var22 = new Class104_Sub18_Sub16_Sub1(var4, 10, var5, var1, var2, var3, var9.anInt1346, true,
						(Class104_Sub18_Sub16) null);

			if (var22 != null)
				var7.method83(var0, var2, var3, var17, var10, var11, (Class104_Sub18_Sub16) var22, var6 == 11 ? 256 : 0,
						var20, var21);

			if (var9.anInt1363 != 0)
				var8.method306(var2, var3, var10, var11, var9.aBool1340);

		}
	}
}
