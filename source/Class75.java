import java.io.File;
import java.io.RandomAccessFile;

public class Class75 {
	static int[] landscapeFileIds;
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

	static void transform(final Player pl, final int type, final int upd) {
		if ((pl.anInt1722 == type) && (type != -1)) {
			final int var3 = Class70.forId(type).anInt1275;
			if (var3 == 1) {
				pl.anInt1732 = 0;
				pl.anInt1724 = 0;
				pl.anInt1707 = upd;
				pl.anInt1726 = 0;
			}

			if (var3 == 2)
				pl.anInt1726 = 0;
		} else if ((type == -1) || (pl.anInt1722 == -1)
				|| (Class70.forId(type).anInt1269 >= Class70.forId(pl.anInt1722).anInt1269)) {
			pl.anInt1722 = type;
			pl.anInt1732 = 0;
			pl.anInt1724 = 0;
			pl.anInt1707 = upd;
			pl.anInt1726 = 0;
			pl.anInt1735 = pl.anInt1744;
		}

	}
}
