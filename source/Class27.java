public class Class27 {
	static Class104_Sub12 aClass104_Sub12_262;
	static Class61_Sub1 aClass61_Sub1_263;
	static Class61_Sub1 aClass61_Sub1_264;
	public static Class61 aClass61_265;
	static int anInt266;
	public int anInt261;
	static Class27 aClass27_258 = new Class27(0);
	public static Class27 aClass27_260 = new Class27(1);
	static Class27 aClass27_259 = new Class27(2);

	Class27(final int var1) {
		anInt261 = var1;
	}

	static final String method136(final int var0) {
		return var0 < 100000 ? "<col=ffff00>" + var0 + "</col>"
				: (var0 < 10000000 ? "<col=ffffff>" + (var0 / 1000) + "K" + "</col>"
						: "<col=00ff80>" + (var0 / 1000000) + "M" + "</col>");
	}

	public static Class104_Sub18_Sub12 method137(final int var0) {
		Class104_Sub18_Sub12 var1 = (Class104_Sub18_Sub12) Class104_Sub18_Sub12.aClass56_1415.method236(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class104_Sub18_Sub12.aClass61_1432.method259(10, var0);
			var1 = new Class104_Sub18_Sub12();
			var1.anInt1418 = var0;
			if (var2 != null)
				var1.method771(new RSBuf(var2));

			var1.method772();
			if (var1.anInt1433 != -1)
				var1.method774(method137(var1.anInt1433), method137(var1.anInt1442));

			if (!Class79.aBool632 && var1.aBool1440) {
				var1.aString1444 = "Members object";
				var1.aStringArray1434 = null;
				var1.aStringArray1435 = null;
				var1.anInt1420 = 0;
			}

			Class104_Sub18_Sub12.aClass56_1415.method238(var1, var0);
			return var1;
		}
	}
}
