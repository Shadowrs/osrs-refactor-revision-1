import java.awt.Component;
import java.net.URL;

public abstract class Class3 {
	static Class104_Sub18_Sub17_Sub1 aClass104_Sub18_Sub17_Sub1_10;

	public abstract void method23(Component var1, int var2);

	public abstract void method24(Component var1, byte var2);

	public abstract int method25(int var1);

	static void method26() {
		try {
			if (Class76.aClass70_617 == null)
				Class76.aClass70_617 = new Class70(Applet_Sub1.aClass11_1760, new URL(Class30.aString285));
			else {
				final byte[] var0 = Class76.aClass70_617.method324();
				if (null != var0) {
					final RSBuf var1 = new RSBuf(var0);
					Class66.anInt542 = var1.readLEShort();
					FSManager.aClass57Array758 = new Class57[Class66.anInt542];

					Class57 var3;
					for (int var2 = 0; var2 < Class66.anInt542; var3.anInt461 = var2++) {
						var3 = FSManager.aClass57Array758[var2] = new Class57();
						final int var4 = var1.readLEShort();
						var3.anInt463 = var4 & 32767;
						var3.aBool464 = (var4 & '\u8000') != 0;
						var3.aString459 = var1.method608();
						var3.anInt462 = var1.readUByte();
						var3.anInt460 = var1.method572();
					}

					Class33.method159(FSManager.aClass57Array758, 0, FSManager.aClass57Array758.length - 1,
							Class66.anIntArray519, Class66.anIntArray545);
					Class66.aBool541 = true;
					Class76.aClass70_617 = null;
				}
			}
		} catch (final Exception var5) {
			var5.printStackTrace();
			Class76.aClass70_617 = null;
		}

	}
}
