public class Class100 {
	Class104_Sub18_Sub4 aClass104_Sub18_Sub4_796;
	int[] anIntArray797;
	String[] aStringArray798;
	protected static boolean aBool799;
	static Class61_Sub1 aClass61_Sub1_800;
	int anInt795 = -1;

	static final void method463(Class104_Sub18_Sub2 var0, final int var1, final int var2, final int var3) {
		if (client.anInt1805 < 400) {
			if (var0.anIntArray1230 != null)
				var0 = var0.method677();

			if (var0 != null)
				if (var0.aBool1257) {
					String var4 = var0.aString1229;
					int var7;
					if (var0.anInt1246 != 0) {
						final int var6 = var0.anInt1246;
						var7 = Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1773;
						final int var8 = var7 - var6;
						String var9;
						if (var8 < -9)
							var9 = Class70.method326(16711680);
						else if (var8 < -6)
							var9 = Class70.method326(16723968);
						else if (var8 < -3)
							var9 = Class70.method326(16740352);
						else if (var8 < 0)
							var9 = Class70.method326(16756736);
						else if (var8 > 9)
							var9 = Class70.method326('\uff00');
						else if (var8 > 6)
							var9 = Class70.method326(4259584);
						else if (var8 > 3)
							var9 = Class70.method326(8453888);
						else if (var8 > 0)
							var9 = Class70.method326(12648192);
						else
							var9 = Class70.method326(16776960);

						var4 = var4 + var9 + " " + " (" + "level-" + var0.anInt1246 + ")";
					}

					if (client.anInt1941 == 1)
						Class60.method256("Use",
								client.aString1942 + " " + "->" + " " + Class70.method326(16776960) + var4, 7, var1,
								var2, var3);
					else if (client.aBool1943) {
						if ((Class11.anInt66 & 2) == 2)
							Class60.method256(client.aString1914,
									client.aString1946 + " " + "->" + " " + Class70.method326(16776960) + var4, 8, var1,
									var2, var3);
					} else {
						String[] var5 = var0.aStringArray1225;
						if (client.aBool1870)
							var5 = Class9.method37(var5);

						int var10;
						if (null != var5)
							for (var10 = 4; var10 >= 0; --var10)
								if ((var5[var10] != null) && !var5[var10].equalsIgnoreCase("Attack")) {
									byte var11 = 0;
									if (var10 == 0)
										var11 = 9;

									if (var10 == 1)
										var11 = 10;

									if (var10 == 2)
										var11 = 11;

									if (var10 == 3)
										var11 = 12;

									if (var10 == 4)
										var11 = 13;

									Class60.method256(var5[var10], Class70.method326(16776960) + var4, var11, var1,
											var2, var3);
								}

						if (var5 != null)
							for (var10 = 4; var10 >= 0; --var10)
								if ((null != var5[var10]) && var5[var10].equalsIgnoreCase("Attack")) {
									short var12 = 0;
									if (var0.anInt1246 > Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1773)
										var12 = 2000;

									var7 = 0;
									if (var10 == 0)
										var7 = var12 + 9;

									if (var10 == 1)
										var7 = 10 + var12;

									if (var10 == 2)
										var7 = var12 + 11;

									if (var10 == 3)
										var7 = var12 + 12;

									if (var10 == 4)
										var7 = 13 + var12;

									Class60.method256(var5[var10], Class70.method326(16776960) + var4, var7, var1, var2,
											var3);
								}

						Class60.method256("Examine", Class70.method326(16776960) + var4, 1003, var1, var2, var3);
					}

				}
		}
	}
}
