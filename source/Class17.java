public class Class17 {
	int anInt123 = 0;
	int anInt124 = 0;
	Class21[] aClass21Array153 = new Class21[5000];
	int[][] anIntArrayArray137 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	int[][] anIntArrayArray164 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
			{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
			{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
			{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	int anInt118;
	int anInt119;
	int anInt125;
	Class104_Sub20[][][] aClass104_Sub20ArrayArrayArray122;
	int[][][] anIntArrayArrayArray141;
	int[][][] anIntArrayArrayArray121;
	static int anInt169;
	static int anInt126;
	static int anInt171;
	static int anInt146;
	static int anInt167;
	static int anInt168;
	static int anInt151;
	static int anInt149;
	static int anInt142;
	static int anInt143;
	static boolean aBool145 = false;
	static int anInt133 = 0;
	static int anInt131 = 0;
	static int anInt148 = 0;
	public static int anInt117 = -1;
	public static int anInt159 = -1;
	static int anInt147;
	static int anInt130;
	static boolean[][] aBoolArrayArray163;
	static int anInt156;
	static int anInt138;
	static int anInt139;
	static int anInt135;
	static int anInt136;
	static int anInt129 = 0;
	static int anInt144;
	static int anInt154;
	static int anInt132;
	static int anInt134;
	static int anInt128 = 0;
	public static boolean aBool127 = true;
	static Class21[] aClass21Array170 = new Class21[100];
	static int anInt150 = 4;
	static int[] anIntArray165;
	static Class44[][] aClass44ArrayArray152;
	static Class44[] aClass44Array140;
	static Class59 aClass59_155;
	static int[] anIntArray120;
	static int[] anIntArray157;
	static int[] anIntArray158;
	static int[] anIntArray166;
	static int[] anIntArray160;
	static int[] anIntArray161;
	static int[] anIntArray162;
	static boolean[][][][] aBoolArrayArrayArrayArray172;

	public void method69() {
		int var1;
		int var2;
		for (var1 = 0; var1 < anInt118; ++var1)
			for (var2 = 0; var2 < anInt119; ++var2)
				for (int var3 = 0; var3 < anInt125; ++var3)
					aClass104_Sub20ArrayArrayArray122[var1][var2][var3] = null;

		for (var1 = 0; var1 < anInt150; ++var1) {
			for (var2 = 0; var2 < anIntArray165[var1]; ++var2)
				aClass44ArrayArray152[var1][var2] = null;

			anIntArray165[var1] = 0;
		}

		for (var1 = 0; var1 < anInt123; ++var1)
			aClass21Array153[var1] = null;

		anInt123 = 0;

		for (var1 = 0; var1 < aClass21Array170.length; ++var1)
			aClass21Array170[var1] = null;

	}

	public Class17(final int var1, final int var2, final int var3, final int[][][] var4) {
		anInt118 = var1;
		anInt119 = var2;
		anInt125 = var3;
		aClass104_Sub20ArrayArrayArray122 = new Class104_Sub20[var1][var2][var3];
		anIntArrayArrayArray141 = new int[var1][var2 + 1][var3 + 1];
		anIntArrayArrayArray121 = var4;
		method69();
	}

	public void method70(final int var1) {
		anInt124 = var1;

		for (int var2 = 0; var2 < anInt119; ++var2)
			for (int var3 = 0; var3 < anInt125; ++var3)
				if (aClass104_Sub20ArrayArrayArray122[var1][var2][var3] == null)
					aClass104_Sub20ArrayArrayArray122[var1][var2][var3] = new Class104_Sub20(var1, var2, var3);

	}

	public void method71(final int var1, final int var2) {
		final Class104_Sub20 var3 = aClass104_Sub20ArrayArrayArray122[0][var1][var2];

		for (int var4 = 0; var4 < 3; ++var4) {
			final Class104_Sub20 var5 = aClass104_Sub20ArrayArrayArray122[var4][var1][var2] = aClass104_Sub20ArrayArrayArray122[var4
					+ 1][var1][var2];
			if (var5 != null) {
				--var5.anInt1158;

				for (int var6 = 0; var6 < var5.anInt1163; ++var6) {
					final Class21 var7 = var5.aClass21Array1151[var6];
					if ((((var7.anInt220 >> 29) & 3) == 2) && (var7.anInt217 == var1) && (var7.anInt216 == var2))
						--var7.anInt212;
				}
			}
		}

		if (aClass104_Sub20ArrayArrayArray122[0][var1][var2] == null)
			aClass104_Sub20ArrayArrayArray122[0][var1][var2] = new Class104_Sub20(0, var1, var2);

		aClass104_Sub20ArrayArrayArray122[0][var1][var2].aClass104_Sub20_1170 = var3;
		aClass104_Sub20ArrayArrayArray122[3][var1][var2] = null;
	}

	public void method72(final int var1, final int var2, final int var3, final int var4) {
		final Class104_Sub20 var5 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		if (var5 != null)
			aClass104_Sub20ArrayArrayArray122[var1][var2][var3].anInt1162 = var4;
	}

	public void method73(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11, final int var12,
			final int var13, final int var14, final int var15, final int var16, final int var17, final int var18,
			final int var19, final int var20) {
		Class9 var21;
		int var22;
		if (var4 == 0) {
			var21 = new Class9(var11, var12, var13, var14, -1, var19, false);

			for (var22 = var1; var22 >= 0; --var22)
				if (aClass104_Sub20ArrayArrayArray122[var22][var2][var3] == null)
					aClass104_Sub20ArrayArrayArray122[var22][var2][var3] = new Class104_Sub20(var22, var2, var3);

			aClass104_Sub20ArrayArrayArray122[var1][var2][var3].aClass9_1152 = var21;
		} else if (var4 != 1) {
			final Class18 var23 = new Class18(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12,
					var13, var14, var15, var16, var17, var18, var19, var20);

			for (var22 = var1; var22 >= 0; --var22)
				if (aClass104_Sub20ArrayArrayArray122[var22][var2][var3] == null)
					aClass104_Sub20ArrayArrayArray122[var22][var2][var3] = new Class104_Sub20(var22, var2, var3);

			aClass104_Sub20ArrayArrayArray122[var1][var2][var3].aClass18_1156 = var23;
		} else {
			var21 = new Class9(var15, var16, var17, var18, var6, var20,
					(var7 == var8) && (var7 == var9) && (var7 == var10));

			for (var22 = var1; var22 >= 0; --var22)
				if (aClass104_Sub20ArrayArrayArray122[var22][var2][var3] == null)
					aClass104_Sub20ArrayArrayArray122[var22][var2][var3] = new Class104_Sub20(var22, var2, var3);

			aClass104_Sub20ArrayArrayArray122[var1][var2][var3].aClass9_1152 = var21;
		}
	}

	public void method74(final int var1, final int var2, final int var3, final int var4,
			final Class104_Sub18_Sub16 var5, final int var6, final Class104_Sub18_Sub16 var7,
			final Class104_Sub18_Sub16 var8) {
		final Class23 var9 = new Class23();
		var9.aClass104_Sub18_Sub16_232 = var5;
		var9.anInt230 = (var2 * 128) + 64;
		var9.anInt229 = (var3 * 128) + 64;
		var9.anInt231 = var4;
		var9.anInt235 = var6;
		var9.aClass104_Sub18_Sub16_233 = var7;
		var9.aClass104_Sub18_Sub16_234 = var8;
		int var10 = 0;
		final Class104_Sub20 var11 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		if (var11 != null)
			for (int var12 = 0; var12 < var11.anInt1163; ++var12)
				if (((var11.aClass21Array1151[var12].anInt218 & 256) == 256)
						&& (var11.aClass21Array1151[var12].aClass104_Sub18_Sub16_214 instanceof Class104_Sub18_Sub16_Sub4)) {
					final Class104_Sub18_Sub16_Sub4 var13 = (Class104_Sub18_Sub16_Sub4) var11.aClass21Array1151[var12].aClass104_Sub18_Sub16_214;
					var13.method812();
					if (var13.anInt1467 > var10)
						var10 = var13.anInt1467;
				}

		var9.anInt236 = var10;
		if (aClass104_Sub20ArrayArrayArray122[var1][var2][var3] == null)
			aClass104_Sub20ArrayArrayArray122[var1][var2][var3] = new Class104_Sub20(var1, var2, var3);

		aClass104_Sub20ArrayArrayArray122[var1][var2][var3].aClass23_1157 = var9;
	}

	public void method75(final int var1, final int var2, final int var3, final int var4,
			final Class104_Sub18_Sub16 var5, final Class104_Sub18_Sub16 var6, final int var7, final int var8,
			final int var9, final int var10) {
		if ((var5 != null) || (var6 != null)) {
			final Class20 var11 = new Class20();
			var11.anInt200 = var9;
			var11.anInt204 = var10;
			var11.anInt203 = (var2 * 128) + 64;
			var11.anInt198 = (var3 * 128) + 64;
			var11.anInt201 = var4;
			var11.aClass104_Sub18_Sub16_199 = var5;
			var11.aClass104_Sub18_Sub16_202 = var6;
			var11.anInt197 = var7;
			var11.anInt196 = var8;

			for (int var12 = var1; var12 >= 0; --var12)
				if (aClass104_Sub20ArrayArrayArray122[var12][var2][var3] == null)
					aClass104_Sub20ArrayArrayArray122[var12][var2][var3] = new Class104_Sub20(var12, var2, var3);

			aClass104_Sub20ArrayArrayArray122[var1][var2][var3].aClass20_1154 = var11;
		}
	}

	boolean method76(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final Class104_Sub18_Sub16 var9, final int var10, final boolean var11,
			final int var12, final int var13) {
		int var15;
		for (int var14 = var2; var14 < (var2 + var4); ++var14)
			for (var15 = var3; var15 < (var3 + var5); ++var15) {
				if ((var14 < 0) || (var15 < 0) || (var14 >= anInt119) || (var15 >= anInt125))
					return false;

				final Class104_Sub20 var16 = aClass104_Sub20ArrayArrayArray122[var1][var14][var15];
				if ((var16 != null) && (var16.anInt1163 >= 5))
					return false;
			}

		final Class21 var17 = new Class21();
		var17.anInt220 = var12;
		var17.anInt218 = var13;
		var17.anInt212 = var1;
		var17.anInt221 = var6;
		var17.anInt211 = var7;
		var17.anInt208 = var8;
		var17.aClass104_Sub18_Sub16_214 = var9;
		var17.anInt213 = var10;
		var17.anInt217 = var2;
		var17.anInt216 = var3;
		var17.anInt215 = (var2 + var4) - 1;
		var17.anInt209 = (var3 + var5) - 1;

		for (var15 = var2; var15 < (var2 + var4); ++var15)
			for (int var18 = var3; var18 < (var3 + var5); ++var18) {
				int var19 = 0;
				if (var15 > var2)
					++var19;

				if (var15 < ((var2 + var4) - 1))
					var19 += 4;

				if (var18 > var3)
					var19 += 8;

				if (var18 < ((var3 + var5) - 1))
					var19 += 2;

				for (int var20 = var1; var20 >= 0; --var20)
					if (aClass104_Sub20ArrayArrayArray122[var20][var15][var18] == null)
						aClass104_Sub20ArrayArrayArray122[var20][var15][var18] = new Class104_Sub20(var20, var15,
								var18);

				final Class104_Sub20 var21 = aClass104_Sub20ArrayArrayArray122[var1][var15][var18];
				var21.aClass21Array1151[var21.anInt1163] = var17;
				var21.anIntArray1167[var21.anInt1163] = var19;
				var21.anInt1161 |= var19;
				++var21.anInt1163;
			}

		if (var11)
			aClass21Array153[anInt123++] = var17;

		return true;
	}

	public void method77() {
		for (int var1 = 0; var1 < anInt123; ++var1) {
			final Class21 var2 = aClass21Array153[var1];
			method107(var2);
			aClass21Array153[var1] = null;
		}

		anInt123 = 0;
	}

	public void method78(final int var1, final int var2, final int var3, final int var4) {
		final Class104_Sub20 var5 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		if (var5 != null) {
			final Class33 var6 = var5.aClass33_1155;
			if (var6 != null) {
				var6.anInt334 = (var6.anInt334 * var4) / 16;
				var6.anInt332 = (var6.anInt332 * var4) / 16;
			}
		}
	}

	public void method79(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		if (var4 != null)
			var4.aClass20_1154 = null;
	}

	public void method80(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		if (var4 != null)
			var4.aClass33_1155 = null;
	}

	public void method81(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		if (var4 != null)
			for (int var5 = 0; var5 < var4.anInt1163; ++var5) {
				final Class21 var6 = var4.aClass21Array1151[var5];
				if ((((var6.anInt220 >> 29) & 3) == 2) && (var6.anInt217 == var2) && (var6.anInt216 == var3)) {
					method107(var6);
					return;
				}
			}
	}

	public void method82(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		if (var4 != null)
			var4.aClass6_1160 = null;
	}

	public boolean method83(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final Class104_Sub18_Sub16 var7, final int var8, final int var9, final int var10) {
		if (var7 == null)
			return true;
		else {
			final int var11 = (var2 * 128) + (64 * var5);
			final int var12 = (var3 * 128) + (64 * var6);
			return method76(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9, var10);
		}
	}

	public void method84(final int var1, final int var2, final int var3, final int var4,
			final Class104_Sub18_Sub16 var5, final Class104_Sub18_Sub16 var6, final int var7, final int var8,
			final int var9, final int var10, final int var11, final int var12) {
		if (var5 != null) {
			final Class33 var13 = new Class33();
			var13.anInt340 = var11;
			var13.anInt341 = var12;
			var13.anInt336 = (var2 * 128) + 64;
			var13.anInt333 = (var3 * 128) + 64;
			var13.anInt335 = var4;
			var13.aClass104_Sub18_Sub16_338 = var5;
			var13.aClass104_Sub18_Sub16_339 = var6;
			var13.anInt337 = var7;
			var13.anInt331 = var8;
			var13.anInt334 = var9;
			var13.anInt332 = var10;

			for (int var14 = var1; var14 >= 0; --var14)
				if (aClass104_Sub20ArrayArrayArray122[var14][var2][var3] == null)
					aClass104_Sub20ArrayArrayArray122[var14][var2][var3] = new Class104_Sub20(var14, var2, var3);

			aClass104_Sub20ArrayArrayArray122[var1][var2][var3].aClass33_1155 = var13;
		}
	}

	public int method85(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		return (var4 != null) && (var4.aClass20_1154 != null) ? var4.aClass20_1154.anInt200 : 0;
	}

	public int method86(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		return (var4 != null) && (var4.aClass33_1155 != null) ? var4.aClass33_1155.anInt340 : 0;
	}

	public int method87(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		if (var4 == null)
			return 0;
		else {
			for (int var5 = 0; var5 < var4.anInt1163; ++var5) {
				final Class21 var6 = var4.aClass21Array1151[var5];
				if ((((var6.anInt220 >> 29) & 3) == 2) && (var6.anInt217 == var2) && (var6.anInt216 == var3))
					return var6.anInt220;
			}

			return 0;
		}
	}

	public int method88(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		return (var4 != null) && (var4.aClass6_1160 != null) ? var4.aClass6_1160.anInt34 : 0;
	}

	public int method89(final int var1, final int var2, final int var3, final int var4) {
		final Class104_Sub20 var5 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		if (var5 == null)
			return -1;
		else if ((var5.aClass20_1154 != null) && (var5.aClass20_1154.anInt200 == var4))
			return var5.aClass20_1154.anInt204 & 255;
		else if ((var5.aClass33_1155 != null) && (var5.aClass33_1155.anInt340 == var4))
			return var5.aClass33_1155.anInt341 & 255;
		else if ((var5.aClass6_1160 != null) && (var5.aClass6_1160.anInt34 == var4))
			return var5.aClass6_1160.anInt30 & 255;
		else {
			for (int var6 = 0; var6 < var5.anInt1163; ++var6)
				if (var5.aClass21Array1151[var6].anInt220 == var4)
					return var5.aClass21Array1151[var6].anInt218 & 255;

			return -1;
		}
	}

	void method90(final Class104_Sub18_Sub16_Sub5 var1, final int var2, final int var3, final int var4) {
		Class104_Sub20 var5;
		Class104_Sub18_Sub16_Sub5 var6;
		if (var3 < anInt119) {
			var5 = aClass104_Sub20ArrayArrayArray122[var2][var3 + 1][var4];
			if ((var5 != null) && (var5.aClass6_1160 != null)
					&& (var5.aClass6_1160.aClass104_Sub18_Sub16_33 instanceof Class104_Sub18_Sub16_Sub5)) {
				var6 = (Class104_Sub18_Sub16_Sub5) var5.aClass6_1160.aClass104_Sub18_Sub16_33;
				Class104_Sub18_Sub16_Sub5.method903(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < anInt119) {
			var5 = aClass104_Sub20ArrayArrayArray122[var2][var3][var4 + 1];
			if ((var5 != null) && (var5.aClass6_1160 != null)
					&& (var5.aClass6_1160.aClass104_Sub18_Sub16_33 instanceof Class104_Sub18_Sub16_Sub5)) {
				var6 = (Class104_Sub18_Sub16_Sub5) var5.aClass6_1160.aClass104_Sub18_Sub16_33;
				Class104_Sub18_Sub16_Sub5.method903(var1, var6, 0, 0, 128, true);
			}
		}

		if ((var3 < anInt119) && (var4 < anInt125)) {
			var5 = aClass104_Sub20ArrayArrayArray122[var2][var3 + 1][var4 + 1];
			if ((var5 != null) && (var5.aClass6_1160 != null)
					&& (var5.aClass6_1160.aClass104_Sub18_Sub16_33 instanceof Class104_Sub18_Sub16_Sub5)) {
				var6 = (Class104_Sub18_Sub16_Sub5) var5.aClass6_1160.aClass104_Sub18_Sub16_33;
				Class104_Sub18_Sub16_Sub5.method903(var1, var6, 128, 0, 128, true);
			}
		}

		if ((var3 < anInt119) && (var4 > 0)) {
			var5 = aClass104_Sub20ArrayArrayArray122[var2][var3 + 1][var4 - 1];
			if ((var5 != null) && (var5.aClass6_1160 != null)
					&& (var5.aClass6_1160.aClass104_Sub18_Sub16_33 instanceof Class104_Sub18_Sub16_Sub5)) {
				var6 = (Class104_Sub18_Sub16_Sub5) var5.aClass6_1160.aClass104_Sub18_Sub16_33;
				Class104_Sub18_Sub16_Sub5.method903(var1, var6, 128, 0, -128, true);
			}
		}

	}

	void method91(final Class104_Sub18_Sub16_Sub5 var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		boolean var7 = true;
		int var8 = var3;
		final int var9 = var3 + var5;
		final int var10 = var4 - 1;
		final int var11 = var4 + var6;

		for (int var12 = var2; var12 <= (var2 + 1); ++var12)
			if (var12 != anInt118) {
				for (int var13 = var8; var13 <= var9; ++var13)
					if ((var13 >= 0) && (var13 < anInt119))
						for (int var14 = var10; var14 <= var11; ++var14)
							if ((var14 >= 0) && (var14 < anInt125) && (!var7 || (var13 >= var9) || (var14 >= var11)
									|| ((var14 < var4) && (var13 != var3)))) {
								final Class104_Sub20 var15 = aClass104_Sub20ArrayArrayArray122[var12][var13][var14];
								if (var15 != null) {
									final int var16 = ((anIntArrayArrayArray121[var12][var13][var14]
											+ anIntArrayArrayArray121[var12][var13 + 1][var14]
											+ anIntArrayArrayArray121[var12][var13][var14 + 1]
											+ anIntArrayArrayArray121[var12][var13 + 1][var14 + 1]) / 4)
											- ((anIntArrayArrayArray121[var2][var3][var4]
													+ anIntArrayArrayArray121[var2][var3 + 1][var4]
													+ anIntArrayArrayArray121[var2][var3][var4 + 1]
													+ anIntArrayArrayArray121[var2][var3 + 1][var4 + 1]) / 4);
									final Class20 var17 = var15.aClass20_1154;
									if (var17 != null) {
										Class104_Sub18_Sub16_Sub5 var18;
										if (var17.aClass104_Sub18_Sub16_199 instanceof Class104_Sub18_Sub16_Sub5) {
											var18 = (Class104_Sub18_Sub16_Sub5) var17.aClass104_Sub18_Sub16_199;
											Class104_Sub18_Sub16_Sub5.method903(var1, var18,
													((var13 - var3) * 128) + ((1 - var5) * 64), var16,
													((var14 - var4) * 128) + ((1 - var6) * 64), var7);
										}

										if (var17.aClass104_Sub18_Sub16_202 instanceof Class104_Sub18_Sub16_Sub5) {
											var18 = (Class104_Sub18_Sub16_Sub5) var17.aClass104_Sub18_Sub16_202;
											Class104_Sub18_Sub16_Sub5.method903(var1, var18,
													((var13 - var3) * 128) + ((1 - var5) * 64), var16,
													((var14 - var4) * 128) + ((1 - var6) * 64), var7);
										}
									}

									for (int var19 = 0; var19 < var15.anInt1163; ++var19) {
										final Class21 var20 = var15.aClass21Array1151[var19];
										if ((var20 != null)
												&& (var20.aClass104_Sub18_Sub16_214 instanceof Class104_Sub18_Sub16_Sub5)) {
											final Class104_Sub18_Sub16_Sub5 var21 = (Class104_Sub18_Sub16_Sub5) var20.aClass104_Sub18_Sub16_214;
											final int var22 = (var20.anInt215 - var20.anInt217) + 1;
											final int var23 = (var20.anInt209 - var20.anInt216) + 1;
											Class104_Sub18_Sub16_Sub5.method903(var1, var21,
													((var20.anInt217 - var3) * 128) + ((var22 - var5) * 64), var16,
													((var20.anInt216 - var4) * 128) + ((var23 - var6) * 64), var7);
										}
									}
								}
							}

				--var8;
				var7 = false;
			}

	}

	public void method92(final int[] var1, int var2, final int var3, final int var4, final int var5, final int var6) {
		final Class104_Sub20 var7 = aClass104_Sub20ArrayArrayArray122[var4][var5][var6];
		if (var7 != null) {
			final Class9 var8 = var7.aClass9_1152;
			int var10;
			if (var8 != null) {
				final int var9 = var8.anInt57;
				if (var9 != 0)
					for (var10 = 0; var10 < 4; ++var10) {
						var1[var2] = var9;
						var1[var2 + 1] = var9;
						var1[var2 + 2] = var9;
						var1[var2 + 3] = var9;
						var2 += var3;
					}
			} else {
				final Class18 var11 = var7.aClass18_1156;
				if (var11 != null) {
					var10 = var11.anInt178;
					final int var12 = var11.anInt173;
					final int var13 = var11.anInt174;
					final int var14 = var11.anInt186;
					final int[] var15 = anIntArrayArray137[var10];
					final int[] var16 = anIntArrayArray164[var12];
					int var17 = 0;
					int var18;
					if (var13 != 0)
						for (var18 = 0; var18 < 4; ++var18) {
							var1[var2] = var15[var16[var17++]] == 0 ? var13 : var14;
							var1[var2 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
							var1[var2 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
							var1[var2 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
							var2 += var3;
						}
					else
						for (var18 = 0; var18 < 4; ++var18) {
							if (var15[var16[var17++]] != 0)
								var1[var2] = var14;

							if (var15[var16[var17++]] != 0)
								var1[var2 + 1] = var14;

							if (var15[var16[var17++]] != 0)
								var1[var2 + 2] = var14;

							if (var15[var16[var17++]] != 0)
								var1[var2 + 3] = var14;

							var2 += var3;
						}

				}
			}
		}
	}

	public static void method93(final int[] var0, final int var1, final int var2, final int var3, final int var4) {
		anInt169 = 0;
		anInt126 = 0;
		anInt171 = var3;
		anInt146 = var4;
		anInt167 = var3 / 2;
		anInt168 = var4 / 2;
		final boolean[][][][] var5 = new boolean[9][32][53][53];

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 384; var6 += 32)
			for (var7 = 0; var7 < 2048; var7 += 64) {
				anInt151 = Class104_Sub18_Sub17_Sub4.anIntArray1680[var6];
				anInt149 = Class104_Sub18_Sub17_Sub4.anIntArray1678[var6];
				anInt142 = Class104_Sub18_Sub17_Sub4.anIntArray1680[var7];
				anInt143 = Class104_Sub18_Sub17_Sub4.anIntArray1678[var7];
				var8 = (var6 - 128) / 32;
				var9 = var7 / 64;

				for (int var10 = -26; var10 <= 26; ++var10)
					for (var11 = -26; var11 <= 26; ++var11) {
						var12 = var10 * 128;
						final int var13 = var11 * 128;
						boolean var14 = false;

						for (int var15 = -var1; var15 <= var2; var15 += 128)
							if (method94(var12, var0[var8] + var15, var13)) {
								var14 = true;
								break;
							}

						var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
					}
			}

		for (var6 = 0; var6 < 8; ++var6)
			for (var7 = 0; var7 < 32; ++var7)
				for (var8 = -25; var8 < 25; ++var8)
					for (var9 = -25; var9 < 25; ++var9) {
						boolean var16 = false;

						label76: for (var11 = -1; var11 <= 1; ++var11)
							for (var12 = -1; var12 <= 1; ++var12) {
								if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}
							}

						aBoolArrayArrayArrayArray172[var6][var7][var8 + 25][var9 + 25] = var16;
					}

	}

	static boolean method94(final int var0, final int var1, final int var2) {
		final int var3 = ((var2 * anInt142) + (var0 * anInt143)) >> 16;
		final int var4 = ((var2 * anInt143) - (var0 * anInt142)) >> 16;
		final int var5 = ((var1 * anInt151) + (var4 * anInt149)) >> 16;
		final int var6 = ((var1 * anInt149) - (var4 * anInt151)) >> 16;
		if ((var5 >= 50) && (var5 <= 3500)) {
			final int var7 = anInt167 + ((var3 << 9) / var5);
			final int var8 = anInt168 + ((var6 << 9) / var5);
			return (var7 >= anInt169) && (var7 <= anInt171) && (var8 >= anInt126) && (var8 <= anInt146);
		} else
			return false;
	}

	public void method95(final int var1, final int var2, final int var3) {
		aBool145 = true;
		anInt133 = var1;
		anInt131 = var2;
		anInt148 = var3;
		anInt117 = -1;
		anInt159 = -1;
	}

	public Class33 method96(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		return var4 == null ? null : var4.aClass33_1155;
	}

	public boolean method97(final int var1, final int var2, final int var3, final int var4, final int var5,
			final Class104_Sub18_Sub16 var6, final int var7, final int var8, final boolean var9) {
		if (var6 == null)
			return true;
		else {
			int var10 = var2 - var5;
			int var11 = var3 - var5;
			int var12 = var2 + var5;
			int var13 = var3 + var5;
			if (var9) {
				if ((var7 > 640) && (var7 < 1408))
					var13 += 128;

				if ((var7 > 1152) && (var7 < 1920))
					var12 += 128;

				if ((var7 > 1664) || (var7 < 384))
					var11 -= 128;

				if ((var7 > 128) && (var7 < 896))
					var10 -= 128;
			}

			var10 /= 128;
			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			return method76(var1, var10, var11, (var12 - var10) + 1, (var13 - var11) + 1, var2, var3, var4, var6, var7,
					true, var8, 0);
		}
	}

	void method98(final Class9 var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - anInt156;
		int var11;
		int var12 = var11 = (var8 << 7) - anInt139;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = anIntArrayArrayArray121[var2][var7][var8] - anInt138;
		int var18 = anIntArrayArrayArray121[var2][var7 + 1][var8] - anInt138;
		int var19 = anIntArrayArrayArray121[var2][var7 + 1][var8 + 1] - anInt138;
		final int var20 = anIntArrayArrayArray121[var2][var7][var8 + 1] - anInt138;
		int var21 = ((var12 * var5) + (var10 * var6)) >> 16;
		var12 = ((var12 * var6) - (var10 * var5)) >> 16;
		var10 = var21;
		var21 = ((var17 * var4) - (var12 * var3)) >> 16;
		var12 = ((var17 * var3) + (var12 * var4)) >> 16;
		var17 = var21;
		if (var12 >= 50) {
			var21 = ((var11 * var5) + (var14 * var6)) >> 16;
			var11 = ((var11 * var6) - (var14 * var5)) >> 16;
			var14 = var21;
			var21 = ((var18 * var4) - (var11 * var3)) >> 16;
			var11 = ((var18 * var3) + (var11 * var4)) >> 16;
			var18 = var21;
			if (var11 >= 50) {
				var21 = ((var16 * var5) + (var13 * var6)) >> 16;
				var16 = ((var16 * var6) - (var13 * var5)) >> 16;
				var13 = var21;
				var21 = ((var19 * var4) - (var16 * var3)) >> 16;
				var16 = ((var19 * var3) + (var16 * var4)) >> 16;
				var19 = var21;
				if (var16 >= 50) {
					var21 = ((var15 * var5) + (var9 * var6)) >> 16;
					var15 = ((var15 * var6) - (var9 * var5)) >> 16;
					var9 = var21;
					var21 = ((var20 * var4) - (var15 * var3)) >> 16;
					var15 = ((var20 * var3) + (var15 * var4)) >> 16;
					if (var15 >= 50) {
						final int var22 = Class104_Sub18_Sub17_Sub4.anInt1677 + ((var10 << 9) / var12);
						final int var23 = Class104_Sub18_Sub17_Sub4.anInt1688 + ((var17 << 9) / var12);
						final int var24 = Class104_Sub18_Sub17_Sub4.anInt1677 + ((var14 << 9) / var11);
						final int var25 = Class104_Sub18_Sub17_Sub4.anInt1688 + ((var18 << 9) / var11);
						final int var26 = Class104_Sub18_Sub17_Sub4.anInt1677 + ((var13 << 9) / var16);
						final int var27 = Class104_Sub18_Sub17_Sub4.anInt1688 + ((var19 << 9) / var16);
						final int var28 = Class104_Sub18_Sub17_Sub4.anInt1677 + ((var9 << 9) / var15);
						final int var29 = Class104_Sub18_Sub17_Sub4.anInt1688 + ((var21 << 9) / var15);
						Class104_Sub18_Sub17_Sub4.anInt1674 = 0;
						int var30;
						if ((((var26 - var28) * (var25 - var29)) - ((var27 - var29) * (var24 - var28))) > 0) {
							Class104_Sub18_Sub17_Sub4.aBool1675 = false;
							if ((var26 < 0) || (var28 < 0) || (var24 < 0)
									|| (var26 > Class104_Sub18_Sub17_Sub4.anInt1683)
									|| (var28 > Class104_Sub18_Sub17_Sub4.anInt1683)
									|| (var24 > Class104_Sub18_Sub17_Sub4.anInt1683))
								Class104_Sub18_Sub17_Sub4.aBool1675 = true;

							if (aBool145 && method100(anInt131, anInt148, var27, var29, var25, var26, var28, var24)) {
								anInt117 = var7;
								anInt159 = var8;
							}

							if (var1.anInt55 == -1) {
								if (var1.anInt51 != 12345678)
									Class104_Sub18_Sub17_Sub4.method929(var27, var29, var25, var26, var28, var24,
											var1.anInt51, var1.anInt54, var1.anInt52);
							} else if (!aBool127) {
								if (var1.aBool53)
									Class104_Sub18_Sub17_Sub4.method925(var27, var29, var25, var26, var28, var24,
											var1.anInt51, var1.anInt54, var1.anInt52, var10, var14, var9, var17, var18,
											var21, var12, var11, var15, var1.anInt55);
								else
									Class104_Sub18_Sub17_Sub4.method925(var27, var29, var25, var26, var28, var24,
											var1.anInt51, var1.anInt54, var1.anInt52, var13, var9, var14, var19, var21,
											var18, var16, var15, var11, var1.anInt55);
							} else {
								var30 = Class104_Sub18_Sub17_Sub4.anInterface2_1686.method1(var1.anInt55, -2124435160);
								Class104_Sub18_Sub17_Sub4.method929(var27, var29, var25, var26, var28, var24,
										method104(var30, var1.anInt51), method104(var30, var1.anInt54),
										method104(var30, var1.anInt52));
							}
						}

						if ((((var22 - var24) * (var29 - var25)) - ((var23 - var25) * (var28 - var24))) > 0) {
							Class104_Sub18_Sub17_Sub4.aBool1675 = false;
							if ((var22 < 0) || (var24 < 0) || (var28 < 0)
									|| (var22 > Class104_Sub18_Sub17_Sub4.anInt1683)
									|| (var24 > Class104_Sub18_Sub17_Sub4.anInt1683)
									|| (var28 > Class104_Sub18_Sub17_Sub4.anInt1683))
								Class104_Sub18_Sub17_Sub4.aBool1675 = true;

							if (aBool145 && method100(anInt131, anInt148, var23, var25, var29, var22, var24, var28)) {
								anInt117 = var7;
								anInt159 = var8;
							}

							if (var1.anInt55 == -1) {
								if (var1.anInt56 != 12345678)
									Class104_Sub18_Sub17_Sub4.method929(var23, var25, var29, var22, var24, var28,
											var1.anInt56, var1.anInt52, var1.anInt54);
							} else if (!aBool127)
								Class104_Sub18_Sub17_Sub4.method925(var23, var25, var29, var22, var24, var28,
										var1.anInt56, var1.anInt52, var1.anInt54, var10, var14, var9, var17, var18,
										var21, var12, var11, var15, var1.anInt55);
							else {
								var30 = Class104_Sub18_Sub17_Sub4.anInterface2_1686.method1(var1.anInt55, -2133777295);
								Class104_Sub18_Sub17_Sub4.method929(var23, var25, var29, var22, var24, var28,
										method104(var30, var1.anInt56), method104(var30, var1.anInt52),
										method104(var30, var1.anInt54));
							}
						}

					}
				}
			}
		}
	}

	void method99(final Class18 var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7) {
		int var8 = var1.anIntArray179.length;

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.anIntArray179[var9] - anInt156;
			var11 = var1.anIntArray194[var9] - anInt138;
			var12 = var1.anIntArray175[var9] - anInt139;
			var13 = ((var12 * var4) + (var10 * var5)) >> 16;
			var12 = ((var12 * var5) - (var10 * var4)) >> 16;
			var10 = var13;
			var13 = ((var11 * var3) - (var12 * var2)) >> 16;
			var12 = ((var11 * var2) + (var12 * var3)) >> 16;
			if (var12 < 50)
				return;

			if (var1.anIntArray182 != null) {
				Class18.anIntArray190[var9] = var10;
				Class18.anIntArray191[var9] = var13;
				Class18.anIntArray192[var9] = var12;
			}

			Class18.anIntArray188[var9] = Class104_Sub18_Sub17_Sub4.anInt1677 + ((var10 << 9) / var12);
			Class18.anIntArray189[var9] = Class104_Sub18_Sub17_Sub4.anInt1688 + ((var13 << 9) / var12);
		}

		Class104_Sub18_Sub17_Sub4.anInt1674 = 0;
		var8 = var1.anIntArray176.length;

		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.anIntArray176[var9];
			var11 = var1.anIntArray187[var9];
			var12 = var1.anIntArray180[var9];
			var13 = Class18.anIntArray188[var10];
			final int var14 = Class18.anIntArray188[var11];
			final int var15 = Class18.anIntArray188[var12];
			final int var16 = Class18.anIntArray189[var10];
			final int var17 = Class18.anIntArray189[var11];
			final int var18 = Class18.anIntArray189[var12];
			if ((((var13 - var14) * (var18 - var17)) - ((var16 - var17) * (var15 - var14))) > 0) {
				Class104_Sub18_Sub17_Sub4.aBool1675 = false;
				if ((var13 < 0) || (var14 < 0) || (var15 < 0) || (var13 > Class104_Sub18_Sub17_Sub4.anInt1683)
						|| (var14 > Class104_Sub18_Sub17_Sub4.anInt1683)
						|| (var15 > Class104_Sub18_Sub17_Sub4.anInt1683))
					Class104_Sub18_Sub17_Sub4.aBool1675 = true;

				if (aBool145 && method100(anInt131, anInt148, var16, var17, var18, var13, var14, var15)) {
					anInt117 = var6;
					anInt159 = var7;
				}

				if ((var1.anIntArray182 != null) && (var1.anIntArray182[var9] != -1)) {
					if (!aBool127) {
						if (var1.aBool183)
							Class104_Sub18_Sub17_Sub4.method925(var16, var17, var18, var13, var14, var15,
									var1.anIntArray181[var9], var1.anIntArray177[var9], var1.anIntArray184[var9],
									Class18.anIntArray190[0], Class18.anIntArray190[1], Class18.anIntArray190[3],
									Class18.anIntArray191[0], Class18.anIntArray191[1], Class18.anIntArray191[3],
									Class18.anIntArray192[0], Class18.anIntArray192[1], Class18.anIntArray192[3],
									var1.anIntArray182[var9]);
						else
							Class104_Sub18_Sub17_Sub4.method925(var16, var17, var18, var13, var14, var15,
									var1.anIntArray181[var9], var1.anIntArray177[var9], var1.anIntArray184[var9],
									Class18.anIntArray190[var10], Class18.anIntArray190[var11],
									Class18.anIntArray190[var12], Class18.anIntArray191[var10],
									Class18.anIntArray191[var11], Class18.anIntArray191[var12],
									Class18.anIntArray192[var10], Class18.anIntArray192[var11],
									Class18.anIntArray192[var12], var1.anIntArray182[var9]);
					} else {
						final int var19 = Class104_Sub18_Sub17_Sub4.anInterface2_1686.method1(var1.anIntArray182[var9],
								-2128903785);
						Class104_Sub18_Sub17_Sub4.method929(var16, var17, var18, var13, var14, var15,
								method104(var19, var1.anIntArray181[var9]), method104(var19, var1.anIntArray177[var9]),
								method104(var19, var1.anIntArray184[var9]));
					}
				} else if (var1.anIntArray181[var9] != 12345678)
					Class104_Sub18_Sub17_Sub4.method929(var16, var17, var18, var13, var14, var15,
							var1.anIntArray181[var9], var1.anIntArray177[var9], var1.anIntArray184[var9]);
			}
		}

	}

	boolean method100(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8) {
		if ((var2 < var3) && (var2 < var4) && (var2 < var5))
			return false;
		else if ((var2 > var3) && (var2 > var4) && (var2 > var5))
			return false;
		else if ((var1 < var6) && (var1 < var7) && (var1 < var8))
			return false;
		else if ((var1 > var6) && (var1 > var7) && (var1 > var8))
			return false;
		else {
			final int var9 = ((var2 - var3) * (var7 - var6)) - ((var1 - var6) * (var4 - var3));
			final int var10 = ((var2 - var5) * (var6 - var8)) - ((var1 - var8) * (var3 - var5));
			final int var11 = ((var2 - var4) * (var8 - var7)) - ((var1 - var7) * (var5 - var4));
			return ((var9 * var11) > 0) && ((var11 * var10) > 0);
		}
	}

	void method101() {
		final int var1 = anIntArray165[anInt129];
		final Class44[] var2 = aClass44ArrayArray152[anInt129];
		anInt147 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			final Class44 var4 = var2[var3];
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.anInt390 == 1) {
				var5 = (var4.anInt379 - anInt135) + 25;
				if ((var5 >= 0) && (var5 <= 50)) {
					var6 = (var4.anInt378 - anInt136) + 25;
					if (var6 < 0)
						var6 = 0;

					var7 = (var4.anInt377 - anInt136) + 25;
					if (var7 > 50)
						var7 = 50;

					var13 = false;

					while (var6 <= var7)
						if (aBoolArrayArray163[var5][var6++]) {
							var13 = true;
							break;
						}

					if (var13) {
						var9 = anInt156 - var4.anInt392;
						if (var9 > 32)
							var4.anInt387 = 1;
						else {
							if (var9 >= -32)
								continue;

							var4.anInt387 = 2;
							var9 = -var9;
						}

						var4.anInt382 = ((var4.anInt383 - anInt139) << 8) / var9;
						var4.anInt391 = ((var4.anInt384 - anInt139) << 8) / var9;
						var4.anInt385 = ((var4.anInt380 - anInt138) << 8) / var9;
						var4.anInt393 = ((var4.anInt386 - anInt138) << 8) / var9;
						aClass44Array140[anInt147++] = var4;
					}
				}
			} else if (var4.anInt390 == 2) {
				var5 = (var4.anInt378 - anInt136) + 25;
				if ((var5 >= 0) && (var5 <= 50)) {
					var6 = (var4.anInt379 - anInt135) + 25;
					if (var6 < 0)
						var6 = 0;

					var7 = (var4.anInt388 - anInt135) + 25;
					if (var7 > 50)
						var7 = 50;

					var13 = false;

					while (var6 <= var7)
						if (aBoolArrayArray163[var6++][var5]) {
							var13 = true;
							break;
						}

					if (var13) {
						var9 = anInt139 - var4.anInt383;
						if (var9 > 32)
							var4.anInt387 = 3;
						else {
							if (var9 >= -32)
								continue;

							var4.anInt387 = 4;
							var9 = -var9;
						}

						var4.anInt381 = ((var4.anInt392 - anInt156) << 8) / var9;
						var4.anInt389 = ((var4.anInt376 - anInt156) << 8) / var9;
						var4.anInt385 = ((var4.anInt380 - anInt138) << 8) / var9;
						var4.anInt393 = ((var4.anInt386 - anInt138) << 8) / var9;
						aClass44Array140[anInt147++] = var4;
					}
				}
			} else if (var4.anInt390 == 4) {
				var5 = var4.anInt380 - anInt138;
				if (var5 > 128) {
					var6 = (var4.anInt378 - anInt136) + 25;
					if (var6 < 0)
						var6 = 0;

					var7 = (var4.anInt377 - anInt136) + 25;
					if (var7 > 50)
						var7 = 50;

					if (var6 <= var7) {
						int var8 = (var4.anInt379 - anInt135) + 25;
						if (var8 < 0)
							var8 = 0;

						var9 = (var4.anInt388 - anInt135) + 25;
						if (var9 > 50)
							var9 = 50;

						boolean var10 = false;

						label138: for (int var11 = var8; var11 <= var9; ++var11)
							for (int var12 = var6; var12 <= var7; ++var12)
								if (aBoolArrayArray163[var11][var12]) {
									var10 = true;
									break label138;
								}

						if (var10) {
							var4.anInt387 = 5;
							var4.anInt381 = ((var4.anInt392 - anInt156) << 8) / var5;
							var4.anInt389 = ((var4.anInt376 - anInt156) << 8) / var5;
							var4.anInt382 = ((var4.anInt383 - anInt139) << 8) / var5;
							var4.anInt391 = ((var4.anInt384 - anInt139) << 8) / var5;
							aClass44Array140[anInt147++] = var4;
						}
					}
				}
			}
		}

	}

	public void method102(int var1, final int var2, int var3, final int var4, final int var5, final int var6) {
		if (var1 < 0)
			var1 = 0;
		else if (var1 >= (anInt119 * 128))
			var1 = (anInt119 * 128) - 1;

		if (var3 < 0)
			var3 = 0;
		else if (var3 >= (anInt125 * 128))
			var3 = (anInt125 * 128) - 1;

		++anInt130;
		anInt151 = Class104_Sub18_Sub17_Sub4.anIntArray1680[var4];
		anInt149 = Class104_Sub18_Sub17_Sub4.anIntArray1678[var4];
		anInt142 = Class104_Sub18_Sub17_Sub4.anIntArray1680[var5];
		anInt143 = Class104_Sub18_Sub17_Sub4.anIntArray1678[var5];
		aBoolArrayArray163 = aBoolArrayArrayArrayArray172[(var4 - 128) / 32][var5 / 64];
		anInt156 = var1;
		anInt138 = var2;
		anInt139 = var3;
		anInt135 = var1 / 128;
		anInt136 = var3 / 128;
		anInt129 = var6;
		anInt144 = anInt135 - 25;
		if (anInt144 < 0)
			anInt144 = 0;

		anInt154 = anInt136 - 25;
		if (anInt154 < 0)
			anInt154 = 0;

		anInt132 = anInt135 + 25;
		if (anInt132 > anInt119)
			anInt132 = anInt119;

		anInt134 = anInt136 + 25;
		if (anInt134 > anInt125)
			anInt134 = anInt125;

		method101();
		anInt128 = 0;

		int var7;
		Class104_Sub20[][] var8;
		int var9;
		int var10;
		for (var7 = anInt124; var7 < anInt118; ++var7) {
			var8 = aClass104_Sub20ArrayArrayArray122[var7];

			for (var9 = anInt144; var9 < anInt132; ++var9)
				for (var10 = anInt154; var10 < anInt134; ++var10) {
					final Class104_Sub20 var11 = var8[var9][var10];
					if (var11 != null)
						if ((var11.anInt1162 > var6)
								|| (!aBoolArrayArray163[(var9 - anInt135) + 25][(var10 - anInt136) + 25]
										&& ((anIntArrayArrayArray121[var7][var9][var10] - var2) < 2000))) {
							var11.aBool1153 = false;
							var11.aBool1164 = false;
							var11.anInt1166 = 0;
						} else {
							var11.aBool1153 = true;
							var11.aBool1164 = true;
							if (var11.anInt1163 > 0)
								var11.aBool1165 = true;
							else
								var11.aBool1165 = false;

							++anInt128;
						}
				}
		}

		int var12;
		int var13;
		int var14;
		int var15;
		Class104_Sub20 var16;
		for (var7 = anInt124; var7 < anInt118; ++var7) {
			var8 = aClass104_Sub20ArrayArrayArray122[var7];

			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = anInt135 + var9;
				var12 = anInt135 - var9;
				if ((var10 >= anInt144) || (var12 < anInt132))
					for (var13 = -25; var13 <= 0; ++var13) {
						var14 = anInt136 + var13;
						var15 = anInt136 - var13;
						if (var10 >= anInt144) {
							if (var14 >= anInt154) {
								var16 = var8[var10][var14];
								if ((var16 != null) && var16.aBool1153)
									method112(var16, true);
							}

							if (var15 < anInt134) {
								var16 = var8[var10][var15];
								if ((var16 != null) && var16.aBool1153)
									method112(var16, true);
							}
						}

						if (var12 < anInt132) {
							if (var14 >= anInt154) {
								var16 = var8[var12][var14];
								if ((var16 != null) && var16.aBool1153)
									method112(var16, true);
							}

							if (var15 < anInt134) {
								var16 = var8[var12][var15];
								if ((var16 != null) && var16.aBool1153)
									method112(var16, true);
							}
						}

						if (anInt128 == 0) {
							aBool145 = false;
							return;
						}
					}
			}
		}

		for (var7 = anInt124; var7 < anInt118; ++var7) {
			var8 = aClass104_Sub20ArrayArrayArray122[var7];

			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = anInt135 + var9;
				var12 = anInt135 - var9;
				if ((var10 >= anInt144) || (var12 < anInt132))
					for (var13 = -25; var13 <= 0; ++var13) {
						var14 = anInt136 + var13;
						var15 = anInt136 - var13;
						if (var10 >= anInt144) {
							if (var14 >= anInt154) {
								var16 = var8[var10][var14];
								if ((var16 != null) && var16.aBool1153)
									method112(var16, false);
							}

							if (var15 < anInt134) {
								var16 = var8[var10][var15];
								if ((var16 != null) && var16.aBool1153)
									method112(var16, false);
							}
						}

						if (var12 < anInt132) {
							if (var14 >= anInt154) {
								var16 = var8[var12][var14];
								if ((var16 != null) && var16.aBool1153)
									method112(var16, false);
							}

							if (var15 < anInt134) {
								var16 = var8[var12][var15];
								if ((var16 != null) && var16.aBool1153)
									method112(var16, false);
							}
						}

						if (anInt128 == 0) {
							aBool145 = false;
							return;
						}
					}
			}
		}

		aBool145 = false;
	}

	boolean method103(final int var1, final int var2, final int var3, final int var4) {
		if (!method115(var1, var2, var3))
			return false;
		else {
			final int var5 = var2 << 7;
			final int var6 = var3 << 7;
			final int var7 = anIntArrayArrayArray121[var1][var2][var3] - 1;
			final int var8 = var7 - 120;
			final int var9 = var7 - 230;
			final int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > anInt156) {
						if (!method114(var5, var7, var6))
							return false;

						if (!method114(var5, var7, var6 + 128))
							return false;
					}

					if (var1 > 0) {
						if (!method114(var5, var8, var6))
							return false;

						if (!method114(var5, var8, var6 + 128))
							return false;
					}

					if (!method114(var5, var9, var6))
						return false;

					if (!method114(var5, var9, var6 + 128))
						return false;

					return true;
				}

				if (var4 == 2) {
					if (var6 < anInt139) {
						if (!method114(var5, var7, var6 + 128))
							return false;

						if (!method114(var5 + 128, var7, var6 + 128))
							return false;
					}

					if (var1 > 0) {
						if (!method114(var5, var8, var6 + 128))
							return false;

						if (!method114(var5 + 128, var8, var6 + 128))
							return false;
					}

					if (!method114(var5, var9, var6 + 128))
						return false;

					if (!method114(var5 + 128, var9, var6 + 128))
						return false;

					return true;
				}

				if (var4 == 4) {
					if (var5 < anInt156) {
						if (!method114(var5 + 128, var7, var6))
							return false;

						if (!method114(var5 + 128, var7, var6 + 128))
							return false;
					}

					if (var1 > 0) {
						if (!method114(var5 + 128, var8, var6))
							return false;

						if (!method114(var5 + 128, var8, var6 + 128))
							return false;
					}

					if (!method114(var5 + 128, var9, var6))
						return false;

					if (!method114(var5 + 128, var9, var6 + 128))
						return false;

					return true;
				}

				if (var4 == 8) {
					if (var6 > anInt139) {
						if (!method114(var5, var7, var6))
							return false;

						if (!method114(var5 + 128, var7, var6))
							return false;
					}

					if (var1 > 0) {
						if (!method114(var5, var8, var6))
							return false;

						if (!method114(var5 + 128, var8, var6))
							return false;
					}

					if (!method114(var5, var9, var6))
						return false;

					if (!method114(var5 + 128, var9, var6))
						return false;

					return true;
				}
			}

			return !method114(var5 + 64, var10, var6 + 64) ? false
					: (var4 == 16 ? method114(var5, var9, var6 + 128)
							: (var4 == 32 ? method114(var5 + 128, var9, var6 + 128)
									: (var4 == 64 ? method114(var5 + 128, var9, var6)
											: (var4 == 128 ? method114(var5, var9, var6) : true))));
		}
	}

	static final int method104(final int var0, int var1) {
		var1 = (var1 * (var0 & 127)) >> 7;
		if (var1 < 2)
			var1 = 2;
		else if (var1 > 126)
			var1 = 126;

		return (var0 & '\uff80') + var1;
	}

	static {
		anIntArray165 = new int[anInt150];
		aClass44ArrayArray152 = new Class44[anInt150][500];
		anInt147 = 0;
		aClass44Array140 = new Class44[500];
		aClass59_155 = new Class59();
		anIntArray120 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
		anIntArray157 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
		anIntArray158 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
		anIntArray166 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		anIntArray160 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		anIntArray161 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		anIntArray162 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
		aBoolArrayArrayArrayArray172 = new boolean[8][32][51][51];
	}

	public Class6 method105(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		return (var4 != null) && (var4.aClass6_1160 != null) ? var4.aClass6_1160 : null;
	}

	public boolean method106(final int var1, final int var2, final int var3, final int var4, final int var5,
			final Class104_Sub18_Sub16 var6, final int var7, final int var8, final int var9, final int var10,
			final int var11, final int var12) {
		return var6 == null ? true
				: method76(var1, var9, var10, (var11 - var9) + 1, (var12 - var10) + 1, var2, var3, var4, var6, var7,
						true, var8, 0);
	}

	void method107(final Class21 var1) {
		for (int var2 = var1.anInt217; var2 <= var1.anInt215; ++var2)
			for (int var3 = var1.anInt216; var3 <= var1.anInt209; ++var3) {
				final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1.anInt212][var2][var3];
				if (var4 != null) {
					int var5;
					for (var5 = 0; var5 < var4.anInt1163; ++var5)
						if (var4.aClass21Array1151[var5] == var1) {
							--var4.anInt1163;

							for (int var6 = var5; var6 < var4.anInt1163; ++var6) {
								var4.aClass21Array1151[var6] = var4.aClass21Array1151[var6 + 1];
								var4.anIntArray1167[var6] = var4.anIntArray1167[var6 + 1];
							}

							var4.aClass21Array1151[var4.anInt1163] = null;
							break;
						}

					var4.anInt1161 = 0;

					for (var5 = 0; var5 < var4.anInt1163; ++var5)
						var4.anInt1161 |= var4.anIntArray1167[var5];
				}
			}

	}

	public void method108(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt118; ++var4)
			for (int var5 = 0; var5 < anInt119; ++var5)
				for (int var6 = 0; var6 < anInt125; ++var6) {
					final Class104_Sub20 var7 = aClass104_Sub20ArrayArrayArray122[var4][var5][var6];
					if (var7 != null) {
						final Class20 var8 = var7.aClass20_1154;
						Class104_Sub18_Sub16_Sub5 var10;
						if ((var8 != null) && (var8.aClass104_Sub18_Sub16_199 instanceof Class104_Sub18_Sub16_Sub5)) {
							final Class104_Sub18_Sub16_Sub5 var9 = (Class104_Sub18_Sub16_Sub5) var8.aClass104_Sub18_Sub16_199;
							method91(var9, var4, var5, var6, 1, 1);
							if (var8.aClass104_Sub18_Sub16_202 instanceof Class104_Sub18_Sub16_Sub5) {
								var10 = (Class104_Sub18_Sub16_Sub5) var8.aClass104_Sub18_Sub16_202;
								method91(var10, var4, var5, var6, 1, 1);
								Class104_Sub18_Sub16_Sub5.method903(var9, var10, 0, 0, 0, false);
								var8.aClass104_Sub18_Sub16_202 = var10.method904(var10.aShort1661, var10.aShort1659,
										var1, var2, var3);
							}

							var8.aClass104_Sub18_Sub16_199 = var9.method904(var9.aShort1661, var9.aShort1659, var1,
									var2, var3);
						}

						for (int var11 = 0; var11 < var7.anInt1163; ++var11) {
							final Class21 var14 = var7.aClass21Array1151[var11];
							if ((var14 != null)
									&& (var14.aClass104_Sub18_Sub16_214 instanceof Class104_Sub18_Sub16_Sub5)) {
								final Class104_Sub18_Sub16_Sub5 var12 = (Class104_Sub18_Sub16_Sub5) var14.aClass104_Sub18_Sub16_214;
								method91(var12, var4, var5, var6, (var14.anInt215 - var14.anInt217) + 1,
										(var14.anInt209 - var14.anInt216) + 1);
								var14.aClass104_Sub18_Sub16_214 = var12.method904(var12.aShort1661, var12.aShort1659,
										var1, var2, var3);
							}
						}

						final Class6 var13 = var7.aClass6_1160;
						if ((var13 != null) && (var13.aClass104_Sub18_Sub16_33 instanceof Class104_Sub18_Sub16_Sub5)) {
							var10 = (Class104_Sub18_Sub16_Sub5) var13.aClass104_Sub18_Sub16_33;
							method90(var10, var4, var5, var6);
							var13.aClass104_Sub18_Sub16_33 = var10.method904(var10.aShort1661, var10.aShort1659, var1,
									var2, var3);
						}
					}
				}

	}

	public static void method109(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7) {
		final Class44 var8 = new Class44();
		var8.anInt379 = var2 / 128;
		var8.anInt388 = var3 / 128;
		var8.anInt378 = var4 / 128;
		var8.anInt377 = var5 / 128;
		var8.anInt390 = var1;
		var8.anInt392 = var2;
		var8.anInt376 = var3;
		var8.anInt383 = var4;
		var8.anInt384 = var5;
		var8.anInt380 = var6;
		var8.anInt386 = var7;
		aClass44ArrayArray152[var0][anIntArray165[var0]++] = var8;
	}

	public void method110(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		if (var4 != null)
			var4.aClass23_1157 = null;
	}

	boolean method111(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6) {
		int var7;
		int var8;
		if ((var2 == var3) && (var4 == var5)) {
			if (!method115(var1, var2, var4))
				return false;
			else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return method114(var7 + 1, anIntArrayArrayArray121[var1][var2][var4] - var6, var8 + 1)
						&& method114((var7 + 128) - 1, anIntArrayArrayArray121[var1][var2 + 1][var4] - var6, var8 + 1)
						&& method114((var7 + 128) - 1, anIntArrayArrayArray121[var1][var2 + 1][var4 + 1] - var6,
								(var8 + 128) - 1)
						&& method114(var7 + 1, anIntArrayArrayArray121[var1][var2][var4 + 1] - var6, (var8 + 128) - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7)
				for (var8 = var4; var8 <= var5; ++var8)
					if (anIntArrayArrayArray141[var1][var7][var8] == -anInt130)
						return false;

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			final int var9 = anIntArrayArrayArray121[var1][var2][var4] - var6;
			if (!method114(var7, var9, var8))
				return false;
			else {
				final int var10 = (var3 << 7) - 1;
				if (!method114(var10, var9, var8))
					return false;
				else {
					final int var11 = (var5 << 7) - 1;
					if (!method114(var7, var9, var11))
						return false;
					else if (!method114(var10, var9, var11))
						return false;
					else
						return true;
				}
			}
		}
	}

	void method112(final Class104_Sub20 var1, boolean var2) {
		aClass59_155.method248(var1);

		while (true) {
			Class104_Sub20 var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Class104_Sub20[][] var8;
			Class104_Sub20 var9;
			int var11;
			int var16;
			int var17;
			int var18;
			int var24;
			int var25;
			do {
				do {
					do {
						do {
							do
								do
									while (true) {
										Class20 var10;
										Class21 var12;
										boolean var13;
										int var14;
										int var19;
										int var20;
										Class104_Sub20 var36;
										while (true) {
											do {
												var3 = (Class104_Sub20) aClass59_155.method250();
												if (var3 == null)
													return;
											} while (!var3.aBool1164);

											var4 = var3.anInt1149;
											var5 = var3.anInt1150;
											var6 = var3.anInt1158;
											var7 = var3.anInt1148;
											var8 = aClass104_Sub20ArrayArrayArray122[var6];
											if (!var3.aBool1153)
												break;

											if (var2) {
												if (var6 > 0) {
													var9 = aClass104_Sub20ArrayArrayArray122[var6 - 1][var4][var5];
													if ((var9 != null) && var9.aBool1164)
														continue;
												}

												if ((var4 <= anInt135) && (var4 > anInt144)) {
													var9 = var8[var4 - 1][var5];
													if ((var9 != null) && var9.aBool1164
															&& (var9.aBool1153 || ((var3.anInt1161 & 1) == 0)))
														continue;
												}

												if ((var4 >= anInt135) && (var4 < (anInt132 - 1))) {
													var9 = var8[var4 + 1][var5];
													if ((var9 != null) && var9.aBool1164
															&& (var9.aBool1153 || ((var3.anInt1161 & 4) == 0)))
														continue;
												}

												if ((var5 <= anInt136) && (var5 > anInt154)) {
													var9 = var8[var4][var5 - 1];
													if ((var9 != null) && var9.aBool1164
															&& (var9.aBool1153 || ((var3.anInt1161 & 8) == 0)))
														continue;
												}

												if ((var5 >= anInt136) && (var5 < (anInt134 - 1))) {
													var9 = var8[var4][var5 + 1];
													if ((var9 != null) && var9.aBool1164
															&& (var9.aBool1153 || ((var3.anInt1161 & 2) == 0)))
														continue;
												}
											} else
												var2 = true;

											var3.aBool1153 = false;
											if (var3.aClass104_Sub20_1170 != null) {
												var9 = var3.aClass104_Sub20_1170;
												if (var9.aClass9_1152 != null) {
													if (!method115(0, var4, var5))
														method98(var9.aClass9_1152, 0, anInt151, anInt149, anInt142,
																anInt143, var4, var5);
												} else if ((var9.aClass18_1156 != null) && !method115(0, var4, var5))
													method99(var9.aClass18_1156, anInt151, anInt149, anInt142, anInt143,
															var4, var5);

												var10 = var9.aClass20_1154;
												if (var10 != null)
													var10.aClass104_Sub18_Sub16_199.method787(0, anInt151, anInt149,
															anInt142, anInt143, var10.anInt203 - anInt156,
															var10.anInt201 - anInt138, var10.anInt198 - anInt139,
															var10.anInt200);

												for (var11 = 0; var11 < var9.anInt1163; ++var11) {
													var12 = var9.aClass21Array1151[var11];
													if (var12 != null)
														var12.aClass104_Sub18_Sub16_214.method787(var12.anInt213,
																anInt151, anInt149, anInt142, anInt143,
																var12.anInt221 - anInt156, var12.anInt208 - anInt138,
																var12.anInt211 - anInt139, var12.anInt220);
												}
											}

											var13 = false;
											if (var3.aClass9_1152 != null) {
												if (!method115(var7, var4, var5)) {
													var13 = true;
													if ((var3.aClass9_1152.anInt51 != 12345678)
															|| (aBool145 && (var6 <= anInt133)))
														method98(var3.aClass9_1152, var7, anInt151, anInt149, anInt142,
																anInt143, var4, var5);
												}
											} else if ((var3.aClass18_1156 != null) && !method115(var7, var4, var5)) {
												var13 = true;
												method99(var3.aClass18_1156, anInt151, anInt149, anInt142, anInt143,
														var4, var5);
											}

											var14 = 0;
											var11 = 0;
											final Class20 var31 = var3.aClass20_1154;
											final Class33 var15 = var3.aClass33_1155;
											if ((var31 != null) || (var15 != null)) {
												if (anInt135 == var4)
													++var14;
												else if (anInt135 < var4)
													var14 += 2;

												if (anInt136 == var5)
													var14 += 3;
												else if (anInt136 > var5)
													var14 += 6;

												var11 = anIntArray120[var14];
												var3.anInt1159 = anIntArray158[var14];
											}

											if (var31 != null) {
												if ((var31.anInt197 & anIntArray157[var14]) != 0) {
													if (var31.anInt197 == 16) {
														var3.anInt1166 = 3;
														var3.anInt1169 = anIntArray166[var14];
														var3.anInt1168 = 3 - var3.anInt1169;
													} else if (var31.anInt197 == 32) {
														var3.anInt1166 = 6;
														var3.anInt1169 = anIntArray160[var14];
														var3.anInt1168 = 6 - var3.anInt1169;
													} else if (var31.anInt197 == 64) {
														var3.anInt1166 = 12;
														var3.anInt1169 = anIntArray161[var14];
														var3.anInt1168 = 12 - var3.anInt1169;
													} else {
														var3.anInt1166 = 9;
														var3.anInt1169 = anIntArray162[var14];
														var3.anInt1168 = 9 - var3.anInt1169;
													}
												} else
													var3.anInt1166 = 0;

												if (((var31.anInt197 & var11) != 0)
														&& !method103(var7, var4, var5, var31.anInt197))
													var31.aClass104_Sub18_Sub16_199.method787(0, anInt151, anInt149,
															anInt142, anInt143, var31.anInt203 - anInt156,
															var31.anInt201 - anInt138, var31.anInt198 - anInt139,
															var31.anInt200);

												if (((var31.anInt196 & var11) != 0)
														&& !method103(var7, var4, var5, var31.anInt196))
													var31.aClass104_Sub18_Sub16_202.method787(0, anInt151, anInt149,
															anInt142, anInt143, var31.anInt203 - anInt156,
															var31.anInt201 - anInt138, var31.anInt198 - anInt139,
															var31.anInt200);
											}

											if ((var15 != null) && !method118(var7, var4, var5,
													var15.aClass104_Sub18_Sub16_338.anInt1467))
												if ((var15.anInt337 & var11) != 0)
													var15.aClass104_Sub18_Sub16_338.method787(0, anInt151, anInt149,
															anInt142, anInt143,
															(var15.anInt336 - anInt156) + var15.anInt334,
															var15.anInt335 - anInt138,
															(var15.anInt333 - anInt139) + var15.anInt332,
															var15.anInt340);
												else if (var15.anInt337 == 256) {
													var16 = var15.anInt336 - anInt156;
													var17 = var15.anInt335 - anInt138;
													var18 = var15.anInt333 - anInt139;
													var19 = var15.anInt331;
													if ((var19 != 1) && (var19 != 2))
														var20 = var16;
													else
														var20 = -var16;

													int var21;
													if ((var19 != 2) && (var19 != 3))
														var21 = var18;
													else
														var21 = -var18;

													if (var21 < var20)
														var15.aClass104_Sub18_Sub16_338.method787(0, anInt151, anInt149,
																anInt142, anInt143, var16 + var15.anInt334, var17,
																var18 + var15.anInt332, var15.anInt340);
													else if (var15.aClass104_Sub18_Sub16_339 != null)
														var15.aClass104_Sub18_Sub16_339.method787(0, anInt151, anInt149,
																anInt142, anInt143, var16, var17, var18,
																var15.anInt340);
												}

											if (var13) {
												final Class6 var22 = var3.aClass6_1160;
												if (var22 != null)
													var22.aClass104_Sub18_Sub16_33.method787(0, anInt151, anInt149,
															anInt142, anInt143, var22.anInt35 - anInt156,
															var22.anInt31 - anInt138, var22.anInt32 - anInt139,
															var22.anInt34);

												final Class23 var23 = var3.aClass23_1157;
												if ((var23 != null) && (var23.anInt236 == 0)) {
													if (var23.aClass104_Sub18_Sub16_233 != null)
														var23.aClass104_Sub18_Sub16_233.method787(0, anInt151, anInt149,
																anInt142, anInt143, var23.anInt230 - anInt156,
																var23.anInt231 - anInt138, var23.anInt229 - anInt139,
																var23.anInt235);

													if (var23.aClass104_Sub18_Sub16_234 != null)
														var23.aClass104_Sub18_Sub16_234.method787(0, anInt151, anInt149,
																anInt142, anInt143, var23.anInt230 - anInt156,
																var23.anInt231 - anInt138, var23.anInt229 - anInt139,
																var23.anInt235);

													if (var23.aClass104_Sub18_Sub16_232 != null)
														var23.aClass104_Sub18_Sub16_232.method787(0, anInt151, anInt149,
																anInt142, anInt143, var23.anInt230 - anInt156,
																var23.anInt231 - anInt138, var23.anInt229 - anInt139,
																var23.anInt235);
												}
											}

											var16 = var3.anInt1161;
											if (var16 != 0) {
												if ((var4 < anInt135) && ((var16 & 4) != 0)) {
													var36 = var8[var4 + 1][var5];
													if ((var36 != null) && var36.aBool1164)
														aClass59_155.method248(var36);
												}

												if ((var5 < anInt136) && ((var16 & 2) != 0)) {
													var36 = var8[var4][var5 + 1];
													if ((var36 != null) && var36.aBool1164)
														aClass59_155.method248(var36);
												}

												if ((var4 > anInt135) && ((var16 & 1) != 0)) {
													var36 = var8[var4 - 1][var5];
													if ((var36 != null) && var36.aBool1164)
														aClass59_155.method248(var36);
												}

												if ((var5 > anInt136) && ((var16 & 8) != 0)) {
													var36 = var8[var4][var5 - 1];
													if ((var36 != null) && var36.aBool1164)
														aClass59_155.method248(var36);
												}
											}
											break;
										}

										if (var3.anInt1166 != 0) {
											var13 = true;

											for (var14 = 0; var14 < var3.anInt1163; ++var14)
												if ((var3.aClass21Array1151[var14].anInt219 != anInt130)
														&& ((var3.anIntArray1167[var14]
																& var3.anInt1166) == var3.anInt1169)) {
													var13 = false;
													break;
												}

											if (var13) {
												var10 = var3.aClass20_1154;
												if (!method103(var7, var4, var5, var10.anInt197))
													var10.aClass104_Sub18_Sub16_199.method787(0, anInt151, anInt149,
															anInt142, anInt143, var10.anInt203 - anInt156,
															var10.anInt201 - anInt138, var10.anInt198 - anInt139,
															var10.anInt200);

												var3.anInt1166 = 0;
											}
										}

										if (!var3.aBool1165)
											break;

										try {
											final int var33 = var3.anInt1163;
											var3.aBool1165 = false;
											var14 = 0;

											label561: for (var11 = 0; var11 < var33; ++var11) {
												var12 = var3.aClass21Array1151[var11];
												if (var12.anInt219 != anInt130) {
													for (var24 = var12.anInt217; var24 <= var12.anInt215; ++var24)
														for (var16 = var12.anInt216; var16 <= var12.anInt209; ++var16) {
															var36 = var8[var24][var16];
															if (var36.aBool1153) {
																var3.aBool1165 = true;
																continue label561;
															}

															if (var36.anInt1166 != 0) {
																var18 = 0;
																if (var24 > var12.anInt217)
																	++var18;

																if (var24 < var12.anInt215)
																	var18 += 4;

																if (var16 > var12.anInt216)
																	var18 += 8;

																if (var16 < var12.anInt209)
																	var18 += 2;

																if ((var18 & var36.anInt1166) == var3.anInt1168) {
																	var3.aBool1165 = true;
																	continue label561;
																}
															}
														}

													aClass21Array170[var14++] = var12;
													var24 = anInt135 - var12.anInt217;
													var16 = var12.anInt215 - anInt135;
													if (var16 > var24)
														var24 = var16;

													var17 = anInt136 - var12.anInt216;
													var18 = var12.anInt209 - anInt136;
													if (var18 > var17)
														var12.anInt210 = var24 + var18;
													else
														var12.anInt210 = var24 + var17;
												}
											}

											while (var14 > 0) {
												var11 = -50;
												var25 = -1;

												for (var24 = 0; var24 < var14; ++var24) {
													final Class21 var35 = aClass21Array170[var24];
													if (var35.anInt219 != anInt130)
														if (var35.anInt210 > var11) {
															var11 = var35.anInt210;
															var25 = var24;
														} else if (var35.anInt210 == var11) {
															var17 = var35.anInt221 - anInt156;
															var18 = var35.anInt211 - anInt139;
															var19 = aClass21Array170[var25].anInt221 - anInt156;
															var20 = aClass21Array170[var25].anInt211 - anInt139;
															if (((var17 * var17) + (var18 * var18)) > ((var19 * var19)
																	+ (var20 * var20)))
																var25 = var24;
														}
												}

												if (var25 == -1)
													break;

												final Class21 var34 = aClass21Array170[var25];
												var34.anInt219 = anInt130;
												if (!method111(var7, var34.anInt217, var34.anInt215, var34.anInt216,
														var34.anInt209, var34.aClass104_Sub18_Sub16_214.anInt1467))
													var34.aClass104_Sub18_Sub16_214.method787(var34.anInt213, anInt151,
															anInt149, anInt142, anInt143, var34.anInt221 - anInt156,
															var34.anInt208 - anInt138, var34.anInt211 - anInt139,
															var34.anInt220);

												for (var16 = var34.anInt217; var16 <= var34.anInt215; ++var16)
													for (var17 = var34.anInt216; var17 <= var34.anInt209; ++var17) {
														final Class104_Sub20 var26 = var8[var16][var17];
														if (var26.anInt1166 != 0)
															aClass59_155.method248(var26);
														else if (((var16 != var4) || (var17 != var5))
																&& var26.aBool1164)
															aClass59_155.method248(var26);
													}
											}

											if (!var3.aBool1165)
												break;
										} catch (final Exception var28) {
											var3.aBool1165 = false;
											break;
										}
									}
								while (!var3.aBool1164);
							while (var3.anInt1166 != 0);

							if ((var4 > anInt135) || (var4 <= anInt144))
								break;

							var9 = var8[var4 - 1][var5];
						} while ((var9 != null) && var9.aBool1164);

						if ((var4 < anInt135) || (var4 >= (anInt132 - 1)))
							break;

						var9 = var8[var4 + 1][var5];
					} while ((var9 != null) && var9.aBool1164);

					if ((var5 > anInt136) || (var5 <= anInt154))
						break;

					var9 = var8[var4][var5 - 1];
				} while ((var9 != null) && var9.aBool1164);

				if ((var5 < anInt136) || (var5 >= (anInt134 - 1)))
					break;

				var9 = var8[var4][var5 + 1];
			} while ((var9 != null) && var9.aBool1164);

			var3.aBool1164 = false;
			--anInt128;
			final Class23 var32 = var3.aClass23_1157;
			if ((var32 != null) && (var32.anInt236 != 0)) {
				if (var32.aClass104_Sub18_Sub16_233 != null)
					var32.aClass104_Sub18_Sub16_233.method787(0, anInt151, anInt149, anInt142, anInt143,
							var32.anInt230 - anInt156, var32.anInt231 - anInt138 - var32.anInt236,
							var32.anInt229 - anInt139, var32.anInt235);

				if (var32.aClass104_Sub18_Sub16_234 != null)
					var32.aClass104_Sub18_Sub16_234.method787(0, anInt151, anInt149, anInt142, anInt143,
							var32.anInt230 - anInt156, var32.anInt231 - anInt138 - var32.anInt236,
							var32.anInt229 - anInt139, var32.anInt235);

				if (var32.aClass104_Sub18_Sub16_232 != null)
					var32.aClass104_Sub18_Sub16_232.method787(0, anInt151, anInt149, anInt142, anInt143,
							var32.anInt230 - anInt156, var32.anInt231 - anInt138 - var32.anInt236,
							var32.anInt229 - anInt139, var32.anInt235);
			}

			if (var3.anInt1159 != 0) {
				final Class33 var29 = var3.aClass33_1155;
				if ((var29 != null) && !method118(var7, var4, var5, var29.aClass104_Sub18_Sub16_338.anInt1467))
					if ((var29.anInt337 & var3.anInt1159) != 0)
						var29.aClass104_Sub18_Sub16_338.method787(0, anInt151, anInt149, anInt142, anInt143,
								(var29.anInt336 - anInt156) + var29.anInt334, var29.anInt335 - anInt138,
								(var29.anInt333 - anInt139) + var29.anInt332, var29.anInt340);
					else if (var29.anInt337 == 256) {
						var11 = var29.anInt336 - anInt156;
						var25 = var29.anInt335 - anInt138;
						var24 = var29.anInt333 - anInt139;
						var16 = var29.anInt331;
						if ((var16 != 1) && (var16 != 2))
							var17 = var11;
						else
							var17 = -var11;

						if ((var16 != 2) && (var16 != 3))
							var18 = var24;
						else
							var18 = -var24;

						if (var18 >= var17)
							var29.aClass104_Sub18_Sub16_338.method787(0, anInt151, anInt149, anInt142, anInt143,
									var11 + var29.anInt334, var25, var24 + var29.anInt332, var29.anInt340);
						else if (var29.aClass104_Sub18_Sub16_339 != null)
							var29.aClass104_Sub18_Sub16_339.method787(0, anInt151, anInt149, anInt142, anInt143, var11,
									var25, var24, var29.anInt340);
					}

				final Class20 var27 = var3.aClass20_1154;
				if (var27 != null) {
					if (((var27.anInt196 & var3.anInt1159) != 0) && !method103(var7, var4, var5, var27.anInt196))
						var27.aClass104_Sub18_Sub16_202.method787(0, anInt151, anInt149, anInt142, anInt143,
								var27.anInt203 - anInt156, var27.anInt201 - anInt138, var27.anInt198 - anInt139,
								var27.anInt200);

					if (((var27.anInt197 & var3.anInt1159) != 0) && !method103(var7, var4, var5, var27.anInt197))
						var27.aClass104_Sub18_Sub16_199.method787(0, anInt151, anInt149, anInt142, anInt143,
								var27.anInt203 - anInt156, var27.anInt201 - anInt138, var27.anInt198 - anInt139,
								var27.anInt200);
				}
			}

			Class104_Sub20 var30;
			if (var6 < (anInt118 - 1)) {
				var30 = aClass104_Sub20ArrayArrayArray122[var6 + 1][var4][var5];
				if ((var30 != null) && var30.aBool1164)
					aClass59_155.method248(var30);
			}

			if (var4 < anInt135) {
				var30 = var8[var4 + 1][var5];
				if ((var30 != null) && var30.aBool1164)
					aClass59_155.method248(var30);
			}

			if (var5 < anInt136) {
				var30 = var8[var4][var5 + 1];
				if ((var30 != null) && var30.aBool1164)
					aClass59_155.method248(var30);
			}

			if (var4 > anInt135) {
				var30 = var8[var4 - 1][var5];
				if ((var30 != null) && var30.aBool1164)
					aClass59_155.method248(var30);
			}

			if (var5 > anInt136) {
				var30 = var8[var4][var5 - 1];
				if ((var30 != null) && var30.aBool1164)
					aClass59_155.method248(var30);
			}
		}
	}

	public Class21 method113(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		if (var4 == null)
			return null;
		else {
			for (int var5 = 0; var5 < var4.anInt1163; ++var5) {
				final Class21 var6 = var4.aClass21Array1151[var5];
				if ((((var6.anInt220 >> 29) & 3) == 2) && (var6.anInt217 == var2) && (var6.anInt216 == var3))
					return var6;
			}

			return null;
		}
	}

	boolean method114(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt147; ++var4) {
			final Class44 var5 = aClass44Array140[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.anInt387 == 1) {
				var6 = var5.anInt392 - var1;
				if (var6 > 0) {
					var7 = var5.anInt383 + ((var5.anInt382 * var6) >> 8);
					var8 = var5.anInt384 + ((var5.anInt391 * var6) >> 8);
					var9 = var5.anInt380 + ((var5.anInt385 * var6) >> 8);
					var10 = var5.anInt386 + ((var5.anInt393 * var6) >> 8);
					if ((var3 >= var7) && (var3 <= var8) && (var2 >= var9) && (var2 <= var10))
						return true;
				}
			} else if (var5.anInt387 == 2) {
				var6 = var1 - var5.anInt392;
				if (var6 > 0) {
					var7 = var5.anInt383 + ((var5.anInt382 * var6) >> 8);
					var8 = var5.anInt384 + ((var5.anInt391 * var6) >> 8);
					var9 = var5.anInt380 + ((var5.anInt385 * var6) >> 8);
					var10 = var5.anInt386 + ((var5.anInt393 * var6) >> 8);
					if ((var3 >= var7) && (var3 <= var8) && (var2 >= var9) && (var2 <= var10))
						return true;
				}
			} else if (var5.anInt387 == 3) {
				var6 = var5.anInt383 - var3;
				if (var6 > 0) {
					var7 = var5.anInt392 + ((var5.anInt381 * var6) >> 8);
					var8 = var5.anInt376 + ((var5.anInt389 * var6) >> 8);
					var9 = var5.anInt380 + ((var5.anInt385 * var6) >> 8);
					var10 = var5.anInt386 + ((var5.anInt393 * var6) >> 8);
					if ((var1 >= var7) && (var1 <= var8) && (var2 >= var9) && (var2 <= var10))
						return true;
				}
			} else if (var5.anInt387 == 4) {
				var6 = var3 - var5.anInt383;
				if (var6 > 0) {
					var7 = var5.anInt392 + ((var5.anInt381 * var6) >> 8);
					var8 = var5.anInt376 + ((var5.anInt389 * var6) >> 8);
					var9 = var5.anInt380 + ((var5.anInt385 * var6) >> 8);
					var10 = var5.anInt386 + ((var5.anInt393 * var6) >> 8);
					if ((var1 >= var7) && (var1 <= var8) && (var2 >= var9) && (var2 <= var10))
						return true;
				}
			} else if (var5.anInt387 == 5) {
				var6 = var2 - var5.anInt380;
				if (var6 > 0) {
					var7 = var5.anInt392 + ((var5.anInt381 * var6) >> 8);
					var8 = var5.anInt376 + ((var5.anInt389 * var6) >> 8);
					var9 = var5.anInt383 + ((var5.anInt382 * var6) >> 8);
					var10 = var5.anInt384 + ((var5.anInt391 * var6) >> 8);
					if ((var1 >= var7) && (var1 <= var8) && (var3 >= var9) && (var3 <= var10))
						return true;
				}
			}
		}

		return false;
	}

	boolean method115(final int var1, final int var2, final int var3) {
		final int var4 = anIntArrayArrayArray141[var1][var2][var3];
		if (var4 == -anInt130)
			return false;
		else if (var4 == anInt130)
			return true;
		else {
			final int var5 = var2 << 7;
			final int var6 = var3 << 7;
			if (method114(var5 + 1, anIntArrayArrayArray121[var1][var2][var3], var6 + 1)
					&& method114((var5 + 128) - 1, anIntArrayArrayArray121[var1][var2 + 1][var3], var6 + 1)
					&& method114((var5 + 128) - 1, anIntArrayArrayArray121[var1][var2 + 1][var3 + 1], (var6 + 128) - 1)
					&& method114(var5 + 1, anIntArrayArrayArray121[var1][var2][var3 + 1], (var6 + 128) - 1)) {
				anIntArrayArrayArray141[var1][var2][var3] = anInt130;
				return true;
			} else {
				anIntArrayArrayArray141[var1][var2][var3] = -anInt130;
				return false;
			}
		}
	}

	public void method116(final int var1, final int var2, final int var3, final int var4,
			final Class104_Sub18_Sub16 var5, final int var6, final int var7) {
		if (var5 != null) {
			final Class6 var8 = new Class6();
			var8.aClass104_Sub18_Sub16_33 = var5;
			var8.anInt35 = (var2 * 128) + 64;
			var8.anInt32 = (var3 * 128) + 64;
			var8.anInt31 = var4;
			var8.anInt34 = var6;
			var8.anInt30 = var7;
			if (aClass104_Sub20ArrayArrayArray122[var1][var2][var3] == null)
				aClass104_Sub20ArrayArrayArray122[var1][var2][var3] = new Class104_Sub20(var1, var2, var3);

			aClass104_Sub20ArrayArrayArray122[var1][var2][var3].aClass6_1160 = var8;
		}
	}

	public Class20 method117(final int var1, final int var2, final int var3) {
		final Class104_Sub20 var4 = aClass104_Sub20ArrayArrayArray122[var1][var2][var3];
		return var4 == null ? null : var4.aClass20_1154;
	}

	boolean method118(final int var1, final int var2, final int var3, final int var4) {
		if (!method115(var1, var2, var3))
			return false;
		else {
			final int var5 = var2 << 7;
			final int var6 = var3 << 7;
			return method114(var5 + 1, anIntArrayArrayArray121[var1][var2][var3] - var4, var6 + 1)
					&& method114((var5 + 128) - 1, anIntArrayArrayArray121[var1][var2 + 1][var3] - var4, var6 + 1)
					&& method114((var5 + 128) - 1, anIntArrayArrayArray121[var1][var2 + 1][var3 + 1] - var4,
							(var6 + 128) - 1)
					&& method114(var5 + 1, anIntArrayArrayArray121[var1][var2][var3 + 1] - var4, (var6 + 128) - 1);
		}
	}
}
