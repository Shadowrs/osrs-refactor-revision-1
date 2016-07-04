public abstract class Class61 {
	public int anInt489;
	int count;
	int[] anIntArray479;
	int[] anIntArray483;
	int[] anIntArray493;
	int[] anIntArray485;
	int[][] anIntArrayArray486;
	Object[] anObjectArray492;
	Object[][] fileArray;
	int[] anIntArray481;
	Class73 aClass73_482;
	int[][] anIntArrayArray487;
	Class73[] aClass73Array488;
	boolean aBool480;
	boolean aBool494;
	static GZIPDecompressor inflation = new GZIPDecompressor();
	static int maxSize = 0; // anInt490 - if its unused maybe its used by reflection to check perms

	void method257(final byte[] raw) {
		final int len = raw.length;
		int var3 = -1;

		int var4;
		for (var4 = 0; var4 < len; ++var4)
			var3 = (var3 >>> 8) ^ RSBuf.SHIFTS[(var3 ^ raw[var4]) & 255];

		var3 = ~var3;
		anInt489 = var3;
		final RSBuf buf = new RSBuf(Class57.decodeCompression(raw));
		var3 = buf.readUByte();
		if ((var3 >= 5) && (var3 <= 7)) {
			if (var3 >= 6)
				buf.readLEInt();

			var4 = buf.readUByte();
			if (var3 >= 7)
				count = buf.method579();
			else
				count = buf.readLEShort();

			int var8 = 0;
			int var9 = -1;
			anIntArray479 = new int[count];
			int var10;
			if (var3 >= 7)
				for (var10 = 0; var10 < count; ++var10) {
					anIntArray479[var10] = var8 += buf.method579();
					if (anIntArray479[var10] > var9)
						var9 = anIntArray479[var10];
				}
			else
				for (var10 = 0; var10 < count; ++var10) {
					anIntArray479[var10] = var8 += buf.readLEShort();
					if (anIntArray479[var10] > var9)
						var9 = anIntArray479[var10];
				}

			anIntArray483 = new int[var9 + 1];
			anIntArray493 = new int[1 + var9];
			anIntArray485 = new int[var9 + 1];
			anIntArrayArray486 = new int[1 + var9][];
			anObjectArray492 = new Object[var9 + 1];
			fileArray = new Object[var9 + 1][];
			if (var4 != 0) {
				anIntArray481 = new int[var9 + 1];

				for (var10 = 0; var10 < count; ++var10)
					anIntArray481[anIntArray479[var10]] = buf.readLEInt();

				aClass73_482 = new Class73(anIntArray481);
			}

			for (var10 = 0; var10 < count; ++var10)
				anIntArray483[anIntArray479[var10]] = buf.readLEInt();

			for (var10 = 0; var10 < count; ++var10)
				anIntArray493[anIntArray479[var10]] = buf.readLEInt();

			for (var10 = 0; var10 < count; ++var10)
				anIntArray485[anIntArray479[var10]] = buf.readLEShort();

			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			if (var3 >= 7)
				for (var10 = 0; var10 < count; ++var10) {
					var11 = anIntArray479[var10];
					var12 = anIntArray485[var11];
					var8 = 0;
					var13 = -1;
					anIntArrayArray486[var11] = new int[var12];

					for (var14 = 0; var14 < var12; ++var14) {
						var15 = anIntArrayArray486[var11][var14] = var8 += buf.method579();
						if (var15 > var13)
							var13 = var15;
					}

					fileArray[var11] = new Object[1 + var13];
				}
			else
				for (var10 = 0; var10 < count; ++var10) {
					var11 = anIntArray479[var10];
					var12 = anIntArray485[var11];
					var8 = 0;
					var13 = -1;
					anIntArrayArray486[var11] = new int[var12];

					for (var14 = 0; var14 < var12; ++var14) {
						var15 = anIntArrayArray486[var11][var14] = var8 += buf.readLEShort();
						if (var15 > var13)
							var13 = var15;
					}

					fileArray[var11] = new Object[1 + var13];
				}

			if (var4 != 0) {
				anIntArrayArray487 = new int[var9 + 1][];
				aClass73Array488 = new Class73[var9 + 1];

				for (var10 = 0; var10 < count; ++var10) {
					var11 = anIntArray479[var10];
					var12 = anIntArray485[var11];
					anIntArrayArray487[var11] = new int[fileArray[var11].length];

					for (var13 = 0; var13 < var12; ++var13)
						anIntArrayArray487[var11][anIntArrayArray486[var11][var13]] = buf.readLEInt();

					aClass73Array488[var11] = new Class73(anIntArrayArray487[var11]);
				}
			}

		} else
			throw new RuntimeException("");
	}

	void method258(final int var1, final byte var2) {
	}

	public byte[] decompress(final int var1, final int var2) {
		return filedata(var1, var2, (int[]) null);
	}

	public boolean method260(final int var1, final int var2) {
		if ((var1 >= 0) && (var1 < fileArray.length) && (fileArray[var1] != null) && (var2 >= 0)
				&& (var2 < fileArray[var1].length)) {
			if (fileArray[var1][var2] != null)
				return true;
			else if (null != anObjectArray492[var1])
				return true;
			else {
				submitArchiveRequest(var1, (byte) 87);
				return null != anObjectArray492[var1];
			}
		} else
			return false;
	}

	public boolean method261() {
		boolean var1 = true;

		for (final int var3 : anIntArray479) {
			if (anObjectArray492[var3] == null) {
				submitArchiveRequest(var3, (byte) 27);
				if (null == anObjectArray492[var3])
					var1 = false;
			}
		}

		return var1;
	}

	public byte[] method262(final int var1, final int var2) {
		if ((var1 >= 0) && (var1 < fileArray.length) && (fileArray[var1] != null) && (var2 >= 0)
				&& (var2 < fileArray[var1].length)) {
			if (null == fileArray[var1][var2]) {
				boolean var3 = method270(var1, (int[]) null);
				if (!var3) {
					submitArchiveRequest(var1, (byte) 121);
					var3 = method270(var1, (int[]) null);
					if (!var3)
						return null;
				}
			}

			final byte[] var4 = Class90.fileToByteArray(fileArray[var1][var2], false);
			return var4;
		} else
			return null;
	}

	public byte[] method263(final int var1) {
		if (fileArray.length == 1)
			return method262(0, var1);
		else if (fileArray[var1].length == 1)
			return method262(var1, 0);
		else
			throw new RuntimeException();
	}

	void submitArchiveRequest(final int var1, final byte var2) {
	}

	public int[] method265(final int var1) {
		return anIntArrayArray486[var1];
	}

	public int leng(final int var1) {
		return fileArray[var1].length;
	}

	public int method267() {
		return fileArray.length;
	}

	public void method268(String var1) {
		var1 = var1.toLowerCase();
		final int var2 = aClass73_482.method336(Class67.method319(var1));
		if (var2 >= 0)
			method258(var2, (byte) 75);
	}

	public void method269() {
		for (int var1 = 0; var1 < fileArray.length; ++var1)
			if (fileArray[var1] != null)
				for (int var2 = 0; var2 < fileArray[var1].length; ++var2)
					fileArray[var1][var2] = null;

	}

	boolean method270(final int var1, final int[] var2) {
		if (anObjectArray492[var1] == null)
			return false;
		else {
			final int var3 = anIntArray485[var1];
			final int[] var4 = anIntArrayArray486[var1];
			final Object[] var5 = fileArray[var1];
			boolean var6 = true;

			for (int var7 = 0; var7 < var3; ++var7)
				if (var5[var4[var7]] == null) {
					var6 = false;
					break;
				}

			if (var6)
				return true;
			else {
				byte[] var8;
				if ((null != var2) && ((var2[0] != 0) || (var2[1] != 0) || (var2[2] != 0) || (var2[3] != 0))) {
					var8 = Class90.fileToByteArray(anObjectArray492[var1], true);
					final RSBuf var9 = new RSBuf(var8);
					var9.method605(var2, 5, var9.backing.length);
				} else
					var8 = Class90.fileToByteArray(anObjectArray492[var1], false);

				final byte[] var20 = Class57.decodeCompression(var8);
				if (aBool480)
					anObjectArray492[var1] = null;

				if (var3 > 1) {
					int var10 = var20.length;
					--var10;
					final int var11 = var20[var10] & 255;
					var10 -= var11 * var3 * 4;
					final RSBuf var12 = new RSBuf(var20);
					final int[] var13 = new int[var3];
					var12.pos = var10;

					int var15;
					int var16;
					for (int var14 = 0; var14 < var11; ++var14) {
						var15 = 0;

						for (var16 = 0; var16 < var3; ++var16) {
							var15 += var12.readLEInt();
							var13[var16] += var15;
						}
					}

					final byte[][] var17 = new byte[var3][];

					for (var15 = 0; var15 < var3; ++var15) {
						var17[var15] = new byte[var13[var15]];
						var13[var15] = 0;
					}

					var12.pos = var10;
					var15 = 0;

					for (var16 = 0; var16 < var11; ++var16) {
						int var18 = 0;

						for (int var19 = 0; var19 < var3; ++var19) {
							var18 += var12.readLEInt();
							System.arraycopy(var20, var15, var17[var19], var13[var19], var18);
							var13[var19] += var18;
							var15 += var18;
						}
					}

					for (var16 = 0; var16 < var3; ++var16)
						if (!aBool494)
							var5[var4[var16]] = Class52.method229(var17[var16], false);
						else
							var5[var4[var16]] = var17[var16];
				} else if (!aBool494)
					var5[var4[0]] = Class52.method229(var20, false);
				else
					var5[var4[0]] = var20;

				return true;
			}
		}
	}

	public int getArchiveIDForName(String filename) {
		filename = filename.toLowerCase();
		return aClass73_482.method336(Class67.method319(filename));
	}

	public byte[] method272(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		final int var3 = aClass73_482.method336(Class67.method319(var1));
		final int var4 = aClass73Array488[var3].method336(Class67.method319(var2));
		return decompress(var3, var4);
	}

	public int method273(final int var1, String var2) {
		var2 = var2.toLowerCase();
		return aClass73Array488[var1].method336(Class67.method319(var2));
	}

	public boolean method274(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		final int var3 = aClass73_482.method336(Class67.method319(var1));
		final int var4 = aClass73Array488[var3].method336(Class67.method319(var2));
		return method260(var3, var4);
	}

	Class61(final boolean var1, final boolean var2) {
		aBool480 = var1;
		aBool494 = var2;
	}

	public byte[] filedata(final int archiveID, final int fileID, final int[] keys) {
		if ((archiveID >= 0) && (archiveID < fileArray.length) && (null != fileArray[archiveID]) && (fileID >= 0)
				&& (fileID < fileArray[archiveID].length)) {
			if (null == fileArray[archiveID][fileID]) {
				boolean var4 = method270(archiveID, keys);
				if (!var4) {
					submitArchiveRequest(archiveID, (byte) 124);
					var4 = method270(archiveID, keys);
					if (!var4)
						return null;
				}
			}

			final byte[] var5 = Class90.fileToByteArray(fileArray[archiveID][fileID], false);
			if (aBool494)
				fileArray[archiveID][fileID] = null;

			return var5;
		} else
			return null;
	}

	public void method276(final int var1, final int var2) {
		for (int var3 = 0; var3 < fileArray[var1].length; ++var3)
			fileArray[var1][var3] = null;

	}

	public byte[] method277(final int var1) {
		if (fileArray.length == 1)
			return decompress(0, var1);
		else if (fileArray[var1].length == 1)
			return decompress(var1, 0);
		else
			throw new RuntimeException();
	}

	public boolean requested(final int var1) {
		if (anObjectArray492[var1] != null)
			return true;
		else {
			submitArchiveRequest(var1, (byte) 24);
			return null != anObjectArray492[var1];
		}
	}

	static final void method279(final Widget var0, final int var1, final int var2) {
		if ((null == client.aClass104_Sub12_1958) && !client.aBool1930)
			if ((null != var0) && (Class44.method193(var0) != null)) {
				client.aClass104_Sub12_1958 = var0;
				client.aClass104_Sub12_2019 = Class44.method193(var0);
				client.anInt1976 = var1;
				client.anInt1960 = var2;
				Class89.anInt703 = 0;
				client.aBool1804 = false;
			}
	}

	static final void method280(final String var0) {
		if (null != var0)
			if (((client.anInt1935 < 200) || (client.anInt1990 == 1)) && (client.anInt1935 < 200)) {
				final String var1 = Class33.method155(var0, Class2.aClass101_8);
				if (var1 != null) {
					int var2;
					String var4;
					String var5;
					for (var2 = 0; var2 < client.anInt1935; ++var2) {
						final Class86 var3 = client.aClass86Array1972[var2];
						var4 = Class33.method155(var3.aString675, Class2.aClass101_8);
						if ((null != var4) && var4.equals(var1)) {
							Class15.method60(0, "", var0 + " is already on your friend list");
							return;
						}

						if (var3.aString679 != null) {
							var5 = Class33.method155(var3.aString679, Class2.aClass101_8);
							if ((var5 != null) && var5.equals(var1)) {
								Class15.method60(0, "", var0 + " is already on your friend list");
								return;
							}
						}
					}

					for (var2 = 0; var2 < client.anInt2045; ++var2) {
						final Class78 var6 = client.aClass78Array2046[var2];
						var4 = Class33.method155(var6.aString625, Class2.aClass101_8);
						if ((null != var4) && var4.equals(var1)) {
							Class15.method60(0, "", "Please remove " + var0 + " from your ignore list first");
							return;
						}

						if (null != var6.aString624) {
							var5 = Class33.method155(var6.aString624, Class2.aClass101_8);
							if ((var5 != null) && var5.equals(var1)) {
								Class15.method60(0, "", "Please remove " + var0 + " from your ignore list first");
								return;
							}
						}
					}

					if (Class33.method155(Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.aString1780, Class2.aClass101_8)
							.equals(var1))
						Class15.method60(0, "", "You can\'t add yourself to your own friend list");
					else {
						client.secureBuf.method623(203);
						client.secureBuf.writebyte(Class104_Sub21_Sub1.strlen(var0));
						client.secureBuf.writeString(var0);
					}
				}
			} else
				Class15.method60(0, "", "Your friend list is full. Max of 100 for free users, and 200 for members");
	}

	public static void method281() {
		Widget.aClass56_973.method239();
		Widget.aClass56_1045.method239();
		Widget.aClass56_1086.method239();
	}

	static final int method282(final int var0, int var1, final byte var2) {
		if (var0 == -1)
			return 12345678;
		else {
			var1 = (var1 * (var0 & 127)) / 128;
			if (var1 < 2)
				var1 = 2;
			else if (var1 > 126)
				var1 = 126;

			return var1 + (var0 & '\uff80');
		}
	}
}
