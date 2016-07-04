public class Class106 {
	public static Class49 aClass49_826;
	static Class61_Sub1 aClass61_Sub1_827;
	static Widget[] aClass104_Sub12Array828;
	static Class61 aClass61_829;

	static final void method474(final RSBuf var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6) {
		int var7;
		if ((var2 >= 0) && (var2 < 104) && (var3 >= 0) && (var3 < 104)) {
			Class76.aByteArrayArrayArray600[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readUByte();
				if (var7 == 0) {
					if (var1 == 0)
						Class76.anIntArrayArrayArray611[0][var2][var3] = -Class104_Sub18_Sub7
								.method756(var4 + 932731 + var2, var5 + 556238 + var3) * 8;
					else
						Class76.anIntArrayArrayArray611[var1][var2][var3] = Class76.anIntArrayArrayArray611[var1
								- 1][var2][var3] - 240;
					break;
				}

				if (var7 == 1) {
					int var8 = var0.readUByte();
					if (var8 == 1)
						var8 = 0;

					if (var1 == 0)
						Class76.anIntArrayArrayArray611[0][var2][var3] = 8 * -var8;
					else
						Class76.anIntArrayArrayArray611[var1][var2][var3] = Class76.anIntArrayArrayArray611[var1
								- 1][var2][var3] - (var8 * 8);
					break;
				}

				if (var7 <= 49) {
					Class76.aByteArrayArrayArray602[var1][var2][var3] = var0.method565();
					Class76.aByteArrayArrayArray609[var1][var2][var3] = (byte) ((var7 - 2) / 4);
					Class76.aByteArrayArrayArray604[var1][var2][var3] = (byte) (((var7 - 2) + var6) & 3);
				} else if (var7 <= 81)
					Class76.aByteArrayArrayArray600[var1][var2][var3] = (byte) (var7 - 49);
				else
					Class76.aByteArrayArrayArray603[var1][var2][var3] = (byte) (var7 - 81);
			}
		} else
			while (true) {
				var7 = var0.readUByte();
				if (var7 == 0)
					break;

				if (var7 == 1) {
					var0.readUByte();
					break;
				}

				if (var7 <= 49)
					var0.readUByte();
			}

	}
}
