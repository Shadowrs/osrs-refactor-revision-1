public final class Class104_Sub18_Sub16_Sub7_Sub1 extends Class104_Sub18_Sub16_Sub7 {
	int anInt1769;
	int anInt1772;
	int anInt1775;
	int anInt1778;
	int anInt1781;
	int anInt1782;
	int anInt1783;
	int anInt1786;
	int anInt1771 = -1;
	int anInt1784 = -1;
	int anInt1773 = 0;
	int anInt1774 = 0;
	int anInt1776 = 0;
	int anInt1777 = 0;
	boolean aBool1779 = false;
	int anInt1787 = 0;
	Class104_Sub18_Sub16_Sub4 aClass104_Sub18_Sub16_Sub4_1785;
	String aString1780;
	Class85 aClass85_1770;

	@Override
	final Class104_Sub18_Sub16_Sub4 method788(final int var1) {
		if (null == aClass85_1770)
			return null;
		else {
			final Class104_Sub18_Sub3 var2 = (anInt1722 != -1) && (anInt1707 == 0) ? Class70.method327(anInt1722)
					: null;
			final Class104_Sub18_Sub3 var3 = (anInt1719 == -1) || aBool1779
					|| ((anInt1702 == anInt1719) && (var2 != null)) ? null : Class70.method327(anInt1719);
			Class104_Sub18_Sub16_Sub4 var4 = aClass85_1770.method389(var2, anInt1732, var3, anInt1720);
			if (null == var4)
				return null;
			else {
				var4.method812();
				anInt1706 = var4.anInt1467;
				Class104_Sub18_Sub16_Sub4 var5;
				Class104_Sub18_Sub16_Sub4[] var6;
				if (!aBool1779 && (anInt1727 != -1) && (anInt1728 != -1)) {
					var5 = Class71.method330(anInt1727).method732(anInt1728);
					if (null != var5) {
						var5.method822(0, -anInt1709, 0);
						var6 = new Class104_Sub18_Sub16_Sub4[] { var4, var5 };
						var4 = new Class104_Sub18_Sub16_Sub4(var6, 2);
					}
				}

				if (!aBool1779 && (null != aClass104_Sub18_Sub16_Sub4_1785)) {
					if (client.anInt1799 >= anInt1777)
						aClass104_Sub18_Sub16_Sub4_1785 = null;

					if ((client.anInt1799 >= anInt1776) && (client.anInt1799 < anInt1777)) {
						var5 = aClass104_Sub18_Sub16_Sub4_1785;
						var5.method822(anInt1778 - anInt1695, anInt1781 - anInt1775, anInt1783 - anInt1694);
						if (anInt1698 == 512) {
							var5.method818();
							var5.method818();
							var5.method818();
						} else if (anInt1698 == 1024) {
							var5.method818();
							var5.method818();
						} else if (anInt1698 == 1536)
							var5.method818();

						var6 = new Class104_Sub18_Sub16_Sub4[] { var4, var5 };
						var4 = new Class104_Sub18_Sub16_Sub4(var6, 2);
						if (anInt1698 == 512)
							var5.method818();
						else if (anInt1698 == 1024) {
							var5.method818();
							var5.method818();
						} else if (anInt1698 == 1536) {
							var5.method818();
							var5.method818();
							var5.method818();
						}

						var5.method822(anInt1695 - anInt1778, anInt1775 - anInt1781, anInt1694 - anInt1783);
					}
				}

				var4.aBool1551 = true;
				return var4;
			}
		}
	}

	@Override
	final boolean method936(final int var1) {
		return null != aClass85_1770;
	}

	final void method950(final RSBuf var1) {
		var1.anInt1172 = 0;
		final int var2 = var1.method570();
		anInt1771 = var1.method565();
		anInt1784 = var1.method565();
		int var3 = -1;
		anInt1787 = 0;
		final int[] var4 = new int[12];

		int var6;
		int var7;
		for (int var5 = 0; var5 < 12; ++var5) {
			var6 = var1.method570();
			if (var6 == 0)
				var4[var5] = 0;
			else {
				var7 = var1.method570();
				var4[var5] = var7 + (var6 << 8);
				if ((var5 == 0) && (var4[0] == '\uffff')) {
					var3 = var1.method571();
					break;
				}

				if (var4[var5] >= 512) {
					final int var8 = Class27.method137(var4[var5] - 512).anInt1420;
					if (var8 != 0)
						anInt1787 = var8;
				}
			}
		}

		final int[] var9 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.method570();
			if ((var7 < 0) || (var7 >= Class47.aShortArrayArray405[var6].length))
				var7 = 0;

			var9[var6] = var7;
		}

		anInt1702 = var1.method571();
		if (anInt1702 == '\uffff')
			anInt1702 = -1;

		anInt1699 = var1.method571();
		if (anInt1699 == '\uffff')
			anInt1699 = -1;

		anInt1700 = anInt1699;
		anInt1701 = var1.method571();
		if (anInt1701 == '\uffff')
			anInt1701 = -1;

		anInt1743 = var1.method571();
		if (anInt1743 == '\uffff')
			anInt1743 = -1;

		anInt1703 = var1.method571();
		if (anInt1703 == '\uffff')
			anInt1703 = -1;

		anInt1704 = var1.method571();
		if (anInt1704 == '\uffff')
			anInt1704 = -1;

		anInt1705 = var1.method571();
		if (anInt1705 == '\uffff')
			anInt1705 = -1;

		aString1780 = var1.method608();
		if (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644 == this)
			RuntimeException_Sub1.aString1478 = aString1780;

		anInt1773 = var1.method570();
		anInt1774 = var1.method571();
		if (aClass85_1770 == null)
			aClass85_1770 = new Class85();

		aClass85_1770.method383(var4, var9, var2 == 1, var3);
	}
}
