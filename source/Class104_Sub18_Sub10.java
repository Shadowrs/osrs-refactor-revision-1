public class Class104_Sub18_Sub10 extends Class104_Sub18 {
	public static Class61 aClass61_1403;
	public String aString1409 = "null";
	public int anInt1408 = 0;
	static Class56 aClass56_1406 = new Class56(64);
	public int anInt1404;
	public char aChar1405;
	public int anInt1407;
	public int[] anIntArray1402;
	public String[] aStringArray1411;
	public int[] anIntArray1410;

	void method765(final RSBuf var1) {
		while (true) {
			final int var2 = var1.readUByte();
			if (var2 == 0)
				return;

			method766(var1, var2);
		}
	}

	void method766(final RSBuf var1, final int var2) {
		if (var2 == 1)
			anInt1404 = var1.readUByte();
		else if (var2 == 2)
			aChar1405 = (char) var1.readUByte();
		else if (var2 == 3)
			aString1409 = var1.readString();
		else if (var2 == 4)
			anInt1407 = var1.readLEInt();
		else {
			int var3;
			if (var2 == 5) {
				anInt1408 = var1.readLEShort();
				anIntArray1402 = new int[anInt1408];
				aStringArray1411 = new String[anInt1408];

				for (var3 = 0; var3 < anInt1408; ++var3) {
					anIntArray1402[var3] = var1.readLEInt();
					aStringArray1411[var3] = var1.readString();
				}
			} else if (var2 == 6) {
				anInt1408 = var1.readLEShort();
				anIntArray1402 = new int[anInt1408];
				anIntArray1410 = new int[anInt1408];

				for (var3 = 0; var3 < anInt1408; ++var3) {
					anIntArray1402[var3] = var1.readLEInt();
					anIntArray1410[var3] = var1.readLEInt();
				}
			}
		}

	}
}
