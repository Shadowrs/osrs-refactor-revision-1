public class Class104_Sub18_Sub12 extends Class104_Sub18 {
	public int anInt1418;
	public static Class61 aClass61_1432;
	int anInt1419;
	public String aString1444 = "null";
	public int anInt1425 = 2000;
	public int anInt1426 = 0;
	public int anInt1427 = 0;
	public int anInt1454 = 0;
	public int anInt1430 = 0;
	public int anInt1431 = 0;
	public int anInt1453 = 1;
	public boolean aBool1440 = false;
	int anInt1436 = -1;
	int anInt1438 = 0;
	int anInt1437 = -1;
	int anInt1457 = -1;
	int anInt1441 = 0;
	int anInt1443 = -1;
	short[] aShortArray1421;
	short[] aShortArray1422;
	short[] aShortArray1423;
	short[] aShortArray1424;
	int anInt1445 = -1;
	int anInt1448 = -1;
	int anInt1414 = -1;
	int anInt1429 = -1;
	int anInt1451 = -1;
	int anInt1447 = -1;
	public int anInt1446 = 0;
	public int anInt1442 = -1;
	public int anInt1433 = -1;
	int anInt1452 = 128;
	int[] anIntArray1450;
	int[] anIntArray1449;
	int anInt1428 = 128;
	int anInt1439 = 128;
	public int anInt1455 = 0;
	public int anInt1456 = 0;
	public int anInt1420 = 0;
	public static Class56 aClass56_1415 = new Class56(64);
	public static Class56 aClass56_1416 = new Class56(50);
	public static Class56 aClass56_1417 = new Class56(100);
	public String[] aStringArray1434 = new String[] { null, null, "Take", null, null };
	public String[] aStringArray1435 = new String[] { null, null, null, null, "Drop" };

	void method771(final RSBuf var1) {
		while (true) {
			final int var2 = var1.method570();
			if (var2 == 0)
				return;

			method773(var1, var2);
		}
	}

	void method772() {
	}

	void method773(final RSBuf var1, final int var2) {
		if (var2 == 1)
			anInt1419 = var1.readLEShort();
		else if (var2 == 2)
			aString1444 = var1.method608();
		else if (var2 == 4)
			anInt1425 = var1.readLEShort();
		else if (var2 == 5)
			anInt1426 = var1.readLEShort();
		else if (var2 == 6)
			anInt1427 = var1.readLEShort();
		else if (var2 == 7) {
			anInt1454 = var1.readLEShort();
			if (anInt1454 > 32767)
				anInt1454 -= 65536;
		} else if (var2 == 8) {
			anInt1430 = var1.readLEShort();
			if (anInt1430 > 32767)
				anInt1430 -= 65536;
		} else if (var2 == 11)
			anInt1431 = 1;
		else if (var2 == 12)
			anInt1453 = var1.method574();
		else if (var2 == 16)
			aBool1440 = true;
		else if (var2 == 23) {
			anInt1436 = var1.readLEShort();
			anInt1438 = var1.method570();
		} else if (var2 == 24)
			anInt1437 = var1.readLEShort();
		else if (var2 == 25) {
			anInt1457 = var1.readLEShort();
			anInt1441 = var1.method570();
		} else if (var2 == 26)
			anInt1443 = var1.readLEShort();
		else if ((var2 >= 30) && (var2 < 35)) {
			aStringArray1434[var2 - 30] = var1.method608();
			if (aStringArray1434[var2 - 30].equalsIgnoreCase("Hidden"))
				aStringArray1434[var2 - 30] = null;
		} else if ((var2 >= 35) && (var2 < 40))
			aStringArray1435[var2 - 35] = var1.method608();
		else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.method570();
				aShortArray1421 = new short[var3];
				aShortArray1422 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					aShortArray1421[var4] = (short) var1.readLEShort();
					aShortArray1422[var4] = (short) var1.readLEShort();
				}
			} else if (var2 == 41) {
				var3 = var1.method570();
				aShortArray1423 = new short[var3];
				aShortArray1424 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					aShortArray1423[var4] = (short) var1.readLEShort();
					aShortArray1424[var4] = (short) var1.readLEShort();
				}
			} else if (var2 == 78)
				anInt1445 = var1.readLEShort();
			else if (var2 == 79)
				anInt1448 = var1.readLEShort();
			else if (var2 == 90)
				anInt1414 = var1.readLEShort();
			else if (var2 == 91)
				anInt1429 = var1.readLEShort();
			else if (var2 == 92)
				anInt1451 = var1.readLEShort();
			else if (var2 == 93)
				anInt1447 = var1.readLEShort();
			else if (var2 == 95)
				anInt1446 = var1.readLEShort();
			else if (var2 == 97)
				anInt1442 = var1.readLEShort();
			else if (var2 == 98)
				anInt1433 = var1.readLEShort();
			else if ((var2 >= 100) && (var2 < 110)) {
				if (anIntArray1450 == null) {
					anIntArray1450 = new int[10];
					anIntArray1449 = new int[10];
				}

				anIntArray1450[var2 - 100] = var1.readLEShort();
				anIntArray1449[var2 - 100] = var1.readLEShort();
			} else if (var2 == 110)
				anInt1452 = var1.readLEShort();
			else if (var2 == 111)
				anInt1428 = var1.readLEShort();
			else if (var2 == 112)
				anInt1439 = var1.readLEShort();
			else if (var2 == 113)
				anInt1455 = var1.method565();
			else if (var2 == 114)
				anInt1456 = var1.method565() * 5;
			else if (var2 == 115)
				anInt1420 = var1.method570();
		}

	}

	void method774(final Class104_Sub18_Sub12 var1, final Class104_Sub18_Sub12 var2) {
		anInt1419 = var1.anInt1419;
		anInt1425 = var1.anInt1425;
		anInt1426 = var1.anInt1426;
		anInt1427 = var1.anInt1427;
		anInt1446 = var1.anInt1446;
		anInt1454 = var1.anInt1454;
		anInt1430 = var1.anInt1430;
		aShortArray1421 = var1.aShortArray1421;
		aShortArray1422 = var1.aShortArray1422;
		aShortArray1423 = var1.aShortArray1423;
		aShortArray1424 = var1.aShortArray1424;
		aString1444 = var2.aString1444;
		aBool1440 = var2.aBool1440;
		anInt1453 = var2.anInt1453;
		anInt1431 = 1;
	}

	public final Class104_Sub18_Sub16_Sub5 method775(final int var1) {
		int var3;
		if ((null != anIntArray1450) && (var1 > 1)) {
			int var2 = -1;

			for (var3 = 0; var3 < 10; ++var3)
				if ((var1 >= anIntArray1449[var3]) && (anIntArray1449[var3] != 0))
					var2 = anIntArray1450[var3];

			if (var2 != -1)
				return Class27.method137(var2).method775(1);
		}

		final Class104_Sub18_Sub16_Sub5 var4 = Class104_Sub18_Sub16_Sub5.method913(Class27.aClass61_265, anInt1419, 0);
		if (null == var4)
			return null;
		else {
			if ((anInt1452 != 128) || (anInt1428 != 128) || (anInt1439 != 128))
				var4.method900(anInt1452, anInt1428, anInt1439);

			if (null != aShortArray1421)
				for (var3 = 0; var3 < aShortArray1421.length; ++var3)
					var4.method899(aShortArray1421[var3], aShortArray1422[var3]);

			if (null != aShortArray1423)
				for (var3 = 0; var3 < aShortArray1423.length; ++var3)
					var4.method909(aShortArray1423[var3], aShortArray1424[var3]);

			return var4;
		}
	}

	public Class104_Sub18_Sub12 method776(final int var1) {
		if ((null != anIntArray1450) && (var1 > 1)) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3)
				if ((var1 >= anIntArray1449[var3]) && (anIntArray1449[var3] != 0))
					var2 = anIntArray1450[var3];

			if (var2 != -1)
				return Class27.method137(var2);
		}

		return this;
	}

	public final Class104_Sub18_Sub16_Sub5 method777(final boolean var1) {
		int var2 = anInt1436;
		int var3 = anInt1437;
		int var4 = anInt1445;
		if (var1) {
			var2 = anInt1457;
			var3 = anInt1443;
			var4 = anInt1448;
		}

		if (var2 == -1)
			return null;
		else {
			Class104_Sub18_Sub16_Sub5 var5 = Class104_Sub18_Sub16_Sub5.method913(Class27.aClass61_265, var2, 0);
			if (var3 != -1) {
				final Class104_Sub18_Sub16_Sub5 var6 = Class104_Sub18_Sub16_Sub5.method913(Class27.aClass61_265, var3,
						0);
				if (var4 != -1) {
					final Class104_Sub18_Sub16_Sub5 var7 = Class104_Sub18_Sub16_Sub5.method913(Class27.aClass61_265,
							var4, 0);
					final Class104_Sub18_Sub16_Sub5[] var8 = new Class104_Sub18_Sub16_Sub5[] { var5, var6, var7 };
					var5 = new Class104_Sub18_Sub16_Sub5(var8, 3);
				} else {
					final Class104_Sub18_Sub16_Sub5[] var10 = new Class104_Sub18_Sub16_Sub5[] { var5, var6 };
					var5 = new Class104_Sub18_Sub16_Sub5(var10, 2);
				}
			}

			if (!var1 && (anInt1438 != 0))
				var5.method898(0, anInt1438, 0);

			if (var1 && (anInt1441 != 0))
				var5.method898(0, anInt1441, 0);

			int var9;
			if (null != aShortArray1421)
				for (var9 = 0; var9 < aShortArray1421.length; ++var9)
					var5.method899(aShortArray1421[var9], aShortArray1422[var9]);

			if (aShortArray1423 != null)
				for (var9 = 0; var9 < aShortArray1423.length; ++var9)
					var5.method909(aShortArray1423[var9], aShortArray1424[var9]);

			return var5;
		}
	}

	public final Class104_Sub18_Sub16_Sub5 method778(final boolean var1) {
		int var2 = anInt1414;
		int var3 = anInt1451;
		if (var1) {
			var2 = anInt1429;
			var3 = anInt1447;
		}

		if (var2 == -1)
			return null;
		else {
			Class104_Sub18_Sub16_Sub5 var4 = Class104_Sub18_Sub16_Sub5.method913(Class27.aClass61_265, var2, 0);
			if (var3 != -1) {
				final Class104_Sub18_Sub16_Sub5 var5 = Class104_Sub18_Sub16_Sub5.method913(Class27.aClass61_265, var3,
						0);
				final Class104_Sub18_Sub16_Sub5[] var6 = new Class104_Sub18_Sub16_Sub5[] { var4, var5 };
				var4 = new Class104_Sub18_Sub16_Sub5(var6, 2);
			}

			int var7;
			if (aShortArray1421 != null)
				for (var7 = 0; var7 < aShortArray1421.length; ++var7)
					var4.method899(aShortArray1421[var7], aShortArray1422[var7]);

			if (aShortArray1423 != null)
				for (var7 = 0; var7 < aShortArray1423.length; ++var7)
					var4.method909(aShortArray1423[var7], aShortArray1424[var7]);

			return var4;
		}
	}

	public final Class104_Sub18_Sub16_Sub4 method779(final int var1) {
		if ((anIntArray1450 != null) && (var1 > 1)) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3)
				if ((var1 >= anIntArray1449[var3]) && (anIntArray1449[var3] != 0))
					var2 = anIntArray1450[var3];

			if (var2 != -1)
				return Class27.method137(var2).method779(1);
		}

		Class104_Sub18_Sub16_Sub4 var4 = (Class104_Sub18_Sub16_Sub4) aClass56_1416.method236(anInt1418);
		if (null != var4)
			return var4;
		else {
			final Class104_Sub18_Sub16_Sub5 var5 = Class104_Sub18_Sub16_Sub5.method913(Class27.aClass61_265, anInt1419,
					0);
			if (null == var5)
				return null;
			else {
				if ((anInt1452 != 128) || (anInt1428 != 128) || (anInt1439 != 128))
					var5.method900(anInt1452, anInt1428, anInt1439);

				int var6;
				if (null != aShortArray1421)
					for (var6 = 0; var6 < aShortArray1421.length; ++var6)
						var5.method899(aShortArray1421[var6], aShortArray1422[var6]);

				if (null != aShortArray1423)
					for (var6 = 0; var6 < aShortArray1423.length; ++var6)
						var5.method909(aShortArray1423[var6], aShortArray1424[var6]);

				var4 = var5.method904(anInt1455 + 64, anInt1456 + 768, -50, -10, -50);
				var4.aBool1551 = true;
				aClass56_1416.method238(var4, anInt1418);
				return var4;
			}
		}
	}

	public final boolean method780(final boolean var1) {
		int var2 = anInt1436;
		int var3 = anInt1437;
		int var4 = anInt1445;
		if (var1) {
			var2 = anInt1457;
			var3 = anInt1443;
			var4 = anInt1448;
		}

		if (var2 == -1)
			return true;
		else {
			boolean var5 = true;
			if (!Class27.aClass61_265.method260(var2, 0))
				var5 = false;

			if ((var3 != -1) && !Class27.aClass61_265.method260(var3, 0))
				var5 = false;

			if ((var4 != -1) && !Class27.aClass61_265.method260(var4, 0))
				var5 = false;

			return var5;
		}
	}

	public final boolean method781(final boolean var1) {
		int var2 = anInt1414;
		int var3 = anInt1451;
		if (var1) {
			var2 = anInt1429;
			var3 = anInt1447;
		}

		if (var2 == -1)
			return true;
		else {
			boolean var4 = true;
			if (!Class27.aClass61_265.method260(var2, 0))
				var4 = false;

			if ((var3 != -1) && !Class27.aClass61_265.method260(var3, 0))
				var4 = false;

			return var4;
		}
	}

	public static Class104_Sub18_Sub6 method782(final int var0) {
		Class104_Sub18_Sub6 var1 = (Class104_Sub18_Sub6) Class104_Sub18_Sub6.aClass56_1366.method236(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class72.aClass61_584.method259(6, var0);
			var1 = new Class104_Sub18_Sub6();
			var1.anInt1330 = var0;
			if (null != var2)
				var1.method740(new RSBuf(var2));

			var1.method741();
			if (var1.aBool1368) {
				var1.anInt1363 = 0;
				var1.aBool1340 = false;
			}

			Class104_Sub18_Sub6.aClass56_1366.method238(var1, var0);
			return var1;
		}
	}
}
