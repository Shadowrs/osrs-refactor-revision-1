public class Class104_Sub18_Sub1 extends Class104_Sub18 {
	static Class61 aClass61_1191;
	int anInt1187 = 0;
	public int anInt1189;
	public int anInt1192;
	public int anInt1193;
	public int anInt1190;
	static Class56 aClass56_1188 = new Class56(64);

	void method631() {
		method634(anInt1187);
	}

	void method632(final RSBuf var1, final int var2) {
		while (true) {
			final int var3 = var1.readUByte();
			if (var3 == 0)
				return;

			method633(var1, var3);
		}
	}

	void method633(final RSBuf var1, final int var2) {
		if (var2 == 1)
			anInt1187 = var1.method614();

	}

	void method634(final int var1) {
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
		if (var10 != var8) {
			if (var16 < 0.5D)
				var14 = (var10 - var8) / (var8 + var10);

			if (var16 >= 0.5D)
				var14 = (var10 - var8) / (2.0D - var10 - var8);

			if (var2 == var10)
				var12 = (var4 - var6) / (var10 - var8);
			else if (var4 == var10)
				var12 = ((var6 - var2) / (var10 - var8)) + 2.0D;
			else if (var10 == var6)
				var12 = 4.0D + ((var2 - var4) / (var10 - var8));
		}

		var12 /= 6.0D;
		anInt1189 = (int) (var14 * 256.0D);
		anInt1192 = (int) (var16 * 256.0D);
		if (anInt1189 < 0)
			anInt1189 = 0;
		else if (anInt1189 > 255)
			anInt1189 = 255;

		if (anInt1192 < 0)
			anInt1192 = 0;
		else if (anInt1192 > 255)
			anInt1192 = 255;

		if (var16 > 0.5D)
			anInt1193 = (int) (512.0D * (1.0D - var16) * var14);
		else
			anInt1193 = (int) (512.0D * var16 * var14);

		if (anInt1193 < 1)
			anInt1193 = 1;

		anInt1190 = (int) (anInt1193 * var12);
	}
}
