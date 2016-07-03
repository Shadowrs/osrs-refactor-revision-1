public class Class104_Sub13 extends Class104 {
	public Class16 aClass16_1095;
	public byte[] aByteArray1096;
	int anInt1097;
	public Class61_Sub1 aClass61_Sub1_1098;
	static Class104_Sub7[] aClass104_Sub7Array1099;

	static final void method542(final String var0) {
		if (client.anInt1915 >= 2) {
			if (var0.equalsIgnoreCase("::gc"))
				System.gc();

			if (var0.equalsIgnoreCase("::clientdrop"))
				if (client.anInt1836 > 0)
					Class61_Sub1.method494();
				else {
					Class10.method40(40);
					Class57.aClass13_467 = Class20.aClass13_205;
					Class20.aClass13_205 = null;
				}

			if (var0.equalsIgnoreCase("::fpson"))
				client.aBool1860 = true;

			if (var0.equalsIgnoreCase("::fpsoff"))
				client.aBool1860 = false;

			if (var0.equalsIgnoreCase("::noclip"))
				for (int var1 = 0; var1 < 4; ++var1)
					for (int var2 = 1; var2 < 103; ++var2)
						for (int var3 = 1; var3 < 103; ++var3)
							client.aClass67Array1975[var1].anIntArrayArray553[var2][var3] = 0;

			if (var0.equalsIgnoreCase("::errortest") && (client.anInt1792 == 2))
				throw new RuntimeException();
		}

		client.aClass104_Sub21_Sub1_1825.method623(30);
		client.aClass104_Sub21_Sub1_1825.method561(var0.length() - 1);
		client.aClass104_Sub21_Sub1_1825.method563(var0.substring(2));
	}

	static final boolean method543(final int var0, final int var1, final int var2, final int var3, final boolean var4,
			final int var5, final int var6, final int var7, final int var8, final int var9, final int var10) {
		int var11;
		int var12;
		for (var11 = 0; var11 < 104; ++var11)
			for (var12 = 0; var12 < 104; ++var12) {
				client.anIntArrayArray1907[var11][var12] = 0;
				client.anIntArrayArray1822[var11][var12] = 99999999;
			}

		var11 = var0;
		var12 = var1;
		client.anIntArrayArray1907[var0][var1] = 99;
		client.anIntArrayArray1822[var0][var1] = 0;
		final byte var13 = 0;
		int var14 = 0;
		client.anIntArray1853[var13] = var0;
		int var26 = var13 + 1;
		client.anIntArray1854[var13] = var1;
		boolean var15 = false;
		int var16 = client.anIntArray1853.length;
		final int[][] var17 = client.aClass67Array1975[Class12.anInt73].anIntArrayArray553;

		int var18;
		while (var14 != var26) {
			var11 = client.anIntArray1853[var14];
			var12 = client.anIntArray1854[var14];
			var14 = (1 + var14) % var16;
			if ((var2 == var11) && (var12 == var3)) {
				var15 = true;
				break;
			}

			if (var5 != 0) {
				if (((var5 < 5) || (var5 == 10)) && client.aClass67Array1975[Class12.anInt73].method305(var11, var12,
						var2, var3, var5 - 1, var6)) {
					var15 = true;
					break;
				}

				if ((var5 < 10) && client.aClass67Array1975[Class12.anInt73].method311(var11, var12, var2, var3,
						var5 - 1, var6)) {
					var15 = true;
					break;
				}
			}

			if ((var7 != 0) && (var8 != 0) && client.aClass67Array1975[Class12.anInt73].method312(var11, var12, var2,
					var3, var7, var8, var9)) {
				var15 = true;
				break;
			}

			var18 = client.anIntArrayArray1822[var11][var12] + 1;
			if ((var11 > 0) && (client.anIntArrayArray1907[var11 - 1][var12] == 0)
					&& ((var17[var11 - 1][var12] & 19661064) == 0)) {
				client.anIntArray1853[var26] = var11 - 1;
				client.anIntArray1854[var26] = var12;
				var26 = (var26 + 1) % var16;
				client.anIntArrayArray1907[var11 - 1][var12] = 2;
				client.anIntArrayArray1822[var11 - 1][var12] = var18;
			}

			if ((var11 < 103) && (client.anIntArrayArray1907[var11 + 1][var12] == 0)
					&& ((var17[1 + var11][var12] & 19661184) == 0)) {
				client.anIntArray1853[var26] = var11 + 1;
				client.anIntArray1854[var26] = var12;
				var26 = (var26 + 1) % var16;
				client.anIntArrayArray1907[1 + var11][var12] = 8;
				client.anIntArrayArray1822[1 + var11][var12] = var18;
			}

			if ((var12 > 0) && (client.anIntArrayArray1907[var11][var12 - 1] == 0)
					&& ((var17[var11][var12 - 1] & 19661058) == 0)) {
				client.anIntArray1853[var26] = var11;
				client.anIntArray1854[var26] = var12 - 1;
				var26 = (var26 + 1) % var16;
				client.anIntArrayArray1907[var11][var12 - 1] = 1;
				client.anIntArrayArray1822[var11][var12 - 1] = var18;
			}

			if ((var12 < 103) && (client.anIntArrayArray1907[var11][1 + var12] == 0)
					&& ((var17[var11][var12 + 1] & 19661088) == 0)) {
				client.anIntArray1853[var26] = var11;
				client.anIntArray1854[var26] = var12 + 1;
				var26 = (var26 + 1) % var16;
				client.anIntArrayArray1907[var11][var12 + 1] = 4;
				client.anIntArrayArray1822[var11][1 + var12] = var18;
			}

			if ((var11 > 0) && (var12 > 0) && (client.anIntArrayArray1907[var11 - 1][var12 - 1] == 0)
					&& ((var17[var11 - 1][var12 - 1] & 19661070) == 0) && ((var17[var11 - 1][var12] & 19661064) == 0)
					&& ((var17[var11][var12 - 1] & 19661058) == 0)) {
				client.anIntArray1853[var26] = var11 - 1;
				client.anIntArray1854[var26] = var12 - 1;
				var26 = (1 + var26) % var16;
				client.anIntArrayArray1907[var11 - 1][var12 - 1] = 3;
				client.anIntArrayArray1822[var11 - 1][var12 - 1] = var18;
			}

			if ((var11 < 103) && (var12 > 0) && (client.anIntArrayArray1907[var11 + 1][var12 - 1] == 0)
					&& ((var17[1 + var11][var12 - 1] & 19661187) == 0) && ((var17[var11 + 1][var12] & 19661184) == 0)
					&& ((var17[var11][var12 - 1] & 19661058) == 0)) {
				client.anIntArray1853[var26] = 1 + var11;
				client.anIntArray1854[var26] = var12 - 1;
				var26 = (var26 + 1) % var16;
				client.anIntArrayArray1907[1 + var11][var12 - 1] = 9;
				client.anIntArrayArray1822[1 + var11][var12 - 1] = var18;
			}

			if ((var11 > 0) && (var12 < 103) && (client.anIntArrayArray1907[var11 - 1][1 + var12] == 0)
					&& ((var17[var11 - 1][1 + var12] & 19661112) == 0) && ((var17[var11 - 1][var12] & 19661064) == 0)
					&& ((var17[var11][1 + var12] & 19661088) == 0)) {
				client.anIntArray1853[var26] = var11 - 1;
				client.anIntArray1854[var26] = var12 + 1;
				var26 = (1 + var26) % var16;
				client.anIntArrayArray1907[var11 - 1][var12 + 1] = 6;
				client.anIntArrayArray1822[var11 - 1][var12 + 1] = var18;
			}

			if ((var11 < 103) && (var12 < 103) && (client.anIntArrayArray1907[var11 + 1][var12 + 1] == 0)
					&& ((var17[var11 + 1][var12 + 1] & 19661280) == 0) && ((var17[1 + var11][var12] & 19661184) == 0)
					&& ((var17[var11][var12 + 1] & 19661088) == 0)) {
				client.anIntArray1853[var26] = var11 + 1;
				client.anIntArray1854[var26] = var12 + 1;
				var26 = (var26 + 1) % var16;
				client.anIntArrayArray1907[var11 + 1][1 + var12] = 12;
				client.anIntArrayArray1822[var11 + 1][var12 + 1] = var18;
			}
		}

		client.anInt1850 = 0;
		int var19;
		int var21;
		int var22;
		if (!var15) {
			if (!var4)
				return false;

			var18 = 1000;
			var19 = 100;
			final byte var20 = 10;

			for (var21 = var2 - var20; var21 <= (var20 + var2); ++var21)
				for (var22 = var3 - var20; var22 <= (var3 + var20); ++var22)
					if ((var21 >= 0) && (var22 >= 0) && (var21 < 104) && (var22 < 104)
							&& (client.anIntArrayArray1822[var21][var22] < 100)) {
						int var23 = 0;
						if (var21 < var2)
							var23 = var2 - var21;
						else if (var21 > ((var7 + var2) - 1))
							var23 = var21 - ((var7 + var2) - 1);

						int var24 = 0;
						if (var22 < var3)
							var24 = var3 - var22;
						else if (var22 > ((var8 + var3) - 1))
							var24 = var22 - ((var3 + var8) - 1);

						final int var25 = (var23 * var23) + (var24 * var24);
						if ((var25 < var18)
								|| ((var18 == var25) && (client.anIntArrayArray1822[var21][var22] < var19))) {
							var18 = var25;
							var19 = client.anIntArrayArray1822[var21][var22];
							var11 = var21;
							var12 = var22;
						}
					}

			if (var18 == 1000)
				return false;

			if ((var0 == var11) && (var12 == var1))
				return false;

			client.anInt1850 = 1;
		}

		final byte var27 = 0;
		client.anIntArray1853[var27] = var11;
		var14 = var27 + 1;
		client.anIntArray1854[var27] = var12;

		for (var18 = var19 = client.anIntArrayArray1907[var11][var12]; (var11 != var0)
				|| (var1 != var12); var18 = client.anIntArrayArray1907[var11][var12]) {
			if (var18 != var19) {
				var19 = var18;
				client.anIntArray1853[var14] = var11;
				client.anIntArray1854[var14++] = var12;
			}

			if ((var18 & 2) != 0)
				++var11;
			else if ((var18 & 8) != 0)
				--var11;

			if ((var18 & 1) != 0)
				++var12;
			else if ((var18 & 4) != 0)
				--var12;
		}

		if (var14 <= 0) {
			if (var10 == 1)
				return false;
			else
				return true;
		} else {
			var16 = var14;
			if (var14 > 25)
				var16 = 25;

			--var14;
			final int var28 = client.anIntArray1853[var14];
			var21 = client.anIntArray1854[var14];
			if (var10 == 0) {
				client.aClass104_Sub21_Sub1_1825.method623(176);
				client.aClass104_Sub21_Sub1_1825.method561(3 + var16 + var16);
			}

			if (var10 == 1) {
				client.aClass104_Sub21_Sub1_1825.method623(60);
				client.aClass104_Sub21_Sub1_1825.method561(14 + 3 + var16 + var16);
			}

			if (var10 == 2) {
				client.aClass104_Sub21_Sub1_1825.method623(214);
				client.aClass104_Sub21_Sub1_1825.method561(3 + var16 + var16);
			}

			client.anInt2018 = client.anIntArray1853[0];
			client.anInt1880 = client.anIntArray1854[0];

			for (var22 = 1; var22 < var16; ++var22) {
				--var14;
				client.aClass104_Sub21_Sub1_1825.method584(client.anIntArray1853[var14] - var28);
				client.aClass104_Sub21_Sub1_1825.method586(client.anIntArray1854[var14] - var21);
			}

			client.aClass104_Sub21_Sub1_1825.method592(Class20.anInt206 + var21);
			client.aClass104_Sub21_Sub1_1825.method561(Class25.aBoolArray249[82] ? 1 : 0);
			client.aClass104_Sub21_Sub1_1825.method603(var28 + Class53.anInt436);
			return true;
		}
	}

	static final int method544(final int var0, final int var1, final int var2) {
		final int var3 = 256 - var2;
		return ((((var3 * (var0 & 16711935)) + ((var1 & 16711935) * var2)) & -16711936)
				+ (((var2 * (var1 & '\uff00')) + ((var0 & '\uff00') * var3)) & 16711680)) >> 8;
	}
}
