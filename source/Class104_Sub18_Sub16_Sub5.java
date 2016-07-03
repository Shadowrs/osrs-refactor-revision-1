public class Class104_Sub18_Sub16_Sub5 extends Class104_Sub18_Sub16 {
	int anInt1631 = 0;
	int anInt1628 = 0;
	byte aByte1637 = 0;
	boolean aBool1660 = false;
	int anInt1629;
	int[] anIntArray1626;
	int[] anIntArray1627;
	int[] anIntArray1664;
	int[] anIntArray1630;
	int[] anIntArray1642;
	byte[] aByteArray1632;
	byte[] aByteArray1633;
	byte[] aByteArray1662;
	byte[] aByteArray1635;
	short[] aShortArray1657;
	short[] aShortArray1658;
	byte[] aByteArray1640;
	short[] aShortArray1641;
	short[] aShortArray1634;
	short[] aShortArray1643;
	short[] aShortArray1644;
	short[] aShortArray1645;
	short[] aShortArray1646;
	short[] aShortArray1647;
	byte[] aByteArray1650;
	short[] aShortArray1648;
	short[] aShortArray1649;
	int[] anIntArray1666;
	int[] anIntArray1652;
	int[][] anIntArrayArray1653;
	int[][] anIntArrayArray1654;
	public short aShort1661;
	public short aShort1659;
	int[] anIntArray1625;
	Class15[] aClass15Array1656;
	Class7[] aClass7Array1655;
	int anInt1624;
	int anInt1639;
	int anInt1663;
	int anInt1651;
	int anInt1665;
	static int anInt1668 = 0;
	Class15[] aClass15Array1638;
	static int[] anIntArray1636 = new int[10000];
	static int[] anIntArray1667 = new int[10000];
	static int[] anIntArray1669;
	static int[] anIntArray1670;

	Class104_Sub18_Sub16_Sub5() {
	}

	public void method891() {
		for (int var1 = 0; var1 < anInt1631; ++var1) {
			final int var2 = anIntArray1627[var1];
			anIntArray1627[var1] = anIntArray1626[var1];
			anIntArray1626[var1] = -var2;
		}

		method912();
	}

	public Class104_Sub18_Sub16_Sub5 method892(final int[][] var1, final int var2, final int var3, final int var4,
			final boolean var5, final int var6) {
		method902();
		int var7 = var2 + anInt1639;
		int var8 = var2 + anInt1663;
		int var9 = var4 + anInt1665;
		int var10 = var4 + anInt1651;
		if ((var7 >= 0) && (((var8 + 128) >> 7) < var1.length) && (var9 >= 0)
				&& (((var10 + 128) >> 7) < var1[0].length)) {
			var7 >>= 7;
			var8 = (var8 + 127) >> 7;
			var9 >>= 7;
			var10 = (var10 + 127) >> 7;
			if ((var1[var7][var9] == var3) && (var1[var8][var9] == var3) && (var1[var7][var10] == var3)
					&& (var1[var8][var10] == var3))
				return this;
			else {
				final Class104_Sub18_Sub16_Sub5 var11 = new Class104_Sub18_Sub16_Sub5();
				var11.anInt1631 = anInt1631;
				var11.anInt1628 = anInt1628;
				var11.anInt1629 = anInt1629;
				var11.anIntArray1626 = anIntArray1626;
				var11.anIntArray1627 = anIntArray1627;
				var11.anIntArray1664 = anIntArray1664;
				var11.anIntArray1630 = anIntArray1630;
				var11.anIntArray1642 = anIntArray1642;
				var11.aByteArray1632 = aByteArray1632;
				var11.aByteArray1633 = aByteArray1633;
				var11.aByteArray1662 = aByteArray1662;
				var11.aByteArray1635 = aByteArray1635;
				var11.aShortArray1657 = aShortArray1657;
				var11.aShortArray1658 = aShortArray1658;
				var11.aByte1637 = aByte1637;
				var11.aByteArray1640 = aByteArray1640;
				var11.aShortArray1641 = aShortArray1641;
				var11.aShortArray1634 = aShortArray1634;
				var11.aShortArray1643 = aShortArray1643;
				var11.aShortArray1644 = aShortArray1644;
				var11.aShortArray1645 = aShortArray1645;
				var11.aShortArray1646 = aShortArray1646;
				var11.aShortArray1647 = aShortArray1647;
				var11.aByteArray1650 = aByteArray1650;
				var11.aShortArray1648 = aShortArray1648;
				var11.aShortArray1649 = aShortArray1649;
				var11.anIntArray1666 = anIntArray1666;
				var11.anIntArray1652 = anIntArray1652;
				var11.anIntArrayArray1653 = anIntArrayArray1653;
				var11.anIntArrayArray1654 = anIntArrayArray1654;
				var11.aShort1661 = aShort1661;
				var11.aShort1659 = aShort1659;
				var11.anIntArray1625 = new int[var11.anInt1631];
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0)
					for (var12 = 0; var12 < var11.anInt1631; ++var12) {
						var13 = anIntArray1626[var12] + var2;
						var14 = anIntArray1627[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = ((var1[var17][var18] * (128 - var15)) + (var1[var17 + 1][var18] * var15)) >> 7;
						var20 = ((var1[var17][var18 + 1] * (128 - var15)) + (var1[var17 + 1][var18 + 1] * var15)) >> 7;
						var21 = ((var19 * (128 - var16)) + (var20 * var16)) >> 7;
						var11.anIntArray1625[var12] = (anIntArray1625[var12] + var21) - var3;
					}
				else
					for (var12 = 0; var12 < var11.anInt1631; ++var12) {
						var13 = (-anIntArray1625[var12] << 16) / anInt1467;
						if (var13 < var6) {
							var14 = anIntArray1626[var12] + var2;
							var15 = anIntArray1627[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = ((var1[var18][var19] * (128 - var16)) + (var1[var18 + 1][var19] * var16)) >> 7;
							var21 = ((var1[var18][var19 + 1] * (128 - var16))
									+ (var1[var18 + 1][var19 + 1] * var16)) >> 7;
							final int var22 = ((var20 * (128 - var17)) + (var21 * var17)) >> 7;
							var11.anIntArray1625[var12] = anIntArray1625[var12]
									+ (((var22 - var3) * (var6 - var13)) / var6);
						}
					}

				var11.method912();
				return var11;
			}
		} else
			return this;
	}

	void method893() {
		int[] var1;
		int var2;
		int var3;
		int var4;
		if (anIntArray1666 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < anInt1631; ++var3) {
				var4 = anIntArray1666[var3];
				++var1[var4];
				if (var4 > var2)
					var2 = var4;
			}

			anIntArrayArray1653 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				anIntArrayArray1653[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < anInt1631; anIntArrayArray1653[var4][var1[var4]++] = var3++)
				var4 = anIntArray1666[var3];

			anIntArray1666 = null;
		}

		if (anIntArray1652 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < anInt1628; ++var3) {
				var4 = anIntArray1652[var3];
				++var1[var4];
				if (var4 > var2)
					var2 = var4;
			}

			anIntArrayArray1654 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				anIntArrayArray1654[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < anInt1628; anIntArrayArray1654[var4][var1[var4]++] = var3++)
				var4 = anIntArray1652[var3];

			anIntArray1652 = null;
		}

	}

	public void method894() {
		for (int var1 = 0; var1 < anInt1631; ++var1) {
			final int var2 = anIntArray1626[var1];
			anIntArray1626[var1] = anIntArray1627[var1];
			anIntArray1627[var1] = -var2;
		}

		method912();
	}

	public void method895() {
		for (int var1 = 0; var1 < anInt1631; ++var1) {
			anIntArray1626[var1] = -anIntArray1626[var1];
			anIntArray1627[var1] = -anIntArray1627[var1];
		}

		method912();
	}

	public void method896() {
		if (aClass15Array1656 == null) {
			aClass15Array1656 = new Class15[anInt1631];

			int var1;
			for (var1 = 0; var1 < anInt1631; ++var1)
				aClass15Array1656[var1] = new Class15();

			for (var1 = 0; var1 < anInt1628; ++var1) {
				final int var2 = anIntArray1664[var1];
				final int var3 = anIntArray1630[var1];
				final int var4 = anIntArray1642[var1];
				final int var5 = anIntArray1626[var3] - anIntArray1626[var2];
				final int var6 = anIntArray1625[var3] - anIntArray1625[var2];
				final int var7 = anIntArray1627[var3] - anIntArray1627[var2];
				final int var8 = anIntArray1626[var4] - anIntArray1626[var2];
				final int var9 = anIntArray1625[var4] - anIntArray1625[var2];
				final int var10 = anIntArray1627[var4] - anIntArray1627[var2];
				int var11 = (var6 * var10) - (var9 * var7);
				int var12 = (var7 * var8) - (var10 * var5);

				int var13;
				for (var13 = (var5 * var9) - (var8 * var6); (var11 > 8192) || (var12 > 8192) || (var13 > 8192)
						|| (var11 < -8192) || (var12 < -8192) || (var13 < -8192); var13 >>= 1) {
					var11 >>= 1;
					var12 >>= 1;
				}

				int var14 = (int) Math.sqrt((var11 * var11) + (var12 * var12) + (var13 * var13));
				if (var14 <= 0)
					var14 = 1;

				var11 = (var11 * 256) / var14;
				var12 = (var12 * 256) / var14;
				var13 = (var13 * 256) / var14;
				byte var15;
				if (aByteArray1632 == null)
					var15 = 0;
				else
					var15 = aByteArray1632[var1];

				if (var15 == 0) {
					Class15 var16 = aClass15Array1656[var2];
					var16.anInt109 += var11;
					var16.anInt107 += var12;
					var16.anInt108 += var13;
					++var16.anInt106;
					var16 = aClass15Array1656[var3];
					var16.anInt109 += var11;
					var16.anInt107 += var12;
					var16.anInt108 += var13;
					++var16.anInt106;
					var16 = aClass15Array1656[var4];
					var16.anInt109 += var11;
					var16.anInt107 += var12;
					var16.anInt108 += var13;
					++var16.anInt106;
				} else if (var15 == 1) {
					if (aClass7Array1655 == null)
						aClass7Array1655 = new Class7[anInt1628];

					final Class7 var17 = aClass7Array1655[var1] = new Class7();
					var17.anInt39 = var11;
					var17.anInt38 = var12;
					var17.anInt37 = var13;
				}
			}

		}
	}

	public void method897(final int var1) {
		final int var2 = anIntArray1669[var1];
		final int var3 = anIntArray1670[var1];

		for (int var4 = 0; var4 < anInt1631; ++var4) {
			final int var5 = ((anIntArray1627[var4] * var2) + (anIntArray1626[var4] * var3)) >> 16;
			anIntArray1627[var4] = ((anIntArray1627[var4] * var3) - (anIntArray1626[var4] * var2)) >> 16;
			anIntArray1626[var4] = var5;
		}

		method912();
	}

	public void method898(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1631; ++var4) {
			anIntArray1626[var4] += var1;
			anIntArray1625[var4] += var2;
			anIntArray1627[var4] += var3;
		}

		method912();
	}

	public void method899(final short var1, final short var2) {
		for (int var3 = 0; var3 < anInt1628; ++var3)
			if (aShortArray1657[var3] == var1)
				aShortArray1657[var3] = var2;

	}

	public Class104_Sub18_Sub16_Sub5(final Class104_Sub18_Sub16_Sub5[] var1, final int var2) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		anInt1631 = 0;
		anInt1628 = 0;
		anInt1629 = 0;
		aByte1637 = -1;

		int var9;
		Class104_Sub18_Sub16_Sub5 var10;
		for (var9 = 0; var9 < var2; ++var9) {
			var10 = var1[var9];
			if (var10 != null) {
				anInt1631 += var10.anInt1631;
				anInt1628 += var10.anInt1628;
				anInt1629 += var10.anInt1629;
				if (var10.aByteArray1633 != null)
					var4 = true;
				else {
					if (aByte1637 == -1)
						aByte1637 = var10.aByte1637;

					if (aByte1637 != var10.aByte1637)
						var4 = true;
				}

				var3 |= var10.aByteArray1632 != null;
				var5 |= var10.aByteArray1662 != null;
				var6 |= var10.anIntArray1652 != null;
				var7 |= var10.aShortArray1658 != null;
				var8 |= var10.aByteArray1635 != null;
			}
		}

		anIntArray1626 = new int[anInt1631];
		anIntArray1625 = new int[anInt1631];
		anIntArray1627 = new int[anInt1631];
		anIntArray1666 = new int[anInt1631];
		anIntArray1664 = new int[anInt1628];
		anIntArray1630 = new int[anInt1628];
		anIntArray1642 = new int[anInt1628];
		if (var3)
			aByteArray1632 = new byte[anInt1628];

		if (var4)
			aByteArray1633 = new byte[anInt1628];

		if (var5)
			aByteArray1662 = new byte[anInt1628];

		if (var6)
			anIntArray1652 = new int[anInt1628];

		if (var7)
			aShortArray1658 = new short[anInt1628];

		if (var8)
			aByteArray1635 = new byte[anInt1628];

		aShortArray1657 = new short[anInt1628];
		if (anInt1629 > 0) {
			aByteArray1640 = new byte[anInt1629];
			aShortArray1641 = new short[anInt1629];
			aShortArray1634 = new short[anInt1629];
			aShortArray1643 = new short[anInt1629];
			aShortArray1644 = new short[anInt1629];
			aShortArray1645 = new short[anInt1629];
			aShortArray1646 = new short[anInt1629];
			aShortArray1647 = new short[anInt1629];
			aByteArray1650 = new byte[anInt1629];
			aShortArray1648 = new short[anInt1629];
			aShortArray1649 = new short[anInt1629];
		}

		anInt1631 = 0;
		anInt1628 = 0;
		anInt1629 = 0;

		for (var9 = 0; var9 < var2; ++var9) {
			var10 = var1[var9];
			if (var10 != null) {
				int var11;
				for (var11 = 0; var11 < var10.anInt1628; ++var11) {
					if (var3 && (var10.aByteArray1632 != null))
						aByteArray1632[anInt1628] = var10.aByteArray1632[var11];

					if (var4)
						if (var10.aByteArray1633 != null)
							aByteArray1633[anInt1628] = var10.aByteArray1633[var11];
						else
							aByteArray1633[anInt1628] = var10.aByte1637;

					if (var5 && (var10.aByteArray1662 != null))
						aByteArray1662[anInt1628] = var10.aByteArray1662[var11];

					if (var6 && (var10.anIntArray1652 != null))
						anIntArray1652[anInt1628] = var10.anIntArray1652[var11];

					if (var7)
						if (var10.aShortArray1658 != null)
							aShortArray1658[anInt1628] = var10.aShortArray1658[var11];
						else
							aShortArray1658[anInt1628] = -1;

					if (var8)
						if ((var10.aByteArray1635 != null) && (var10.aByteArray1635[var11] != -1))
							aByteArray1635[anInt1628] = (byte) (var10.aByteArray1635[var11] + anInt1629);
						else
							aByteArray1635[anInt1628] = -1;

					aShortArray1657[anInt1628] = var10.aShortArray1657[var11];
					anIntArray1664[anInt1628] = method907(var10, var10.anIntArray1664[var11]);
					anIntArray1630[anInt1628] = method907(var10, var10.anIntArray1630[var11]);
					anIntArray1642[anInt1628] = method907(var10, var10.anIntArray1642[var11]);
					++anInt1628;
				}

				for (var11 = 0; var11 < var10.anInt1629; ++var11) {
					final byte var12 = aByteArray1640[anInt1629] = var10.aByteArray1640[var11];
					if (var12 == 0) {
						aShortArray1641[anInt1629] = (short) method907(var10, var10.aShortArray1641[var11]);
						aShortArray1634[anInt1629] = (short) method907(var10, var10.aShortArray1634[var11]);
						aShortArray1643[anInt1629] = (short) method907(var10, var10.aShortArray1643[var11]);
					}

					if ((var12 >= 1) && (var12 <= 3)) {
						aShortArray1641[anInt1629] = var10.aShortArray1641[var11];
						aShortArray1634[anInt1629] = var10.aShortArray1634[var11];
						aShortArray1643[anInt1629] = var10.aShortArray1643[var11];
						aShortArray1644[anInt1629] = var10.aShortArray1644[var11];
						aShortArray1645[anInt1629] = var10.aShortArray1645[var11];
						aShortArray1646[anInt1629] = var10.aShortArray1646[var11];
						aShortArray1647[anInt1629] = var10.aShortArray1647[var11];
						aByteArray1650[anInt1629] = var10.aByteArray1650[var11];
						aShortArray1648[anInt1629] = var10.aShortArray1648[var11];
					}

					if (var12 == 2)
						aShortArray1649[anInt1629] = var10.aShortArray1649[var11];

					++anInt1629;
				}
			}
		}

	}

	public void method900(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1631; ++var4) {
			anIntArray1626[var4] = (anIntArray1626[var4] * var1) / 128;
			anIntArray1625[var4] = (anIntArray1625[var4] * var2) / 128;
			anIntArray1627[var4] = (anIntArray1627[var4] * var3) / 128;
		}

		method912();
	}

	static final int method901(int var0) {
		if (var0 < 2)
			var0 = 2;
		else if (var0 > 126)
			var0 = 126;

		return var0;
	}

	void method902() {
		if (!aBool1660) {
			anInt1467 = 0;
			anInt1624 = 0;
			anInt1639 = 999999;
			anInt1663 = -999999;
			anInt1651 = -99999;
			anInt1665 = 99999;

			for (int var1 = 0; var1 < anInt1631; ++var1) {
				final int var2 = anIntArray1626[var1];
				final int var3 = anIntArray1625[var1];
				final int var4 = anIntArray1627[var1];
				if (var2 < anInt1639)
					anInt1639 = var2;

				if (var2 > anInt1663)
					anInt1663 = var2;

				if (var4 < anInt1665)
					anInt1665 = var4;

				if (var4 > anInt1651)
					anInt1651 = var4;

				if (-var3 > anInt1467)
					anInt1467 = -var3;

				if (var3 > anInt1624)
					anInt1624 = var3;
			}

			aBool1660 = true;
		}
	}

	static void method903(final Class104_Sub18_Sub16_Sub5 var0, final Class104_Sub18_Sub16_Sub5 var1, final int var2,
			final int var3, final int var4, final boolean var5) {
		var0.method902();
		var0.method896();
		var1.method902();
		var1.method896();
		++anInt1668;
		int var6 = 0;
		final int[] var7 = var1.anIntArray1626;
		final int var8 = var1.anInt1631;

		int var9;
		for (var9 = 0; var9 < var0.anInt1631; ++var9) {
			final Class15 var10 = var0.aClass15Array1656[var9];
			if (var10.anInt106 != 0) {
				final int var11 = var0.anIntArray1625[var9] - var3;
				if (var11 <= var1.anInt1624) {
					final int var12 = var0.anIntArray1626[var9] - var2;
					if ((var12 >= var1.anInt1639) && (var12 <= var1.anInt1663)) {
						final int var13 = var0.anIntArray1627[var9] - var4;
						if ((var13 >= var1.anInt1665) && (var13 <= var1.anInt1651))
							for (int var14 = 0; var14 < var8; ++var14) {
								final Class15 var15 = var1.aClass15Array1656[var14];
								if ((var12 == var7[var14]) && (var13 == var1.anIntArray1627[var14])
										&& (var11 == var1.anIntArray1625[var14]) && (var15.anInt106 != 0)) {
									if (var0.aClass15Array1638 == null)
										var0.aClass15Array1638 = new Class15[var0.anInt1631];

									if (var1.aClass15Array1638 == null)
										var1.aClass15Array1638 = new Class15[var8];

									Class15 var16 = var0.aClass15Array1638[var9];
									if (var16 == null)
										var16 = var0.aClass15Array1638[var9] = new Class15(var10);

									Class15 var17 = var1.aClass15Array1638[var14];
									if (var17 == null)
										var17 = var1.aClass15Array1638[var14] = new Class15(var15);

									var16.anInt109 += var15.anInt109;
									var16.anInt107 += var15.anInt107;
									var16.anInt108 += var15.anInt108;
									var16.anInt106 += var15.anInt106;
									var17.anInt109 += var10.anInt109;
									var17.anInt107 += var10.anInt107;
									var17.anInt108 += var10.anInt108;
									var17.anInt106 += var10.anInt106;
									++var6;
									anIntArray1636[var9] = anInt1668;
									anIntArray1667[var14] = anInt1668;
								}
							}
					}
				}
			}
		}

		if ((var6 >= 3) && var5) {
			for (var9 = 0; var9 < var0.anInt1628; ++var9)
				if ((anIntArray1636[var0.anIntArray1664[var9]] == anInt1668)
						&& (anIntArray1636[var0.anIntArray1630[var9]] == anInt1668)
						&& (anIntArray1636[var0.anIntArray1642[var9]] == anInt1668)) {
					if (var0.aByteArray1632 == null)
						var0.aByteArray1632 = new byte[var0.anInt1628];

					var0.aByteArray1632[var9] = 2;
				}

			for (var9 = 0; var9 < var1.anInt1628; ++var9)
				if ((anIntArray1667[var1.anIntArray1664[var9]] == anInt1668)
						&& (anIntArray1667[var1.anIntArray1630[var9]] == anInt1668)
						&& (anIntArray1667[var1.anIntArray1642[var9]] == anInt1668)) {
					if (var1.aByteArray1632 == null)
						var1.aByteArray1632 = new byte[var1.anInt1628];

					var1.aByteArray1632[var9] = 2;
				}

		}
	}

	public final Class104_Sub18_Sub16_Sub4 method904(final int var1, final int var2, final int var3, final int var4,
			final int var5) {
		method896();
		final int var6 = (int) Math.sqrt((var3 * var3) + (var4 * var4) + (var5 * var5));
		final int var7 = (var2 * var6) >> 8;
		final Class104_Sub18_Sub16_Sub4 var8 = new Class104_Sub18_Sub16_Sub4();
		var8.anIntArray1583 = new int[anInt1628];
		var8.anIntArray1538 = new int[anInt1628];
		var8.anIntArray1539 = new int[anInt1628];
		if ((anInt1629 > 0) && (aByteArray1635 != null)) {
			final int[] var9 = new int[anInt1629];

			int var10;
			for (var10 = 0; var10 < anInt1628; ++var10)
				if (aByteArray1635[var10] != -1)
					++var9[aByteArray1635[var10] & 255];

			var8.anInt1545 = 0;

			for (var10 = 0; var10 < anInt1629; ++var10)
				if ((var9[var10] > 0) && (aByteArray1640[var10] == 0))
					++var8.anInt1545;

			var8.anIntArray1546 = new int[var8.anInt1545];
			var8.anIntArray1579 = new int[var8.anInt1545];
			var8.anIntArray1570 = new int[var8.anInt1545];
			var10 = 0;

			int var11;
			for (var11 = 0; var11 < anInt1629; ++var11)
				if ((var9[var11] > 0) && (aByteArray1640[var11] == 0)) {
					var8.anIntArray1546[var10] = aShortArray1641[var11] & '\uffff';
					var8.anIntArray1579[var10] = aShortArray1634[var11] & '\uffff';
					var8.anIntArray1570[var10] = aShortArray1643[var11] & '\uffff';
					var9[var11] = var10++;
				} else
					var9[var11] = -1;

			var8.aByteArray1542 = new byte[anInt1628];

			for (var11 = 0; var11 < anInt1628; ++var11)
				if (aByteArray1635[var11] != -1)
					var8.aByteArray1542[var11] = (byte) var9[aByteArray1635[var11] & 255];
				else
					var8.aByteArray1542[var11] = -1;
		}

		for (int var12 = 0; var12 < anInt1628; ++var12) {
			byte var17;
			if (aByteArray1632 == null)
				var17 = 0;
			else
				var17 = aByteArray1632[var12];

			byte var18;
			if (aByteArray1662 == null)
				var18 = 0;
			else
				var18 = aByteArray1662[var12];

			short var13;
			if (aShortArray1658 == null)
				var13 = -1;
			else
				var13 = aShortArray1658[var12];

			if (var18 == -2)
				var17 = 3;

			if (var18 == -1)
				var17 = 2;

			Class15 var15;
			int var16;
			Class7 var19;
			if (var13 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = aClass7Array1655[var12];
						var16 = var1 + (((var3 * var19.anInt39) + (var4 * var19.anInt38) + (var5 * var19.anInt37))
								/ (var7 + (var7 / 2)));
						var8.anIntArray1583[var12] = method905(aShortArray1657[var12] & '\uffff', var16);
						var8.anIntArray1539[var12] = -1;
					} else if (var17 == 3) {
						var8.anIntArray1583[var12] = 128;
						var8.anIntArray1539[var12] = -1;
					} else
						var8.anIntArray1539[var12] = -2;
				} else {
					final int var14 = aShortArray1657[var12] & '\uffff';
					if ((aClass15Array1638 != null) && (aClass15Array1638[anIntArray1664[var12]] != null))
						var15 = aClass15Array1638[anIntArray1664[var12]];
					else
						var15 = aClass15Array1656[anIntArray1664[var12]];

					var16 = var1 + (((var3 * var15.anInt109) + (var4 * var15.anInt107) + (var5 * var15.anInt108))
							/ (var7 * var15.anInt106));
					var8.anIntArray1583[var12] = method905(var14, var16);
					if ((aClass15Array1638 != null) && (aClass15Array1638[anIntArray1630[var12]] != null))
						var15 = aClass15Array1638[anIntArray1630[var12]];
					else
						var15 = aClass15Array1656[anIntArray1630[var12]];

					var16 = var1 + (((var3 * var15.anInt109) + (var4 * var15.anInt107) + (var5 * var15.anInt108))
							/ (var7 * var15.anInt106));
					var8.anIntArray1538[var12] = method905(var14, var16);
					if ((aClass15Array1638 != null) && (aClass15Array1638[anIntArray1642[var12]] != null))
						var15 = aClass15Array1638[anIntArray1642[var12]];
					else
						var15 = aClass15Array1656[anIntArray1642[var12]];

					var16 = var1 + (((var3 * var15.anInt109) + (var4 * var15.anInt107) + (var5 * var15.anInt108))
							/ (var7 * var15.anInt106));
					var8.anIntArray1539[var12] = method905(var14, var16);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = aClass7Array1655[var12];
					var16 = var1 + (((var3 * var19.anInt39) + (var4 * var19.anInt38) + (var5 * var19.anInt37))
							/ (var7 + (var7 / 2)));
					var8.anIntArray1583[var12] = method901(var16);
					var8.anIntArray1539[var12] = -1;
				} else
					var8.anIntArray1539[var12] = -2;
			} else {
				if ((aClass15Array1638 != null) && (aClass15Array1638[anIntArray1664[var12]] != null))
					var15 = aClass15Array1638[anIntArray1664[var12]];
				else
					var15 = aClass15Array1656[anIntArray1664[var12]];

				var16 = var1 + (((var3 * var15.anInt109) + (var4 * var15.anInt107) + (var5 * var15.anInt108))
						/ (var7 * var15.anInt106));
				var8.anIntArray1583[var12] = method901(var16);
				if ((aClass15Array1638 != null) && (aClass15Array1638[anIntArray1630[var12]] != null))
					var15 = aClass15Array1638[anIntArray1630[var12]];
				else
					var15 = aClass15Array1656[anIntArray1630[var12]];

				var16 = var1 + (((var3 * var15.anInt109) + (var4 * var15.anInt107) + (var5 * var15.anInt108))
						/ (var7 * var15.anInt106));
				var8.anIntArray1538[var12] = method901(var16);
				if ((aClass15Array1638 != null) && (aClass15Array1638[anIntArray1642[var12]] != null))
					var15 = aClass15Array1638[anIntArray1642[var12]];
				else
					var15 = aClass15Array1656[anIntArray1642[var12]];

				var16 = var1 + (((var3 * var15.anInt109) + (var4 * var15.anInt107) + (var5 * var15.anInt108))
						/ (var7 * var15.anInt106));
				var8.anIntArray1539[var12] = method901(var16);
			}
		}

		method893();
		var8.anInt1529 = anInt1631;
		var8.anIntArray1530 = anIntArray1626;
		var8.anIntArray1531 = anIntArray1625;
		var8.anIntArray1584 = anIntArray1627;
		var8.anInt1585 = anInt1628;
		var8.anIntArray1534 = anIntArray1664;
		var8.anIntArray1533 = anIntArray1630;
		var8.anIntArray1536 = anIntArray1642;
		var8.aByteArray1540 = aByteArray1633;
		var8.aByteArray1535 = aByteArray1662;
		var8.aByte1544 = aByte1637;
		var8.anIntArrayArray1549 = anIntArrayArray1653;
		var8.anIntArrayArray1550 = anIntArrayArray1654;
		var8.aShortArray1525 = aShortArray1658;
		return var8;
	}

	static final int method905(final int var0, int var1) {
		var1 = (var1 * (var0 & 127)) >> 7;
		if (var1 < 2)
			var1 = 2;
		else if (var1 > 126)
			var1 = 126;

		return (var0 & '\uff80') + var1;
	}

	void method906(final byte[] var1) {
		final RSBuf var2 = new RSBuf(var1);
		final RSBuf var3 = new RSBuf(var1);
		final RSBuf var4 = new RSBuf(var1);
		final RSBuf var5 = new RSBuf(var1);
		final RSBuf var6 = new RSBuf(var1);
		final RSBuf var7 = new RSBuf(var1);
		final RSBuf var8 = new RSBuf(var1);
		var2.anInt1172 = var1.length - 23;
		final int var9 = var2.method571();
		final int var10 = var2.method571();
		final int var11 = var2.method570();
		final int var12 = var2.method570();
		final int var13 = var2.method570();
		final int var14 = var2.method570();
		final int var15 = var2.method570();
		final int var16 = var2.method570();
		final int var17 = var2.method570();
		final int var18 = var2.method571();
		final int var19 = var2.method571();
		final int var20 = var2.method571();
		final int var21 = var2.method571();
		final int var22 = var2.method571();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			aByteArray1640 = new byte[var11];
			var2.anInt1172 = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				final byte var27 = aByteArray1640[var26] = var2.method565();
				if (var27 == 0)
					++var23;

				if ((var27 >= 1) && (var27 <= 3))
					++var24;

				if (var27 == 2)
					++var25;
			}
		}

		var26 = var11 + var9;
		final int var28 = var26;
		if (var12 == 1)
			var26 += var10;

		final int var29 = var26;
		var26 += var10;
		final int var30 = var26;
		if (var13 == 255)
			var26 += var10;

		final int var31 = var26;
		if (var15 == 1)
			var26 += var10;

		final int var32 = var26;
		if (var17 == 1)
			var26 += var9;

		final int var33 = var26;
		if (var14 == 1)
			var26 += var10;

		final int var34 = var26;
		var26 += var21;
		final int var35 = var26;
		if (var16 == 1)
			var26 += var10 * 2;

		final int var36 = var26;
		var26 += var22;
		final int var37 = var26;
		var26 += var10 * 2;
		final int var38 = var26;
		var26 += var18;
		final int var39 = var26;
		var26 += var19;
		final int var40 = var26;
		var26 += var20;
		final int var41 = var26;
		var26 += var23 * 6;
		final int var42 = var26;
		var26 += var24 * 6;
		final int var43 = var26;
		var26 += var24 * 6;
		final int var44 = var26;
		var26 += var24 * 2;
		final int var45 = var26;
		var26 += var24;
		final int var46 = var26;
		var26 += (var24 * 2) + (var25 * 2);
		anInt1631 = var9;
		anInt1628 = var10;
		anInt1629 = var11;
		anIntArray1626 = new int[var9];
		anIntArray1625 = new int[var9];
		anIntArray1627 = new int[var9];
		anIntArray1664 = new int[var10];
		anIntArray1630 = new int[var10];
		anIntArray1642 = new int[var10];
		if (var17 == 1)
			anIntArray1666 = new int[var9];

		if (var12 == 1)
			aByteArray1632 = new byte[var10];

		if (var13 == 255)
			aByteArray1633 = new byte[var10];
		else
			aByte1637 = (byte) var13;

		if (var14 == 1)
			aByteArray1662 = new byte[var10];

		if (var15 == 1)
			anIntArray1652 = new int[var10];

		if (var16 == 1)
			aShortArray1658 = new short[var10];

		if ((var16 == 1) && (var11 > 0))
			aByteArray1635 = new byte[var10];

		aShortArray1657 = new short[var10];
		if (var11 > 0) {
			aShortArray1641 = new short[var11];
			aShortArray1634 = new short[var11];
			aShortArray1643 = new short[var11];
			if (var24 > 0) {
				aShortArray1644 = new short[var24];
				aShortArray1645 = new short[var24];
				aShortArray1646 = new short[var24];
				aShortArray1647 = new short[var24];
				aByteArray1650 = new byte[var24];
				aShortArray1648 = new short[var24];
			}

			if (var25 > 0)
				aShortArray1649 = new short[var25];
		}

		var2.anInt1172 = var11;
		var3.anInt1172 = var38;
		var4.anInt1172 = var39;
		var5.anInt1172 = var40;
		var6.anInt1172 = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;

		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) {
			var52 = var2.method570();
			var53 = 0;
			if ((var52 & 1) != 0)
				var53 = var3.method578();

			var54 = 0;
			if ((var52 & 2) != 0)
				var54 = var4.method578();

			var55 = 0;
			if ((var52 & 4) != 0)
				var55 = var5.method578();

			anIntArray1626[var51] = var48 + var53;
			anIntArray1625[var51] = var49 + var54;
			anIntArray1627[var51] = var50 + var55;
			var48 = anIntArray1626[var51];
			var49 = anIntArray1625[var51];
			var50 = anIntArray1627[var51];
			if (var17 == 1)
				anIntArray1666[var51] = var6.method570();
		}

		var2.anInt1172 = var37;
		var3.anInt1172 = var28;
		var4.anInt1172 = var30;
		var5.anInt1172 = var33;
		var6.anInt1172 = var31;
		var7.anInt1172 = var35;
		var8.anInt1172 = var36;

		for (var51 = 0; var51 < var10; ++var51) {
			aShortArray1657[var51] = (short) var2.method571();
			if (var12 == 1)
				aByteArray1632[var51] = var3.method565();

			if (var13 == 255)
				aByteArray1633[var51] = var4.method565();

			if (var14 == 1)
				aByteArray1662[var51] = var5.method565();

			if (var15 == 1)
				anIntArray1652[var51] = var6.method570();

			if (var16 == 1)
				aShortArray1658[var51] = (short) (var7.method571() - 1);

			if ((aByteArray1635 != null) && (aShortArray1658[var51] != -1))
				aByteArray1635[var51] = (byte) (var8.method570() - 1);
		}

		var2.anInt1172 = var34;
		var3.anInt1172 = var29;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;

		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.method570();
			if (var56 == 1) {
				var51 = var2.method578() + var54;
				var52 = var2.method578() + var51;
				var53 = var2.method578() + var52;
				var54 = var53;
				anIntArray1664[var55] = var51;
				anIntArray1630[var55] = var52;
				anIntArray1642[var55] = var53;
			}

			if (var56 == 2) {
				var52 = var53;
				var53 = var2.method578() + var54;
				var54 = var53;
				anIntArray1664[var55] = var51;
				anIntArray1630[var55] = var52;
				anIntArray1642[var55] = var53;
			}

			if (var56 == 3) {
				var51 = var53;
				var53 = var2.method578() + var54;
				var54 = var53;
				anIntArray1664[var55] = var51;
				anIntArray1630[var55] = var52;
				anIntArray1642[var55] = var53;
			}

			if (var56 == 4) {
				final int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.method578() + var54;
				var54 = var53;
				anIntArray1664[var55] = var51;
				anIntArray1630[var55] = var57;
				anIntArray1642[var55] = var53;
			}
		}

		var2.anInt1172 = var41;
		var3.anInt1172 = var42;
		var4.anInt1172 = var43;
		var5.anInt1172 = var44;
		var6.anInt1172 = var45;
		var7.anInt1172 = var46;

		for (var55 = 0; var55 < var11; ++var55) {
			var56 = aByteArray1640[var55] & 255;
			if (var56 == 0) {
				aShortArray1641[var55] = (short) var2.method571();
				aShortArray1634[var55] = (short) var2.method571();
				aShortArray1643[var55] = (short) var2.method571();
			}

			if (var56 == 1) {
				aShortArray1641[var55] = (short) var3.method571();
				aShortArray1634[var55] = (short) var3.method571();
				aShortArray1643[var55] = (short) var3.method571();
				aShortArray1644[var55] = (short) var4.method571();
				aShortArray1645[var55] = (short) var4.method571();
				aShortArray1646[var55] = (short) var4.method571();
				aShortArray1647[var55] = (short) var5.method571();
				aByteArray1650[var55] = var6.method565();
				aShortArray1648[var55] = (short) var7.method571();
			}

			if (var56 == 2) {
				aShortArray1641[var55] = (short) var3.method571();
				aShortArray1634[var55] = (short) var3.method571();
				aShortArray1643[var55] = (short) var3.method571();
				aShortArray1644[var55] = (short) var4.method571();
				aShortArray1645[var55] = (short) var4.method571();
				aShortArray1646[var55] = (short) var4.method571();
				aShortArray1647[var55] = (short) var5.method571();
				aByteArray1650[var55] = var6.method565();
				aShortArray1648[var55] = (short) var7.method571();
				aShortArray1649[var55] = (short) var7.method571();
			}

			if (var56 == 3) {
				aShortArray1641[var55] = (short) var3.method571();
				aShortArray1634[var55] = (short) var3.method571();
				aShortArray1643[var55] = (short) var3.method571();
				aShortArray1644[var55] = (short) var4.method571();
				aShortArray1645[var55] = (short) var4.method571();
				aShortArray1646[var55] = (short) var4.method571();
				aShortArray1647[var55] = (short) var5.method571();
				aByteArray1650[var55] = var6.method565();
				aShortArray1648[var55] = (short) var7.method571();
			}
		}

		var2.anInt1172 = var26;
		var55 = var2.method570();
		if (var55 != 0) {
			new Class10();
			var2.method571();
			var2.method571();
			var2.method571();
			var2.method574();
		}

	}

	static {
		anIntArray1669 = Class104_Sub18_Sub17_Sub4.anIntArray1680;
		anIntArray1670 = Class104_Sub18_Sub17_Sub4.anIntArray1678;
	}

	final int method907(final Class104_Sub18_Sub16_Sub5 var1, final int var2) {
		int var3 = -1;
		final int var4 = var1.anIntArray1626[var2];
		final int var5 = var1.anIntArray1625[var2];
		final int var6 = var1.anIntArray1627[var2];

		for (int var7 = 0; var7 < anInt1631; ++var7)
			if ((var4 == anIntArray1626[var7]) && (var5 == anIntArray1625[var7]) && (var6 == anIntArray1627[var7])) {
				var3 = var7;
				break;
			}

		if (var3 == -1) {
			anIntArray1626[anInt1631] = var4;
			anIntArray1625[anInt1631] = var5;
			anIntArray1627[anInt1631] = var6;
			if (var1.anIntArray1666 != null)
				anIntArray1666[anInt1631] = var1.anIntArray1666[var2];

			var3 = anInt1631++;
		}

		return var3;
	}

	Class104_Sub18_Sub16_Sub5(final byte[] var1) {
		if ((var1[var1.length - 1] == -1) && (var1[var1.length - 2] == -1))
			method906(var1);
		else
			method908(var1);

	}

	void method908(final byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		final RSBuf var4 = new RSBuf(var1);
		final RSBuf var5 = new RSBuf(var1);
		final RSBuf var6 = new RSBuf(var1);
		final RSBuf var7 = new RSBuf(var1);
		final RSBuf var8 = new RSBuf(var1);
		var4.anInt1172 = var1.length - 18;
		final int var9 = var4.method571();
		final int var10 = var4.method571();
		final int var11 = var4.method570();
		final int var12 = var4.method570();
		final int var13 = var4.method570();
		final int var14 = var4.method570();
		final int var15 = var4.method570();
		final int var16 = var4.method570();
		final int var17 = var4.method571();
		final int var18 = var4.method571();
		final int var19 = var4.method571();
		final int var20 = var4.method571();
		final byte var21 = 0;
		int var45 = var21 + var9;
		final int var23 = var45;
		var45 += var10;
		final int var24 = var45;
		if (var13 == 255)
			var45 += var10;

		final int var25 = var45;
		if (var15 == 1)
			var45 += var10;

		final int var26 = var45;
		if (var12 == 1)
			var45 += var10;

		final int var27 = var45;
		if (var16 == 1)
			var45 += var9;

		final int var28 = var45;
		if (var14 == 1)
			var45 += var10;

		final int var29 = var45;
		var45 += var20;
		final int var30 = var45;
		var45 += var10 * 2;
		final int var31 = var45;
		var45 += var11 * 6;
		final int var32 = var45;
		var45 += var17;
		final int var33 = var45;
		var45 += var18;
		anInt1631 = var9;
		anInt1628 = var10;
		anInt1629 = var11;
		anIntArray1626 = new int[var9];
		anIntArray1625 = new int[var9];
		anIntArray1627 = new int[var9];
		anIntArray1664 = new int[var10];
		anIntArray1630 = new int[var10];
		anIntArray1642 = new int[var10];
		if (var11 > 0) {
			aByteArray1640 = new byte[var11];
			aShortArray1641 = new short[var11];
			aShortArray1634 = new short[var11];
			aShortArray1643 = new short[var11];
		}

		if (var16 == 1)
			anIntArray1666 = new int[var9];

		if (var12 == 1) {
			aByteArray1632 = new byte[var10];
			aByteArray1635 = new byte[var10];
			aShortArray1658 = new short[var10];
		}

		if (var13 == 255)
			aByteArray1633 = new byte[var10];
		else
			aByte1637 = (byte) var13;

		if (var14 == 1)
			aByteArray1662 = new byte[var10];

		if (var15 == 1)
			anIntArray1652 = new int[var10];

		aShortArray1657 = new short[var10];
		var4.anInt1172 = var21;
		var5.anInt1172 = var32;
		var6.anInt1172 = var33;
		var7.anInt1172 = var45;
		var8.anInt1172 = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) {
			var39 = var4.method570();
			var40 = 0;
			if ((var39 & 1) != 0)
				var40 = var5.method578();

			var41 = 0;
			if ((var39 & 2) != 0)
				var41 = var6.method578();

			var42 = 0;
			if ((var39 & 4) != 0)
				var42 = var7.method578();

			anIntArray1626[var38] = var35 + var40;
			anIntArray1625[var38] = var36 + var41;
			anIntArray1627[var38] = var37 + var42;
			var35 = anIntArray1626[var38];
			var36 = anIntArray1625[var38];
			var37 = anIntArray1627[var38];
			if (var16 == 1)
				anIntArray1666[var38] = var8.method570();
		}

		var4.anInt1172 = var30;
		var5.anInt1172 = var26;
		var6.anInt1172 = var24;
		var7.anInt1172 = var28;
		var8.anInt1172 = var25;

		for (var38 = 0; var38 < var10; ++var38) {
			aShortArray1657[var38] = (short) var4.method571();
			if (var12 == 1) {
				var39 = var5.method570();
				if ((var39 & 1) == 1) {
					aByteArray1632[var38] = 1;
					var2 = true;
				} else
					aByteArray1632[var38] = 0;

				if ((var39 & 2) == 2) {
					aByteArray1635[var38] = (byte) (var39 >> 2);
					aShortArray1658[var38] = aShortArray1657[var38];
					aShortArray1657[var38] = 127;
					if (aShortArray1658[var38] != -1)
						var3 = true;
				} else {
					aByteArray1635[var38] = -1;
					aShortArray1658[var38] = -1;
				}
			}

			if (var13 == 255)
				aByteArray1633[var38] = var6.method565();

			if (var14 == 1)
				aByteArray1662[var38] = var7.method565();

			if (var15 == 1)
				anIntArray1652[var38] = var8.method570();
		}

		var4.anInt1172 = var29;
		var5.anInt1172 = var23;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.method570();
			if (var43 == 1) {
				var38 = var4.method578() + var41;
				var39 = var4.method578() + var38;
				var40 = var4.method578() + var39;
				var41 = var40;
				anIntArray1664[var42] = var38;
				anIntArray1630[var42] = var39;
				anIntArray1642[var42] = var40;
			}

			if (var43 == 2) {
				var39 = var40;
				var40 = var4.method578() + var41;
				var41 = var40;
				anIntArray1664[var42] = var38;
				anIntArray1630[var42] = var39;
				anIntArray1642[var42] = var40;
			}

			if (var43 == 3) {
				var38 = var40;
				var40 = var4.method578() + var41;
				var41 = var40;
				anIntArray1664[var42] = var38;
				anIntArray1630[var42] = var39;
				anIntArray1642[var42] = var40;
			}

			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.method578() + var41;
				var41 = var40;
				anIntArray1664[var42] = var38;
				anIntArray1630[var42] = var44;
				anIntArray1642[var42] = var40;
			}
		}

		var4.anInt1172 = var31;

		for (var42 = 0; var42 < var11; ++var42) {
			aByteArray1640[var42] = 0;
			aShortArray1641[var42] = (short) var4.method571();
			aShortArray1634[var42] = (short) var4.method571();
			aShortArray1643[var42] = (short) var4.method571();
		}

		if (aByteArray1635 != null) {
			boolean var46 = false;

			for (var43 = 0; var43 < var10; ++var43) {
				var44 = aByteArray1635[var43] & 255;
				if (var44 != 255)
					if (((aShortArray1641[var44] & '\uffff') == anIntArray1664[var43])
							&& ((aShortArray1634[var44] & '\uffff') == anIntArray1630[var43])
							&& ((aShortArray1643[var44] & '\uffff') == anIntArray1642[var43]))
						aByteArray1635[var43] = -1;
					else
						var46 = true;
			}

			if (!var46)
				aByteArray1635 = null;
		}

		if (!var3)
			aShortArray1658 = null;

		if (!var2)
			aByteArray1632 = null;

	}

	public void method909(final short var1, final short var2) {
		if (aShortArray1658 != null)
			for (int var3 = 0; var3 < anInt1628; ++var3)
				if (aShortArray1658[var3] == var1)
					aShortArray1658[var3] = var2;
	}

	public void method910() {
		int var1;
		for (var1 = 0; var1 < anInt1631; ++var1)
			anIntArray1627[var1] = -anIntArray1627[var1];

		for (var1 = 0; var1 < anInt1628; ++var1) {
			final int var2 = anIntArray1664[var1];
			anIntArray1664[var1] = anIntArray1642[var1];
			anIntArray1642[var1] = var2;
		}

		method912();
	}

	public Class104_Sub18_Sub16_Sub5 method911() {
		final Class104_Sub18_Sub16_Sub5 var1 = new Class104_Sub18_Sub16_Sub5();
		if (aByteArray1632 != null) {
			var1.aByteArray1632 = new byte[anInt1628];

			for (int var2 = 0; var2 < anInt1628; ++var2)
				var1.aByteArray1632[var2] = aByteArray1632[var2];
		}

		var1.anInt1631 = anInt1631;
		var1.anInt1628 = anInt1628;
		var1.anInt1629 = anInt1629;
		var1.anIntArray1626 = anIntArray1626;
		var1.anIntArray1625 = anIntArray1625;
		var1.anIntArray1627 = anIntArray1627;
		var1.anIntArray1664 = anIntArray1664;
		var1.anIntArray1630 = anIntArray1630;
		var1.anIntArray1642 = anIntArray1642;
		var1.aByteArray1633 = aByteArray1633;
		var1.aByteArray1662 = aByteArray1662;
		var1.aByteArray1635 = aByteArray1635;
		var1.aShortArray1657 = aShortArray1657;
		var1.aShortArray1658 = aShortArray1658;
		var1.aByte1637 = aByte1637;
		var1.aByteArray1640 = aByteArray1640;
		var1.aShortArray1641 = aShortArray1641;
		var1.aShortArray1634 = aShortArray1634;
		var1.aShortArray1643 = aShortArray1643;
		var1.aShortArray1644 = aShortArray1644;
		var1.aShortArray1645 = aShortArray1645;
		var1.aShortArray1646 = aShortArray1646;
		var1.aShortArray1647 = aShortArray1647;
		var1.aByteArray1650 = aByteArray1650;
		var1.aShortArray1648 = aShortArray1648;
		var1.aShortArray1649 = aShortArray1649;
		var1.anIntArray1666 = anIntArray1666;
		var1.anIntArray1652 = anIntArray1652;
		var1.anIntArrayArray1653 = anIntArrayArray1653;
		var1.anIntArrayArray1654 = anIntArrayArray1654;
		var1.aClass15Array1656 = aClass15Array1656;
		var1.aClass7Array1655 = aClass7Array1655;
		var1.aShort1661 = aShort1661;
		var1.aShort1659 = aShort1659;
		return var1;
	}

	void method912() {
		aClass15Array1656 = null;
		aClass15Array1638 = null;
		aClass7Array1655 = null;
		aBool1660 = false;
	}

	public Class104_Sub18_Sub16_Sub5(final Class104_Sub18_Sub16_Sub5 var1, final boolean var2, final boolean var3,
			final boolean var4, final boolean var5) {
		anInt1631 = var1.anInt1631;
		anInt1628 = var1.anInt1628;
		anInt1629 = var1.anInt1629;
		int var6;
		if (var2) {
			anIntArray1626 = var1.anIntArray1626;
			anIntArray1625 = var1.anIntArray1625;
			anIntArray1627 = var1.anIntArray1627;
		} else {
			anIntArray1626 = new int[anInt1631];
			anIntArray1625 = new int[anInt1631];
			anIntArray1627 = new int[anInt1631];

			for (var6 = 0; var6 < anInt1631; ++var6) {
				anIntArray1626[var6] = var1.anIntArray1626[var6];
				anIntArray1625[var6] = var1.anIntArray1625[var6];
				anIntArray1627[var6] = var1.anIntArray1627[var6];
			}
		}

		if (var3)
			aShortArray1657 = var1.aShortArray1657;
		else {
			aShortArray1657 = new short[anInt1628];

			for (var6 = 0; var6 < anInt1628; ++var6)
				aShortArray1657[var6] = var1.aShortArray1657[var6];
		}

		if (!var4 && (var1.aShortArray1658 != null)) {
			aShortArray1658 = new short[anInt1628];

			for (var6 = 0; var6 < anInt1628; ++var6)
				aShortArray1658[var6] = var1.aShortArray1658[var6];
		} else
			aShortArray1658 = var1.aShortArray1658;

		aByteArray1662 = var1.aByteArray1662;
		anIntArray1664 = var1.anIntArray1664;
		anIntArray1630 = var1.anIntArray1630;
		anIntArray1642 = var1.anIntArray1642;
		aByteArray1632 = var1.aByteArray1632;
		aByteArray1633 = var1.aByteArray1633;
		aByteArray1635 = var1.aByteArray1635;
		aByte1637 = var1.aByte1637;
		aByteArray1640 = var1.aByteArray1640;
		aShortArray1641 = var1.aShortArray1641;
		aShortArray1634 = var1.aShortArray1634;
		aShortArray1643 = var1.aShortArray1643;
		aShortArray1644 = var1.aShortArray1644;
		aShortArray1645 = var1.aShortArray1645;
		aShortArray1646 = var1.aShortArray1646;
		aShortArray1647 = var1.aShortArray1647;
		aByteArray1650 = var1.aByteArray1650;
		aShortArray1648 = var1.aShortArray1648;
		aShortArray1649 = var1.aShortArray1649;
		anIntArray1666 = var1.anIntArray1666;
		anIntArray1652 = var1.anIntArray1652;
		anIntArrayArray1653 = var1.anIntArrayArray1653;
		anIntArrayArray1654 = var1.anIntArrayArray1654;
		aClass15Array1656 = var1.aClass15Array1656;
		aClass7Array1655 = var1.aClass7Array1655;
		aClass15Array1638 = var1.aClass15Array1638;
		aShort1661 = var1.aShort1661;
		aShort1659 = var1.aShort1659;
	}

	public static Class104_Sub18_Sub16_Sub5 method913(final Class61 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method259(var1, var2);
		return var3 == null ? null : new Class104_Sub18_Sub16_Sub5(var3);
	}
}
