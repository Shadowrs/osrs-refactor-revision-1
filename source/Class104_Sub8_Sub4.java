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

	static final void login() {
		try {
			if (client.step == 0) {
				if (Class20.stream != null) {
					Class20.stream.destory();
					Class20.stream = null;
				}

				Class49.aClass8_416 = null;
				client.aBool1840 = false;
				client.anInt1824 = 0;
				client.step = 1;
			}

			if (client.step == 1) {
				if (null == Class49.aClass8_416)
					Class49.aClass8_416 = Applet_Sub1.aClass11_1760.method47(Class57.aString466, Class87.anInt699);

				if (Class49.aClass8_416.anInt46 == 2)
					throw new IOException();

				if (Class49.aClass8_416.anInt46 == 1) {
					Class20.stream = new Class13((Socket) Class49.aClass8_416.anObject50,
							Applet_Sub1.aClass11_1760);
					Class49.aClass8_416 = null;
					client.step = 2;
				}
			}

			if (client.step == 2) {
				client.secureBuf.pos = 0;
				client.secureBuf.writebyte(14);
				Class20.stream.flushbytes(client.secureBuf.backing, 0, 1);
				client.gamecon.pos = 0;
				client.step = 3;
			}

			int code;
			if (client.step == 3) {
				if (Class76.aClass99_620 != null)
					Class76.aClass99_620.method447();

				if (null != Class102_Sub1.aClass99_895)
					Class102_Sub1.aClass99_895.method447();

				code = Class20.stream.read();
				if (null != Class76.aClass99_620)
					Class76.aClass99_620.method447();

				if (null != Class102_Sub1.aClass99_895)
					Class102_Sub1.aClass99_895.method447();

				if (code != 0) {
					client.showResponce(code);
					return;
				}

				client.gamecon.pos = 0;
				client.step = 5;
			}

			int var2;
			if (client.step == 5) {
				final int[] issackeys = new int[] { (int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D) };
				client.secureBuf.pos = 0;
				client.secureBuf.writebyte(10);
				client.secureBuf.writeInt(issackeys[0]);
				client.secureBuf.writeInt(issackeys[1]);
				client.secureBuf.writeInt(issackeys[2]);
				client.secureBuf.writeInt(issackeys[3]);
				client.secureBuf.writeLong(0L);
				client.secureBuf.writeString(Class66.aString522);
				client.secureBuf.doRSA(Class60.aBigInteger476, Class60.aBigInteger477);
				client.loginbuf.pos = 0;
				if (client.loadstage == 40)
					client.loginbuf.writebyte(18); // reconnect
				else
					client.loginbuf.writebyte(16); // main login

				client.loginbuf.writeShort(0); // dummy value
				var2 = client.loginbuf.pos; // remember position 
				client.loginbuf.writeInt(1); // CLIENT REVISION  - rev 1
				client.loginbuf.appendBytes(client.secureBuf.backing, 0, client.secureBuf.pos);
				final int var3 = client.loginbuf.pos;
				client.loginbuf.writeString(Class66.aString543);
				client.loginbuf.writebyte(client.lowmvm ? 1 : 0);
				Class76.method343(client.loginbuf);
				client.loginbuf.writeInt(Class27.aClass61_Sub1_263.anInt489);
				client.loginbuf.writeInt(Class104_Sub20.aClass61_Sub1_1171.anInt489);
				client.loginbuf.writeInt(Class52.aClass61_Sub1_430.anInt489);
				client.loginbuf.writeInt(Class29.aClass61_Sub1_278.anInt489);
				client.loginbuf.writeInt(Class103.aClass61_Sub1_818.anInt489);
				client.loginbuf.writeInt(Class67.fs.anInt489);
				client.loginbuf.writeInt(Class27.aClass61_Sub1_264.anInt489);
				client.loginbuf.writeInt(Class1.aClass61_Sub1_2.anInt489);
				client.loginbuf.writeInt(client.aClass61_Sub1_1820.anInt489);
				client.loginbuf.writeInt(client.aClass61_Sub1_1838.anInt489);
				client.loginbuf.writeInt(Class2.aClass61_Sub1_9.anInt489);
				client.loginbuf.writeInt(Class106.aClass61_Sub1_827.anInt489);
				client.loginbuf.writeInt(Class85.aClass61_Sub1_671.anInt489);
				client.loginbuf.writeInt(Class65.aClass61_Sub1_515.anInt489);
				client.loginbuf.writeInt(ObjectDefinition.aClass61_Sub1_1374.anInt489);
				client.loginbuf.writeInt(Class100.aClass61_Sub1_800.anInt489);
				client.loginbuf.applyIsaac(issackeys, var3, client.loginbuf.pos);
				client.loginbuf.writeShortLE(client.loginbuf.pos - var2);
				Class20.stream.flushbytes(client.loginbuf.backing, 0, client.loginbuf.pos);
				client.secureBuf.setisaac(issackeys);

				for (int var4 = 0; var4 < 4; ++var4)
					issackeys[var4] += 50;

				client.gamecon.setisaac(issackeys);
				client.step = 6;
			}

			if ((client.step == 6) && (Class20.stream.avail() > 0)) {
				code = Class20.stream.read();
				if ((code == 21) && (client.loadstage == 20))
					client.step = 7;
				else if (code == 2)
					client.step = 9;
				else {
					if ((code == 15) && (client.loadstage == 40)) {
						client.secureBuf.pos = 0;
						client.gamecon.pos = 0;
						client.pktOpc = -1;
						client.anInt1837 = -1;
						client.anInt2042 = -1;
						client.anInt1815 = -1;
						client.pktSize = 0;
						client.anInt1834 = 0;
						client.anInt1879 = 0;
						client.anInt1805 = 0;
						client.aBool1930 = false;
						client.anInt2021 = 0;
						client.anInt2018 = 0;

						for (var2 = 0; var2 < client.localNpcs.length; ++var2)
							if (client.localNpcs[var2] != null)
								client.localNpcs[var2].anInt1716 = -1;

						for (var2 = 0; var2 < client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828.length; ++var2)
							if (client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var2] != null)
								client.aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var2].anInt1716 = -1;

						Class104_Sub2.aClass58_857 = new Class58(32);
						Class10.method40(30);

						for (var2 = 0; var2 < 100; ++var2)
							client.rsfacesFlag[var2] = true;

						return;
					}

					if ((code != 23) || (client.anInt1968 >= 1)) {
						client.showResponce(code);
						return;
					}

					++client.anInt1968;
					client.step = 0;
				}
			}

			if ((client.step == 7) && (Class20.stream.avail() > 0)) {
				client.anInt1826 = (Class20.stream.read() + 3) * 60;
				client.step = 8;
			}

			if (client.step == 8) {
				client.anInt1824 = 0;
				Class104_Sub18_Sub2.drawlogin("You have only just left another world.",
						"Your profile will be transferred in:", (client.anInt1826 / 60) + " seconds.");
				if (--client.anInt1826 <= 0)
					client.step = 0;

			} else {
				if ((client.step == 9) && (Class20.stream.avail() >= 8)) {
					client.anInt1915 = Class20.stream.read();
					client.aBool1955 = Class20.stream.read() == 1;
					client.anInt1874 = Class20.stream.read(); // pid left half
					client.anInt1874 <<= 8;
					client.anInt1874 += Class20.stream.read(); // pid right half
					client.anInt1990 = Class20.stream.read();
					Class20.stream.readbytes(client.gamecon.backing, 0, 1);
					client.gamecon.pos = 0;
					client.pktOpc = client.gamecon.opcode(); // packet opcode
					Class20.stream.readbytes(client.gamecon.backing, 0, 2);
					client.gamecon.pos = 0;
					client.pktSize = client.gamecon.readLEShort();
					client.step = 10;
				}

				if (client.step == 10) {
					if (Class20.stream.avail() >= client.pktSize) {
						client.gamecon.pos = 0;
						Class20.stream.readbytes(client.gamecon.backing, 0, client.pktSize);
						Class102_Sub1.reset();
						Class54.anInt447 = -1;
						Class95.readregionpacket(false);
						client.pktOpc = -1;
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
							client.step = 0;
						} else
							client.showResponce(-3);
				}
			}
		} catch (final IOException var5) {
			if (client.anInt1968 < 1) {
				if (Class104_Sub3.anInt879 == Class87.anInt699)
					Class87.anInt699 = Class60.anInt478;
				else
					Class87.anInt699 = Class104_Sub3.anInt879;

				++client.anInt1968;
				client.step = 0;
			} else
				client.showResponce(-2);
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
										.method689(RSBuf.aClass84_1175);
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
										.method689(RSBuf.aClass84_1175);
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

	public static void method739(final RSBuf var0, final int var1) {
		if (Class24.aClass96_241 != null)
			try {
				Class24.aClass96_241.method428(0L);
				Class24.aClass96_241.method434(var0.backing, var1, 24);
			} catch (final Exception var3) {
				;
			}

	}
}
