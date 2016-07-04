public class Class102_Sub1 extends Class102 {
	static Class99 aClass99_895;
	static Class53 aClass53_896;
	String aString894;
	short aShort893;

	Class102_Sub1(final String var1, final int var2) {
		Class71.method332();
		aString894 = var1;
		aShort893 = (short) var2;
	}

	static void reset() {
		client.aLong1800 = 0L;
		client.anInt1803 = 0;
		Class2_Sub2.aClass72_865.anInt581 = 0;
		Class100.aBool799 = true;
		client.aBool1945 = true;
		Class105.aClass59_825 = new Class59();
		client.secureBuf.pos = 0;
		client.gamecon.pos = 0;
		client.pktOpc = -1;
		client.anInt1837 = -1;
		client.anInt2042 = -1;
		client.anInt1815 = -1;
		client.anInt1834 = 0;
		client.anInt1879 = 0;
		client.anInt1836 = 0;
		client.anInt1797 = 0;
		client.anInt1805 = 0;
		client.aBool1930 = false;
		Class104_Sub16.method553(0);

		int var0;
		for (var0 = 0; var0 < 100; ++var0)
			client.aStringArray2001[var0] = null;

		client.anInt2000 = 0;
		client.anInt1941 = 0;
		client.aBool1943 = false;
		client.anInt2028 = 0;
		client.anInt1986 = (int) (Math.random() * 100.0D) - 50;
		client.anInt1857 = (int) (Math.random() * 110.0D) - 55;
		client.anInt1859 = (int) (Math.random() * 80.0D) - 40;
		client.anInt1862 = (int) (Math.random() * 120.0D) - 60;
		client.anInt1921 = (int) (Math.random() * 30.0D) - 20;
		client.anInt1866 = ((int) (Math.random() * 20.0D) - 10) & 2047;
		client.anInt2021 = 0;
		client.anInt2013 = -1;
		client.anInt2018 = 0;
		client.anInt1880 = 0;
		client.toUpdate = 0;
		client.anInt1832 = 0;

		for (var0 = 0; var0 < 2048; ++var0) {
			client.localNpcs[var0] = null;
			client.cachedAppearances[var0] = null;
		}

		for (var0 = 0; var0 < '\u8000'; ++var0)
			client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var0] = null;

		Class81.pf = client.localNpcs[2047] = new Player();
		client.aClass59_1923.method247();
		client.aClass59_1869.method247();

		int var2;
		for (var0 = 0; var0 < 4; ++var0)
			for (int var1 = 0; var1 < 104; ++var1)
				for (var2 = 0; var2 < 104; ++var2)
					client.aClass59ArrayArrayArray1952[var0][var1][var2] = null;

		client.aClass59_1922 = new Class59();
		client.anInt2024 = 0;
		client.anInt1935 = 0;

		for (var0 = 0; var0 < ObjectDefinition.anInt1373; ++var0) {
			final Class104_Sub18_Sub11 var3 = Class104_Sub23.method622(var0);
			if ((null != var3) && (var3.anInt1412 == 0)) {
				Class71.anIntArray577[var0] = 0;
				Class71.anIntArray576[var0] = 0;
			}
		}

		for (var0 = 0; var0 < client.anIntArray1981.length; ++var0)
			client.anIntArray1981[var0] = -1;

		if (client.currentWidget != -1) {
			var0 = client.currentWidget;
			if ((var0 != -1) && Class103.loaded[var0]) {
				Widget.requester.method276(var0, -1405441036);
				if (null != Class22.widgets[var0]) {
					boolean var5 = true;

					for (var2 = 0; var2 < Class22.widgets[var0].length; ++var2)
						if (Class22.widgets[var0][var2] != null)
							if (Class22.widgets[var0][var2].anInt980 != 2)
								Class22.widgets[var0][var2] = null;
							else
								var5 = false;

					if (var5)
						Class22.widgets[var0] = null;

					Class103.loaded[var0] = false;
				}
			}
		}

		for (Nodee var4 = (Nodee) client.aClass58_1795
				.method245(); null != var4; var4 = (Nodee) client.aClass58_1795.method243())
			Class13.method56(var4, true);

		client.currentWidget = -1;
		client.aClass58_1795 = new Class58(8);
		client.aClass104_Sub12_1951 = null;
		client.aBool1930 = false;
		client.anInt1805 = 0;
		client.aClass85_2047.method383((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			client.aStringArray1918[var0] = null;
			client.aBoolArray1919[var0] = false;
		}

		Class104_Sub2.aClass58_857 = new Class58(32);
		client.aBool1798 = true;

		for (var0 = 0; var0 < 100; ++var0)
			client.rsfacesFlag[var0] = true;

		client.aString1829 = null;
		Class89.anInt704 = 0;
		Class104_Sub13.aClass104_Sub7Array1099 = null;
	}

	static final void method496(final int var0, final int var1) {
		final Class59 var2 = client.aClass59ArrayArrayArray1952[Class12.anInt73][var0][var1];
		if (var2 == null)
			Class81.aClass17_643.method110(Class12.anInt73, var0, var1);
		else {
			int var3 = -99999999;
			Class104_Sub18_Sub16_Sub6 var4 = null;

			Class104_Sub18_Sub16_Sub6 var5;
			for (var5 = (Class104_Sub18_Sub16_Sub6) var2
					.method251(); var5 != null; var5 = (Class104_Sub18_Sub16_Sub6) var2.method252()) {
				final ItemDef var6 = Class27.forId(var5.anInt1691);
				int var7 = var6.anInt1453;
				if (var6.anInt1431 == 1)
					var7 *= var5.anInt1692 + 1;

				if (var7 > var3) {
					var3 = var7;
					var4 = var5;
				}
			}

			if (null == var4)
				Class81.aClass17_643.method110(Class12.anInt73, var0, var1);
			else {
				var2.method255(var4);
				Class104_Sub18_Sub16_Sub6 var10 = null;
				Class104_Sub18_Sub16_Sub6 var8 = null;

				for (var5 = (Class104_Sub18_Sub16_Sub6) var2
						.method251(); var5 != null; var5 = (Class104_Sub18_Sub16_Sub6) var2.method252())
					if (var4.anInt1691 != var5.anInt1691) {
						if (null == var10)
							var10 = var5;

						if ((var10.anInt1691 != var5.anInt1691) && (var8 == null))
							var8 = var5;
					}

				final int var9 = (var1 << 7) + var0 + 1610612736;
				Class81.aClass17_643.method74(Class12.anInt73, var0, var1,
						Class47.method211((128 * var0) + 64, 64 + (var1 * 128), Class12.anInt73), var4, var9, var10,
						var8);
			}
		}
	}

	static final void method497(final long var0) {
		try {
			Thread.sleep(var0);
		} catch (final InterruptedException var3) {
			;
		}

	}
}
