import java.io.IOException;

public class Class86 {
	boolean aBool674;
	String aString675;
	int anInt676;
	int anInt677;
	boolean aBool678;
	String aString679;

	public static void method393(final int var0, final Class61 var1, final int var2, final int var3, final int var4,
			final boolean var5) {
		Class29.anInt272 = 1;
		Class29.aClass61_273 = var1;
		Class1.anInt1 = var2;
		Class29.anInt276 = var3;
		Class29.anInt275 = var4;
		Class104_Sub2.aBool859 = var5;
		Class69.anInt565 = var0;
	}

	public static void method394(final Class13 var0, final boolean var1) {
		if (Class66.aClass13_547 != null) {
			try {
				Class66.aClass13_547.destory();
			} catch (final Exception var6) {
				;
			}

			Class66.aClass13_547 = null;
		}

		Class66.aClass13_547 = var0;
		Class84.method379(var1);
		Class87.aClass104_Sub21_690.anInt1172 = 0;
		Class48.aClass104_Sub18_Sub13_410 = null;
		Class87.aClass104_Sub21_691 = null;
		Class87.anInt696 = 0;

		while (true) {
			Class104_Sub18_Sub13 var2 = (Class104_Sub18_Sub13) Class87.aClass58_683.method245();
			if (null == var2)
				while (true) {
					var2 = (Class104_Sub18_Sub13) Class87.aClass58_694.method245();
					if (null == var2) {
						if (Class87.aByte697 != 0)
							try {
								final RSBuf var7 = new RSBuf(4);
								var7.writebyte(4);
								var7.writebyte(Class87.aByte697);
								var7.writeShort(0);
								Class66.aClass13_547.method54(var7.aByteArray1174, 0, 4);
							} catch (final IOException var5) {
								try {
									Class66.aClass13_547.destory();
								} catch (final Exception var4) {
									;
								}

								++Class87.anInt698;
								Class66.aClass13_547 = null;
							}

						Class87.anInt686 = 0;
						Class40.aLong359 = Class71.method332();
						return;
					}

					Class87.aClass63_685.method291(var2);
					Class87.aClass58_688.method242(var2, var2.aLong824);
					++Class87.anInt687;
					--Class87.anInt692;
				}

			Class87.aClass58_681.method242(var2, var2.aLong824);
			++Class87.anInt682;
			--Class87.anInt684;
		}
	}

	static final void method395(final Class104_Sub12 var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6) {
		if (client.aBool1872)
			client.anInt1873 = 32;
		else
			client.anInt1873 = 0;

		client.aBool1872 = false;
		int var7;
		if (Class14.anInt93 != 0)
			if ((var5 >= var1) && (var5 < (16 + var1)) && (var6 >= var2) && (var6 < (16 + var2))) {
				var0.anInt992 -= 4;
				Class79.method348(var0);
			} else if ((var5 >= var1) && (var5 < (16 + var1)) && (var6 >= ((var3 + var2) - 16))
					&& (var6 < (var3 + var2))) {
				var0.anInt992 += 4;
				Class79.method348(var0);
			} else if ((var5 >= (var1 - client.anInt1873)) && (var5 < (var1 + 16 + client.anInt1873))
					&& (var6 >= (16 + var2)) && (var6 < ((var3 + var2) - 16))) {
				var7 = (var3 * (var3 - 32)) / var4;
				if (var7 < 8)
					var7 = 8;

				final int var8 = var6 - var2 - 16 - (var7 / 2);
				final int var9 = var3 - 32 - var7;
				var0.anInt992 = (var8 * (var4 - var3)) / var9;
				Class79.method348(var0);
				client.aBool1872 = true;
			}

		if (client.anInt1983 != 0) {
			var7 = var0.anInt987;
			if ((var5 >= (var1 - var7)) && (var6 >= var2) && (var5 < (var1 + 16)) && (var6 <= (var2 + var3))) {
				var0.anInt992 += client.anInt1983 * 45;
				Class79.method348(var0);
			}
		}

	}

	public static Class104_Sub18_Sub8 method396(final int var0) {
		Class104_Sub18_Sub8 var1 = (Class104_Sub18_Sub8) Class104_Sub18_Sub8.aClass56_1387.method236(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class104_Sub18_Sub8.aClass61_1389.method259(14, var0);
			var1 = new Class104_Sub18_Sub8();
			if (null != var2)
				var1.method757(new RSBuf(var2));

			Class104_Sub18_Sub8.aClass56_1387.method238(var1, var0);
			return var1;
		}
	}
}
