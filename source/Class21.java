public final class Class21 {
	int anInt208;
	int anInt209;
	int anInt210;
	int anInt211;
	int anInt212;
	int anInt213;
	public Class104_Sub18_Sub16 aClass104_Sub18_Sub16_214;
	int anInt215;
	int anInt216;
	int anInt217;
	int anInt219;
	int anInt221;
	static Class27 aClass27_222;
	static Class104_Sub18_Sub17_Sub3[] aClass104_Sub18_Sub17_Sub3Array223;
	public int anInt220 = 0;
	int anInt218 = 0;

	static final boolean method122(final char var0) {
		if (Character.isISOControl(var0))
			return false;
		else {
			final boolean var1 = ((var0 >= 48) && (var0 <= 57)) || ((var0 >= 65) && (var0 <= 90))
					|| ((var0 >= 97) && (var0 <= 122));
			if (var1)
				return true;
			else {
				char[] var2 = Class77.aCharArray621;

				int var3;
				char var4;
				for (var3 = 0; var3 < var2.length; ++var3) {
					var4 = var2[var3];
					if (var0 == var4)
						return true;
				}

				var2 = Class77.aCharArray622;

				for (var3 = 0; var3 < var2.length; ++var3) {
					var4 = var2[var3];
					if (var0 == var4)
						return true;
				}

				return false;
			}
		}
	}
}
