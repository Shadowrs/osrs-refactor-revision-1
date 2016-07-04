public class Class104_Sub5 extends Class104 {
	int anInt902;
	int anInt924;
	int anInt930;
	int anInt931;
	boolean aBool906;
	byte[][] aByteArrayArray928;
	static byte[] aByteArray907;
	static int anInt908;
	static int anInt909;
	int anInt920;
	float[] aFloatArray919;
	byte[] aByteArray914;
	int anInt933;
	int anInt934;
	static float[] aFloatArray903;
	int anInt921;
	boolean aBool905;
	static boolean aBool918 = false;
	static int anInt904;
	static int anInt911;
	static Class98[] aClass98Array912;
	static Class62[] aClass62Array913;
	static Class68[] aClass68Array922;
	static Class55[] aClass55Array915;
	static boolean[] aBoolArray916;
	static int[] anIntArray917;
	static float[] aFloatArray923;
	static float[] aFloatArray925;
	static float[] aFloatArray926;
	static int[] anIntArray910;
	static float[] aFloatArray927;
	static float[] aFloatArray932;
	static float[] aFloatArray929;
	static int[] anIntArray901;

	void method498(final byte[] var1) {
		final RSBuf var2 = new RSBuf(var1);
		anInt902 = var2.readLEInt();
		anInt924 = var2.readLEInt();
		anInt930 = var2.readLEInt();
		anInt931 = var2.readLEInt();
		if (anInt931 < 0) {
			anInt931 = ~anInt931;
			aBool906 = true;
		}

		final int var3 = var2.readLEInt();
		aByteArrayArray928 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.readUByte();
				var5 += var6;
			} while (var6 >= 255);

			final byte[] var7 = new byte[var5];
			var2.readBytes(var7, 0, var5);
			aByteArrayArray928[var4] = var7;
		}

	}

	static void method499(final byte[] var0, final int var1) {
		aByteArray907 = var0;
		anInt908 = var1;
		anInt909 = 0;
	}

	Class104_Sub4_Sub1 method500(final int[] var1) {
		if ((var1 != null) && (var1[0] <= 0))
			return null;
		else {
			if (aByteArray914 == null) {
				anInt920 = 0;
				aFloatArray919 = new float[anInt911];
				aByteArray914 = new byte[anInt924];
				anInt933 = 0;
				anInt934 = 0;
			}

			for (; anInt934 < aByteArrayArray928.length; ++anInt934) {
				if ((var1 != null) && (var1[0] <= 0))
					return null;

				final float[] var2 = method502(anInt934);
				if (var2 != null) {
					int var3 = anInt933;
					int var4 = var2.length;
					if (var4 > (anInt924 - var3))
						var4 = anInt924 - var3;

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int) (128.0F + (var2[var5] * 128.0F));
						if ((var6 & -256) != 0)
							var6 = ~var6 >> 31;

						aByteArray914[var3++] = (byte) (var6 - 128);
					}

					if (var1 != null)
						var1[0] -= var3 - anInt933;

					anInt933 = var3;
				}
			}

			aFloatArray919 = null;
			final byte[] var7 = aByteArray914;
			aByteArray914 = null;
			return new Class104_Sub4_Sub1(anInt902, var7, anInt930, anInt931, aBool906);
		}
	}

	static float method501(final int var0) {
		int var1 = var0 & 2097151;
		final int var2 = var0 & Integer.MIN_VALUE;
		final int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0)
			var1 = -var1;

		return (float) (var1 * Math.pow(2.0D, var3 - 788));
	}

	float[] method502(final int var1) {
		method499(aByteArrayArray928[var1], 0);
		method506();
		final int var2 = method507(Class25.method129(anIntArray917.length - 1, (byte) 112));
		final boolean var3 = aBoolArray916[var2];
		final int var4 = var3 ? anInt911 : anInt904;
		boolean var5 = false;
		boolean var6 = false;
		if (var3) {
			var5 = method506() != 0;
			var6 = method506() != 0;
		}

		final int var7 = var4 >> 1;
		int var8;
		int var9;
		int var10;
		if (var3 && !var5) {
			var8 = (var4 >> 2) - (anInt904 >> 2);
			var9 = (var4 >> 2) + (anInt904 >> 2);
			var10 = anInt904 >> 1;
		} else {
			var8 = 0;
			var9 = var7;
			var10 = var4 >> 1;
		}

		int var11;
		int var12;
		int var13;
		if (var3 && !var6) {
			var11 = var4 - (var4 >> 2) - (anInt904 >> 2);
			var12 = (var4 - (var4 >> 2)) + (anInt904 >> 2);
			var13 = anInt904 >> 1;
		} else {
			var11 = var7;
			var12 = var4;
			var13 = var4 >> 1;
		}

		final Class55 var14 = aClass55Array915[anIntArray917[var2]];
		final int var15 = var14.anInt451;
		int var16 = var14.anIntArray453[var15];
		final boolean var17 = !aClass62Array913[var16].method286();
		final boolean var45 = var17;

		for (var16 = 0; var16 < var14.anInt450; ++var16) {
			final Class68 var18 = aClass68Array922[var14.anIntArray452[var16]];
			final float[] var19 = aFloatArray903;
			var18.method320(var19, var4 >> 1, var45);
		}

		int var20;
		if (!var17) {
			var16 = var14.anInt451;
			var20 = var14.anIntArray453[var16];
			aClass62Array913[var20].method287(aFloatArray903, var4 >> 1);
		}

		int var21;
		if (var17)
			for (var16 = var4 >> 1; var16 < var4; ++var16)
				aFloatArray903[var16] = 0.0F;
		else {
			var16 = var4 >> 1;
			var20 = var4 >> 2;
			var21 = var4 >> 3;
			final float[] var22 = aFloatArray903;

			int var23;
			for (var23 = 0; var23 < var16; ++var23)
				var22[var23] *= 0.5F;

			for (var23 = var16; var23 < var4; ++var23)
				var22[var23] = -var22[var4 - var23 - 1];

			final float[] var24 = var3 ? aFloatArray927 : aFloatArray923;
			final float[] var25 = var3 ? aFloatArray932 : aFloatArray925;
			final float[] var26 = var3 ? aFloatArray929 : aFloatArray926;
			final int[] var27 = var3 ? anIntArray901 : anIntArray910;

			int var28;
			float var29;
			float var30;
			float var31;
			float var32;
			for (var28 = 0; var28 < var20; ++var28) {
				var29 = var22[4 * var28] - var22[var4 - (4 * var28) - 1];
				var30 = var22[(4 * var28) + 2] - var22[var4 - (4 * var28) - 3];
				var31 = var24[2 * var28];
				var32 = var24[(2 * var28) + 1];
				var22[var4 - (4 * var28) - 1] = (var29 * var31) - (var30 * var32);
				var22[var4 - (4 * var28) - 3] = (var29 * var32) + (var30 * var31);
			}

			float var33;
			float var34;
			for (var28 = 0; var28 < var21; ++var28) {
				var29 = var22[var16 + 3 + (4 * var28)];
				var30 = var22[var16 + 1 + (4 * var28)];
				var31 = var22[(4 * var28) + 3];
				var32 = var22[(4 * var28) + 1];
				var22[var16 + 3 + (4 * var28)] = var29 + var31;
				var22[var16 + 1 + (4 * var28)] = var30 + var32;
				var33 = var24[var16 - 4 - (4 * var28)];
				var34 = var24[var16 - 3 - (4 * var28)];
				var22[(4 * var28) + 3] = ((var29 - var31) * var33) - ((var30 - var32) * var34);
				var22[(4 * var28) + 1] = ((var30 - var32) * var33) + ((var29 - var31) * var34);
			}

			var28 = Class25.method129(var4 - 1, (byte) 30);

			int var47;
			int var48;
			int var49;
			int var50;
			for (var47 = 0; var47 < (var28 - 3); ++var47) {
				var48 = var4 >> (var47 + 2);
				var49 = 8 << var47;

				for (var50 = 0; var50 < (2 << var47); ++var50) {
					final int var51 = var4 - (var48 * 2 * var50);
					final int var52 = var4 - (var48 * ((2 * var50) + 1));

					for (int var35 = 0; var35 < (var4 >> (var47 + 4)); ++var35) {
						final int var36 = 4 * var35;
						final float var37 = var22[var51 - 1 - var36];
						final float var38 = var22[var51 - 3 - var36];
						final float var39 = var22[var52 - 1 - var36];
						final float var40 = var22[var52 - 3 - var36];
						var22[var51 - 1 - var36] = var37 + var39;
						var22[var51 - 3 - var36] = var38 + var40;
						final float var41 = var24[var35 * var49];
						final float var42 = var24[(var35 * var49) + 1];
						var22[var52 - 1 - var36] = ((var37 - var39) * var41) - ((var38 - var40) * var42);
						var22[var52 - 3 - var36] = ((var38 - var40) * var41) + ((var37 - var39) * var42);
					}
				}
			}

			for (var47 = 1; var47 < (var21 - 1); ++var47) {
				var48 = var27[var47];
				if (var47 < var48) {
					var49 = 8 * var47;
					var50 = 8 * var48;
					var33 = var22[var49 + 1];
					var22[var49 + 1] = var22[var50 + 1];
					var22[var50 + 1] = var33;
					var33 = var22[var49 + 3];
					var22[var49 + 3] = var22[var50 + 3];
					var22[var50 + 3] = var33;
					var33 = var22[var49 + 5];
					var22[var49 + 5] = var22[var50 + 5];
					var22[var50 + 5] = var33;
					var33 = var22[var49 + 7];
					var22[var49 + 7] = var22[var50 + 7];
					var22[var50 + 7] = var33;
				}
			}

			for (var47 = 0; var47 < var16; ++var47)
				var22[var47] = var22[(2 * var47) + 1];

			for (var47 = 0; var47 < var21; ++var47) {
				var22[var4 - 1 - (2 * var47)] = var22[4 * var47];
				var22[var4 - 2 - (2 * var47)] = var22[(4 * var47) + 1];
				var22[var4 - var20 - 1 - (2 * var47)] = var22[(4 * var47) + 2];
				var22[var4 - var20 - 2 - (2 * var47)] = var22[(4 * var47) + 3];
			}

			for (var47 = 0; var47 < var21; ++var47) {
				var30 = var26[2 * var47];
				var31 = var26[(2 * var47) + 1];
				var32 = var22[var16 + (2 * var47)];
				var33 = var22[var16 + (2 * var47) + 1];
				var34 = var22[var4 - 2 - (2 * var47)];
				final float var53 = var22[var4 - 1 - (2 * var47)];
				float var54 = (var31 * (var32 - var34)) + (var30 * (var33 + var53));
				var22[var16 + (2 * var47)] = (var32 + var34 + var54) * 0.5F;
				var22[var4 - 2 - (2 * var47)] = ((var32 + var34) - var54) * 0.5F;
				var54 = (var31 * (var33 + var53)) - (var30 * (var32 - var34));
				var22[var16 + (2 * var47) + 1] = ((var33 - var53) + var54) * 0.5F;
				var22[var4 - 1 - (2 * var47)] = (-var33 + var53 + var54) * 0.5F;
			}

			for (var47 = 0; var47 < var20; ++var47) {
				var22[var47] = (var22[(2 * var47) + var16] * var25[2 * var47])
						+ (var22[(2 * var47) + 1 + var16] * var25[(2 * var47) + 1]);
				var22[var16 - 1 - var47] = (var22[(2 * var47) + var16] * var25[(2 * var47) + 1])
						- (var22[(2 * var47) + 1 + var16] * var25[2 * var47]);
			}

			for (var47 = 0; var47 < var20; ++var47)
				var22[(var4 - var20) + var47] = -var22[var47];

			for (var47 = 0; var47 < var20; ++var47)
				var22[var47] = var22[var20 + var47];

			for (var47 = 0; var47 < var20; ++var47)
				var22[var20 + var47] = -var22[var20 - var47 - 1];

			for (var47 = 0; var47 < var20; ++var47)
				var22[var16 + var47] = var22[var4 - var47 - 1];

			for (var47 = var8; var47 < var9; ++var47) {
				var30 = (float) Math.sin((((var47 - var8) + 0.5D) / var10) * 0.5D * 3.141592653589793D);
				aFloatArray903[var47] *= (float) Math.sin(1.5707963267948966D * var30 * var30);
			}

			for (var47 = var11; var47 < var12; ++var47) {
				var30 = (float) Math
						.sin(((((var47 - var11) + 0.5D) / var13) * 0.5D * 3.141592653589793D) + 1.5707963267948966D);
				aFloatArray903[var47] *= (float) Math.sin(1.5707963267948966D * var30 * var30);
			}
		}

		float[] var43 = null;
		if (anInt920 > 0) {
			var20 = (anInt920 + var4) >> 2;
			var43 = new float[var20];
			int var44;
			if (!aBool905)
				for (var21 = 0; var21 < anInt921; ++var21) {
					var44 = (anInt920 >> 1) + var21;
					var43[var21] += aFloatArray919[var44];
				}

			if (!var17)
				for (var21 = var8; var21 < (var4 >> 1); ++var21) {
					var44 = (var43.length - (var4 >> 1)) + var21;
					var43[var44] += aFloatArray903[var21];
				}
		}

		final float[] var46 = aFloatArray919;
		aFloatArray919 = aFloatArray903;
		aFloatArray903 = var46;
		anInt920 = var4;
		anInt921 = var12 - (var4 >> 1);
		aBool905 = var17;
		return var43;
	}

	static boolean method503(final Class61 var0) {
		if (!aBool918) {
			final byte[] var1 = var0.decompress(0, 0);
			if (var1 == null)
				return false;

			method505(var1);
			aBool918 = true;
		}

		return true;
	}

	static Class104_Sub5 method504(final Class61 var0, final int var1, final int var2) {
		if (!method503(var0)) {
			var0.method260(var1, var2);
			return null;
		} else {
			final byte[] var3 = var0.decompress(var1, var2);
			return var3 == null ? null : new Class104_Sub5(var3);
		}
	}

	static void method505(final byte[] var0) {
		method499(var0, 0);
		anInt904 = 1 << method507(4);
		anInt911 = 1 << method507(4);
		aFloatArray903 = new float[anInt911];

		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		for (var1 = 0; var1 < 2; ++var1) {
			var2 = var1 != 0 ? anInt911 : anInt904;
			var3 = var2 >> 1;
			var4 = var2 >> 2;
			var5 = var2 >> 3;
			final float[] var6 = new float[var3];

			for (int var7 = 0; var7 < var4; ++var7) {
				var6[2 * var7] = (float) Math.cos((4 * var7 * 3.141592653589793D) / var2);
				var6[(2 * var7) + 1] = -((float) Math.sin((4 * var7 * 3.141592653589793D) / var2));
			}

			final float[] var8 = new float[var3];

			for (int var9 = 0; var9 < var4; ++var9) {
				var8[2 * var9] = (float) Math.cos((((2 * var9) + 1) * 3.141592653589793D) / (2 * var2));
				var8[(2 * var9) + 1] = (float) Math.sin((((2 * var9) + 1) * 3.141592653589793D) / (2 * var2));
			}

			final float[] var10 = new float[var4];

			for (int var11 = 0; var11 < var5; ++var11) {
				var10[2 * var11] = (float) Math.cos((((4 * var11) + 2) * 3.141592653589793D) / var2);
				var10[(2 * var11) + 1] = -((float) Math.sin((((4 * var11) + 2) * 3.141592653589793D) / var2));
			}

			final int[] var12 = new int[var5];
			final int var13 = Class25.method129(var5 - 1, (byte) 48);

			for (int var14 = 0; var14 < var5; ++var14) {
				int var17 = var14;
				int var18 = var13;

				int var19;
				for (var19 = 0; var18 > 0; --var18) {
					var19 = (var19 << 1) | (var17 & 1);
					var17 >>>= 1;
				}

				var12[var14] = var19;
			}

			if (var1 != 0) {
				aFloatArray927 = var6;
				aFloatArray932 = var8;
				aFloatArray929 = var10;
				anIntArray901 = var12;
			} else {
				aFloatArray923 = var6;
				aFloatArray925 = var8;
				aFloatArray926 = var10;
				anIntArray910 = var12;
			}
		}

		var1 = method507(8) + 1;
		aClass98Array912 = new Class98[var1];

		for (var2 = 0; var2 < var1; ++var2)
			aClass98Array912[var2] = new Class98();

		var2 = method507(6) + 1;

		for (var3 = 0; var3 < var2; ++var3)
			method507(16);

		var2 = method507(6) + 1;
		aClass62Array913 = new Class62[var2];

		for (var3 = 0; var3 < var2; ++var3)
			aClass62Array913[var3] = new Class62();

		var3 = method507(6) + 1;
		aClass68Array922 = new Class68[var3];

		for (var4 = 0; var4 < var3; ++var4)
			aClass68Array922[var4] = new Class68();

		var4 = method507(6) + 1;
		aClass55Array915 = new Class55[var4];

		for (var5 = 0; var5 < var4; ++var5)
			aClass55Array915[var5] = new Class55();

		var5 = method507(6) + 1;
		aBoolArray916 = new boolean[var5];
		anIntArray917 = new int[var5];

		for (int var21 = 0; var21 < var5; ++var21) {
			aBoolArray916[var21] = method506() != 0;
			method507(16);
			method507(16);
			anIntArray917[var21] = method507(8);
		}

	}

	static int method506() {
		final int var0 = (aByteArray907[anInt908] >> anInt909) & 1;
		++anInt909;
		anInt908 += anInt909 >> 3;
		anInt909 &= 7;
		return var0;
	}

	Class104_Sub5(final byte[] var1) {
		method498(var1);
	}

	static int method507(int var0) {
		int var1 = 0;

		int var2;
		int var3;
		for (var2 = 0; var0 >= (8 - anInt909); var0 -= var3) {
			var3 = 8 - anInt909;
			final int var4 = (1 << var3) - 1;
			var1 += ((aByteArray907[anInt908] >> anInt909) & var4) << var2;
			anInt909 = 0;
			++anInt908;
			var2 += var3;
		}

		if (var0 > 0) {
			var3 = (1 << var0) - 1;
			var1 += ((aByteArray907[anInt908] >> anInt909) & var3) << var2;
			anInt909 += var0;
		}

		return var1;
	}
}
