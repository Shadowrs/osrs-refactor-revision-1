public class Class104_Sub8_Sub1 extends Class104_Sub8 {
	boolean aBool1215;
	long aLong1218;
	int anInt1216;
	int anInt1194;
	long aLong1219;
	int anInt1203 = 256;
	int anInt1204 = 1000000;
	int[] anIntArray1205 = new int[16];
	int[] anIntArray1196 = new int[16];
	int[] anIntArray1206 = new int[16];
	int[] anIntArray1195 = new int[16];
	int[] anIntArray1200 = new int[16];
	int[] anIntArray1198 = new int[16];
	int[] anIntArray1202 = new int[16];
	int[] anIntArray1201 = new int[16];
	int[] anIntArray1197 = new int[16];
	int[] anIntArray1211 = new int[16];
	int[] anIntArray1207 = new int[16];
	int[] anIntArray1208 = new int[16];
	int[] anIntArray1209 = new int[16];
	int[] anIntArray1210 = new int[16];
	int[] anIntArray1217 = new int[16];
	Class104_Sub15[][] aClass104_Sub15ArrayArray1212 = new Class104_Sub15[16][128];
	Class104_Sub15[][] aClass104_Sub15ArrayArray1213 = new Class104_Sub15[16][128];
	Class83 aClass83_1214 = new Class83();
	Class104_Sub8_Sub4 aClass104_Sub8_Sub4_1220 = new Class104_Sub8_Sub4(this);
	Class58 aClass58_1199 = new Class58(128);

	synchronized boolean method635(final Class104_Sub14 var1, final Class61 var2, final Class53 var3, final int var4) {
		var1.method545();
		boolean var5 = true;
		final int[] var10 = new int[] { var4 };

		for (Class104_Sub22 var7 = (Class104_Sub22) var1.aClass58_1100
				.method245(); null != var7; var7 = (Class104_Sub22) var1.aClass58_1100.method243()) {
			final int var8 = (int) var7.nodeId;
			Class104_Sub11 var9 = (Class104_Sub11) aClass58_1199.method241(var8);
			if (null == var9) {
				var9 = Class76.method345(var2, var8);
				if (var9 == null) {
					var5 = false;
					continue;
				}

				aClass58_1199.method242(var9, var8);
			}

			if (!var9.method524(var3, var7.aByteArray1176, var10))
				var5 = false;
		}

		if (var5)
			var1.method546();

		return var5;
	}

	synchronized void method636(final Class104_Sub14 var1, final boolean var2) {
		method665();
		aClass83_1214.method360(var1.aByteArray1101);
		aBool1215 = var2;
		aLong1218 = 0L;
		final int var3 = aClass83_1214.method362();

		for (int var4 = 0; var4 < var3; ++var4) {
			aClass83_1214.method363(var4);
			aClass83_1214.method366(var4);
			aClass83_1214.method364(var4);
		}

		anInt1216 = aClass83_1214.method374();
		anInt1194 = aClass83_1214.anIntArray648[anInt1216];
		aLong1219 = aClass83_1214.method369(anInt1194);
	}

	synchronized boolean method637() {
		return aClass83_1214.method361();
	}

	public synchronized void method638(final int var1, final int var2) {
		method651(var1, var2);
	}

	void method639(final int var1) {
		if ((anIntArray1211[var1] & 2) != 0)
			for (Class104_Sub15 var2 = (Class104_Sub15) aClass104_Sub8_Sub4_1220.aClass59_1321
					.method251(); null != var2; var2 = (Class104_Sub15) aClass104_Sub8_Sub4_1220.aClass59_1321
							.method252())
				if ((var2.anInt1117 == var1) && (aClass104_Sub15ArrayArray1212[var1][var2.anInt1107] == null)
						&& (var2.anInt1102 < 0))
					var2.anInt1102 = 0;

	}

	int method640(final Class104_Sub15 var1) {
		int var2 = var1.anInt1110 + ((var1.anInt1112 * var1.anInt1111) >> 12);
		var2 += (anIntArray1208[var1.anInt1117] * (anIntArray1202[var1.anInt1117] - 8192)) >> 12;
		final Class81 var3 = var1.aClass81_1114;
		int var4;
		if ((var3.anInt641 > 0) && ((var3.anInt640 > 0) || (anIntArray1201[var1.anInt1117] > 0))) {
			var4 = var3.anInt640 << 2;
			final int var5 = var3.anInt634 << 1;
			if (var1.anInt1118 < var5)
				var4 = (var4 * var1.anInt1118) / var5;

			var4 += anIntArray1201[var1.anInt1117] >> 7;
			final double var6 = Math.sin(0.01227184630308513D * (var1.anInt1119 & 511));
			var2 += (int) (var4 * var6);
		}

		var4 = (int) (((var1.aClass104_Sub4_Sub1_1116.anInt1284 * 256 * Math.pow(2.0D, var2 * 3.255208333333333E-4D))
				/ Class99.anInt777) + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	void method641(final Class104_Sub15 var1, final boolean var2) {
		int var3 = var1.aClass104_Sub4_Sub1_1116.aByteArray1288.length;
		int var5;
		if (var2 && var1.aClass104_Sub4_Sub1_1116.aBool1285) {
			final int var4 = (var3 + var3) - var1.aClass104_Sub4_Sub1_1116.anInt1286;
			var5 = (int) (((long) var4 * (long) anIntArray1209[var1.anInt1117]) >> 6);
			var3 <<= 8;
			if (var5 >= var3) {
				var5 = (var3 + var3) - 1 - var5;
				var1.aClass104_Sub8_Sub3_1120.method712(true);
			}
		} else
			var5 = (int) (((long) anIntArray1209[var1.anInt1117] * (long) var3) >> 6);

		var1.aClass104_Sub8_Sub3_1120.method696(var5);
	}

	synchronized void method642(final int var1) {
		anInt1203 = var1;
	}

	void method643() {
	}

	void method644(final int var1, final int var2) {
		anIntArray1202[var1] = var2;
	}

	void method645(int var1) {
		if (var1 >= 0) {
			anIntArray1205[var1] = 12800;
			anIntArray1196[var1] = 8192;
			anIntArray1206[var1] = 16383;
			anIntArray1202[var1] = 8192;
			anIntArray1201[var1] = 0;
			anIntArray1197[var1] = 8192;
			method639(var1);
			method648(var1);
			anIntArray1211[var1] = 0;
			anIntArray1207[var1] = 32767;
			anIntArray1208[var1] = 256;
			anIntArray1209[var1] = 0;
			method650(var1, 8192);
		} else
			for (var1 = 0; var1 < 16; ++var1)
				method645(var1);
	}

	void method646(final int var1) {
		for (Class104_Sub15 var2 = (Class104_Sub15) aClass104_Sub8_Sub4_1220.aClass59_1321
				.method251(); null != var2; var2 = (Class104_Sub15) aClass104_Sub8_Sub4_1220.aClass59_1321.method252())
			if (((var1 < 0) || (var1 == var2.anInt1117)) && (var2.anInt1102 < 0)) {
				aClass104_Sub15ArrayArray1212[var2.anInt1117][var2.anInt1107] = null;
				var2.anInt1102 = 0;
			}

	}

	void method647() {
		method663(-1);
		method645(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1)
			anIntArray1200[var1] = anIntArray1195[var1];

		for (var1 = 0; var1 < 16; ++var1)
			anIntArray1198[var1] = anIntArray1195[var1] & -128;

	}

	void method648(final int var1) {
		if ((anIntArray1211[var1] & 4) != 0)
			for (Class104_Sub15 var2 = (Class104_Sub15) aClass104_Sub8_Sub4_1220.aClass59_1321
					.method251(); null != var2; var2 = (Class104_Sub15) aClass104_Sub8_Sub4_1220.aClass59_1321
							.method252())
				if (var2.anInt1117 == var1)
					var2.anInt1122 = 0;

	}

	void method649(final int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			method661(var3, var4);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			if (var5 > 0)
				method655(var3, var4, var5);
			else
				method661(var3, var4);

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			method643();
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			var5 = (var1 >> 16) & 127;
			if (var4 == 0)
				anIntArray1198[var3] = (anIntArray1198[var3] & -2080769) + (var5 << 14);

			if (var4 == 32)
				anIntArray1198[var3] = (anIntArray1198[var3] & -16257) + (var5 << 7);

			if (var4 == 1)
				anIntArray1201[var3] = (var5 << 7) + (anIntArray1201[var3] & -16257);

			if (var4 == 33)
				anIntArray1201[var3] = var5 + (anIntArray1201[var3] & -128);

			if (var4 == 5)
				anIntArray1197[var3] = (var5 << 7) + (anIntArray1197[var3] & -16257);

			if (var4 == 37)
				anIntArray1197[var3] = (anIntArray1197[var3] & -128) + var5;

			if (var4 == 7)
				anIntArray1205[var3] = (var5 << 7) + (anIntArray1205[var3] & -16257);

			if (var4 == 39)
				anIntArray1205[var3] = var5 + (anIntArray1205[var3] & -128);

			if (var4 == 10)
				anIntArray1196[var3] = (anIntArray1196[var3] & -16257) + (var5 << 7);

			if (var4 == 42)
				anIntArray1196[var3] = var5 + (anIntArray1196[var3] & -128);

			if (var4 == 11)
				anIntArray1206[var3] = (anIntArray1206[var3] & -16257) + (var5 << 7);

			if (var4 == 43)
				anIntArray1206[var3] = var5 + (anIntArray1206[var3] & -128);

			if (var4 == 64)
				if (var5 >= 64)
					anIntArray1211[var3] |= 1;
				else
					anIntArray1211[var3] &= -2;

			if (var4 == 65)
				if (var5 >= 64)
					anIntArray1211[var3] |= 2;
				else {
					method639(var3);
					anIntArray1211[var3] &= -3;
				}

			if (var4 == 99)
				anIntArray1207[var3] = (anIntArray1207[var3] & 127) + (var5 << 7);

			if (var4 == 98)
				anIntArray1207[var3] = var5 + (anIntArray1207[var3] & 16256);

			if (var4 == 101)
				anIntArray1207[var3] = 16384 + (anIntArray1207[var3] & 127) + (var5 << 7);

			if (var4 == 100)
				anIntArray1207[var3] = var5 + 16384 + (anIntArray1207[var3] & 16256);

			if (var4 == 120)
				method663(var3);

			if (var4 == 121)
				method645(var3);

			if (var4 == 123)
				method646(var3);

			int var6;
			if (var4 == 6) {
				var6 = anIntArray1207[var3];
				if (var6 == 16384)
					anIntArray1208[var3] = (anIntArray1208[var3] & -16257) + (var5 << 7);
			}

			if (var4 == 38) {
				var6 = anIntArray1207[var3];
				if (var6 == 16384)
					anIntArray1208[var3] = (anIntArray1208[var3] & -128) + var5;
			}

			if (var4 == 16)
				anIntArray1209[var3] = (var5 << 7) + (anIntArray1209[var3] & -16257);

			if (var4 == 48)
				anIntArray1209[var3] = (anIntArray1209[var3] & -128) + var5;

			if (var4 == 81)
				if (var5 >= 64)
					anIntArray1211[var3] |= 4;
				else {
					method648(var3);
					anIntArray1211[var3] &= -5;
				}

			if (var4 == 17)
				method650(var3, (var5 << 7) + (anIntArray1210[var3] & -16257));

			if (var4 == 49)
				method650(var3, (anIntArray1210[var3] & -128) + var5);

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			method656(var3, anIntArray1198[var3] + var4);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = (var1 >> 8) & 127;
			method657();
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = ((var1 >> 8) & 127) + ((var1 >> 9) & 16256);
			method644(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255)
				method647();
		}
	}

	void method650(final int var1, final int var2) {
		anIntArray1210[var1] = var2;
		anIntArray1217[var1] = (int) ((2097152.0D * Math.pow(2.0D, var2 * 5.4931640625E-4D)) + 0.5D);
	}

	void method651(final int var1, final int var2) {
		anIntArray1195[var1] = var2;
		anIntArray1198[var1] = var2 & -128;
		method656(var1, var2);
	}

	synchronized void method652() {
		for (Class104_Sub11 var1 = (Class104_Sub11) aClass58_1199
				.method245(); null != var1; var1 = (Class104_Sub11) aClass58_1199.method243())
			var1.method523();

	}

	@Override
	synchronized Class104_Sub8 method513() {
		return null;
	}

	@Override
	synchronized void method515(final int[] var1, int var2, int var3) {
		if (aClass83_1214.method361()) {
			final int var4 = (anInt1204 * aClass83_1214.anInt656) / Class99.anInt777;

			do {
				final long var5 = ((long) var4 * (long) var3) + aLong1218;
				if ((aLong1219 - var5) >= 0L) {
					aLong1218 = var5;
					break;
				}

				final int var7 = (int) (((var4 + (aLong1219 - aLong1218)) - 1L) / var4);
				aLong1218 += (long) var7 * (long) var4;
				aClass104_Sub8_Sub4_1220.method515(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				method653();
			} while (aClass83_1214.method361());
		}

		aClass104_Sub8_Sub4_1220.method515(var1, var2, var3);
	}

	@Override
	synchronized void method516(int var1) {
		if (aClass83_1214.method361()) {
			final int var2 = (aClass83_1214.anInt656 * anInt1204) / Class99.anInt777;

			do {
				final long var3 = aLong1218 + ((long) var2 * (long) var1);
				if ((aLong1219 - var3) >= 0L) {
					aLong1218 = var3;
					break;
				}

				final int var5 = (int) ((((aLong1219 - aLong1218) + var2) - 1L) / var2);
				aLong1218 += (long) var5 * (long) var2;
				aClass104_Sub8_Sub4_1220.method516(var5);
				var1 -= var5;
				method653();
			} while (aClass83_1214.method361());
		}

		aClass104_Sub8_Sub4_1220.method516(var1);
	}

	void method653() {
		int var1 = anInt1216;
		int var2 = anInt1194;

		long var3;
		for (var3 = aLong1219; anInt1194 == var2; var3 = aClass83_1214.method369(var2)) {
			while (var2 == aClass83_1214.anIntArray648[var1]) {
				aClass83_1214.method363(var1);
				final int var5 = aClass83_1214.method372(var1);
				if (var5 == 1) {
					aClass83_1214.method365();
					aClass83_1214.method364(var1);
					if (aClass83_1214.method371()) {
						if (!aBool1215 || (var2 == 0)) {
							method647();
							aClass83_1214.method370();
							return;
						}

						aClass83_1214.method373(var3);
					}
					break;
				}

				if ((var5 & 128) != 0)
					method649(var5);

				aClass83_1214.method366(var1);
				aClass83_1214.method364(var1);
			}

			var1 = aClass83_1214.method374();
			var2 = aClass83_1214.anIntArray648[var1];
		}

		anInt1216 = var1;
		anInt1194 = var2;
		aLong1219 = var3;
	}

	boolean method654(final Class104_Sub15 var1) {
		if (var1.aClass104_Sub8_Sub3_1120 == null) {
			if (var1.anInt1102 >= 0) {
				var1.method470();
				if ((var1.anInt1106 > 0) && (var1 == aClass104_Sub15ArrayArray1213[var1.anInt1117][var1.anInt1106]))
					aClass104_Sub15ArrayArray1213[var1.anInt1117][var1.anInt1106] = null;
			}

			return true;
		} else
			return false;
	}

	void method655(final int var1, final int var2, final int var3) {
		method661(var1, var2);
		if ((anIntArray1211[var1] & 2) != 0)
			for (Class104_Sub15 var4 = (Class104_Sub15) aClass104_Sub8_Sub4_1220.aClass59_1321
					.method254(); var4 != null; var4 = (Class104_Sub15) aClass104_Sub8_Sub4_1220.aClass59_1321
							.method253())
				if ((var1 == var4.anInt1117) && (var4.anInt1102 < 0)) {
					aClass104_Sub15ArrayArray1212[var1][var4.anInt1107] = null;
					aClass104_Sub15ArrayArray1212[var1][var2] = var4;
					final int var5 = ((var4.anInt1111 * var4.anInt1112) >> 12) + var4.anInt1110;
					var4.anInt1110 += (var2 - var4.anInt1107) << 8;
					var4.anInt1111 = var5 - var4.anInt1110;
					var4.anInt1112 = 4096;
					var4.anInt1107 = var2;
					return;
				}

		final Class104_Sub11 var9 = (Class104_Sub11) aClass58_1199.method241(anIntArray1200[var1]);
		if (var9 != null) {
			final Class104_Sub4_Sub1 var6 = var9.aClass104_Sub4_Sub1Array963[var2];
			if (var6 != null) {
				final Class104_Sub15 var7 = new Class104_Sub15();
				var7.anInt1117 = var1;
				var7.aClass104_Sub11_1103 = var9;
				var7.aClass104_Sub4_Sub1_1116 = var6;
				var7.aClass81_1114 = var9.aClass81Array966[var2];
				var7.anInt1106 = var9.aByteArray967[var2];
				var7.anInt1107 = var2;
				var7.anInt1108 = ((var3 * var3 * var9.anInt961 * var9.aByteArray962[var2]) + 1024) >> 11;
				var7.anInt1104 = var9.aByteArray965[var2] & 255;
				var7.anInt1110 = (var2 << 8) - (var9.aShortArray968[var2] & 32767);
				var7.anInt1113 = 0;
				var7.anInt1109 = 0;
				var7.anInt1115 = 0;
				var7.anInt1102 = -1;
				var7.anInt1105 = 0;
				if (anIntArray1209[var1] == 0)
					var7.aClass104_Sub8_Sub3_1120 = Class104_Sub8_Sub3.method690(var6, method640(var7), method658(var7),
							method659(var7));
				else {
					var7.aClass104_Sub8_Sub3_1120 = Class104_Sub8_Sub3.method690(var6, method640(var7), 0,
							method659(var7));
					method641(var7, var9.aShortArray968[var2] < 0);
				}

				if (var9.aShortArray968[var2] < 0)
					var7.aClass104_Sub8_Sub3_1120.method692(-1);

				if (var7.anInt1106 >= 0) {
					final Class104_Sub15 var8 = aClass104_Sub15ArrayArray1213[var1][var7.anInt1106];
					if ((null != var8) && (var8.anInt1102 < 0)) {
						aClass104_Sub15ArrayArray1212[var1][var8.anInt1107] = null;
						var8.anInt1102 = 0;
					}

					aClass104_Sub15ArrayArray1213[var1][var7.anInt1106] = var7;
				}

				aClass104_Sub8_Sub4_1220.aClass59_1321.method248(var7);
				aClass104_Sub15ArrayArray1212[var1][var2] = var7;
			}
		}
	}

	void method656(final int var1, final int var2) {
		if (anIntArray1200[var1] != var2) {
			anIntArray1200[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3)
				aClass104_Sub15ArrayArray1213[var1][var3] = null;
		}

	}

	void method657() {
	}

	public Class104_Sub8_Sub1() {
		method647();
	}

	int method658(final Class104_Sub15 var1) {
		final Class81 var2 = var1.aClass81_1114;
		int var3 = ((anIntArray1205[var1.anInt1117] * anIntArray1206[var1.anInt1117]) + 4096) >> 13;
		var3 = (16384 + (var3 * var3)) >> 15;
		var3 = (16384 + (var1.anInt1108 * var3)) >> 15;
		var3 = (128 + (anInt1203 * var3)) >> 8;
		if (var2.anInt636 > 0)
			var3 = (int) ((var3 * Math.pow(0.5D, (double) var2.anInt636 * (double) var1.anInt1113 * 1.953125E-5D))
					+ 0.5D);

		int var4;
		int var5;
		int var6;
		int var7;
		if (null != var2.aByteArray639) {
			var4 = var1.anInt1109;
			var5 = var2.aByteArray639[1 + var1.anInt1115];
			if (var1.anInt1115 < (var2.aByteArray639.length - 2)) {
				var6 = (var2.aByteArray639[var1.anInt1115] & 255) << 8;
				var7 = (var2.aByteArray639[2 + var1.anInt1115] & 255) << 8;
				var5 += ((var2.aByteArray639[var1.anInt1115 + 3] - var5) * (var4 - var6)) / (var7 - var6);
			}

			var3 = ((var5 * var3) + 32) >> 6;
		}

		if ((var1.anInt1102 > 0) && (null != var2.aByteArray635)) {
			var4 = var1.anInt1102;
			var5 = var2.aByteArray635[var1.anInt1105 + 1];
			if (var1.anInt1105 < (var2.aByteArray635.length - 2)) {
				var6 = (var2.aByteArray635[var1.anInt1105] & 255) << 8;
				var7 = (var2.aByteArray635[var1.anInt1105 + 2] & 255) << 8;
				var5 += ((var4 - var6) * (var2.aByteArray635[var1.anInt1105 + 3] - var5)) / (var7 - var6);
			}

			var3 = (32 + (var3 * var5)) >> 6;
		}

		return var3;
	}

	int method659(final Class104_Sub15 var1) {
		final int var2 = anIntArray1196[var1.anInt1117];
		return var2 < 8192 ? ((var1.anInt1104 * var2) + 32) >> 6
				: 16384 - ((32 + ((16384 - var2) * (128 - var1.anInt1104))) >> 6);
	}

	int method660() {
		return anInt1203;
	}

	void method661(final int var1, final int var2) {
		final Class104_Sub15 var3 = aClass104_Sub15ArrayArray1212[var1][var2];
		if (null != var3) {
			aClass104_Sub15ArrayArray1212[var1][var2] = null;
			if ((anIntArray1211[var1] & 2) != 0) {
				for (Class104_Sub15 var4 = (Class104_Sub15) aClass104_Sub8_Sub4_1220.aClass59_1321
						.method251(); null != var4; var4 = (Class104_Sub15) aClass104_Sub8_Sub4_1220.aClass59_1321
								.method252())
					if ((var4.anInt1117 == var3.anInt1117) && (var4.anInt1102 < 0) && (var3 != var4)) {
						var3.anInt1102 = 0;
						break;
					}
			} else
				var3.anInt1102 = 0;

		}
	}

	boolean method662(final Class104_Sub15 var1, final int[] var2, final int var3, final int var4) {
		var1.anInt1121 = Class99.anInt777 / 100;
		if ((var1.anInt1102 < 0)
				|| ((var1.aClass104_Sub8_Sub3_1120 != null) && !var1.aClass104_Sub8_Sub3_1120.method729())) {
			int var5 = var1.anInt1112;
			if (var5 > 0) {
				var5 -= (int) ((16.0D * Math.pow(2.0D, 4.921259842519685E-4D * anIntArray1197[var1.anInt1117])) + 0.5D);
				if (var5 < 0)
					var5 = 0;

				var1.anInt1112 = var5;
			}

			var1.aClass104_Sub8_Sub3_1120.method702(method640(var1));
			final Class81 var6 = var1.aClass81_1114;
			boolean var7 = false;
			++var1.anInt1118;
			var1.anInt1119 += var6.anInt641;
			final double var8 = (((var1.anInt1107 - 60) << 8) + ((var1.anInt1111 * var1.anInt1112) >> 12))
					* 5.086263020833333E-6D;
			if (var6.anInt636 > 0)
				if (var6.anInt642 > 0)
					var1.anInt1113 += (int) ((128.0D * Math.pow(2.0D, var8 * var6.anInt642)) + 0.5D);
				else
					var1.anInt1113 += 128;

			if (var6.aByteArray639 != null) {
				if (var6.anInt637 > 0)
					var1.anInt1109 += (int) ((128.0D * Math.pow(2.0D, var8 * var6.anInt637)) + 0.5D);
				else
					var1.anInt1109 += 128;

				while ((var1.anInt1115 < (var6.aByteArray639.length - 2))
						&& (var1.anInt1109 > ((var6.aByteArray639[2 + var1.anInt1115] & 255) << 8)))
					var1.anInt1115 += 2;

				if ((var1.anInt1115 == (var6.aByteArray639.length - 2))
						&& (var6.aByteArray639[var1.anInt1115 + 1] == 0))
					var7 = true;
			}

			if ((var1.anInt1102 >= 0) && (null != var6.aByteArray635) && ((anIntArray1211[var1.anInt1117] & 1) == 0)
					&& ((var1.anInt1106 < 0)
							|| (aClass104_Sub15ArrayArray1213[var1.anInt1117][var1.anInt1106] != var1))) {
				if (var6.anInt638 > 0)
					var1.anInt1102 += (int) ((128.0D * Math.pow(2.0D, var6.anInt638 * var8)) + 0.5D);
				else
					var1.anInt1102 += 128;

				while ((var1.anInt1105 < (var6.aByteArray635.length - 2))
						&& (var1.anInt1102 > ((var6.aByteArray635[var1.anInt1105 + 2] & 255) << 8)))
					var1.anInt1105 += 2;

				if ((var6.aByteArray635.length - 2) == var1.anInt1105)
					var7 = true;
			}

			if (var7) {
				var1.aClass104_Sub8_Sub3_1120.method709(var1.anInt1121);
				if (null != var2)
					var1.aClass104_Sub8_Sub3_1120.method515(var2, var3, var4);
				else
					var1.aClass104_Sub8_Sub3_1120.method516(var4);

				if (var1.aClass104_Sub8_Sub3_1120.method704())
					aClass104_Sub8_Sub4_1220.aClass104_Sub8_Sub2_1320.method666(var1.aClass104_Sub8_Sub3_1120);

				var1.method548();
				if (var1.anInt1102 >= 0) {
					var1.method470();
					if ((var1.anInt1106 > 0) && (var1 == aClass104_Sub15ArrayArray1213[var1.anInt1117][var1.anInt1106]))
						aClass104_Sub15ArrayArray1213[var1.anInt1117][var1.anInt1106] = null;
				}

				return true;
			} else {
				var1.aClass104_Sub8_Sub3_1120.method700(var1.anInt1121, method658(var1), method659(var1));
				return false;
			}
		} else {
			var1.method548();
			var1.method470();
			if ((var1.anInt1106 > 0) && (var1 == aClass104_Sub15ArrayArray1213[var1.anInt1117][var1.anInt1106]))
				aClass104_Sub15ArrayArray1213[var1.anInt1117][var1.anInt1106] = null;

			return true;
		}
	}

	@Override
	synchronized int method514() {
		return 0;
	}

	void method663(final int var1) {
		for (Class104_Sub15 var2 = (Class104_Sub15) aClass104_Sub8_Sub4_1220.aClass59_1321
				.method251(); null != var2; var2 = (Class104_Sub15) aClass104_Sub8_Sub4_1220.aClass59_1321.method252())
			if ((var1 < 0) || (var2.anInt1117 == var1)) {
				if (var2.aClass104_Sub8_Sub3_1120 != null) {
					var2.aClass104_Sub8_Sub3_1120.method709(Class99.anInt777 / 100);
					if (var2.aClass104_Sub8_Sub3_1120.method704())
						aClass104_Sub8_Sub4_1220.aClass104_Sub8_Sub2_1320.method666(var2.aClass104_Sub8_Sub3_1120);

					var2.method548();
				}

				if (var2.anInt1102 < 0)
					aClass104_Sub15ArrayArray1212[var2.anInt1117][var2.anInt1107] = null;

				var2.method470();
			}

	}

	synchronized void method664() {
		for (Class104_Sub11 var1 = (Class104_Sub11) aClass58_1199
				.method245(); var1 != null; var1 = (Class104_Sub11) aClass58_1199.method243())
			var1.method470();

	}

	@Override
	synchronized Class104_Sub8 method512() {
		return aClass104_Sub8_Sub4_1220;
	}

	synchronized void method665() {
		aClass83_1214.method370();
		method647();
	}
}
