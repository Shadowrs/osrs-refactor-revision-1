import java.io.IOException;
import java.net.Socket;

public class Class104_Sub8_Sub4 extends Class104_Sub8 {
	Class59 aClass59_1321 = new Class59();
	Class104_Sub8_Sub2 aClass104_Sub8_Sub2_1320 = new Class104_Sub8_Sub2();
	Class104_Sub8_Sub1 aClass104_Sub8_Sub1_1322;

	@Override
	int method514() {
		return 0;
	}

	@Override
	Class104_Sub8 method512() {
		final Class104_Sub15 var1 = (Class104_Sub15) aClass59_1321.method251();
		return null == var1 ? null
				: (null != var1.aClass104_Sub8_Sub3_1120 ? var1.aClass104_Sub8_Sub3_1120 : method513());
	}

	@Override
	Class104_Sub8 method513() {
		Class104_Sub15 var1;
		do {
			var1 = (Class104_Sub15) aClass59_1321.method252();
			if (var1 == null)
				return null;
		} while (null == var1.aClass104_Sub8_Sub3_1120);

		return var1.aClass104_Sub8_Sub3_1120;
	}

	@Override
	void method516(final int var1) {
		aClass104_Sub8_Sub2_1320.method516(var1);

		for (Class104_Sub15 var2 = (Class104_Sub15) aClass59_1321
				.method251(); var2 != null; var2 = (Class104_Sub15) aClass59_1321.method252())
			if (!aClass104_Sub8_Sub1_1322.method654(var2)) {
				int var3 = var1;

				do {
					if (var3 <= var2.anInt1121) {
						method736(var2, var3);
						var2.anInt1121 -= var3;
						break;
					}

					method736(var2, var2.anInt1121);
					var3 -= var2.anInt1121;
				} while (!aClass104_Sub8_Sub1_1322.method662(var2, (int[]) null, 0, var3));
			}

	}

	void method735(final Class104_Sub15 var1, final int[] var2, int var3, int var4, final int var5) {
		if (((aClass104_Sub8_Sub1_1322.anIntArray1211[var1.anInt1117] & 4) != 0) && (var1.anInt1102 < 0)) {
			final int var6 = aClass104_Sub8_Sub1_1322.anIntArray1217[var1.anInt1117] / Class99.anInt777;

			while (true) {
				final int var7 = ((1048575 + var6) - var1.anInt1122) / var6;
				if (var7 > var4) {
					var1.anInt1122 += var6 * var4;
					break;
				}

				var1.aClass104_Sub8_Sub3_1120.method515(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.anInt1122 += (var7 * var6) - 1048576;
				int var8 = Class99.anInt777 / 100;
				final int var9 = 262144 / var6;
				if (var9 < var8)
					var8 = var9;

				final Class104_Sub8_Sub3 var10 = var1.aClass104_Sub8_Sub3_1120;
				if (aClass104_Sub8_Sub1_1322.anIntArray1209[var1.anInt1117] == 0)
					var1.aClass104_Sub8_Sub3_1120 = Class104_Sub8_Sub3.method690(var1.aClass104_Sub4_Sub1_1116,
							var10.method703(), var10.method694(), var10.method695());
				else {
					var1.aClass104_Sub8_Sub3_1120 = Class104_Sub8_Sub3.method690(var1.aClass104_Sub4_Sub1_1116,
							var10.method703(), 0, var10.method695());
					aClass104_Sub8_Sub1_1322.method641(var1,
							var1.aClass104_Sub11_1103.aShortArray968[var1.anInt1107] < 0);
					var1.aClass104_Sub8_Sub3_1120.method699(var8, var10.method694());
				}

				if (var1.aClass104_Sub11_1103.aShortArray968[var1.anInt1107] < 0)
					var1.aClass104_Sub8_Sub3_1120.method692(-1);

				var10.method709(var8);
				var10.method515(var2, var3, var5 - var3);
				if (var10.method704())
					aClass104_Sub8_Sub2_1320.method666(var10);
			}
		}

		var1.aClass104_Sub8_Sub3_1120.method515(var2, var3, var4);
	}

	void method736(final Class104_Sub15 var1, int var2) {
		if (((aClass104_Sub8_Sub1_1322.anIntArray1211[var1.anInt1117] & 4) != 0) && (var1.anInt1102 < 0)) {
			final int var3 = aClass104_Sub8_Sub1_1322.anIntArray1217[var1.anInt1117] / Class99.anInt777;
			final int var4 = ((var3 + 1048575) - var1.anInt1122) / var3;
			var1.anInt1122 = (var1.anInt1122 + (var3 * var2)) & 1048575;
			if (var4 <= var2) {
				if (aClass104_Sub8_Sub1_1322.anIntArray1209[var1.anInt1117] == 0)
					var1.aClass104_Sub8_Sub3_1120 = Class104_Sub8_Sub3.method690(var1.aClass104_Sub4_Sub1_1116,
							var1.aClass104_Sub8_Sub3_1120.method703(), var1.aClass104_Sub8_Sub3_1120.method694(),
							var1.aClass104_Sub8_Sub3_1120.method695());
				else {
					var1.aClass104_Sub8_Sub3_1120 = Class104_Sub8_Sub3.method690(var1.aClass104_Sub4_Sub1_1116,
							var1.aClass104_Sub8_Sub3_1120.method703(), 0, var1.aClass104_Sub8_Sub3_1120.method695());
					aClass104_Sub8_Sub1_1322.method641(var1,
							var1.aClass104_Sub11_1103.aShortArray968[var1.anInt1107] < 0);
				}

				if (var1.aClass104_Sub11_1103.aShortArray968[var1.anInt1107] < 0)
					var1.aClass104_Sub8_Sub3_1120.method692(-1);

				var2 = var1.anInt1122 / var3;
			}
		}

		var1.aClass104_Sub8_Sub3_1120.method516(var2);
	}

	@Override
	void method515(final int[] var1, final int var2, final int var3) {
		aClass104_Sub8_Sub2_1320.method515(var1, var2, var3);

		for (Class104_Sub15 var4 = (Class104_Sub15) aClass59_1321
				.method251(); null != var4; var4 = (Class104_Sub15) aClass59_1321.method252())
			if (!aClass104_Sub8_Sub1_1322.method654(var4)) {
				int var5 = var2;
				int var6 = var3;

				do {
					if (var6 <= var4.anInt1121) {
						method735(var4, var1, var5, var6, var6 + var5);
						var4.anInt1121 -= var6;
						break;
					}

					method735(var4, var1, var5, var4.anInt1121, var6 + var5);
					var5 += var4.anInt1121;
					var6 -= var4.anInt1121;
				} while (!aClass104_Sub8_Sub1_1322.method662(var4, var1, var5, var6));
			}

	}

	Class104_Sub8_Sub4(final Class104_Sub8_Sub1 var1) {
		aClass104_Sub8_Sub1_1322 = var1;
	}

	static final void method737() {
		try {
			if (client.anInt1823 == 0) {
				if (Class20.aClass13_205 != null) {
					Class20.aClass13_205.method52();
					Class20.aClass13_205 = null;
				}

				Class49.aClass8_416 = null;
				client.aBool1840 = false;
				client.anInt1824 = 0;
				client.anInt1823 = 1;
			}

			if (client.anInt1823 == 1) {
				if (null == Class49.aClass8_416)
					Class49.aClass8_416 = Applet_Sub1.aClass11_1760.method47(Class57.aString466, Class87.anInt699);

				if (Class49.aClass8_416.anInt46 == 2)
					throw new IOException();

				if (Class49.aClass8_416.anInt46 == 1) {
					Class20.aClass13_205 = new Class13((Socket) Class49.aClass8_416.anObject50,
							Applet_Sub1.aClass11_1760);
					Class49.aClass8_416 = null;
					client.anInt1823 = 2;
				}
			}

			if (client.anInt1823 == 2) {
				client.aClass104_Sub21_Sub1_1825.anInt1172 = 0;
				client.aClass104_Sub21_Sub1_1825.method561(14);
				Class20.aClass13_205.method54(client.aClass104_Sub21_Sub1_1825.aByteArray1174, 0, 1);
				client.aClass104_Sub21_Sub1_1963.anInt1172 = 0;
				client.anInt1823 = 3;
			}

			int var0;
			if (client.anInt1823 == 3) {
				if (Class76.aClass99_620 != null)
					Class76.aClass99_620.method447();

				if (null != Class102_Sub1.aClass99_895)
					Class102_Sub1.aClass99_895.method447();

				var0 = Class20.aClass13_205.method55();
				if (null != Class76.aClass99_620)
					Class76.aClass99_620.method447();

				if (null != Class102_Sub1.aClass99_895)
					Class102_Sub1.aClass99_895.method447();

				if (var0 != 0) {
					Class31.method148(var0);
					return;
				}

				client.aClass104_Sub21_Sub1_1963.anInt1172 = 0;
				client.anInt1823 = 5;
			}

			int var2;
			if (client.anInt1823 == 5) {
				final int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D) };
				client.aClass104_Sub21_Sub1_1825.anInt1172 = 0;
				client.aClass104_Sub21_Sub1_1825.method561(10);
				client.aClass104_Sub21_Sub1_1825.method619(var1[0]);
				client.aClass104_Sub21_Sub1_1825.method619(var1[1]);
				client.aClass104_Sub21_Sub1_1825.method619(var1[2]);
				client.aClass104_Sub21_Sub1_1825.method619(var1[3]);
				client.aClass104_Sub21_Sub1_1825.method562(0L);
				client.aClass104_Sub21_Sub1_1825.method563(Class66.aString522);
				client.aClass104_Sub21_Sub1_1825.method582(Class60.aBigInteger476, Class60.aBigInteger477);
				client.aClass104_Sub21_Sub1_2002.anInt1172 = 0;
				if (client.anInt1806 == 40)
					client.aClass104_Sub21_Sub1_2002.method561(18);
				else
					client.aClass104_Sub21_Sub1_2002.method561(16);

				client.aClass104_Sub21_Sub1_2002.method603(0);
				var2 = client.aClass104_Sub21_Sub1_2002.anInt1172;
				client.aClass104_Sub21_Sub1_2002.method619(1);
				client.aClass104_Sub21_Sub1_2002.method615(client.aClass104_Sub21_Sub1_1825.aByteArray1174, 0,
						client.aClass104_Sub21_Sub1_1825.anInt1172);
				final int var3 = client.aClass104_Sub21_Sub1_2002.anInt1172;
				client.aClass104_Sub21_Sub1_2002.method563(Class66.aString543);
				client.aClass104_Sub21_Sub1_2002.method561(client.aBool1794 ? 1 : 0);
				Class76.method343(client.aClass104_Sub21_Sub1_2002);
				client.aClass104_Sub21_Sub1_2002.method619(Class27.aClass61_Sub1_263.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class104_Sub20.aClass61_Sub1_1171.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class52.aClass61_Sub1_430.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class29.aClass61_Sub1_278.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class103.aClass61_Sub1_818.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class67.aClass61_Sub1_555.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class27.aClass61_Sub1_264.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class1.aClass61_Sub1_2.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(client.aClass61_Sub1_1820.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(client.aClass61_Sub1_1838.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class2.aClass61_Sub1_9.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class106.aClass61_Sub1_827.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class85.aClass61_Sub1_671.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class65.aClass61_Sub1_515.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class104_Sub18_Sub6.aClass61_Sub1_1374.anInt489);
				client.aClass104_Sub21_Sub1_2002.method619(Class100.aClass61_Sub1_800.anInt489);
				client.aClass104_Sub21_Sub1_2002.method618(var1, var3, client.aClass104_Sub21_Sub1_2002.anInt1172);
				client.aClass104_Sub21_Sub1_2002.method610(client.aClass104_Sub21_Sub1_2002.anInt1172 - var2);
				Class20.aClass13_205.method54(client.aClass104_Sub21_Sub1_2002.aByteArray1174, 0,
						client.aClass104_Sub21_Sub1_2002.anInt1172);
				client.aClass104_Sub21_Sub1_1825.method627(var1);

				for (int var4 = 0; var4 < 4; ++var4)
					var1[var4] += 50;

				client.aClass104_Sub21_Sub1_1963.method627(var1);
				client.anInt1823 = 6;
			}

			if ((client.anInt1823 == 6) && (Class20.aClass13_205.method53() > 0)) {
				var0 = Class20.aClass13_205.method55();
				if ((var0 == 21) && (client.anInt1806 == 20))
					client.anInt1823 = 7;
				else if (var0 == 2)
					client.anInt1823 = 9;
				else {
					if ((var0 == 15) && (client.anInt1806 == 40)) {
						client.aClass104_Sub21_Sub1_1825.anInt1172 = 0;
						client.aClass104_Sub21_Sub1_1963.anInt1172 = 0;
						client.anInt1790 = -1;
						client.anInt1837 = -1;
						client.anInt2042 = -1;
						client.anInt1815 = -1;
						client.anInt1929 = 0;
						client.anInt1834 = 0;
						client.anInt1879 = 0;
						client.anInt1805 = 0;
						client.aBool1930 = false;
						client.anInt2021 = 0;
						client.anInt2018 = 0;

						for (var2 = 0; var2 < client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937.length; ++var2)
							if (client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var2] != null)
								client.aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var2].anInt1716 = -1;

						for (var2 = 0; var2 < client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828.length; ++var2)
							if (client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var2] != null)
								client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var2].anInt1716 = -1;

						Class104_Sub2.aClass58_857 = new Class58(32);
						Class10.method40(30);

						for (var2 = 0; var2 < 100; ++var2)
							client.aBoolArray2027[var2] = true;

						return;
					}

					if ((var0 != 23) || (client.anInt1968 >= 1)) {
						Class31.method148(var0);
						return;
					}

					++client.anInt1968;
					client.anInt1823 = 0;
				}
			}

			if ((client.anInt1823 == 7) && (Class20.aClass13_205.method53() > 0)) {
				client.anInt1826 = (Class20.aClass13_205.method55() + 3) * 60;
				client.anInt1823 = 8;
			}

			if (client.anInt1823 == 8) {
				client.anInt1824 = 0;
				Class104_Sub18_Sub2.method680("You have only just left another world.",
						"Your profile will be transferred in:", (client.anInt1826 / 60) + " seconds.");
				if (--client.anInt1826 <= 0)
					client.anInt1823 = 0;

			} else {
				if ((client.anInt1823 == 9) && (Class20.aClass13_205.method53() >= 8)) {
					client.anInt1915 = Class20.aClass13_205.method55();
					client.aBool1955 = Class20.aClass13_205.method55() == 1;
					client.anInt1874 = Class20.aClass13_205.method55();
					client.anInt1874 <<= 8;
					client.anInt1874 += Class20.aClass13_205.method55();
					client.anInt1990 = Class20.aClass13_205.method55();
					Class20.aClass13_205.method51(client.aClass104_Sub21_Sub1_1963.aByteArray1174, 0, 1);
					client.aClass104_Sub21_Sub1_1963.anInt1172 = 0;
					client.anInt1790 = client.aClass104_Sub21_Sub1_1963.method628();
					Class20.aClass13_205.method51(client.aClass104_Sub21_Sub1_1963.aByteArray1174, 0, 2);
					client.aClass104_Sub21_Sub1_1963.anInt1172 = 0;
					client.anInt1929 = client.aClass104_Sub21_Sub1_1963.method571();
					client.anInt1823 = 10;
				}

				if (client.anInt1823 == 10) {
					if (Class20.aClass13_205.method53() >= client.anInt1929) {
						client.aClass104_Sub21_Sub1_1963.anInt1172 = 0;
						Class20.aClass13_205.method51(client.aClass104_Sub21_Sub1_1963.aByteArray1174, 0,
								client.anInt1929);
						Class102_Sub1.method495();
						Class54.anInt447 = -1;
						Class95.method424(false);
						client.anInt1790 = -1;
					}

				} else {
					++client.anInt1824;
					if (client.anInt1824 > 2000)
						if (client.anInt1968 < 1) {
							if (Class104_Sub3.anInt879 == Class87.anInt699)
								Class87.anInt699 = Class60.anInt478;
							else
								Class87.anInt699 = Class104_Sub3.anInt879;

							++client.anInt1968;
							client.anInt1823 = 0;
						} else
							Class31.method148(-3);
				}
			}
		} catch (final IOException var5) {
			if (client.anInt1968 < 1) {
				if (Class104_Sub3.anInt879 == Class87.anInt699)
					Class87.anInt699 = Class60.anInt478;
				else
					Class87.anInt699 = Class104_Sub3.anInt879;

				++client.anInt1968;
				client.anInt1823 = 0;
			} else
				Class31.method148(-2);
		}
	}

	static void method738(final int var0, final int var1, final int var2, final int var3) {
		for (Class104_Sub1 var4 = (Class104_Sub1) Class104_Sub1.aClass59_849
				.method251(); null != var4; var4 = (Class104_Sub1) Class104_Sub1.aClass59_849.method252())
			if ((var4.anInt845 != -1) || (var4.anIntArray841 != null)) {
				int var5 = 0;
				if (var1 > var4.anInt842)
					var5 += var1 - var4.anInt842;
				else if (var1 < var4.anInt846)
					var5 += var4.anInt846 - var1;

				if (var2 > var4.anInt847)
					var5 += var2 - var4.anInt847;
				else if (var2 < var4.anInt843)
					var5 += var4.anInt843 - var2;

				if (((var5 - 64) <= var4.anInt844) && (client.anInt2026 != 0) && (var0 == var4.anInt839)) {
					var5 -= 64;
					if (var5 < 0)
						var5 = 0;

					final int var6 = ((var4.anInt844 - var5) * client.anInt2026) / var4.anInt844;
					if (null == var4.aClass104_Sub8_Sub3_840) {
						if (var4.anInt845 >= 0) {
							final Class82 var7 = Class82.method359(Class103.aClass61_Sub1_818, var4.anInt845, 0);
							if (null != var7) {
								final Class104_Sub4_Sub1 var8 = var7.method356()
										.method689(Class104_Sub21.aClass84_1175);
								final Class104_Sub8_Sub3 var9 = Class104_Sub8_Sub3.method727(var8, 100, var6);
								var9.method692(-1);
								Class79.aClass104_Sub8_Sub2_630.method666(var9);
								var4.aClass104_Sub8_Sub3_840 = var9;
							}
						}
					} else
						var4.aClass104_Sub8_Sub3_840.method717(var6);

					if (var4.aClass104_Sub8_Sub3_851 == null) {
						if ((null != var4.anIntArray841) && ((var4.anInt850 -= var3) <= 0)) {
							final int var10 = (int) (Math.random() * var4.anIntArray841.length);
							final Class82 var12 = Class82.method359(Class103.aClass61_Sub1_818,
									var4.anIntArray841[var10], 0);
							if (var12 != null) {
								final Class104_Sub4_Sub1 var13 = var12.method356()
										.method689(Class104_Sub21.aClass84_1175);
								final Class104_Sub8_Sub3 var11 = Class104_Sub8_Sub3.method727(var13, 100, var6);
								var11.method692(0);
								Class79.aClass104_Sub8_Sub2_630.method666(var11);
								var4.aClass104_Sub8_Sub3_851 = var11;
								var4.anInt850 = var4.anInt838 + (int) (Math.random() * (var4.anInt848 - var4.anInt838));
							}
						}
					} else {
						var4.aClass104_Sub8_Sub3_851.method717(var6);
						if (!var4.aClass104_Sub8_Sub3_851.method471())
							var4.aClass104_Sub8_Sub3_851 = null;
					}
				} else {
					if (var4.aClass104_Sub8_Sub3_840 != null) {
						Class79.aClass104_Sub8_Sub2_630.method667(var4.aClass104_Sub8_Sub3_840);
						var4.aClass104_Sub8_Sub3_840 = null;
					}

					if (null != var4.aClass104_Sub8_Sub3_851) {
						Class79.aClass104_Sub8_Sub2_630.method667(var4.aClass104_Sub8_Sub3_851);
						var4.aClass104_Sub8_Sub3_851 = null;
					}
				}
			}

	}

	public static void method739(final Class104_Sub21 var0, final int var1) {
		if (Class24.aClass96_241 != null)
			try {
				Class24.aClass96_241.method428(0L);
				Class24.aClass96_241.method434(var0.aByteArray1174, var1, 24);
			} catch (final Exception var3) {
				;
			}

	}
}