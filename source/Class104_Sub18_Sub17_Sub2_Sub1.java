public final class Class104_Sub18_Sub17_Sub2_Sub1 extends Class104_Sub18_Sub17_Sub2 {
	@Override
	final void method864(final byte[] var1, int var2, int var3, int var4, int var5, final int var6) {
		int var7 = var2 + (var3 * anInt1469);
		int var8 = anInt1469 - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < anInt1471) {
			var11 = anInt1471 - var3;
			var5 -= var11;
			var3 = anInt1471;
			var10 += var11 * var4;
			var7 += var11 * anInt1469;
		}

		if ((var3 + var5) > anInt1470)
			var5 -= (var3 + var5) - anInt1470;

		if (var2 < anInt1473) {
			var11 = anInt1473 - var2;
			var4 -= var11;
			var2 = anInt1473;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if ((var2 + var4) > anInt1472) {
			var11 = (var2 + var4) - anInt1472;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if ((var4 > 0) && (var5 > 0))
			method873(anIntArray1474, var1, var6, var10, var7, var4, var5, var8, var9);
	}

	public Class104_Sub18_Sub17_Sub2_Sub1(final byte[] var1) {
		super(var1);
	}

	public Class104_Sub18_Sub17_Sub2_Sub1(final byte[] var1, final int[] var2, final int[] var3, final int[] var4,
			final int[] var5, final int[] var6, final byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	@Override
	final void method884(final byte[] var1, int var2, int var3, int var4, int var5, final int var6, final int var7) {
		int var8 = var2 + (var3 * anInt1469);
		int var9 = anInt1469 - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < anInt1471) {
			var12 = anInt1471 - var3;
			var5 -= var12;
			var3 = anInt1471;
			var11 += var12 * var4;
			var8 += var12 * anInt1469;
		}

		if ((var3 + var5) > anInt1470)
			var5 -= (var3 + var5) - anInt1470;

		if (var2 < anInt1473) {
			var12 = anInt1473 - var2;
			var4 -= var12;
			var2 = anInt1473;
			var11 += var12;
			var8 += var12;
			var10 += var12;
			var9 += var12;
		}

		if ((var2 + var4) > anInt1472) {
			var12 = (var2 + var4) - anInt1472;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}

		if ((var4 > 0) && (var5 > 0))
			method877(anIntArray1474, var1, var6, var11, var8, var4, var5, var9, var10, var7);
	}
}
