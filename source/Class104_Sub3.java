public final class Class104_Sub3 extends Class104 {
	int anInt867;
	int anInt868;
	int anInt869;
	int anInt870;
	int anInt871;
	int anInt872;
	int anInt873;
	int anInt874;
	int anInt875;
	int anInt876;
	static int anInt879;
	int anInt877 = 0;
	int anInt878 = -1;

	static int method485(final Widget var0) {
		final Class104_Sub17 var1 = (Class104_Sub17) client.aClass58_1926
				.method241(var0.anInt1018 + ((long) var0.anInt978 << 32));
		return null != var1 ? var1.anInt1134 : var0.anInt1037;
	}

	static final int method486(final int var0, final int var1, final int var2) {
		final int var3 = var0 / var2;
		final int var4 = var0 & (var2 - 1);
		final int var5 = var1 / var2;
		final int var6 = var1 & (var2 - 1);
		final int var7 = Class91.method412(var3, var5);
		final int var8 = Class91.method412(var3 + 1, var5);
		final int var9 = Class91.method412(var3, 1 + var5);
		final int var10 = Class91.method412(var3 + 1, var5 + 1);
		final int var11 = (65536 - Class104_Sub18_Sub17_Sub4.anIntArray1678[(1024 * var4) / var2]) >> 1;
		final int var12 = ((var8 * var11) >> 16) + ((var7 * (65536 - var11)) >> 16);
		final int var13 = (65536 - Class104_Sub18_Sub17_Sub4.anIntArray1678[(1024 * var4) / var2]) >> 1;
		final int var14 = ((var9 * (65536 - var13)) >> 16) + ((var13 * var10) >> 16);
		final int var15 = (65536 - Class104_Sub18_Sub17_Sub4.anIntArray1678[(1024 * var6) / var2]) >> 1;
		final int var16 = ((var14 * var15) >> 16) + ((var12 * (65536 - var15)) >> 16);
		return var16;
	}
}
