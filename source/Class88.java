public class Class88 {
	static int[] anIntArray700;
	static Class16 aClass16_701;

	static void method401(final Applet_Sub1 var0) {
		if (Class66.aBool541)
			Class71.method331(var0);
		else {
			int var2;
			int var3;
			if ((Class14.anInt100 == 1) && (Class14.anInt101 >= 715) && (Class14.anInt102 >= 453)) {
				Class66.aBool527 = !Class66.aBool527;
				if (!Class66.aBool527) {
					final Class61_Sub1 var1 = Class27.aClass61_Sub1_264;
					var2 = var1.method271("scape main");
					var3 = var1.method273(var2, "");
					Class87.method400(var1, var2, var3, 255, false);
				} else
					Class28.method138();
			}

			if (client.anInt1806 != 5) {
				++Class66.anInt532;
				if (client.anInt1806 == 10) {
					if (client.anInt1913 == 0) {
						if (Class14.anInt100 == 1) {
							final byte var4 = 5;
							final short var14 = 463;
							final byte var15 = 100;
							final byte var5 = 35;
							if ((Class14.anInt101 >= var4) && (Class14.anInt101 <= (var15 + var4))
									&& (Class14.anInt102 >= var14) && (Class14.anInt102 <= (var5 + var14))) {
								Class3.method26();
								return;
							}
						}

						if (Class76.aClass70_617 != null)
							Class3.method26();
					}

					final int var16 = Class14.anInt100;
					var2 = Class14.anInt101;
					var3 = Class14.anInt102;
					short var6;
					short var17;
					if (Class66.anInt536 == 0) {
						var17 = 302;
						var6 = 291;
						if ((var16 == 1) && (var2 >= (var17 - 75)) && (var2 <= (var17 + 75)) && (var3 >= (var6 - 20))
								&& (var3 <= (var6 + 20))) {
							Class66.anInt536 = 3;
							Class66.anInt535 = 0;
						}

						var17 = 462;
						if ((var16 == 1) && (var2 >= (var17 - 75)) && (var2 <= (75 + var17)) && (var3 >= (var6 - 20))
								&& (var3 <= (var6 + 20))) {
							Class66.aString537 = "";
							Class66.aString516 = "Enter your username/email & password.";
							Class66.aString539 = "";
							Class66.anInt536 = 2;
							Class66.anInt535 = 0;
						}
					} else if (Class66.anInt536 == 2) {
						var17 = 231;
						int var18 = var17 + 30;
						if ((var16 == 1) && (var3 >= (var18 - 15)) && (var3 < var18))
							Class66.anInt535 = 0;

						var18 += 15;
						if ((var16 == 1) && (var3 >= (var18 - 15)) && (var3 < var18))
							Class66.anInt535 = 1;

						var18 += 15;
						var6 = 302;
						final short var7 = 321;
						if ((var16 == 1) && (var2 >= (var6 - 75)) && (var2 <= (75 + var6)) && (var3 >= (var7 - 20))
								&& (var3 <= (var7 + 20))) {
							Class66.aString543 = Class66.aString543.trim();
							if (Class66.aString543.length() == 0) {
								Class104_Sub18_Sub2.method680("", "Please enter your username/email address.", "");
								return;
							}

							if (Class66.aString522.length() == 0) {
								Class104_Sub18_Sub2.method680("", "Please enter your password.", "");
								return;
							}

							Class104_Sub18_Sub2.method680("", "Connecting to server...", "");
							Class10.method40(20);
							return;
						}

						var6 = 462;
						if ((var16 == 1) && (var2 >= (var6 - 75)) && (var2 <= (75 + var6)) && (var3 >= (var7 - 20))
								&& (var3 <= (var7 + 20))) {
							Class66.anInt536 = 0;
							Class66.aString543 = "";
							Class66.aString522 = "";
						}

						while (true)
							while (true) {
								final Class25 var8 = Class25.aClass25_248;
								boolean var9;
								synchronized (var8) {
									if (Class25.anInt254 == Class25.anInt246)
										var9 = false;
									else {
										Class80.anInt633 = Class25.anIntArray253[Class25.anInt254];
										Class50.aChar423 = Class25.aCharArray252[Class25.anInt254];
										Class25.anInt254 = (1 + Class25.anInt254) & 127;
										var9 = true;
									}
								}

								if (!var9)
									return;

								boolean var11 = false;

								for (int var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
										.length(); ++var12)
									if (Class50.aChar423 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
											.charAt(var12)) {
										var11 = true;
										break;
									}

								if (Class66.anInt535 == 0) {
									if ((Class80.anInt633 == 85) && (Class66.aString543.length() > 0))
										Class66.aString543 = Class66.aString543.substring(0,
												Class66.aString543.length() - 1);

									if ((Class80.anInt633 == 84) || (Class80.anInt633 == 80))
										Class66.anInt535 = 1;

									if (var11 && (Class66.aString543.length() < 320))
										Class66.aString543 = Class66.aString543 + Class50.aChar423;
								} else if (Class66.anInt535 == 1) {
									if ((Class80.anInt633 == 85) && (Class66.aString522.length() > 0))
										Class66.aString522 = Class66.aString522.substring(0,
												Class66.aString522.length() - 1);

									if ((Class80.anInt633 == 84) || (Class80.anInt633 == 80))
										Class66.anInt535 = 0;

									if ((client.anInt1792 == 2) && (Class80.anInt633 == 84)) {
										Class66.aString543 = Class66.aString543.trim();
										if (Class66.aString543.length() == 0) {
											Class104_Sub18_Sub2.method680("",
													"Please enter your username/email address.", "");
											return;
										}

										if (Class66.aString522.length() == 0) {
											Class104_Sub18_Sub2.method680("", "Please enter your password.", "");
											return;
										}

										Class104_Sub18_Sub2.method680("", "Connecting to server...", "");
										Class10.method40(20);
										return;
									}

									if (var11 && (Class66.aString522.length() < 20))
										Class66.aString522 = Class66.aString522 + Class50.aChar423;
								}
							}
					} else if (Class66.anInt536 == 3) {
						var17 = 382;
						var6 = 321;
						if ((var16 == 1) && (var2 >= (var17 - 75)) && (var2 <= (75 + var17)) && (var3 >= (var6 - 20))
								&& (var3 <= (var6 + 20)))
							Class66.anInt536 = 0;
					}

				}
			}
		}
	}

	public static Class104_Sub18_Sub17_Sub1 method402(final Class61 var0, final String var1, final String var2) {
		final int var3 = var0.method271(var1);
		final int var4 = var0.method273(var3, var2);
		Class104_Sub18_Sub17_Sub1 var5;
		if (!Class39.method181(var0, var3, var4))
			var5 = null;
		else
			var5 = Class34.method164();

		return var5;
	}

	static int method403(final int var0, final int var1) {
		final Class104_Sub2 var2 = (Class104_Sub2) Class104_Sub2.aClass58_857.method241(var0);
		return null == var2 ? 0 : ((var1 >= 0) && (var1 < var2.anIntArray858.length) ? var2.anIntArray858[var1] : 0);
	}

	static void method404(final int var0) {
		if (var0 != -1)
			if (Class104_Sub7.method508(var0)) {
				final Class104_Sub12[] var1 = Class22.aClass104_Sub12ArrayArray228[var0];

				for (final Class104_Sub12 var3 : var1) {
					if (var3.anObjectArray970 != null) {
						final Class104_Sub6 var4 = new Class104_Sub6();
						var4.aClass104_Sub12_938 = var3;
						var4.anObjectArray936 = var3.anObjectArray970;
						Class46.method203(var4);
					}
				}

			}
	}

	static final void method405() {
		for (Class104_Sub18_Sub16_Sub2 var0 = (Class104_Sub18_Sub16_Sub2) client.aClass59_1923
				.method251(); null != var0; var0 = (Class104_Sub18_Sub16_Sub2) client.aClass59_1923.method252())
			if ((var0.anInt1506 == Class12.anInt73) && (client.anInt1799 <= var0.anInt1496)) {
				if (client.anInt1799 >= var0.anInt1495) {
					if (var0.anInt1505 > 0) {
						final Class104_Sub18_Sub16_Sub7_Sub2 var1 = client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var0.anInt1505
								- 1];
						if ((var1 != null) && (var1.anInt1695 >= 0) && (var1.anInt1695 < 13312) && (var1.anInt1694 >= 0)
								&& (var1.anInt1694 < 13312))
							var0.method808(var1.anInt1695, var1.anInt1694,
									Class47.method211(var1.anInt1695, var1.anInt1694, var0.anInt1506) - var0.anInt1494,
									client.anInt1799);
					}

					if (var0.anInt1505 < 0) {
						final int var2 = -var0.anInt1505 - 1;
						Class104_Sub18_Sub16_Sub7_Sub1 var3;
						if (client.anInt1874 == var2)
							var3 = Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644;
						else
							var3 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var2];

						if ((var3 != null) && (var3.anInt1695 >= 0) && (var3.anInt1695 < 13312) && (var3.anInt1694 >= 0)
								&& (var3.anInt1694 < 13312))
							var0.method808(var3.anInt1695, var3.anInt1694,
									Class47.method211(var3.anInt1695, var3.anInt1694, var0.anInt1506) - var0.anInt1494,
									client.anInt1799);
					}

					var0.method807(client.anInt1867);
					Class81.aClass17_643.method97(Class12.anInt73, (int) var0.aDouble1503, (int) var0.aDouble1502,
							(int) var0.aDouble1499, 60, var0, var0.anInt1509, -1, false);
				}
			} else
				var0.method470();

	}
}
