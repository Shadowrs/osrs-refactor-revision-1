public abstract class Class104_Sub18_Sub16_Sub7 extends Class104_Sub18_Sub16 {
	int anInt1693;
	int anInt1697;
	int anInt1698;
	int anInt1708;
	int anInt1709;
	int anInt1715;
	int anInt1721;
	int anInt1725;
	int anInt1730;
	int anInt1733;
	int anInt1734;
	int anInt1737;
	int anInt1738;
	int anInt1744 = 0;
	int anInt1735 = 0;
	int anInt1722 = -1;
	int anInt1748 = 0;
	int anInt1695;
	int anInt1694;
	boolean aBool1696 = false;
	int anInt1736 = 1;
	int anInt1702 = -1;
	int anInt1699 = -1;
	int anInt1700 = -1;
	int anInt1701 = -1;
	int anInt1743 = -1;
	int anInt1703 = -1;
	int anInt1704 = -1;
	int anInt1705 = -1;
	String aString1723 = null;
	int anInt1713 = 100;
	int anInt1731 = 0;
	int anInt1749 = 0;
	int[] anIntArray1710 = new int[4];
	int[] anIntArray1711 = new int[4];
	int[] anIntArray1712 = new int[4];
	int anInt1714 = -1000;
	int anInt1716 = -1;
	int anInt1717 = 0;
	int anInt1718 = 0;
	int anInt1719 = -1;
	int anInt1720 = 0;
	int anInt1741 = 0;
	int anInt1732 = 0;
	int anInt1724 = 0;
	int anInt1707 = 0;
	int anInt1726 = 0;
	int anInt1727 = -1;
	int anInt1728 = 0;
	int anInt1729 = 0;
	int anInt1739 = 0;
	int anInt1706 = 200;
	int anInt1742 = 0;
	int anInt1740 = 32;
	int[] anIntArray1745 = new int[10];
	int[] anIntArray1746 = new int[10];
	boolean[] aBoolArray1747 = new boolean[10];

	final void method932() {
		anInt1744 = 0;
		anInt1735 = 0;
	}

	final void placeEntity(final int var1, final int var2, final boolean var3) {
		if ((anInt1722 != -1) && (Class70.method327(anInt1722).anInt1274 == 1))
			anInt1722 = -1;

		if (!var3) {
			final int var4 = var1 - anIntArray1745[0];
			final int var5 = var2 - anIntArray1746[0];
			if ((var4 >= -8) && (var4 <= 8) && (var5 >= -8) && (var5 <= 8)) {
				if (anInt1744 < 9)
					++anInt1744;

				for (int var6 = anInt1744; var6 > 0; --var6) {
					anIntArray1745[var6] = anIntArray1745[var6 - 1];
					anIntArray1746[var6] = anIntArray1746[var6 - 1];
					aBoolArray1747[var6] = aBoolArray1747[var6 - 1];
				}

				anIntArray1745[0] = var1;
				anIntArray1746[0] = var2;
				aBoolArray1747[0] = false;
				return;
			}
		}

		anInt1744 = 0;
		anInt1735 = 0;
		anInt1748 = 0;
		anIntArray1745[0] = var1;
		anIntArray1746[0] = var2;
		anInt1695 = (anInt1736 * 64) + (anIntArray1745[0] * 128);
		anInt1694 = (128 * anIntArray1746[0]) + (anInt1736 * 64);
	}

	final void step(final int var1, final boolean var2) {
		int var3 = anIntArray1745[0];
		int var4 = anIntArray1746[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1)
			++var4;

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3)
			--var3;

		if (var1 == 4)
			++var3;

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6)
			--var4;

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if ((anInt1722 != -1) && (Class70.method327(anInt1722).anInt1274 == 1))
			anInt1722 = -1;

		if (anInt1744 < 9)
			++anInt1744;

		for (int var5 = anInt1744; var5 > 0; --var5) {
			anIntArray1745[var5] = anIntArray1745[var5 - 1];
			anIntArray1746[var5] = anIntArray1746[var5 - 1];
			aBoolArray1747[var5] = aBoolArray1747[var5 - 1];
		}

		anIntArray1745[0] = var3;
		anIntArray1746[0] = var4;
		aBoolArray1747[0] = var2;
	}

	final void method935(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < 4; ++var4)
			if (anIntArray1712[var4] <= var3) {
				anIntArray1710[var4] = var1;
				anIntArray1711[var4] = var2;
				anIntArray1712[var4] = var3 + 70;
				return;
			}

	}

	boolean method936(final int var1) {
		return false;
	}
}
