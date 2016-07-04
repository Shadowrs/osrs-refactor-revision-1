public class Class104_Sub11 extends Class104 {
	static Class104_Sub18_Sub17_Sub1[] aClass104_Sub18_Sub17_Sub1Array969;
	Class104_Sub4_Sub1[] aClass104_Sub4_Sub1Array963 = new Class104_Sub4_Sub1[128];
	short[] aShortArray968 = new short[128];
	byte[] aByteArray962 = new byte[128];
	byte[] aByteArray965 = new byte[128];
	Class81[] aClass81Array966 = new Class81[128];
	byte[] aByteArray967 = new byte[128];
	int[] anIntArray964 = new int[128];
	int anInt961;

	Class104_Sub11(final byte[] var1) {
		final RSBuf var2 = new RSBuf(var1);

		int var3;
		for (var3 = 0; var2.aByteArray1174[var3 + var2.pos] != 0; ++var3)
			;

		final byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5)
			var4[var5] = var2.method565();

		++var2.pos;
		++var3;
		var5 = var2.pos;
		var2.pos += var3;

		int var6;
		for (var6 = 0; var2.aByteArray1174[var6 + var2.pos] != 0; ++var6)
			;

		final byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8)
			var7[var8] = var2.method565();

		++var2.pos;
		++var6;
		var8 = var2.pos;
		var2.pos += var6;

		int var9;
		for (var9 = 0; var2.aByteArray1174[var2.pos + var9] != 0; ++var9)
			;

		final byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11)
			var10[var11] = var2.method565();

		++var2.pos;
		++var9;
		final byte[] var12 = new byte[var9];
		int var14;
		int var15;
		if (var9 > 1) {
			var12[1] = 1;
			int var13 = 1;
			var14 = 2;

			for (var15 = 2; var15 < var9; ++var15) {
				int var16 = var2.method570();
				if (var16 == 0)
					var13 = var14++;
				else {
					if (var16 <= var13)
						--var16;

					var13 = var16;
				}

				var12[var15] = (byte) var13;
			}
		} else
			var14 = var9;

		final Class81[] var17 = new Class81[var14];

		Class81 var18;
		for (var15 = 0; var15 < var17.length; ++var15) {
			var18 = var17[var15] = new Class81();
			int var19 = var2.method570();
			if (var19 > 0)
				var18.aByteArray639 = new byte[var19 * 2];

			var19 = var2.method570();
			if (var19 > 0) {
				var18.aByteArray635 = new byte[2 + (2 * var19)];
				var18.aByteArray635[1] = 64;
			}
		}

		var15 = var2.method570();
		final byte[] var44 = var15 > 0 ? new byte[var15 * 2] : null;
		var15 = var2.method570();
		final byte[] var20 = var15 > 0 ? new byte[2 * var15] : null;

		int var21;
		for (var21 = 0; var2.aByteArray1174[var2.pos + var21] != 0; ++var21)
			;

		final byte[] var22 = new byte[var21];

		int var23;
		for (var23 = 0; var23 < var21; ++var23)
			var22[var23] = var2.method565();

		++var2.pos;
		++var21;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			var23 += var2.method570();
			aShortArray968[var24] = (short) var23;
		}

		var23 = 0;

		for (var24 = 0; var24 < 128; ++var24) {
			var23 += var2.method570();
			aShortArray968[var24] = (short) (aShortArray968[var24] + (var23 << 8));
		}

		var24 = 0;
		int var25 = 0;
		int var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var24 == 0) {
				if (var25 < var22.length)
					var24 = var22[var25++];
				else
					var24 = -1;

				var26 = var2.method580();
			}

			aShortArray968[var27] = (short) (aShortArray968[var27] + (((var26 - 1) & 2) << 14));
			anIntArray964[var27] = var26;
			--var24;
		}

		var24 = 0;
		var25 = 0;
		var27 = 0;

		int var28;
		for (var28 = 0; var28 < 128; ++var28)
			if (anIntArray964[var28] != 0) {
				if (var24 == 0) {
					if (var25 < var4.length)
						var24 = var4[var25++];
					else
						var24 = -1;

					var27 = var2.aByteArray1174[var5++] - 1;
				}

				aByteArray967[var28] = (byte) var27;
				--var24;
			}

		var24 = 0;
		var25 = 0;
		var28 = 0;

		for (int var29 = 0; var29 < 128; ++var29)
			if (anIntArray964[var29] != 0) {
				if (var24 == 0) {
					if (var25 < var7.length)
						var24 = var7[var25++];
					else
						var24 = -1;

					var28 = (var2.aByteArray1174[var8++] + 16) << 2;
				}

				aByteArray965[var29] = (byte) var28;
				--var24;
			}

		var24 = 0;
		var25 = 0;
		Class81 var30 = null;

		int var31;
		for (var31 = 0; var31 < 128; ++var31)
			if (anIntArray964[var31] != 0) {
				if (var24 == 0) {
					var30 = var17[var12[var25]];
					if (var25 < var10.length)
						var24 = var10[var25++];
					else
						var24 = -1;
				}

				aClass81Array966[var31] = var30;
				--var24;
			}

		var24 = 0;
		var25 = 0;
		var31 = 0;

		int var32;
		for (var32 = 0; var32 < 128; ++var32) {
			if (var24 == 0) {
				if (var25 < var22.length)
					var24 = var22[var25++];
				else
					var24 = -1;

				if (anIntArray964[var32] > 0)
					var31 = var2.method570() + 1;
			}

			aByteArray962[var32] = (byte) var31;
			--var24;
		}

		anInt961 = var2.method570() + 1;

		Class81 var33;
		int var34;
		for (var32 = 0; var32 < var14; ++var32) {
			var33 = var17[var32];
			if (var33.aByteArray639 != null)
				for (var34 = 1; var34 < var33.aByteArray639.length; var34 += 2)
					var33.aByteArray639[var34] = var2.method565();

			if (var33.aByteArray635 != null)
				for (var34 = 3; var34 < (var33.aByteArray635.length - 2); var34 += 2)
					var33.aByteArray635[var34] = var2.method565();
		}

		if (var44 != null)
			for (var32 = 1; var32 < var44.length; var32 += 2)
				var44[var32] = var2.method565();

		if (null != var20)
			for (var32 = 1; var32 < var20.length; var32 += 2)
				var20[var32] = var2.method565();

		for (var32 = 0; var32 < var14; ++var32) {
			var33 = var17[var32];
			if (var33.aByteArray635 != null) {
				var23 = 0;

				for (var34 = 2; var34 < var33.aByteArray635.length; var34 += 2) {
					var23 = 1 + var23 + var2.method570();
					var33.aByteArray635[var34] = (byte) var23;
				}
			}
		}

		for (var32 = 0; var32 < var14; ++var32) {
			var33 = var17[var32];
			if (var33.aByteArray639 != null) {
				var23 = 0;

				for (var34 = 2; var34 < var33.aByteArray639.length; var34 += 2) {
					var23 = var23 + 1 + var2.method570();
					var33.aByteArray639[var34] = (byte) var23;
				}
			}
		}

		byte var36;
		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		int var47;
		byte var48;
		if (null != var44) {
			var23 = var2.method570();
			var44[0] = (byte) var23;

			for (var32 = 2; var32 < var44.length; var32 += 2) {
				var23 = 1 + var23 + var2.method570();
				var44[var32] = (byte) var23;
			}

			var48 = var44[0];
			byte var35 = var44[1];

			for (var34 = 0; var34 < var48; ++var34)
				aByteArray962[var34] = (byte) (((aByteArray962[var34] * var35) + 32) >> 6);

			for (var34 = 2; var34 < var44.length; var34 += 2) {
				var36 = var44[var34];
				final byte var37 = var44[1 + var34];
				var38 = ((var36 - var48) / 2) + (var35 * (var36 - var48));

				for (var39 = var48; var39 < var36; ++var39) {
					var40 = var36 - var48;
					var41 = var38 >>> 31;
					var42 = ((var41 + var38) / var40) - var41;
					aByteArray962[var39] = (byte) (((var42 * aByteArray962[var39]) + 32) >> 6);
					var38 += var37 - var35;
				}

				var48 = var36;
				var35 = var37;
			}

			for (var47 = var48; var47 < 128; ++var47)
				aByteArray962[var47] = (byte) ((32 + (var35 * aByteArray962[var47])) >> 6);

			var18 = null;
		}

		if (null != var20) {
			var23 = var2.method570();
			var20[0] = (byte) var23;

			for (var32 = 2; var32 < var20.length; var32 += 2) {
				var23 = var23 + 1 + var2.method570();
				var20[var32] = (byte) var23;
			}

			var48 = var20[0];
			int var46 = var20[1] << 1;

			for (var34 = 0; var34 < var48; ++var34) {
				var47 = var46 + (aByteArray965[var34] & 255);
				if (var47 < 0)
					var47 = 0;

				if (var47 > 128)
					var47 = 128;

				aByteArray965[var34] = (byte) var47;
			}

			int var49;
			for (var34 = 2; var34 < var20.length; var34 += 2) {
				var36 = var20[var34];
				var49 = var20[1 + var34] << 1;
				var38 = ((var36 - var48) / 2) + (var46 * (var36 - var48));

				for (var39 = var48; var39 < var36; ++var39) {
					var40 = var36 - var48;
					var41 = var38 >>> 31;
					var42 = ((var41 + var38) / var40) - var41;
					int var43 = var42 + (aByteArray965[var39] & 255);
					if (var43 < 0)
						var43 = 0;

					if (var43 > 128)
						var43 = 128;

					aByteArray965[var39] = (byte) var43;
					var38 += var49 - var46;
				}

				var48 = var36;
				var46 = var49;
			}

			for (var47 = var48; var47 < 128; ++var47) {
				var49 = var46 + (aByteArray965[var47] & 255);
				if (var49 < 0)
					var49 = 0;

				if (var49 > 128)
					var49 = 128;

				aByteArray965[var47] = (byte) var49;
			}
		}

		for (var32 = 0; var32 < var14; ++var32)
			var17[var32].anInt636 = var2.method570();

		for (var32 = 0; var32 < var14; ++var32) {
			var33 = var17[var32];
			if (var33.aByteArray639 != null)
				var33.anInt637 = var2.method570();

			if (null != var33.aByteArray635)
				var33.anInt638 = var2.method570();

			if (var33.anInt636 > 0)
				var33.anInt642 = var2.method570();
		}

		for (var32 = 0; var32 < var14; ++var32)
			var17[var32].anInt641 = var2.method570();

		for (var32 = 0; var32 < var14; ++var32) {
			var33 = var17[var32];
			if (var33.anInt641 > 0)
				var33.anInt640 = var2.method570();
		}

		for (var32 = 0; var32 < var14; ++var32) {
			var33 = var17[var32];
			if (var33.anInt640 > 0)
				var33.anInt634 = var2.method570();
		}

	}

	void method523() {
		anIntArray964 = null;
	}

	boolean method524(final Class53 var1, final byte[] var2, final int[] var3) {
		boolean var4 = true;
		int var5 = 0;
		Class104_Sub4_Sub1 var6 = null;

		for (int var7 = 0; var7 < 128; ++var7)
			if ((null == var2) || (var2[var7] != 0)) {
				int var8 = anIntArray964[var7];
				if (var8 != 0) {
					if (var8 != var5) {
						var5 = var8--;
						if ((var8 & 1) == 0)
							var6 = var1.method232(var8 >> 2, var3);
						else
							var6 = var1.method233(var8 >> 2, var3);

						if (var6 == null)
							var4 = false;
					}

					if (var6 != null) {
						aClass104_Sub4_Sub1Array963[var7] = var6;
						anIntArray964[var7] = 0;
					}
				}
			}

		return var4;
	}

	public static String method525(final CharSequence[] var0, final int var1, final int var2) {
		if (var2 == 0)
			return "";
		else if (var2 == 1) {
			final CharSequence var3 = var0[var1];
			return null == var3 ? "null" : var3.toString();
		} else {
			final int var4 = var2 + var1;
			int var5 = 0;

			for (int var6 = var1; var6 < var4; ++var6) {
				final CharSequence var7 = var0[var6];
				if (null == var7)
					var5 += 4;
				else
					var5 += var7.length();
			}

			final StringBuilder var8 = new StringBuilder(var5);

			for (int var9 = var1; var9 < var4; ++var9) {
				final CharSequence var10 = var0[var9];
				if (null == var10)
					var8.append("null");
				else
					var8.append(var10);
			}

			return var8.toString();
		}
	}

	static final int method526(final int var0, final int var1) {
		int var2 = (var1 * 57) + var0;
		var2 ^= var2 << 13;
		final int var3 = ((var2 * ((15731 * var2 * var2) + 789221)) + 1376312589) & Integer.MAX_VALUE;
		return (var3 >> 19) & 255;
	}
}
