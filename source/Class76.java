import java.io.IOException;

public final class Class76 {
	static byte[][][] aByteArrayArrayArray602;
	static byte[][][] aByteArrayArrayArray603;
	static byte[][][] aByteArrayArrayArray604;
	static byte[][][] aByteArrayArrayArray605;
	static int[] anIntArray607;
	static byte[][][] aByteArrayArrayArray609;
	static int[] anIntArray615;
	static Class70 aClass70_617;
	static Class8 aClass8_618;
	static Widget aClass104_Sub12_619;
	static Class99 aClass99_620;
	static int[][][] anIntArrayArrayArray611 = new int[4][105][105];
	static byte[][][] aByteArrayArrayArray600 = new byte[4][104][104];
	static int anInt601 = 99;
	static int[] anIntArray606 = new int[] { 1, 2, 4, 8 };
	static int[] anIntArray610 = new int[] { 16, 32, 64, 128 };
	static int[] anIntArray608 = new int[] { 1, 0, -1, 0 };
	static int[] anIntArray612 = new int[] { 0, -1, 0, 1 };
	static int[] anIntArray613 = new int[] { 1, -1, -1, 1 };
	static int[] anIntArray614 = new int[] { -1, -1, 1, 1 };
	static int anInt599 = (int) (Math.random() * 17.0D) - 8;
	static int anInt616 = (int) (Math.random() * 33.0D) - 16;

	public static void method343(final RSBuf var0) {
		final byte[] var1 = new byte[24];

		try {
			Class24.aClass96_241.method428(0L);
			Class24.aClass96_241.method430(var1);

			int var2;
			for (var2 = 0; (var2 < 24) && (var1[var2] == 0); ++var2)
				;

			if (var2 >= 24)
				throw new IOException();
		} catch (final Exception var5) {
			for (int var4 = 0; var4 < 24; ++var4)
				var1[var4] = -1;
		}

		var0.appendBytes(var1, 0, 24);
	}

	static final void method344() {
		for (int var0 = 0; var0 < client.anInt1832; ++var0) {
			final int var1 = client.anIntArray1830[var0];
			final Class104_Sub18_Sub16_Sub7_Sub2 var2 = client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var1];
			if (var2 != null) {
				Class30.method144(var2);
			}
		}

	}

	static Class104_Sub11 method345(final Class61 var0, final int var1) {
		final byte[] var2 = var0.method277(var1);
		return var2 == null ? null : new Class104_Sub11(var2);
	}
}
