public class Class104_Sub18_Sub7 extends Class104_Sub18 {
	public int anInt1380;
	public int anInt1382;
	public int anInt1385;
	public int anInt1376 = 0;
	public int anInt1377 = -1;
	public boolean aBool1378 = true;
	public int anInt1384 = -1;
	public int anInt1379;
	public int anInt1383;
	public int anInt1375;
	public static Class56 aClass56_1381 = new Class56(64);

	void method752() {
		if (anInt1384 != -1) {
			method754(anInt1384);
			anInt1380 = anInt1379;
			anInt1382 = anInt1383;
			anInt1385 = anInt1375;
		}

		method754(anInt1376);
	}

	void method753(final Class104_Sub21 var1, final int var2) {
		if (var2 == 1)
			anInt1376 = var1.method614();
		else if (var2 == 2)
			anInt1377 = var1.method570();
		else if (var2 == 5)
			aBool1378 = false;
		else if (var2 == 7)
			anInt1384 = var1.method614();
		else if (var2 == 8)
			;

	}

	void method754(final int var1) {
		final double var2 = ((var1 >> 16) & 255) / 256.0D;
		final double var4 = ((var1 >> 8) & 255) / 256.0D;
		final double var6 = (var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2)
			var8 = var4;

		if (var6 < var8)
			var8 = var6;

		double var10 = var2;
		if (var4 > var2)
			var10 = var4;

		if (var6 > var10)
			var10 = var6;

		double var12 = 0.0D;
		double var14 = 0.0D;
		final double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D)
				var14 = (var10 - var8) / (var10 + var8);

			if (var16 >= 0.5D)
				var14 = (var10 - var8) / (2.0D - var10 - var8);

			if (var10 == var2)
				var12 = (var4 - var6) / (var10 - var8);
			else if (var4 == var10)
				var12 = 2.0D + ((var6 - var2) / (var10 - var8));
			else if (var6 == var10)
				var12 = 4.0D + ((var2 - var4) / (var10 - var8));
		}

		var12 /= 6.0D;
		anInt1379 = (int) (256.0D * var12);
		anInt1383 = (int) (var14 * 256.0D);
		anInt1375 = (int) (var16 * 256.0D);
		if (anInt1383 < 0)
			anInt1383 = 0;
		else if (anInt1383 > 255)
			anInt1383 = 255;

		if (anInt1375 < 0)
			anInt1375 = 0;
		else if (anInt1375 > 255)
			anInt1375 = 255;

	}

	void method755(final Class104_Sub21 var1, final int var2) {
		while (true) {
			final int var3 = var1.method570();
			if (var3 == 0)
				return;

			method753(var1, var3);
		}
	}

	static final int method756(final int var0, final int var1) {
		int var2 = (Class104_Sub3.method486('\ub135' + var0, var1 + 91923, 4) - 128)
				+ ((Class104_Sub3.method486(10294 + var0, '\u93bd' + var1, 2) - 128) >> 1)
				+ ((Class104_Sub3.method486(var0, var1, 1) - 128) >> 2);
		var2 = (int) (0.3D * var2) + 35;
		if (var2 < 10)
			var2 = 10;
		else if (var2 > 60)
			var2 = 60;

		return var2;
	}
}
