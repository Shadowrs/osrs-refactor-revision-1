import java.awt.Graphics;

public class Class104_Sub15 extends Class104 {
	int anInt1102;
	int anInt1104;
	int anInt1105;
	int anInt1106;
	int anInt1107;
	int anInt1108;
	int anInt1109;
	int anInt1110;
	int anInt1111;
	int anInt1112;
	int anInt1113;
	int anInt1115;
	int anInt1117;
	int anInt1118;
	int anInt1119;
	int anInt1121;
	int anInt1122;
	static Class104_Sub18_Sub17_Sub1[] aClass104_Sub18_Sub17_Sub1Array1123;
	static byte[][] aByteArrayArray1124;
	static Class104_Sub18_Sub17_Sub3[] aClass104_Sub18_Sub17_Sub3Array1125;
	Class104_Sub11 aClass104_Sub11_1103;
	Class104_Sub4_Sub1 aClass104_Sub4_Sub1_1116;
	Class81 aClass81_1114;
	Class104_Sub8_Sub3 aClass104_Sub8_Sub3_1120;

	void method548() {
		aClass104_Sub11_1103 = null;
		aClass104_Sub4_Sub1_1116 = null;
		aClass81_1114 = null;
		aClass104_Sub8_Sub3_1120 = null;
	}

	static final void method549() {
		client.anInt1904 = 0;
		client.anInt1910 = 0;
		client.gamecon.method624();
		int var0 = client.gamecon.method625(1);
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (var0 != 0) {
			var1 = client.gamecon.method625(2);
			if (var1 == 0)
				client.anIntArray1911[++client.anInt1910 - 1] = 2047;
			else if (var1 == 1) {
				var2 = client.gamecon.method625(3);
				Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.method934(var2, false);
				var3 = client.gamecon.method625(1);
				if (var3 == 1)
					client.anIntArray1911[++client.anInt1910 - 1] = 2047;
			} else if (var1 == 2) {
				var2 = client.gamecon.method625(3);
				Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.method934(var2, true);
				var3 = client.gamecon.method625(3);
				Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.method934(var3, true);
				var4 = client.gamecon.method625(1);
				if (var4 == 1)
					client.anIntArray1911[++client.anInt1910 - 1] = 2047;
			} else if (var1 == 3) {
				Class12.anInt73 = client.gamecon.method625(2);
				var2 = client.gamecon.method625(7);
				var3 = client.gamecon.method625(1);
				if (var3 == 1)
					client.anIntArray1911[++client.anInt1910 - 1] = 2047;

				var4 = client.gamecon.method625(7);
				var5 = client.gamecon.method625(1);
				Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.method933(var2, var4, var5 == 1);
			}
		}

		var0 = client.gamecon.method625(8);
		if (var0 < client.anInt1994)
			for (var1 = var0; var1 < client.anInt1994; ++var1)
				client.anIntArray2048[++client.anInt1904 - 1] = client.anIntArray1909[var1];

		if (var0 > client.anInt1994)
			throw new RuntimeException("");
		else {
			client.anInt1994 = 0;

			int var7;
			int var8;
			for (var1 = 0; var1 < var0; ++var1) {
				var2 = client.anIntArray1909[var1];
				final Class104_Sub18_Sub16_Sub7_Sub1 var6 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var2];
				var4 = client.gamecon.method625(1);
				if (var4 == 0) {
					client.anIntArray1909[++client.anInt1994 - 1] = var2;
					var6.anInt1739 = client.anInt1799;
				} else {
					var5 = client.gamecon.method625(2);
					if (var5 == 0) {
						client.anIntArray1909[++client.anInt1994 - 1] = var2;
						var6.anInt1739 = client.anInt1799;
						client.anIntArray1911[++client.anInt1910 - 1] = var2;
					} else if (var5 == 1) {
						client.anIntArray1909[++client.anInt1994 - 1] = var2;
						var6.anInt1739 = client.anInt1799;
						var7 = client.gamecon.method625(3);
						var6.method934(var7, false);
						var8 = client.gamecon.method625(1);
						if (var8 == 1)
							client.anIntArray1911[++client.anInt1910 - 1] = var2;
					} else if (var5 == 2) {
						client.anIntArray1909[++client.anInt1994 - 1] = var2;
						var6.anInt1739 = client.anInt1799;
						var7 = client.gamecon.method625(3);
						var6.method934(var7, true);
						var8 = client.gamecon.method625(3);
						var6.method934(var8, true);
						final int var9 = client.gamecon.method625(1);
						if (var9 == 1)
							client.anIntArray1911[++client.anInt1910 - 1] = var2;
					} else if (var5 == 3)
						client.anIntArray2048[++client.anInt1904 - 1] = var2;
				}
			}

			Class104_Sub18_Sub16_Sub7_Sub1 var10;
			for (; client.gamecon.method626(client.pktSize) >= 11; var10.method933(
					var5 + Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1745[0],
					var3 + Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1746[0], var7 == 1)) {
				var0 = client.gamecon.method625(11);
				if (var0 == 2047)
					break;

				boolean var14 = false;
				if (null == client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var0]) {
					client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var0] = new Class104_Sub18_Sub16_Sub7_Sub1();
					if (null != client.aClass104_Sub21Array2030[var0])
						client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var0]
								.method950(client.aClass104_Sub21Array2030[var0]);

					var14 = true;
				}

				client.anIntArray1909[++client.anInt1994 - 1] = var0;
				var10 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var0];
				var10.anInt1739 = client.anInt1799;
				var3 = client.gamecon.method625(5);
				if (var3 > 15)
					var3 -= 32;

				var4 = client.anIntArray1817[client.gamecon.method625(3)];
				if (var14)
					var10.anInt1698 = var10.anInt1725 = var4;

				var5 = client.gamecon.method625(5);
				if (var5 > 15)
					var5 -= 32;

				var7 = client.gamecon.method625(1);
				var8 = client.gamecon.method625(1);
				if (var8 == 1)
					client.anIntArray1911[++client.anInt1910 - 1] = var0;
			}

			client.gamecon.endbits();

			for (var0 = 0; var0 < client.anInt1910; ++var0) {
				var1 = client.anIntArray1911[var0];
				var10 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var1];
				var3 = client.gamecon.readUByte();
				if ((var3 & 64) != 0)
					var3 += client.gamecon.readUByte() << 8;

				if ((var3 & 4) != 0) {
					var4 = client.gamecon.readLEShort();
					var5 = client.gamecon.readUByte();
					var7 = client.gamecon.readUByte();
					var8 = client.gamecon.pos;
					if ((null != var10.aString1780) && (var10.aClass85_1770 != null)) {
						boolean var15 = false;
						if ((var5 <= 1) && Class34.method166(var10.aString1780))
							var15 = true;

						if (!var15 && (client.anInt1906 == 0)) {
							client.aClass104_Sub21_1885.pos = 0;
							client.gamecon.readBytes(client.aClass104_Sub21_1885.aByteArray1174, 0,
									var7);
							client.aClass104_Sub21_1885.pos = 0;
							final String var11 = Class104_Sub18_Sub17_Sub2
									.method879(Class80.method351(Class50.method224(client.aClass104_Sub21_1885)));
							var10.aString1723 = var11.trim();
							var10.anInt1731 = var4 >> 8;
							var10.anInt1749 = var4 & 255;
							var10.anInt1713 = 150;
							if ((var5 != 2) && (var5 != 3)) {
								if (var5 == 1)
									Class15.method60(1, Class72.method335(0) + var10.aString1780, var11);
								else
									Class15.method60(2, var10.aString1780, var11);
							} else
								Class15.method60(1, Class72.method335(1) + var10.aString1780, var11);
						}
					}

					client.gamecon.pos = var8 + var7;
				}

				if ((var3 & 2) != 0) {
					var4 = client.gamecon.method588();
					final byte[] var12 = new byte[var4];
					final RSBuf var13 = new RSBuf(var12);
					client.gamecon.method617(var12, 0, var4);
					client.aClass104_Sub21Array2030[var1] = var13;
					var10.method950(var13);
				}

				if ((var3 & 256) != 0) {
					var10.anInt1697 = client.gamecon.readUByte();
					var10.anInt1734 = client.gamecon.readByteN();
					var10.anInt1733 = client.gamecon.readUByte();
					var10.anInt1721 = client.gamecon.method576();
					var10.anInt1708 = client.gamecon.method594() + client.anInt1799;
					var10.anInt1737 = client.gamecon.readLEShort() + client.anInt1799;
					var10.anInt1738 = client.gamecon.readByteN();
					var10.anInt1744 = 1;
					var10.anInt1735 = 0;
				}

				if ((var3 & 32) != 0) {
					var10.anInt1716 = client.gamecon.readShortN();
					if (var10.anInt1716 == '\uffff')
						var10.anInt1716 = -1;
				}

				if ((var3 & 128) != 0) {
					var10.anInt1717 = client.gamecon.method594();
					var10.anInt1718 = client.gamecon.readShort();
				}

				if ((var3 & 16) != 0) {
					var4 = client.gamecon.method594();
					if (var4 == '\uffff')
						var4 = -1;

					var5 = client.gamecon.readByteN();
					Class75.method342(var10, var4, var5);
				}

				if ((var3 & 512) != 0) {
					var10.anInt1727 = client.gamecon.readShort();
					var4 = client.gamecon.readIntt();
					var10.anInt1709 = var4 >> 16;
					var10.anInt1730 = client.anInt1799 + (var4 & '\uffff');
					var10.anInt1728 = 0;
					var10.anInt1729 = 0;
					if (var10.anInt1730 > client.anInt1799)
						var10.anInt1728 = -1;

					if (var10.anInt1727 == '\uffff')
						var10.anInt1727 = -1;
				}

				if ((var3 & 1024) != 0) {
					var4 = client.gamecon.method576();
					var5 = client.gamecon.method588();
					var10.method935(var4, var5, client.anInt1799);
					var10.anInt1714 = client.anInt1799 + 300;
					var10.anInt1693 = client.gamecon.readUByte();
					var10.anInt1715 = client.gamecon.readByteN();
				}

				if ((var3 & 1) != 0) {
					var10.aString1723 = client.gamecon.method608();
					if (var10.aString1723.charAt(0) == 126) {
						var10.aString1723 = var10.aString1723.substring(1);
						Class15.method60(2, var10.aString1780, var10.aString1723);
					} else if (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644 == var10)
						Class15.method60(2, var10.aString1780, var10.aString1723);

					var10.anInt1731 = 0;
					var10.anInt1749 = 0;
					var10.anInt1713 = 150;
				}

				if ((var3 & 8) != 0) {
					var4 = client.gamecon.method576();
					var5 = client.gamecon.method588();
					var10.method935(var4, var5, client.anInt1799);
					var10.anInt1714 = 300 + client.anInt1799;
					var10.anInt1693 = client.gamecon.method576();
					var10.anInt1715 = client.gamecon.readUByte();
				}
			}

			for (var0 = 0; var0 < client.anInt1904; ++var0) {
				var1 = client.anIntArray2048[var0];
				if (client.anInt1799 != client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var1].anInt1739)
					client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var1] = null;
			}

			if (client.gamecon.pos != client.pktSize)
				throw new RuntimeException(client.gamecon.pos + "," + client.pktSize);
			else
				for (var0 = 0; var0 < client.anInt1994; ++var0)
					if (client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[client.anIntArray1909[var0]] == null)
						throw new RuntimeException(var0 + "," + client.anInt1994);
		}
	}

	static final void method550(final String var0, final boolean var1) {
		final byte var2 = 4;
		final int var3 = var2 + 6;
		final int var4 = 6 + var2;
		final int var5 = Class29.aClass104_Sub18_Sub17_Sub2_Sub1_277.method862(var0, 250);
		final int var6 = Class29.aClass104_Sub18_Sub17_Sub2_Sub1_277.method885(var0, 250) * 13;
		Class104_Sub18_Sub17.method805(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 0);
		Class104_Sub18_Sub17.method806(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215);
		Class29.aClass104_Sub18_Sub17_Sub2_Sub1_277.method865(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
		Class44.method192(var3 - var2, var4 - var2, var2 + var2 + var5, var6 + var2 + var2);
		if (var1)
			try {
				final Graphics var7 = Class57.aCanvas468.getGraphics();
				Applet_Sub1.aClass2_1764.method19(var7, 0, 0, 1996793884);
			} catch (final Exception var13) {
				Class57.aCanvas468.repaint();
			}
		else {
			final int var8 = var3;
			final int var9 = var4;
			final int var10 = var5;
			final int var11 = var6;

			for (int var12 = 0; var12 < client.anInt1982; ++var12)
				if (((client.anIntArray1995[var12] + client.anIntArray1993[var12]) > var8)
						&& (client.anIntArray1993[var12] < (var10 + var8))
						&& ((client.anIntArray1876[var12] + client.anIntArray1996[var12]) > var9)
						&& (client.anIntArray1876[var12] < (var11 + var9)))
					client.aBoolArray1991[var12] = true;
		}

	}
}
