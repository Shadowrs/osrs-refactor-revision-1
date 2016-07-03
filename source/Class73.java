public class Class73 {
	int[] anIntArray585;

	public int method336(final int var1) {
		final int var2 = (anIntArray585.length >> 1) - 1;
		int var3 = var1 & var2;

		while (true) {
			final int var4 = anIntArray585[var3 + var3 + 1];
			if (var4 == -1)
				return -1;

			if (anIntArray585[var3 + var3] == var1)
				return var4;

			var3 = (var3 + 1) & var2;
		}
	}

	public Class73(final int[] var1) {
		int var2;
		for (var2 = 1; var2 <= (var1.length + (var1.length >> 1)); var2 <<= 1)
			;

		anIntArray585 = new int[var2 + var2];

		int var3;
		for (var3 = 0; var3 < (var2 + var2); ++var3)
			anIntArray585[var3] = -1;

		int var4;
		for (var3 = 0; var3 < var1.length; anIntArray585[var4 + var4 + 1] = var3++) {
			for (var4 = var1[var3] & (var2 - 1); anIntArray585[var4 + var4 + 1] != -1; var4 = (var4 + 1) & (var2 - 1))
				;

			anIntArray585[var4 + var4] = var1[var3];
		}

	}
}
