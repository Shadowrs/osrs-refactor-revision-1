import java.util.HashMap;

public class Class36 {
	static int anInt349;

	static {
		new HashMap();
	}

	public static boolean method168(final char var0) {
		if (((var0 <= 0) || (var0 >= 128)) && ((var0 < 160) || (var0 > 255))) {
			if (var0 != 0) {
				final char[] var1 = Class50.characters;

				for (final char var3 : var1) {
					if (var3 == var0)
						return true;
				}
			}

			return false;
		} else
			return true;
	}

	public static String method169(long var0) {
		if ((var0 > 0L) && (var0 < 6582952005840035281L)) {
			if (0L == (var0 % 37L))
				return null;
			else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L)
					++var2;

				final StringBuilder var5 = new StringBuilder(var2);

				while (var0 != 0L) {
					final long var6 = var0;
					var0 /= 37L;
					var5.append(Class65.aCharArray514[(int) (var6 - (var0 * 37L))]);
				}

				return var5.reverse().toString();
			}
		} else
			return null;
	}

	static final void method170() {
		int var0 = Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.method883("Choose Option");

		int var1;
		int var2;
		for (var1 = 0; var1 < client.anInt1805; ++var1) {
			var2 = Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.method883(Class79.method349(var1));
			if (var2 > var0)
				var0 = var2;
		}

		var0 += 8;
		var1 = 21 + (client.anInt1805 * 15);
		var2 = Class14.anInt101 - (var0 / 2);
		if ((var0 + var2) > 765)
			var2 = 765 - var0;

		if (var2 < 0)
			var2 = 0;

		int var3 = Class14.anInt102;
		if ((var3 + var1) > 503)
			var3 = 503 - var1;

		if (var3 < 0)
			var3 = 0;

		client.aBool1930 = true;
		Class50.anInt422 = var2;
		anInt349 = var3;
		Class12.anInt74 = var0;
		Class78.anInt627 = 22 + (client.anInt1805 * 15);
	}

	static final void method171() {
		Class28.aClass1_267.method13(1131286551);

		int var0;
		for (var0 = 0; var0 < 32; ++var0)
			Applet_Sub1.aLongArray1753[var0] = 0L;

		for (var0 = 0; var0 < 32; ++var0)
			Applet_Sub1.aLongArray1761[var0] = 0L;

		Applet_Sub1.anInt1756 = 0;
	}

	static void method172() {
		Class76.aByteArrayArrayArray603 = null;
		Class76.aByteArrayArrayArray602 = null;
		Class76.aByteArrayArrayArray609 = null;
		Class76.aByteArrayArrayArray604 = null;
		Class41.anIntArrayArrayArray369 = null;
		Class76.aByteArrayArrayArray605 = null;
		Class7.anIntArrayArray41 = null;
		Class23.anIntArray237 = null;
		Class101.anIntArray811 = null;
		Class76.anIntArray615 = null;
		Class2_Sub2.anIntArray866 = null;
		Class76.anIntArray607 = null;
	}

	static final boolean method173(final int var0, int var1) {
		final ObjectDefinition var2 = ItemDef.forId(var0);
		if (var1 == 11)
			var1 = 10;

		if ((var1 >= 5) && (var1 <= 8))
			var1 = 4;

		return var2.method742(var1);
	}
}
