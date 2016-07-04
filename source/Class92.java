import java.util.Random;

public class Class92 {
	Class74 aClass74_729;
	Class74 aClass74_718;
	Class74 aClass74_725;
	Class74 aClass74_720;
	Class74 aClass74_721;
	Class74 aClass74_722;
	Class74 aClass74_735;
	Class74 aClass74_724;
	int anInt717 = 0;
	int anInt719 = 100;
	int anInt732 = 500;
	int anInt733 = 0;
	Class4 aClass4_730;
	Class74 aClass74_731;
	static int[] anIntArray737 = new int['\u8000'];
	static int[] anIntArray736;
	static int[] anIntArray723;
	static int[] anIntArray728;
	static int[] anIntArray738;
	static int[] anIntArray739;
	static int[] anIntArray740;
	static int[] anIntArray741;
	int[] anIntArray734 = new int[] { 0, 0, 0, 0, 0 };
	int[] anIntArray726 = new int[] { 0, 0, 0, 0, 0 };
	int[] anIntArray727 = new int[] { 0, 0, 0, 0, 0 };

	final void method413(final RSBuf var1) {
		aClass74_729 = new Class74();
		aClass74_729.method337(var1);
		aClass74_718 = new Class74();
		aClass74_718.method337(var1);
		int var2 = var1.readUByte();
		if (var2 != 0) {
			--var1.pos;
			aClass74_725 = new Class74();
			aClass74_725.method337(var1);
			aClass74_720 = new Class74();
			aClass74_720.method337(var1);
		}

		var2 = var1.readUByte();
		if (var2 != 0) {
			--var1.pos;
			aClass74_721 = new Class74();
			aClass74_721.method337(var1);
			aClass74_722 = new Class74();
			aClass74_722.method337(var1);
		}

		var2 = var1.readUByte();
		if (var2 != 0) {
			--var1.pos;
			aClass74_735 = new Class74();
			aClass74_735.method337(var1);
			aClass74_724 = new Class74();
			aClass74_724.method337(var1);
		}

		for (int var3 = 0; var3 < 10; ++var3) {
			final int var4 = var1.readsmart();
			if (var4 == 0)
				break;

			anIntArray734[var3] = var4;
			anIntArray726[var3] = var1.method578();
			anIntArray727[var3] = var1.readsmart();
		}

		anInt717 = var1.readsmart();
		anInt719 = var1.readsmart();
		anInt732 = var1.readLEShort();
		anInt733 = var1.readLEShort();
		aClass4_730 = new Class4();
		aClass74_731 = new Class74();
		aClass4_730.method31(var1, aClass74_731);
	}

	final int method414(final int var1, final int var2, final int var3) {
		return var3 == 1 ? ((var1 & 32767) < 16384 ? var2 : -var2)
				: (var3 == 2 ? (anIntArray736[var1 & 32767] * var2) >> 14
						: (var3 == 3 ? (((var1 & 32767) * var2) >> 14) - var2
								: (var3 == 4 ? anIntArray737[(var1 / 2607) & 32767] * var2 : 0)));
	}

	static {
		final Random var0 = new Random(0L);

		int var1;
		for (var1 = 0; var1 < '\u8000'; ++var1)
			anIntArray737[var1] = (var0.nextInt() & 2) - 1;

		anIntArray736 = new int['\u8000'];

		for (var1 = 0; var1 < '\u8000'; ++var1)
			anIntArray736[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);

		anIntArray723 = new int[220500];
		anIntArray728 = new int[5];
		anIntArray738 = new int[5];
		anIntArray739 = new int[5];
		anIntArray740 = new int[5];
		anIntArray741 = new int[5];
	}

	final int[] method415(final int var1, final int var2) {
		Class35.method167(anIntArray723, 0, var1);
		if (var2 < 10)
			return anIntArray723;
		else {
			final double var3 = var1 / (var2 + 0.0D);
			aClass74_729.method340();
			aClass74_718.method340();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (aClass74_725 != null) {
				aClass74_725.method340();
				aClass74_720.method340();
				var5 = (int) (((aClass74_725.anInt590 - aClass74_725.anInt596) * 32.768D) / var3);
				var6 = (int) ((aClass74_725.anInt596 * 32.768D) / var3);
			}

			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			if (aClass74_721 != null) {
				aClass74_721.method340();
				aClass74_722.method340();
				var8 = (int) (((aClass74_721.anInt590 - aClass74_721.anInt596) * 32.768D) / var3);
				var9 = (int) ((aClass74_721.anInt596 * 32.768D) / var3);
			}

			int var11;
			for (var11 = 0; var11 < 5; ++var11)
				if (anIntArray734[var11] != 0) {
					anIntArray728[var11] = 0;
					anIntArray738[var11] = (int) (anIntArray727[var11] * var3);
					anIntArray739[var11] = (anIntArray734[var11] << 14) / 100;
					anIntArray740[var11] = (int) (((aClass74_729.anInt590 - aClass74_729.anInt596) * 32.768D
							* Math.pow(1.0057929410678534D, anIntArray726[var11])) / var3);
					anIntArray741[var11] = (int) ((aClass74_729.anInt596 * 32.768D) / var3);
				}

			int var12;
			int var13;
			int var14;
			int var15;
			for (var11 = 0; var11 < var1; ++var11) {
				var12 = aClass74_729.method339(var1);
				var13 = aClass74_718.method339(var1);
				if (aClass74_725 != null) {
					var14 = aClass74_725.method339(var1);
					var15 = aClass74_720.method339(var1);
					var12 += method414(var7, var15, aClass74_725.anInt586) >> 1;
					var7 += ((var14 * var5) >> 16) + var6;
				}

				if (aClass74_721 != null) {
					var14 = aClass74_721.method339(var1);
					var15 = aClass74_722.method339(var1);
					var13 = (var13 * ((method414(var10, var15, aClass74_721.anInt586) >> 1) + '\u8000')) >> 15;
					var10 += ((var14 * var8) >> 16) + var9;
				}

				for (var14 = 0; var14 < 5; ++var14)
					if (anIntArray734[var14] != 0) {
						var15 = var11 + anIntArray738[var14];
						if (var15 < var1) {
							anIntArray723[var15] += method414(anIntArray728[var14],
									(var13 * anIntArray739[var14]) >> 15, aClass74_729.anInt586);
							anIntArray728[var14] += ((var12 * anIntArray740[var14]) >> 16) + anIntArray741[var14];
						}
					}
			}

			int var16;
			if (aClass74_735 != null) {
				aClass74_735.method340();
				aClass74_724.method340();
				var11 = 0;
				boolean var20 = true;

				for (var14 = 0; var14 < var1; ++var14) {
					var15 = aClass74_735.method339(var1);
					var16 = aClass74_724.method339(var1);
					if (var20)
						var12 = aClass74_735.anInt596
								+ (((aClass74_735.anInt590 - aClass74_735.anInt596) * var15) >> 8);
					else
						var12 = aClass74_735.anInt596
								+ (((aClass74_735.anInt590 - aClass74_735.anInt596) * var16) >> 8);

					var11 += 256;
					if (var11 >= var12) {
						var11 = 0;
						var20 = !var20;
					}

					if (var20)
						anIntArray723[var14] = 0;
				}
			}

			if ((anInt717 > 0) && (anInt719 > 0)) {
				var11 = (int) (anInt717 * var3);

				for (var12 = var11; var12 < var1; ++var12)
					anIntArray723[var12] += (anIntArray723[var12 - var11] * anInt719) / 100;
			}

			if ((aClass4_730.anIntArray11[0] > 0) || (aClass4_730.anIntArray11[1] > 0)) {
				aClass74_731.method340();
				var11 = aClass74_731.method339(var1 + 1);
				var12 = aClass4_730.method30(0, var11 / 65536.0F);
				var13 = aClass4_730.method30(1, var11 / 65536.0F);
				if (var1 >= (var12 + var13)) {
					var14 = 0;
					var15 = var13;
					if (var13 > (var1 - var12))
						var15 = var1 - var12;

					int var17;
					while (var14 < var15) {
						var16 = (int) (((long) anIntArray723[var14 + var12] * (long) Class4.anInt17) >> 16);

						for (var17 = 0; var17 < var12; ++var17)
							var16 += (int) (((long) anIntArray723[(var14 + var12) - 1 - var17]
									* (long) Class4.anIntArrayArray15[0][var17]) >> 16);

						for (var17 = 0; var17 < var14; ++var17)
							var16 -= (int) (((long) anIntArray723[var14 - 1 - var17]
									* (long) Class4.anIntArrayArray15[1][var17]) >> 16);

						anIntArray723[var14] = var16;
						var11 = aClass74_731.method339(var1 + 1);
						++var14;
					}

					var15 = 128;

					while (true) {
						if (var15 > (var1 - var12))
							var15 = var1 - var12;

						int var18;
						while (var14 < var15) {
							var17 = (int) (((long) anIntArray723[var14 + var12] * (long) Class4.anInt17) >> 16);

							for (var18 = 0; var18 < var12; ++var18)
								var17 += (int) (((long) anIntArray723[(var14 + var12) - 1 - var18]
										* (long) Class4.anIntArrayArray15[0][var18]) >> 16);

							for (var18 = 0; var18 < var13; ++var18)
								var17 -= (int) (((long) anIntArray723[var14 - 1 - var18]
										* (long) Class4.anIntArrayArray15[1][var18]) >> 16);

							anIntArray723[var14] = var17;
							var11 = aClass74_731.method339(var1 + 1);
							++var14;
						}

						if (var14 >= (var1 - var12)) {
							while (var14 < var1) {
								var17 = 0;

								for (var18 = (var14 + var12) - var1; var18 < var12; ++var18)
									var17 += (int) (((long) anIntArray723[(var14 + var12) - 1 - var18]
											* (long) Class4.anIntArrayArray15[0][var18]) >> 16);

								for (var18 = 0; var18 < var13; ++var18)
									var17 -= (int) (((long) anIntArray723[var14 - 1 - var18]
											* (long) Class4.anIntArrayArray15[1][var18]) >> 16);

								anIntArray723[var14] = var17;
								aClass74_731.method339(var1 + 1);
								++var14;
							}
							break;
						}

						var12 = aClass4_730.method30(0, var11 / 65536.0F);
						var13 = aClass4_730.method30(1, var11 / 65536.0F);
						var15 += 128;
					}
				}
			}

			for (var11 = 0; var11 < var1; ++var11) {
				if (anIntArray723[var11] < -32768)
					anIntArray723[var11] = -32768;

				if (anIntArray723[var11] > 32767)
					anIntArray723[var11] = 32767;
			}

			return anIntArray723;
		}
	}
}
