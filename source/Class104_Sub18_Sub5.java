public class Class104_Sub18_Sub5 extends Class104_Sub18 {
	public static Class61 aClass61_1307;
	int anInt1308;
	public static Class61 aClass61_1311;
	int anInt1309;
	public int anInt1316 = -1;
	int anInt1304 = 128;
	int anInt1315 = 128;
	int anInt1306 = 0;
	int anInt1317 = 0;
	int anInt1319 = 0;
	short[] aShortArray1310;
	short[] aShortArray1312;
	short[] aShortArray1313;
	short[] aShortArray1314;
	public static Class56 aClass56_1305 = new Class56(64);
	public static Class56 aClass56_1318 = new Class56(30);

	void method730(final RSBuf var1) {
		while (true) {
			final int var2 = var1.method570();
			if (var2 == 0)
				return;

			method731(var1, var2);
		}
	}

	void method731(final RSBuf var1, final int var2) {
		if (var2 == 1)
			anInt1309 = var1.method571();
		else if (var2 == 2)
			anInt1316 = var1.method571();
		else if (var2 == 4)
			anInt1304 = var1.method571();
		else if (var2 == 5)
			anInt1315 = var1.method571();
		else if (var2 == 6)
			anInt1306 = var1.method571();
		else if (var2 == 7)
			anInt1317 = var1.method570();
		else if (var2 == 8)
			anInt1319 = var1.method570();
		else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.method570();
				aShortArray1310 = new short[var3];
				aShortArray1312 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					aShortArray1310[var4] = (short) var1.method571();
					aShortArray1312[var4] = (short) var1.method571();
				}
			} else if (var2 == 41) {
				var3 = var1.method570();
				aShortArray1313 = new short[var3];
				aShortArray1314 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					aShortArray1313[var4] = (short) var1.method571();
					aShortArray1314[var4] = (short) var1.method571();
				}
			}
		}

	}

	public final Class104_Sub18_Sub16_Sub4 method732(final int var1) {
		Class104_Sub18_Sub16_Sub4 var2 = (Class104_Sub18_Sub16_Sub4) aClass56_1318.method236(anInt1308);
		if (null == var2) {
			final Class104_Sub18_Sub16_Sub5 var3 = Class104_Sub18_Sub16_Sub5.method913(aClass61_1311, anInt1309, 0);
			if (var3 == null)
				return null;

			int var4;
			if (null != aShortArray1310)
				for (var4 = 0; var4 < aShortArray1310.length; ++var4)
					var3.method899(aShortArray1310[var4], aShortArray1312[var4]);

			if (null != aShortArray1313)
				for (var4 = 0; var4 < aShortArray1313.length; ++var4)
					var3.method909(aShortArray1313[var4], aShortArray1314[var4]);

			var2 = var3.method904(64 + anInt1317, 850 + anInt1319, -30, -50, -30);
			aClass56_1318.method238(var2, anInt1308);
		}

		Class104_Sub18_Sub16_Sub4 var5;
		if ((anInt1316 != -1) && (var1 != -1))
			var5 = Class70.method327(anInt1316).method688(var2, var1);
		else
			var5 = var2.method829(true);

		if ((anInt1304 != 128) || (anInt1315 != 128))
			var5.method823(anInt1304, anInt1315, anInt1304);

		if (anInt1306 != 0) {
			if (anInt1306 == 90)
				var5.method818();

			if (anInt1306 == 180) {
				var5.method818();
				var5.method818();
			}

			if (anInt1306 == 270) {
				var5.method818();
				var5.method818();
				var5.method818();
			}
		}

		return var5;
	}

	public static boolean method733() {
		return Class29.anInt272 != 0 ? true : Class29.aClass104_Sub8_Sub1_271.method637();
	}

	static final void method734(final Class104_Sub18_Sub16_Sub7 var0) {
		var0.anInt1719 = var0.anInt1702;
		if (var0.anInt1744 == 0)
			var0.anInt1748 = 0;
		else {
			if ((var0.anInt1722 != -1) && (var0.anInt1707 == 0)) {
				final Class104_Sub18_Sub3 var1 = Class70.method327(var0.anInt1722);
				if ((var0.anInt1735 > 0) && (var1.anInt1273 == 0)) {
					++var0.anInt1748;
					return;
				}

				if ((var0.anInt1735 <= 0) && (var1.anInt1274 == 0)) {
					++var0.anInt1748;
					return;
				}
			}

			final int var2 = var0.anInt1695;
			final int var3 = var0.anInt1694;
			final int var4 = (var0.anInt1736 * 64) + (128 * var0.anIntArray1745[var0.anInt1744 - 1]);
			final int var5 = (128 * var0.anIntArray1746[var0.anInt1744 - 1]) + (var0.anInt1736 * 64);
			if (((var4 - var2) <= 256) && ((var4 - var2) >= -256) && ((var5 - var3) <= 256)
					&& ((var5 - var3) >= -256)) {
				if (var2 < var4) {
					if (var3 < var5)
						var0.anInt1698 = 1280;
					else if (var3 > var5)
						var0.anInt1698 = 1792;
					else
						var0.anInt1698 = 1536;
				} else if (var2 > var4) {
					if (var3 < var5)
						var0.anInt1698 = 768;
					else if (var3 > var5)
						var0.anInt1698 = 256;
					else
						var0.anInt1698 = 512;
				} else if (var3 < var5)
					var0.anInt1698 = 1024;
				else if (var3 > var5)
					var0.anInt1698 = 0;

				int var6 = (var0.anInt1698 - var0.anInt1725) & 2047;
				if (var6 > 1024)
					var6 -= 2048;

				int var7 = var0.anInt1743;
				if ((var6 >= -256) && (var6 <= 256))
					var7 = var0.anInt1701;
				else if ((var6 >= 256) && (var6 < 768))
					var7 = var0.anInt1704;
				else if ((var6 >= -768) && (var6 <= -256))
					var7 = var0.anInt1703;

				if (var7 == -1)
					var7 = var0.anInt1701;

				var0.anInt1719 = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof Class104_Sub18_Sub16_Sub7_Sub2)
					var9 = ((Class104_Sub18_Sub16_Sub7_Sub2) var0).aClass104_Sub18_Sub2_1788.aBool1258;

				if (var9) {
					if ((var0.anInt1725 != var0.anInt1698) && (var0.anInt1716 == -1) && (var0.anInt1740 != 0))
						var8 = 2;

					if (var0.anInt1744 > 2)
						var8 = 6;

					if (var0.anInt1744 > 3)
						var8 = 8;

					if ((var0.anInt1748 > 0) && (var0.anInt1744 > 1)) {
						var8 = 8;
						--var0.anInt1748;
					}
				} else {
					if (var0.anInt1744 > 1)
						var8 = 6;

					if (var0.anInt1744 > 2)
						var8 = 8;

					if ((var0.anInt1748 > 0) && (var0.anInt1744 > 1)) {
						var8 = 8;
						--var0.anInt1748;
					}
				}

				if (var0.aBoolArray1747[var0.anInt1744 - 1])
					var8 <<= 1;

				if ((var8 >= 8) && (var0.anInt1701 == var0.anInt1719) && (var0.anInt1705 != -1))
					var0.anInt1719 = var0.anInt1705;

				if (var2 < var4) {
					var0.anInt1695 += var8;
					if (var0.anInt1695 > var4)
						var0.anInt1695 = var4;
				} else if (var2 > var4) {
					var0.anInt1695 -= var8;
					if (var0.anInt1695 < var4)
						var0.anInt1695 = var4;
				}

				if (var3 < var5) {
					var0.anInt1694 += var8;
					if (var0.anInt1694 > var5)
						var0.anInt1694 = var5;
				} else if (var3 > var5) {
					var0.anInt1694 -= var8;
					if (var0.anInt1694 < var5)
						var0.anInt1694 = var5;
				}

				if ((var4 == var0.anInt1695) && (var5 == var0.anInt1694)) {
					--var0.anInt1744;
					if (var0.anInt1735 > 0)
						--var0.anInt1735;
				}

			} else {
				var0.anInt1695 = var4;
				var0.anInt1694 = var5;
			}
		}
	}
}
