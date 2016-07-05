import java.util.Arrays;

public final class Player extends Class104_Sub18_Sub16_Sub7 {
	int anInt1769;
	int anInt1772;
	int anInt1775;
	int anInt1778;
	int anInt1781;
	int anInt1782;
	int anInt1783;
	int anInt1786;
	int skull = -1;
	int pray = -1;
	int combatLevel = 0;
	int skillLevel = 0;
	int anInt1776 = 0;
	int anInt1777 = 0;
	boolean aBool1779 = false;
	int itemrender = 0;
	Class104_Sub18_Sub16_Sub4 aClass104_Sub18_Sub16_Sub4_1785;
	String myName;
	Looks appearance;

	@Override
	final Class104_Sub18_Sub16_Sub4 method788(final int var1) {
		if (null == appearance)
			return null;
		else {
			final Def var2 = (anInt1722 != -1) && (anInt1707 == 0) ? Class70.forId(anInt1722)
					: null;
			final Def var3 = (anInt1719 == -1) || aBool1779
					|| ((stand == anInt1719) && (var2 != null)) ? null : Class70.forId(anInt1719);
			Class104_Sub18_Sub16_Sub4 var4 = appearance.method389(var2, anInt1732, var3, anInt1720);
			if (null == var4)
				return null;
			else {
				var4.method812();
				anInt1706 = var4.anInt1467;
				Class104_Sub18_Sub16_Sub4 var5;
				Class104_Sub18_Sub16_Sub4[] var6;
				if (!aBool1779 && (gfxId != -1) && (anInt1728 != -1)) {
					var5 = Class71.method330(gfxId).method732(anInt1728);
					if (null != var5) {
						var5.method822(0, -gfxHeight, 0);
						var6 = new Class104_Sub18_Sub16_Sub4[] { var4, var5 };
						var4 = new Class104_Sub18_Sub16_Sub4(var6, 2);
					}
				}

				if (!aBool1779 && (null != aClass104_Sub18_Sub16_Sub4_1785)) {
					if (client.currentTime >= anInt1777)
						aClass104_Sub18_Sub16_Sub4_1785 = null;

					if ((client.currentTime >= anInt1776) && (client.currentTime < anInt1777)) {
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
	final boolean forcefalse(final int var1) {
		return null != appearance;
	}

	final void decodeAppearance(final RSBuf cachedAppearance) {
		cachedAppearance.pos = 0;
		final int gender = cachedAppearance.readUByte();
		skull = cachedAppearance.readByte();
		pray = cachedAppearance.readByte();
		//System.out.printf("icons %d %d %d \n ", gender, skull, pray);
		int npcAppearance = -1;
		itemrender = 0;
		final int[] equipment = new int[12];

		int temp;
		int shortt;
		for (int caret = 0; caret < 12; ++caret) {
			temp = cachedAppearance.readUByte();
			if (temp == 0) {
				equipment[caret] = 0;
				System.out.println("looks["+caret+"] = 0");
			} else {
				shortt = cachedAppearance.readUByte();
				equipment[caret] = shortt + (temp << 8);
				if ((caret == 0) && (equipment[0] == '\uffff')) { // -1, npc appearance
					npcAppearance = cachedAppearance.readShort();
					break;
				}

				if (equipment[caret] >= 512) { // a value < 512 will be looks. >512 is an item ID
					final int itemConfig = Class27.forId(equipment[caret] - 512).looksConfig;
					if (itemConfig != 0)
						itemrender = itemConfig;
				}
				System.out.println("looks["+caret+"] :: val="+equipment[caret]+" item="+(equipment[caret]-512));
			}
		}
		System.out.println("player render : "+Arrays.toString(equipment));

		final int[] skin = new int[5];

		for (temp = 0; temp < 5; ++temp) {
			shortt = cachedAppearance.readUByte(); // index in the colors array
			if ((shortt < 0) || (shortt >= Class47.skinCols[temp].length))
				shortt = 0;

			skin[temp] = shortt;
		}
		System.out.println("skin : "+Arrays.toString(skin));

		stand = cachedAppearance.readShort();
		if (stand == '\uffff')
			stand = -1;

		turn = cachedAppearance.readShort();
		if (turn == '\uffff')
			turn = -1;

		walk = turn;
		walkAnim = cachedAppearance.readShort();
		if (walkAnim == '\uffff')
			walkAnim = -1;

		turn180 = cachedAppearance.readShort();
		if (turn180 == '\uffff')
			turn180 = -1;

		turn90c = cachedAppearance.readShort();
		if (turn90c == '\uffff')
			turn90c = -1;

		turn90cc = cachedAppearance.readShort();
		if (turn90cc == '\uffff')
			turn90cc = -1;

		runAnim = cachedAppearance.readShort();
		if (runAnim == '\uffff')
			runAnim = -1;

		myName = cachedAppearance.readString();
		if (Class81.activePlayer == this)
			RuntimeException_Sub1.playerName = myName;

		combatLevel = cachedAppearance.readUByte();
		skillLevel = cachedAppearance.readShort();
		if (appearance == null)
			appearance = new Looks();

		appearance.render(equipment, skin, gender == 1, npcAppearance);
		
		System.out.printf("other: %d %d %d %d %d %d %d -- '%s' %d %d \n",
				stand, walk, runAnim, turn, turn90c, turn90cc, turn180, 
				myName, combatLevel, skillLevel);
	}
}
