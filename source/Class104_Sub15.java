import java.awt.Graphics;

public class Class104_Sub15 extends Class104 {
	int anInt1102;
	int anInt1104;
	int anInt1105;
	int anInt1106;
	int anInt1107;
	int anInt1108;
	int anInt1109;
	int anInt1110;
	int anInt1111;
	int anInt1112;
	int anInt1113;
	int anInt1115;
	int anInt1117;
	int anInt1118;
	int anInt1119;
	int anInt1121;
	int anInt1122;
	static Class104_Sub18_Sub17_Sub1[] aClass104_Sub18_Sub17_Sub1Array1123;
	static byte[][] terrainData;
	static Class104_Sub18_Sub17_Sub3[] aClass104_Sub18_Sub17_Sub3Array1125;
	Class104_Sub11 aClass104_Sub11_1103;
	Class104_Sub4_Sub1 aClass104_Sub4_Sub1_1116;
	Class81 aClass81_1114;
	Class104_Sub8_Sub3 aClass104_Sub8_Sub3_1120;

	void method548() {
		aClass104_Sub11_1103 = null;
		aClass104_Sub4_Sub1_1116 = null;
		aClass81_1114 = null;
		aClass104_Sub8_Sub3_1120 = null;
	}

	static final void playerUpdate() {
		client.anInt1904 = 0;
		client.anInt1910 = 0;
		client.gamecon.initbits();
		int needsUpdate = client.gamecon.readbits(1);
		int movetype;
		int dir1;
		int dir2;
		int update;
		int updateFlag;
		if (needsUpdate != 0) {
			movetype = client.gamecon.readbits(2);
			if (movetype == 0)
				client.updates[++client.anInt1910 - 1] = 2047;
			else if (movetype == 1) {
				dir1 = client.gamecon.readbits(3);
				Class81.pf.step(dir1, false);
				dir2 = client.gamecon.readbits(1);
				if (dir2 == 1)
					client.updates[++client.anInt1910 - 1] = 2047;
			} else if (movetype == 2) {
				dir1 = client.gamecon.readbits(3);
				Class81.pf.step(dir1, true);
				dir2 = client.gamecon.readbits(3);
				Class81.pf.step(dir2, true);
				update = client.gamecon.readbits(1);
				if (update == 1)
					client.updates[++client.anInt1910 - 1] = 2047;
			} else if (movetype == 3) { // teleport
				Class12.myplayerHeight = client.gamecon.readbits(2);
				dir1 = client.gamecon.readbits(7); // x
				dir2 = client.gamecon.readbits(1);
				if (dir2 == 1)
					client.updates[++client.anInt1910 - 1] = 2047;

				update = client.gamecon.readbits(7); // y
				updateFlag = client.gamecon.readbits(1); // teleporting flag
				Class81.pf.placeEntity(dir1, update, updateFlag == 1);
			}
		}

		needsUpdate = client.gamecon.readbits(8);
		if (needsUpdate < client.toUpdate)
			for (movetype = needsUpdate; movetype < client.toUpdate; ++movetype)
				client.anIntArray2048[++client.anInt1904 - 1] = client.localPlayerIndexs[movetype];

		if (needsUpdate > client.toUpdate)
			throw new RuntimeException("");
		else {
			client.toUpdate = 0;

			int movee;
			int move2;
			for (movetype = 0; movetype < needsUpdate; ++movetype) {
				dir1 = client.localPlayerIndexs[movetype];
				final Player entity = client.localNpcs[dir1];
				update = client.gamecon.readbits(1);
				if (update == 0) {
					client.localPlayerIndexs[++client.toUpdate - 1] = dir1;
					entity.anInt1739 = client.anInt1799;
				} else {
					updateFlag = client.gamecon.readbits(2);
					if (updateFlag == 0) {
						client.localPlayerIndexs[++client.toUpdate - 1] = dir1;
						entity.anInt1739 = client.anInt1799;
						client.updates[++client.anInt1910 - 1] = dir1;
					} else if (updateFlag == 1) {
						client.localPlayerIndexs[++client.toUpdate - 1] = dir1;
						entity.anInt1739 = client.anInt1799;
						movee = client.gamecon.readbits(3);
						entity.step(movee, false);
						move2 = client.gamecon.readbits(1);
						if (move2 == 1)
							client.updates[++client.anInt1910 - 1] = dir1;
					} else if (updateFlag == 2) {
						client.localPlayerIndexs[++client.toUpdate - 1] = dir1;
						entity.anInt1739 = client.anInt1799;
						movee = client.gamecon.readbits(3);
						entity.step(movee, true);
						move2 = client.gamecon.readbits(3);
						entity.step(move2, true);
						final int var9 = client.gamecon.readbits(1);
						if (var9 == 1)
							client.updates[++client.anInt1910 - 1] = dir1;
					} else if (updateFlag == 3)
						client.anIntArray2048[++client.anInt1904 - 1] = dir1;
				}
			}

			Player entity;
			// new npcs
			for (; client.gamecon.availbits(client.pktSize) >= 11; entity.placeEntity( updateFlag + Class81.pf.stepx[0], dir2 + Class81.pf.stepy[0], movee == 1)) {
				needsUpdate = client.gamecon.readbits(11);
				if (needsUpdate == 2047) // break flag
					break;

				boolean hasCachedAppearance = false;
				if (null == client.localNpcs[needsUpdate]) {
					client.localNpcs[needsUpdate] = new Player();
					if (null != client.cachedAppearances[needsUpdate])
						client.localNpcs[needsUpdate] .decodeAppearance(client.cachedAppearances[needsUpdate]);

					hasCachedAppearance = true;
				}

				client.localPlayerIndexs[++client.toUpdate - 1] = needsUpdate;
				entity = client.localNpcs[needsUpdate];
				entity.anInt1739 = client.anInt1799;
				dir2 = client.gamecon.readbits(5); // y
				if (dir2 > 15)
					dir2 -= 32;

				update = client.anIntArray1817[client.gamecon.readbits(3)];
				if (hasCachedAppearance)
					entity.anInt1698 = entity.anInt1725 = update;

				updateFlag = client.gamecon.readbits(5); // x
				if (updateFlag > 15)
					updateFlag -= 32;

				movee = client.gamecon.readbits(1);
				move2 = client.gamecon.readbits(1);
				if (move2 == 1)
					client.updates[++client.anInt1910 - 1] = needsUpdate;
			}

			client.gamecon.endbits();

			for (needsUpdate = 0; needsUpdate < client.anInt1910; ++needsUpdate) {
				movetype = client.updates[needsUpdate];
				entity = client.localNpcs[movetype];
				dir2 = client.gamecon.readUByte();
				// larger mask
				if ((dir2 & 64) != 0)
					dir2 += client.gamecon.readUByte() << 8;

				if ((dir2 & 4) != 0) { // public chat
					update = client.gamecon.readLEShort();
					updateFlag = client.gamecon.readUByte();
					movee = client.gamecon.readUByte();
					move2 = client.gamecon.pos;
					if ((null != entity.aString1780) && (entity.aClass85_1770 != null)) {
						boolean var15 = false;
						if ((updateFlag <= 1) && Class34.method166(entity.aString1780))
							var15 = true;

						if (!var15 && (client.anInt1906 == 0)) {
							client.somebuf.pos = 0;
							client.gamecon.readBytes(client.somebuf.backing, 0, movee);
							client.somebuf.pos = 0;
							final String rStr = client .fixed(client.format(client.huffmanDecode(client.somebuf)));
							entity.aString1723 = rStr.trim();
							entity.anInt1731 = update >> 8;
							entity.anInt1749 = update & 255;
							entity.anInt1713 = 150;
							if ((updateFlag != 2) && (updateFlag != 3)) {
								if (updateFlag == 1)
									Class15.method60(1, Class72.method335(0) + entity.aString1780, rStr);
								else
									Class15.method60(2, entity.aString1780, rStr);
							} else
								Class15.method60(1, Class72.method335(1) + entity.aString1780, rStr);
						}
					}

					client.gamecon.pos = move2 + movee;
				}

				if ((dir2 & 2) != 0) { // appearance
					update = client.gamecon.readUByteS();
					final byte[] data = new byte[update];
					final RSBuf buf = new RSBuf(data);
					client.gamecon.method617(data, 0, update);
					client.cachedAppearances[movetype] = buf;
					entity.decodeAppearance(buf);
				}

				if ((dir2 & 256) != 0) { // force move
					entity.anInt1697 = client.gamecon.readUByte();
					entity.anInt1734 = client.gamecon.readByteN();
					entity.anInt1733 = client.gamecon.readUByte();
					entity.anInt1721 = client.gamecon.method576();
					entity.anInt1708 = client.gamecon.method594() + client.anInt1799;
					entity.anInt1737 = client.gamecon.readLEShort() + client.anInt1799;
					entity.anInt1738 = client.gamecon.readByteN();
					entity.anInt1744 = 1;
					entity.anInt1735 = 0;
				}

				if ((dir2 & 32) != 0) { // face entity
					entity.anInt1716 = client.gamecon.readShortN();
					if (entity.anInt1716 == '\uffff')
						entity.anInt1716 = -1;
				}

				if ((dir2 & 128) != 0) { // face tile
					entity.anInt1717 = client.gamecon.method594();
					entity.anInt1718 = client.gamecon.readShort();
				}

				if ((dir2 & 16) != 0) { // anim
					update = client.gamecon.method594();
					if (update == '\uffff')
						update = -1;

					updateFlag = client.gamecon.readByteN();
					Class75.transform(entity, update, updateFlag);
				}

				if ((dir2 & 512) != 0) { // graphic
					entity.anInt1727 = client.gamecon.readShort();
					update = client.gamecon.readLEInt();
					entity.anInt1709 = update >> 16;
					entity.anInt1730 = client.anInt1799 + (update & '\uffff');
					entity.anInt1728 = 0;
					entity.anInt1729 = 0;
					if (entity.anInt1730 > client.anInt1799)
						entity.anInt1728 = -1;

					if (entity.anInt1727 == '\uffff')
						entity.anInt1727 = -1;
				}

				if ((dir2 & 1024) != 0) { // hit1
					update = client.gamecon.method576();
					updateFlag = client.gamecon.readUByteS();
					entity.hits(update, updateFlag, client.anInt1799);
					entity.anInt1714 = client.anInt1799 + 300;
					entity.anInt1693 = client.gamecon.readUByte();
					entity.anInt1715 = client.gamecon.readByteN();
				}

				if ((dir2 & 1) != 0) { // force chat
					entity.aString1723 = client.gamecon.readString();
					if (entity.aString1723.charAt(0) == 126) {
						entity.aString1723 = entity.aString1723.substring(1);
						Class15.method60(2, entity.aString1780, entity.aString1723);
					} else if (Class81.pf == entity)
						Class15.method60(2, entity.aString1780, entity.aString1723);

					entity.anInt1731 = 0;
					entity.anInt1749 = 0;
					entity.anInt1713 = 150;
				}

				if ((dir2 & 8) != 0) { // hit 2
					update = client.gamecon.method576();
					updateFlag = client.gamecon.readUByteS();
					entity.hits(update, updateFlag, client.anInt1799);
					entity.anInt1714 = 300 + client.anInt1799;
					entity.anInt1693 = client.gamecon.method576();
					entity.anInt1715 = client.gamecon.readUByte();
				}
			}

			for (needsUpdate = 0; needsUpdate < client.anInt1904; ++needsUpdate) {
				movetype = client.anIntArray2048[needsUpdate];
				if (client.anInt1799 != client.localNpcs[movetype].anInt1739)
					client.localNpcs[movetype] = null;
			}

			if (client.gamecon.pos != client.pktSize)
				throw new RuntimeException(client.gamecon.pos + "," + client.pktSize);
			else
				for (needsUpdate = 0; needsUpdate < client.toUpdate; ++needsUpdate)
					if (client.localNpcs[client.localPlayerIndexs[needsUpdate]] == null)
						throw new RuntimeException(needsUpdate + "," + client.toUpdate);
		}
	}

	static final void drawLoading(final String str, final boolean var1) {
		System.out.println(str);
		final byte var2 = 4;
		final int var3 = var2 + 6;
		final int var4 = 6 + var2;
		final int var5 = Class29.aClass104_Sub18_Sub17_Sub2_Sub1_277.method862(str, 250);
		final int var6 = Class29.aClass104_Sub18_Sub17_Sub2_Sub1_277.method885(str, 250) * 13;
		Class104_Sub18_Sub17.method805(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 0);
		Class104_Sub18_Sub17.method806(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215);
		Class29.aClass104_Sub18_Sub17_Sub2_Sub1_277.method865(str, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
		Class44.method192(var3 - var2, var4 - var2, var2 + var2 + var5, var6 + var2 + var2);
		if (var1)
			try {
				final Graphics var7 = Class57.aCanvas468.getGraphics();
				Applet_Sub1.aClass2_1764.method19(var7, 0, 0, 1996793884);
			} catch (final Exception var13) {
				Class57.aCanvas468.repaint();
			}
		else {
			final int var8 = var3;
			final int var9 = var4;
			final int var10 = var5;
			final int var11 = var6;

			for (int var12 = 0; var12 < client.anInt1982; ++var12)
				if (((client.anIntArray1995[var12] + client.anIntArray1993[var12]) > var8)
						&& (client.anIntArray1993[var12] < (var10 + var8))
						&& ((client.anIntArray1876[var12] + client.anIntArray1996[var12]) > var9)
						&& (client.anIntArray1876[var12] < (var11 + var9)))
					client.aBoolArray1991[var12] = true;
		}

	}
}
