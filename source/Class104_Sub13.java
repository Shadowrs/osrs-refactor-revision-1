public class Class104_Sub13 extends Class104 {
	public JagFS2 aClass16_1095;
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
					Class10.setstage(40);
					Class57.aClass13_467 = Class20.stream;
					Class20.stream = null;
				}

			if (var0.equalsIgnoreCase("::fpson"))
				client.aBool1860 = true;

			if (var0.equalsIgnoreCase("::fpsoff"))
				client.aBool1860 = false;

			if (var0.equalsIgnoreCase("::noclip"))
				for (int var1 = 0; var1 < 4; ++var1)
					for (int var2 = 1; var2 < 103; ++var2)
						for (int var3 = 1; var3 < 103; ++var3)
							client.region[var1].clipmasks[var2][var3] = 0;

			if (var0.equalsIgnoreCase("::errortest") && (client.anInt1792 == 2))
				throw new RuntimeException();
		}

		client.secureBuf.putOpcode(30);
		client.secureBuf.writeByte(var0.length() - 1);
		client.secureBuf.writeCompactedString(var0.substring(2));
	}

	static final boolean pathfind(final int myx, final int myy, final int somex, final int somey, final boolean var4,
			final int var5, final int var6, final int var7, final int var8, final int var9, final int var10) {
		int var11;
		int var12;
		for (var11 = 0; var11 < 104; ++var11)
			for (var12 = 0; var12 < 104; ++var12) {
				client.anIntArrayArray1907[var11][var12] = 0;
				client.clips[var11][var12] = 99999999;
			}

		var11 = myx;
		var12 = myy;
		client.anIntArrayArray1907[myx][myy] = 99;
		client.clips[myx][myy] = 0;
		final byte offset = 0;
		int var14 = 0;
		client.stepx[offset] = myx;
		int stepid = offset + 1;
		client.stepy[offset] = myy;
		boolean var15 = false;
		int stepSize = client.stepx.length;
		final int[][] masks = client.region[Class12.myplayerHeight].clipmasks;

		int var18;
		while (var14 != stepid) {
			var11 = client.stepx[var14];
			var12 = client.stepy[var14];
			var14 = (1 + var14) % stepSize;
			if ((somex == var11) && (var12 == somey)) {
				var15 = true;
				break;
			}

			if (var5 != 0) {
				if (((var5 < 5) || (var5 == 10)) && client.region[Class12.myplayerHeight].method305(var11, var12,
						somex, somey, var5 - 1, var6)) {
					var15 = true;
					break;
				}

				if ((var5 < 10) && client.region[Class12.myplayerHeight].method311(var11, var12, somex, somey,
						var5 - 1, var6)) {
					var15 = true;
					break;
				}
			}

			if ((var7 != 0) && (var8 != 0) && client.region[Class12.myplayerHeight].method312(var11, var12, somex,
					somey, var7, var8, var9)) {
				var15 = true;
				break;
			}

			var18 = client.clips[var11][var12] + 1;
			if ((var11 > 0) && (client.anIntArrayArray1907[var11 - 1][var12] == 0)
					&& ((masks[var11 - 1][var12] & 19661064) == 0)) {
				client.stepx[stepid] = var11 - 1;
				client.stepy[stepid] = var12;
				stepid = (stepid + 1) % stepSize;
				client.anIntArrayArray1907[var11 - 1][var12] = 2;
				client.clips[var11 - 1][var12] = var18;
			}

			if ((var11 < 103) && (client.anIntArrayArray1907[var11 + 1][var12] == 0)
					&& ((masks[1 + var11][var12] & 19661184) == 0)) {
				client.stepx[stepid] = var11 + 1;
				client.stepy[stepid] = var12;
				stepid = (stepid + 1) % stepSize;
				client.anIntArrayArray1907[1 + var11][var12] = 8;
				client.clips[1 + var11][var12] = var18;
			}

			if ((var12 > 0) && (client.anIntArrayArray1907[var11][var12 - 1] == 0)
					&& ((masks[var11][var12 - 1] & 19661058) == 0)) {
				client.stepx[stepid] = var11;
				client.stepy[stepid] = var12 - 1;
				stepid = (stepid + 1) % stepSize;
				client.anIntArrayArray1907[var11][var12 - 1] = 1;
				client.clips[var11][var12 - 1] = var18;
			}

			if ((var12 < 103) && (client.anIntArrayArray1907[var11][1 + var12] == 0)
					&& ((masks[var11][var12 + 1] & 19661088) == 0)) {
				client.stepx[stepid] = var11;
				client.stepy[stepid] = var12 + 1;
				stepid = (stepid + 1) % stepSize;
				client.anIntArrayArray1907[var11][var12 + 1] = 4;
				client.clips[var11][1 + var12] = var18;
			}

			if ((var11 > 0) && (var12 > 0) && (client.anIntArrayArray1907[var11 - 1][var12 - 1] == 0)
					&& ((masks[var11 - 1][var12 - 1] & 19661070) == 0) && ((masks[var11 - 1][var12] & 19661064) == 0)
					&& ((masks[var11][var12 - 1] & 19661058) == 0)) {
				client.stepx[stepid] = var11 - 1;
				client.stepy[stepid] = var12 - 1;
				stepid = (1 + stepid) % stepSize;
				client.anIntArrayArray1907[var11 - 1][var12 - 1] = 3;
				client.clips[var11 - 1][var12 - 1] = var18;
			}

			if ((var11 < 103) && (var12 > 0) && (client.anIntArrayArray1907[var11 + 1][var12 - 1] == 0)
					&& ((masks[1 + var11][var12 - 1] & 19661187) == 0) && ((masks[var11 + 1][var12] & 19661184) == 0)
					&& ((masks[var11][var12 - 1] & 19661058) == 0)) {
				client.stepx[stepid] = 1 + var11;
				client.stepy[stepid] = var12 - 1;
				stepid = (stepid + 1) % stepSize;
				client.anIntArrayArray1907[1 + var11][var12 - 1] = 9;
				client.clips[1 + var11][var12 - 1] = var18;
			}

			if ((var11 > 0) && (var12 < 103) && (client.anIntArrayArray1907[var11 - 1][1 + var12] == 0)
					&& ((masks[var11 - 1][1 + var12] & 19661112) == 0) && ((masks[var11 - 1][var12] & 19661064) == 0)
					&& ((masks[var11][1 + var12] & 19661088) == 0)) {
				client.stepx[stepid] = var11 - 1;
				client.stepy[stepid] = var12 + 1;
				stepid = (1 + stepid) % stepSize;
				client.anIntArrayArray1907[var11 - 1][var12 + 1] = 6;
				client.clips[var11 - 1][var12 + 1] = var18;
			}

			if ((var11 < 103) && (var12 < 103) && (client.anIntArrayArray1907[var11 + 1][var12 + 1] == 0)
					&& ((masks[var11 + 1][var12 + 1] & 19661280) == 0) && ((masks[1 + var11][var12] & 19661184) == 0)
					&& ((masks[var11][var12 + 1] & 19661088) == 0)) {
				client.stepx[stepid] = var11 + 1;
				client.stepy[stepid] = var12 + 1;
				stepid = (stepid + 1) % stepSize;
				client.anIntArrayArray1907[var11 + 1][1 + var12] = 12;
				client.clips[var11 + 1][var12 + 1] = var18;
			}
		}

		client.anInt1850 = 0;
		int var19;
		int y;
		int var22;
		if (!var15) {
			if (!var4)
				return false;

			var18 = 1000;
			var19 = 100;
			final byte var20 = 10;

			for (y = somex - var20; y <= (var20 + somex); ++y)
				for (var22 = somey - var20; var22 <= (somey + var20); ++var22)
					if ((y >= 0) && (var22 >= 0) && (y < 104) && (var22 < 104)
							&& (client.clips[y][var22] < 100)) {
						int var23 = 0;
						if (y < somex)
							var23 = somex - y;
						else if (y > ((var7 + somex) - 1))
							var23 = y - ((var7 + somex) - 1);

						int var24 = 0;
						if (var22 < somey)
							var24 = somey - var22;
						else if (var22 > ((var8 + somey) - 1))
							var24 = var22 - ((somey + var8) - 1);

						final int var25 = (var23 * var23) + (var24 * var24);
						if ((var25 < var18)
								|| ((var18 == var25) && (client.clips[y][var22] < var19))) {
							var18 = var25;
							var19 = client.clips[y][var22];
							var11 = y;
							var12 = var22;
						}
					}

			if (var18 == 1000)
				return false;

			if ((myx == var11) && (var12 == myy))
				return false;

			client.anInt1850 = 1;
		}

		final byte var27 = 0;
		client.stepx[var27] = var11;
		var14 = var27 + 1;
		client.stepy[var27] = var12;

		for (var18 = var19 = client.anIntArrayArray1907[var11][var12]; (var11 != myx)
				|| (myy != var12); var18 = client.anIntArrayArray1907[var11][var12]) {
			if (var18 != var19) {
				var19 = var18;
				client.stepx[var14] = var11;
				client.stepy[var14++] = var12;
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
			stepSize = var14;
			if (var14 > 25)
				stepSize = 25;

			--var14;
			final int x = client.stepx[var14];
			y = client.stepy[var14];
			if (var10 == 0) { // gameworld
				client.secureBuf.putOpcode(176);
				client.secureBuf.writeByte(3 + stepSize + stepSize);
			}

			if (var10 == 1) { // minimap
				client.secureBuf.putOpcode(60);
				client.secureBuf.writeByte(14 + 3 + stepSize + stepSize);
			}

			if (var10 == 2) { // some other walk type
				client.secureBuf.putOpcode(214);
				client.secureBuf.writeByte(3 + stepSize + stepSize);
			}

			client.firstX = client.stepx[0];
			client.firstY = client.stepy[0];

			// steps
			for (var22 = 1; var22 < stepSize; ++var22) {
				--var14;
				client.secureBuf.writeByteN(client.stepx[var14] - x);
				client.secureBuf.writeByteS(client.stepy[var14] - y);
			}

			client.secureBuf.writeLEShortA(Class20.anInt206 + y);
			client.secureBuf.writeByte(Class25.run[82] ? 1 : 0);
			client.secureBuf.writeShort(x + Class53.anInt436);
			return true;
		}
	}

	static final int method544(final int var0, final int var1, final int var2) {
		final int var3 = 256 - var2;
		return ((((var3 * (var0 & 16711935)) + ((var1 & 16711935) * var2)) & -16711936)
				+ (((var2 * (var1 & '\uff00')) + ((var0 & '\uff00') * var3)) & 16711680)) >> 8;
	}
}
