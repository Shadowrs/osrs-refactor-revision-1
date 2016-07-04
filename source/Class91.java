import java.awt.Component;

public class Class91 {
	public static void method409() {
		try {
			Class24.maindata.method432(-883153307);

			for (int var0 = 0; var0 < Class24.anInt238; ++var0)
				Class22.aClass96Array227[var0].method432(-883153307);

			Class24.idx255.method432(-883153307);
			Class24.aClass96_241.method432(-883153307);
		} catch (final Exception var2) {
			;
		}

	}

	public static int method410(final byte[] var0, final int var1, final CharSequence var2) {
		final int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			final char var6 = var2.charAt(var5);
			if (var6 <= 127)
				var0[var4++] = (byte) var6;
			else if (var6 <= 2047) {
				var0[var4++] = (byte) (192 | (var6 >> 6));
				var0[var4++] = (byte) (128 | (var6 & 63));
			} else {
				var0[var4++] = (byte) (224 | (var6 >> 12));
				var0[var4++] = (byte) (128 | ((var6 >> 6) & 63));
				var0[var4++] = (byte) (128 | (var6 & 63));
			}
		}

		return var4 - var1;
	}

	public static void method411(final Component var0) {
		var0.removeKeyListener(Class25.aClass25_248);
		var0.removeFocusListener(Class25.aClass25_248);
		Class25.anInt245 = -1;
	}

	static final int method412(final int var0, final int var1) {
		final int var2 = Class104_Sub11.method526(var0 - 1, var1 - 1) + Class104_Sub11.method526(1 + var0, var1 - 1)
				+ Class104_Sub11.method526(var0 - 1, var1 + 1) + Class104_Sub11.method526(var0 + 1, var1 + 1);
		final int var3 = Class104_Sub11.method526(var0 - 1, var1) + Class104_Sub11.method526(var0 + 1, var1)
				+ Class104_Sub11.method526(var0, var1 - 1) + Class104_Sub11.method526(var0, 1 + var1);
		final int var4 = Class104_Sub11.method526(var0, var1);
		return (var4 / 4) + (var3 / 8) + (var2 / 16);
	}
}
