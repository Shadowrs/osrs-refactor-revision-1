public class Class104_Sub18_Sub6 extends Class104_Sub18 {
	static Class61 aClass61_1324;
	public int anInt1330;
	public static int anInt1373;
	static Class61_Sub1 aClass61_Sub1_1374;
	public int anInt1342 = -1;
	public int anInt1358 = -1;
	public String aString1331 = "null";
	int[] anIntArray1359;
	int[] anIntArray1350;
	public int anInt1365 = 1;
	public int anInt1339 = 1;
	public int anInt1363 = 2;
	public boolean aBool1340 = true;
	int anInt1343 = -1;
	boolean aBool1344 = false;
	public boolean aBool1345 = false;
	public int anInt1346 = -1;
	public int anInt1348 = 16;
	int anInt1364 = 0;
	int anInt1347 = 0;
	short[] aShortArray1334;
	short[] aShortArray1332;
	short[] aShortArray1336;
	short[] aShortArray1337;
	public int anInt1351 = -1;
	boolean aBool1353 = false;
	public boolean aBool1354 = true;
	int anInt1355 = 128;
	int anInt1356 = 128;
	int anInt1357 = 128;
	public int anInt1341 = -1;
	public int anInt1335 = 0;
	int anInt1325 = 0;
	int anInt1371 = 0;
	int anInt1360 = 0;
	public boolean aBool1362 = false;
	boolean aBool1368 = false;
	int anInt1352 = -1;
	public int anInt1333 = -1;
	public int anInt1369 = 0;
	int anInt1367 = -1;
	public int anInt1370 = 0;
	public int anInt1323 = 0;
	public int[] anIntArray1372;
	public int[] anIntArray1338;
	static boolean aBool1361 = false;
	static Class56 aClass56_1366 = new Class56(64);
	public static Class56 aClass56_1326 = new Class56(500);
	static Class56 aClass56_1327 = new Class56(30);
	static Class56 aClass56_1328 = new Class56(30);
	static Class104_Sub18_Sub16_Sub5[] aClass104_Sub18_Sub16_Sub5Array1329 = new Class104_Sub18_Sub16_Sub5[4];
	public String[] aStringArray1349 = new String[5];

	void method740(final RSBuf var1) {
		while (true) {
			final int var2 = var1.method570();
			if (var2 == 0)
				return;

			method744(var1, var2);
		}
	}

	void method741() {
		if (anInt1342 == -1) {
			anInt1342 = 0;
			if ((anIntArray1350 != null) && ((null == anIntArray1359) || (anIntArray1359[0] == 10)))
				anInt1342 = 1;

			for (int var1 = 0; var1 < 5; ++var1)
				if (null != aStringArray1349[var1])
					anInt1342 = 1;
		}

		if (anInt1358 == -1)
			anInt1358 = anInt1363 != 0 ? 1 : 0;

	}

	public final boolean method742(final int var1) {
		if (null != anIntArray1359) {
			for (int var4 = 0; var4 < anIntArray1359.length; ++var4)
				if (var1 == anIntArray1359[var4])
					return aClass61_1324.method260(anIntArray1350[var4] & '\uffff', 0);

			return true;
		} else if (null == anIntArray1350)
			return true;
		else if (var1 != 10)
			return true;
		else {
			boolean var2 = true;

			for (final int element : anIntArray1350)
				var2 &= aClass61_1324.method260(element & '\uffff', 0);

			return var2;
		}
	}

	public final Class104_Sub18_Sub16 method743(final int var1, final int var2, final int[][] var3, final int var4,
			final int var5, final int var6) {
		long var7;
		if (anIntArray1359 == null)
			var7 = (anInt1330 << 10) + var2;
		else
			var7 = var2 + (var1 << 3) + (anInt1330 << 10);

		Object var9 = aClass56_1327.method236(var7);
		if (null == var9) {
			final Class104_Sub18_Sub16_Sub5 var10 = method746(var1, var2);
			if (null == var10)
				return null;

			if (!aBool1344)
				var9 = var10.method904(64 + anInt1364, 768 + anInt1347, -50, -10, -50);
			else {
				var10.aShort1661 = (short) (anInt1364 + 64);
				var10.aShort1659 = (short) (anInt1347 + 768);
				var10.method896();
				var9 = var10;
			}

			aClass56_1327.method238((Class104_Sub18) var9, var7);
		}

		if (aBool1344)
			var9 = ((Class104_Sub18_Sub16_Sub5) var9).method911();

		if (anInt1343 >= 0)
			if (var9 instanceof Class104_Sub18_Sub16_Sub4)
				var9 = ((Class104_Sub18_Sub16_Sub4) var9).method831(var3, var4, var5, var6, true, anInt1343);
			else if (var9 instanceof Class104_Sub18_Sub16_Sub5)
				var9 = ((Class104_Sub18_Sub16_Sub5) var9).method892(var3, var4, var5, var6, true, anInt1343);

		return (Class104_Sub18_Sub16) var9;
	}

	void method744(final RSBuf var1, final int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.method570();
			if (var3 > 0)
				if ((anIntArray1350 != null) && !aBool1361)
					var1.anInt1172 += var3 * 3;
				else {
					anIntArray1359 = new int[var3];
					anIntArray1350 = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						anIntArray1350[var4] = var1.method571();
						anIntArray1359[var4] = var1.method570();
					}
				}
		} else if (var2 == 2)
			aString1331 = var1.method608();
		else if (var2 == 5) {
			var3 = var1.method570();
			if (var3 > 0)
				if ((anIntArray1350 != null) && !aBool1361)
					var1.anInt1172 += 2 * var3;
				else {
					anIntArray1359 = null;
					anIntArray1350 = new int[var3];

					for (var4 = 0; var4 < var3; ++var4)
						anIntArray1350[var4] = var1.method571();
				}
		} else if (var2 == 14)
			anInt1365 = var1.method570();
		else if (var2 == 15)
			anInt1339 = var1.method570();
		else if (var2 == 17) {
			anInt1363 = 0;
			aBool1340 = false;
		} else if (var2 == 18)
			aBool1340 = false;
		else if (var2 == 19)
			anInt1342 = var1.method570();
		else if (var2 == 21)
			anInt1343 = 0;
		else if (var2 == 22)
			aBool1344 = true;
		else if (var2 == 23)
			aBool1345 = true;
		else if (var2 == 24) {
			anInt1346 = var1.method571();
			if (anInt1346 == '\uffff')
				anInt1346 = -1;
		} else if (var2 == 27)
			anInt1363 = 1;
		else if (var2 == 28)
			anInt1348 = var1.method570();
		else if (var2 == 29)
			anInt1364 = var1.method565();
		else if (var2 == 39)
			anInt1347 = var1.method565() * 25;
		else if ((var2 >= 30) && (var2 < 35)) {
			aStringArray1349[var2 - 30] = var1.method608();
			if (aStringArray1349[var2 - 30].equalsIgnoreCase("Hidden"))
				aStringArray1349[var2 - 30] = null;
		} else if (var2 == 40) {
			var3 = var1.method570();
			aShortArray1334 = new short[var3];
			aShortArray1332 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				aShortArray1334[var4] = (short) var1.method571();
				aShortArray1332[var4] = (short) var1.method571();
			}
		} else if (var2 == 41) {
			var3 = var1.method570();
			aShortArray1336 = new short[var3];
			aShortArray1337 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				aShortArray1336[var4] = (short) var1.method571();
				aShortArray1337[var4] = (short) var1.method571();
			}
		} else if (var2 == 60)
			anInt1351 = var1.method571();
		else if (var2 == 62)
			aBool1353 = true;
		else if (var2 == 64)
			aBool1354 = false;
		else if (var2 == 65)
			anInt1355 = var1.method571();
		else if (var2 == 66)
			anInt1356 = var1.method571();
		else if (var2 == 67)
			anInt1357 = var1.method571();
		else if (var2 == 68)
			anInt1341 = var1.method571();
		else if (var2 == 69)
			anInt1335 = var1.method570();
		else if (var2 == 70)
			anInt1325 = var1.method572();
		else if (var2 == 71)
			anInt1371 = var1.method572();
		else if (var2 == 72)
			anInt1360 = var1.method572();
		else if (var2 == 73)
			aBool1362 = true;
		else if (var2 == 74)
			aBool1368 = true;
		else if (var2 == 75)
			anInt1358 = var1.method570();
		else if (var2 == 77) {
			anInt1352 = var1.method571();
			if (anInt1352 == '\uffff')
				anInt1352 = -1;

			anInt1367 = var1.method571();
			if (anInt1367 == '\uffff')
				anInt1367 = -1;

			var3 = var1.method570();
			anIntArray1338 = new int[var3 + 1];

			for (var4 = 0; var4 <= var3; ++var4) {
				anIntArray1338[var4] = var1.method571();
				if (anIntArray1338[var4] == '\uffff')
					anIntArray1338[var4] = -1;
			}
		} else if (var2 == 78) {
			anInt1333 = var1.method571();
			anInt1369 = var1.method570();
		} else if (var2 == 79) {
			anInt1370 = var1.method571();
			anInt1323 = var1.method571();
			anInt1369 = var1.method570();
			var3 = var1.method570();
			anIntArray1372 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1372[var4] = var1.method571();
		} else if (var2 == 81)
			anInt1343 = var1.method570() * 256;

	}

	public final boolean method745() {
		if (null == anIntArray1350)
			return true;
		else {
			boolean var1 = true;

			for (final int element : anIntArray1350)
				var1 &= aClass61_1324.method260(element & '\uffff', 0);

			return var1;
		}
	}

	final Class104_Sub18_Sub16_Sub5 method746(final int var1, int var2) {
		Class104_Sub18_Sub16_Sub5 var3 = null;
		boolean var4;
		int var5;
		int var7;
		if (anIntArray1359 == null) {
			if (var1 != 10)
				return null;

			if (anIntArray1350 == null)
				return null;

			var4 = aBool1353;
			if ((var1 == 2) && (var2 > 3))
				var4 = !var4;

			var5 = anIntArray1350.length;

			for (int var6 = 0; var6 < var5; ++var6) {
				var7 = anIntArray1350[var6];
				if (var4)
					var7 += 65536;

				var3 = (Class104_Sub18_Sub16_Sub5) aClass56_1326.method236(var7);
				if (null == var3) {
					var3 = Class104_Sub18_Sub16_Sub5.method913(aClass61_1324, var7 & '\uffff', 0);
					if (null == var3)
						return null;

					if (var4)
						var3.method910();

					aClass56_1326.method238(var3, var7);
				}

				if (var5 > 1)
					aClass104_Sub18_Sub16_Sub5Array1329[var6] = var3;
			}

			if (var5 > 1)
				var3 = new Class104_Sub18_Sub16_Sub5(aClass104_Sub18_Sub16_Sub5Array1329, var5);
		} else {
			int var9 = -1;

			for (var5 = 0; var5 < anIntArray1359.length; ++var5)
				if (var1 == anIntArray1359[var5]) {
					var9 = var5;
					break;
				}

			if (var9 == -1)
				return null;

			var5 = anIntArray1350[var9];
			final boolean var10 = aBool1353 ^ (var2 > 3);
			if (var10)
				var5 += 65536;

			var3 = (Class104_Sub18_Sub16_Sub5) aClass56_1326.method236(var5);
			if (null == var3) {
				var3 = Class104_Sub18_Sub16_Sub5.method913(aClass61_1324, var5 & '\uffff', 0);
				if (null == var3)
					return null;

				if (var10)
					var3.method910();

				aClass56_1326.method238(var3, var5);
			}
		}

		if ((anInt1355 == 128) && (anInt1356 == 128) && (anInt1357 == 128))
			var4 = false;
		else
			var4 = true;

		boolean var11;
		if ((anInt1325 == 0) && (anInt1371 == 0) && (anInt1360 == 0))
			var11 = false;
		else
			var11 = true;

		final Class104_Sub18_Sub16_Sub5 var8 = new Class104_Sub18_Sub16_Sub5(var3, (var2 == 0) && !var4 && !var11,
				null == aShortArray1334, aShortArray1336 == null, true);
		if ((var1 == 4) && (var2 > 3)) {
			var8.method897(256);
			var8.method898(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1)
			var8.method894();
		else if (var2 == 2)
			var8.method895();
		else if (var2 == 3)
			var8.method891();

		if (null != aShortArray1334)
			for (var7 = 0; var7 < aShortArray1334.length; ++var7)
				var8.method899(aShortArray1334[var7], aShortArray1332[var7]);

		if (aShortArray1336 != null)
			for (var7 = 0; var7 < aShortArray1336.length; ++var7)
				var8.method909(aShortArray1336[var7], aShortArray1337[var7]);

		if (var4)
			var8.method900(anInt1355, anInt1356, anInt1357);

		if (var11)
			var8.method898(anInt1325, anInt1371, anInt1360);

		return var8;
	}

	public final Class104_Sub18_Sub6 method747() {
		int var1 = -1;
		if (anInt1352 != -1)
			var1 = Class52.method228(anInt1352);
		else if (anInt1367 != -1)
			var1 = Class71.anIntArray576[anInt1367];

		return (var1 >= 0) && (var1 < anIntArray1338.length) && (anIntArray1338[var1] != -1)
				? Class104_Sub18_Sub12.method782(anIntArray1338[var1]) : null;
	}

	public boolean method748() {
		if (anIntArray1338 == null)
			return (anInt1333 != -1) || (anIntArray1372 != null);
		else {
			for (final int element : anIntArray1338)
				if (element != -1) {
					final Class104_Sub18_Sub6 var2 = Class104_Sub18_Sub12.method782(element);
					if ((var2.anInt1333 != -1) || (var2.anIntArray1372 != null))
						return true;
				}

			return false;
		}
	}

	public final Class104_Sub18_Sub16_Sub4 method749(final int var1, final int var2, final int[][] var3, final int var4,
			final int var5, final int var6, final Class104_Sub18_Sub3 var7, final int var8) {
		long var9;
		if (anIntArray1359 == null)
			var9 = var2 + (anInt1330 << 10);
		else
			var9 = (var1 << 3) + (anInt1330 << 10) + var2;

		Class104_Sub18_Sub16_Sub4 var11 = (Class104_Sub18_Sub16_Sub4) aClass56_1328.method236(var9);
		if (null == var11) {
			final Class104_Sub18_Sub16_Sub5 var12 = method746(var1, var2);
			if (var12 == null)
				return null;

			var11 = var12.method904(anInt1364 + 64, anInt1347 + 768, -50, -10, -50);
			aClass56_1328.method238(var11, var9);
		}

		if ((var7 == null) && (anInt1343 == -1))
			return var11;
		else {
			if (var7 != null)
				var11 = var7.method684(var11, var8, var2);
			else
				var11 = var11.method811(true);

			if (anInt1343 >= 0)
				var11 = var11.method831(var3, var4, var5, var6, false, anInt1343);

			return var11;
		}
	}

	public final Class104_Sub18_Sub16_Sub4 method750(final int var1, final int var2, final int[][] var3, final int var4,
			final int var5, final int var6) {
		long var7;
		if (null == anIntArray1359)
			var7 = var2 + (anInt1330 << 10);
		else
			var7 = (var1 << 3) + (anInt1330 << 10) + var2;

		Class104_Sub18_Sub16_Sub4 var9 = (Class104_Sub18_Sub16_Sub4) aClass56_1328.method236(var7);
		if (null == var9) {
			final Class104_Sub18_Sub16_Sub5 var10 = method746(var1, var2);
			if (null == var10)
				return null;

			var9 = var10.method904(64 + anInt1364, anInt1347 + 768, -50, -10, -50);
			aClass56_1328.method238(var9, var7);
		}

		if (anInt1343 >= 0)
			var9 = var9.method831(var3, var4, var5, var6, true, anInt1343);

		return var9;
	}

	public static String method751(final byte[] var0, final int var1, final int var2) {
		final char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var1 + var5] & 255;
			if (var6 != 0) {
				if ((var6 >= 128) && (var6 < 160)) {
					char var7 = Class50.aCharArray419[var6 - 128];
					if (var7 == 0)
						var7 = 63;

					var6 = var7;
				}

				var3[var4++] = (char) var6;
			}
		}

		return new String(var3, 0, var4);
	}
}
