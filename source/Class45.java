public final class Class45 {
	static BZip2Context entryInstance = new BZip2Context();

	static void method194(final int[] var0, final int[] var1, final int[] var2, final byte[] var3, final int var4,
			final int var5, final int var6) {
		int var7 = 0;

		int var8;
		for (var8 = var4; var8 <= var5; ++var8)
			for (int var9 = 0; var9 < var6; ++var9)
				if (var3[var9] == var8) {
					var2[var7] = var9;
					++var7;
				}

		for (var8 = 0; var8 < 23; ++var8)
			var1[var8] = 0;

		for (var8 = 0; var8 < var6; ++var8)
			++var1[var3[var8] + 1];

		for (var8 = 1; var8 < 23; ++var8)
			var1[var8] += var1[var8 - 1];

		for (var8 = 0; var8 < 23; ++var8)
			var0[var8] = 0;

		int var10 = 0;

		for (var8 = var4; var8 <= var5; ++var8) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}

		for (var8 = var4 + 1; var8 <= var5; ++var8)
			var1[var8] = ((var0[var8 - 1] + 1) << 1) - var1[var8];

	}

	public static int bzipFill(final byte[] decompressedData, int count, final byte[] packedData, final int var3, final int blockSize) {
		final BZip2Context var5 = entryInstance;
		synchronized (var5) {
			entryInstance.packedData = packedData;
			entryInstance.blockSize = blockSize;
			entryInstance.decompressedData = decompressedData;
			entryInstance.anInt302 = 0;
			entryInstance.leng = count;
			entryInstance.anInt308 = 0;
			entryInstance.anInt307 = 0;
			entryInstance.anInt300 = 0;
			entryInstance.anInt304 = 0;
			method197(entryInstance);
			count -= entryInstance.leng;
			entryInstance.packedData = null;
			entryInstance.decompressedData = null;
			return count;
		}
	}

	static void method196(final BZip2Context var0) {
		byte var1 = var0.aByte296;
		int var2 = var0.anInt306;
		int var3 = var0.anInt303;
		int var4 = var0.anInt312;
		final int[] var5 = BZip2Context.anIntArray316;
		int var6 = var0.anInt311;
		final byte[] var7 = var0.decompressedData;
		int var8 = var0.anInt302;
		int var9 = var0.leng;
		final int var11 = var0.anInt326 + 1;

		label65: while (true) {
			if (var2 > 0)
				while (true) {
					if (var9 == 0)
						break label65;

					if (var2 == 1) {
						if (var9 == 0) {
							var2 = 1;
							break label65;
						}

						var7[var8] = var1;
						++var8;
						--var9;
						break;
					}

					var7[var8] = var1;
					--var2;
					++var8;
					--var9;
				}

			boolean var12 = true;

			byte var13;
			while (var12) {
				var12 = false;
				if (var3 == var11) {
					var2 = 0;
					break label65;
				}

				var1 = (byte) var4;
				var6 = var5[var6];
				var13 = (byte) (var6 & 255);
				var6 >>= 8;
				++var3;
				if (var13 != var4) {
					var4 = var13;
					if (var9 == 0) {
						var2 = 1;
						break label65;
					}

					var7[var8] = var1;
					++var8;
					--var9;
					var12 = true;
				} else if (var3 == var11) {
					if (var9 == 0) {
						var2 = 1;
						break label65;
					}

					var7[var8] = var1;
					++var8;
					--var9;
					var12 = true;
				}
			}

			var2 = 2;
			var6 = var5[var6];
			var13 = (byte) (var6 & 255);
			var6 >>= 8;
			++var3;
			if (var3 != var11)
				if (var13 != var4)
					var4 = var13;
				else {
					var2 = 3;
					var6 = var5[var6];
					var13 = (byte) (var6 & 255);
					var6 >>= 8;
					++var3;
					if (var3 != var11)
						if (var13 != var4)
							var4 = var13;
						else {
							var6 = var5[var6];
							var13 = (byte) (var6 & 255);
							var6 >>= 8;
							++var3;
							var2 = (var13 & 255) + 4;
							var6 = var5[var6];
							var4 = (byte) (var6 & 255);
							var6 >>= 8;
							++var3;
						}
				}
		}

		final int var14 = var0.anInt304;
		var0.anInt304 += var9 - var9;
		if (var0.anInt304 < var14)
			;

		var0.aByte296 = var1;
		var0.anInt306 = var2;
		var0.anInt303 = var3;
		var0.anInt312 = var4;
		BZip2Context.anIntArray316 = var5;
		var0.anInt311 = var6;
		var0.decompressedData = var7;
		var0.anInt302 = var8;
		var0.leng = var9;
	}

	static void method197(final BZip2Context var0) {
		int var19 = 0;
		int[] var20 = null;
		int[] var21 = null;
		int[] var22 = null;
		var0.anInt309 = 1;
		if (BZip2Context.anIntArray316 == null)
			BZip2Context.anIntArray316 = new int[var0.anInt309 * 100000];

		boolean var23 = true;

		while (true) {
			while (var23) {
				byte var24 = method198(var0);
				if (var24 == 23)
					return;

				var24 = method198(var0);
				var24 = method198(var0);
				var24 = method198(var0);
				var24 = method198(var0);
				var24 = method198(var0);
				var24 = method198(var0);
				var24 = method198(var0);
				var24 = method198(var0);
				var24 = method198(var0);
				var24 = method199(var0);
				if (var24 != 0)
					;

				var0.anInt310 = 0;
				var24 = method198(var0);
				var0.anInt310 = (var0.anInt310 << 8) | (var24 & 255);
				var24 = method198(var0);
				var0.anInt310 = (var0.anInt310 << 8) | (var24 & 255);
				var24 = method198(var0);
				var0.anInt310 = (var0.anInt310 << 8) | (var24 & 255);

				int var36;
				for (var36 = 0; var36 < 16; ++var36) {
					var24 = method199(var0);
					if (var24 == 1)
						var0.aBoolArray319[var36] = true;
					else
						var0.aBoolArray319[var36] = false;
				}

				for (var36 = 0; var36 < 256; ++var36)
					var0.aBoolArray318[var36] = false;

				int var37;
				for (var36 = 0; var36 < 16; ++var36)
					if (var0.aBoolArray319[var36])
						for (var37 = 0; var37 < 16; ++var37) {
							var24 = method199(var0);
							if (var24 == 1)
								var0.aBoolArray318[(var36 * 16) + var37] = true;
						}

				method201(var0);
				final int var39 = var0.anInt317 + 2;
				final int var40 = method200(3, var0);
				final int var41 = method200(15, var0);

				for (var36 = 0; var36 < var41; ++var36) {
					var37 = 0;

					while (true) {
						var24 = method199(var0);
						if (var24 == 0) {
							var0.aByteArray313[var36] = (byte) var37;
							break;
						}

						++var37;
					}
				}

				final byte[] var25 = new byte[6];

				byte var26;
				for (var26 = 0; var26 < var40; var25[var26] = var26++)
					;

				for (var36 = 0; var36 < var41; ++var36) {
					var26 = var0.aByteArray313[var36];

					byte var27;
					for (var27 = var25[var26]; var26 > 0; --var26)
						var25[var26] = var25[var26 - 1];

					var25[0] = var27;
					var0.aByteArray321[var36] = var27;
				}

				int var38;
				for (var38 = 0; var38 < var40; ++var38) {
					int var50 = method200(5, var0);

					for (var36 = 0; var36 < var39; ++var36)
						while (true) {
							var24 = method199(var0);
							if (var24 == 0) {
								var0.aByteArrayArray323[var38][var36] = (byte) var50;
								break;
							}

							var24 = method199(var0);
							if (var24 == 0)
								++var50;
							else
								--var50;
						}
				}

				for (var38 = 0; var38 < var40; ++var38) {
					byte var28 = 32;
					byte var29 = 0;

					for (var36 = 0; var36 < var39; ++var36) {
						if (var0.aByteArrayArray323[var38][var36] > var29)
							var29 = var0.aByteArrayArray323[var38][var36];

						if (var0.aByteArrayArray323[var38][var36] < var28)
							var28 = var0.aByteArrayArray323[var38][var36];
					}

					method194(var0.anIntArrayArray298[var38], var0.anIntArrayArray327[var38],
							var0.anIntArrayArray328[var38], var0.aByteArrayArray323[var38], var28, var29, var39);
					var0.anIntArray329[var38] = var28;
				}

				final int var42 = var0.anInt317 + 1;
				int var43 = -1;
				byte var44 = 0;

				for (var36 = 0; var36 <= 255; ++var36)
					var0.anIntArray292[var36] = 0;

				int var55 = 4095;

				int var30;
				int var56;
				for (var30 = 15; var30 >= 0; --var30) {
					for (var56 = 15; var56 >= 0; --var56) {
						var0.aByteArray330[var55] = (byte) ((var30 * 16) + var56);
						--var55;
					}

					var0.anIntArray322[var30] = var55 + 1;
				}

				int var47 = 0;
				byte var54;
				if (var44 == 0) {
					++var43;
					var44 = 50;
					var54 = var0.aByteArray321[var43];
					var19 = var0.anIntArray329[var54];
					var20 = var0.anIntArrayArray298[var54];
					var22 = var0.anIntArrayArray328[var54];
					var21 = var0.anIntArrayArray327[var54];
				}

				int var45 = var44 - 1;
				int var51 = var19;

				int var52;
				byte var53;
				for (var52 = method200(var19, var0); var52 > var20[var51]; var52 = (var52 << 1) | var53) {
					++var51;
					var53 = method199(var0);
				}

				int var46 = var22[var52 - var21[var51]];

				while (true) {
					while (var46 != var42)
						if ((var46 != 0) && (var46 != 1)) {
							int var31 = var46 - 1;
							int var32;
							if (var31 < 16) {
								var32 = var0.anIntArray322[0];

								for (var24 = var0.aByteArray330[var32 + var31]; var31 > 3; var31 -= 4) {
									final int var33 = var32 + var31;
									var0.aByteArray330[var33] = var0.aByteArray330[var33 - 1];
									var0.aByteArray330[var33 - 1] = var0.aByteArray330[var33 - 2];
									var0.aByteArray330[var33 - 2] = var0.aByteArray330[var33 - 3];
									var0.aByteArray330[var33 - 3] = var0.aByteArray330[var33 - 4];
								}

								while (var31 > 0) {
									var0.aByteArray330[var32 + var31] = var0.aByteArray330[(var32 + var31) - 1];
									--var31;
								}

								var0.aByteArray330[var32] = var24;
							} else {
								int var34 = var31 / 16;
								final int var35 = var31 % 16;
								var32 = var0.anIntArray322[var34] + var35;

								for (var24 = var0.aByteArray330[var32]; var32 > var0.anIntArray322[var34]; --var32)
									var0.aByteArray330[var32] = var0.aByteArray330[var32 - 1];

								++var0.anIntArray322[var34];

								while (var34 > 0) {
									--var0.anIntArray322[var34];
									var0.aByteArray330[var0.anIntArray322[var34]] = var0.aByteArray330[(var0.anIntArray322[var34
											- 1] + 16) - 1];
									--var34;
								}

								--var0.anIntArray322[0];
								var0.aByteArray330[var0.anIntArray322[0]] = var24;
								if (var0.anIntArray322[0] == 0) {
									var55 = 4095;

									for (var30 = 15; var30 >= 0; --var30) {
										for (var56 = 15; var56 >= 0; --var56) {
											var0.aByteArray330[var55] = var0.aByteArray330[var0.anIntArray322[var30]
													+ var56];
											--var55;
										}

										var0.anIntArray322[var30] = var55 + 1;
									}
								}
							}

							++var0.anIntArray292[var0.aByteArray320[var24 & 255] & 255];
							BZip2Context.anIntArray316[var47] = var0.aByteArray320[var24 & 255] & 255;
							++var47;
							if (var45 == 0) {
								++var43;
								var45 = 50;
								var54 = var0.aByteArray321[var43];
								var19 = var0.anIntArray329[var54];
								var20 = var0.anIntArrayArray298[var54];
								var22 = var0.anIntArrayArray328[var54];
								var21 = var0.anIntArrayArray327[var54];
							}

							--var45;
							var51 = var19;

							for (var52 = method200(var19, var0); var52 > var20[var51]; var52 = (var52 << 1) | var53) {
								++var51;
								var53 = method199(var0);
							}

							var46 = var22[var52 - var21[var51]];
						} else {
							int var48 = -1;
							int var49 = 1;

							do {
								if (var46 == 0)
									var48 += var49;
								else if (var46 == 1)
									var48 += 2 * var49;

								var49 *= 2;
								if (var45 == 0) {
									++var43;
									var45 = 50;
									var54 = var0.aByteArray321[var43];
									var19 = var0.anIntArray329[var54];
									var20 = var0.anIntArrayArray298[var54];
									var22 = var0.anIntArrayArray328[var54];
									var21 = var0.anIntArrayArray327[var54];
								}

								--var45;
								var51 = var19;

								for (var52 = method200(var19, var0); var52 > var20[var51]; var52 = (var52 << 1)
										| var53) {
									++var51;
									var53 = method199(var0);
								}

								var46 = var22[var52 - var21[var51]];
							} while ((var46 == 0) || (var46 == 1));

							++var48;
							var24 = var0.aByteArray320[var0.aByteArray330[var0.anIntArray322[0]] & 255];

							for (var0.anIntArray292[var24 & 255] += var48; var48 > 0; --var48) {
								BZip2Context.anIntArray316[var47] = var24 & 255;
								++var47;
							}
						}

					var0.anInt306 = 0;
					var0.aByte296 = 0;
					var0.anIntArray315[0] = 0;

					for (var36 = 1; var36 <= 256; ++var36)
						var0.anIntArray315[var36] = var0.anIntArray292[var36 - 1];

					for (var36 = 1; var36 <= 256; ++var36)
						var0.anIntArray315[var36] += var0.anIntArray315[var36 - 1];

					for (var36 = 0; var36 < var47; ++var36) {
						var24 = (byte) (BZip2Context.anIntArray316[var36] & 255);
						BZip2Context.anIntArray316[var0.anIntArray315[var24 & 255]] |= var36 << 8;
						++var0.anIntArray315[var24 & 255];
					}

					var0.anInt311 = BZip2Context.anIntArray316[var0.anInt310] >> 8;
					var0.anInt303 = 0;
					var0.anInt311 = BZip2Context.anIntArray316[var0.anInt311];
					var0.anInt312 = (byte) (var0.anInt311 & 255);
					var0.anInt311 >>= 8;
					++var0.anInt303;
					var0.anInt326 = var47;
					method196(var0);
					if ((var0.anInt303 == (var0.anInt326 + 1)) && (var0.anInt306 == 0)) {
						var23 = true;
						break;
					}

					var23 = false;
					break;
				}
			}

			return;
		}
	}

	static byte method198(final BZip2Context var0) {
		return (byte) method200(8, var0);
	}

	static byte method199(final BZip2Context var0) {
		return (byte) method200(1, var0);
	}

	static int method200(final int var0, final BZip2Context var1) {
		while (var1.anInt308 < var0) {
			var1.anInt307 = (var1.anInt307 << 8) | (var1.packedData[var1.blockSize] & 255);
			var1.anInt308 += 8;
			++var1.blockSize;
			++var1.anInt300;
			if (var1.anInt300 == 0)
				;
		}

		final int var2 = (var1.anInt307 >> (var1.anInt308 - var0)) & ((1 << var0) - 1);
		var1.anInt308 -= var0;
		return var2;
	}

	static void method201(final BZip2Context var0) {
		var0.anInt317 = 0;

		for (int var1 = 0; var1 < 256; ++var1)
			if (var0.aBoolArray318[var1]) {
				var0.aByteArray320[var0.anInt317] = (byte) var1;
				++var0.anInt317;
			}

	}
}
