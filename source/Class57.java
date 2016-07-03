import java.awt.Canvas;

public class Class57 {
	String aString459;
	int anInt460;
	int anInt461;
	int anInt462;
	int anInt463;
	boolean aBool464;
	public static short[] aShortArray465;
	static String aString466;
	static Class13 aClass13_467;
	public static Canvas aCanvas468;

	static final byte[] method240(final byte[] var0) {
		final RSBuf var1 = new RSBuf(var0);
		final int var2 = var1.method570();
		final int var3 = var1.method574();
		if ((var3 >= 0) && ((Class61.anInt490 == 0) || (var3 <= Class61.anInt490))) {
			if (var2 == 0) {
				final byte[] var4 = new byte[var3];
				var1.method577(var4, 0, var3);
				return var4;
			} else {
				final int var5 = var1.method574();
				if ((var5 < 0) || ((Class61.anInt490 != 0) && (var5 > Class61.anInt490)))
					throw new RuntimeException();
				else {
					final byte[] var6 = new byte[var5];
					if (var2 == 1)
						Class45.method195(var6, var5, var0, var3, 9);
					else
						Class61.aClass31_491.method146(var1, var6);

					return var6;
				}
			}
		} else
			throw new RuntimeException();
	}
}
