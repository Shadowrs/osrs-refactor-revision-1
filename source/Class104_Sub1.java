import java.awt.Graphics;

public final class Class104_Sub1 extends Class104 {
	int anInt839;
	int anInt842;
	int anInt843;
	int anInt846;
	int anInt847;
	int anInt850;
	Class104_Sub8_Sub3 aClass104_Sub8_Sub3_851;
	Class104_Sub18_Sub6 aClass104_Sub18_Sub6_852;
	static int anInt853;
	int anInt845;
	int anInt844;
	int anInt838;
	int anInt848;
	int[] anIntArray841;
	Class104_Sub8_Sub3 aClass104_Sub8_Sub3_840;
	static Class59 aClass59_849 = new Class59();

	void method476() {
		final int var1 = anInt845;
		final Class104_Sub18_Sub6 var2 = aClass104_Sub18_Sub6_852.method747();
		if (null != var2) {
			anInt845 = var2.anInt1333;
			anInt844 = var2.anInt1369 * 128;
			anInt838 = var2.anInt1370;
			anInt848 = var2.anInt1323;
			anIntArray841 = var2.anIntArray1372;
		} else {
			anInt845 = -1;
			anInt844 = 0;
			anInt838 = 0;
			anInt848 = 0;
			anIntArray841 = null;
		}

		if ((anInt845 != var1) && (null != aClass104_Sub8_Sub3_840)) {
			Class79.aClass104_Sub8_Sub2_630.method667(aClass104_Sub8_Sub3_840);
			aClass104_Sub8_Sub3_840 = null;
		}

	}

	static void method477(final Class104_Sub18_Sub3 var0, final int var1, final int var2, final int var3) {
		if ((client.anInt2028 < 50) && (client.anInt2026 != 0))
			if ((var0.anIntArray1265 != null) && (var1 < var0.anIntArray1265.length)) {
				final int var4 = var0.anIntArray1265[var1];
				if (var4 != 0) {
					final int var5 = var4 >> 8;
					final int var6 = (var4 >> 4) & 7;
					final int var7 = var4 & 15;
					client.anIntArray2029[client.anInt2028] = var5;
					client.anIntArray1875[client.anInt2028] = var6;
					client.anIntArray2031[client.anInt2028] = 0;
					client.aClass82Array2033[client.anInt2028] = null;
					final int var8 = (var2 - 64) / 128;
					final int var9 = (var3 - 64) / 128;
					client.anIntArray2032[client.anInt2028] = var7 + (var9 << 8) + (var8 << 16);
					++client.anInt2028;
				}
			}
	}

	static void method478(final Class104_Sub18_Sub17_Sub2_Sub1 var0, final Class104_Sub18_Sub17_Sub2_Sub1 var1) {
		if (Class101.aClass104_Sub18_Sub17_Sub1Array813 == null)
			Class101.aClass104_Sub18_Sub17_Sub1Array813 = Class48.method215(client.aClass61_Sub1_1820, "sl_back", "");

		if (Class104_Sub18_Sub16_Sub3.aClass104_Sub18_Sub17_Sub3Array1524 == null)
			Class104_Sub18_Sub16_Sub3.aClass104_Sub18_Sub17_Sub3Array1524 = Class12.method50(client.aClass61_Sub1_1820,
					"sl_flags", "");

		if (null == Class21.aClass104_Sub18_Sub17_Sub3Array223)
			Class21.aClass104_Sub18_Sub17_Sub3Array223 = Class12.method50(client.aClass61_Sub1_1820, "sl_arrows", "");

		if (Class48.aClass104_Sub18_Sub17_Sub3Array409 == null)
			Class48.aClass104_Sub18_Sub17_Sub3Array409 = Class12.method50(client.aClass61_Sub1_1820, "sl_stars", "");

		Class104_Sub18_Sub17.method805(0, 23, 765, 480, 0);
		Class104_Sub18_Sub17.method795(0, 0, 125, 23, 12425273, 9135624);
		Class104_Sub18_Sub17.method795(125, 0, 640, 23, 5197647, 2697513);
		var0.method882("Select a world", 62, 15, 0, -1);
		if (null != Class48.aClass104_Sub18_Sub17_Sub3Array409) {
			Class48.aClass104_Sub18_Sub17_Sub3Array409[1].method889(140, 1);
			var1.method863("Members only world", 152, 10, 16777215, -1);
			Class48.aClass104_Sub18_Sub17_Sub3Array409[0].method889(140, 12);
			var1.method863("Free world", 152, 21, 16777215, -1);
		}

		if (Class21.aClass104_Sub18_Sub17_Sub3Array223 != null) {
			final short var2 = 280;
			if ((Class66.anIntArray519[0] == 0) && (Class66.anIntArray545[0] == 0))
				Class21.aClass104_Sub18_Sub17_Sub3Array223[2].method889(var2, 4);
			else
				Class21.aClass104_Sub18_Sub17_Sub3Array223[0].method889(var2, 4);

			if ((Class66.anIntArray519[0] == 0) && (Class66.anIntArray545[0] == 1))
				Class21.aClass104_Sub18_Sub17_Sub3Array223[3].method889(var2 + 15, 4);
			else
				Class21.aClass104_Sub18_Sub17_Sub3Array223[1].method889(var2 + 15, 4);

			var0.method863("World", var2 + 32, 17, 16777215, -1);
			final short var3 = 390;
			if ((Class66.anIntArray519[0] == 1) && (Class66.anIntArray545[0] == 0))
				Class21.aClass104_Sub18_Sub17_Sub3Array223[2].method889(var3, 4);
			else
				Class21.aClass104_Sub18_Sub17_Sub3Array223[0].method889(var3, 4);

			if ((Class66.anIntArray519[0] == 1) && (Class66.anIntArray545[0] == 1))
				Class21.aClass104_Sub18_Sub17_Sub3Array223[3].method889(15 + var3, 4);
			else
				Class21.aClass104_Sub18_Sub17_Sub3Array223[1].method889(15 + var3, 4);

			var0.method863("Players", 32 + var3, 17, 16777215, -1);
			final short var4 = 500;
			if ((Class66.anIntArray519[0] == 2) && (Class66.anIntArray545[0] == 0))
				Class21.aClass104_Sub18_Sub17_Sub3Array223[2].method889(var4, 4);
			else
				Class21.aClass104_Sub18_Sub17_Sub3Array223[0].method889(var4, 4);

			if ((Class66.anIntArray519[0] == 2) && (Class66.anIntArray545[0] == 1))
				Class21.aClass104_Sub18_Sub17_Sub3Array223[3].method889(15 + var4, 4);
			else
				Class21.aClass104_Sub18_Sub17_Sub3Array223[1].method889(15 + var4, 4);

			var0.method863("Location", 32 + var4, 17, 16777215, -1);
			final short var5 = 610;
			if ((Class66.anIntArray519[0] == 3) && (Class66.anIntArray545[0] == 0))
				Class21.aClass104_Sub18_Sub17_Sub3Array223[2].method889(var5, 4);
			else
				Class21.aClass104_Sub18_Sub17_Sub3Array223[0].method889(var5, 4);

			if ((Class66.anIntArray519[0] == 3) && (Class66.anIntArray545[0] == 1))
				Class21.aClass104_Sub18_Sub17_Sub3Array223[3].method889(15 + var5, 4);
			else
				Class21.aClass104_Sub18_Sub17_Sub3Array223[1].method889(var5 + 15, 4);

			var0.method863("Type", var5 + 32, 17, 16777215, -1);
		}

		Class104_Sub18_Sub17.method805(708, 4, 50, 16, 0);
		var1.method882("Cancel", 733, 16, 16777215, -1);
		Class66.anInt546 = -1;
		if (null != Class101.aClass104_Sub18_Sub17_Sub1Array813) {
			final byte var19 = 88;
			final byte var20 = 19;
			int var21 = 765 / (var19 + 1);
			int var22 = 480 / (var20 + 1);

			int var6;
			int var7;
			do {
				var6 = var22;
				var7 = var21;
				if ((var22 * (var21 - 1)) >= Class66.anInt542)
					--var21;

				if (((var22 - 1) * var21) >= Class66.anInt542)
					--var22;

				if ((var21 * (var22 - 1)) >= Class66.anInt542)
					--var22;
			} while ((var22 != var6) || (var7 != var21));

			var6 = (765 - (var19 * var21)) / (var21 + 1);
			if (var6 > 5)
				var6 = 5;

			var7 = (480 - (var20 * var22)) / (var22 + 1);
			if (var7 > 5)
				var7 = 5;

			final int var8 = (765 - (var19 * var21) - ((var21 - 1) * var6)) / 2;
			final int var9 = (480 - (var22 * var20) - (var7 * (var22 - 1))) / 2;
			int var10 = 23 + var9;
			int var11 = var8;
			int var12 = 0;

			for (int var13 = 0; var13 < Class66.anInt542; ++var13) {
				final Class57 var14 = Class96.aClass57Array758[var13];
				boolean var15 = true;
				String var16 = Integer.toString(var14.anInt460);
				if (var14.anInt460 == -1) {
					var16 = "OFF";
					var15 = false;
				} else if (var14.anInt460 > 1980) {
					var16 = "FULL";
					var15 = false;
				}

				if ((Class14.anInt91 >= var11) && (Class14.anInt95 >= var10) && (Class14.anInt91 < (var19 + var11))
						&& (Class14.anInt95 < (var10 + var20)) && var15) {
					Class66.anInt546 = var13;
					Class101.aClass104_Sub18_Sub17_Sub1Array813[var14.aBool464 ? 1 : 0].method853(var11, var10, 128,
							16777215);
				} else
					Class101.aClass104_Sub18_Sub17_Sub1Array813[var14.aBool464 ? 1 : 0].method838(var11, var10);

				if (Class104_Sub18_Sub16_Sub3.aClass104_Sub18_Sub17_Sub3Array1524 != null)
					Class104_Sub18_Sub16_Sub3.aClass104_Sub18_Sub17_Sub3Array1524[var14.anInt462
							+ (var14.aBool464 ? 8 : 0)].method889(29 + var11, var10);

				var0.method882(Integer.toString(var14.anInt463), var11 + 15, 5 + (var20 / 2) + var10, 0, -1);
				var1.method882(var16, var11 + 60, 5 + (var20 / 2) + var10, 268435455, -1);
				var10 += var20 + var7;
				++var12;
				if (var12 >= var22) {
					var10 = var9 + 23;
					var11 += var6 + var19;
					var12 = 0;
				}
			}
		}

		try {
			final Graphics var17 = Class57.aCanvas468.getGraphics();
			Applet_Sub1.aClass2_1764.method19(var17, 0, 0, 2114906245);
		} catch (final Exception var18) {
			Class57.aCanvas468.repaint();
		}

	}
}
