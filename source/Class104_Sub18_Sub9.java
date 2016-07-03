public class Class104_Sub18_Sub9 extends Class104_Sub18 {
	static Class61 aClass61_1391;
	static Class61 aClass61_1394;
	public static Class56 aClass56_1393 = new Class56(64);
	public int anInt1400 = -1;
	int[] anIntArray1392 = new int[] { -1, -1, -1, -1, -1 };
	public boolean aBool1401 = false;
	int[] anIntArray1395;
	short[] aShortArray1396;
	short[] aShortArray1397;
	short[] aShortArray1398;
	short[] aShortArray1399;

	public boolean method759() {
		if (null == anIntArray1395)
			return true;
		else {
			boolean var1 = true;

			for (int var2 = 0; var2 < anIntArray1395.length; ++var2)
				if (!aClass61_1394.method260(anIntArray1395[var2], 0))
					var1 = false;

			return var1;
		}
	}

	public boolean method760() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2)
			if ((anIntArray1392[var2] != -1) && !aClass61_1394.method260(anIntArray1392[var2], 0))
				var1 = false;

		return var1;
	}

	void method761(final RSBuf var1) {
		while (true) {
			final int var2 = var1.method570();
			if (var2 == 0)
				return;

			method763(var1, var2);
		}
	}

	public Class104_Sub18_Sub16_Sub5 method762() {
		if (anIntArray1395 == null)
			return null;
		else {
			final Class104_Sub18_Sub16_Sub5[] var1 = new Class104_Sub18_Sub16_Sub5[anIntArray1395.length];

			for (int var2 = 0; var2 < anIntArray1395.length; ++var2)
				var1[var2] = Class104_Sub18_Sub16_Sub5.method913(aClass61_1394, anIntArray1395[var2], 0);

			Class104_Sub18_Sub16_Sub5 var3;
			if (var1.length == 1)
				var3 = var1[0];
			else
				var3 = new Class104_Sub18_Sub16_Sub5(var1, var1.length);

			int var4;
			if (aShortArray1396 != null)
				for (var4 = 0; var4 < aShortArray1396.length; ++var4)
					var3.method899(aShortArray1396[var4], aShortArray1397[var4]);

			if (aShortArray1398 != null)
				for (var4 = 0; var4 < aShortArray1398.length; ++var4)
					var3.method909(aShortArray1398[var4], aShortArray1399[var4]);

			return var3;
		}
	}

	void method763(final RSBuf var1, final int var2) {
		if (var2 == 1)
			anInt1400 = var1.method570();
		else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.method570();
				anIntArray1395 = new int[var3];

				for (var4 = 0; var4 < var3; ++var4)
					anIntArray1395[var4] = var1.method571();
			} else if (var2 == 3)
				aBool1401 = true;
			else if (var2 == 40) {
				var3 = var1.method570();
				aShortArray1396 = new short[var3];
				aShortArray1397 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					aShortArray1396[var4] = (short) var1.method571();
					aShortArray1397[var4] = (short) var1.method571();
				}
			} else if (var2 == 41) {
				var3 = var1.method570();
				aShortArray1398 = new short[var3];
				aShortArray1399 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					aShortArray1398[var4] = (short) var1.method571();
					aShortArray1399[var4] = (short) var1.method571();
				}
			} else if ((var2 >= 60) && (var2 < 70))
				anIntArray1392[var2 - 60] = var1.method571();
		}

	}

	public Class104_Sub18_Sub16_Sub5 method764() {
		final Class104_Sub18_Sub16_Sub5[] var1 = new Class104_Sub18_Sub16_Sub5[5];
		int var2 = 0;

		for (int var3 = 0; var3 < 5; ++var3)
			if (anIntArray1392[var3] != -1)
				var1[var2++] = Class104_Sub18_Sub16_Sub5.method913(aClass61_1394, anIntArray1392[var3], 0);

		final Class104_Sub18_Sub16_Sub5 var4 = new Class104_Sub18_Sub16_Sub5(var1, var2);
		int var5;
		if (null != aShortArray1396)
			for (var5 = 0; var5 < aShortArray1396.length; ++var5)
				var4.method899(aShortArray1396[var5], aShortArray1397[var5]);

		if (aShortArray1398 != null)
			for (var5 = 0; var5 < aShortArray1398.length; ++var5)
				var4.method909(aShortArray1398[var5], aShortArray1399[var5]);

		return var4;
	}
}
