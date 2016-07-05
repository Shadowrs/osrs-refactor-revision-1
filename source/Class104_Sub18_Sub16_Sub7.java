public abstract class Class104_Sub18_Sub16_Sub7 extends Class104_Sub18_Sub16 {
	int anInt1693;
	int anInt1697;
	int anInt1698;
	int anInt1708;
	int gfxHeight;
	int anInt1715;
	int anInt1721;
	int anInt1725;
	int gfxDelay;
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
	int stand = -1;
	int turn = -1;
	int walk = -1;
	int walkAnim = -1;
	int turn180 = -1;
	int turn90c = -1;
	int turn90cc = -1;
	int runAnim = -1;
	String forceChat = null;
	int anInt1713 = 100;
	int anInt1731 = 0;
	int anInt1749 = 0;
	int[] hitDmg = new int[4];
	int[] hitType = new int[4];
	int[] hitTimes = new int[4];
	int hitTime = -1000;
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
	int gfxId = -1;
	int anInt1728 = 0;
	int anInt1729 = 0;
	int anInt1739 = 0;
	int anInt1706 = 200;
	int anInt1742 = 0;
	int anInt1740 = 32;
	int[] stepx = new int[10];
	int[] stepy = new int[10];
	boolean[] aBoolArray1747 = new boolean[10];

	final void method932() {
		anInt1744 = 0;
		anInt1735 = 0;
	}

	final void placeEntity(final int var1, final int var2, final boolean teleported) {
		if ((anInt1722 != -1) && (Class70.forId(anInt1722).anInt1274 == 1))
			anInt1722 = -1;

		if (!teleported) {
			final int var4 = var1 - stepx[0];
			final int var5 = var2 - stepy[0];
			if ((var4 >= -8) && (var4 <= 8) && (var5 >= -8) && (var5 <= 8)) {
				if (anInt1744 < 9)
					++anInt1744;

				for (int var6 = anInt1744; var6 > 0; --var6) {
					stepx[var6] = stepx[var6 - 1];
					stepy[var6] = stepy[var6 - 1];
					aBoolArray1747[var6] = aBoolArray1747[var6 - 1];
				}

				stepx[0] = var1;
				stepy[0] = var2;
				aBoolArray1747[0] = false;
				return;
			}
		}

		anInt1744 = 0;
		anInt1735 = 0;
		anInt1748 = 0;
		stepx[0] = var1;
		stepy[0] = var2;
		anInt1695 = (anInt1736 * 64) + (stepx[0] * 128);
		anInt1694 = (128 * stepy[0]) + (anInt1736 * 64);
	}

	final void step(final int dir, final boolean run) {
		int var3 = stepx[0];
		int var4 = stepy[0];
		if (dir == 0) {
			--var3;
			++var4;
		}

		if (dir == 1)
			++var4;

		if (dir == 2) {
			++var3;
			++var4;
		}

		if (dir == 3)
			--var3;

		if (dir == 4)
			++var3;

		if (dir == 5) {
			--var3;
			--var4;
		}

		if (dir == 6)
			--var4;

		if (dir == 7) {
			++var3;
			--var4;
		}

		if ((anInt1722 != -1) && (Class70.forId(anInt1722).anInt1274 == 1))
			anInt1722 = -1;

		if (anInt1744 < 9)
			++anInt1744;

		for (int var5 = anInt1744; var5 > 0; --var5) {
			stepx[var5] = stepx[var5 - 1];
			stepy[var5] = stepy[var5 - 1];
			aBoolArray1747[var5] = aBoolArray1747[var5 - 1];
		}

		stepx[0] = var3;
		stepy[0] = var4;
		aBoolArray1747[0] = run;
	}

	final void hits(final int dmg, final int type, final int time) {
		for (int i = 0; i < 4; ++i)
			if (hitTimes[i] <= time) {
				hitDmg[i] = dmg;
				hitType[i] = type;
				hitTimes[i] = time + 70;
				return;
			}

	}

	boolean forcefalse(final int var1) {
		return false;
	}
}
