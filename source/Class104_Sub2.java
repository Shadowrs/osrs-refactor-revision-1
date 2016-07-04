public class Class104_Sub2 extends Class104 {
	public static boolean aBool859;
	static int anInt860;
	static Class104_Sub18_Sub17_Sub1 aClass104_Sub18_Sub17_Sub1_861;
	public static int anInt862;
	static Class58 aClass58_857 = new Class58(32);
	int[] anIntArray856 = new int[] { -1 };
	int[] anIntArray858 = new int[] { 0 };

	static final void method479(final boolean var0) {
		if ((client.anInt2018 == (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 >> 7))
				&& (client.anInt1880 == (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 >> 7)))
			client.anInt2018 = 0;

		int var1 = client.anInt1994;
		if (var0)
			var1 = 1;

		for (int var2 = 0; var2 < var1; ++var2) {
			Class104_Sub18_Sub16_Sub7_Sub1 var3;
			int var4;
			if (var0) {
				var3 = Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644;
				var4 = 33538048;
			} else {
				var3 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[client.anIntArray1909[var2]];
				var4 = client.anIntArray1909[var2] << 14;
			}

			if ((var3 != null) && var3.method936(1531790724)) {
				var3.aBool1779 = false;
				if (((client.lowmvm && (client.anInt1994 > 50)) || (client.anInt1994 > 200)) && !var0
						&& (var3.anInt1702 == var3.anInt1719))
					var3.aBool1779 = true;

				final int var5 = var3.anInt1695 >> 7;
				final int var6 = var3.anInt1694 >> 7;
				if ((var5 >= 0) && (var5 < 104) && (var6 >= 0) && (var6 < 104))
					if ((null != var3.aClass104_Sub18_Sub16_Sub4_1785) && (client.anInt1799 >= var3.anInt1776)
							&& (client.anInt1799 < var3.anInt1777)) {
						var3.aBool1779 = false;
						var3.anInt1775 = Class47.method211(var3.anInt1695, var3.anInt1694, Class12.anInt73);
						Class81.aClass17_643.method106(Class12.anInt73, var3.anInt1695, var3.anInt1694, var3.anInt1775,
								60, var3, var3.anInt1725, var4, var3.anInt1782, var3.anInt1786, var3.anInt1769,
								var3.anInt1772);
					} else {
						if (((var3.anInt1695 & 127) == 64) && ((var3.anInt1694 & 127) == 64)) {
							if (client.anInt1892 == client.anIntArrayArray1891[var5][var6])
								continue;

							client.anIntArrayArray1891[var5][var6] = client.anInt1892;
						}

						var3.anInt1775 = Class47.method211(var3.anInt1695, var3.anInt1694, Class12.anInt73);
						Class81.aClass17_643.method97(Class12.anInt73, var3.anInt1695, var3.anInt1694, var3.anInt1775,
								60, var3, var3.anInt1725, var4, var3.aBool1696);
					}
			}
		}

	}

	public static boolean method480(final Class61 var0, final Class61 var1, final Class61 var2,
			final Class104_Sub8_Sub1 var3) {
		Class29.aClass61_274 = var0;
		Class29.aClass61_269 = var1;
		Class29.aClass61_270 = var2;
		Class29.aClass104_Sub8_Sub1_271 = var3;
		return true;
	}
}
