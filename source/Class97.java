public class Class97 {
	static byte aByte766;
	public static short[] aShortArray764 = new short[] { (short) 6798, (short) 8741, (short) 25238, (short) 4626,
			(short) 4550 };
	public static short[][] aShortArrayArray763 = new short[][] {
			{ (short) 6798, (short) 107, (short) 10283, (short) 16, (short) 4797, (short) 7744, (short) 5799,
					(short) 4634, (short) -31839, (short) 22433, (short) 2983, (short) -11343, (short) 8, (short) 5281,
					(short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908,
					(short) 21830, (short) 28946, (short) -15701, (short) -14010 },
			{ (short) 8741, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701,
					(short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341,
					(short) 16578, (short) -30533, (short) 25239, (short) 8, (short) 5281, (short) 10438, (short) 3650,
					(short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946,
					(short) -15701, (short) -14010 },
			{ (short) 25238, (short) 8742, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404,
					(short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783,
					(short) 1341, (short) 16578, (short) -30533, (short) 8, (short) 5281, (short) 10438, (short) 3650,
					(short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946,
					(short) -15701, (short) -14010 },
			{ (short) 4626, (short) 11146, (short) 6439, (short) 12, (short) 4758, (short) 10270 },
			{ (short) 4550, (short) 4537, (short) 5681, (short) 5673, (short) 5790, (short) 6806, (short) 8076,
					(short) 4574 } };
	public static short[] aShortArray762 = new short[] { (short) -10304, (short) 9104, (short) -1, (short) -1,
			(short) -1 };
	public static short[][] aShortArrayArray765 = new short[][] {
			{ (short) 6554, (short) 115, (short) 10304, (short) 28, (short) 5702, (short) 7756, (short) 5681,
					(short) 4510, (short) -31835, (short) 22437, (short) 2859, (short) -11339, (short) 16, (short) 5157,
					(short) 10446, (short) 3658, (short) -27314, (short) -21965, (short) 472, (short) 580, (short) 784,
					(short) 21966, (short) 28950, (short) -15697, (short) -14002 },
			{ (short) 9104, (short) 10275, (short) 7595, (short) 3610, (short) 7975, (short) 8526, (short) 918,
					(short) -26734, (short) 24466, (short) 10145, (short) -6882, (short) 5027, (short) 1457,
					(short) 16565, (short) -30545, (short) 25486, (short) 24, (short) 5392, (short) 10429, (short) 3673,
					(short) -27335, (short) -21957, (short) 192, (short) 687, (short) 412, (short) 21821, (short) 28835,
					(short) -15460, (short) -14019 },
			new short[0], new short[0], new short[0] };

	static final void method438(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6) {
		if (Class104_Sub7.method508(var0))
			Class104_Sub12.method538(Class22.aClass104_Sub12ArrayArray228[var0], -1, var1, var2, var3, var4, var5,
					var6);
	}

	static final void method439(final Class104_Sub12[] var0, final int var1) {
		for (final Class104_Sub12 element : var0) {
			final Class104_Sub12 var3 = element;
			if ((null != var3) && (var3.anInt1091 == var1) && (!var3.aBool977 || !Class40.method182(var3))) {
				int var5;
				if (var3.anInt980 == 0) {
					if (!var3.aBool977 && Class40.method182(var3) && (Class76.aClass104_Sub12_619 != var3))
						continue;

					method439(var0, var3.anInt978);
					if (null != var3.aClass104_Sub12Array1020)
						method439(var3.aClass104_Sub12Array1020, var3.anInt978);

					final Class104_Sub9 var4 = (Class104_Sub9) client.aClass58_1795.method241(var3.anInt978);
					if (var4 != null) {
						var5 = var4.anInt957;
						if (Class104_Sub7.method508(var5))
							method439(Class22.aClass104_Sub12ArrayArray228[var5], -1);
					}
				}

				if (var3.anInt980 == 6) {
					if ((var3.anInt1058 != -1) || (var3.anInt1015 != -1)) {
						final boolean var6 = Class80.method353(var3);
						if (var6)
							var5 = var3.anInt1015;
						else
							var5 = var3.anInt1058;

						if (var5 != -1) {
							final Class104_Sub18_Sub3 var7 = Class70.method327(var5);

							for (var3.anInt1085 += client.anInt1867; var3.anInt1085 > var7.anIntArray1264[var3.anInt974]; Class79
									.method348(var3)) {
								var3.anInt1085 -= var7.anIntArray1264[var3.anInt974];
								++var3.anInt974;
								if (var3.anInt974 >= var7.anIntArray1262.length) {
									var3.anInt974 -= var7.anInt1266;
									if ((var3.anInt974 < 0) || (var3.anInt974 >= var7.anIntArray1262.length))
										var3.anInt974 = 0;
								}
							}
						}
					}

					if ((var3.anInt1022 != 0) && !var3.aBool977) {
						int var8 = var3.anInt1022 >> 16;
						var5 = (var3.anInt1022 << 16) >> 16;
						var8 *= client.anInt1867;
						var5 *= client.anInt1867;
						var3.anInt1043 = (var8 + var3.anInt1043) & 2047;
						var3.anInt1019 = (var3.anInt1019 + var5) & 2047;
						Class79.method348(var3);
					}
				}
			}
		}

	}

	static final Class104_Sub9 method440(final int var0, final int var1, final int var2) {
		final Class104_Sub9 var3 = new Class104_Sub9();
		var3.anInt957 = var1;
		var3.anInt956 = var2;
		client.aClass58_1795.method242(var3, var0);
		Class80.method354(var1);
		Class88.method404(var1);
		final Class104_Sub12 var4 = Class47.method210(var0);
		if (var4 != null)
			Class79.method348(var4);

		if (null != client.aClass104_Sub12_1951) {
			Class79.method348(client.aClass104_Sub12_1951);
			client.aClass104_Sub12_1951 = null;
		}

		client.aBool1930 = false;
		client.anInt1805 = 0;
		Class44.method192(Class50.anInt422, Class36.anInt349, Class12.anInt74, Class78.anInt627);
		if (client.anInt1947 != -1)
			Class9.method36(client.anInt1947, 1);

		return var3;
	}

	public static void method441() {
		Class104_Sub18_Sub11.aClass56_1413.method239();
	}

	static final boolean method442(final int var0, final int var1, final int var2) {
		final int var3 = (var2 >> 14) & 32767;
		final int var4 = Class81.aClass17_643.method89(Class12.anInt73, var0, var1, var2);
		if (var4 == -1)
			return false;
		else {
			final int var5 = var4 & 31;
			final int var6 = (var4 >> 6) & 3;
			if ((var5 != 10) && (var5 != 11) && (var5 != 22))
				Class104_Sub13.method543(Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1745[0],
						Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1746[0], var0, var1, true, 1 + var5, var6,
						0, 0, 0, 2);
			else {
				final Class104_Sub18_Sub6 var7 = Class104_Sub18_Sub12.method782(var3);
				int var8;
				int var9;
				if ((var6 != 0) && (var6 != 2)) {
					var8 = var7.anInt1339;
					var9 = var7.anInt1365;
				} else {
					var8 = var7.anInt1365;
					var9 = var7.anInt1339;
				}

				int var10 = var7.anInt1335;
				if (var6 != 0)
					var10 = (var10 >> (4 - var6)) + ((var10 << var6) & 15);

				Class104_Sub13.method543(Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1745[0],
						Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1746[0], var0, var1, true, 0, 0, var8,
						var9, var10, 2);
			}

			client.anInt1895 = Class14.anInt101;
			client.anInt1896 = Class14.anInt102;
			client.anInt1898 = 2;
			client.anInt1897 = 0;
			return true;
		}
	}
}
