import java.awt.Graphics;

public final class BZip2Context {
	byte[] packedData;
	int leng;
	byte aByte296;
	int anInt300;
	byte[] decompressedData;
	int anInt303;
	int anInt304;
	int anInt306;
	int anInt307;
	int anInt308;
	int anInt309;
	int anInt310;
	int anInt311;
	int anInt312;
	static int[] anIntArray316;
	int anInt317;
	int anInt326;
	int anInt325 = 4096;
	int anInt305 = 16;
	int anInt293 = 258;
	int anInt314 = 6;
	int anInt324 = 50;
	int anInt297 = 18002;
	int blockSize = 0;
	int anInt302 = 0;
	int[] anIntArray292 = new int[256];
	int[] anIntArray315 = new int[257];
	boolean[] aBoolArray318 = new boolean[256];
	boolean[] aBoolArray319 = new boolean[16];
	byte[] aByteArray320 = new byte[256];
	byte[] aByteArray330 = new byte[4096];
	int[] anIntArray322 = new int[16];
	byte[] aByteArray321 = new byte[18002];
	byte[] aByteArray313 = new byte[18002];
	byte[][] aByteArrayArray323 = new byte[6][258];
	int[][] anIntArrayArray298 = new int[6][258];
	int[][] anIntArrayArray327 = new int[6][258];
	int[][] anIntArrayArray328 = new int[6][258];
	int[] anIntArray329 = new int[6];

	public static String method151(long var0) {
		if ((var0 > 0L) && (var0 < 6582952005840035281L)) {
			if ((var0 % 37L) == 0L)
				return null;
			else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L)
					++var2;

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
					final long var6 = var0;
					var0 /= 37L;
					var8 = Class65.aCharArray514[(int) (var6 - (37L * var0))];
					if (var8 == 95) {
						final int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else
			return null;
	}

	public static int method152(final int var0, final int var1, int var2, int var3, int var4, final int var5) {
		if ((var5 & 1) == 1) {
			final int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		return var2 == 0 ? var1 : (var2 == 1 ? 7 - var0 - (var3 - 1) : (var2 == 2 ? 7 - var1 - (var4 - 1) : var0));
	}

	static void method153(final Class104_Sub18_Sub17_Sub2_Sub1 var0, final Class104_Sub18_Sub17_Sub2_Sub1 var1) {
		if (Class66.aBool541)
			Class104_Sub1.method478(var0, var1);
		else {
			byte var2;
			int var3;
			if ((client.loadstage == 0) || (client.loadstage == 5)) {
				var2 = 20;
				var0.method882("RuneScape is loading - please wait...", 382, 245 - var2, 16777215, -1);
				var3 = 253 - var2;
				Class104_Sub18_Sub17.method806(230, var3, 304, 34, 9179409);
				Class104_Sub18_Sub17.method806(231, var3 + 1, 302, 32, 0);
				Class104_Sub18_Sub17.method805(232, var3 + 2, Class66.anInt534 * 3, 30, 9179409);
				Class104_Sub18_Sub17.method805(232 + (Class66.anInt534 * 3), var3 + 2, 300 - (Class66.anInt534 * 3), 30,
						0);
				var0.method882(Class66.aString540, 382, 276 - var2, 16777215, -1);
			}

			String var4;
			String var6;
			String var7;
			String var8;
			short var20;
			int var21;
			short var22;
			if (client.loadstage == 20) {
				Class66.aClass104_Sub18_Sub17_Sub3_523.method889(
						382 - (Class66.aClass104_Sub18_Sub17_Sub3_523.anInt1618 / 2),
						271 - (Class66.aClass104_Sub18_Sub17_Sub3_523.anInt1619 / 2));
				var20 = 211;
				var0.method882(Class66.aString537, 382, var20, 16776960, 0);
				var21 = var20 + 15;
				var0.method882(Class66.aString516, 382, var21, 16776960, 0);
				var21 += 15;
				var0.method882(Class66.aString539, 382, var21, 16776960, 0);
				var21 += 15;
				var21 += 10;
				var0.drawstr("Login: ", 272, var21, 16777215, 0);
				var22 = 200;

				for (var4 = Class66.aString543; var0.method883(var4) > var22; var4 = var4.substring(0,
						var4.length() - 1))
					;

				var0.drawstr(Class104_Sub18_Sub17_Sub2.method879(var4), 312, var21, 16777215, 0);
				var21 += 15;
				var6 = "Password: ";
				var7 = Class66.aString522;
				var8 = Class29.method140('\u002a', var7.length());
				var0.drawstr(var6 + var8, 274, var21, 16777215, 0);
				var21 += 15;
			}

			if (client.loadstage == 10) {
				Class66.aClass104_Sub18_Sub17_Sub3_523.method889(202, 171);
				short var9;
				if (Class66.anInt536 == 0) {
					var20 = 251;
					var0.method882("Welcome to RuneScape", 382, var20, 16776960, 0);
					var21 = var20 + 30;
					var22 = 302;
					var9 = 291;
					Class66.aClass104_Sub18_Sub17_Sub3_538.method889(var22 - 73, var9 - 20);
					var0.method865("New User", var22 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var22 = 462;
					Class66.aClass104_Sub18_Sub17_Sub3_538.method889(var22 - 73, var9 - 20);
					var0.method865("Existing User", var22 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Class66.anInt536 == 2) {
					var20 = 211;
					var0.method882(Class66.aString537, 382, var20, 16776960, 0);
					var21 = var20 + 15;
					var0.method882(Class66.aString516, 382, var21, 16776960, 0);
					var21 += 15;
					var0.method882(Class66.aString539, 382, var21, 16776960, 0);
					var21 += 15;
					var21 += 10;
					var0.drawstr("Login: ", 272, var21, 16777215, 0);
					var22 = 200;

					for (var4 = Class66.aString543; var0.method883(var4) > var22; var4 = var4.substring(1))
						;

					var0.drawstr(Class104_Sub18_Sub17_Sub2.method879(var4)
							+ ((Class66.anInt535 == 0) & ((client.anInt1799 % 40) < 20)
									? Class70.method326(16776960) + "|" : ""),
							312, var21, 16777215, 0);
					var21 += 15;
					var6 = "Password: ";
					var7 = Class66.aString522;
					var8 = Class29.method140('\u002a', var7.length());
					var0.drawstr(var6 + var8 + ((Class66.anInt535 == 1) & ((client.anInt1799 % 40) < 20)
							? Class70.method326(16776960) + "|" : ""), 274, var21, 16777215, 0);
					var21 += 15;
					short var10 = 302;
					final short var11 = 321;
					Class66.aClass104_Sub18_Sub17_Sub3_538.method889(var10 - 73, var11 - 20);
					var0.method882("Login", var10, 5 + var11, 16777215, 0);
					var10 = 462;
					Class66.aClass104_Sub18_Sub17_Sub3_538.method889(var10 - 73, var11 - 20);
					var0.method882("Cancel", var10, var11 + 5, 16777215, 0);
				} else if (Class66.anInt536 == 3) {
					var0.method882("How to Play", 382, 211, 16776960, 0);
					var20 = 236;
					var0.method882("To play Old School RuneScape, you will", 382, var20, 16777215, 0);
					var21 = var20 + 15;
					var0.method882("need to be a current RuneScape member,", 382, var21, 16777215, 0);
					var21 += 15;
					var0.method882("and have voted \'Yes\' on the poll on the", 382, var21, 16777215, 0);
					var21 += 15;
					var0.method882("RuneScape home page.", 382, var21, 16777215, 0);
					var21 += 15;
					var22 = 382;
					var9 = 321;
					Class66.aClass104_Sub18_Sub17_Sub3_538.method889(var22 - 73, var9 - 20);
					var0.method882("Cancel", var22, 5 + var9, 16777215, 0);
				}
			}

			int var12;
			int var13;
			int var14;
			int var15;
			int var16;
			int var23;
			int var24;
			int var25;
			if (Class66.anInt532 > 0) {
				var21 = Class66.anInt532;
				var22 = 256;
				Class66.anInt530 += 128 * var21;
				if (Class66.anInt530 > Class14.anIntArray92.length) {
					Class66.anInt530 -= Class14.anIntArray92.length;
					var23 = (int) (Math.random() * 12.0D);
					Class43.method186(Class66.aClass104_Sub18_Sub17_Sub3Array544[var23]);
				}

				var23 = 0;
				var12 = var21 * 128;
				var13 = 128 * (var22 - var21);

				for (var14 = 0; var14 < var13; ++var14) {
					var15 = Class66.anIntArray529[var12 + var23]
							- ((Class14.anIntArray92[(var23 + Class66.anInt530) & (Class14.anIntArray92.length - 1)]
									* var21) / 6);
					if (var15 < 0)
						var15 = 0;

					Class66.anIntArray529[var23++] = var15;
				}

				for (var14 = var22 - var21; var14 < var22; ++var14) {
					var15 = 128 * var14;

					for (var24 = 0; var24 < 128; ++var24) {
						var25 = (int) (Math.random() * 100.0D);
						if ((var25 < 50) && (var24 > 10) && (var24 < 118))
							Class66.anIntArray529[var15 + var24] = 255;
						else
							Class66.anIntArray529[var24 + var15] = 0;
					}
				}

				if (Class66.anInt518 > 0)
					Class66.anInt518 -= var21 * 4;

				if (Class66.anInt528 > 0)
					Class66.anInt528 -= 4 * var21;

				if ((Class66.anInt518 == 0) && (Class66.anInt528 == 0)) {
					var14 = (int) (Math.random() * (2000 / var21));
					if (var14 == 0)
						Class66.anInt518 = 1024;

					if (var14 == 1)
						Class66.anInt528 = 1024;
				}

				for (var14 = 0; var14 < (var22 - var21); ++var14)
					Class66.anIntArray524[var14] = Class66.anIntArray524[var14 + var21];

				for (var14 = var22 - var21; var14 < var22; ++var14) {
					Class66.anIntArray524[var14] = (int) ((Math.sin(Class66.anInt533 / 14.0D) * 16.0D)
							+ (Math.sin(Class66.anInt533 / 15.0D) * 14.0D)
							+ (Math.sin(Class66.anInt533 / 16.0D) * 12.0D));
					++Class66.anInt533;
				}

				Class66.anInt517 += var21;
				var14 = ((client.anInt1799 & 1) + var21) / 2;
				if (var14 > 0) {
					for (var15 = 0; var15 < (Class66.anInt517 * 100); ++var15) {
						var24 = (int) (Math.random() * 124.0D) + 2;
						var25 = (int) (Math.random() * 128.0D) + 128;
						Class66.anIntArray529[var24 + (var25 << 7)] = 192;
					}

					Class66.anInt517 = 0;
					var15 = 0;

					label283: while (true) {
						if (var15 >= var22) {
							var15 = 0;

							while (true) {
								if (var15 >= 128)
									break label283;

								var24 = 0;

								for (var25 = -var14; var25 < var22; ++var25) {
									var16 = 128 * var25;
									if ((var14 + var25) < var22)
										var24 += Class88.anIntArray700[var16 + var15 + (var14 * 128)];

									if ((var25 - (1 + var14)) >= 0)
										var24 -= Class88.anIntArray700[(var16 + var15) - ((1 + var14) * 128)];

									if (var25 >= 0)
										Class66.anIntArray529[var15 + var16] = var24 / (1 + (2 * var14));
								}

								++var15;
							}
						}

						var24 = 0;
						var25 = 128 * var15;

						for (var16 = -var14; var16 < 128; ++var16) {
							if ((var16 + var14) < 128)
								var24 += Class66.anIntArray529[var14 + var25 + var16];

							if ((var16 - (var14 + 1)) >= 0)
								var24 -= Class66.anIntArray529[(var25 + var16) - (var14 + 1)];

							if (var16 >= 0)
								Class88.anIntArray700[var25 + var16] = var24 / (1 + (var14 * 2));
						}

						++var15;
					}
				}

				Class66.anInt532 = 0;
			}

			var20 = 256;
			if (Class66.anInt518 > 0) {
				for (var3 = 0; var3 < 256; ++var3)
					if (Class66.anInt518 > 768)
						Class66.anIntArray525[var3] = Class104_Sub13.method544(Class42.anIntArray371[var3],
								Class48.anIntArray411[var3], 1024 - Class66.anInt518);
					else if (Class66.anInt518 > 256)
						Class66.anIntArray525[var3] = Class48.anIntArray411[var3];
					else
						Class66.anIntArray525[var3] = Class104_Sub13.method544(Class48.anIntArray411[var3],
								Class42.anIntArray371[var3], 256 - Class66.anInt518);
			} else if (Class66.anInt528 > 0) {
				for (var3 = 0; var3 < 256; ++var3)
					if (Class66.anInt528 > 768)
						Class66.anIntArray525[var3] = Class104_Sub13.method544(Class42.anIntArray371[var3],
								Class66.anIntArray526[var3], 1024 - Class66.anInt528);
					else if (Class66.anInt528 > 256)
						Class66.anIntArray525[var3] = Class66.anIntArray526[var3];
					else
						Class66.anIntArray525[var3] = Class104_Sub13.method544(Class66.anIntArray526[var3],
								Class42.anIntArray371[var3], 256 - Class66.anInt528);
			} else
				for (var3 = 0; var3 < 256; ++var3)
					Class66.anIntArray525[var3] = Class42.anIntArray371[var3];

			Class104_Sub18_Sub17.method800(0, 9, 128, var20 + 7);
			Class66.aClass104_Sub18_Sub17_Sub1_531.method838(0, 0);
			Class104_Sub18_Sub17.method791();
			var3 = 0;
			var23 = 6885;

			int var17;
			for (var12 = 1; var12 < (var20 - 1); ++var12) {
				var13 = (Class66.anIntArray524[var12] * (var20 - var12)) / var20;
				var14 = 22 + var13;
				if (var14 < 0)
					var14 = 0;

				var3 += var14;

				for (var15 = var14; var15 < 128; ++var15) {
					var24 = Class66.anIntArray529[var3++];
					if (var24 != 0) {
						var25 = var24;
						var16 = 256 - var24;
						var24 = Class66.anIntArray525[var24];
						var17 = Applet_Sub1.aClass2_1764.anIntArray3[var23];
						Applet_Sub1.aClass2_1764.anIntArray3[var23++] = (((((var24 & '\uff00') * var25)
								+ (var16 * (var17 & '\uff00'))) & 16711680)
								+ ((((var17 & 16711935) * var16) + (var25 * (var24 & 16711935))) & -16711936)) >> 8;
					} else
						++var23;
				}

				var23 += (765 + var14) - 128;
			}

			Class104_Sub18_Sub17.method800(637, 9, 765, 7 + var20);
			Class3.aClass104_Sub18_Sub17_Sub1_10.method838(382, 0);
			Class104_Sub18_Sub17.method791();
			var3 = 0;
			var23 = 7546;

			for (var12 = 1; var12 < (var20 - 1); ++var12) {
				var13 = ((var20 - var12) * Class66.anIntArray524[var12]) / var20;
				var14 = 103 - var13;
				var23 += var13;

				for (var15 = 0; var15 < var14; ++var15) {
					var24 = Class66.anIntArray529[var3++];
					if (var24 != 0) {
						var25 = var24;
						var16 = 256 - var24;
						var24 = Class66.anIntArray525[var24];
						var17 = Applet_Sub1.aClass2_1764.anIntArray3[var23];
						Applet_Sub1.aClass2_1764.anIntArray3[var23++] = ((((var25 * (var24 & 16711935))
								+ ((var17 & 16711935) * var16)) & -16711936)
								+ ((((var17 & '\uff00') * var16) + (var25 * (var24 & '\uff00'))) & 16711680)) >> 8;
					} else
						++var23;
				}

				var3 += 128 - var14;
				var23 += 765 - var14 - var13;
			}

			Class66.aClass104_Sub18_Sub17_Sub3Array521[Class66.aBool527 ? 1 : 0].method889(725, 463);
			if ((client.loadstage > 5) && (client.anInt1913 == 0))
				if (null != FSManager.aClass104_Sub18_Sub17_Sub3_759) {
					var2 = 5;
					var22 = 463;
					final byte var26 = 100;
					final byte var27 = 35;
					FSManager.aClass104_Sub18_Sub17_Sub3_759.method889(var2, var22);
					var0.method882("World" + " " + client.anInt1939, (var26 / 2) + var2, (var22 + (var27 / 2)) - 2,
							16777215, 0);
					if (null != Class76.aClass70_617)
						var1.method882("Loading...", (var26 / 2) + var2, 12 + var22 + (var27 / 2), 16777215, 0);
					else
						var1.method882("Click to switch", var2 + (var26 / 2), (var27 / 2) + var22 + 12, 16777215, 0);
				} else
					FSManager.aClass104_Sub18_Sub17_Sub3_759 = Class11.method48(client.aClass61_Sub1_1820, "sl_button",
							"");

			try {
				final Graphics var18 = Class57.aCanvas468.getGraphics();
				Applet_Sub1.aClass2_1764.method19(var18, 0, 0, 1239841716);
			} catch (final Exception var19) {
				Class57.aCanvas468.repaint();
			}

		}
	}

	static boolean method154(final String var0) {
		if (null == var0)
			return false;
		else {
			for (int var1 = 0; var1 < client.anInt1935; ++var1)
				if (var0.equalsIgnoreCase(client.aClass86Array1972[var1].aString675))
					return true;

			if (var0.equalsIgnoreCase(Class81.pf.aString1780))
				return true;
			else
				return false;
		}
	}
}
