public final class Class58 {
	Class104 aClass104_472;
	int anInt473 = 0;
	int anInt471;
	Class104[] aClass104Array470;
	Class104 aClass104_469;

	public Class104 method241(final long var1) {
		final Class104 var3 = aClass104Array470[(int) (var1 & anInt471 - 1)];

		for (aClass104_472 = var3.aClass104_823; aClass104_472 != var3; aClass104_472 = aClass104_472.aClass104_823)
			if (aClass104_472.aLong824 == var1) {
				final Class104 var4 = aClass104_472;
				aClass104_472 = aClass104_472.aClass104_823;
				return var4;
			}

		aClass104_472 = null;
		return null;
	}

	public void method242(final Class104 var1, final long var2) {
		if (var1.aClass104_822 != null)
			var1.method470();

		final Class104 var4 = aClass104Array470[(int) (var2 & anInt471 - 1)];
		var1.aClass104_822 = var4.aClass104_822;
		var1.aClass104_823 = var4;
		var1.aClass104_822.aClass104_823 = var1;
		var1.aClass104_823.aClass104_822 = var1;
		var1.aLong824 = var2;
	}

	public Class58(final int var1) {
		anInt471 = var1;
		aClass104Array470 = new Class104[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			final Class104 var3 = aClass104Array470[var2] = new Class104();
			var3.aClass104_823 = var3;
			var3.aClass104_822 = var3;
		}

	}

	public Class104 method243() {
		Class104 var1;
		if ((anInt473 > 0) && (aClass104_469 != aClass104Array470[anInt473 - 1])) {
			var1 = aClass104_469;
			aClass104_469 = var1.aClass104_823;
			return var1;
		} else {
			do {
				if (anInt473 >= anInt471)
					return null;

				var1 = aClass104Array470[anInt473++].aClass104_823;
			} while (var1 == aClass104Array470[anInt473 - 1]);

			aClass104_469 = var1.aClass104_823;
			return var1;
		}
	}

	void method244() {
		for (int var1 = 0; var1 < anInt471; ++var1) {
			final Class104 var2 = aClass104Array470[var1];

			while (true) {
				final Class104 var3 = var2.aClass104_823;
				if (var3 == var2)
					break;

				var3.method470();
			}
		}

		aClass104_472 = null;
		aClass104_469 = null;
	}

	public Class104 method245() {
		anInt473 = 0;
		return method243();
	}
}
