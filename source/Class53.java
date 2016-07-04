import java.awt.Frame;

public class Class53 {
	protected static Frame aFrame435;
	static int anInt436;
	Class58 aClass58_431 = new Class58(256);
	Class58 aClass58_433 = new Class58(256);
	Class61 aClass61_434;
	Class61 aClass61_432;

	Class104_Sub4_Sub1 method230(final int var1, final int var2, final int[] var3) {
		int var4 = var2 ^ (((var1 << 4) & '\uffff') | (var1 >>> 12));
		var4 |= var1 << 16;
		final long var5 = var4;
		Class104_Sub4_Sub1 var7 = (Class104_Sub4_Sub1) aClass58_433.method241(var5);
		if (null != var7)
			return var7;
		else if ((null != var3) && (var3[0] <= 0))
			return null;
		else {
			final Class82 var8 = Class82.method359(aClass61_434, var1, var2);
			if (null == var8)
				return null;
			else {
				var7 = var8.method356();
				aClass58_433.method242(var7, var5);
				if (null != var3)
					var3[0] -= var7.aByteArray1288.length;

				return var7;
			}
		}
	}

	Class104_Sub4_Sub1 method231(final int var1, final int var2, final int[] var3) {
		int var4 = var2 ^ (((var1 << 4) & '\uffff') | (var1 >>> 12));
		var4 |= var1 << 16;
		final long var5 = var4 ^ 4294967296L;
		Class104_Sub4_Sub1 var7 = (Class104_Sub4_Sub1) aClass58_433.method241(var5);
		if (null != var7)
			return var7;
		else if ((null != var3) && (var3[0] <= 0))
			return null;
		else {
			Class104_Sub5 var8 = (Class104_Sub5) aClass58_431.method241(var5);
			if (null == var8) {
				var8 = Class104_Sub5.method504(aClass61_432, var1, var2);
				if (null == var8)
					return null;

				aClass58_431.method242(var8, var5);
			}

			var7 = var8.method500(var3);
			if (null == var7)
				return null;
			else {
				var8.method470();
				aClass58_433.method242(var7, var5);
				return var7;
			}
		}
	}

	public Class104_Sub4_Sub1 method232(final int var1, final int[] var2) {
		if (aClass61_434.method267() == 1)
			return method230(0, var1, var2);
		else if (aClass61_434.leng(var1) == 1)
			return method230(var1, 0, var2);
		else
			throw new RuntimeException();
	}

	public Class104_Sub4_Sub1 method233(final int var1, final int[] var2) {
		if (aClass61_432.method267() == 1)
			return method231(0, var1, var2);
		else if (aClass61_432.leng(var1) == 1)
			return method231(var1, 0, var2);
		else
			throw new RuntimeException();
	}

	public Class53(final Class61 var1, final Class61 var2) {
		aClass61_434 = var1;
		aClass61_432 = var2;
	}

	static void method234(final byte[] var0) {
		final RSBuf var1 = new RSBuf(var0);
		var1.pos = var0.length - 2;
		Class12.anInt67 = var1.readLEShort();
		Class12.anIntArray70 = new int[Class12.anInt67];
		Class12.anIntArray71 = new int[Class12.anInt67];
		Class78.anIntArray626 = new int[Class12.anInt67];
		Class69.anIntArray564 = new int[Class12.anInt67];
		Class41.aByteArrayArray368 = new byte[Class12.anInt67][];
		var1.pos = var0.length - 7 - (Class12.anInt67 * 8);
		Class12.anInt72 = var1.readLEShort();
		Class12.anInt69 = var1.readLEShort();
		final int var2 = (var1.readUByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < Class12.anInt67; ++var3)
			Class12.anIntArray70[var3] = var1.readLEShort();

		for (var3 = 0; var3 < Class12.anInt67; ++var3)
			Class12.anIntArray71[var3] = var1.readLEShort();

		for (var3 = 0; var3 < Class12.anInt67; ++var3)
			Class78.anIntArray626[var3] = var1.readLEShort();

		for (var3 = 0; var3 < Class12.anInt67; ++var3)
			Class69.anIntArray564[var3] = var1.readLEShort();

		var1.pos = var0.length - 7 - (Class12.anInt67 * 8) - ((var2 - 1) * 3);
		Class12.anIntArray68 = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			Class12.anIntArray68[var3] = var1.method614();
			if (Class12.anIntArray68[var3] == 0)
				Class12.anIntArray68[var3] = 1;
		}

		var1.pos = 0;

		for (var3 = 0; var3 < Class12.anInt67; ++var3) {
			final int var4 = Class78.anIntArray626[var3];
			final int var5 = Class69.anIntArray564[var3];
			final int var6 = var5 * var4;
			final byte[] var7 = new byte[var6];
			Class41.aByteArrayArray368[var3] = var7;
			final int var8 = var1.readUByte();
			int var9;
			if (var8 == 0)
				for (var9 = 0; var9 < var6; ++var9)
					var7[var9] = var1.method565();
			else if (var8 == 1)
				for (var9 = 0; var9 < var4; ++var9)
					for (int var10 = 0; var10 < var5; ++var10)
						var7[(var10 * var4) + var9] = var1.method565();
		}

	}

	static final void method235(final String var0, final boolean var1) {
		if (var0 != null)
			if (client.anInt2045 >= 100)
				Class15.method60(0, "", "Your ignore list is full. Max of 100 users.");
			else {
				final String var2 = Class33.method155(var0, Class2.aClass101_8);
				if (var2 != null) {
					int var3;
					String var5;
					String var6;
					for (var3 = 0; var3 < client.anInt2045; ++var3) {
						final Class78 var4 = client.aClass78Array2046[var3];
						var5 = Class33.method155(var4.aString625, Class2.aClass101_8);
						if ((null != var5) && var5.equals(var2)) {
							Class15.method60(0, "", var0 + " is already on your ignore list");
							return;
						}

						if (null != var4.aString624) {
							var6 = Class33.method155(var4.aString624, Class2.aClass101_8);
							if ((null != var6) && var6.equals(var2)) {
								Class15.method60(0, "", var0 + " is already on your ignore list");
								return;
							}
						}
					}

					for (var3 = 0; var3 < client.anInt1935; ++var3) {
						final Class86 var7 = client.aClass86Array1972[var3];
						var5 = Class33.method155(var7.aString675, Class2.aClass101_8);
						if ((null != var5) && var5.equals(var2)) {
							Class15.method60(0, "", "Please remove " + var0 + " from your friend list first");
							return;
						}

						if (null != var7.aString679) {
							var6 = Class33.method155(var7.aString679, Class2.aClass101_8);
							if ((null != var6) && var6.equals(var2)) {
								Class15.method60(0, "", "Please remove " + var0 + " from your friend list first");
								return;
							}
						}
					}

					if (Class33.method155(Class81.pf.aString1780, Class2.aClass101_8)
							.equals(var2))
						Class15.method60(0, "", "You can\'t add yourself to your own ignore list");
					else {
						client.secureBuf.putOpcode(231); // add ignore packet
						client.secureBuf.writebyte(GameBuf.lengthOf(var0));
						client.secureBuf.writeString(var0);
					}
				}
			}
	}
}
