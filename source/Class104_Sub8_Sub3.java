public class Class104_Sub8_Sub3 extends Class104_Sub8 {
	int anInt1299;
	int anInt1298;
	boolean aBool1294;
	int anInt1290;
	int anInt1291;
	int anInt1292;
	int anInt1297;
	int anInt1293;
	int anInt1303;
	int anInt1289;
	int anInt1296;
	int anInt1301;
	int anInt1300;
	int anInt1302;
	int anInt1295;

	@Override
	int method511() {
		int var1 = (anInt1293 * 3) >> 6;
		var1 = (var1 ^ (var1 >> 31)) + (var1 >>> 31);
		if (anInt1296 == 0)
			var1 -= (var1 * anInt1297) / (((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288.length << 8);
		else if (anInt1296 >= 0)
			var1 -= (var1 * anInt1299) / ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288.length;

		return var1 > 255 ? 255 : var1;
	}

	Class104_Sub8_Sub3(final Class104_Sub4_Sub1 var1, final int var2, final int var3) {
		aClass104_Sub4_953 = var1;
		anInt1299 = var1.anInt1286;
		anInt1298 = var1.anInt1287;
		aBool1294 = var1.aBool1285;
		anInt1290 = var2;
		anInt1291 = var3;
		anInt1292 = 8192;
		anInt1297 = 0;
		method691();
	}

	Class104_Sub8_Sub3(final Class104_Sub4_Sub1 var1, final int var2, final int var3, final int var4) {
		aClass104_Sub4_953 = var1;
		anInt1299 = var1.anInt1286;
		anInt1298 = var1.anInt1287;
		aBool1294 = var1.aBool1285;
		anInt1290 = var2;
		anInt1291 = var3;
		anInt1292 = var4;
		anInt1297 = 0;
		method691();
	}

	public static Class104_Sub8_Sub3 method690(final Class104_Sub4_Sub1 var0, final int var1, final int var2,
			final int var3) {
		return (var0.aByteArray1288 != null) && (var0.aByteArray1288.length != 0)
				? new Class104_Sub8_Sub3(var0, var1, var2, var3) : null;
	}

	void method691() {
		anInt1293 = anInt1291;
		anInt1303 = method728(anInt1291, anInt1292);
		anInt1289 = method725(anInt1291, anInt1292);
	}

	public synchronized void method692(final int var1) {
		anInt1296 = var1;
	}

	boolean method693() {
		int var1 = anInt1291;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var2 = 0;
			var3 = 0;
			var1 = 0;
		} else {
			var3 = method728(var1, anInt1292);
			var2 = method725(var1, anInt1292);
		}

		if ((anInt1293 == var1) && (anInt1303 == var3) && (anInt1289 == var2)) {
			if (anInt1291 == Integer.MIN_VALUE) {
				anInt1291 = 0;
				anInt1289 = 0;
				anInt1303 = 0;
				anInt1293 = 0;
				method470();
				return true;
			} else {
				method691();
				return false;
			}
		} else {
			if (anInt1293 < var1) {
				anInt1301 = 1;
				anInt1300 = var1 - anInt1293;
			} else if (anInt1293 > var1) {
				anInt1301 = -1;
				anInt1300 = anInt1293 - var1;
			} else
				anInt1301 = 0;

			if (anInt1303 < var3) {
				anInt1302 = 1;
				if ((anInt1300 == 0) || (anInt1300 > (var3 - anInt1303)))
					anInt1300 = var3 - anInt1303;
			} else if (anInt1303 > var3) {
				anInt1302 = -1;
				if ((anInt1300 == 0) || (anInt1300 > (anInt1303 - var3)))
					anInt1300 = anInt1303 - var3;
			} else
				anInt1302 = 0;

			if (anInt1289 < var2) {
				anInt1295 = 1;
				if ((anInt1300 == 0) || (anInt1300 > (var2 - anInt1289)))
					anInt1300 = var2 - anInt1289;
			} else if (anInt1289 > var2) {
				anInt1295 = -1;
				if ((anInt1300 == 0) || (anInt1300 > (anInt1289 - var2)))
					anInt1300 = anInt1289 - var2;
			} else
				anInt1295 = 0;

			return false;
		}
	}

	public synchronized int method694() {
		return anInt1291 == Integer.MIN_VALUE ? 0 : anInt1291;
	}

	public synchronized int method695() {
		return anInt1292 < 0 ? -1 : anInt1292;
	}

	public synchronized void method696(int var1) {
		final int var2 = ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288.length << 8;
		if (var1 < -1)
			var1 = -1;

		if (var1 > var2)
			var1 = var2;

		anInt1297 = var1;
	}

	static int method697(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, final int var6,
			int var7, final int var8, final int var9, final Class104_Sub8_Sub3 var10, final int var11,
			final int var12) {
		if ((var11 == 0) || ((var7 = var5 + ((((var9 + 256) - var4) + var11) / var11)) > var8))
			var7 = var8;

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			final byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var2[var1] - var13) * (var4 & 255))) * var6) >> 6;
			var4 += var11;
		}

		if ((var11 == 0) || ((var7 = var5 + (((var9 - var4) + var11) / var11)) > var8))
			var7 = var8;

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += (((var0 << 8) + ((var2[var4 >> 8] - var0) * (var4 & 255))) * var6) >> 6;
		}

		var10.anInt1297 = var4;
		return var5;
	}

	void method698() {
		if (anInt1300 != 0) {
			if (anInt1291 == Integer.MIN_VALUE)
				anInt1291 = 0;

			anInt1300 = 0;
			method691();
		}

	}

	public synchronized void method699(final int var1, final int var2) {
		method700(var1, var2, method695());
	}

	public synchronized void method700(int var1, final int var2, final int var3) {
		if (var1 == 0)
			method722(var2, var3);
		else {
			final int var4 = method728(var2, var3);
			final int var5 = method725(var2, var3);
			if ((anInt1303 == var4) && (anInt1289 == var5))
				anInt1300 = 0;
			else {
				int var6 = var2 - anInt1293;
				if ((anInt1293 - var2) > var6)
					var6 = anInt1293 - var2;

				if ((var4 - anInt1303) > var6)
					var6 = var4 - anInt1303;

				if ((anInt1303 - var4) > var6)
					var6 = anInt1303 - var4;

				if ((var5 - anInt1289) > var6)
					var6 = var5 - anInt1289;

				if ((anInt1289 - var5) > var6)
					var6 = anInt1289 - var5;

				if (var1 > var6)
					var1 = var6;

				anInt1300 = var1;
				anInt1291 = var2;
				anInt1292 = var3;
				anInt1301 = (var2 - anInt1293) / var1;
				anInt1302 = (var4 - anInt1303) / var1;
				anInt1295 = (var5 - anInt1289) / var1;
			}
		}
	}

	static int method701(final int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5,
			final int var6, int var7, final int var8, final int var9, final Class104_Sub8_Sub3 var10, final int var11,
			final int var12) {
		if ((var11 == 0) || ((var7 = var5 + ((((var9 - var4) + var11) - 257) / var11)) > var8))
			var7 = var8;

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var2[var1 + 1] - var13) * (var4 & 255))) * var6) >> 6;
			var4 += var11;
		}

		if ((var11 == 0) || ((var7 = var5 + ((((var9 - var4) + var11) - 1) / var11)) > var8))
			var7 = var8;

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var1 - var13) * (var4 & 255))) * var6) >> 6;
		}

		var10.anInt1297 = var4;
		return var5;
	}

	public synchronized void method702(final int var1) {
		if (anInt1290 < 0)
			anInt1290 = -var1;
		else
			anInt1290 = var1;

	}

	public synchronized int method703() {
		return anInt1290 < 0 ? -anInt1290 : anInt1290;
	}

	public boolean method704() {
		return anInt1300 != 0;
	}

	@Override
	Class104_Sub8 method512() {
		return null;
	}

	@Override
	Class104_Sub8 method513() {
		return null;
	}

	@Override
	int method514() {
		return (anInt1291 == 0) && (anInt1300 == 0) ? 0 : 1;
	}

	@Override
	public synchronized void method515(final int[] var1, final int var2, int var3) {
		if ((anInt1291 == 0) && (anInt1300 == 0))
			method516(var3);
		else {
			final Class104_Sub4_Sub1 var4 = (Class104_Sub4_Sub1) aClass104_Sub4_953;
			final int var5 = anInt1299 << 8;
			final int var6 = anInt1298 << 8;
			final int var7 = var4.aByteArray1288.length << 8;
			final int var8 = var6 - var5;
			if (var8 <= 0)
				anInt1296 = 0;

			int var9 = var2;
			var3 += var2;
			if (anInt1297 < 0) {
				if (anInt1290 <= 0) {
					method698();
					method470();
					return;
				}

				anInt1297 = 0;
			}

			if (anInt1297 >= var7) {
				if (anInt1290 >= 0) {
					method698();
					method470();
					return;
				}

				anInt1297 = var7 - 1;
			}

			if (anInt1296 < 0) {
				if (aBool1294) {
					if (anInt1290 < 0) {
						var9 = method705(var1, var2, var5, var3, var4.aByteArray1288[anInt1299]);
						if (anInt1297 >= var5)
							return;

						anInt1297 = (var5 + var5) - 1 - anInt1297;
						anInt1290 = -anInt1290;
					}

					while (true) {
						var9 = method719(var1, var9, var6, var3, var4.aByteArray1288[anInt1298 - 1]);
						if (anInt1297 < var6)
							return;

						anInt1297 = (var6 + var6) - 1 - anInt1297;
						anInt1290 = -anInt1290;
						var9 = method705(var1, var9, var5, var3, var4.aByteArray1288[anInt1299]);
						if (anInt1297 >= var5)
							return;

						anInt1297 = (var5 + var5) - 1 - anInt1297;
						anInt1290 = -anInt1290;
					}
				} else if (anInt1290 < 0)
					while (true) {
						var9 = method705(var1, var9, var5, var3, var4.aByteArray1288[anInt1298 - 1]);
						if (anInt1297 >= var5)
							return;

						anInt1297 = var6 - 1 - ((var6 - 1 - anInt1297) % var8);
					}
				else
					while (true) {
						var9 = method719(var1, var9, var6, var3, var4.aByteArray1288[anInt1299]);
						if (anInt1297 < var6)
							return;

						anInt1297 = var5 + ((anInt1297 - var5) % var8);
					}
			} else {
				if (anInt1296 > 0)
					if (aBool1294)
						label129: {
							if (anInt1290 < 0) {
								var9 = method705(var1, var2, var5, var3, var4.aByteArray1288[anInt1299]);
								if (anInt1297 >= var5)
									return;

								anInt1297 = (var5 + var5) - 1 - anInt1297;
								anInt1290 = -anInt1290;
								if (--anInt1296 == 0)
									break label129;
							}

							do {
								var9 = method719(var1, var9, var6, var3, var4.aByteArray1288[anInt1298 - 1]);
								if (anInt1297 < var6)
									return;

								anInt1297 = (var6 + var6) - 1 - anInt1297;
								anInt1290 = -anInt1290;
								if (--anInt1296 == 0)
									break;

								var9 = method705(var1, var9, var5, var3, var4.aByteArray1288[anInt1299]);
								if (anInt1297 >= var5)
									return;

								anInt1297 = (var5 + var5) - 1 - anInt1297;
								anInt1290 = -anInt1290;
							} while (--anInt1296 != 0);
						}
					else {
						int var10;
						if (anInt1290 < 0)
							while (true) {
								var9 = method705(var1, var9, var5, var3, var4.aByteArray1288[anInt1298 - 1]);
								if (anInt1297 >= var5)
									return;

								var10 = (var6 - 1 - anInt1297) / var8;
								if (var10 >= anInt1296) {
									anInt1297 += var8 * anInt1296;
									anInt1296 = 0;
									break;
								}

								anInt1297 += var8 * var10;
								anInt1296 -= var10;
							}
						else
							while (true) {
								var9 = method719(var1, var9, var6, var3, var4.aByteArray1288[anInt1299]);
								if (anInt1297 < var6)
									return;

								var10 = (anInt1297 - var5) / var8;
								if (var10 >= anInt1296) {
									anInt1297 -= var8 * anInt1296;
									anInt1296 = 0;
									break;
								}

								anInt1297 -= var8 * var10;
								anInt1296 -= var10;
							}
					}

				if (anInt1290 < 0) {
					method705(var1, var9, 0, var3, 0);
					if (anInt1297 < 0) {
						anInt1297 = -1;
						method698();
						method470();
					}
				} else {
					method719(var1, var9, var7, var3, 0);
					if (anInt1297 >= var7) {
						anInt1297 = var7;
						method698();
						method470();
					}
				}

			}
		}
	}

	int method705(final int[] var1, int var2, final int var3, final int var4, final int var5) {
		while (true) {
			if (anInt1300 > 0) {
				int var6 = var2 + anInt1300;
				if (var6 > var4)
					var6 = var4;

				anInt1300 += var2;
				if ((anInt1290 == -256) && ((anInt1297 & 255) == 0)) {
					if (Class99.aBool773)
						var2 = method716(0, ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297,
								var2, anInt1303, anInt1289, anInt1302, anInt1295, 0, var6, var3, this);
					else
						var2 = method715(((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297,
								var2, anInt1293, anInt1301, 0, var6, var3, this);
				} else if (Class99.aBool773)
					var2 = method718(0, 0, ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297,
							var2, anInt1303, anInt1289, anInt1302, anInt1295, 0, var6, var3, this, anInt1290, var5);
				else
					var2 = method726(0, 0, ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297,
							var2, anInt1293, anInt1301, 0, var6, var3, this, anInt1290, var5);

				anInt1300 -= var2;
				if (anInt1300 != 0)
					return var2;

				if (!method693())
					continue;

				return var4;
			}

			if ((anInt1290 == -256) && ((anInt1297 & 255) == 0)) {
				if (Class99.aBool773)
					return method723(0, ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297, var2,
							anInt1303, anInt1289, 0, var4, var3, this);

				return method708(((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297, var2,
						anInt1293, 0, var4, var3, this);
			}

			if (Class99.aBool773)
				return method713(0, 0, ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297, var2,
						anInt1303, anInt1289, 0, var4, var3, this, anInt1290, var5);

			return method697(0, 0, ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297, var2,
					anInt1293, 0, var4, var3, this, anInt1290, var5);
		}
	}

	static int method706(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			int var7, final Class104_Sub8_Sub3 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = (var3 + var7) - var2) > var6)
			var5 = var6;

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4)
			var10001 = var3++;

		var8.anInt1297 = var2 << 8;
		return var3;
	}

	static int method707(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, final int var8, int var9, final Class104_Sub8_Sub3 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = (var4 + var9) - var3) > var8)
			var7 = var8;

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt1297 = var3 << 8;
		return var4 >> 1;
	}

	static int method708(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			int var7, final Class104_Sub8_Sub3 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = (var3 + var2) - (var7 - 1)) > var6)
			var5 = var6;

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4)
			var10001 = var3++;

		var8.anInt1297 = var2 << 8;
		return var3;
	}

	public synchronized void method709(int var1) {
		if (var1 == 0) {
			method724(0);
			method470();
		} else if ((anInt1303 == 0) && (anInt1289 == 0)) {
			anInt1300 = 0;
			anInt1291 = 0;
			anInt1293 = 0;
			method470();
		} else {
			int var2 = -anInt1293;
			if (anInt1293 > var2)
				var2 = anInt1293;

			if (-anInt1303 > var2)
				var2 = -anInt1303;

			if (anInt1303 > var2)
				var2 = anInt1303;

			if (-anInt1289 > var2)
				var2 = -anInt1289;

			if (anInt1289 > var2)
				var2 = anInt1289;

			if (var1 > var2)
				var1 = var2;

			anInt1300 = var1;
			anInt1291 = Integer.MIN_VALUE;
			anInt1301 = -anInt1293 / var1;
			anInt1302 = -anInt1303 / var1;
			anInt1295 = -anInt1289 / var1;
		}
	}

	static int method710(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			int var7, final int var8, final int var9, int var10, final int var11, final int var12,
			final Class104_Sub8_Sub3 var13, final int var14, final int var15) {
		var13.anInt1293 -= var13.anInt1301 * var5;
		if ((var14 == 0) || ((var10 = var5 + ((((var12 - var4) + var14) - 257) / var14)) > var11))
			var10 = var11;

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + ((var2[var1 + 1] - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		if ((var14 == 0) || ((var10 = (var5 >> 1) + ((((var12 - var4) + var14) - 1) / var14)) > var11))
			var10 = var11;

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + ((var1 - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt1293 += var13.anInt1301 * var5;
		var13.anInt1303 = var6;
		var13.anInt1289 = var7;
		var13.anInt1297 = var4;
		return var5;
	}

	static int method711(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, final int var6,
			final int var7, int var8, final int var9, final int var10, final Class104_Sub8_Sub3 var11, final int var12,
			final int var13) {
		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 257) / var12)) > var9))
			var8 = var9;

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + ((var2[var1 + 1] - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		if ((var12 == 0) || ((var8 = (var5 >> 1) + ((((var10 - var4) + var12) - 1) / var12)) > var9))
			var8 = var9;

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + ((var1 - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		var11.anInt1297 = var4;
		return var5 >> 1;
	}

	public synchronized void method712(final boolean var1) {
		anInt1290 = (anInt1290 ^ (anInt1290 >> 31)) + (anInt1290 >>> 31);
		anInt1290 = -anInt1290;
	}

	static int method713(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, final int var6,
			final int var7, int var8, final int var9, final int var10, final Class104_Sub8_Sub3 var11, final int var12,
			final int var13) {
		if ((var12 == 0) || ((var8 = var5 + ((((var10 + 256) - var4) + var12) / var12)) > var9))
			var8 = var9;

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			final byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + ((var2[var1] - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		if ((var12 == 0) || ((var8 = (var5 >> 1) + (((var10 - var4) + var12) / var12)) > var9))
			var8 = var9;

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + ((var2[var4 >> 8] - var1) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		var11.anInt1297 = var4;
		return var5 >> 1;
	}

	static int method714(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, final int var10, int var11, final Class104_Sub8_Sub3 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = (var4 + var11) - var3) > var10)
			var9 = var10;

		var12.anInt1293 += var12.anInt1301 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt1303 = var5 >> 2;
		var12.anInt1289 = var6 >> 2;
		var12.anInt1297 = var3 << 8;
		return var4 >> 1;
	}

	static int method715(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			final int var7, int var8, final Class104_Sub8_Sub3 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = (var3 + var2) - (var8 - 1)) > var7)
			var6 = var7;

		var9.anInt1303 += var9.anInt1302 * (var6 - var3);
		var9.anInt1289 += var9.anInt1295 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.anInt1293 = var4 >> 2;
		var9.anInt1297 = var2 << 8;
		return var3;
	}

	static int method716(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, final int var10, int var11, final Class104_Sub8_Sub3 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = (var4 + var3) - (var11 - 1)) > var10)
			var9 = var10;

		var12.anInt1293 += var12.anInt1301 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt1303 = var5 >> 2;
		var12.anInt1289 = var6 >> 2;
		var12.anInt1297 = var3 << 8;
		return var4 >> 1;
	}

	public synchronized void method717(final int var1) {
		method722(var1 << 6, method695());
	}

	static int method718(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			int var7, final int var8, final int var9, int var10, final int var11, final int var12,
			final Class104_Sub8_Sub3 var13, final int var14, final int var15) {
		var13.anInt1293 -= var13.anInt1301 * var5;
		if ((var14 == 0) || ((var10 = var5 + ((((var12 + 256) - var4) + var14) / var14)) > var11))
			var10 = var11;

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			final byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + ((var2[var1] - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		if ((var14 == 0) || ((var10 = (var5 >> 1) + (((var12 - var4) + var14) / var14)) > var11))
			var10 = var11;

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + ((var2[var4 >> 8] - var1) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt1293 += var13.anInt1301 * var5;
		var13.anInt1303 = var6;
		var13.anInt1289 = var7;
		var13.anInt1297 = var4;
		return var5;
	}

	int method719(final int[] var1, int var2, final int var3, final int var4, final int var5) {
		while (true) {
			if (anInt1300 > 0) {
				int var6 = var2 + anInt1300;
				if (var6 > var4)
					var6 = var4;

				anInt1300 += var2;
				if ((anInt1290 == 256) && ((anInt1297 & 255) == 0)) {
					if (Class99.aBool773)
						var2 = method714(0, ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297,
								var2, anInt1303, anInt1289, anInt1302, anInt1295, 0, var6, var3, this);
					else
						var2 = method720(((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297,
								var2, anInt1293, anInt1301, 0, var6, var3, this);
				} else if (Class99.aBool773)
					var2 = method710(0, 0, ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297,
							var2, anInt1303, anInt1289, anInt1302, anInt1295, 0, var6, var3, this, anInt1290, var5);
				else
					var2 = method721(0, 0, ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297,
							var2, anInt1293, anInt1301, 0, var6, var3, this, anInt1290, var5);

				anInt1300 -= var2;
				if (anInt1300 != 0)
					return var2;

				if (!method693())
					continue;

				return var4;
			}

			if ((anInt1290 == 256) && ((anInt1297 & 255) == 0)) {
				if (Class99.aBool773)
					return method707(0, ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297, var2,
							anInt1303, anInt1289, 0, var4, var3, this);

				return method706(((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297, var2,
						anInt1293, 0, var4, var3, this);
			}

			if (Class99.aBool773)
				return method711(0, 0, ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297, var2,
						anInt1303, anInt1289, 0, var4, var3, this, anInt1290, var5);

			return method701(0, 0, ((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288, var1, anInt1297, var2,
					anInt1293, 0, var4, var3, this, anInt1290, var5);
		}
	}

	static int method720(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			final int var7, int var8, final Class104_Sub8_Sub3 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = (var3 + var8) - var2) > var7)
			var6 = var7;

		var9.anInt1303 += var9.anInt1302 * (var6 - var3);
		var9.anInt1289 += var9.anInt1295 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.anInt1293 = var4 >> 2;
		var9.anInt1297 = var2 << 8;
		return var3;
	}

	static int method721(final int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			final int var7, int var8, final int var9, final int var10, final Class104_Sub8_Sub3 var11, final int var12,
			final int var13) {
		var11.anInt1303 -= var11.anInt1302 * var5;
		var11.anInt1289 -= var11.anInt1295 * var5;
		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 257) / var12)) > var9))
			var8 = var9;

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var2[var1 + 1] - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
			var4 += var12;
		}

		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 1) / var12)) > var9))
			var8 = var9;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var1 - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
		}

		var11.anInt1303 += var11.anInt1302 * var5;
		var11.anInt1289 += var11.anInt1295 * var5;
		var11.anInt1293 = var6;
		var11.anInt1297 = var4;
		return var5;
	}

	synchronized void method722(final int var1, final int var2) {
		anInt1291 = var1;
		anInt1292 = var2;
		anInt1300 = 0;
		method691();
	}

	static int method723(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, final int var8, int var9, final Class104_Sub8_Sub3 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = (var4 + var3) - (var9 - 1)) > var8)
			var7 = var8;

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt1297 = var3 << 8;
		return var4 >> 1;
	}

	synchronized void method724(final int var1) {
		method722(var1, method695());
	}

	static int method725(final int var0, final int var1) {
		return var1 < 0 ? -var0 : (int) ((var0 * Math.sqrt(var1 * 1.220703125E-4D)) + 0.5D);
	}

	static int method726(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			final int var7, int var8, final int var9, final int var10, final Class104_Sub8_Sub3 var11, final int var12,
			final int var13) {
		var11.anInt1303 -= var11.anInt1302 * var5;
		var11.anInt1289 -= var11.anInt1295 * var5;
		if ((var12 == 0) || ((var8 = var5 + ((((var10 + 256) - var4) + var12) / var12)) > var9))
			var8 = var9;

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			final byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var2[var1] - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
			var4 += var12;
		}

		if ((var12 == 0) || ((var8 = var5 + (((var10 - var4) + var12) / var12)) > var9))
			var8 = var9;

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += (((var0 << 8) + ((var2[var4 >> 8] - var0) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
		}

		var11.anInt1303 += var11.anInt1302 * var5;
		var11.anInt1289 += var11.anInt1295 * var5;
		var11.anInt1293 = var6;
		var11.anInt1297 = var4;
		return var5;
	}

	@Override
	public synchronized void method516(int var1) {
		if (anInt1300 > 0)
			if (var1 >= anInt1300) {
				if (anInt1291 == Integer.MIN_VALUE) {
					anInt1291 = 0;
					anInt1289 = 0;
					anInt1303 = 0;
					anInt1293 = 0;
					method470();
					var1 = anInt1300;
				}

				anInt1300 = 0;
				method691();
			} else {
				anInt1293 += anInt1301 * var1;
				anInt1303 += anInt1302 * var1;
				anInt1289 += anInt1295 * var1;
				anInt1300 -= var1;
			}

		final Class104_Sub4_Sub1 var2 = (Class104_Sub4_Sub1) aClass104_Sub4_953;
		final int var3 = anInt1299 << 8;
		final int var4 = anInt1298 << 8;
		final int var5 = var2.aByteArray1288.length << 8;
		final int var6 = var4 - var3;
		if (var6 <= 0)
			anInt1296 = 0;

		if (anInt1297 < 0) {
			if (anInt1290 <= 0) {
				method698();
				method470();
				return;
			}

			anInt1297 = 0;
		}

		if (anInt1297 >= var5) {
			if (anInt1290 >= 0) {
				method698();
				method470();
				return;
			}

			anInt1297 = var5 - 1;
		}

		anInt1297 += anInt1290 * var1;
		if (anInt1296 < 0) {
			if (!aBool1294) {
				if (anInt1290 < 0) {
					if (anInt1297 >= var3)
						return;

					anInt1297 = var4 - 1 - ((var4 - 1 - anInt1297) % var6);
				} else {
					if (anInt1297 < var4)
						return;

					anInt1297 = var3 + ((anInt1297 - var3) % var6);
				}

			} else {
				if (anInt1290 < 0) {
					if (anInt1297 >= var3)
						return;

					anInt1297 = (var3 + var3) - 1 - anInt1297;
					anInt1290 = -anInt1290;
				}

				while (anInt1297 >= var4) {
					anInt1297 = (var4 + var4) - 1 - anInt1297;
					anInt1290 = -anInt1290;
					if (anInt1297 >= var3)
						return;

					anInt1297 = (var3 + var3) - 1 - anInt1297;
					anInt1290 = -anInt1290;
				}

			}
		} else {
			if (anInt1296 > 0)
				if (aBool1294)
					label119: {
						if (anInt1290 < 0) {
							if (anInt1297 >= var3)
								return;

							anInt1297 = (var3 + var3) - 1 - anInt1297;
							anInt1290 = -anInt1290;
							if (--anInt1296 == 0)
								break label119;
						}

						do {
							if (anInt1297 < var4)
								return;

							anInt1297 = (var4 + var4) - 1 - anInt1297;
							anInt1290 = -anInt1290;
							if (--anInt1296 == 0)
								break;

							if (anInt1297 >= var3)
								return;

							anInt1297 = (var3 + var3) - 1 - anInt1297;
							anInt1290 = -anInt1290;
						} while (--anInt1296 != 0);
					}
				else
					label151: {
						int var7;
						if (anInt1290 < 0) {
							if (anInt1297 >= var3)
								return;

							var7 = (var4 - 1 - anInt1297) / var6;
							if (var7 >= anInt1296) {
								anInt1297 += var6 * anInt1296;
								anInt1296 = 0;
								break label151;
							}

							anInt1297 += var6 * var7;
							anInt1296 -= var7;
						} else {
							if (anInt1297 < var4)
								return;

							var7 = (anInt1297 - var3) / var6;
							if (var7 >= anInt1296) {
								anInt1297 -= var6 * anInt1296;
								anInt1296 = 0;
								break label151;
							}

							anInt1297 -= var6 * var7;
							anInt1296 -= var7;
						}

						return;
					}

			if (anInt1290 < 0) {
				if (anInt1297 < 0) {
					anInt1297 = -1;
					method698();
					method470();
				}
			} else if (anInt1297 >= var5) {
				anInt1297 = var5;
				method698();
				method470();
			}

		}
	}

	public static Class104_Sub8_Sub3 method727(final Class104_Sub4_Sub1 var0, final int var1, final int var2) {
		return (var0.aByteArray1288 != null) && (var0.aByteArray1288.length != 0) ? new Class104_Sub8_Sub3(var0,
				(int) ((var0.anInt1284 * 256L * var1) / (Class99.anInt777 * 100)), var2 << 6) : null;
	}

	static int method728(final int var0, final int var1) {
		return var1 < 0 ? var0 : (int) ((var0 * Math.sqrt((16384 - var1) * 1.220703125E-4D)) + 0.5D);
	}

	public boolean method729() {
		return (anInt1297 < 0) || (anInt1297 >= (((Class104_Sub4_Sub1) aClass104_Sub4_953).aByteArray1288.length << 8));
	}
}
