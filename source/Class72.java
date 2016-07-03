import java.io.File;

public class Class72 implements Runnable {
	static Class61 aClass61_584;
	int anInt581 = 0;
	boolean aBool579 = true;
	Object anObject583 = new Object();
	int[] anIntArray582 = new int[500];
	int[] anIntArray580 = new int[500];

	@Override
	public void run() {
		for (; aBool579; Class69.method323(50L)) {
			final Object var1 = anObject583;
			synchronized (var1) {
				if (anInt581 < 500) {
					anIntArray582[anInt581] = Class14.anInt91;
					anIntArray580[anInt581] = Class14.anInt95;
					++anInt581;
				}
			}
		}

	}

	public static void method333(final File var0) {
		Class22.aFile224 = var0;
		if (!Class22.aFile224.exists())
			throw new RuntimeException("");
		else
			Class22.aBool225 = true;
	}

	public static boolean method334(final CharSequence var0) {
		boolean var1 = false;
		boolean var2 = false;
		int var3 = 0;
		final int var4 = var0.length();
		int var5 = 0;

		boolean var7;
		while (true) {
			if (var5 >= var4) {
				var7 = var2;
				break;
			}

			label72: {
				final char var6 = var0.charAt(var5);
				if (var5 == 0) {
					if (var6 == 45) {
						var1 = true;
						break label72;
					}

					if (var6 == 43)
						break label72;
				}

				int var9;
				if ((var6 >= 48) && (var6 <= 57))
					var9 = var6 - 48;
				else if ((var6 >= 65) && (var6 <= 90))
					var9 = var6 - 55;
				else {
					if ((var6 < 97) || (var6 > 122)) {
						var7 = false;
						break;
					}

					var9 = var6 - 87;
				}

				if (var9 >= 10) {
					var7 = false;
					break;
				}

				if (var1)
					var9 = -var9;

				final int var8 = (10 * var3) + var9;
				if (var3 != (var8 / 10)) {
					var7 = false;
					break;
				}

				var3 = var8;
				var2 = true;
			}

			++var5;
		}

		return var7;
	}

	static String method335(final int var0) {
		return "<img=" + var0 + ">";
	}
}
