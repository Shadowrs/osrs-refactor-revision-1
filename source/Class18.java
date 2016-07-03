public final class Class18 {
	static int[] anIntArray188 = new int[6];
	static int[] anIntArray189 = new int[6];
	static int[] anIntArray190 = new int[6];
	static int[] anIntArray191 = new int[6];
	static int[] anIntArray192 = new int[6];
	static int[][] anIntArrayArray193 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 },
			{ 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 },
			{ 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
	static int[][] anIntArrayArray185 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 },
			{ 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 },
			{ 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 },
			{ 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 },
			{ 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 },
			{ 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 },
			{ 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 },
			{ 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };
	boolean aBool183 = true;
	int anInt178;
	int anInt173;
	int anInt174;
	int anInt186;
	int[] anIntArray179;
	int[] anIntArray194;
	int[] anIntArray175;
	int[] anIntArray176;
	int[] anIntArray187;
	int[] anIntArray180;
	int[] anIntArray181;
	int[] anIntArray177;
	int[] anIntArray184;
	int[] anIntArray182;

	Class18(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11, final int var12,
			final int var13, final int var14, final int var15, final int var16, final int var17, final int var18,
			final int var19) {
		if ((var6 != var7) || (var6 != var8) || (var6 != var9))
			aBool183 = false;

		anInt178 = var1;
		anInt173 = var2;
		anInt174 = var18;
		anInt186 = var19;
		final short var20 = 128;
		final int var21 = var20 / 2;
		final int var22 = var20 / 4;
		final int var23 = (var20 * 3) / 4;
		final int[] var24 = anIntArrayArray193[var1];
		final int var25 = var24.length;
		anIntArray179 = new int[var25];
		anIntArray194 = new int[var25];
		anIntArray175 = new int[var25];
		final int[] var26 = new int[var25];
		final int[] var27 = new int[var25];
		final int var28 = var4 * var20;
		final int var29 = var5 * var20;

		int var31;
		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		for (int var30 = 0; var30 < var25; ++var30) {
			var31 = var24[var30];
			if (((var31 & 1) == 0) && (var31 <= 8))
				var31 = ((var31 - var2 - var2 - 1) & 7) + 1;

			if ((var31 > 8) && (var31 <= 12))
				var31 = ((var31 - 9 - var2) & 3) + 9;

			if ((var31 > 12) && (var31 <= 16))
				var31 = ((var31 - 13 - var2) & 3) + 13;

			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = var6;
				var35 = var10;
				var36 = var14;
			} else if (var31 == 2) {
				var32 = var28 + var21;
				var33 = var29;
				var34 = (var6 + var7) >> 1;
				var35 = (var10 + var11) >> 1;
				var36 = (var14 + var15) >> 1;
			} else if (var31 == 3) {
				var32 = var28 + var20;
				var33 = var29;
				var34 = var7;
				var35 = var11;
				var36 = var15;
			} else if (var31 == 4) {
				var32 = var28 + var20;
				var33 = var29 + var21;
				var34 = (var7 + var8) >> 1;
				var35 = (var11 + var12) >> 1;
				var36 = (var15 + var16) >> 1;
			} else if (var31 == 5) {
				var32 = var28 + var20;
				var33 = var29 + var20;
				var34 = var8;
				var35 = var12;
				var36 = var16;
			} else if (var31 == 6) {
				var32 = var28 + var21;
				var33 = var29 + var20;
				var34 = (var8 + var9) >> 1;
				var35 = (var12 + var13) >> 1;
				var36 = (var16 + var17) >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var29 + var20;
				var34 = var9;
				var35 = var13;
				var36 = var17;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var29 + var21;
				var34 = (var9 + var6) >> 1;
				var35 = (var13 + var10) >> 1;
				var36 = (var17 + var14) >> 1;
			} else if (var31 == 9) {
				var32 = var28 + var21;
				var33 = var29 + var22;
				var34 = (var6 + var7) >> 1;
				var35 = (var10 + var11) >> 1;
				var36 = (var14 + var15) >> 1;
			} else if (var31 == 10) {
				var32 = var28 + var23;
				var33 = var29 + var21;
				var34 = (var7 + var8) >> 1;
				var35 = (var11 + var12) >> 1;
				var36 = (var15 + var16) >> 1;
			} else if (var31 == 11) {
				var32 = var28 + var21;
				var33 = var29 + var23;
				var34 = (var8 + var9) >> 1;
				var35 = (var12 + var13) >> 1;
				var36 = (var16 + var17) >> 1;
			} else if (var31 == 12) {
				var32 = var28 + var22;
				var33 = var29 + var21;
				var34 = (var9 + var6) >> 1;
				var35 = (var13 + var10) >> 1;
				var36 = (var17 + var14) >> 1;
			} else if (var31 == 13) {
				var32 = var28 + var22;
				var33 = var29 + var22;
				var34 = var6;
				var35 = var10;
				var36 = var14;
			} else if (var31 == 14) {
				var32 = var28 + var23;
				var33 = var29 + var22;
				var34 = var7;
				var35 = var11;
				var36 = var15;
			} else if (var31 == 15) {
				var32 = var28 + var23;
				var33 = var29 + var23;
				var34 = var8;
				var35 = var12;
				var36 = var16;
			} else {
				var32 = var28 + var22;
				var33 = var29 + var23;
				var34 = var9;
				var35 = var13;
				var36 = var17;
			}

			anIntArray179[var30] = var32;
			anIntArray194[var30] = var34;
			anIntArray175[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		final int[] var37 = anIntArrayArray185[var1];
		var31 = var37.length / 4;
		anIntArray176 = new int[var31];
		anIntArray187 = new int[var31];
		anIntArray180 = new int[var31];
		anIntArray181 = new int[var31];
		anIntArray177 = new int[var31];
		anIntArray184 = new int[var31];
		if (var3 != -1)
			anIntArray182 = new int[var31];

		var32 = 0;

		for (var33 = 0; var33 < var31; ++var33) {
			var34 = var37[var32];
			var35 = var37[var32 + 1];
			var36 = var37[var32 + 2];
			int var38 = var37[var32 + 3];
			var32 += 4;
			if (var35 < 4)
				var35 = (var35 - var2) & 3;

			if (var36 < 4)
				var36 = (var36 - var2) & 3;

			if (var38 < 4)
				var38 = (var38 - var2) & 3;

			anIntArray176[var33] = var35;
			anIntArray187[var33] = var36;
			anIntArray180[var33] = var38;
			if (var34 == 0) {
				anIntArray181[var33] = var26[var35];
				anIntArray177[var33] = var26[var36];
				anIntArray184[var33] = var26[var38];
				if (anIntArray182 != null)
					anIntArray182[var33] = -1;
			} else {
				anIntArray181[var33] = var27[var35];
				anIntArray177[var33] = var27[var36];
				anIntArray184[var33] = var27[var38];
				if (anIntArray182 != null)
					anIntArray182[var33] = var3;
			}
		}

		var33 = var6;
		var34 = var7;
		if (var7 < var6)
			var33 = var7;

		if (var7 > var7)
			var34 = var7;

		if (var8 < var33)
			var33 = var8;

		if (var8 > var34)
			var34 = var8;

		if (var9 < var33)
			var33 = var9;

		if (var9 > var34)
			var34 = var9;

		var33 /= 14;
		var34 /= 14;
	}
}
