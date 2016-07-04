public class Class12 {
	static int anInt67;
	static int anInt69;
	static int anInt72;
	static int anInt73;
	static int anInt74;
	static Class104_Sub18_Sub17_Sub1 aClass104_Sub18_Sub17_Sub1_75;
	static Class61 aClass61_76;
	static int[] anIntArray70;
	static int[] anIntArray71;
	static int[] anIntArray68;

	public static Class104_Sub18_Sub17_Sub3[] method50(final Class61 var0, final String var1, final String var2) {
		final int var3 = var0.getArchiveIDForName(var1);
		final int var4 = var0.method273(var3, var2);
		Class104_Sub18_Sub17_Sub3[] var5;
		if (!Class39.method181(var0, var3, var4))
			var5 = null;
		else {
			final Class104_Sub18_Sub17_Sub3[] var6 = new Class104_Sub18_Sub17_Sub3[anInt67];

			for (int var7 = 0; var7 < anInt67; ++var7) {
				final Class104_Sub18_Sub17_Sub3 var8 = var6[var7] = new Class104_Sub18_Sub17_Sub3();
				var8.anInt1622 = anInt72;
				var8.anInt1623 = anInt69;
				var8.anInt1620 = anIntArray70[var7];
				var8.anInt1621 = anIntArray71[var7];
				var8.anInt1618 = Class78.anIntArray626[var7];
				var8.anInt1619 = Class69.anIntArray564[var7];
				var8.anIntArray1617 = anIntArray68;
				var8.aByteArray1616 = Class41.aByteArrayArray368[var7];
			}

			anIntArray70 = null;
			anIntArray71 = null;
			Class78.anIntArray626 = null;
			Class69.anIntArray564 = null;
			anIntArray68 = null;
			Class41.aByteArrayArray368 = null;
			var5 = var6;
		}

		return var5;
	}
}
