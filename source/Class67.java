public class Class67 {
	static Class61_Sub1 fs;
	static Widget aClass104_Sub12_556;
	int anInt552 = 0;
	int anInt550 = 0;
	int anInt551;
	int anInt554;
	public int[][] anIntArrayArray553;

	public void method303(int var1, int var2, final int var3, final int var4, final boolean var5) {
		var1 -= anInt552;
		var2 -= anInt550;
		if (var3 == 0) {
			if (var4 == 0) {
				method308(var1, var2, 128);
				method308(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				method308(var1, var2, 2);
				method308(var1, 1 + var2, 32);
			}

			if (var4 == 2) {
				method308(var1, var2, 8);
				method308(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				method308(var1, var2, 32);
				method308(var1, var2 - 1, 2);
			}
		}

		if ((var3 == 1) || (var3 == 3)) {
			if (var4 == 0) {
				method308(var1, var2, 1);
				method308(var1 - 1, 1 + var2, 16);
			}

			if (var4 == 1) {
				method308(var1, var2, 4);
				method308(var1 + 1, 1 + var2, 64);
			}

			if (var4 == 2) {
				method308(var1, var2, 16);
				method308(1 + var1, var2 - 1, 1);
			}

			if (var4 == 3) {
				method308(var1, var2, 64);
				method308(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method308(var1, var2, 130);
				method308(var1 - 1, var2, 8);
				method308(var1, 1 + var2, 32);
			}

			if (var4 == 1) {
				method308(var1, var2, 10);
				method308(var1, 1 + var2, 32);
				method308(1 + var1, var2, 128);
			}

			if (var4 == 2) {
				method308(var1, var2, 40);
				method308(var1 + 1, var2, 128);
				method308(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				method308(var1, var2, 160);
				method308(var1, var2 - 1, 2);
				method308(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method308(var1, var2, 65536);
					method308(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					method308(var1, var2, 1024);
					method308(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					method308(var1, var2, 4096);
					method308(1 + var1, var2, 65536);
				}

				if (var4 == 3) {
					method308(var1, var2, 16384);
					method308(var1, var2 - 1, 1024);
				}
			}

			if ((var3 == 1) || (var3 == 3)) {
				if (var4 == 0) {
					method308(var1, var2, 512);
					method308(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					method308(var1, var2, 2048);
					method308(1 + var1, var2 + 1, '\u8000');
				}

				if (var4 == 2) {
					method308(var1, var2, 8192);
					method308(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					method308(var1, var2, '\u8000');
					method308(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method308(var1, var2, 66560);
					method308(var1 - 1, var2, 4096);
					method308(var1, 1 + var2, 16384);
				}

				if (var4 == 1) {
					method308(var1, var2, 5120);
					method308(var1, 1 + var2, 16384);
					method308(1 + var1, var2, 65536);
				}

				if (var4 == 2) {
					method308(var1, var2, 20480);
					method308(1 + var1, var2, 65536);
					method308(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					method308(var1, var2, 81920);
					method308(var1, var2 - 1, 1024);
					method308(var1 - 1, var2, 4096);
				}
			}
		}

	}

	public void method304() {
		for (int var1 = 0; var1 < anInt551; ++var1)
			for (int var2 = 0; var2 < anInt554; ++var2)
				if ((var1 != 0) && (var2 != 0) && (var1 < (anInt551 - 5)) && (var2 < (anInt554 - 5)))
					anIntArrayArray553[var1][var2] = 16777216;
				else
					anIntArrayArray553[var1][var2] = 16777215;

	}

	public boolean method305(int var1, int var2, int var3, int var4, final int var5, final int var6) {
		if ((var3 == var1) && (var2 == var4))
			return true;
		else {
			var1 -= anInt552;
			var2 -= anInt550;
			var3 -= anInt552;
			var4 -= anInt550;
			if (var5 == 0)
				if (var6 == 0) {
					if (((var3 - 1) == var1) && (var4 == var2))
						return true;

					if ((var1 == var3) && (var2 == (var4 + 1)) && ((anIntArrayArray553[var1][var2] & 19661088) == 0))
						return true;

					if ((var3 == var1) && (var2 == (var4 - 1)) && ((anIntArrayArray553[var1][var2] & 19661058) == 0))
						return true;
				} else if (var6 == 1) {
					if ((var1 == var3) && (var2 == (var4 + 1)))
						return true;

					if ((var1 == (var3 - 1)) && (var4 == var2) && ((anIntArrayArray553[var1][var2] & 19661064) == 0))
						return true;

					if ((var1 == (1 + var3)) && (var2 == var4) && ((anIntArrayArray553[var1][var2] & 19661184) == 0))
						return true;
				} else if (var6 == 2) {
					if (((var3 + 1) == var1) && (var4 == var2))
						return true;

					if ((var3 == var1) && ((var4 + 1) == var2) && ((anIntArrayArray553[var1][var2] & 19661088) == 0))
						return true;

					if ((var1 == var3) && (var2 == (var4 - 1)) && ((anIntArrayArray553[var1][var2] & 19661058) == 0))
						return true;
				} else if (var6 == 3) {
					if ((var1 == var3) && ((var4 - 1) == var2))
						return true;

					if (((var3 - 1) == var1) && (var4 == var2) && ((anIntArrayArray553[var1][var2] & 19661064) == 0))
						return true;

					if (((1 + var3) == var1) && (var2 == var4) && ((anIntArrayArray553[var1][var2] & 19661184) == 0))
						return true;
				}

			if (var5 == 2)
				if (var6 == 0) {
					if ((var1 == (var3 - 1)) && (var4 == var2))
						return true;

					if ((var1 == var3) && (var2 == (var4 + 1)))
						return true;

					if (((var3 + 1) == var1) && (var4 == var2) && ((anIntArrayArray553[var1][var2] & 19661184) == 0))
						return true;

					if ((var3 == var1) && (var2 == (var4 - 1)) && ((anIntArrayArray553[var1][var2] & 19661058) == 0))
						return true;
				} else if (var6 == 1) {
					if ((var1 == (var3 - 1)) && (var2 == var4) && ((anIntArrayArray553[var1][var2] & 19661064) == 0))
						return true;

					if ((var3 == var1) && (var2 == (var4 + 1)))
						return true;

					if (((var3 + 1) == var1) && (var2 == var4))
						return true;

					if ((var3 == var1) && (var2 == (var4 - 1)) && ((anIntArrayArray553[var1][var2] & 19661058) == 0))
						return true;
				} else if (var6 == 2) {
					if ((var1 == (var3 - 1)) && (var2 == var4) && ((anIntArrayArray553[var1][var2] & 19661064) == 0))
						return true;

					if ((var3 == var1) && ((var4 + 1) == var2) && ((anIntArrayArray553[var1][var2] & 19661088) == 0))
						return true;

					if (((var3 + 1) == var1) && (var4 == var2))
						return true;

					if ((var3 == var1) && (var2 == (var4 - 1)))
						return true;
				} else if (var6 == 3) {
					if (((var3 - 1) == var1) && (var4 == var2))
						return true;

					if ((var1 == var3) && (var2 == (var4 + 1)) && ((anIntArrayArray553[var1][var2] & 19661088) == 0))
						return true;

					if ((var1 == (1 + var3)) && (var2 == var4) && ((anIntArrayArray553[var1][var2] & 19661184) == 0))
						return true;

					if ((var3 == var1) && ((var4 - 1) == var2))
						return true;
				}

			if (var5 == 9) {
				if ((var1 == var3) && (var2 == (var4 + 1)) && ((anIntArrayArray553[var1][var2] & 32) == 0))
					return true;

				if ((var1 == var3) && ((var4 - 1) == var2) && ((anIntArrayArray553[var1][var2] & 2) == 0))
					return true;

				if ((var1 == (var3 - 1)) && (var2 == var4) && ((anIntArrayArray553[var1][var2] & 8) == 0))
					return true;

				if ((var1 == (1 + var3)) && (var2 == var4) && ((anIntArrayArray553[var1][var2] & 128) == 0))
					return true;
			}

			return false;
		}
	}

	public void method306(int var1, int var2, final int var3, final int var4, final boolean var5) {
		int var6 = 256;
		if (var5)
			var6 += 131072;

		var1 -= anInt552;
		var2 -= anInt550;

		for (int var7 = var1; var7 < (var1 + var3); ++var7)
			if ((var7 >= 0) && (var7 < anInt551))
				for (int var8 = var2; var8 < (var4 + var2); ++var8)
					if ((var8 >= 0) && (var8 < anInt554))
						method308(var7, var8, var6);

	}

	public void method307(int var1, int var2) {
		var1 -= anInt552;
		var2 -= anInt550;
		anIntArrayArray553[var1][var2] |= 2097152;
	}

	void method308(final int var1, final int var2, final int var3) {
		anIntArrayArray553[var1][var2] |= var3;
	}

	public void method309(int var1, int var2, final int var3, final int var4, final boolean var5) {
		var1 -= anInt552;
		var2 -= anInt550;
		if (var3 == 0) {
			if (var4 == 0) {
				method314(var1, var2, 128);
				method314(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				method314(var1, var2, 2);
				method314(var1, 1 + var2, 32);
			}

			if (var4 == 2) {
				method314(var1, var2, 8);
				method314(1 + var1, var2, 128);
			}

			if (var4 == 3) {
				method314(var1, var2, 32);
				method314(var1, var2 - 1, 2);
			}
		}

		if ((var3 == 1) || (var3 == 3)) {
			if (var4 == 0) {
				method314(var1, var2, 1);
				method314(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				method314(var1, var2, 4);
				method314(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				method314(var1, var2, 16);
				method314(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				method314(var1, var2, 64);
				method314(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method314(var1, var2, 130);
				method314(var1 - 1, var2, 8);
				method314(var1, 1 + var2, 32);
			}

			if (var4 == 1) {
				method314(var1, var2, 10);
				method314(var1, var2 + 1, 32);
				method314(1 + var1, var2, 128);
			}

			if (var4 == 2) {
				method314(var1, var2, 40);
				method314(var1 + 1, var2, 128);
				method314(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				method314(var1, var2, 160);
				method314(var1, var2 - 1, 2);
				method314(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method314(var1, var2, 65536);
					method314(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					method314(var1, var2, 1024);
					method314(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					method314(var1, var2, 4096);
					method314(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					method314(var1, var2, 16384);
					method314(var1, var2 - 1, 1024);
				}
			}

			if ((var3 == 1) || (var3 == 3)) {
				if (var4 == 0) {
					method314(var1, var2, 512);
					method314(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					method314(var1, var2, 2048);
					method314(1 + var1, var2 + 1, '\u8000');
				}

				if (var4 == 2) {
					method314(var1, var2, 8192);
					method314(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					method314(var1, var2, '\u8000');
					method314(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method314(var1, var2, 66560);
					method314(var1 - 1, var2, 4096);
					method314(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					method314(var1, var2, 5120);
					method314(var1, 1 + var2, 16384);
					method314(1 + var1, var2, 65536);
				}

				if (var4 == 2) {
					method314(var1, var2, 20480);
					method314(1 + var1, var2, 65536);
					method314(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					method314(var1, var2, 81920);
					method314(var1, var2 - 1, 1024);
					method314(var1 - 1, var2, 4096);
				}
			}
		}

	}

	public void method310(int var1, int var2) {
		var1 -= anInt552;
		var2 -= anInt550;
		anIntArrayArray553[var1][var2] &= -262145;
	}

	public boolean method311(int var1, int var2, int var3, int var4, final int var5, int var6) {
		if ((var3 == var1) && (var2 == var4))
			return true;
		else {
			var1 -= anInt552;
			var2 -= anInt550;
			var3 -= anInt552;
			var4 -= anInt550;
			if ((var5 == 6) || (var5 == 7)) {
				if (var5 == 7)
					var6 = (2 + var6) & 3;

				if (var6 == 0) {
					if (((var3 + 1) == var1) && (var4 == var2) && ((anIntArrayArray553[var1][var2] & 128) == 0))
						return true;

					if ((var1 == var3) && ((var4 - 1) == var2) && ((anIntArrayArray553[var1][var2] & 2) == 0))
						return true;
				} else if (var6 == 1) {
					if (((var3 - 1) == var1) && (var4 == var2) && ((anIntArrayArray553[var1][var2] & 8) == 0))
						return true;

					if ((var1 == var3) && (var2 == (var4 - 1)) && ((anIntArrayArray553[var1][var2] & 2) == 0))
						return true;
				} else if (var6 == 2) {
					if ((var1 == (var3 - 1)) && (var4 == var2) && ((anIntArrayArray553[var1][var2] & 8) == 0))
						return true;

					if ((var3 == var1) && (var2 == (var4 + 1)) && ((anIntArrayArray553[var1][var2] & 32) == 0))
						return true;
				} else if (var6 == 3) {
					if ((var1 == (1 + var3)) && (var4 == var2) && ((anIntArrayArray553[var1][var2] & 128) == 0))
						return true;

					if ((var3 == var1) && (var2 == (1 + var4)) && ((anIntArrayArray553[var1][var2] & 32) == 0))
						return true;
				}
			}

			if (var5 == 8) {
				if ((var1 == var3) && (var2 == (var4 + 1)) && ((anIntArrayArray553[var1][var2] & 32) == 0))
					return true;

				if ((var3 == var1) && (var2 == (var4 - 1)) && ((anIntArrayArray553[var1][var2] & 2) == 0))
					return true;

				if (((var3 - 1) == var1) && (var2 == var4) && ((anIntArrayArray553[var1][var2] & 8) == 0))
					return true;

				if ((var1 == (1 + var3)) && (var4 == var2) && ((anIntArrayArray553[var1][var2] & 128) == 0))
					return true;
			}

			return false;
		}
	}

	public boolean method312(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		final int var8 = (var3 + var5) - 1;
		final int var9 = (var4 + var6) - 1;
		return (var1 >= var3) && (var1 <= var8) && (var2 >= var4) && (var2 <= var9) ? true
				: ((var1 == (var3 - 1)) && (var2 >= var4) && (var2 <= var9)
						&& ((anIntArrayArray553[var1 - anInt552][var2 - anInt550] & 8) == 0) && ((var7 & 8) == 0)
								? true
								: ((var1 == (1 + var8)) && (var2 >= var4) && (var2 <= var9)
										&& ((anIntArrayArray553[var1 - anInt552][var2 - anInt550] & 128) == 0)
										&& ((var7
												& 2) == 0)
														? true
														: ((var2 == (var4 - 1)) && (var1 >= var3) && (var1 <= var8)
																&& ((anIntArrayArray553[var1 - anInt552][var2
																		- anInt550] & 2) == 0)
																&& ((var7 & 4) == 0)
																		? true
																		: ((1 + var9) == var2) && (var1 >= var3)
																				&& (var1 <= var8)
																				&& ((anIntArrayArray553[var1
																						- anInt552][var2 - anInt550]
																						& 32) == 0)
																				&& ((var7 & 1) == 0))));
	}

	public void method313(int var1, int var2) {
		var1 -= anInt552;
		var2 -= anInt550;
		anIntArrayArray553[var1][var2] |= 262144;
	}

	void method314(final int var1, final int var2, final int var3) {
		anIntArrayArray553[var1][var2] &= ~var3;
	}

	public void method315(int var1, int var2, int var3, int var4, final int var5, final boolean var6) {
		int var7 = 256;
		if (var6)
			var7 += 131072;

		var1 -= anInt552;
		var2 -= anInt550;
		int var8;
		if ((var5 == 1) || (var5 == 3)) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < (var3 + var1); ++var8)
			if ((var8 >= 0) && (var8 < anInt551))
				for (int var9 = var2; var9 < (var2 + var4); ++var9)
					if ((var9 >= 0) && (var9 < anInt554))
						method314(var8, var9, var7);

	}

	public Class67(final int var1, final int var2) {
		anInt551 = var1;
		anInt554 = var2;
		anIntArrayArray553 = new int[anInt551][anInt554];
		method304();
	}

	public static byte[] method316(final CharSequence var0) {
		final int var1 = var0.length();
		final byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			final char var4 = var0.charAt(var3);
			if (((var4 <= 0) || (var4 >= 128)) && ((var4 < 160) || (var4 > 255))) {
				if (var4 == 8364)
					var2[var3] = -128;
				else if (var4 == 8218)
					var2[var3] = -126;
				else if (var4 == 402)
					var2[var3] = -125;
				else if (var4 == 8222)
					var2[var3] = -124;
				else if (var4 == 8230)
					var2[var3] = -123;
				else if (var4 == 8224)
					var2[var3] = -122;
				else if (var4 == 8225)
					var2[var3] = -121;
				else if (var4 == 710)
					var2[var3] = -120;
				else if (var4 == 8240)
					var2[var3] = -119;
				else if (var4 == 352)
					var2[var3] = -118;
				else if (var4 == 8249)
					var2[var3] = -117;
				else if (var4 == 338)
					var2[var3] = -116;
				else if (var4 == 381)
					var2[var3] = -114;
				else if (var4 == 8216)
					var2[var3] = -111;
				else if (var4 == 8217)
					var2[var3] = -110;
				else if (var4 == 8220)
					var2[var3] = -109;
				else if (var4 == 8221)
					var2[var3] = -108;
				else if (var4 == 8226)
					var2[var3] = -107;
				else if (var4 == 8211)
					var2[var3] = -106;
				else if (var4 == 8212)
					var2[var3] = -105;
				else if (var4 == 732)
					var2[var3] = -104;
				else if (var4 == 8482)
					var2[var3] = -103;
				else if (var4 == 353)
					var2[var3] = -102;
				else if (var4 == 8250)
					var2[var3] = -101;
				else if (var4 == 339)
					var2[var3] = -100;
				else if (var4 == 382)
					var2[var3] = -98;
				else if (var4 == 376)
					var2[var3] = -97;
				else
					var2[var3] = 63;
			} else
				var2[var3] = (byte) var4;
		}

		return var2;
	}

	static void method317(final int var0) {
		if ((var0 == -1) && !client.aBool2041)
			Class28.method138();
		else if ((var0 != -1) && (var0 != client.anInt2023) && (client.anInt2022 != 0) && !client.aBool2041)
			Class86.method393(2, Class27.aClass61_Sub1_264, var0, 0, client.anInt2022, false);

		client.anInt2023 = var0;
	}

	static final String method318(final int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}

	public static int tohash(final CharSequence var0) {
		final int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3)
			var2 = ((var2 << 5) - var2) + ISAAC.method177(var0.charAt(var3));

		return var2;
	}
}
