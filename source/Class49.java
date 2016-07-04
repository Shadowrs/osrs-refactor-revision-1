import java.io.IOException;

public class Class49 {
	public static String[] targets;
	static Class8 aClass8_416;
	static Class104_Sub18_Sub17_Sub3 aClass104_Sub18_Sub17_Sub3_417;
	public static Class61 aClass61_418;
	int[] anIntArray413;
	byte[] aByteArray412;
	int[] anIntArray414;

	public int method218(final byte[] var1, final int var2, final byte[] var3, int var4, int var5) {
		if (var5 == 0)
			return 0;
		else {
			int var6 = 0;
			var5 += var4;
			int var7 = var2;

			while (true) {
				final byte var8 = var1[var7];
				if (var8 < 0)
					var6 = anIntArray414[var6];
				else
					++var6;

				int var9;
				if ((var9 = anIntArray414[var6]) < 0) {
					var3[var4++] = (byte) (~var9);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var8 & 64) != 0)
					var6 = anIntArray414[var6];
				else
					++var6;

				if ((var9 = anIntArray414[var6]) < 0) {
					var3[var4++] = (byte) (~var9);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var8 & 32) != 0)
					var6 = anIntArray414[var6];
				else
					++var6;

				if ((var9 = anIntArray414[var6]) < 0) {
					var3[var4++] = (byte) (~var9);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var8 & 16) != 0)
					var6 = anIntArray414[var6];
				else
					++var6;

				if ((var9 = anIntArray414[var6]) < 0) {
					var3[var4++] = (byte) (~var9);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var8 & 8) != 0)
					var6 = anIntArray414[var6];
				else
					++var6;

				if ((var9 = anIntArray414[var6]) < 0) {
					var3[var4++] = (byte) (~var9);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var8 & 4) != 0)
					var6 = anIntArray414[var6];
				else
					++var6;

				if ((var9 = anIntArray414[var6]) < 0) {
					var3[var4++] = (byte) (~var9);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var8 & 2) != 0)
					var6 = anIntArray414[var6];
				else
					++var6;

				if ((var9 = anIntArray414[var6]) < 0) {
					var3[var4++] = (byte) (~var9);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var8 & 1) != 0)
					var6 = anIntArray414[var6];
				else
					++var6;

				if ((var9 = anIntArray414[var6]) < 0) {
					var3[var4++] = (byte) (~var9);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				++var7;
			}

			return (1 + var7) - var2;
		}
	}

	public int method219(final byte[] var1, int var2, int var3, final byte[] var4, final int var5) {
		int var6 = 0;
		int var7 = var5 << 3;

		for (var3 += var2; var2 < var3; ++var2) {
			final int var8 = var1[var2] & 255;
			final int var9 = anIntArray413[var8];
			final byte var10 = aByteArray412[var8];
			if (var10 == 0)
				throw new RuntimeException("");

			int var11 = var7 >> 3;
			int var12 = var7 & 7;
			var6 &= -var12 >> 31;
			final int var13 = var11 + (((var10 + var12) - 1) >> 3);
			var12 += 24;
			var4[var11] = (byte) (var6 |= var9 >>> var12);
			if (var11 < var13) {
				++var11;
				var12 -= 8;
				var4[var11] = (byte) (var6 = var9 >>> var12);
				if (var11 < var13) {
					++var11;
					var12 -= 8;
					var4[var11] = (byte) (var6 = var9 >>> var12);
					if (var11 < var13) {
						++var11;
						var12 -= 8;
						var4[var11] = (byte) (var6 = var9 >>> var12);
						if (var11 < var13) {
							++var11;
							var12 -= 8;
							var4[var11] = (byte) (var6 = var9 << -var12);
						}
					}
				}
			}

			var7 += var10;
		}

		return ((7 + var7) >> 3) - var5;
	}

	public Class49(final byte[] var1) {
		final int var2 = var1.length;
		anIntArray413 = new int[var2];
		aByteArray412 = var1;
		final int[] var3 = new int[33];
		anIntArray414 = new int[8];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			final byte var6 = var1[var5];
			if (var6 != 0) {
				final int var7 = 1 << (32 - var6);
				final int var8 = var3[var6];
				anIntArray413[var5] = var8;
				int var9;
				int var10;
				int var11;
				int var12;
				if ((var8 & var7) != 0)
					var9 = var3[var6 - 1];
				else {
					var9 = var8 | var7;

					for (var10 = var6 - 1; var10 >= 1; --var10) {
						var11 = var3[var10];
						if (var8 != var11)
							break;

						var12 = 1 << (32 - var10);
						if ((var11 & var12) != 0) {
							var3[var10] = var3[var10 - 1];
							break;
						}

						var3[var10] = var11 | var12;
					}
				}

				var3[var6] = var9;

				for (var10 = 1 + var6; var10 <= 32; ++var10)
					if (var3[var10] == var8)
						var3[var10] = var9;

				var10 = 0;

				for (var11 = 0; var11 < var6; ++var11) {
					var12 = Integer.MIN_VALUE >>> var11;
					if ((var8 & var12) != 0) {
						if (anIntArray414[var10] == 0)
							anIntArray414[var10] = var4;

						var10 = anIntArray414[var10];
					} else
						++var10;

					if (var10 >= anIntArray414.length) {
						final int[] var13 = new int[anIntArray414.length * 2];

						for (int var14 = 0; var14 < anIntArray414.length; ++var14)
							var13[var14] = anIntArray414[var14];

						anIntArray414 = var13;
					}

					var12 >>>= 1;
				}

				anIntArray414[var10] = ~var5;
				if (var10 >= var4)
					var4 = 1 + var10;
			}
		}

	}

	public static void method220() {
		try {
			if (Class29.anInt272 == 1) {
				int var0 = Class29.aClass104_Sub8_Sub1_271.method660();
				if ((var0 > 0) && Class29.aClass104_Sub8_Sub1_271.method637()) {
					var0 -= Class69.anInt565;
					if (var0 < 0)
						var0 = 0;

					Class29.aClass104_Sub8_Sub1_271.method642(var0);
					return;
				}

				Class29.aClass104_Sub8_Sub1_271.method665();
				Class29.aClass104_Sub8_Sub1_271.method664();
				if (Class29.aClass61_273 != null)
					Class29.anInt272 = 2;
				else
					Class29.anInt272 = 0;

				Class29.aClass104_Sub14_268 = null;
				Class102_Sub1.aClass53_896 = null;
			}
		} catch (final Exception var2) {
			var2.printStackTrace();
			Class29.aClass104_Sub8_Sub1_271.method665();
			Class29.anInt272 = 0;
			Class29.aClass104_Sub14_268 = null;
			Class102_Sub1.aClass53_896 = null;
			Class29.aClass61_273 = null;
		}

	}

	public static boolean method221() {
		final long var0 = Class71.method332();
		int var2 = (int) (var0 - Class40.aLong359);
		Class40.aLong359 = var0;
		if (var2 > 200)
			var2 = 200;

		Class87.anInt686 += var2;
		if ((Class87.anInt692 == 0) && (Class87.anInt684 == 0) && (Class87.anInt687 == 0) && (Class87.anInt682 == 0))
			return true;
		else if (null == Class66.aClass13_547)
			return false;
		else
			try {
				if (Class87.anInt686 > 30000)
					throw new IOException();
				else {
					Class104_Sub18_Sub13 var3;
					RSBuf var4;
					while ((Class87.anInt684 < 20) && (Class87.anInt682 > 0)) {
						var3 = (Class104_Sub18_Sub13) Class87.aClass58_681.method245();
						var4 = new RSBuf(4);
						var4.writebyte(1);
						var4.method587((int) var3.aLong824);
						Class66.aClass13_547.flushbytes(var4.backing, 0, 4);
						Class87.aClass58_683.method242(var3, var3.aLong824);
						--Class87.anInt682;
						++Class87.anInt684;
					}

					while ((Class87.anInt692 < 20) && (Class87.anInt687 > 0)) {
						var3 = (Class104_Sub18_Sub13) Class87.aClass63_685.method293();
						var4 = new RSBuf(4);
						var4.writebyte(0);
						var4.method587((int) var3.aLong824);
						Class66.aClass13_547.flushbytes(var4.backing, 0, 4);
						var3.method555();
						Class87.aClass58_694.method242(var3, var3.aLong824);
						--Class87.anInt687;
						++Class87.anInt692;
					}

					for (int var5 = 0; var5 < 100; ++var5) {
						final int var6 = Class66.aClass13_547.avail();
						if (var6 < 0)
							throw new IOException();

						if (var6 == 0)
							break;

						Class87.anInt686 = 0;
						byte var7 = 0;
						if (null == Class48.aClass104_Sub18_Sub13_410)
							var7 = 8;
						else if (Class87.anInt696 == 0)
							var7 = 1;

						int var8;
						int var9;
						int var10;
						int var12;
						if (var7 > 0) {
							var8 = var7 - Class87.aClass104_Sub21_690.pos;
							if (var8 > var6)
								var8 = var6;

							Class66.aClass13_547.readbytes(Class87.aClass104_Sub21_690.backing,
									Class87.aClass104_Sub21_690.pos, var8);
							if (Class87.aByte697 != 0)
								for (var9 = 0; var9 < var8; ++var9)
									Class87.aClass104_Sub21_690.backing[var9
											+ Class87.aClass104_Sub21_690.pos] ^= Class87.aByte697;

							Class87.aClass104_Sub21_690.pos += var8;
							if (Class87.aClass104_Sub21_690.pos < var7)
								break;

							if (Class48.aClass104_Sub18_Sub13_410 == null) {
								Class87.aClass104_Sub21_690.pos = 0;
								var9 = Class87.aClass104_Sub21_690.readUByte();
								var10 = Class87.aClass104_Sub21_690.readLEShort();
								final int var11 = Class87.aClass104_Sub21_690.readUByte();
								var12 = Class87.aClass104_Sub21_690.readLEInt();
								final long var13 = var10 + (var9 << 16);
								Class104_Sub18_Sub13 var15 = (Class104_Sub18_Sub13) Class87.aClass58_683
										.method241(var13);
								Class87.aBool689 = true;
								if (null == var15) {
									var15 = (Class104_Sub18_Sub13) Class87.aClass58_694.method241(var13);
									Class87.aBool689 = false;
								}

								if (var15 == null)
									throw new IOException();

								final int var16 = var11 == 0 ? 5 : 9;
								Class48.aClass104_Sub18_Sub13_410 = var15;
								Class87.aClass104_Sub21_691 = new RSBuf(
										var16 + var12 + Class48.aClass104_Sub18_Sub13_410.aByte1459);
								Class87.aClass104_Sub21_691.writebyte(var11);
								Class87.aClass104_Sub21_691.writeInt(var12);
								Class87.anInt696 = 8;
								Class87.aClass104_Sub21_690.pos = 0;
							} else if (Class87.anInt696 == 0)
								if (Class87.aClass104_Sub21_690.backing[0] == -1) {
									Class87.anInt696 = 1;
									Class87.aClass104_Sub21_690.pos = 0;
								} else
									Class48.aClass104_Sub18_Sub13_410 = null;
						} else {
							var8 = Class87.aClass104_Sub21_691.backing.length
									- Class48.aClass104_Sub18_Sub13_410.aByte1459;
							var9 = 512 - Class87.anInt696;
							if (var9 > (var8 - Class87.aClass104_Sub21_691.pos))
								var9 = var8 - Class87.aClass104_Sub21_691.pos;

							if (var9 > var6)
								var9 = var6;

							Class66.aClass13_547.readbytes(Class87.aClass104_Sub21_691.backing,
									Class87.aClass104_Sub21_691.pos, var9);
							if (Class87.aByte697 != 0)
								for (var10 = 0; var10 < var9; ++var10)
									Class87.aClass104_Sub21_691.backing[var10
											+ Class87.aClass104_Sub21_691.pos] ^= Class87.aByte697;

							Class87.aClass104_Sub21_691.pos += var9;
							Class87.anInt696 += var9;
							if (var8 == Class87.aClass104_Sub21_691.pos) {
								if (16711935L == Class48.aClass104_Sub18_Sub13_410.aLong824) {
									Class2.aClass104_Sub21_7 = Class87.aClass104_Sub21_691;

									for (var10 = 0; var10 < 256; ++var10) {
										final Class61_Sub1 var17 = Class87.aClass61_Sub1Array695[var10];
										if (var17 != null) {
											Class2.aClass104_Sub21_7.pos = 5 + (var10 * 8);
											var12 = Class2.aClass104_Sub21_7.readLEInt();
											final int var18 = Class2.aClass104_Sub21_7.readLEInt();
											var17.method492(var12, var18);
										}
									}
								} else {
									Class87.aCRC32_680.reset();
									Class87.aCRC32_680.update(Class87.aClass104_Sub21_691.backing, 0, var8);
									var10 = (int) Class87.aCRC32_680.getValue();
									if (var10 != Class48.aClass104_Sub18_Sub13_410.anInt1460) {
										try {
											Class66.aClass13_547.destory();
										} catch (final Exception var20) {
											;
										}

										++Class87.anInt693;
										Class66.aClass13_547 = null;
										Class87.aByte697 = (byte) ((int) ((Math.random() * 255.0D) + 1.0D));
										return false;
									}

									Class87.anInt693 = 0;
									Class87.anInt698 = 0;
									Class48.aClass104_Sub18_Sub13_410.aClass61_Sub1_1461.method487(
											(int) (Class48.aClass104_Sub18_Sub13_410.aLong824 & 65535L),
											Class87.aClass104_Sub21_691.backing,
											16711680L == (Class48.aClass104_Sub18_Sub13_410.aLong824 & 16711680L),
											Class87.aBool689);
								}

								Class48.aClass104_Sub18_Sub13_410.method470();
								if (Class87.aBool689)
									--Class87.anInt684;
								else
									--Class87.anInt692;

								Class87.anInt696 = 0;
								Class48.aClass104_Sub18_Sub13_410 = null;
								Class87.aClass104_Sub21_691 = null;
							} else {
								if (Class87.anInt696 != 512)
									break;

								Class87.anInt696 = 0;
							}
						}
					}

					return true;
				}
			} catch (final IOException var21) {
				try {
					Class66.aClass13_547.destory();
				} catch (final Exception var19) {
					;
				}

				++Class87.anInt698;
				Class66.aClass13_547 = null;
				return false;
			}
	}

	static void method222(final Class61_Sub1 var0, final int var1, final int var2, final int var3, final byte var4,
			final boolean var5) {
		final long var6 = (var1 << 16) + var2;
		Class104_Sub18_Sub13 var8 = (Class104_Sub18_Sub13) Class87.aClass58_681.method241(var6);
		if (null == var8) {
			var8 = (Class104_Sub18_Sub13) Class87.aClass58_683.method241(var6);
			if (null == var8) {
				var8 = (Class104_Sub18_Sub13) Class87.aClass58_688.method241(var6);
				if (var8 != null) {
					if (var5) {
						var8.method555();
						Class87.aClass58_681.method242(var8, var6);
						--Class87.anInt687;
						++Class87.anInt682;
					}

				} else {
					if (!var5) {
						var8 = (Class104_Sub18_Sub13) Class87.aClass58_694.method241(var6);
						if (null != var8)
							return;
					}

					var8 = new Class104_Sub18_Sub13();
					var8.aClass61_Sub1_1461 = var0;
					var8.anInt1460 = var3;
					var8.aByte1459 = var4;
					if (var5) {
						Class87.aClass58_681.method242(var8, var6);
						++Class87.anInt682;
					} else {
						Class87.aClass63_685.method290(var8);
						Class87.aClass58_688.method242(var8, var6);
						++Class87.anInt687;
					}

				}
			}
		}
	}

	public static void method223(final Class61 var0, final Class61 var1) {
		Class104_Sub18_Sub2.aClass61_1238 = var0;
		Class104_Sub9.aClass61_959 = var1;
	}
}
