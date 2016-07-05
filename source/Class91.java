import java.awt.Component;

public class Class91 {
	public static void method409() {
		try {
			Class24.maindata.method432(-883153307);

			for (int var0 = 0; var0 < Class24.idxCount; ++var0)
				Class22.managers[var0].method432(-883153307);

			Class24.idx255.method432(-883153307);
			Class24.aClass96_241.method432(-883153307);
		} catch (final Exception var2) {
			;
		}

	}

	public static int writeCompactStrBytes(final byte[] src, final int start, final CharSequence seq) {
		final int len = seq.length();
		int caret = start;

		for (int i = 0; i < len; ++i) {
			final char c = seq.charAt(i);
			if (c <= 127)
				src[caret++] = (byte) c;
			else if (c <= 2047) {
				src[caret++] = (byte) (192 | (c >> 6));
				src[caret++] = (byte) (128 | (c & 63));
			} else {
				src[caret++] = (byte) (224 | (c >> 12));
				src[caret++] = (byte) (128 | ((c >> 6) & 63));
				src[caret++] = (byte) (128 | (c & 63));
			}
		}

		return caret - start;
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
