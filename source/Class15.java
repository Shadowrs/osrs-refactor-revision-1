public class Class15 {
	protected static int anInt110;
	int anInt109;
	int anInt107;
	int anInt108;
	int anInt106;

	Class15(final Class15 var1) {
		anInt109 = var1.anInt109;
		anInt107 = var1.anInt107;
		anInt108 = var1.anInt108;
		anInt106 = var1.anInt106;
	}

	Class15() {
	}

	static Class104_Sub18_Sub17_Sub3 method57() {
		final Class104_Sub18_Sub17_Sub3 var0 = new Class104_Sub18_Sub17_Sub3();
		var0.anInt1622 = Class12.anInt72;
		var0.anInt1623 = Class12.anInt69;
		var0.anInt1620 = Class12.anIntArray70[0];
		var0.anInt1621 = Class12.anIntArray71[0];
		var0.anInt1618 = Class78.anIntArray626[0];
		var0.anInt1619 = Class69.anIntArray564[0];
		var0.anIntArray1617 = Class12.anIntArray68;
		var0.aByteArray1616 = Class41.aByteArrayArray368[0];
		Class12.anIntArray70 = null;
		Class12.anIntArray71 = null;
		Class78.anIntArray626 = null;
		Class69.anIntArray564 = null;
		Class12.anIntArray68 = null;
		Class41.aByteArrayArray368 = null;
		return var0;
	}

	public static int method58(final CharSequence var0, final int var1) {
		return Class66.method299(var0, var1, true);
	}

	static void method59(final int var0, final String var1) {
		final String var2 = Class44.method189(var1);
		String var3 = Class32.method151(Class65.method297(var2));
		if (null == var3)
			var3 = "";

		var3 = var3;
		boolean var5 = false;

		for (int var6 = 0; var6 < client.anInt1994; ++var6) {
			final Class104_Sub18_Sub16_Sub7_Sub1 var7 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[client.anIntArray1909[var6]];
			if ((null != var7) && (var7.aString1780 != null) && var7.aString1780.equalsIgnoreCase(var3)) {
				Class104_Sub13.method543(Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1745[0],
						Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1746[0], var7.anIntArray1745[0],
						var7.anIntArray1746[0], false, 0, 0, 1, 1, 0, 2);
				if (var0 == 1) {
					client.aClass104_Sub21_Sub1_1825.method623(246);
					client.aClass104_Sub21_Sub1_1825.method603(client.anIntArray1909[var6]);
				} else if (var0 == 4) {
					client.aClass104_Sub21_Sub1_1825.method623(78);
					client.aClass104_Sub21_Sub1_1825.method603(client.anIntArray1909[var6]);
				} else if (var0 == 6) {
					client.aClass104_Sub21_Sub1_1825.method623(111);
					client.aClass104_Sub21_Sub1_1825.method592(client.anIntArray1909[var6]);
				} else if (var0 == 7) {
					client.aClass104_Sub21_Sub1_1825.method623(119);
					client.aClass104_Sub21_Sub1_1825.method592(client.anIntArray1909[var6]);
				}

				var5 = true;
				break;
			}
		}

		if (!var5)
			method60(0, "", "Unable to find " + var3);

	}

	static final void method60(final int var0, final String var1, final String var2) {
		Class43.method188(var0, var1, var2, (String) null);
	}

	static final void method61(final String var0) {
		if (null != var0) {
			final String var1 = Class33.method155(var0, Class2.aClass101_8);
			if (null != var1)
				for (int var2 = 0; var2 < client.anInt1935; ++var2) {
					final Class86 var3 = client.aClass86Array1972[var2];
					final String var4 = var3.aString675;
					final String var5 = Class33.method155(var4, Class2.aClass101_8);
					boolean var6;
					if ((var0 != null) && (var4 != null)) {
						if (!var0.startsWith("#") && !var4.startsWith("#"))
							var6 = var1.equals(var5);
						else
							var6 = var0.equals(var4);
					} else
						var6 = false;

					if (var6) {
						--client.anInt1935;

						for (int var7 = var2; var7 < client.anInt1935; ++var7)
							client.aClass86Array1972[var7] = client.aClass86Array1972[1 + var7];

						client.anInt1846 = client.anInt1978;
						client.aClass104_Sub21_Sub1_1825.method623(41);
						client.aClass104_Sub21_Sub1_1825.method561(Class104_Sub21_Sub1.method630(var0));
						client.aClass104_Sub21_Sub1_1825.method563(var0);
						break;
					}
				}
		}
	}

	static final void method62(final Class104_Sub12[] var0, final int var1) {
		for (final Class104_Sub12 var3 : var0) {
			if (null != var3) {
				if (var3.anInt980 == 0) {
					if (null != var3.aClass104_Sub12Array1020)
						method62(var3.aClass104_Sub12Array1020, var1);

					final Class104_Sub9 var4 = (Class104_Sub9) client.aClass58_1795.method241(var3.anInt978);
					if (var4 != null)
						Class9.method36(var4.anInt957, var1);
				}

				Class104_Sub6 var5;
				if ((var1 == 0) && (var3.anObjectArray1014 != null)) {
					var5 = new Class104_Sub6();
					var5.aClass104_Sub12_938 = var3;
					var5.anObjectArray936 = var3.anObjectArray1014;
					Class46.method203(var5);
				}

				if ((var1 == 1) && (null != var3.anObjectArray1073)) {
					if (var3.anInt1018 >= 0) {
						final Class104_Sub12 var6 = Class47.method210(var3.anInt978);
						if ((var6 == null) || (null == var6.aClass104_Sub12Array1020)
								|| (var3.anInt1018 >= var6.aClass104_Sub12Array1020.length)
								|| (var6.aClass104_Sub12Array1020[var3.anInt1018] != var3))
							continue;
					}

					var5 = new Class104_Sub6();
					var5.aClass104_Sub12_938 = var3;
					var5.anObjectArray936 = var3.anObjectArray1073;
					Class46.method203(var5);
				}
			}
		}

	}
}