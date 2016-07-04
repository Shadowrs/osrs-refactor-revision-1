public final class Class9 {
	boolean aBool53 = true;
	int anInt56;
	int anInt52;
	int anInt51;
	int anInt54;
	int anInt55;
	int anInt57;

	Class9(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final boolean var7) {
		anInt56 = var1;
		anInt52 = var2;
		anInt51 = var3;
		anInt54 = var4;
		anInt55 = var5;
		anInt57 = var6;
		aBool53 = var7;
	}

	static final void otherPackets() {
		int var0;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		if (client.pktOpc == 245) {
			var0 = client.gamecon.readLEShort();
			byte var1 = client.gamecon.method589();
			var2 = client.gamecon.readByteN();
			var3 = var2 >> 2;
			var4 = var2 & 3;
			var5 = client.anIntArray1849[var3];
			var6 = client.gamecon.method594();
			var7 = client.gamecon.readShort();
			var8 = client.gamecon.readLEShort();
			var9 = client.gamecon.method588();
			var10 = ((var9 >> 4) & 7) + Class19.anInt195;
			var11 = Class93.anInt742 + (var9 & 7);
			byte var12 = client.gamecon.method589();
			byte var13 = client.gamecon.method565();
			byte var14 = client.gamecon.method565();
			Class104_Sub18_Sub16_Sub7_Sub1 var15;
			if (var8 == client.anInt1874)
				var15 = Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644;
			else
				var15 = client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var8];

			if (null != var15) {
				final Class104_Sub18_Sub6 var16 = Class104_Sub18_Sub12.method782(var6);
				int var17;
				int var18;
				if ((var4 != 1) && (var4 != 3)) {
					var17 = var16.anInt1365;
					var18 = var16.anInt1339;
				} else {
					var17 = var16.anInt1339;
					var18 = var16.anInt1365;
				}

				final int var19 = (var17 >> 1) + var10;
				final int var20 = ((var17 + 1) >> 1) + var10;
				final int var21 = var11 + (var18 >> 1);
				final int var22 = var11 + ((var18 + 1) >> 1);
				final int[][] var23 = Class76.anIntArrayArrayArray611[Class12.anInt73];
				final int var24 = (var23[var20][var22] + var23[var19][var21] + var23[var20][var21]
						+ var23[var19][var22]) >> 2;
				final int var25 = (var10 << 7) + (var17 << 6);
				final int var26 = (var11 << 7) + (var18 << 6);
				final Class104_Sub18_Sub16_Sub4 var27 = var16.method750(var3, var4, var23, var25, var24, var26);
				if (null != var27) {
					Class16.method67(Class12.anInt73, var10, var11, var5, -1, 0, 0, 1 + var7, var0 + 1);
					var15.anInt1776 = var7 + client.anInt1799;
					var15.anInt1777 = client.anInt1799 + var0;
					var15.aClass104_Sub18_Sub16_Sub4_1785 = var27;
					var15.anInt1778 = (var17 * 64) + (var10 * 128);
					var15.anInt1783 = (128 * var11) + (var18 * 64);
					var15.anInt1781 = var24;
					byte var28;
					if (var14 > var12) {
						var28 = var14;
						var14 = var12;
						var12 = var28;
					}

					if (var13 > var1) {
						var28 = var13;
						var13 = var1;
						var1 = var28;
					}

					var15.anInt1782 = var14 + var10;
					var15.anInt1769 = var12 + var10;
					var15.anInt1786 = var11 + var13;
					var15.anInt1772 = var11 + var1;
				}
			}
		}

		Class104_Sub18_Sub16_Sub6 var30;
		int var35;
		if (client.pktOpc == 207) {
			var0 = client.gamecon.readShortN();
			var35 = client.gamecon.readUByte();
			var2 = Class19.anInt195 + ((var35 >> 4) & 7);
			var3 = (var35 & 7) + Class93.anInt742;
			if ((var2 >= 0) && (var3 >= 0) && (var2 < 104) && (var3 < 104)) {
				final Class59 var29 = client.aClass59ArrayArrayArray1952[Class12.anInt73][var2][var3];
				if (null != var29) {
					for (var30 = (Class104_Sub18_Sub16_Sub6) var29
							.method251(); null != var30; var30 = (Class104_Sub18_Sub16_Sub6) var29.method252())
						if ((var0 & 32767) == var30.anInt1691) {
							var30.method470();
							break;
						}

					if (var29.method251() == null)
						client.aClass59ArrayArrayArray1952[Class12.anInt73][var2][var3] = null;

					Class102_Sub1.method496(var2, var3);
				}
			}

		} else {
			if (client.pktOpc == 205) {
				var0 = client.gamecon.readUByte();
				var35 = ((var0 >> 4) & 7) + Class19.anInt195;
				var2 = (var0 & 7) + Class93.anInt742;
				var3 = client.gamecon.readLEShort();
				var4 = client.gamecon.readUByte();
				var5 = (var4 >> 4) & 15;
				var6 = var4 & 7;
				var7 = client.gamecon.readUByte();
				if ((var35 >= 0) && (var2 >= 0) && (var35 < 104) && (var2 < 104)) {
					var8 = 1 + var5;
					if ((Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1745[0] >= (var35 - var8))
							&& (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1745[0] <= (var8 + var35))
							&& (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1746[0] >= (var2 - var8))
							&& (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1746[0] <= (var2 + var8))
							&& (client.anInt2026 != 0) && (var6 > 0) && (client.anInt2028 < 50)) {
						client.anIntArray2029[client.anInt2028] = var3;
						client.anIntArray1875[client.anInt2028] = var6;
						client.anIntArray2031[client.anInt2028] = var7;
						client.aClass82Array2033[client.anInt2028] = null;
						client.anIntArray2032[client.anInt2028] = (var2 << 8) + (var35 << 16) + var5;
						++client.anInt2028;
					}
				}
			}

			if (client.pktOpc == 6) {
				var0 = client.gamecon.method594();
				var35 = client.gamecon.readByteN();
				var2 = ((var35 >> 4) & 7) + Class19.anInt195;
				var3 = Class93.anInt742 + (var35 & 7);
				var4 = client.gamecon.method588();
				var5 = var4 >> 2;
				var6 = var4 & 3;
				var7 = client.anIntArray1849[var5];
				if ((var2 >= 0) && (var3 >= 0) && (var2 < 103) && (var3 < 103)) {
					if (var7 == 0) {
						final Class20 var31 = Class81.aClass17_643.method117(Class12.anInt73, var2, var3);
						if (var31 != null) {
							var9 = (var31.anInt200 >> 14) & 32767;
							if (var5 == 2) {
								var31.aClass104_Sub18_Sub16_199 = new Class104_Sub18_Sub16_Sub1(var9, 2, var6 + 4,
										Class12.anInt73, var2, var3, var0, false, var31.aClass104_Sub18_Sub16_199);
								var31.aClass104_Sub18_Sub16_202 = new Class104_Sub18_Sub16_Sub1(var9, 2, (var6 + 1) & 3,
										Class12.anInt73, var2, var3, var0, false, var31.aClass104_Sub18_Sub16_202);
							} else
								var31.aClass104_Sub18_Sub16_199 = new Class104_Sub18_Sub16_Sub1(var9, var5, var6,
										Class12.anInt73, var2, var3, var0, false, var31.aClass104_Sub18_Sub16_199);
						}
					}

					if (var7 == 1) {
						final Class33 var37 = Class81.aClass17_643.method96(Class12.anInt73, var2, var3);
						if (var37 != null) {
							var9 = (var37.anInt340 >> 14) & 32767;
							if ((var5 != 4) && (var5 != 5)) {
								if (var5 == 6)
									var37.aClass104_Sub18_Sub16_338 = new Class104_Sub18_Sub16_Sub1(var9, 4, 4 + var6,
											Class12.anInt73, var2, var3, var0, false, var37.aClass104_Sub18_Sub16_338);
								else if (var5 == 7)
									var37.aClass104_Sub18_Sub16_338 = new Class104_Sub18_Sub16_Sub1(var9, 4,
											((2 + var6) & 3) + 4, Class12.anInt73, var2, var3, var0, false,
											var37.aClass104_Sub18_Sub16_338);
								else if (var5 == 8) {
									var37.aClass104_Sub18_Sub16_338 = new Class104_Sub18_Sub16_Sub1(var9, 4, var6 + 4,
											Class12.anInt73, var2, var3, var0, false, var37.aClass104_Sub18_Sub16_338);
									var37.aClass104_Sub18_Sub16_339 = new Class104_Sub18_Sub16_Sub1(var9, 4,
											((var6 + 2) & 3) + 4, Class12.anInt73, var2, var3, var0, false,
											var37.aClass104_Sub18_Sub16_339);
								}
							} else
								var37.aClass104_Sub18_Sub16_338 = new Class104_Sub18_Sub16_Sub1(var9, 4, var6,
										Class12.anInt73, var2, var3, var0, false, var37.aClass104_Sub18_Sub16_338);
						}
					}

					if (var7 == 2) {
						final Class21 var38 = Class81.aClass17_643.method113(Class12.anInt73, var2, var3);
						if (var5 == 11)
							var5 = 10;

						if (null != var38)
							var38.aClass104_Sub18_Sub16_214 = new Class104_Sub18_Sub16_Sub1(
									(var38.anInt220 >> 14) & 32767, var5, var6, Class12.anInt73, var2, var3, var0,
									false, var38.aClass104_Sub18_Sub16_214);
					}

					if (var7 == 3) {
						final Class6 var39 = Class81.aClass17_643.method105(Class12.anInt73, var2, var3);
						if (null != var39)
							var39.aClass104_Sub18_Sub16_33 = new Class104_Sub18_Sub16_Sub1(
									(var39.anInt34 >> 14) & 32767, 22, var6, Class12.anInt73, var2, var3, var0, false,
									var39.aClass104_Sub18_Sub16_33);
					}
				}

			} else if (client.pktOpc == 173) {
				var0 = client.gamecon.method576();
				var35 = Class19.anInt195 + ((var0 >> 4) & 7);
				var2 = (var0 & 7) + Class93.anInt742;
				var3 = client.gamecon.method594();
				var4 = client.gamecon.readShortN();
				if ((var35 >= 0) && (var2 >= 0) && (var35 < 104) && (var2 < 104)) {
					var30 = new Class104_Sub18_Sub16_Sub6();
					var30.anInt1691 = var4;
					var30.anInt1692 = var3;
					if (client.aClass59ArrayArrayArray1952[Class12.anInt73][var35][var2] == null)
						client.aClass59ArrayArrayArray1952[Class12.anInt73][var35][var2] = new Class59();

					client.aClass59ArrayArrayArray1952[Class12.anInt73][var35][var2].method248(var30);
					Class102_Sub1.method496(var35, var2);
				}

			} else if (client.pktOpc != 106) {
				if (client.pktOpc == 154) {
					var0 = client.gamecon.readShortN();
					var35 = client.gamecon.method576();
					var2 = var35 >> 2;
					var3 = var35 & 3;
					var4 = client.anIntArray1849[var2];
					var5 = client.gamecon.readByteN();
					var6 = ((var5 >> 4) & 7) + Class19.anInt195;
					var7 = (var5 & 7) + Class93.anInt742;
					if ((var6 >= 0) && (var7 >= 0) && (var6 < 104) && (var7 < 104))
						Class16.method67(Class12.anInt73, var6, var7, var4, var0, var2, var3, 0, -1);

				} else if (client.pktOpc == 20) {
					var0 = client.gamecon.readUByte();
					var35 = Class19.anInt195 + ((var0 >> 4) & 7);
					var2 = Class93.anInt742 + (var0 & 7);
					var3 = client.gamecon.readLEShort();
					var4 = client.gamecon.readUByte();
					var5 = client.gamecon.readLEShort();
					if ((var35 >= 0) && (var2 >= 0) && (var35 < 104) && (var2 < 104)) {
						var35 = (128 * var35) + 64;
						var2 = (128 * var2) + 64;
						final Class104_Sub18_Sub16_Sub3 var41 = new Class104_Sub18_Sub16_Sub3(var3, Class12.anInt73,
								var35, var2, Class47.method211(var35, var2, Class12.anInt73) - var4, var5,
								client.anInt1799);
						client.aClass59_1869.method248(var41);
					}

				} else if (client.pktOpc == 32) {
					var0 = client.gamecon.readUByte();
					var35 = ((var0 >> 4) & 7) + Class19.anInt195;
					var2 = (var0 & 7) + Class93.anInt742;
					var3 = var35 + client.gamecon.method565();
					var4 = var2 + client.gamecon.method565();
					var5 = client.gamecon.method572();
					var6 = client.gamecon.readLEShort();
					var7 = client.gamecon.readUByte() * 4;
					var8 = client.gamecon.readUByte() * 4;
					var9 = client.gamecon.readLEShort();
					var10 = client.gamecon.readLEShort();
					var11 = client.gamecon.readUByte();
					final int var36 = client.gamecon.readUByte();
					if ((var35 >= 0) && (var2 >= 0) && (var35 < 104) && (var2 < 104) && (var3 >= 0) && (var4 >= 0)
							&& (var3 < 104) && (var4 < 104) && (var6 != '\uffff')) {
						var35 = 64 + (var35 * 128);
						var2 = 64 + (var2 * 128);
						var3 = (128 * var3) + 64;
						var4 = 64 + (var4 * 128);
						final Class104_Sub18_Sub16_Sub2 var34 = new Class104_Sub18_Sub16_Sub2(var6, Class12.anInt73,
								var35, var2, Class47.method211(var35, var2, Class12.anInt73) - var7,
								client.anInt1799 + var9, var10 + client.anInt1799, var11, var36, var5, var8);
						var34.method808(var3, var4, Class47.method211(var3, var4, Class12.anInt73) - var8,
								client.anInt1799 + var9);
						client.aClass59_1923.method248(var34);
					}

				} else if (client.pktOpc == 215) {
					var0 = client.gamecon.readByteN();
					var35 = ((var0 >> 4) & 7) + Class19.anInt195;
					var2 = Class93.anInt742 + (var0 & 7);
					var3 = client.gamecon.readLEShort();
					var4 = client.gamecon.method594();
					var5 = client.gamecon.readLEShort();
					if ((var35 >= 0) && (var2 >= 0) && (var35 < 104) && (var2 < 104) && (var3 != client.anInt1874)) {
						final Class104_Sub18_Sub16_Sub6 var40 = new Class104_Sub18_Sub16_Sub6();
						var40.anInt1691 = var5;
						var40.anInt1692 = var4;
						if (client.aClass59ArrayArrayArray1952[Class12.anInt73][var35][var2] == null)
							client.aClass59ArrayArrayArray1952[Class12.anInt73][var35][var2] = new Class59();

						client.aClass59ArrayArrayArray1952[Class12.anInt73][var35][var2].method248(var40);
						Class102_Sub1.method496(var35, var2);
					}

				} else if (client.pktOpc == 7) {
					var0 = client.gamecon.method588();
					var35 = var0 >> 2;
					var2 = var0 & 3;
					var3 = client.anIntArray1849[var35];
					var4 = client.gamecon.method576();
					var5 = ((var4 >> 4) & 7) + Class19.anInt195;
					var6 = Class93.anInt742 + (var4 & 7);
					if ((var5 >= 0) && (var6 >= 0) && (var5 < 104) && (var6 < 104))
						Class16.method67(Class12.anInt73, var5, var6, var3, -1, var35, var2, 0, -1);

				}
			} else {
				var0 = client.gamecon.readUByte();
				var35 = ((var0 >> 4) & 7) + Class19.anInt195;
				var2 = Class93.anInt742 + (var0 & 7);
				var3 = client.gamecon.readLEShort();
				var4 = client.gamecon.readLEShort();
				var5 = client.gamecon.readLEShort();
				if ((var35 >= 0) && (var2 >= 0) && (var35 < 104) && (var2 < 104)) {
					final Class59 var32 = client.aClass59ArrayArrayArray1952[Class12.anInt73][var35][var2];
					if (null != var32) {
						for (Class104_Sub18_Sub16_Sub6 var33 = (Class104_Sub18_Sub16_Sub6) var32
								.method251(); var33 != null; var33 = (Class104_Sub18_Sub16_Sub6) var32.method252())
							if (((var3 & 32767) == var33.anInt1691) && (var33.anInt1692 == var4)) {
								var33.anInt1692 = var5;
								break;
							}

						Class102_Sub1.method496(var35, var2);
					}
				}

			}
		}
	}

	static final void doWidgetOp(final int hash, final int op) {
		if (Class104_Sub7.loaded(hash))
			Class15.loadWidget(Class22.widgets[hash], op);
	}

	static final String[] method37(final String[] var0) {
		final String[] var1 = new String[5];

		for (int var2 = 0; var2 < 5; ++var2) {
			var1[var2] = var2 + ": ";
			if ((var0 != null) && (null != var0[var2]))
				var1[var2] = var1[var2] + var0[var2];
		}

		return var1;
	}

	public static void method38(final Class61 var0, final Class61 var1, final Class61 var2) {
		Class106.aClass61_829 = var0;
		Class7.aClass61_43 = var1;
		Class104_Sub18_Sub3.aClass61_1259 = var2;
	}

	static boolean method39(final Class61 var0, final int var1) {
		final byte[] var2 = var0.method277(var1);
		if (null == var2)
			return false;
		else {
			Class53.method234(var2);
			return true;
		}
	}
}
