import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class89 {
	static int anInt702;
	static int anInt703;
	static int anInt704;
	static Widget aClass104_Sub12_705;

	public static void createRandomDat() {
		try {
			final File var0 = new File(Class104_Sub23.homeDir, "random.dat");
			int x;
			if (var0.exists())
				Class24.aClass96_241 = new FSManager(new JagFS(var0, "rw", 25L), 24, 0);
			else
				label33: for (int var1 = 0; var1 < Class7.store.length; ++var1)
					for (x = 0; x < Class49.rootDirectory.length; ++x) {
						final File var3 = new File(Class49.rootDirectory[x] + Class7.store[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							Class24.aClass96_241 = new FSManager(new JagFS(var3, "rw", 25L), 24, 0);
							break label33;
						}
					}

			if (Class24.aClass96_241 == null) {
				final RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				x = var4.read();
				var4.seek(0L);
				var4.write(x);
				var4.seek(0L);
				var4.close();
				Class24.aClass96_241 = new FSManager(new JagFS(var0, "rw", 25L), 24, 0);
			}
		} catch (final IOException var5) {
			;
		}

	}
}
