import java.awt.Font;

public class Class50 {
	protected static Font aFont420;
	static int anInt421;
	static int anInt422;
	public static char aChar423;
	static char[] characters = new char[] { '\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020',
			'\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000',
			'\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
			'\u203a', '\u0153', '\u0000', '\u017e', '\u0178' };

	public static String huffmanDecode(final RSBuf buf) {
		String r;
		try {
			int size = buf.readsmart();
			if (size > 32767)
				size = 32767;

			final byte[] to = new byte[size];
			buf.pos += Class106.huffman.decihper(buf.backing, buf.pos, to, 0, size);
			final String result = client.decodeStr(to, 0, size);
			r = result;
		} catch (final Exception var6) {
			r = "Cabbage";
		}

		return r;
	}
}
