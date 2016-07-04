public class Class104_Sub7 extends Class104 {
	String aString947;
	String aString948;
	byte aByte949;
	int anInt950;
	static Class104_Sub18_Sub17_Sub2_Sub1 aClass104_Sub18_Sub17_Sub2_Sub1_951;

	public static boolean laoded(final int var0) {
		if (Class103.aBoolArray817[var0])
			return true;
		else if (!Widget.aClass61_1001.method278(var0))
			return false;
		else {
			final int var1 = Widget.aClass61_1001.method266(var0);
			if (var1 == 0) {
				Class103.aBoolArray817[var0] = true;
				return true;
			} else {
				if (Class22.widgets[var0] == null)
					Class22.widgets[var0] = new Widget[var1];

				for (int var2 = 0; var2 < var1; ++var2)
					if (null == Class22.widgets[var0][var2]) {
						final byte[] var3 = Widget.aClass61_1001.method259(var0, var2);
						if (null != var3) {
							Class22.widgets[var0][var2] = new Widget();
							Class22.widgets[var0][var2].anInt978 = var2 + (var0 << 16);
							if (var3[0] == -1)
								Class22.widgets[var0][var2].method528(new RSBuf(var3));
							else
								Class22.widgets[var0][var2].method527(new RSBuf(var3));
						}
					}

				Class103.aBoolArray817[var0] = true;
				return true;
			}
		}
	}

	public static void method509() {
		if (null != Class25.aClass25_248) {
			final Class25 var0 = Class25.aClass25_248;
			synchronized (var0) {
				Class25.aClass25_248 = null;
			}
		}

	}

	static final void method510(final boolean var0) {
		for (int var1 = 0; var1 < client.anInt1832; ++var1) {
			final Class104_Sub18_Sub16_Sub7_Sub2 var2 = client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[client.anIntArray1830[var1]];
			int var3 = 536870912 + (client.anIntArray1830[var1] << 14);
			if ((var2 != null) && var2.method936(1531790724) && (var2.aClass104_Sub18_Sub2_1788.aBool1247 == var0)
					&& var2.aClass104_Sub18_Sub2_1788.method679()) {
				final int var4 = var2.anInt1695 >> 7;
				final int var5 = var2.anInt1694 >> 7;
				if ((var4 >= 0) && (var4 < 104) && (var5 >= 0) && (var5 < 104)) {
					if ((var2.anInt1736 == 1) && ((var2.anInt1695 & 127) == 64) && ((var2.anInt1694 & 127) == 64)) {
						if (client.anIntArrayArray1891[var4][var5] == client.anInt1892)
							continue;

						client.anIntArrayArray1891[var4][var5] = client.anInt1892;
					}

					if (!var2.aClass104_Sub18_Sub2_1788.aBool1257)
						var3 -= Integer.MIN_VALUE;

					Class81.aClass17_643.method97(Class12.anInt73, var2.anInt1695, var2.anInt1694,
							Class47.method211(var2.anInt1695 + ((var2.anInt1736 * 64) - 64),
									((var2.anInt1736 * 64) - 64) + var2.anInt1694, Class12.anInt73),
							((var2.anInt1736 * 64) - 64) + 60, var2, var2.anInt1725, var3, var2.aBool1696);
				}
			}
		}

	}
}
