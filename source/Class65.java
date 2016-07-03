public final class Class65 {
	static Class61_Sub1 aClass61_Sub1_515;
	static char[] aCharArray514 = new char[] { '\u005f', '\u0061', '\u0062', '\u0063', '\u0064', '\u0065', '\u0066',
			'\u0067', '\u0068', '\u0069', '\u006a', '\u006b', '\u006c', '\u006d', '\u006e', '\u006f', '\u0070',
			'\u0071', '\u0072', '\u0073', '\u0074', '\u0075', '\u0076', '\u0077', '\u0078', '\u0079', '\u007a',
			'\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035', '\u0036', '\u0037', '\u0038', '\u0039' };

	public static long method297(final CharSequence var0) {
		long var1 = 0L;
		final int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			final char var5 = var0.charAt(var4);
			if ((var5 >= 65) && (var5 <= 90))
				var1 += (1 + var5) - 65;
			else if ((var5 >= 97) && (var5 <= 122))
				var1 += (1 + var5) - 97;
			else if ((var5 >= 48) && (var5 <= 57))
				var1 += (var5 + 27) - 48;

			if (var1 >= 177917621779460413L)
				break;
		}

		while (((var1 % 37L) == 0L) && (var1 != 0L))
			var1 /= 37L;

		return var1;
	}

	public static Class104_Sub18_Sub7 method298(final int var0) {
		Class104_Sub18_Sub7 var1 = (Class104_Sub18_Sub7) Class104_Sub18_Sub7.aClass56_1381.method236(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class49.aClass61_418.method259(4, var0);
			var1 = new Class104_Sub18_Sub7();
			if (null != var2)
				var1.method755(new RSBuf(var2), var0);

			var1.method752();
			Class104_Sub18_Sub7.aClass56_1381.method238(var1, var0);
			return var1;
		}
	}
}
