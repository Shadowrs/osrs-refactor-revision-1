public class Class104_Sub14 extends Class104 {
	byte[] aByteArray1101;
	Class58 aClass58_1100;

	Class104_Sub14(final Class104_Sub21 var1) {
		var1.anInt1172 = var1.aByteArray1174.length - 3;
		final int var2 = var1.method570();
		final int var3 = var1.method571();
		int var4 = 14 + (var2 * 10);
		var1.anInt1172 = 0;
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		int var12 = 0;

		int var13;
		int var14;
		int var15;
		for (var13 = 0; var13 < var2; ++var13) {
			var14 = -1;

			while (true) {
				var15 = var1.method570();
				if (var15 != var14)
					++var4;

				var14 = var15 & 15;
				if (var15 == 7)
					break;

				if (var15 == 23)
					++var5;
				else if (var14 == 0)
					++var7;
				else if (var14 == 1)
					++var8;
				else if (var14 == 2)
					++var6;
				else if (var14 == 3)
					++var9;
				else if (var14 == 4)
					++var10;
				else if (var14 == 5)
					++var11;
				else {
					if (var14 != 6)
						throw new RuntimeException();

					++var12;
				}
			}
		}

		var4 += 5 * var5;
		var4 += 2 * (var7 + var8 + var6 + var9 + var11);
		var4 += var10 + var12;
		var13 = var1.anInt1172;
		var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

		for (var15 = 0; var15 < var14; ++var15)
			var1.method580();

		var4 += var1.anInt1172 - var13;
		var15 = var1.anInt1172;
		int var16 = 0;
		int var17 = 0;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		int var22 = 0;
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28 = 0;

		int var29;
		for (var29 = 0; var29 < var6; ++var29) {
			var28 = (var28 + var1.method570()) & 127;
			if ((var28 != 0) && (var28 != 32)) {
				if (var28 == 1)
					++var16;
				else if (var28 == 33)
					++var17;
				else if (var28 == 7)
					++var18;
				else if (var28 == 39)
					++var19;
				else if (var28 == 10)
					++var20;
				else if (var28 == 42)
					++var21;
				else if (var28 == 99)
					++var22;
				else if (var28 == 98)
					++var23;
				else if (var28 == 101)
					++var24;
				else if (var28 == 100)
					++var25;
				else if ((var28 != 64) && (var28 != 65) && (var28 != 120) && (var28 != 121) && (var28 != 123))
					++var27;
				else
					++var26;
			} else
				++var12;
		}

		var29 = 0;
		int var30 = var1.anInt1172;
		var1.anInt1172 += var26;
		int var31 = var1.anInt1172;
		var1.anInt1172 += var11;
		int var32 = var1.anInt1172;
		var1.anInt1172 += var10;
		int var33 = var1.anInt1172;
		var1.anInt1172 += var9;
		int var34 = var1.anInt1172;
		var1.anInt1172 += var16;
		int var35 = var1.anInt1172;
		var1.anInt1172 += var18;
		int var36 = var1.anInt1172;
		var1.anInt1172 += var20;
		int var37 = var1.anInt1172;
		var1.anInt1172 += var7 + var8 + var11;
		int var38 = var1.anInt1172;
		var1.anInt1172 += var7;
		int var39 = var1.anInt1172;
		var1.anInt1172 += var27;
		int var40 = var1.anInt1172;
		var1.anInt1172 += var8;
		int var41 = var1.anInt1172;
		var1.anInt1172 += var17;
		int var42 = var1.anInt1172;
		var1.anInt1172 += var19;
		int var43 = var1.anInt1172;
		var1.anInt1172 += var21;
		int var44 = var1.anInt1172;
		var1.anInt1172 += var12;
		int var45 = var1.anInt1172;
		var1.anInt1172 += var9;
		int var46 = var1.anInt1172;
		var1.anInt1172 += var22;
		int var47 = var1.anInt1172;
		var1.anInt1172 += var23;
		int var48 = var1.anInt1172;
		var1.anInt1172 += var24;
		int var49 = var1.anInt1172;
		var1.anInt1172 += var25;
		int var50 = var1.anInt1172;
		var1.anInt1172 += var5 * 3;
		aByteArray1101 = new byte[var4];
		final Class104_Sub21 var51 = new Class104_Sub21(aByteArray1101);
		var51.method619(1297377380);
		var51.method619(6);
		var51.method603(var2 > 1 ? 1 : 0);
		var51.method603(var2);
		var51.method603(var3);
		var1.anInt1172 = var13;
		int var52 = 0;
		int var53 = 0;
		int var54 = 0;
		int var55 = 0;
		int var56 = 0;
		int var57 = 0;
		int var58 = 0;
		final int[] var59 = new int[128];
		var28 = 0;

		label220: for (int var60 = 0; var60 < var2; ++var60) {
			var51.method619(1297379947);
			var51.anInt1172 += 4;
			final int var61 = var51.anInt1172;
			int var62 = -1;

			while (true)
				while (true) {
					final int var63 = var1.method580();
					var51.method569(var63);
					final int var64 = var1.aByteArray1174[var29++] & 255;
					final boolean var65 = var64 != var62;
					var62 = var64 & 15;
					if (var64 == 7) {
						if (var65)
							var51.method561(255);

						var51.method561(47);
						var51.method561(0);
						var51.method609(var51.anInt1172 - var61);
						continue label220;
					}

					if (var64 == 23) {
						if (var65)
							var51.method561(255);

						var51.method561(81);
						var51.method561(3);
						var51.method561(var1.aByteArray1174[var50++]);
						var51.method561(var1.aByteArray1174[var50++]);
						var51.method561(var1.aByteArray1174[var50++]);
					} else {
						var52 ^= var64 >> 4;
						if (var62 == 0) {
							if (var65)
								var51.method561(144 + var52);

							var53 += var1.aByteArray1174[var37++];
							var54 += var1.aByteArray1174[var38++];
							var51.method561(var53 & 127);
							var51.method561(var54 & 127);
						} else if (var62 == 1) {
							if (var65)
								var51.method561(128 + var52);

							var53 += var1.aByteArray1174[var37++];
							var55 += var1.aByteArray1174[var40++];
							var51.method561(var53 & 127);
							var51.method561(var55 & 127);
						} else if (var62 == 2) {
							if (var65)
								var51.method561(176 + var52);

							var28 = (var28 + var1.aByteArray1174[var15++]) & 127;
							var51.method561(var28);
							byte var66;
							if ((var28 != 0) && (var28 != 32)) {
								if (var28 == 1)
									var66 = var1.aByteArray1174[var34++];
								else if (var28 == 33)
									var66 = var1.aByteArray1174[var41++];
								else if (var28 == 7)
									var66 = var1.aByteArray1174[var35++];
								else if (var28 == 39)
									var66 = var1.aByteArray1174[var42++];
								else if (var28 == 10)
									var66 = var1.aByteArray1174[var36++];
								else if (var28 == 42)
									var66 = var1.aByteArray1174[var43++];
								else if (var28 == 99)
									var66 = var1.aByteArray1174[var46++];
								else if (var28 == 98)
									var66 = var1.aByteArray1174[var47++];
								else if (var28 == 101)
									var66 = var1.aByteArray1174[var48++];
								else if (var28 == 100)
									var66 = var1.aByteArray1174[var49++];
								else if ((var28 != 64) && (var28 != 65) && (var28 != 120) && (var28 != 121)
										&& (var28 != 123))
									var66 = var1.aByteArray1174[var39++];
								else
									var66 = var1.aByteArray1174[var30++];
							} else
								var66 = var1.aByteArray1174[var44++];

							final int var67 = var66 + var59[var28];
							var59[var28] = var67;
							var51.method561(var67 & 127);
						} else if (var62 == 3) {
							if (var65)
								var51.method561(224 + var52);

							var56 += var1.aByteArray1174[var45++];
							var56 += var1.aByteArray1174[var33++] << 7;
							var51.method561(var56 & 127);
							var51.method561((var56 >> 7) & 127);
						} else if (var62 == 4) {
							if (var65)
								var51.method561(208 + var52);

							var57 += var1.aByteArray1174[var32++];
							var51.method561(var57 & 127);
						} else if (var62 == 5) {
							if (var65)
								var51.method561(160 + var52);

							var53 += var1.aByteArray1174[var37++];
							var58 += var1.aByteArray1174[var31++];
							var51.method561(var53 & 127);
							var51.method561(var58 & 127);
						} else {
							if (var62 != 6)
								throw new RuntimeException();

							if (var65)
								var51.method561(192 + var52);

							var51.method561(var1.aByteArray1174[var44++]);
						}
					}
				}
		}

	}

	void method545() {
		if (aClass58_1100 == null) {
			aClass58_1100 = new Class58(16);
			final int[] var1 = new int[16];
			final int[] var2 = new int[16];
			var2[9] = 128;
			var1[9] = 128;
			final Class83 var4 = new Class83(aByteArray1101);
			final int var5 = var4.method362();

			int var6;
			for (var6 = 0; var6 < var5; ++var6) {
				var4.method363(var6);
				var4.method366(var6);
				var4.method364(var6);
			}

			label53: do
				while (true) {
					var6 = var4.method374();
					final int var7 = var4.anIntArray648[var6];

					while (var4.anIntArray648[var6] == var7) {
						var4.method363(var6);
						final int var8 = var4.method372(var6);
						if (var8 == 1) {
							var4.method365();
							var4.method364(var6);
							continue label53;
						}

						final int var9 = var8 & 240;
						int var10;
						int var11;
						int var12;
						if (var9 == 176) {
							var10 = var8 & 15;
							var11 = (var8 >> 8) & 127;
							var12 = (var8 >> 16) & 127;
							if (var11 == 0)
								var1[var10] = (var1[var10] & -2080769) + (var12 << 14);

							if (var11 == 32)
								var1[var10] = (var1[var10] & -16257) + (var12 << 7);
						}

						if (var9 == 192) {
							var10 = var8 & 15;
							var11 = (var8 >> 8) & 127;
							var2[var10] = var1[var10] + var11;
						}

						if (var9 == 144) {
							var10 = var8 & 15;
							var11 = (var8 >> 8) & 127;
							var12 = (var8 >> 16) & 127;
							if (var12 > 0) {
								final int var13 = var2[var10];
								Class104_Sub22 var14 = (Class104_Sub22) aClass58_1100.method241(var13);
								if (var14 == null) {
									var14 = new Class104_Sub22(new byte[128]);
									aClass58_1100.method242(var14, var13);
								}

								var14.aByteArray1176[var11] = 1;
							}
						}

						var4.method366(var6);
						var4.method364(var6);
					}
				}
			while (!var4.method371());

		}
	}

	void method546() {
		aClass58_1100 = null;
	}

	static Class104_Sub14 method547(final Class61 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method259(var1, var2);
		return var3 == null ? null : new Class104_Sub14(new Class104_Sub21(var3));
	}
}