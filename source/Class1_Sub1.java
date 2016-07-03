public class Class1_Sub1 extends Class1 {
	static Class61 aClass61_837;
	long[] aLongArray834 = new long[10];
	int anInt832 = 256;
	int anInt833 = 1;
	int anInt835 = 0;
	long aLong836 = Class71.method332();
	int anInt831;

	Class1_Sub1() {
		for (int var1 = 0; var1 < 10; ++var1)
			aLongArray834[var1] = aLong836;

	}

	@Override
	int method12(final int var1, final int var2, final byte var3) {
		final int var4 = anInt832;
		final int var5 = anInt833;
		anInt832 = 300;
		anInt833 = 1;
		aLong836 = Class71.method332();
		if (aLongArray834[anInt831] == 0L) {
			anInt832 = var4;
			anInt833 = var5;
		} else if (aLong836 > aLongArray834[anInt831])
			anInt832 = (int) (var1 * 2560 / (aLong836 - aLongArray834[anInt831]));

		if (anInt832 < 25)
			anInt832 = 25;

		if (anInt832 > 256) {
			anInt832 = 256;
			anInt833 = (int) (var1 - ((aLong836 - aLongArray834[anInt831]) / 10L));
		}

		if (anInt833 > var1)
			anInt833 = var1;

		aLongArray834[anInt831] = aLong836;
		anInt831 = (anInt831 + 1) % 10;
		int var6;
		if (anInt833 > 1)
			for (var6 = 0; var6 < 10; ++var6)
				if (aLongArray834[var6] != 0L)
					aLongArray834[var6] += anInt833;

		if (anInt833 < var2)
			anInt833 = var2;

		Class69.method323(anInt833);

		for (var6 = 0; anInt835 < 256; anInt835 += anInt832)
			++var6;

		anInt835 &= 255;
		return var6;
	}

	@Override
	void method13(final int var1) {
		for (int var2 = 0; var2 < 10; ++var2)
			aLongArray834[var2] = 0L;

	}

	static final void method475(final Class104_Sub3 var0) {
		int var1 = 0;
		int var2 = -1;
		int var3 = 0;
		int var4 = 0;
		if (var0.anInt868 == 0)
			var1 = Class81.aClass17_643.method85(var0.anInt876, var0.anInt871, var0.anInt870);

		if (var0.anInt868 == 1)
			var1 = Class81.aClass17_643.method86(var0.anInt876, var0.anInt871, var0.anInt870);

		if (var0.anInt868 == 2)
			var1 = Class81.aClass17_643.method87(var0.anInt876, var0.anInt871, var0.anInt870);

		if (var0.anInt868 == 3)
			var1 = Class81.aClass17_643.method88(var0.anInt876, var0.anInt871, var0.anInt870);

		if (var1 != 0) {
			final int var5 = Class81.aClass17_643.method89(var0.anInt876, var0.anInt871, var0.anInt870, var1);
			var2 = (var1 >> 14) & 32767;
			var3 = var5 & 31;
			var4 = (var5 >> 6) & 3;
		}

		var0.anInt867 = var2;
		var0.anInt873 = var3;
		var0.anInt872 = var4;
	}
}
