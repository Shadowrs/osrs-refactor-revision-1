public class Class82 {
	int anInt646;
	int anInt647;
	Class92[] aClass92Array645 = new Class92[10];

	public Class104_Sub4_Sub1 method356() {
		final byte[] var1 = method358();
		return new Class104_Sub4_Sub1(22050, var1, (22050 * anInt646) / 1000, (22050 * anInt647) / 1000);
	}

	public final int method357() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2)
			if ((aClass92Array645[var2] != null) && ((aClass92Array645[var2].anInt733 / 20) < var1))
				var1 = aClass92Array645[var2].anInt733 / 20;

		if ((anInt646 < anInt647) && ((anInt646 / 20) < var1))
			var1 = anInt646 / 20;

		if ((var1 != 9999999) && (var1 != 0)) {
			for (var2 = 0; var2 < 10; ++var2)
				if (aClass92Array645[var2] != null)
					aClass92Array645[var2].anInt733 -= var1 * 20;

			if (anInt646 < anInt647) {
				anInt646 -= var1 * 20;
				anInt647 -= var1 * 20;
			}

			return var1;
		} else
			return 0;
	}

	final byte[] method358() {
		int var1 = 0;

		int var2;
		for (var2 = 0; var2 < 10; ++var2)
			if ((aClass92Array645[var2] != null)
					&& ((aClass92Array645[var2].anInt732 + aClass92Array645[var2].anInt733) > var1))
				var1 = aClass92Array645[var2].anInt732 + aClass92Array645[var2].anInt733;

		if (var1 == 0)
			return new byte[0];
		else {
			var2 = (22050 * var1) / 1000;
			final byte[] var3 = new byte[var2];

			for (int var4 = 0; var4 < 10; ++var4)
				if (aClass92Array645[var4] != null) {
					final int var5 = (aClass92Array645[var4].anInt732 * 22050) / 1000;
					final int var6 = (aClass92Array645[var4].anInt733 * 22050) / 1000;
					final int[] var7 = aClass92Array645[var4].method415(var5, aClass92Array645[var4].anInt732);

					for (int var8 = 0; var8 < var5; ++var8) {
						int var9 = var3[var8 + var6] + (var7[var8] >> 8);
						if (((var9 + 128) & -256) != 0)
							var9 = (var9 >> 31) ^ 127;

						var3[var8 + var6] = (byte) var9;
					}
				}

			return var3;
		}
	}

	public static Class82 method359(final Class61 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method259(var1, var2);
		return var3 == null ? null : new Class82(new RSBuf(var3));
	}

	Class82(final RSBuf var1) {
		for (int var2 = 0; var2 < 10; ++var2) {
			final int var3 = var1.method570();
			if (var3 != 0) {
				--var1.anInt1172;
				aClass92Array645[var2] = new Class92();
				aClass92Array645[var2].method413(var1);
			}
		}

		anInt646 = var1.method571();
		anInt647 = var1.method571();
	}
}
