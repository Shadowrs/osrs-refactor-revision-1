public final class Class104_Sub20 extends Class104 {
	Class9 aClass9_1152;
	boolean aBool1153;
	Class20 aClass20_1154;
	Class33 aClass33_1155;
	Class18 aClass18_1156;
	Class23 aClass23_1157;
	int anInt1159;
	Class6 aClass6_1160;
	int anInt1162;
	int anInt1163;
	boolean aBool1164;
	boolean aBool1165;
	int anInt1166;
	int anInt1168;
	int anInt1169;
	Class104_Sub20 aClass104_Sub20_1170;
	static Class61_Sub1 aClass61_Sub1_1171;
	Class21[] aClass21Array1151 = new Class21[5];
	int[] anIntArray1167 = new int[5];
	int anInt1161 = 0;
	int anInt1158;
	int anInt1148;
	int anInt1149;
	int anInt1150;

	Class104_Sub20(final int var1, final int var2, final int var3) {
		anInt1148 = anInt1158 = var1;
		anInt1149 = var2;
		anInt1150 = var3;
	}

	static final boolean method559(final Widget var0) {
		final int var1 = var0.anInt982;
		if (var1 == 205) {
			client.anInt1836 = 250;
			return true;
		} else {
			int var2;
			int var3;
			if ((var1 >= 300) && (var1 <= 313)) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				client.aClass85_2047.method384(var2, var3 == 1);
			}

			if ((var1 >= 314) && (var1 <= 323)) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				client.aClass85_2047.method385(var2, var3 == 1);
			}

			if (var1 == 324)
				client.aClass85_2047.method386(false);

			if (var1 == 325)
				client.aClass85_2047.method386(true);

			if (var1 == 326) {
				client.secureBuf.putOpcode(71);
				client.aClass85_2047.writeAppearance(client.secureBuf);
				return true;
			} else
				return false;
		}
	}

	public static int method560(final CharSequence var0) {
		final int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			final char var4 = var0.charAt(var3);
			if (var4 <= 127)
				++var2;
			else if (var4 <= 2047)
				var2 += 2;
			else
				var2 += 3;
		}

		return var2;
	}
}
