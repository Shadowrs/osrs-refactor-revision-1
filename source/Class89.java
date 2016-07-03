import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class89 {
	static int anInt702;
	static int anInt703;
	static int anInt704;
	static Class104_Sub12 aClass104_Sub12_705;

	public static void method406() {
		try {
			final File var0 = new File(Class104_Sub23.aString1181, "random.dat");
			int var2;
			if (var0.exists())
				Class24.aClass96_241 = new Class96(new Class94(var0, "rw", 25L), 24, 0);
			else
				label33: for (int var1 = 0; var1 < Class7.aStringArray40.length; ++var1)
					for (var2 = 0; var2 < Class49.aStringArray415.length; ++var2) {
						final File var3 = new File(Class49.aStringArray415[var2] + Class7.aStringArray40[var1]
								+ File.separatorChar + "random.dat");
						if (var3.exists()) {
							Class24.aClass96_241 = new Class96(new Class94(var3, "rw", 25L), 24, 0);
							break label33;
						}
					}

			if (Class24.aClass96_241 == null) {
				final RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				Class24.aClass96_241 = new Class96(new Class94(var0, "rw", 25L), 24, 0);
			}
		} catch (final IOException var5) {
			;
		}

	}
}
