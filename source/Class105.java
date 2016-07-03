public class Class105 {
	public static Class59 aClass59_825 = new Class59();

	static final void method472(final byte[] var0, final int var1, final int var2, final Class17 var3,
			final Class67[] var4) {
		final Class104_Sub21 var5 = new Class104_Sub21(var0);
		int var6 = -1;

		while (true) {
			final int var7 = var5.method599();
			if (var7 == 0)
				return;

			var6 += var7;
			int var8 = 0;

			while (true) {
				final int var9 = var5.method599();
				if (var9 == 0)
					break;

				var8 += var9 - 1;
				final int var10 = var8 & 63;
				final int var11 = (var8 >> 6) & 63;
				final int var12 = var8 >> 12;
				final int var13 = var5.method570();
				final int var14 = var13 >> 2;
				final int var15 = var13 & 3;
				final int var16 = var1 + var11;
				final int var17 = var2 + var10;
				if ((var16 > 0) && (var17 > 0) && (var16 < 103) && (var17 < 103)) {
					int var18 = var12;
					if ((Class76.aByteArrayArrayArray600[1][var16][var17] & 2) == 2)
						var18 = var12 - 1;

					Class67 var19 = null;
					if (var18 >= 0)
						var19 = var4[var18];

					Class34.method163(var12, var16, var17, var6, var15, var14, var3, var19);
				}
			}
		}
	}

	static final void method473(final Class104_Sub18_Sub16_Sub7 var0) {
		if (var0.anInt1740 != 0) {
			int var2;
			int var3;
			if ((var0.anInt1716 != -1) && (var0.anInt1716 < '\u8000')) {
				final Class104_Sub18_Sub16_Sub7_Sub2 var1 = client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var0.anInt1716];
				if (var1 != null) {
					var2 = var0.anInt1695 - var1.anInt1695;
					var3 = var0.anInt1694 - var1.anInt1694;
					if ((var2 != 0) || (var3 != 0))
						var0.anInt1698 = (int) (Math.atan2(var2, var3) * 325.949D) & 2047;
				}
			}

			int var4;
			if (var0.anInt1716 >= '\u8000') {
				var4 = var0.anInt1716 - '\u8000';
				if (client.anInt1874 == var4)
					var4 = 2047;

				final Class104_Sub18_Sub16_Sub7_Sub1 var5 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var4];
				if (null != var5) {
					var3 = var0.anInt1695 - var5.anInt1695;
					final int var6 = var0.anInt1694 - var5.anInt1694;
					if ((var3 != 0) || (var6 != 0))
						var0.anInt1698 = (int) (Math.atan2(var3, var6) * 325.949D) & 2047;
				}
			}

			if (((var0.anInt1717 != 0) || (var0.anInt1718 != 0)) && ((var0.anInt1744 == 0) || (var0.anInt1748 > 0))) {
				var4 = var0.anInt1695 - ((var0.anInt1717 * 64) - (Class53.anInt436 * 64) - (Class53.anInt436 * 64));
				var2 = var0.anInt1694 - ((var0.anInt1718 * 64) - (Class20.anInt206 * 64) - (Class20.anInt206 * 64));
				if ((var4 != 0) || (var2 != 0))
					var0.anInt1698 = (int) (Math.atan2(var4, var2) * 325.949D) & 2047;

				var0.anInt1717 = 0;
				var0.anInt1718 = 0;
			}

			var4 = (var0.anInt1698 - var0.anInt1725) & 2047;
			if (var4 != 0) {
				++var0.anInt1742;
				boolean var7;
				if (var4 > 1024) {
					var0.anInt1725 -= var0.anInt1740;
					var7 = true;
					if ((var4 < var0.anInt1740) || (var4 > (2048 - var0.anInt1740))) {
						var0.anInt1725 = var0.anInt1698;
						var7 = false;
					}

					if ((var0.anInt1719 == var0.anInt1702) && ((var0.anInt1742 > 25) || var7))
						if (var0.anInt1699 != -1)
							var0.anInt1719 = var0.anInt1699;
						else
							var0.anInt1719 = var0.anInt1701;
				} else {
					var0.anInt1725 += var0.anInt1740;
					var7 = true;
					if ((var4 < var0.anInt1740) || (var4 > (2048 - var0.anInt1740))) {
						var0.anInt1725 = var0.anInt1698;
						var7 = false;
					}

					if ((var0.anInt1702 == var0.anInt1719) && ((var0.anInt1742 > 25) || var7))
						if (var0.anInt1700 != -1)
							var0.anInt1719 = var0.anInt1700;
						else
							var0.anInt1719 = var0.anInt1701;
				}

				var0.anInt1725 &= 2047;
			} else
				var0.anInt1742 = 0;

		}
	}
}
