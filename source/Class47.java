public abstract class Class47 {
	public static short[][] aShortArrayArray405;
	static int[] anIntArray406;
	static boolean aBool404 = false;

	abstract byte[] method208(int var1);

	abstract void method209(byte[] var1, int var2);

	public static Class104_Sub12 method210(final int var0) {
		final int var1 = var0 >> 16;
		final int var2 = var0 & '\uffff';
		if ((null == Class22.aClass104_Sub12ArrayArray228[var1])
				|| (Class22.aClass104_Sub12ArrayArray228[var1][var2] == null)) {
			final boolean var3 = Class104_Sub7.method508(var1);
			if (!var3)
				return null;
		}

		return Class22.aClass104_Sub12ArrayArray228[var1][var2];
	}

	static final int method211(final int var0, final int var1, final int var2) {
		final int var3 = var0 >> 7;
		final int var4 = var1 >> 7;
		if ((var3 >= 0) && (var4 >= 0) && (var3 <= 103) && (var4 <= 103)) {
			int var5 = var2;
			if ((var2 < 3) && ((Class76.aByteArrayArrayArray600[1][var3][var4] & 2) == 2))
				var5 = var2 + 1;

			final int var6 = var0 & 127;
			final int var7 = var1 & 127;
			final int var8 = (((128 - var6) * Class76.anIntArrayArrayArray611[var5][var3][var4])
					+ (Class76.anIntArrayArrayArray611[var5][var3 + 1][var4] * var6)) >> 7;
			final int var9 = ((Class76.anIntArrayArrayArray611[var5][var3][var4 + 1] * (128 - var6))
					+ (var6 * Class76.anIntArrayArrayArray611[var5][1 + var3][var4 + 1])) >> 7;
			return (((128 - var7) * var8) + (var7 * var9)) >> 7;
		} else
			return 0;
	}

	static final void method212(final Class104_Sub8 var0) {
		var0.aBool952 = false;
		if (null != var0.aClass104_Sub4_953)
			var0.aClass104_Sub4_953.anInt880 = 0;

		for (Class104_Sub8 var1 = var0.method512(); var1 != null; var1 = var0.method513())
			method212(var1);

	}

	public static void method213(final Class49 var0) {
		Class106.aClass49_826 = var0;
	}

	public static Class104_Sub18_Sub17_Sub2_Sub1 method214(final Class61 var0, final Class61 var1, final String var2,
			final String var3) {
		final int var4 = var0.method271(var2);
		final int var5 = var0.method273(var4, var3);
		Class104_Sub18_Sub17_Sub2_Sub1 var6;
		if (!Class39.method181(var0, var4, var5))
			var6 = null;
		else
			var6 = Class99.method461(var1.method259(var4, var5));

		return var6;
	}
}
