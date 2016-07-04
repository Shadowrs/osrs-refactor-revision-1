public class Class104_Sub18_Sub8 extends Class104_Sub18 {
	public static Class61 aClass61_1389;
	public int anInt1388;
	public int anInt1386;
	public int anInt1390;
	public static Class56 aClass56_1387 = new Class56(64);

	void method757(final RSBuf var1) {
		while (true) {
			final int var2 = var1.readUByte();
			if (var2 == 0)
				return;

			method758(var1, var2);
		}
	}

	void method758(final RSBuf var1, final int var2) {
		if (var2 == 1) {
			anInt1388 = var1.readLEShort();
			anInt1386 = var1.readUByte();
			anInt1390 = var1.readUByte();
		}

	}
}
