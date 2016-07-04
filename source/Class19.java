public class Class19 {
	static int anInt195;

	static final boolean loadClipping(final byte[] var0, final int var1, final int var2) {
		boolean valid = true;
		final RSBuf var4 = new RSBuf(var0);
		int objId = -1;

		label57: while (true) {
			final int var6 = var4.readsmart();
			if (var6 == 0)
				return valid;

			objId += var6;
			int var7 = 0;
			boolean finished = false;

			while (true) {
				int opc;
				while (!finished) {
					opc = var4.readsmart();
					if (opc == 0)
						continue label57;

					var7 += opc - 1;
					final int var10 = var7 & 63;
					final int var11 = (var7 >> 6) & 63;
					final int var12 = var4.readUByte() >> 2;
					final int var13 = var1 + var11;
					final int var14 = var10 + var2;
					if ((var13 > 0) && (var14 > 0) && (var13 < 103) && (var14 < 103)) {
						final ObjectDefinition obj = Class104_Sub18_Sub12.forId(objId);
						if ((var12 != 22) || !client.lowmvm || (obj.anInt1342 != 0) || (obj.anInt1363 == 1)
								|| obj.aBool1362) {
							if (!obj.valid()) {
								++client.anInt1843;
								valid = false;
							}

							finished = true;
						}
					}
				}

				opc = var4.readsmart();
				if (opc == 0)
					break;

				var4.readUByte();
			}
		}
	}

	static final void method120(final int var0, final int var1, final int var2, final int var3, final int var4) {
		if ((var0 != Class54.anInt447) || (var1 != Class96.anInt761)
				|| ((client.anInt1988 != var2) && client.lowmvm)) {
			Class54.anInt447 = var0;
			Class96.anInt761 = var1;
			client.anInt1988 = var2;
			if (!client.lowmvm)
				client.anInt1988 = 0;

			Class10.method40(25);
			Class104_Sub15.drawLoading("Loading - please wait.", true);
			int var5 = Class53.anInt436;
			int var6 = Class20.anInt206;
			Class53.anInt436 = (var0 - 6) * 8;
			Class20.anInt206 = (var1 - 6) * 8;
			final int var7 = Class53.anInt436 - var5;
			final int var8 = Class20.anInt206 - var6;
			var5 = Class53.anInt436;
			var6 = Class20.anInt206;

			int var9;
			int var11;
			for (var9 = 0; var9 < '\u8000'; ++var9) {
				final Class104_Sub18_Sub16_Sub7_Sub2 var10 = client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var9];
				if (var10 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10.anIntArray1745[var11] -= var7;
						var10.anIntArray1746[var11] -= var8;
					}

					var10.anInt1695 -= var7 * 128;
					var10.anInt1694 -= 128 * var8;
				}
			}

			for (var9 = 0; var9 < 2048; ++var9) {
				final Class104_Sub18_Sub16_Sub7_Sub1 var23 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var9];
				if (null != var23) {
					for (var11 = 0; var11 < 10; ++var11) {
						var23.anIntArray1745[var11] -= var7;
						var23.anIntArray1746[var11] -= var8;
					}

					var23.anInt1695 -= var7 * 128;
					var23.anInt1694 -= var8 * 128;
				}
			}

			Class12.anInt73 = var2;
			Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.method933(var3, var4, false);
			byte var22 = 0;
			byte var12 = 104;
			byte var24 = 1;
			if (var7 < 0) {
				var22 = 103;
				var12 = -1;
				var24 = -1;
			}

			byte var13 = 0;
			byte var14 = 104;
			byte var15 = 1;
			if (var8 < 0) {
				var13 = 103;
				var14 = -1;
				var15 = -1;
			}

			for (int var16 = var22; var12 != var16; var16 += var24)
				for (int var17 = var13; var14 != var17; var17 += var15) {
					final int var18 = var7 + var16;
					final int var19 = var8 + var17;

					for (int var20 = 0; var20 < 4; ++var20)
						if ((var18 >= 0) && (var19 >= 0) && (var18 < 104) && (var19 < 104))
							client.aClass59ArrayArrayArray1952[var20][var16][var17] = client.aClass59ArrayArrayArray1952[var20][var18][var19];
						else
							client.aClass59ArrayArrayArray1952[var20][var16][var17] = null;
				}

			for (Class104_Sub3 var21 = (Class104_Sub3) client.aClass59_1922
					.method251(); var21 != null; var21 = (Class104_Sub3) client.aClass59_1922.method252()) {
				var21.anInt871 -= var7;
				var21.anInt870 -= var8;
				if ((var21.anInt871 < 0) || (var21.anInt870 < 0) || (var21.anInt871 >= 104) || (var21.anInt870 >= 104))
					var21.method470();
			}

			if (client.anInt2018 != 0) {
				client.anInt2018 -= var7;
				client.anInt1880 -= var8;
			}

			client.anInt2028 = 0;
			client.aBool2034 = false;
			client.anInt2013 = -1;
			client.aClass59_1869.method247();
			client.aClass59_1923.method247();
		}
	}
}
