public class Class104_Sub23 extends Class104 {
	public static String homeDir;
	static Class104_Sub18_Sub17_Sub3[] aClass104_Sub18_Sub17_Sub3Array1182;
	static Class104_Sub18_Sub17_Sub1[] aClass104_Sub18_Sub17_Sub1Array1183;
	int anInt1180;
	int anInt1178;
	int[] anIntArray1179;
	int[][] anIntArrayArray1177;

	Class104_Sub23(final int var1, final byte[] var2) {
		anInt1180 = var1;
		final RSBuf var3 = new RSBuf(var2);
		anInt1178 = var3.readUByte();
		anIntArray1179 = new int[anInt1178];
		anIntArrayArray1177 = new int[anInt1178][];

		int var4;
		for (var4 = 0; var4 < anInt1178; ++var4)
			anIntArray1179[var4] = var3.readUByte();

		for (var4 = 0; var4 < anInt1178; ++var4)
			anIntArrayArray1177[var4] = new int[var3.readUByte()];

		for (var4 = 0; var4 < anInt1178; ++var4)
			for (int var5 = 0; var5 < anIntArrayArray1177[var4].length; ++var5)
				anIntArrayArray1177[var4][var5] = var3.readUByte();

	}

	static final void method620() {
		int var0 = 64 + (Class30.anInt287 * 128);
		int var1 = 64 + (Class43.anInt375 * 128);
		int var2 = Class47.method211(var0, var1, Class12.myplayerHeight) - Class61_Sub1.anInt892;
		if (Class85.anInt672 < var0) {
			Class85.anInt672 += CS.anInt944 + ((Class75.anInt598 * (var0 - Class85.anInt672)) / 1000);
			if (Class85.anInt672 > var0)
				Class85.anInt672 = var0;
		}

		if (Class85.anInt672 > var0) {
			Class85.anInt672 -= CS.anInt944 + ((Class75.anInt598 * (Class85.anInt672 - var0)) / 1000);
			if (Class85.anInt672 < var0)
				Class85.anInt672 = var0;
		}

		if (Class46.anInt403 < var2) {
			Class46.anInt403 += CS.anInt944 + (((var2 - Class46.anInt403) * Class75.anInt598) / 1000);
			if (Class46.anInt403 > var2)
				Class46.anInt403 = var2;
		}

		if (Class46.anInt403 > var2) {
			Class46.anInt403 -= ((Class75.anInt598 * (Class46.anInt403 - var2)) / 1000) + CS.anInt944;
			if (Class46.anInt403 < var2)
				Class46.anInt403 = var2;
		}

		if (Class99.anInt793 < var1) {
			Class99.anInt793 += CS.anInt944 + ((Class75.anInt598 * (var1 - Class99.anInt793)) / 1000);
			if (Class99.anInt793 > var1)
				Class99.anInt793 = var1;
		}

		if (Class99.anInt793 > var1) {
			Class99.anInt793 -= CS.anInt944 + ((Class75.anInt598 * (Class99.anInt793 - var1)) / 1000);
			if (Class99.anInt793 < var1)
				Class99.anInt793 = var1;
		}

		var0 = (Class85.anInt673 * 128) + 64;
		var1 = 64 + (Class41.anInt370 * 128);
		var2 = Class47.method211(var0, var1, Class12.myplayerHeight) - Class79.anInt631;
		final int var3 = var0 - Class85.anInt672;
		final int var4 = var2 - Class46.anInt403;
		final int var5 = var1 - Class99.anInt793;
		final int var6 = (int) Math.sqrt((var3 * var3) + (var5 * var5));
		int var7 = (int) (Math.atan2(var4, var6) * 325.949D) & 2047;
		final int var8 = (int) (Math.atan2(var3, var5) * -325.949D) & 2047;
		if (var7 < 128)
			var7 = 128;

		if (var7 > 383)
			var7 = 383;

		if (Class27.anInt266 < var7) {
			Class27.anInt266 += Class104_Sub1.anInt853 + ((Class103.anInt821 * (var7 - Class27.anInt266)) / 1000);
			if (Class27.anInt266 > var7)
				Class27.anInt266 = var7;
		}

		if (Class27.anInt266 > var7) {
			Class27.anInt266 -= Class104_Sub1.anInt853 + ((Class103.anInt821 * (Class27.anInt266 - var7)) / 1000);
			if (Class27.anInt266 < var7)
				Class27.anInt266 = var7;
		}

		int var9 = var8 - Class44.anInt395;
		if (var9 > 1024)
			var9 -= 2048;

		if (var9 < -1024)
			var9 += 2048;

		if (var9 > 0) {
			Class44.anInt395 += Class104_Sub1.anInt853 + ((var9 * Class103.anInt821) / 1000);
			Class44.anInt395 &= 2047;
		}

		if (var9 < 0) {
			Class44.anInt395 -= Class104_Sub1.anInt853 + ((-var9 * Class103.anInt821) / 1000);
			Class44.anInt395 &= 2047;
		}

		int var10 = var8 - Class44.anInt395;
		if (var10 > 1024)
			var10 -= 2048;

		if (var10 < -1024)
			var10 += 2048;

		if (((var10 < 0) && (var9 > 0)) || ((var10 > 0) && (var9 < 0)))
			Class44.anInt395 = var8;

	}

	static String method621(String var0, final Widget var1) {
		if (var0.indexOf("%") != -1) {
			int var2;
			for (var2 = 1; var2 <= 5; ++var2)
				while (true) {
					final int var3 = var0.indexOf("%" + var2);
					if (var3 == -1)
						break;

					var0 = var0.substring(0, var3) + Class67.method318(Class26.method133(var1, var2 - 1))
							+ var0.substring(var3 + 2);
				}

			while (true) {
				var2 = var0.indexOf("%dns");
				if (var2 == -1)
					break;

				String var4 = "";
				if (Class66.aClass8_548 != null) {
					var4 = Class104_Sub16.method554(Class66.aClass8_548.anInt47);
					if (null != Class66.aClass8_548.anObject50)
						var4 = (String) Class66.aClass8_548.anObject50;
				}

				var0 = var0.substring(0, var2) + var4 + var0.substring(var2 + 4);
			}
		}

		return var0;
	}

	public static Class104_Sub18_Sub11 method622(final int var0) {
		Class104_Sub18_Sub11 var1 = (Class104_Sub18_Sub11) Class104_Sub18_Sub11.aClass56_1413.method236(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class12.aClass61_76.decompress(16, var0);
			var1 = new Class104_Sub18_Sub11();
			if (var2 != null)
				var1.method767(new RSBuf(var2));

			Class104_Sub18_Sub11.aClass56_1413.method238(var1, var0);
			return var1;
		}
	}
}
