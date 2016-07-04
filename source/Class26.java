public class Class26 {
	public static void method131() {
		Class85.aClass56_670.method239();
	}

	static void method132() {
		if (client.aBool1943) {
			final Widget var0 = Class29.method141(Class78.anInt628, client.anInt1970);
			if ((var0 != null) && (var0.anObjectArray1031 != null)) {
				final CS var1 = new CS();
				var1.ownerRSFaceHash = var0;
				var1.params = var0.anObjectArray1031;
				Class46.doCS(var1);
			}

			client.aBool1943 = false;
			Class79.setflags(var0);
		}
	}

	static final int method133(final Widget var0, final int var1) {
		if ((null != var0.anIntArrayArray1069) && (var1 < var0.anIntArrayArray1069.length))
			try {
				final int[] var2 = var0.anIntArrayArray1069[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					final int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0)
						return var3;

					if (var6 == 1)
						var7 = client.anIntArray1925[var2[var4++]];

					if (var6 == 2)
						var7 = client.anIntArray1833[var2[var4++]];

					if (var6 == 3)
						var7 = client.anIntArray1927[var2[var4++]];

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = Class47.method210(var9);
						var11 = var2[var4++];
						if ((var11 != -1) && (!Class27.method137(var11).aBool1440 || client.aBool1852))
							for (var12 = 0; var12 < var10.anIntArray1080.length; ++var12)
								if ((1 + var11) == var10.anIntArray1080[var12])
									var7 += var10.anIntArray1081[var12];
					}

					if (var6 == 5)
						var7 = Class71.anIntArray576[var2[var4++]];

					if (var6 == 6)
						var7 = Class38.anIntArray356[client.anIntArray1833[var2[var4++]] - 1];

					if (var6 == 7)
						var7 = (Class71.anIntArray576[var2[var4++]] * 100) / '\ub71b';

					if (var6 == 8)
						var7 = Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1773;

					if (var6 == 9)
						for (var9 = 0; var9 < 25; ++var9)
							if (Class38.aBoolArray357[var9])
								var7 += client.anIntArray1833[var9];

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = Class47.method210(var9);
						var11 = var2[var4++];
						if ((var11 != -1) && (!Class27.method137(var11).aBool1440 || client.aBool1852))
							for (var12 = 0; var12 < var10.anIntArray1080.length; ++var12)
								if (var10.anIntArray1080[var12] == (var11 + 1)) {
									var7 = 999999999;
									break;
								}
					}

					if (var6 == 11)
						var7 = client.anInt1944;

					if (var6 == 12)
						var7 = client.anInt1953;

					if (var6 == 13) {
						var9 = Class71.anIntArray576[var2[var4++]];
						final int var13 = var2[var4++];
						var7 = (var9 & (1 << var13)) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = Class52.method228(var9);
					}

					if (var6 == 15)
						var8 = 1;

					if (var6 == 16)
						var8 = 2;

					if (var6 == 17)
						var8 = 3;

					if (var6 == 18)
						var7 = Class53.anInt436 + (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 >> 7);

					if (var6 == 19)
						var7 = Class20.anInt206 + (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 >> 7);

					if (var6 == 20)
						var7 = var2[var4++];

					if (var8 == 0) {
						if (var5 == 0)
							var3 += var7;

						if (var5 == 1)
							var3 -= var7;

						if ((var5 == 2) && (var7 != 0))
							var3 /= var7;

						if (var5 == 3)
							var3 *= var7;

						var5 = 0;
					} else
						var5 = var8;
				}
			} catch (final Exception var14) {
				return -1;
			}
		else
			return -2;
	}

	static final void method134(final int var0, final int var1, final int var2) {
		Class101.method465();
		Class104_Sub18_Sub17.method800(var0, var1, var0 + Class49.aClass104_Sub18_Sub17_Sub3_417.anInt1618,
				Class49.aClass104_Sub18_Sub17_Sub3_417.anInt1619 + var1);
		if ((client.anInt2021 != 2) && (client.anInt2021 != 5)) {
			final int var3 = (client.anInt1862 + client.anInt1866) & 2047;
			final int var4 = 48 + (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 / 32);
			final int var5 = 464 - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 / 32);
			Class104_Sub2.aClass104_Sub18_Sub17_Sub1_861.method848(var0 + 25, 5 + var1, 146, 151, var4, var5, var3,
					256 + client.anInt1921, Class42.anIntArray373, Class54.anIntArray448);

			int var6;
			int var7;
			int var8;
			for (var6 = 0; var6 < client.anInt2014; ++var6) {
				var7 = (2 + (client.anIntArray2015[var6] * 4))
						- (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 / 32);
				var8 = (2 + (4 * client.anIntArray2016[var6]))
						- (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 / 32);
				Class66.method302(var0, var1, var7, var8, client.aClass104_Sub18_Sub17_Sub1Array2017[var6]);
			}

			int var10;
			int var11;
			for (var6 = 0; var6 < 104; ++var6)
				for (var7 = 0; var7 < 104; ++var7) {
					final Class59 var9 = client.aClass59ArrayArrayArray1952[Class12.anInt73][var6][var7];
					if (var9 != null) {
						var10 = ((4 * var6) + 2) - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 / 32);
						var11 = ((var7 * 4) + 2) - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 / 32);
						Class66.method302(var0, var1, var10, var11, Class44.aClass104_Sub18_Sub17_Sub1Array394[0]);
					}
				}

			for (var6 = 0; var6 < client.anInt1832; ++var6) {
				final Class104_Sub18_Sub16_Sub7_Sub2 var12 = client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[client.anIntArray1830[var6]];
				if ((var12 != null) && var12.method936(1531790724)) {
					Class104_Sub18_Sub2 var15 = var12.aClass104_Sub18_Sub2_1788;
					if ((var15 != null) && (var15.anIntArray1230 != null))
						var15 = var15.method677();

					if ((var15 != null) && var15.aBool1255 && var15.aBool1257) {
						var10 = (var12.anInt1695 / 32) - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 / 32);
						var11 = (var12.anInt1694 / 32) - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 / 32);
						Class66.method302(var0, var1, var10, var11, Class44.aClass104_Sub18_Sub17_Sub1Array394[1]);
					}
				}
			}

			for (var6 = 0; var6 < client.anInt1994; ++var6) {
				final Class104_Sub18_Sub16_Sub7_Sub1 var17 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[client.anIntArray1909[var6]];
				if ((var17 != null) && var17.method936(1531790724)) {
					var8 = (var17.anInt1695 / 32) - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 / 32);
					var10 = (var17.anInt1694 / 32) - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 / 32);
					boolean var16 = false;
					if (BZip2Context.method154(var17.aString1780))
						var16 = true;

					boolean var13 = false;
					if ((Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1787 != 0) && (var17.anInt1787 != 0)
							&& (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1787 == var17.anInt1787))
						var13 = true;

					if (var16)
						Class66.method302(var0, var1, var8, var10, Class44.aClass104_Sub18_Sub17_Sub1Array394[3]);
					else if (var13)
						Class66.method302(var0, var1, var8, var10, Class44.aClass104_Sub18_Sub17_Sub1Array394[4]);
					else
						Class66.method302(var0, var1, var8, var10, Class44.aClass104_Sub18_Sub17_Sub1Array394[2]);
				}
			}

			if ((client.anInt1797 != 0) && ((client.anInt1799 % 20) < 10)) {
				if ((client.anInt1797 == 1) && (client.anInt1808 >= 0)
						&& (client.anInt1808 < client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828.length)) {
					final Class104_Sub18_Sub16_Sub7_Sub2 var14 = client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[client.anInt1808];
					if (var14 != null) {
						var7 = (var14.anInt1695 / 32) - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 / 32);
						var8 = (var14.anInt1694 / 32) - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 / 32);
						Class11.method49(var0, var1, var7, var8, Class42.aClass104_Sub18_Sub17_Sub1Array372[1]);
					}
				}

				if (client.anInt1797 == 2) {
					var6 = (((client.anInt1810 * 4) - (Class53.anInt436 * 4)) + 2)
							- (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 / 32);
					var7 = (((client.anInt1811 * 4) - (Class20.anInt206 * 4)) + 2)
							- (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 / 32);
					Class11.method49(var0, var1, var6, var7, Class42.aClass104_Sub18_Sub17_Sub1Array372[1]);
				}

				if ((client.anInt1797 == 10) && (client.anInt1809 >= 0)
						&& (client.anInt1809 < client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937.length)) {
					final Class104_Sub18_Sub16_Sub7_Sub1 var18 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[client.anInt1809];
					if (var18 != null) {
						var7 = (var18.anInt1695 / 32) - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 / 32);
						var8 = (var18.anInt1694 / 32) - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 / 32);
						Class11.method49(var0, var1, var7, var8, Class42.aClass104_Sub18_Sub17_Sub1Array372[1]);
					}
				}
			}

			if (client.anInt2018 != 0) {
				var6 = ((client.anInt2018 * 4) + 2) - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 / 32);
				var7 = ((client.anInt1880 * 4) + 2) - (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 / 32);
				Class66.method302(var0, var1, var6, var7, Class42.aClass104_Sub18_Sub17_Sub1Array372[0]);
			}

			Class104_Sub18_Sub17.method805(var0 + 93 + 4, (82 + var1) - 4, 3, 3, 16777215);
		} else
			Class104_Sub18_Sub17.method799(25 + var0, var1 + 5, 0, Class42.anIntArray373, Class54.anIntArray448);

		if (client.anInt2021 < 3)
			Class12.aClass104_Sub18_Sub17_Sub1_75.method848(var0, var1, 33, 33, 25, 25, client.anInt1866, 256,
					Class30.anIntArray286, Class66.anIntArray549);
		else
			Class104_Sub18_Sub17.method799(var0, var1, 0, Class30.anIntArray286, Class66.anIntArray549);

		if (client.aBoolArray1992[var2])
			Class49.aClass104_Sub18_Sub17_Sub3_417.method889(var0, var1);

		client.aBoolArray1991[var2] = true;
	}

	public static void method135() {
		ObjectDefinition.aClass56_1366.method239();
		ObjectDefinition.aClass56_1326.method239();
		ObjectDefinition.aClass56_1327.method239();
		ObjectDefinition.aClass56_1328.method239();
	}
}
