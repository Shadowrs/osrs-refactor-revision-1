import java.io.EOFException;
import java.io.IOException;

public final class JagFS2 {
	public static int anInt116;
	static byte[] aByteArray113 = new byte[520];
	FSManager aClass96_111 = null;
	FSManager aClass96_112 = null;
	int anInt115 = '\ufde8';
	int anInt114;

	public boolean method63(final int var1, final byte[] var2, final int var3) {
		final FSManager var4 = aClass96_111;
		synchronized (var4) {
			if ((var3 >= 0) && (var3 <= anInt115)) {
				boolean var5 = method64(var1, var2, var3, true);
				if (!var5)
					var5 = method64(var1, var2, var3, false);

				return var5;
			} else
				throw new IllegalArgumentException();
		}
	}

	boolean method64(final int var1, final byte[] var2, final int var3, boolean var4) {
		final FSManager var5 = aClass96_111;
		synchronized (var5) {
			boolean var10000;
			try {
				int var6;
				if (var4) {
					if (aClass96_112.method429() < (6 + (var1 * 6)))
						return false;

					aClass96_112.method428(var1 * 6);
					aClass96_112.method431(aByteArray113, 0, 6);
					var6 = (aByteArray113[5] & 255) + ((aByteArray113[4] & 255) << 8)
							+ ((aByteArray113[3] & 255) << 16);
					if ((var6 <= 0) || (var6 > (aClass96_111.method429() / 520L)))
						return false;
				} else {
					var6 = (int) ((aClass96_111.method429() + 519L) / 520L);
					if (var6 == 0)
						var6 = 1;
				}

				aByteArray113[0] = (byte) (var3 >> 16);
				aByteArray113[1] = (byte) (var3 >> 8);
				aByteArray113[2] = (byte) var3;
				aByteArray113[3] = (byte) (var6 >> 16);
				aByteArray113[4] = (byte) (var6 >> 8);
				aByteArray113[5] = (byte) var6;
				aClass96_112.method428(var1 * 6);
				aClass96_112.method434(aByteArray113, 0, 6);
				int var7 = 0;

				for (int var8 = 0; var7 < var3; ++var8) {
					int var9 = 0;
					int var11;
					if (var4) {
						aClass96_111.method428(var6 * 520);

						try {
							aClass96_111.method431(aByteArray113, 0, 8);
						} catch (final EOFException var16) {
							break;
						}

						var11 = ((aByteArray113[0] & 255) << 8) + (aByteArray113[1] & 255);
						final int var12 = (aByteArray113[3] & 255) + ((aByteArray113[2] & 255) << 8);
						var9 = (aByteArray113[6] & 255) + ((aByteArray113[4] & 255) << 16)
								+ ((aByteArray113[5] & 255) << 8);
						final int var13 = aByteArray113[7] & 255;
						if ((var11 != var1) || (var12 != var8) || (var13 != anInt114))
							return false;

						if ((var9 < 0) || (var9 > (aClass96_111.method429() / 520L)))
							return false;
					}

					if (var9 == 0) {
						var4 = false;
						var9 = (int) ((aClass96_111.method429() + 519L) / 520L);
						if (var9 == 0)
							++var9;

						if (var9 == var6)
							++var9;
					}

					if ((var3 - var7) <= 512)
						var9 = 0;

					aByteArray113[0] = (byte) (var1 >> 8);
					aByteArray113[1] = (byte) var1;
					aByteArray113[2] = (byte) (var8 >> 8);
					aByteArray113[3] = (byte) var8;
					aByteArray113[4] = (byte) (var9 >> 16);
					aByteArray113[5] = (byte) (var9 >> 8);
					aByteArray113[6] = (byte) var9;
					aByteArray113[7] = (byte) anInt114;
					aClass96_111.method428(520 * var6);
					aClass96_111.method434(aByteArray113, 0, 8);
					var11 = var3 - var7;
					if (var11 > 512)
						var11 = 512;

					aClass96_111.method434(var2, var7, var11);
					var7 += var11;
					var6 = var9;
				}

				var10000 = true;
			} catch (final IOException var17) {
				return false;
			}

			return var10000;
		}
	}

	public JagFS2(final int var1, final FSManager var2, final FSManager var3, final int var4) {
		anInt114 = var1;
		aClass96_111 = var2;
		aClass96_112 = var3;
		anInt115 = var4;
	}

	public byte[] method65(final int var1) {
		final FSManager var2 = aClass96_111;
		synchronized (var2) {
			try {
				if (aClass96_112.method429() < (6 + (6 * var1)))
					return null;
				else {
					aClass96_112.method428(var1 * 6);
					aClass96_112.method431(aByteArray113, 0, 6);
					final int var3 = ((aByteArray113[0] & 255) << 16) + ((aByteArray113[1] & 255) << 8)
							+ (aByteArray113[2] & 255);
					int var4 = (aByteArray113[5] & 255) + ((aByteArray113[4] & 255) << 8)
							+ ((aByteArray113[3] & 255) << 16);
					if ((var3 < 0) || (var3 > anInt115))
						return null;
					else if ((var4 <= 0) || (var4 > (aClass96_111.method429() / 520L)))
						return null;
					else {
						final byte[] var5 = new byte[var3];
						int var6 = 0;

						for (int var7 = 0; var6 < var3; ++var7) {
							if (var4 == 0)
								return null;

							aClass96_111.method428(var4 * 520);
							int var8 = var3 - var6;
							if (var8 > 512)
								var8 = 512;

							aClass96_111.method431(aByteArray113, 0, 8 + var8);
							final int var9 = (aByteArray113[1] & 255) + ((aByteArray113[0] & 255) << 8);
							final int var10 = ((aByteArray113[2] & 255) << 8) + (aByteArray113[3] & 255);
							final int var11 = ((aByteArray113[4] & 255) << 16) + ((aByteArray113[5] & 255) << 8)
									+ (aByteArray113[6] & 255);
							final int var12 = aByteArray113[7] & 255;
							if ((var1 != var9) || (var10 != var7) || (var12 != anInt114))
								return null;

							if ((var11 < 0) || (var11 > (aClass96_111.method429() / 520L)))
								return null;

							for (int var13 = 0; var13 < var8; ++var13)
								var5[var6++] = aByteArray113[8 + var13];

							var4 = var11;
						}

						final byte[] var10000 = var5;
						return var10000;
					}
				}
			} catch (final IOException var16) {
				return null;
			}
		}
	}

	static final void method66(final Class104_Sub18_Sub16_Sub7 var0) {
		if ((var0.anInt1737 == client.anInt1799) || (var0.anInt1722 == -1) || (var0.anInt1707 != 0)
				|| ((1 + var0.anInt1724) > Class70.forId(var0.anInt1722).anIntArray1264[var0.anInt1732])) {
			final int var1 = var0.anInt1737 - var0.anInt1708;
			final int var2 = client.anInt1799 - var0.anInt1708;
			final int var3 = (var0.anInt1736 * 64) + (var0.anInt1697 * 128);
			final int var4 = (var0.anInt1734 * 128) + (var0.anInt1736 * 64);
			final int var5 = (var0.anInt1733 * 128) + (var0.anInt1736 * 64);
			final int var6 = (var0.anInt1736 * 64) + (var0.anInt1721 * 128);
			var0.anInt1695 = ((var3 * (var1 - var2)) + (var2 * var5)) / var1;
			var0.anInt1694 = ((var4 * (var1 - var2)) + (var2 * var6)) / var1;
		}

		var0.anInt1748 = 0;
		if (var0.anInt1738 == 0)
			var0.anInt1698 = 1024;

		if (var0.anInt1738 == 1)
			var0.anInt1698 = 1536;

		if (var0.anInt1738 == 2)
			var0.anInt1698 = 0;

		if (var0.anInt1738 == 3)
			var0.anInt1698 = 512;

		var0.anInt1725 = var0.anInt1698;
	}

	static final void method67(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7, final int var8) {
		Class104_Sub3 var9 = null;

		for (Class104_Sub3 var10 = (Class104_Sub3) client.aClass59_1922
				.method251(); var10 != null; var10 = (Class104_Sub3) client.aClass59_1922.method252())
			if ((var0 == var10.anInt876) && (var10.anInt871 == var1) && (var10.anInt870 == var2)
					&& (var10.anInt868 == var3)) {
				var9 = var10;
				break;
			}

		if (var9 == null) {
			var9 = new Class104_Sub3();
			var9.anInt876 = var0;
			var9.anInt868 = var3;
			var9.anInt871 = var1;
			var9.anInt870 = var2;
			Class1_Sub1.method475(var9);
			client.aClass59_1922.method248(var9);
		}

		var9.anInt874 = var4;
		var9.anInt869 = var5;
		var9.anInt875 = var6;
		var9.anInt877 = var7;
		var9.anInt878 = var8;
	}

	static String method68(final Widget var0) {
		return Class101.method464(Class104_Sub3.method485(var0)) == 0 ? null
				: ((null != var0.aString1036) && (var0.aString1036.trim().length() != 0) ? var0.aString1036 : null);
	}
}
