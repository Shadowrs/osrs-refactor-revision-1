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

	public static int writeInto(final CharSequence seq, final int offset, final int length, final byte[] to,
			final int start) {
		final int max = length - offset;

		for (int i = 0; i < max; ++i) {
			final char c = seq.charAt(i + offset);
			if (((c <= 0) || (c >= 128)) && ((c < 160) || (c > 255))) {
				if (c == 8364)
					to[start + i] = -128;
				else if (c == 8218)
					to[start + i] = -126;
				else if (c == 402)
					to[start + i] = -125;
				else if (c == 8222)
					to[start + i] = -124;
				else if (c == 8230)
					to[start + i] = -123;
				else if (c == 8224)
					to[start + i] = -122;
				else if (c == 8225)
					to[start + i] = -121;
				else if (c == 710)
					to[start + i] = -120;
				else if (c == 8240)
					to[i + start] = -119;
				else if (c == 352)
					to[i + start] = -118;
				else if (c == 8249)
					to[start + i] = -117;
				else if (c == 338)
					to[start + i] = -116;
				else if (c == 381)
					to[i + start] = -114;
				else if (c == 8216)
					to[start + i] = -111;
				else if (c == 8217)
					to[i + start] = -110;
				else if (c == 8220)
					to[start + i] = -109;
				else if (c == 8221)
					to[i + start] = -108;
				else if (c == 8226)
					to[start + i] = -107;
				else if (c == 8211)
					to[i + start] = -106;
				else if (c == 8212)
					to[i + start] = -105;
				else if (c == 732)
					to[start + i] = -104;
				else if (c == 8482)
					to[start + i] = -103;
				else if (c == 353)
					to[i + start] = -102;
				else if (c == 8250)
					to[start + i] = -101;
				else if (c == 339)
					to[i + start] = -100;
				else if (c == 382)
					to[i + start] = -98;
				else if (c == 376)
					to[i + start] = -97;
				else
					to[i + start] = 63;
			} else
				to[start + i] = (byte) c;
		}

		return max;
	}

	public static boolean method157(final int var0) {
		return (var0 & 1) != 0;
	}

	static final void method158() {
		Class104_Sub18_Sub7.aClass56_1381.method239();
		Class104_Sub18_Sub11.method769();
		Def2.aClass56_1393.method239();
		Class26.method135();
		Class103.method469();
		ItemDef.aClass56_1415.method239();
		ItemDef.aClass56_1416.method239();
		ItemDef.aClass56_1417.method239();
		Class87.method398();
		Class104_Sub18_Sub5.aClass56_1305.method239();
		Class104_Sub18_Sub5.aClass56_1318.method239();
		Class104_Sub18_Sub8.aClass56_1387.method239();
		Class97.method441();
		Class26.method131();
		Class61.method281();
		((Class34) Class104_Sub18_Sub17_Sub4.anInterface2_1686).method160();
		CS2.aClass56_1278.method239();
		Class27.aClass61_Sub1_263.clearFiles();
		Class104_Sub20.aClass61_Sub1_1171.clearFiles();
		Class29.aClass61_Sub1_278.clearFiles();
		Class103.aClass61_Sub1_818.clearFiles();
		Class67.fs.clearFiles();
		Class27.aClass61_Sub1_264.clearFiles();
		Class1.aClass61_Sub1_2.clearFiles();
		client.aClass61_Sub1_1820.clearFiles();
		client.aClass61_Sub1_1838.clearFiles();
		Class2.aClass61_Sub1_9.clearFiles();
		Class106.aClass61_Sub1_827.clearFiles();
		Looks.aClass61_Sub1_671.clearFiles();
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
