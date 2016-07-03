public final class Class104_Sub18_Sub16_Sub2 extends Class104_Sub18_Sub16 {
	boolean aBool1510 = false;
	double aDouble1503;
	double aDouble1502;
	double aDouble1499;
	double aDouble1507;
	int anInt1509;
	int anInt1500;
	int anInt1513 = 0;
	int anInt1512 = 0;
	double aDouble1501;
	double aDouble1504;
	double aDouble1489;
	double aDouble1508;
	int anInt1491;
	int anInt1506;
	int anInt1497;
	int anInt1492;
	int anInt1493;
	int anInt1495;
	int anInt1496;
	int anInt1490;
	int anInt1498;
	int anInt1505;
	int anInt1494;
	Class104_Sub18_Sub3 aClass104_Sub18_Sub3_1511;

	final void method807(final int var1) {
		aBool1510 = true;
		aDouble1503 += var1 * aDouble1501;
		aDouble1502 += var1 * aDouble1504;
		aDouble1499 += (var1 * 0.5D * aDouble1508 * var1) + (var1 * aDouble1507);
		aDouble1507 += aDouble1508 * var1;
		anInt1509 = ((int) (Math.atan2(aDouble1501, aDouble1504) * 325.949D) + 1024) & 2047;
		anInt1500 = (int) (Math.atan2(aDouble1507, aDouble1489) * 325.949D) & 2047;
		if (aClass104_Sub18_Sub3_1511 != null) {
			anInt1513 += var1;

			while (true) {
				do {
					do {
						if (anInt1513 <= aClass104_Sub18_Sub3_1511.anIntArray1264[anInt1512])
							return;

						anInt1513 -= aClass104_Sub18_Sub3_1511.anIntArray1264[anInt1512];
						++anInt1512;
					} while (anInt1512 < aClass104_Sub18_Sub3_1511.anIntArray1262.length);

					anInt1512 -= aClass104_Sub18_Sub3_1511.anInt1266;
				} while ((anInt1512 >= 0) && (anInt1512 < aClass104_Sub18_Sub3_1511.anIntArray1262.length));

				anInt1512 = 0;
			}
		}
	}

	final void method808(final int var1, final int var2, final int var3, final int var4) {
		double var5;
		if (!aBool1510) {
			var5 = var1 - anInt1497;
			final double var7 = var2 - anInt1492;
			final double var9 = Math.sqrt((var7 * var7) + (var5 * var5));
			aDouble1503 = anInt1497 + ((var5 * anInt1498) / var9);
			aDouble1502 = anInt1492 + ((anInt1498 * var7) / var9);
			aDouble1499 = anInt1493;
		}

		var5 = (1 + anInt1496) - var4;
		aDouble1501 = (var1 - aDouble1503) / var5;
		aDouble1504 = (var2 - aDouble1502) / var5;
		aDouble1489 = Math.sqrt((aDouble1504 * aDouble1504) + (aDouble1501 * aDouble1501));
		if (!aBool1510)
			aDouble1507 = -aDouble1489 * Math.tan(anInt1490 * 0.02454369D);

		aDouble1508 = ((var3 - aDouble1499 - (var5 * aDouble1507)) * 2.0D) / (var5 * var5);
	}

	@Override
	final Class104_Sub18_Sub16_Sub4 method788(final int var1) {
		final Class104_Sub18_Sub5 var2 = Class71.method330(anInt1491);
		final Class104_Sub18_Sub16_Sub4 var3 = var2.method732(anInt1512);
		if (null == var3)
			return null;
		else {
			var3.method821(anInt1500);
			return var3;
		}
	}

	Class104_Sub18_Sub16_Sub2(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9, final int var10, final int var11) {
		anInt1491 = var1;
		anInt1506 = var2;
		anInt1497 = var3;
		anInt1492 = var4;
		anInt1493 = var5;
		anInt1495 = var6;
		anInt1496 = var7;
		anInt1490 = var8;
		anInt1498 = var9;
		anInt1505 = var10;
		anInt1494 = var11;
		aBool1510 = false;
		final int var12 = Class71.method330(anInt1491).anInt1316;
		if (var12 != -1)
			aClass104_Sub18_Sub3_1511 = Class70.method327(var12);
		else
			aClass104_Sub18_Sub3_1511 = null;

	}

	static void method809(final int var0, final int var1, final int var2, final int var3) {
		Class104_Sub2 var4 = (Class104_Sub2) Class104_Sub2.aClass58_857.method241(var0);
		if (var4 == null) {
			var4 = new Class104_Sub2();
			Class104_Sub2.aClass58_857.method242(var4, var0);
		}

		if (var4.anIntArray856.length <= var1) {
			final int[] var5 = new int[1 + var1];
			final int[] var6 = new int[1 + var1];

			int var7;
			for (var7 = 0; var7 < var4.anIntArray856.length; ++var7) {
				var5[var7] = var4.anIntArray856[var7];
				var6[var7] = var4.anIntArray858[var7];
			}

			for (var7 = var4.anIntArray856.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.anIntArray856 = var5;
			var4.anIntArray858 = var6;
		}

		var4.anIntArray856[var1] = var2;
		var4.anIntArray858[var1] = var3;
	}
}
