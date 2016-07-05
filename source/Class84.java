import java.io.IOException;

public class Class84 {
	static Widget aClass104_Sub12_660;
	int anInt657;
	int anInt658;
	int[][] anIntArrayArray659;

	int method375(int var1) {
		if (null != anIntArrayArray659)
			var1 = (int) (((long) anInt658 * (long) var1) / anInt657);

		return var1;
	}

	int method376(int var1) {
		if (anIntArrayArray659 != null)
			var1 = 6 + (int) (((long) var1 * (long) anInt658) / anInt657);

		return var1;
	}

	public Class84(int var1, int var2) {
		if (var1 != var2) {
			final int var3 = Class22.method123(var1, var2);
			var1 /= var3;
			var2 /= var3;
			anInt657 = var1;
			anInt658 = var2;
			anIntArrayArray659 = new int[var1][14];

			for (int var4 = 0; var4 < var1; ++var4) {
				final int[] var5 = anIntArrayArray659[var4];
				final double var6 = ((double) var4 / (double) var1) + 6.0D;
				int var8 = (int) Math.floor(1.0D + (var6 - 7.0D));
				if (var8 < 0)
					var8 = 0;

				int var9 = (int) Math.ceil(7.0D + var6);
				if (var9 > 14)
					var9 = 14;

				for (final double var10 = (double) var2 / (double) var1; var8 < var9; ++var8) {
					final double var12 = (var8 - var6) * 3.141592653589793D;
					double var14 = var10;
					if ((var12 < -1.0E-4D) || (var12 > 1.0E-4D))
						var14 = var10 * (Math.sin(var12) / var12);

					var14 *= 0.54D + (0.46D * Math.cos(0.2243994752564138D * (var8 - var6)));
					var5[var8] = (int) Math.floor((var14 * 65536.0D) + 0.5D);
				}
			}

		}
	}

	byte[] method377(byte[] var1) {
		if (anIntArrayArray659 != null) {
			final int var2 = (int) (((long) anInt658 * (long) var1.length) / anInt657) + 14;
			final int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				final byte var7 = var1[var6];
				final int[] var8 = anIntArrayArray659[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9)
					var3[var4 + var9] += var7 * var8[var9];

				var5 += anInt658;
				var9 = var5 / anInt657;
				var4 += var9;
				var5 -= var9 * anInt657;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				final int var10 = (var3[var6] + '\u8000') >> 16;
				if (var10 < -128)
					var1[var6] = -128;
				else if (var10 > 127)
					var1[var6] = 127;
				else
					var1[var6] = (byte) var10;
			}
		}

		return var1;
	}

	public static char method378(final char var0) {
		if ((var0 >= 192) && (var0 <= 255)) {
			if ((var0 >= 192) && (var0 <= 198))
				return '\u0041';

			if (var0 == 199)
				return '\u0043';

			if ((var0 >= 200) && (var0 <= 203))
				return '\u0045';

			if ((var0 >= 204) && (var0 <= 207))
				return '\u0049';

			if ((var0 >= 210) && (var0 <= 214))
				return '\u004f';

			if ((var0 >= 217) && (var0 <= 220))
				return '\u0055';

			if (var0 == 221)
				return '\u0059';

			if (var0 == 223)
				return '\u0073';

			if ((var0 >= 224) && (var0 <= 230))
				return '\u0061';

			if (var0 == 231)
				return '\u0063';

			if ((var0 >= 232) && (var0 <= 235))
				return '\u0065';

			if ((var0 >= 236) && (var0 <= 239))
				return '\u0069';

			if ((var0 >= 242) && (var0 <= 246))
				return '\u006f';

			if ((var0 >= 249) && (var0 <= 252))
				return '\u0075';

			if ((var0 == 253) || (var0 == 255))
				return '\u0079';
		}

		if (var0 == 338)
			return '\u004f';
		else if (var0 == 339)
			return '\u006f';
		else if (var0 == 376)
			return '\u0059';
		else
			return var0;
	}

	public static void method379(final boolean var0) {
		if (null != Class66.aClass13_547)
			try {
				final RSBuf var1 = new RSBuf(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeTribyte(0);
				Class66.aClass13_547.flushbytes(var1.backing, 0, 4);
			} catch (final IOException var4) {
				try {
					Class66.aClass13_547.destory();
				} catch (final Exception var3) {
					;
				}

				++Class87.anInt698;
				Class66.aClass13_547 = null;
			}
	}

	static final void method380(final int var0, final int var1) {
		if ((client.anInt2021 == 0) || (client.anInt2021 == 3))
			if (Class14.anInt100 == 1) {
				int var2 = Class14.anInt101 - 25 - var0;
				int var3 = Class14.anInt102 - 5 - var1;
				if ((var2 >= 0) && (var3 >= 0) && (var2 < 146) && (var3 < 151)) {
					var2 -= 73;
					var3 -= 75;
					final int var4 = (client.anInt1862 + client.anInt1866) & 2047;
					int var5 = Class104_Sub18_Sub17_Sub4.anIntArray1680[var4];
					int var6 = Class104_Sub18_Sub17_Sub4.anIntArray1678[var4];
					var5 = ((256 + client.anInt1921) * var5) >> 8;
					var6 = ((client.anInt1921 + 256) * var6) >> 8;
					final int var7 = ((var3 * var5) + (var2 * var6)) >> 11;
					final int var8 = ((var3 * var6) - (var2 * var5)) >> 11;
					final int var9 = (var7 + Class81.activePlayer.anInt1695) >> 7;
					final int var10 = (Class81.activePlayer.anInt1694 - var8) >> 7;
					final boolean var11 = Class104_Sub13.pathfind(
							Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var9, var10, true, 0, 0, 0,
							0, 0, 1);
					if (var11) {
						client.secureBuf.writeByte(var2);
						client.secureBuf.writeByte(var3);
						client.secureBuf.writeShort(client.anInt1866);
						client.secureBuf.writeByte(57);
						client.secureBuf.writeByte(client.anInt1862);
						client.secureBuf.writeByte(client.anInt1921);
						client.secureBuf.writeByte(89);
						client.secureBuf
								.writeShort(Class81.activePlayer.anInt1695);
						client.secureBuf
								.writeShort(Class81.activePlayer.anInt1694);
						client.secureBuf.writeByte(client.anInt1850);
						client.secureBuf.writeByte(63);
					}
				}
			}
	}

	static final void method381(final Class104_Sub18_Sub16_Sub7 var0) {
		var0.aBool1696 = false;
		Def var1;
		if (var0.anInt1719 != -1) {
			var1 = Class70.forId(var0.anInt1719);
			if ((null != var1) && (var1.anIntArray1262 != null)) {
				++var0.anInt1741;
				if ((var0.anInt1720 < var1.anIntArray1262.length)
						&& (var0.anInt1741 > var1.anIntArray1264[var0.anInt1720])) {
					var0.anInt1741 = 1;
					++var0.anInt1720;
					Class104_Sub1.method477(var1, var0.anInt1720, var0.anInt1695, var0.anInt1694);
				}

				if (var0.anInt1720 >= var1.anIntArray1262.length) {
					var0.anInt1741 = 0;
					var0.anInt1720 = 0;
					Class104_Sub1.method477(var1, var0.anInt1720, var0.anInt1695, var0.anInt1694);
				}
			} else
				var0.anInt1719 = -1;
		}

		if ((var0.gfxId != -1) && (client.currentTime >= var0.gfxDelay)) {
			if (var0.anInt1728 < 0)
				var0.anInt1728 = 0;

			final int var2 = Class71.method330(var0.gfxId).anInt1316;
			if (var2 != -1) {
				final Def var3 = Class70.forId(var2);
				if ((var3 != null) && (var3.anIntArray1262 != null)) {
					++var0.anInt1729;
					if ((var0.anInt1728 < var3.anIntArray1262.length)
							&& (var0.anInt1729 > var3.anIntArray1264[var0.anInt1728])) {
						var0.anInt1729 = 1;
						++var0.anInt1728;
						Class104_Sub1.method477(var3, var0.anInt1728, var0.anInt1695, var0.anInt1694);
					}

					if ((var0.anInt1728 >= var3.anIntArray1262.length)
							&& ((var0.anInt1728 < 0) || (var0.anInt1728 >= var3.anIntArray1262.length)))
						var0.gfxId = -1;
				} else
					var0.gfxId = -1;
			} else
				var0.gfxId = -1;
		}

		if ((var0.anInt1722 != -1) && (var0.anInt1707 <= 1)) {
			var1 = Class70.forId(var0.anInt1722);
			if ((var1.anInt1273 == 1) && (var0.anInt1735 > 0) && (var0.anInt1708 <= client.currentTime)
					&& (var0.anInt1737 < client.currentTime)) {
				var0.anInt1707 = 1;
				return;
			}
		}

		if ((var0.anInt1722 != -1) && (var0.anInt1707 == 0)) {
			var1 = Class70.forId(var0.anInt1722);
			if ((var1 != null) && (var1.anIntArray1262 != null)) {
				++var0.anInt1724;
				if ((var0.anInt1732 < var1.anIntArray1262.length)
						&& (var0.anInt1724 > var1.anIntArray1264[var0.anInt1732])) {
					var0.anInt1724 = 1;
					++var0.anInt1732;
					Class104_Sub1.method477(var1, var0.anInt1732, var0.anInt1695, var0.anInt1694);
				}

				if (var0.anInt1732 >= var1.anIntArray1262.length) {
					var0.anInt1732 -= var1.anInt1266;
					++var0.anInt1726;
					if (var0.anInt1726 >= var1.anInt1261)
						var0.anInt1722 = -1;
					else if ((var0.anInt1732 >= 0) && (var0.anInt1732 < var1.anIntArray1262.length))
						Class104_Sub1.method477(var1, var0.anInt1732, var0.anInt1695, var0.anInt1694);
					else
						var0.anInt1722 = -1;
				}

				var0.aBool1696 = var1.aBool1272;
			} else
				var0.anInt1722 = -1;
		}

		if (var0.anInt1707 > 0)
			--var0.anInt1707;

	}

	public static Def2 forId(final int var0) {
		Def2 var1 = (Def2) Def2.aClass56_1393.method236(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Def2.aClass61_1391.decompress(3, var0);
			var1 = new Def2();
			if (var2 != null)
				var1.method761(new RSBuf(var2));

			Def2.aClass56_1393.method238(var1, var0);
			return var1;
		}
	}
}
