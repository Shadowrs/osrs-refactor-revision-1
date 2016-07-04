public final class Class39 {
	public static String method179(final int var0, final boolean var1) {
		if (var0 < 0)
			return Integer.toString(var0);
		else {
			int var2 = var0;
			String var3;
			if (var0 < 0)
				var3 = Integer.toString(var0, 10);
			else {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4)
					var5 /= 10;

				final char[] var6 = new char[var4];
				var6[0] = 43;

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					final int var8 = var2;
					var2 /= 10;
					final int var9 = var8 - (var2 * 10);
					if (var9 >= 10)
						var6[var7] = (char) (var9 + 87);
					else
						var6[var7] = (char) (48 + var9);
				}

				var3 = new String(var6);
			}

			return var3;
		}
	}

	public static boolean method180(final int var0) {
		return ((var0 >> 28) & 1) != 0;
	}

	public static boolean method181(final Class61 var0, final int var1, final int var2) {
		final byte[] var3 = var0.decompress(var1, var2);
		if (null == var3)
			return false;
		else {
			Class53.method234(var3);
			return true;
		}
	}
}
