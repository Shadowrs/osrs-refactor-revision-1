public abstract class Class1 {
	public static int anInt1;
	static Class61_Sub1 aClass61_Sub1_2;

	abstract int method12(int var1, int var2, byte var3);

	abstract void method13(int var1);

	static final void method14(final byte[] var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7, final Class67[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9)
			for (var10 = 0; var10 < 8; ++var10)
				if (((var9 + var2) > 0) && ((var9 + var2) < 103) && ((var10 + var3) > 0) && ((var10 + var3) < 103))
					var8[var1].clipmasks[var9 + var2][var10 + var3] &= -16777217;

		final RSBuf var11 = new RSBuf(var0);

		for (var10 = 0; var10 < 4; ++var10)
			for (int var12 = 0; var12 < 64; ++var12)
				for (int var13 = 0; var13 < 64; ++var13)
					if ((var10 == var4) && (var12 >= var5) && (var12 < (var5 + 8)) && (var13 >= var6)
							&& (var13 < (8 + var6))) {
						final int var17 = var12 & 7;
						final int var18 = var13 & 7;
						final int var19 = var7 & 3;
						int var20;
						if (var19 == 0)
							var20 = var17;
						else if (var19 == 1)
							var20 = var18;
						else if (var19 == 2)
							var20 = 7 - var17;
						else
							var20 = 7 - var18;

						final int var23 = var20 + var2;
						final int var25 = var12 & 7;
						final int var26 = var13 & 7;
						final int var27 = var7 & 3;
						int var28;
						if (var27 == 0)
							var28 = var26;
						else if (var27 == 1)
							var28 = 7 - var25;
						else if (var27 == 2)
							var28 = 7 - var26;
						else
							var28 = var25;

						Class106.method474(var11, var1, var23, var3 + var28, 0, 0, var7);
					} else
						Class106.method474(var11, 0, -1, -1, 0, 0, 0);

	}

	static final int method15(final int var0, int var1, final int var2) {
		if (var2 > 179)
			var1 /= 2;

		if (var2 > 192)
			var1 /= 2;

		if (var2 > 217)
			var1 /= 2;

		if (var2 > 243)
			var1 /= 2;

		final int var3 = (var2 / 2) + ((var0 / 4) << 10) + ((var1 / 32) << 7);
		return var3;
	}

	static final void method16(final byte[] var0, final int var1, final int var2, final int var3, final int var4,
			final Class67[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6)
			for (var7 = 0; var7 < 64; ++var7)
				for (var8 = 0; var8 < 64; ++var8)
					if (((var1 + var7) > 0) && ((var7 + var1) < 103) && ((var8 + var2) > 0) && ((var8 + var2) < 103))
						var5[var6].clipmasks[var1 + var7][var2 + var8] &= -16777217;

		final RSBuf var9 = new RSBuf(var0);

		for (var7 = 0; var7 < 4; ++var7)
			for (var8 = 0; var8 < 64; ++var8)
				for (int var10 = 0; var10 < 64; ++var10)
					Class106.method474(var9, var7, var8 + var1, var2 + var10, var3, var4, 0);

	}

	static final void writePkt185() {
		client.secureBuf.putOpcode(185);
		client.secureBuf.writeByte(0);
	}
}
