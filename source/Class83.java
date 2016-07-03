public class Class83 {
	int anInt656;
	int anInt652;
	int[] anIntArray650;
	long aLong654;
	int[] anIntArray651;
	int[] anIntArray648;
	int[] anIntArray649;
	static byte[] aByteArray655 = new byte[] { (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0,
			(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
			(byte) 0 };
	RSBuf aClass104_Sub21_653 = new RSBuf((byte[]) null);

	void method360(final byte[] var1) {
		aClass104_Sub21_653.aByteArray1174 = var1;
		aClass104_Sub21_653.anInt1172 = 10;
		final int var2 = aClass104_Sub21_653.method571();
		anInt656 = aClass104_Sub21_653.method571();
		anInt652 = 500000;
		anIntArray650 = new int[var2];

		int var3;
		int var5;
		for (var3 = 0; var3 < var2; aClass104_Sub21_653.anInt1172 += var5) {
			final int var4 = aClass104_Sub21_653.method574();
			var5 = aClass104_Sub21_653.method574();
			if (var4 == 1297379947) {
				anIntArray650[var3] = aClass104_Sub21_653.anInt1172;
				++var3;
			}
		}

		aLong654 = 0L;
		anIntArray651 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3)
			anIntArray651[var3] = anIntArray650[var3];

		anIntArray648 = new int[var2];
		anIntArray649 = new int[var2];
	}

	boolean method361() {
		return aClass104_Sub21_653.aByteArray1174 != null;
	}

	int method362() {
		return anIntArray651.length;
	}

	void method363(final int var1) {
		aClass104_Sub21_653.anInt1172 = anIntArray651[var1];
	}

	void method364(final int var1) {
		anIntArray651[var1] = aClass104_Sub21_653.anInt1172;
	}

	void method365() {
		aClass104_Sub21_653.anInt1172 = -1;
	}

	void method366(final int var1) {
		final int var2 = aClass104_Sub21_653.method580();
		anIntArray648[var1] += var2;
	}

	int method367(final int var1) {
		final byte var2 = aClass104_Sub21_653.aByteArray1174[aClass104_Sub21_653.anInt1172];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			anIntArray649[var1] = var5;
			++aClass104_Sub21_653.anInt1172;
		} else
			var5 = anIntArray649[var1];

		if ((var5 != 240) && (var5 != 247))
			return method368(var1, var5);
		else {
			final int var3 = aClass104_Sub21_653.method580();
			if ((var5 == 247) && (var3 > 0)) {
				final int var4 = aClass104_Sub21_653.aByteArray1174[aClass104_Sub21_653.anInt1172] & 255;
				if (((var4 >= 241) && (var4 <= 243)) || (var4 == 246) || (var4 == 248)
						|| ((var4 >= 250) && (var4 <= 252)) || (var4 == 254)) {
					++aClass104_Sub21_653.anInt1172;
					anIntArray649[var1] = var4;
					return method368(var1, var4);
				}
			}

			aClass104_Sub21_653.anInt1172 += var3;
			return 0;
		}
	}

	int method368(final int var1, final int var2) {
		int var4;
		if (var2 == 255) {
			final int var7 = aClass104_Sub21_653.method570();
			var4 = aClass104_Sub21_653.method580();
			if (var7 == 47) {
				aClass104_Sub21_653.anInt1172 += var4;
				return 1;
			} else if (var7 == 81) {
				final int var5 = aClass104_Sub21_653.method614();
				var4 -= 3;
				final int var6 = anIntArray648[var1];
				aLong654 += (long) var6 * (long) (anInt652 - var5);
				anInt652 = var5;
				aClass104_Sub21_653.anInt1172 += var4;
				return 2;
			} else {
				aClass104_Sub21_653.anInt1172 += var4;
				return 3;
			}
		} else {
			final byte var3 = aByteArray655[var2 - 128];
			var4 = var2;
			if (var3 >= 1)
				var4 = var2 | (aClass104_Sub21_653.method570() << 8);

			if (var3 >= 2)
				var4 |= aClass104_Sub21_653.method570() << 16;

			return var4;
		}
	}

	long method369(final int var1) {
		return aLong654 + ((long) var1 * (long) anInt652);
	}

	void method370() {
		aClass104_Sub21_653.aByteArray1174 = null;
		anIntArray650 = null;
		anIntArray651 = null;
		anIntArray648 = null;
		anIntArray649 = null;
	}

	boolean method371() {
		final int var1 = anIntArray651.length;

		for (int var2 = 0; var2 < var1; ++var2)
			if (anIntArray651[var2] >= 0)
				return false;

		return true;
	}

	int method372(final int var1) {
		final int var2 = method367(var1);
		return var2;
	}

	void method373(final long var1) {
		aLong654 = var1;
		final int var3 = anIntArray651.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			anIntArray648[var4] = 0;
			anIntArray649[var4] = 0;
			aClass104_Sub21_653.anInt1172 = anIntArray650[var4];
			method366(var4);
			anIntArray651[var4] = aClass104_Sub21_653.anInt1172;
		}

	}

	Class83() {
	}

	Class83(final byte[] var1) {
		method360(var1);
	}

	int method374() {
		final int var1 = anIntArray651.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; ++var4)
			if ((anIntArray651[var4] >= 0) && (anIntArray648[var4] < var3)) {
				var2 = var4;
				var3 = anIntArray648[var4];
			}

		return var2;
	}
}
