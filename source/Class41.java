public class Class41 implements Interface3 {
	static byte[][] aByteArrayArray368;
	static int[][][] anIntArrayArrayArray369;
	static int anInt370;
	int anInt367;
	static Class41 aClass41_365 = new Class41("runescape", "RuneScape", 0);
	static Class41 aClass41_361 = new Class41("stellardawn", "Stellar Dawn", 1);
	static Class41 aClass41_363 = new Class41("game3", "Game 3", 2);
	static Class41 aClass41_364 = new Class41("game4", "Game 4", 3);
	static Class41 aClass41_362 = new Class41("game5", "Game 5", 4);
	public static Class41 aClass41_366 = new Class41("oldscape", "RuneScape 2007", 5);

	Class41(final String var1, final String var2, final int var3) {
		anInt367 = var3;
	}

	@Override
	public int method5(final byte var1) {
		return anInt367;
	}

	public static int method183(final Class104_Sub21 var0, final String var1) {
		final int var2 = var0.anInt1172;
		final byte[] var3 = Class67.method316(var1);
		var0.method568(var3.length);
		var0.anInt1172 += Class106.aClass49_826.method219(var3, 0, var3.length, var0.aByteArray1174, var0.anInt1172);
		return var0.anInt1172 - var2;
	}
}
