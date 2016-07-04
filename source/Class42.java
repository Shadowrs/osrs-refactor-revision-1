public class Class42 {
	static int[] anIntArray371;
	static Class104_Sub18_Sub17_Sub1[] aClass104_Sub18_Sub17_Sub1Array372;
	static int[] anIntArray373;

	static CS2 getCS(final int var0) {
		CS2 var1 = (CS2) CS2.aClass56_1278.method236(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class85.aClass61_Sub1_671.method259(var0, 0);
			if (null == var2)
				return null;
			else {
				var1 = new CS2();
				final RSBuf var3 = new RSBuf(var2);
				var3.pos = var3.backing.length - 12;
				final int var4 = var3.readLEInt();
				var1.anInt1279 = var3.readLEShort();
				var1.anInt1281 = var3.readLEShort();
				var1.anInt1282 = var3.readLEShort();
				var1.anInt1283 = var3.readLEShort();
				var3.pos = 0;
				var3.method604();
				var1.opcodeHeaders = new int[var4];
				var1.numberValuesToUse = new int[var4];
				var1.aStringArray1280 = new String[var4];

				int var6;
				for (int var5 = 0; var3.pos < (var3.backing.length
						- 12); var1.opcodeHeaders[var5++] = var6) {
					var6 = var3.readLEShort();
					if (var6 == 3)
						var1.aStringArray1280[var5] = var3.method608();
					else if ((var6 < 100) && (var6 != 21) && (var6 != 38) && (var6 != 39))
						var1.numberValuesToUse[var5] = var3.readLEInt();
					else
						var1.numberValuesToUse[var5] = var3.readUByte();
				}

				CS2.aClass56_1278.method238(var1, var0);
				return var1;
			}
		}
	}
}
