public class Class104_Sub18_Sub16_Sub1 extends Class104_Sub18_Sub16 {
	int anInt1480;
	int anInt1487;
	Class104_Sub18_Sub3 aClass104_Sub18_Sub3_1486;
	int anInt1488;
	int anInt1481;
	int anInt1482;
	int anInt1483;
	int anInt1484;
	int anInt1485;

	@Override
	final Class104_Sub18_Sub16_Sub4 method788(final int var1) {
		if (aClass104_Sub18_Sub3_1486 != null) {
			int var2 = client.anInt1799 - anInt1480;
			if ((var2 > 100) && (aClass104_Sub18_Sub3_1486.anInt1266 > 0))
				var2 = 100;

			label46: {
				do {
					do {
						if (var2 <= aClass104_Sub18_Sub3_1486.anIntArray1264[anInt1487])
							break label46;

						var2 -= aClass104_Sub18_Sub3_1486.anIntArray1264[anInt1487];
						++anInt1487;
					} while (anInt1487 < aClass104_Sub18_Sub3_1486.anIntArray1262.length);

					anInt1487 -= aClass104_Sub18_Sub3_1486.anInt1266;
				} while ((anInt1487 >= 0) && (anInt1487 < aClass104_Sub18_Sub3_1486.anIntArray1262.length));

				aClass104_Sub18_Sub3_1486 = null;
			}

			anInt1480 = client.anInt1799 - var2;
		}

		ObjectDefinition var3 = ItemDef.forId(anInt1488);
		if (null != var3.anIntArray1338)
			var3 = var3.method747();

		if (null == var3)
			return null;
		else {
			int var4;
			int var5;
			if ((anInt1482 != 1) && (anInt1482 != 3)) {
				var4 = var3.anInt1365;
				var5 = var3.anInt1339;
			} else {
				var4 = var3.anInt1339;
				var5 = var3.anInt1365;
			}

			final int var6 = (var4 >> 1) + anInt1484;
			final int var7 = ((1 + var4) >> 1) + anInt1484;
			final int var8 = anInt1485 + (var5 >> 1);
			final int var9 = ((1 + var5) >> 1) + anInt1485;
			final int[][] var10 = Class76.anIntArrayArrayArray611[anInt1483];
			final int var11 = (var10[var6][var9] + var10[var7][var8] + var10[var6][var8] + var10[var7][var9]) >> 2;
			final int var12 = (var4 << 6) + (anInt1484 << 7);
			final int var13 = (anInt1485 << 7) + (var5 << 6);
			return var3.method749(anInt1481, anInt1482, var10, var12, var11, var13, aClass104_Sub18_Sub3_1486,
					anInt1487);
		}
	}

	Class104_Sub18_Sub16_Sub1(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final boolean var8, final Class104_Sub18_Sub16 var9) {
		anInt1488 = var1;
		anInt1481 = var2;
		anInt1482 = var3;
		anInt1483 = var4;
		anInt1484 = var5;
		anInt1485 = var6;
		if (var7 != -1) {
			aClass104_Sub18_Sub3_1486 = Class70.method327(var7);
			anInt1487 = 0;
			anInt1480 = client.anInt1799 - 1;
			if ((aClass104_Sub18_Sub3_1486.anInt1275 == 0) && (null != var9)
					&& (var9 instanceof Class104_Sub18_Sub16_Sub1)) {
				final Class104_Sub18_Sub16_Sub1 var10 = (Class104_Sub18_Sub16_Sub1) var9;
				if (var10.aClass104_Sub18_Sub3_1486 == aClass104_Sub18_Sub3_1486) {
					anInt1487 = var10.anInt1487;
					anInt1480 = var10.anInt1480;
					return;
				}
			}

			if (var8 && (aClass104_Sub18_Sub3_1486.anInt1266 != -1)) {
				anInt1487 = (int) (Math.random() * aClass104_Sub18_Sub3_1486.anIntArray1262.length);
				anInt1480 -= (int) (Math.random() * aClass104_Sub18_Sub3_1486.anIntArray1264[anInt1487]);
			}
		}

	}
}
