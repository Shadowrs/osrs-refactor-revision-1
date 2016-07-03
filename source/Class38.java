public class Class38 {
	static int anInt358;
	public static boolean[] aBoolArray357 = new boolean[] { true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
	public static int[] anIntArray356 = new int[99];

	static {
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			final int var2 = var1 + 1;
			final int var3 = (int) (var2 + (300.0D * Math.pow(2.0D, var2 / 7.0D)));
			var0 += var3;
			anIntArray356[var1] = var0 / 4;
		}

	}

	public static Class41[] method178() {
		return new Class41[] { Class41.aClass41_362, Class41.aClass41_361, Class41.aClass41_365, Class41.aClass41_366,
				Class41.aClass41_364, Class41.aClass41_363 };
	}
}
