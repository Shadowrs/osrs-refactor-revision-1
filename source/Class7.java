public class Class7 {
	int anInt37;
	int anInt38;
	int anInt39;
	public static String[] store;
	static int[][] anIntArrayArray41;
	static int anInt42;
	static Class61 aClass61_43;
	static int anInt44;

	static final void method33() {
		for (int var0 = 0; var0 < client.anInt1910; ++var0) {
			final int var1 = client.updates[var0];
			final Class104_Sub18_Sub16_Sub7_Sub2 var2 = client.localNpcs[var1];
			final int var3 = client.gamecon.readUByte();
			int var4;
			int var5;
			if ((var3 & 128) != 0) {
				var4 = client.gamecon.readUByte();
				var5 = client.gamecon.readUByteN();
				var2.hits(var4, var5, client.currentTime);
				var2.hitTime = 300 + client.currentTime;
				var2.anInt1693 = client.gamecon.readUByteA();
				var2.anInt1715 = client.gamecon.readUByteA();
			}

			if ((var3 & 4) != 0) {
				var2.anInt1716 = client.gamecon.readLEShort();
				if (var2.anInt1716 == '\uffff')
					var2.anInt1716 = -1;
			}

			if ((var3 & 2) != 0) {
				var2.anInt1717 = client.gamecon.readLEShortA();
				var2.anInt1718 = client.gamecon.readLEShortA();
			}

			if ((var3 & 1) != 0) {
				var2.gfxId = client.gamecon.readLEShort();
				var4 = client.gamecon.readLEInt();
				var2.gfxHeight = var4 >> 16;
				var2.gfxDelay = (var4 & '\uffff') + client.currentTime;
				var2.anInt1728 = 0;
				var2.anInt1729 = 0;
				if (var2.gfxDelay > client.currentTime)
					var2.anInt1728 = -1;

				if (var2.gfxId == '\uffff')
					var2.gfxId = -1;
			}

			if ((var3 & 8) != 0) {
				var4 = client.gamecon.readLEShortA();
				if (var4 == '\uffff')
					var4 = -1;

				var5 = client.gamecon.readUByteA();
				if ((var2.anInt1722 == var4) && (var4 != -1)) {
					final int var6 = Class70.forId(var4).anInt1275;
					if (var6 == 1) {
						var2.anInt1732 = 0;
						var2.anInt1724 = 0;
						var2.anInt1707 = var5;
						var2.anInt1726 = 0;
					}

					if (var6 == 2)
						var2.anInt1726 = 0;
				} else if ((var4 == -1) || (var2.anInt1722 == -1)
						|| (Class70.forId(var4).anInt1269 >= Class70.forId(var2.anInt1722).anInt1269)) {
					var2.anInt1722 = var4;
					var2.anInt1732 = 0;
					var2.anInt1724 = 0;
					var2.anInt1707 = var5;
					var2.anInt1726 = 0;
					var2.anInt1735 = var2.anInt1744;
				}
			}

			if ((var3 & 64) != 0) {
				var2.aClass104_Sub18_Sub2_1788 = Class64.method296(client.gamecon.readShort());
				var2.anInt1736 = var2.aClass104_Sub18_Sub2_1788.anInt1240;
				var2.anInt1740 = var2.aClass104_Sub18_Sub2_1788.anInt1253;
				var2.walkAnim = var2.aClass104_Sub18_Sub2_1788.anInt1236;
				var2.turn180 = var2.aClass104_Sub18_Sub2_1788.anInt1237;
				var2.turn90c = var2.aClass104_Sub18_Sub2_1788.anInt1251;
				var2.turn90cc = var2.aClass104_Sub18_Sub2_1788.anInt1239;
				var2.stand = var2.aClass104_Sub18_Sub2_1788.anInt1233;
				var2.turn = var2.aClass104_Sub18_Sub2_1788.anInt1244;
				var2.walk = var2.aClass104_Sub18_Sub2_1788.anInt1235;
			}

			if ((var3 & 32) != 0) {
				var2.forceChat = client.gamecon.readString();
				var2.anInt1713 = 100;
			}

			if ((var3 & 16) != 0) {
				var4 = client.gamecon.readUByteS();
				var5 = client.gamecon.readUByteS();
				var2.hits(var4, var5, client.currentTime);
				var2.hitTime = 300 + client.currentTime;
				var2.anInt1693 = client.gamecon.readUByteS();
				var2.anInt1715 = client.gamecon.readUByteA();
			}
		}

	}

	static final void method34(final byte[] var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7, final Class17 var8, final Class67[] var9) {
		final RSBuf var10 = new RSBuf(var0);
		int var11 = -1;

		while (true) {
			final int var12 = var10.readsmart();
			if (var12 == 0)
				return;

			var11 += var12;
			int var13 = 0;

			while (true) {
				final int var14 = var10.readsmart();
				if (var14 == 0)
					break;

				var13 += var14 - 1;
				final int var15 = var13 & 63;
				final int var16 = (var13 >> 6) & 63;
				final int var17 = var13 >> 12;
				final int var18 = var10.readUByte();
				final int var19 = var18 >> 2;
				final int var20 = var18 & 3;
				if ((var4 == var17) && (var16 >= var5) && (var16 < (8 + var5)) && (var15 >= var6)
						&& (var15 < (8 + var6))) {
					final ObjectDefinition var21 = ItemDef.forId(var11);
					final int var22 = var2
							+ client.typeFor(var16 & 7, var15 & 7, var7, var21.anInt1365, var21.anInt1339, var20);
					final int var23 = var3
							+ BZip2Context.method152(var16 & 7, var15 & 7, var7, var21.anInt1365, var21.anInt1339, var20);
					if ((var22 > 0) && (var23 > 0) && (var22 < 103) && (var23 < 103)) {
						int var24 = var1;
						if ((Class76.aByteArrayArrayArray600[1][var22][var23] & 2) == 2)
							var24 = var1 - 1;

						Class67 var25 = null;
						if (var24 >= 0)
							var25 = var9[var24];

						Class34.method163(var1, var22, var23, var11, (var7 + var20) & 3, var19, var8, var25);
					}
				}
			}
		}
	}
}
