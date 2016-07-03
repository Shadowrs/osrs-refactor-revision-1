public class Class1_Sub2 extends Class1 {
	long aLong881 = System.nanoTime();

	@Override
	void method13(final int var1) {
		aLong881 = System.nanoTime();
	}

	@Override
	int method12(final int var1, final int var2, final byte var3) {
		final long var4 = 1000000L * var2;
		long var6 = aLong881 - System.nanoTime();
		if (var6 < var4)
			var6 = var4;

		Class69.method323(var6 / 1000000L);
		final long var8 = System.nanoTime();

		int var10;
		for (var10 = 0; (var10 < 10) && ((var10 < 1) || (aLong881 < var8)); aLong881 += var1 * 1000000L)
			++var10;

		if (aLong881 < var8)
			aLong881 = var8;

		return var10;
	}
}
