public final class Class104_Sub18_Sub16_Sub3 extends Class104_Sub18_Sub16 {
	static Class104_Sub18_Sub17_Sub3[] aClass104_Sub18_Sub17_Sub3Array1524;
	int anInt1521 = 0;
	int anInt1514 = 0;
	boolean aBool1517 = false;
	int anInt1520;
	int anInt1516;
	int anInt1522;
	int anInt1518;
	int anInt1523;
	int anInt1515;
	Class104_Sub18_Sub3 aClass104_Sub18_Sub3_1519;

	Class104_Sub18_Sub16_Sub3(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		anInt1520 = var1;
		anInt1516 = var2;
		anInt1522 = var3;
		anInt1518 = var4;
		anInt1523 = var5;
		anInt1515 = var7 + var6;
		final int var8 = Class71.method330(anInt1520).anInt1316;
		if (var8 != -1) {
			aBool1517 = false;
			aClass104_Sub18_Sub3_1519 = Class70.method327(var8);
		} else
			aBool1517 = true;

	}

	final void method810(final int var1) {
		if (!aBool1517) {
			anInt1514 += var1;

			while (anInt1514 > aClass104_Sub18_Sub3_1519.anIntArray1264[anInt1521]) {
				anInt1514 -= aClass104_Sub18_Sub3_1519.anIntArray1264[anInt1521];
				++anInt1521;
				if (anInt1521 >= aClass104_Sub18_Sub3_1519.anIntArray1262.length) {
					aBool1517 = true;
					break;
				}
			}

		}
	}

	@Override
	final Class104_Sub18_Sub16_Sub4 method788(final int var1) {
		final Class104_Sub18_Sub5 var2 = Class71.method330(anInt1520);
		Class104_Sub18_Sub16_Sub4 var3;
		if (!aBool1517)
			var3 = var2.method732(anInt1521);
		else
			var3 = var2.method732(-1);

		return null == var3 ? null : var3;
	}
}
