import java.awt.Font;

public class Class50 {
	protected static Font aFont420;
	static int anInt421;
	static int anInt422;
	public static char aChar423;
	static char[] aCharArray419 = new char[] { '\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020',
			'\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000',
			'\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
			'\u203a', '\u0153', '\u0000', '\u017e', '\u0178' };

	public static String method224(final RSBuf var0) {
		String var4;
		try {
			int var1 = var0.readsmart();
			if (var1 > 32767)
				var1 = 32767;

			final byte[] var2 = new byte[var1];
			var0.pos += Class106.aClass49_826.method218(var0.backing, var0.pos, var2, 0, var1);
			final String var3 = ObjectDefinition.method751(var2, 0, var1);
			var4 = var3;
		} catch (final Exception var6) {
			var4 = "Cabbage";
		}

		return var4;
	}
}
