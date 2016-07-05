public class Class29 {
	static Class104_Sub14 aClass104_Sub14_268;
	static Class61 aClass61_269;
	static Class61 aClass61_270;
	static Class104_Sub8_Sub1 aClass104_Sub8_Sub1_271;
	public static Class61 aClass61_273;
	static Class61 aClass61_274;
	public static int anInt275;
	public static int anInt276;
	static Class104_Sub18_Sub17_Sub2_Sub1 aClass104_Sub18_Sub17_Sub2_Sub1_277;
	static Class61_Sub1 aClass61_Sub1_278;
	public static int anInt272 = 0;

	public static String method140(final char var0, final int var1) {
		final char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; ++var3)
			var2[var3] = var0;

		return new String(var2);
	}

	public static Widget method141(final int var0, final int var1) {
		final Widget var2 = Class47.forHash(var0);
		return var1 == -1 ? var2
				: ((var2 != null) && (null != var2.aClass104_Sub12Array1020)
						&& (var1 < var2.aClass104_Sub12Array1020.length) ? var2.aClass104_Sub12Array1020[var1] : null);
	}

	static final void method142(final Class104_Sub18_Sub16_Sub7 var0, final int var1) {
		Class69.method322(var0.anInt1695, var0.anInt1694, var1);
	}

	static void method143(final int var0, final int var1, final int var2, final String var3) {
		final Widget var4 = method141(var1, var2);
		if (null != var4) {
			if (null != var4.anObjectArray1042) {
				final CS var5 = new CS();
				var5.ownerRSFaceHash = var4;
				var5.anInt939 = var0;
				var5.aString943 = var3;
				var5.params = var4.anObjectArray1042;
				Class46.doCS(var5);
			}

			boolean var6 = true;
			if (var4.anInt982 > 0)
				var6 = Class104_Sub20.method559(var4);

			if (var6) {
				final int var7 = Class104_Sub3.method485(var4);
				final int var8 = var0 - 1;
				final boolean var9 = ((var7 >> (var8 + 1)) & 1) != 0;
				if (var9) {
					if (var0 == 1) {
						client.secureBuf.putOpcode(63);
						client.secureBuf.writeInt(var1); // 4 bytes
						client.secureBuf.writeShort(var2); // 2 bytes
						// total 6
					}

					if (var0 == 2) {
						client.secureBuf.putOpcode(87);
						client.secureBuf.writeInt(var1);
						client.secureBuf.writeShort(var2);
					}

					if (var0 == 3) {
						client.secureBuf.putOpcode(238);
						client.secureBuf.writeInt(var1);
						client.secureBuf.writeShort(var2);
					}

					if (var0 == 4) {
						client.secureBuf.putOpcode(240);
						client.secureBuf.writeInt(var1);
						client.secureBuf.writeShort(var2);
					}

					if (var0 == 5) {
						client.secureBuf.putOpcode(153);
						client.secureBuf.writeInt(var1);
						client.secureBuf.writeShort(var2);
					}

					if (var0 == 6) {
						client.secureBuf.putOpcode(232);
						client.secureBuf.writeInt(var1);
						client.secureBuf.writeShort(var2);
					}

					if (var0 == 7) {
						client.secureBuf.putOpcode(168);
						client.secureBuf.writeInt(var1);
						client.secureBuf.writeShort(var2);
					}

					if (var0 == 8) {
						client.secureBuf.putOpcode(239);
						client.secureBuf.writeInt(var1);
						client.secureBuf.writeShort(var2);
					}

					if (var0 == 9) {
						client.secureBuf.putOpcode(254);
						client.secureBuf.writeInt(var1);
						client.secureBuf.writeShort(var2);
					}

					if (var0 == 10) {
						client.secureBuf.putOpcode(169);
						client.secureBuf.writeInt(var1);
						client.secureBuf.writeShort(var2);
					}

				}
			}
		}
	}
}
