public class Class48 {
	static long aLong407;
	static long aLong408;
	static Class104_Sub18_Sub13 aClass104_Sub18_Sub13_410;
	static Class104_Sub18_Sub17_Sub3[] aClass104_Sub18_Sub17_Sub3Array409;
	static int[] anIntArray411;

	public static Class104_Sub18_Sub17_Sub1[] method215(final Class61 var0, final String var1, final String var2) {
		final int var3 = var0.getArchiveIDForName(var1);
		final int var4 = var0.method273(var3, var2);
		Class104_Sub18_Sub17_Sub1[] var5;
		if (!Class39.method181(var0, var3, var4))
			var5 = null;
		else {
			final Class104_Sub18_Sub17_Sub1[] var6 = new Class104_Sub18_Sub17_Sub1[Class12.anInt67];

			for (int var7 = 0; var7 < Class12.anInt67; ++var7) {
				final Class104_Sub18_Sub17_Sub1 var8 = var6[var7] = new Class104_Sub18_Sub17_Sub1();
				var8.anInt1590 = Class12.anInt72;
				var8.anInt1591 = Class12.anInt69;
				var8.anInt1589 = Class12.anIntArray70[var7];
				var8.anInt1587 = Class12.anIntArray71[var7];
				var8.anInt1593 = Class78.anIntArray626[var7];
				var8.anInt1588 = Class69.anIntArray564[var7];
				final int var9 = var8.anInt1588 * var8.anInt1593;
				final byte[] var10 = Class41.aByteArrayArray368[var7];
				var8.anIntArray1592 = new int[var9];

				for (int var11 = 0; var11 < var9; ++var11)
					var8.anIntArray1592[var11] = Class12.anIntArray68[var10[var11] & 255];
			}

			Class12.anIntArray70 = null;
			Class12.anIntArray71 = null;
			Class78.anIntArray626 = null;
			Class69.anIntArray564 = null;
			Class12.anIntArray68 = null;
			Class41.aByteArrayArray368 = null;
			var5 = var6;
		}

		return var5;
	}

	static void method216() {
		if (Class103.aBool816) {
			Class66.aClass104_Sub18_Sub17_Sub3_523 = null;
			Class66.aClass104_Sub18_Sub17_Sub3_538 = null;
			Class66.aClass104_Sub18_Sub17_Sub3Array544 = null;
			Class66.aClass104_Sub18_Sub17_Sub1_531 = null;
			Class3.aClass104_Sub18_Sub17_Sub1_10 = null;
			Class66.aClass104_Sub18_Sub17_Sub3_520 = null;
			Class66.aClass104_Sub18_Sub17_Sub3Array521 = null;
			Class101.aClass104_Sub18_Sub17_Sub1Array813 = null;
			Class104_Sub18_Sub16_Sub3.aClass104_Sub18_Sub17_Sub3Array1524 = null;
			Class21.aClass104_Sub18_Sub17_Sub3Array223 = null;
			aClass104_Sub18_Sub17_Sub3Array409 = null;
			Class96.aClass104_Sub18_Sub17_Sub3_759 = null;
			Class42.anIntArray371 = null;
			anIntArray411 = null;
			Class66.anIntArray526 = null;
			Class66.anIntArray525 = null;
			Class14.anIntArray92 = null;
			Class24.anIntArray244 = null;
			Class66.anIntArray529 = null;
			Class88.anIntArray700 = null;
			Class29.anInt272 = 1;
			Class29.aClass61_273 = null;
			Class1.anInt1 = -1;
			Class29.anInt276 = -1;
			Class29.anInt275 = 0;
			Class104_Sub2.aBool859 = false;
			Class69.anInt565 = 2;
			Class84.method379(true);
			Class103.aBool816 = false;
		}
	}

	public static final void method217(final int var0, final boolean var1, final int var2) {
		if ((var0 >= 8000) && (var0 <= '\ubb80')) {
			Class99.anInt777 = var0;
			Class99.aBool773 = var1;
			Class99.anInt775 = var2;
		} else
			throw new IllegalArgumentException();
	}
}
