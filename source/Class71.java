import java.awt.Component;
import java.net.URL;

public class Class71 {
	public static int[] anIntArray578 = new int[32];
	public static int[] anIntArray577;
	public static int[] anIntArray576;

	static {
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			anIntArray578[var1] = var0 - 1;
			var0 += var0;
		}

		anIntArray577 = new int[2000];
		anIntArray576 = new int[2000];
	}

	public static final Class99 method329(final Class11 var0, final Component var1, final int var2, int var3) {
		if (Class99.anInt777 == 0)
			throw new IllegalStateException();
		else if ((var2 >= 0) && (var2 < 2)) {
			if (var3 < 256)
				var3 = 256;

			try {
				final Class99_Sub1 var7 = new Class99_Sub1();
				var7.anIntArray779 = new int[256 * (Class99.aBool773 ? 2 : 1)];
				var7.anInt782 = var3;
				var7.method449(var1);
				var7.anInt781 = 1024 + (var3 & -1024);
				if (var7.anInt781 > 16384)
					var7.anInt781 = 16384;

				var7.method452(var7.anInt781);
				if ((Class99.anInt775 > 0) && (null == Class99.aClass64_774)) {
					Class99.aClass64_774 = new Class64();
					Class99.aClass64_774.aClass11_509 = var0;
					var0.method43(Class99.aClass64_774, Class99.anInt775);
				}

				if (Class99.aClass64_774 != null) {
					if (null != Class99.aClass64_774.aClass99Array512[var2])
						throw new IllegalArgumentException();

					Class99.aClass64_774.aClass99Array512[var2] = var7;
				}

				return var7;
			} catch (final Throwable var6) {
				try {
					final Class99_Sub2 var4 = new Class99_Sub2(var0, var2);
					var4.anIntArray779 = new int[256 * (Class99.aBool773 ? 2 : 1)];
					var4.anInt782 = var3;
					var4.method449(var1);
					var4.anInt781 = 16384;
					var4.method452(var4.anInt781);
					if ((Class99.anInt775 > 0) && (Class99.aClass64_774 == null)) {
						Class99.aClass64_774 = new Class64();
						Class99.aClass64_774.aClass11_509 = var0;
						var0.method43(Class99.aClass64_774, Class99.anInt775);
					}

					if (Class99.aClass64_774 != null) {
						if (null != Class99.aClass64_774.aClass99Array512[var2])
							throw new IllegalArgumentException();

						Class99.aClass64_774.aClass99Array512[var2] = var4;
					}

					return var4;
				} catch (final Throwable var5) {
					return new Class99();
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	public static Class104_Sub18_Sub5 method330(final int var0) {
		Class104_Sub18_Sub5 var1 = (Class104_Sub18_Sub5) Class104_Sub18_Sub5.aClass56_1305.method236(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class104_Sub18_Sub5.aClass61_1307.method259(13, var0);
			var1 = new Class104_Sub18_Sub5();
			var1.anInt1308 = var0;
			if (var2 != null)
				var1.method730(new RSBuf(var2));

			Class104_Sub18_Sub5.aClass56_1305.method238(var1, var0);
			return var1;
		}
	}

	static void method331(final Applet_Sub1 var0) {
		if (Class14.anInt100 == 1) {
			final short var1 = 280;
			if ((Class14.anInt101 >= var1) && (Class14.anInt101 <= (14 + var1)) && (Class14.anInt102 >= 4)
					&& (Class14.anInt102 <= 18)) {
				client.method954(0, 0);
				return;
			}

			if ((Class14.anInt101 >= (var1 + 15)) && (Class14.anInt101 <= (80 + var1)) && (Class14.anInt102 >= 4)
					&& (Class14.anInt102 <= 18)) {
				client.method954(0, 1);
				return;
			}

			final short var2 = 390;
			if ((Class14.anInt101 >= var2) && (Class14.anInt101 <= (14 + var2)) && (Class14.anInt102 >= 4)
					&& (Class14.anInt102 <= 18)) {
				client.method954(1, 0);
				return;
			}

			if ((Class14.anInt101 >= (var2 + 15)) && (Class14.anInt101 <= (var2 + 80)) && (Class14.anInt102 >= 4)
					&& (Class14.anInt102 <= 18)) {
				client.method954(1, 1);
				return;
			}

			final short var3 = 500;
			if ((Class14.anInt101 >= var3) && (Class14.anInt101 <= (var3 + 14)) && (Class14.anInt102 >= 4)
					&& (Class14.anInt102 <= 18)) {
				client.method954(2, 0);
				return;
			}

			if ((Class14.anInt101 >= (var3 + 15)) && (Class14.anInt101 <= (80 + var3)) && (Class14.anInt102 >= 4)
					&& (Class14.anInt102 <= 18)) {
				client.method954(2, 1);
				return;
			}

			final short var4 = 610;
			if ((Class14.anInt101 >= var4) && (Class14.anInt101 <= (var4 + 14)) && (Class14.anInt102 >= 4)
					&& (Class14.anInt102 <= 18)) {
				client.method954(3, 0);
				return;
			}

			if ((Class14.anInt101 >= (var4 + 15)) && (Class14.anInt101 <= (80 + var4)) && (Class14.anInt102 >= 4)
					&& (Class14.anInt102 <= 18)) {
				client.method954(3, 1);
				return;
			}

			if ((Class14.anInt101 >= 708) && (Class14.anInt102 >= 4) && (Class14.anInt101 <= 758)
					&& (Class14.anInt102 <= 20)) {
				Class66.aBool541 = false;
				Class66.aClass104_Sub18_Sub17_Sub1_531.method838(0, 0);
				Class3.aClass104_Sub18_Sub17_Sub1_10.method838(382, 0);
				Class66.aClass104_Sub18_Sub17_Sub3_520
						.method889(382 - (Class66.aClass104_Sub18_Sub17_Sub3_520.anInt1618 / 2), 18);
				return;
			}

			if (Class66.anInt546 != -1) {
				final Class57 var5 = Class96.aClass57Array758[Class66.anInt546];
				if (var5.aBool464 == client.aBool1852) {
					Class57.aString466 = var5.aString459;
					client.anInt1939 = var5.anInt463;
					Class104_Sub3.anInt879 = client.anInt1792 == 0 ? '\uaa4a' : '\u9c40' + var5.anInt463;
					Class60.anInt478 = client.anInt1792 == 0 ? 443 : var5.anInt463 + '\uc350';
					Class87.anInt699 = Class104_Sub3.anInt879;
					Class66.aBool541 = false;
					Class66.aClass104_Sub18_Sub17_Sub1_531.method838(0, 0);
					Class3.aClass104_Sub18_Sub17_Sub1_10.method838(382, 0);
					Class66.aClass104_Sub18_Sub17_Sub3_520
							.method889(382 - (Class66.aClass104_Sub18_Sub17_Sub3_520.anInt1618 / 2), 18);
					return;
				}

				String var6 = "";
				if (client.anInt1792 != 0)
					var6 = ":" + (var5.anInt463 + 7000);

				final String var7 = "http://" + var5.aString459 + var6 + "/j" + client.anInt1938;

				try {
					var0.getAppletContext().showDocument(new URL(var7), "_self");
				} catch (final Exception var9) {
					;
				}
			}
		}

	}

	public static synchronized long method332() {
		final long var0 = System.currentTimeMillis();
		if (var0 < Class48.aLong407)
			Class48.aLong408 += Class48.aLong407 - var0;

		Class48.aLong407 = var0;
		return var0 + Class48.aLong408;
	}
}
