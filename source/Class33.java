public final class Class33 {
	int anInt331;
	int anInt332;
	int anInt333;
	int anInt334;
	int anInt335;
	int anInt336;
	int anInt337;
	public Class104_Sub18_Sub16 aClass104_Sub18_Sub16_338;
	public Class104_Sub18_Sub16 aClass104_Sub18_Sub16_339;
	public int anInt340 = 0;
	int anInt341 = 0;

	public static String method155(final CharSequence var0, final Class101 var1) {
		if (null == var0)
			return null;
		else {
			int var2 = 0;

			int var3;
			char var4;
			boolean var5;
			for (var3 = var0.length(); var2 < var3; ++var2) {
				var4 = var0.charAt(var2);
				var5 = (var4 == 160) || (var4 == 32) || (var4 == 95) || (var4 == 45);
				if (!var5)
					break;
			}

			while (var3 > var2) {
				var4 = var0.charAt(var3 - 1);
				var5 = (var4 == 160) || (var4 == 32) || (var4 == 95) || (var4 == 45);
				if (!var5)
					break;

				--var3;
			}

			final int var11 = var3 - var2;
			if (var11 >= 1) {
				byte var6;
				if (null == var1)
					var6 = 12;
				else
					switch (var1.anInt809) {
					case 3:
						var6 = 20;
						break;
					default:
						var6 = 12;
					}

				if (var11 <= var6) {
					final StringBuilder var7 = new StringBuilder(var11);

					for (int var12 = var2; var12 < var3; ++var12) {
						final char var8 = var0.charAt(var12);
						if (Class21.method122(var8)) {
							char var9;
							switch (var8) {
							case '\u0020':
							case '\u002d':
							case '\u005f':
							case '\u00a0':
								var9 = 95;
								break;
							case '\u0023':
							case '\u005b':
							case '\u005d':
								var9 = var8;
								break;
							case '\u00c0':
							case '\u00c1':
							case '\u00c2':
							case '\u00c3':
							case '\u00c4':
							case '\u00e0':
							case '\u00e1':
							case '\u00e2':
							case '\u00e3':
							case '\u00e4':
								var9 = 97;
								break;
							case '\u00c7':
							case '\u00e7':
								var9 = 99;
								break;
							case '\u00c8':
							case '\u00c9':
							case '\u00ca':
							case '\u00cb':
							case '\u00e8':
							case '\u00e9':
							case '\u00ea':
							case '\u00eb':
								var9 = 101;
								break;
							case '\u00cd':
							case '\u00ce':
							case '\u00cf':
							case '\u00ed':
							case '\u00ee':
							case '\u00ef':
								var9 = 105;
								break;
							case '\u00d1':
							case '\u00f1':
								var9 = 110;
								break;
							case '\u00d2':
							case '\u00d3':
							case '\u00d4':
							case '\u00d5':
							case '\u00d6':
							case '\u00f2':
							case '\u00f3':
							case '\u00f4':
							case '\u00f5':
							case '\u00f6':
								var9 = 111;
								break;
							case '\u00d9':
							case '\u00da':
							case '\u00db':
							case '\u00dc':
							case '\u00f9':
							case '\u00fa':
							case '\u00fb':
							case '\u00fc':
								var9 = 117;
								break;
							case '\u00df':
								var9 = 98;
								break;
							case '\u00ff':
							case '\u0178':
								var9 = 121;
								break;
							default:
								var9 = Character.toLowerCase(var8);
							}

							if (var9 != 0)
								var7.append(var9);
						}
					}

					if (var7.length() == 0)
						return null;

					return var7.toString();
				}
			}

			return null;
		}
	}

	public static int method156(final CharSequence var0, final int var1, final int var2, final byte[] var3,
			final int var4) {
		final int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			final char var7 = var0.charAt(var6 + var1);
			if (((var7 <= 0) || (var7 >= 128)) && ((var7 < 160) || (var7 > 255))) {
				if (var7 == 8364)
					var3[var4 + var6] = -128;
				else if (var7 == 8218)
					var3[var4 + var6] = -126;
				else if (var7 == 402)
					var3[var4 + var6] = -125;
				else if (var7 == 8222)
					var3[var4 + var6] = -124;
				else if (var7 == 8230)
					var3[var4 + var6] = -123;
				else if (var7 == 8224)
					var3[var4 + var6] = -122;
				else if (var7 == 8225)
					var3[var4 + var6] = -121;
				else if (var7 == 710)
					var3[var4 + var6] = -120;
				else if (var7 == 8240)
					var3[var6 + var4] = -119;
				else if (var7 == 352)
					var3[var6 + var4] = -118;
				else if (var7 == 8249)
					var3[var4 + var6] = -117;
				else if (var7 == 338)
					var3[var4 + var6] = -116;
				else if (var7 == 381)
					var3[var6 + var4] = -114;
				else if (var7 == 8216)
					var3[var4 + var6] = -111;
				else if (var7 == 8217)
					var3[var6 + var4] = -110;
				else if (var7 == 8220)
					var3[var4 + var6] = -109;
				else if (var7 == 8221)
					var3[var6 + var4] = -108;
				else if (var7 == 8226)
					var3[var4 + var6] = -107;
				else if (var7 == 8211)
					var3[var6 + var4] = -106;
				else if (var7 == 8212)
					var3[var6 + var4] = -105;
				else if (var7 == 732)
					var3[var4 + var6] = -104;
				else if (var7 == 8482)
					var3[var4 + var6] = -103;
				else if (var7 == 353)
					var3[var6 + var4] = -102;
				else if (var7 == 8250)
					var3[var4 + var6] = -101;
				else if (var7 == 339)
					var3[var6 + var4] = -100;
				else if (var7 == 382)
					var3[var6 + var4] = -98;
				else if (var7 == 376)
					var3[var6 + var4] = -97;
				else
					var3[var6 + var4] = 63;
			} else
				var3[var4 + var6] = (byte) var7;
		}

		return var5;
	}

	public static boolean method157(final int var0) {
		return (var0 & 1) != 0;
	}

	static final void method158() {
		Class104_Sub18_Sub7.aClass56_1381.method239();
		Class104_Sub18_Sub11.method769();
		Class104_Sub18_Sub9.aClass56_1393.method239();
		Class26.method135();
		Class103.method469();
		Class104_Sub18_Sub12.aClass56_1415.method239();
		Class104_Sub18_Sub12.aClass56_1416.method239();
		Class104_Sub18_Sub12.aClass56_1417.method239();
		Class87.method398();
		Class104_Sub18_Sub5.aClass56_1305.method239();
		Class104_Sub18_Sub5.aClass56_1318.method239();
		Class104_Sub18_Sub8.aClass56_1387.method239();
		Class97.method441();
		Class26.method131();
		Class61.method281();
		((Class34) Class104_Sub18_Sub17_Sub4.anInterface2_1686).method160();
		Class104_Sub18_Sub4.aClass56_1278.method239();
		Class27.aClass61_Sub1_263.method269();
		Class104_Sub20.aClass61_Sub1_1171.method269();
		Class29.aClass61_Sub1_278.method269();
		Class103.aClass61_Sub1_818.method269();
		Class67.aClass61_Sub1_555.method269();
		Class27.aClass61_Sub1_264.method269();
		Class1.aClass61_Sub1_2.method269();
		client.aClass61_Sub1_1820.method269();
		client.aClass61_Sub1_1838.method269();
		Class2.aClass61_Sub1_9.method269();
		Class106.aClass61_Sub1_827.method269();
		Class85.aClass61_Sub1_671.method269();
	}

	static void method159(final Class57[] var0, final int var1, final int var2, final int[] var3, final int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = 1 + var2;
			final int var7 = (var2 + var1) / 2;
			final Class57 var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].anInt461;
							var12 = var8.anInt461;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].anInt460;
							var12 = var8.anInt460;
							if ((var11 == -1) && (var4[var10] == 1))
								var11 = 2001;

							if ((var12 == -1) && (var4[var10] == 1))
								var12 = 2001;
						} else if (var3[var10] == 3) {
							var11 = var0[var6].aBool464 ? 1 : 0;
							var12 = var8.aBool464 ? 1 : 0;
						} else {
							var11 = var0[var6].anInt463;
							var12 = var8.anInt463;
						}

						if (var12 != var11) {
							if (((var4[var10] != 1) || (var11 <= var12)) && ((var4[var10] != 0) || (var11 >= var12)))
								var9 = false;
							break;
						}

						if (var10 == 3)
							var9 = false;
					}
				} while (var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].anInt461;
							var12 = var8.anInt461;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].anInt460;
							var12 = var8.anInt460;
							if ((var11 == -1) && (var4[var10] == 1))
								var11 = 2001;

							if ((var12 == -1) && (var4[var10] == 1))
								var12 = 2001;
						} else if (var3[var10] == 3) {
							var11 = var0[var5].aBool464 ? 1 : 0;
							var12 = var8.aBool464 ? 1 : 0;
						} else {
							var11 = var0[var5].anInt463;
							var12 = var8.anInt463;
						}

						if (var12 != var11) {
							if (((var4[var10] != 1) || (var11 >= var12)) && ((var4[var10] != 0) || (var11 <= var12)))
								var9 = false;
							break;
						}

						if (var10 == 3)
							var9 = false;
					}
				} while (var9);

				if (var5 < var6) {
					final Class57 var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			method159(var0, var1, var6, var3, var4);
			method159(var0, 1 + var6, var2, var3, var4);
		}

	}
}
