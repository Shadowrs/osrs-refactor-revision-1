import java.awt.FontMetrics;

public class Class104_Sub18_Sub15 extends Class104_Sub18 {
	protected static FontMetrics aFontMetrics1466;
	Class5[] aClass5Array1465;

	public Class104_Sub18_Sub15(final Class61 var1, final Class61 var2, final int var3, final boolean var4) {
		final Class59 var5 = new Class59();
		final int var6 = var1.leng(var3);
		aClass5Array1465 = new Class5[var6];
		final int[] var7 = var1.method265(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			final byte[] var9 = var1.decompress(var3, var7[var8]);
			Class104_Sub23 var10 = null;
			final int var11 = ((var9[0] & 255) << 8) | (var9[1] & 255);

			for (Class104_Sub23 var12 = (Class104_Sub23) var5.method251(); null != var12; var12 = (Class104_Sub23) var5
					.method252())
				if (var12.anInt1180 == var11) {
					var10 = var12;
					break;
				}

			if (null == var10) {
				final byte[] var13 = var2.method262(var11, 0);
				var10 = new Class104_Sub23(var11, var13);
				var5.method248(var10);
			}

			aClass5Array1465[var7[var8]] = new Class5(var9, var10);
		}

	}

	public boolean method786(final int var1) {
		return aClass5Array1465[var1].aBool19;
	}
}
