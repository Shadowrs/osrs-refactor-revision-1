public class Class85 {
	public static short[] aShortArray663;
	public static short[][] aShortArrayArray668;
	static Class61_Sub1 aClass61_Sub1_671;
	static int anInt672;
	static int anInt673;
	int[] clothes;
	int[] skin;
	public boolean aBool661;
	int anInt664;
	long aLong665;
	long aLong666;
	static int[] curCloth = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	static Class56 aClass56_670 = new Class56(260);

	public void method383(int[] var1, final int[] var2, final boolean var3, final int var4) {
		if (null == var1) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5)
				for (int var6 = 0; var6 < Class104_Sub2.anInt862; ++var6) {
					final Class104_Sub18_Sub9 var7 = Class84.method382(var6);
					if ((var7 != null) && !var7.aBool1401 && (var7.anInt1400 == (var5 + (var3 ? 7 : 0)))) {
						var1[curCloth[var5]] = 256 + var6;
						break;
					}
				}
		}

		clothes = var1;
		skin = var2;
		aBool661 = var3;
		anInt664 = var4;
		method388();
	}

	public void method384(final int var1, final boolean var2) {
		if ((var1 != 1) || !aBool661) {
			int var3 = clothes[curCloth[var1]];
			if (var3 != 0) {
				var3 -= 256;

				Class104_Sub18_Sub9 var4;
				do {
					if (!var2) {
						--var3;
						if (var3 < 0)
							var3 = Class104_Sub2.anInt862 - 1;
					} else {
						++var3;
						if (var3 >= Class104_Sub2.anInt862)
							var3 = 0;
					}

					var4 = Class84.method382(var3);
				} while ((var4 == null) || var4.aBool1401 || (var4.anInt1400 != ((aBool661 ? 7 : 0) + var1)));

				clothes[curCloth[var1]] = var3 + 256;
				method388();
			}
		}
	}

	public void method385(final int var1, final boolean var2) {
		int var3 = skin[var1];
		if (!var2) {
			--var3;
			if (var3 < 0)
				var3 = Class47.skinCols[var1].length - 1;
		} else {
			++var3;
			if (var3 >= Class47.skinCols[var1].length)
				var3 = 0;
		}

		skin[var1] = var3;
		method388();
	}

	public void method386(final boolean var1) {
		if (aBool661 != var1)
			method383((int[]) null, skin, var1, -1);
	}

	public void writeAppearance(final RSBuf var1) {
		var1.writebyte(aBool661 ? 1 : 0);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			final int var3 = clothes[curCloth[var2]];
			if (var3 == 0)
				var1.writebyte(-1);
			else
				var1.writebyte(var3 - 256);
		}

		for (var2 = 0; var2 < 5; ++var2)
			var1.writebyte(skin[var2]);

	}

	void method388() {
		final long var1 = aLong665;
		final int var3 = clothes[5];
		final int var4 = clothes[9];
		clothes[5] = var4;
		clothes[9] = var3;
		aLong665 = 0L;

		int var5;
		for (var5 = 0; var5 < 12; ++var5) {
			aLong665 <<= 4;
			if (clothes[var5] >= 256)
				aLong665 += clothes[var5] - 256;
		}

		if (clothes[0] >= 256)
			aLong665 += (clothes[0] - 256) >> 4;

		if (clothes[1] >= 256)
			aLong665 += (clothes[1] - 256) >> 8;

		for (var5 = 0; var5 < 5; ++var5) {
			aLong665 <<= 3;
			aLong665 += skin[var5];
		}

		aLong665 <<= 1;
		aLong665 += aBool661 ? 1 : 0;
		clothes[5] = var3;
		clothes[9] = var4;
		if ((var1 != 0L) && (aLong665 != var1))
			aClass56_670.method237(var1);

	}

	public Class104_Sub18_Sub16_Sub4 method389(final Def var1, final int var2,
			final Def var3, final int var4) {
		if (anInt664 != -1)
			return Class64.method296(anInt664).method675(var1, var2, var3, var4);
		else {
			long var5 = aLong665;
			int[] var7 = clothes;
			if ((var1 != null) && ((var1.anInt1270 >= 0) || (var1.anInt1271 >= 0))) {
				var7 = new int[12];

				for (int var8 = 0; var8 < 12; ++var8)
					var7[var8] = clothes[var8];

				if (var1.anInt1270 >= 0) {
					var5 += (var1.anInt1270 - clothes[5]) << 8;
					var7[5] = var1.anInt1270;
				}

				if (var1.anInt1271 >= 0) {
					var5 += (var1.anInt1271 - clothes[3]) << 16;
					var7[3] = var1.anInt1271;
				}
			}

			Class104_Sub18_Sub16_Sub4 var9 = (Class104_Sub18_Sub16_Sub4) aClass56_670.method236(var5);
			if (null == var9) {
				boolean var10 = false;

				int var12;
				for (int var11 = 0; var11 < 12; ++var11) {
					var12 = var7[var11];
					if ((var12 >= 256) && (var12 < 512) && !Class84.method382(var12 - 256).method759())
						var10 = true;

					if ((var12 >= 512) && !Class27.forId(var12 - 512).method780(aBool661))
						var10 = true;
				}

				if (var10) {
					if (aLong666 != -1L)
						var9 = (Class104_Sub18_Sub16_Sub4) aClass56_670.method236(aLong666);

					if (null == var9)
						return null;
				}

				if (var9 == null) {
					final Class104_Sub18_Sub16_Sub5[] var13 = new Class104_Sub18_Sub16_Sub5[12];
					var12 = 0;

					int var15;
					for (int var14 = 0; var14 < 12; ++var14) {
						var15 = var7[var14];
						Class104_Sub18_Sub16_Sub5 var16;
						if ((var15 >= 256) && (var15 < 512)) {
							var16 = Class84.method382(var15 - 256).method762();
							if (var16 != null)
								var13[var12++] = var16;
						}

						if (var15 >= 512) {
							var16 = Class27.forId(var15 - 512).method777(aBool661);
							if (null != var16)
								var13[var12++] = var16;
						}
					}

					final Class104_Sub18_Sub16_Sub5 var17 = new Class104_Sub18_Sub16_Sub5(var13, var12);

					for (var15 = 0; var15 < 5; ++var15) {
						if (skin[var15] < Class47.skinCols[var15].length)
							var17.method899(Class57.aShortArray465[var15],
									Class47.skinCols[var15][skin[var15]]);

						if (skin[var15] < aShortArrayArray668[var15].length)
							var17.method899(aShortArray663[var15], aShortArrayArray668[var15][skin[var15]]);
					}

					var9 = var17.method904(64, 850, -30, -50, -30);
					aClass56_670.method238(var9, var5);
					aLong666 = var5;
				}
			}

			if ((null == var1) && (var3 == null))
				return var9;
			else {
				Class104_Sub18_Sub16_Sub4 var18;
				if ((var1 != null) && (var3 != null))
					var18 = var1.method685(var9, var2, var3, var4);
				else if (null != var1)
					var18 = var1.method687(var9, var2);
				else
					var18 = var3.method687(var9, var4);

				return var18;
			}
		}
	}

	public int method390() {
		return anInt664 == -1
				? (clothes[11] << 5) + (clothes[8] << 10) + (skin[4] << 20)
						+ (skin[0] << 25) + (clothes[0] << 15) + clothes[1]
				: 305419896 + Class64.method296(anInt664).anInt1228;
	}

	Class104_Sub18_Sub16_Sub5 method391() {
		if (anInt664 != -1)
			return Class64.method296(anInt664).method676();
		else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = clothes[var2];
				if ((var3 >= 256) && (var3 < 512) && !Class84.method382(var3 - 256).method760())
					var1 = true;

				if ((var3 >= 512) && !Class27.forId(var3 - 512).method781(aBool661))
					var1 = true;
			}

			if (var1)
				return null;
			else {
				final Class104_Sub18_Sub16_Sub5[] var4 = new Class104_Sub18_Sub16_Sub5[12];
				var3 = 0;

				int var6;
				for (int var5 = 0; var5 < 12; ++var5) {
					var6 = clothes[var5];
					Class104_Sub18_Sub16_Sub5 var7;
					if ((var6 >= 256) && (var6 < 512)) {
						var7 = Class84.method382(var6 - 256).method764();
						if (null != var7)
							var4[var3++] = var7;
					}

					if (var6 >= 512) {
						var7 = Class27.forId(var6 - 512).method778(aBool661);
						if (null != var7)
							var4[var3++] = var7;
					}
				}

				final Class104_Sub18_Sub16_Sub5 var8 = new Class104_Sub18_Sub16_Sub5(var4, var3);

				for (var6 = 0; var6 < 5; ++var6) {
					if (skin[var6] < Class47.skinCols[var6].length)
						var8.method899(Class57.aShortArray465[var6],
								Class47.skinCols[var6][skin[var6]]);

					if (skin[var6] < aShortArrayArray668[var6].length)
						var8.method899(aShortArray663[var6], aShortArrayArray668[var6][skin[var6]]);
				}

				return var8;
			}
		}
	}

	public static void method392(final Class61 var0, final Class61 var1) {
		Class104_Sub18_Sub9.aClass61_1391 = var0;
		Class104_Sub18_Sub9.aClass61_1394 = var1;
		Class104_Sub2.anInt862 = Class104_Sub18_Sub9.aClass61_1391.leng(3);
	}
}
