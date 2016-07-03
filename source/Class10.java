import java.awt.Canvas;

public class Class10 {
	static void method40(final int var0) {
		if (client.anInt1806 != var0) {
			if (client.anInt1806 == 0) {
				Class54.anImage449 = null;
				Class50.aFont420 = null;
				Class104_Sub18_Sub15.aFontMetrics1466 = null;
			}

			if ((var0 == 20) || (var0 == 40)) {
				client.step = 0;
				client.anInt1824 = 0;
				client.anInt1968 = 0;
			}

			if ((var0 != 20) && (var0 != 40) && (null != Class57.aClass13_467)) {
				Class57.aClass13_467.destory();
				Class57.aClass13_467 = null;
			}

			if (client.anInt1806 == 25) {
				client.anInt2043 = 0;
				client.anInt1842 = 0;
				client.anInt1893 = 1;
				client.anInt1843 = 0;
				client.anInt1844 = 1;
			}

			if ((var0 != 5) && (var0 != 10) && (var0 != 20))
				Class48.method216();
			else {
				final Canvas var1 = Class57.aCanvas468;
				final Class61_Sub1 var2 = Class2.aClass61_Sub1_9;
				final Class61_Sub1 var3 = client.aClass61_Sub1_1820;
				if (!Class103.aBool816) {
					Class104_Sub18_Sub17.method794();
					final byte[] var4 = var2.method272("title.jpg", "");
					Class66.aClass104_Sub18_Sub17_Sub1_531 = new Class104_Sub18_Sub17_Sub1(var4, var1);
					Class3.aClass104_Sub18_Sub17_Sub1_10 = Class66.aClass104_Sub18_Sub17_Sub1_531.method856();
					Class66.aClass104_Sub18_Sub17_Sub3_520 = Class11.method48(var3, "logo", "");
					Class66.aClass104_Sub18_Sub17_Sub3_523 = Class11.method48(var3, "titlebox", "");
					Class66.aClass104_Sub18_Sub17_Sub3_538 = Class11.method48(var3, "titlebutton", "");
					Class66.aClass104_Sub18_Sub17_Sub3Array544 = Class12.method50(var3, "runes", "");
					Class66.aClass104_Sub18_Sub17_Sub3Array521 = Class12.method50(var3, "title_mute", "");
					Class42.anIntArray371 = new int[256];

					int var5;
					for (var5 = 0; var5 < 64; ++var5)
						Class42.anIntArray371[var5] = 262144 * var5;

					for (var5 = 0; var5 < 64; ++var5)
						Class42.anIntArray371[var5 + 64] = 16711680 + (1024 * var5);

					for (var5 = 0; var5 < 64; ++var5)
						Class42.anIntArray371[var5 + 128] = 16776960 + (var5 * 4);

					for (var5 = 0; var5 < 64; ++var5)
						Class42.anIntArray371[var5 + 192] = 16777215;

					Class48.anIntArray411 = new int[256];

					for (var5 = 0; var5 < 64; ++var5)
						Class48.anIntArray411[var5] = 1024 * var5;

					for (var5 = 0; var5 < 64; ++var5)
						Class48.anIntArray411[64 + var5] = (4 * var5) + '\uff00';

					for (var5 = 0; var5 < 64; ++var5)
						Class48.anIntArray411[128 + var5] = '\uffff' + (var5 * 262144);

					for (var5 = 0; var5 < 64; ++var5)
						Class48.anIntArray411[192 + var5] = 16777215;

					Class66.anIntArray526 = new int[256];

					for (var5 = 0; var5 < 64; ++var5)
						Class66.anIntArray526[var5] = 4 * var5;

					for (var5 = 0; var5 < 64; ++var5)
						Class66.anIntArray526[var5 + 64] = 255 + (262144 * var5);

					for (var5 = 0; var5 < 64; ++var5)
						Class66.anIntArray526[var5 + 128] = 16711935 + (1024 * var5);

					for (var5 = 0; var5 < 64; ++var5)
						Class66.anIntArray526[var5 + 192] = 16777215;

					Class66.anIntArray525 = new int[256];
					Class14.anIntArray92 = new int['\u8000'];
					Class24.anIntArray244 = new int['\u8000'];
					Class43.method186((Class104_Sub18_Sub17_Sub3) null);
					Class66.anIntArray529 = new int['\u8000'];
					Class88.anIntArray700 = new int['\u8000'];
					Class66.anInt536 = 0;
					Class66.aString543 = "";
					Class66.aString522 = "";
					Class66.aBool541 = false;
					if (client.anInt2022 != 0)
						Class66.aBool527 = false;
					else
						Class66.aBool527 = true;

					if (!Class66.aBool527) {
						final Class61_Sub1 var6 = Class27.aClass61_Sub1_264;
						final int var7 = var6.method271("scape main");
						final int var8 = var6.method273(var7, "");
						Class86.method393(2, var6, var7, var8, 255, false);
					} else {
						Class29.anInt272 = 1;
						Class29.aClass61_273 = null;
						Class1.anInt1 = -1;
						Class29.anInt276 = -1;
						Class29.anInt275 = 0;
						Class104_Sub2.aBool859 = false;
						Class69.anInt565 = 2;
					}

					Class84.method379(false);
					Class103.aBool816 = true;
					Class66.aClass104_Sub18_Sub17_Sub1_531.method838(0, 0);
					Class3.aClass104_Sub18_Sub17_Sub1_10.method838(382, 0);
					Class66.aClass104_Sub18_Sub17_Sub3_520
							.method889(382 - (Class66.aClass104_Sub18_Sub17_Sub3_520.anInt1618 / 2), 18);
				}
			}

			client.anInt1806 = var0;
		}
	}
}
