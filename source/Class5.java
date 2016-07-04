public class Class5 {
	static int[] anIntArray22 = new int[500];
	static int[] anIntArray20 = new int[500];
	static int[] anIntArray21 = new int[500];
	static int[] anIntArray29 = new int[500];
	Class104_Sub23 aClass104_Sub23_23 = null;
	int anInt24 = -1;
	boolean aBool19 = false;
	int[] anIntArray25;
	int[] anIntArray26;
	int[] anIntArray27;
	int[] anIntArray28;

	Class5(final byte[] var1, final Class104_Sub23 var2) {
		aClass104_Sub23_23 = var2;
		final RSBuf var3 = new RSBuf(var1);
		final RSBuf var4 = new RSBuf(var1);
		var3.pos = 2;
		final int var5 = var3.method570();
		int var6 = -1;
		int var7 = 0;
		var4.pos = var3.pos + var5;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			final int var9 = var3.method570();
			if (var9 > 0) {
				if (aClass104_Sub23_23.anIntArray1179[var8] != 0)
					for (int var10 = var8 - 1; var10 > var6; --var10)
						if (aClass104_Sub23_23.anIntArray1179[var10] == 0) {
							anIntArray22[var7] = var10;
							anIntArray20[var7] = 0;
							anIntArray21[var7] = 0;
							anIntArray29[var7] = 0;
							++var7;
							break;
						}

				anIntArray22[var7] = var8;
				short var11 = 0;
				if (aClass104_Sub23_23.anIntArray1179[var8] == 3)
					var11 = 128;

				if ((var9 & 1) != 0)
					anIntArray20[var7] = var4.method578();
				else
					anIntArray20[var7] = var11;

				if ((var9 & 2) != 0)
					anIntArray21[var7] = var4.method578();
				else
					anIntArray21[var7] = var11;

				if ((var9 & 4) != 0)
					anIntArray29[var7] = var4.method578();
				else
					anIntArray29[var7] = var11;

				var6 = var8;
				++var7;
				if (aClass104_Sub23_23.anIntArray1179[var8] == 5)
					aBool19 = true;
			}
		}

		if (var4.pos != var1.length)
			throw new RuntimeException();
		else {
			anInt24 = var7;
			anIntArray25 = new int[var7];
			anIntArray26 = new int[var7];
			anIntArray27 = new int[var7];
			anIntArray28 = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				anIntArray25[var8] = anIntArray22[var8];
				anIntArray26[var8] = anIntArray20[var8];
				anIntArray27[var8] = anIntArray21[var8];
				anIntArray28[var8] = anIntArray29[var8];
			}

		}
	}
}
