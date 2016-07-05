public final class Class69 {
	static int[] anIntArray564;
	public static int anInt565;

	public static int method321(char var0) {
		int var1 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var1 = (var0 << 4) + 1;
		}

		return var1;
	}

	static final void method322(int var0, int var1, final int var2) {
		if ((var0 >= 128) && (var1 >= 128) && (var0 <= 13056) && (var1 <= 13056)) {
			int var3 = Class47.method211(var0, var1, Class12.myplayerHeight) - var2;
			var0 -= Class85.anInt672;
			var3 -= Class46.anInt403;
			var1 -= Class99.anInt793;
			final int var4 = Class104_Sub18_Sub17_Sub4.anIntArray1680[Class27.anInt266];
			final int var5 = Class104_Sub18_Sub17_Sub4.anIntArray1678[Class27.anInt266];
			final int var6 = Class104_Sub18_Sub17_Sub4.anIntArray1680[Class44.anInt395];
			final int var7 = Class104_Sub18_Sub17_Sub4.anIntArray1678[Class44.anInt395];
			int var8 = ((var6 * var1) + (var7 * var0)) >> 16;
			var1 = ((var1 * var7) - (var0 * var6)) >> 16;
			var0 = var8;
			var8 = ((var5 * var3) - (var4 * var1)) >> 16;
			var1 = ((var4 * var3) + (var5 * var1)) >> 16;
			if (var1 >= 50) {
				client.anInt1999 = ((var0 << 9) / var1) + 256;
				client.anInt1894 = ((var8 << 9) / var1) + 167;
			} else {
				client.anInt1999 = -1;
				client.anInt1894 = -1;
			}

		} else {
			client.anInt1999 = -1;
			client.anInt1894 = -1;
		}
	}

	public static final void method323(final long var0) {
		if (var0 > 0L)
			if ((var0 % 10L) == 0L) {
				Class102_Sub1.method497(var0 - 1L);
				Class102_Sub1.method497(1L);
			} else
				Class102_Sub1.method497(var0);
	}
}
