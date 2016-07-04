import java.io.File;
import java.io.RandomAccessFile;

public class Class75 {
	static int[] landscapeInfo;
	static int anInt598;

	public static File method341(final String var0) {
		if (!Class22.aBool225)
			throw new RuntimeException("");
		else {
			final File var1 = (File) Class22.aHashtable226.get(var0);
			if (var1 != null)
				return var1;
			else {
				final File var2 = new File(Class22.aFile224, var0);
				RandomAccessFile var3 = null;

				try {
					final File var4 = new File(var2.getParent());
					if (!var4.exists())
						throw new RuntimeException("");
					else {
						var3 = new RandomAccessFile(var2, "rw");
						final int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						Class22.aHashtable226.put(var0, var2);
						return var2;
					}
				} catch (final Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (final Exception var7) {
						;
					}

					throw new RuntimeException();
				}
			}
		}
	}

	static void method342(final Class104_Sub18_Sub16_Sub7_Sub1 var0, final int var1, final int var2) {
		if ((var0.anInt1722 == var1) && (var1 != -1)) {
			final int var3 = Class70.method327(var1).anInt1275;
			if (var3 == 1) {
				var0.anInt1732 = 0;
				var0.anInt1724 = 0;
				var0.anInt1707 = var2;
				var0.anInt1726 = 0;
			}

			if (var3 == 2)
				var0.anInt1726 = 0;
		} else if ((var1 == -1) || (var0.anInt1722 == -1)
				|| (Class70.method327(var1).anInt1269 >= Class70.method327(var0.anInt1722).anInt1269)) {
			var0.anInt1722 = var1;
			var0.anInt1732 = 0;
			var0.anInt1724 = 0;
			var0.anInt1707 = var2;
			var0.anInt1726 = 0;
			var0.anInt1735 = var0.anInt1744;
		}

	}
}
