public class Class30 {
	static String aString285;
	static int[] anIntArray286;
	static int anInt287;
	static Widget aClass104_Sub12_288;
	public String aString283;
	public int anInt284;
	public static Class30 aClass30_282 = new Class30("LIVE", 0);
	public static Class30 aClass30_280 = new Class30("BUILDLIVE", 3);
	public static Class30 aClass30_279 = new Class30("RC", 1);
	public static Class30 aClass30_281 = new Class30("WIP", 2);

	Class30(final String var1, final int var2) {
		aString283 = var1;
		anInt284 = var2;
	}

	static final void method144(final Class104_Sub18_Sub16_Sub7 var0) {
		if (var0.anInt1708 > client.anInt1799) {
			final int var1 = var0.anInt1708 - client.anInt1799;
			final int var2 = (var0.anInt1736 * 64) + (var0.anInt1697 * 128);
			final int var3 = (var0.anInt1736 * 64) + (var0.anInt1734 * 128);
			var0.anInt1695 += (var2 - var0.anInt1695) / var1;
			var0.anInt1694 += (var3 - var0.anInt1694) / var1;
			var0.anInt1748 = 0;
			if (var0.anInt1738 == 0)
				var0.anInt1698 = 1024;

			if (var0.anInt1738 == 1)
				var0.anInt1698 = 1536;

			if (var0.anInt1738 == 2)
				var0.anInt1698 = 0;

			if (var0.anInt1738 == 3)
				var0.anInt1698 = 512;
		} else if (var0.anInt1737 >= client.anInt1799)
			JagFS2.method66(var0);
		else
			Class104_Sub18_Sub5.method734(var0);

		if ((var0.anInt1695 < 128) || (var0.anInt1694 < 128) || (var0.anInt1695 >= 13184)
				|| (var0.anInt1694 >= 13184)) {
			var0.anInt1722 = -1;
			var0.anInt1727 = -1;
			var0.anInt1708 = 0;
			var0.anInt1737 = 0;
			var0.anInt1695 = (var0.anInt1736 * 64) + (128 * var0.anIntArray1745[0]);
			var0.anInt1694 = (var0.anInt1736 * 64) + (var0.anIntArray1746[0] * 128);
			var0.method932();
		}

		if ((var0 == Class81.pf) && ((var0.anInt1695 < 1536) || (var0.anInt1694 < 1536)
				|| (var0.anInt1695 >= 11776) || (var0.anInt1694 >= 11776))) {
			var0.anInt1722 = -1;
			var0.anInt1727 = -1;
			var0.anInt1708 = 0;
			var0.anInt1737 = 0;
			var0.anInt1695 = (var0.anIntArray1745[0] * 128) + (var0.anInt1736 * 64);
			var0.anInt1694 = (var0.anInt1736 * 64) + (var0.anIntArray1746[0] * 128);
			var0.method932();
		}

		Class105.method473(var0);
		Class84.method381(var0);
	}

	public static Class27[] method145() {
		return new Class27[] { Class27.aClass27_259, Class27.aClass27_258, Class27.aClass27_260 };
	}
}
