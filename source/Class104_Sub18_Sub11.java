public class Class104_Sub18_Sub11 extends Class104_Sub18 {
	static Class56 aClass56_1413 = new Class56(64);
	public int anInt1412 = 0;

	void method767(final RSBuf var1) {
		while (true) {
			final int var2 = var1.readUByte();
			if (var2 == 0)
				return;

			method768(var1, var2);
		}
	}

	void method768(final RSBuf var1, final int var2) {
		if (var2 == 5)
			anInt1412 = var1.readLEShort();

	}

	public static void method769() {
		Class104_Sub18_Sub1.aClass56_1188.method239();
	}

	static final void method770(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7) {
		if (Class104_Sub7.loaded(var0)) {
			Class106.aClass104_Sub12Array828 = null;
			Class66.method300(Class22.widgets[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (null != Class106.aClass104_Sub12Array828) {
				Class66.method300(Class106.aClass104_Sub12Array828, -1412584499, var1, var2, var3, var4,
						Class78.anInt629, client.anInt1969, var7);
				Class106.aClass104_Sub12Array828 = null;
			}

		} else if (var7 != -1)
			client.rsfacesFlag[var7] = true;
		else
			for (int var8 = 0; var8 < 100; ++var8)
				client.rsfacesFlag[var8] = true;
	}
}
