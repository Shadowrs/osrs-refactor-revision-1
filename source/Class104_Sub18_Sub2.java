public class Class104_Sub18_Sub2 extends Class104_Sub18 {
	public int anInt1228;
	static Class61 aClass61_1238;
	int[] anIntArray1249;
	public String aString1229 = "null";
	public int anInt1240 = 1;
	public int anInt1233 = -1;
	public int anInt1236 = -1;
	public int anInt1244 = -1;
	public int anInt1235 = -1;
	public int anInt1237 = -1;
	public int anInt1251 = -1;
	public int anInt1239 = -1;
	short[] aShortArray1234;
	short[] aShortArray1241;
	short[] aShortArray1242;
	short[] aShortArray1243;
	int[] anIntArray1232;
	public boolean aBool1255 = true;
	public int anInt1246 = -1;
	int anInt1227 = 128;
	int anInt1248 = 128;
	public boolean aBool1247 = false;
	int anInt1250 = 0;
	int anInt1226 = 0;
	public int anInt1252 = -1;
	public int anInt1253 = 32;
	int anInt1254 = -1;
	public boolean aBool1257 = true;
	int anInt1256 = -1;
	public boolean aBool1258 = true;
	public int[] anIntArray1230;
	public String[] aStringArray1225 = new String[5];
	static Class56 aClass56_1231 = new Class56(64);
	static Class56 aClass56_1245 = new Class56(50);

	void method673() {
	}

	void method674(final RSBuf var1) {
		while (true) {
			final int var2 = var1.readUByte();
			if (var2 == 0)
				return;

			method678(var1, var2);
		}
	}

	public final Class104_Sub18_Sub16_Sub4 method675(final Def var1, final int var2,
			final Def var3, final int var4) {
		if (null != anIntArray1230) {
			final Class104_Sub18_Sub2 var12 = method677();
			return var12 == null ? null : var12.method675(var1, var2, var3, var4);
		} else {
			Class104_Sub18_Sub16_Sub4 var5 = (Class104_Sub18_Sub16_Sub4) aClass56_1245.method236(anInt1228);
			if (var5 == null) {
				boolean var6 = false;

				for (int var7 = 0; var7 < anIntArray1249.length; ++var7)
					if (!Nodee.aClass61_959.exists(anIntArray1249[var7], 0))
						var6 = true;

				if (var6)
					return null;

				final Class104_Sub18_Sub16_Sub5[] var8 = new Class104_Sub18_Sub16_Sub5[anIntArray1249.length];

				int var9;
				for (var9 = 0; var9 < anIntArray1249.length; ++var9)
					var8[var9] = Class104_Sub18_Sub16_Sub5.method913(Nodee.aClass61_959, anIntArray1249[var9],
							0);

				Class104_Sub18_Sub16_Sub5 var10;
				if (var8.length == 1)
					var10 = var8[0];
				else
					var10 = new Class104_Sub18_Sub16_Sub5(var8, var8.length);

				if (null != aShortArray1234)
					for (var9 = 0; var9 < aShortArray1234.length; ++var9)
						var10.method899(aShortArray1234[var9], aShortArray1241[var9]);

				if (null != aShortArray1242)
					for (var9 = 0; var9 < aShortArray1242.length; ++var9)
						var10.method909(aShortArray1242[var9], aShortArray1243[var9]);

				var5 = var10.method904(64 + anInt1250, 850 + anInt1226, -30, -50, -30);
				aClass56_1245.method238(var5, anInt1228);
			}

			Class104_Sub18_Sub16_Sub4 var11;
			if ((var1 != null) && (null != var3))
				var11 = var1.method685(var5, var2, var3, var4);
			else if (null != var1)
				var11 = var1.method687(var5, var2);
			else if (null != var3)
				var11 = var3.method687(var5, var4);
			else
				var11 = var5.method811(true);

			if ((anInt1227 != 128) || (anInt1248 != 128))
				var11.method823(anInt1227, anInt1248, anInt1227);

			return var11;
		}
	}

	public final Class104_Sub18_Sub16_Sub5 method676() {
		if (anIntArray1230 != null) {
			final Class104_Sub18_Sub2 var1 = method677();
			return var1 == null ? null : var1.method676();
		} else if (null == anIntArray1232)
			return null;
		else {
			boolean var2 = false;

			for (int var3 = 0; var3 < anIntArray1232.length; ++var3)
				if (!Nodee.aClass61_959.exists(anIntArray1232[var3], 0))
					var2 = true;

			if (var2)
				return null;
			else {
				final Class104_Sub18_Sub16_Sub5[] var4 = new Class104_Sub18_Sub16_Sub5[anIntArray1232.length];

				for (int var5 = 0; var5 < anIntArray1232.length; ++var5)
					var4[var5] = Class104_Sub18_Sub16_Sub5.method913(Nodee.aClass61_959, anIntArray1232[var5],
							0);

				Class104_Sub18_Sub16_Sub5 var6;
				if (var4.length == 1)
					var6 = var4[0];
				else
					var6 = new Class104_Sub18_Sub16_Sub5(var4, var4.length);

				int var7;
				if (aShortArray1234 != null)
					for (var7 = 0; var7 < aShortArray1234.length; ++var7)
						var6.method899(aShortArray1234[var7], aShortArray1241[var7]);

				if (null != aShortArray1242)
					for (var7 = 0; var7 < aShortArray1242.length; ++var7)
						var6.method909(aShortArray1242[var7], aShortArray1243[var7]);

				return var6;
			}
		}
	}

	public final Class104_Sub18_Sub2 method677() {
		int var1 = -1;
		if (anInt1254 != -1)
			var1 = Class52.method228(anInt1254);
		else if (anInt1256 != -1)
			var1 = Class71.anIntArray576[anInt1256];

		return (var1 >= 0) && (var1 < anIntArray1230.length) && (anIntArray1230[var1] != -1)
				? Class64.method296(anIntArray1230[var1]) : null;
	}

	void method678(final RSBuf var1, final int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUByte();
			anIntArray1249 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1249[var4] = var1.readLEShort();
		} else if (var2 == 2)
			aString1229 = var1.readString();
		else if (var2 == 12)
			anInt1240 = var1.readUByte();
		else if (var2 == 13)
			anInt1233 = var1.readLEShort();
		else if (var2 == 14)
			anInt1236 = var1.readLEShort();
		else if (var2 == 15)
			anInt1244 = var1.readLEShort();
		else if (var2 == 16)
			anInt1235 = var1.readLEShort();
		else if (var2 == 17) {
			anInt1236 = var1.readLEShort();
			anInt1237 = var1.readLEShort();
			anInt1251 = var1.readLEShort();
			anInt1239 = var1.readLEShort();
		} else if ((var2 >= 30) && (var2 < 35)) {
			aStringArray1225[var2 - 30] = var1.readString();
			if (aStringArray1225[var2 - 30].equalsIgnoreCase("Hidden"))
				aStringArray1225[var2 - 30] = null;
		} else if (var2 == 40) {
			var3 = var1.readUByte();
			aShortArray1234 = new short[var3];
			aShortArray1241 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				aShortArray1234[var4] = (short) var1.readLEShort();
				aShortArray1241[var4] = (short) var1.readLEShort();
			}
		} else if (var2 == 41) {
			var3 = var1.readUByte();
			aShortArray1242 = new short[var3];
			aShortArray1243 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				aShortArray1242[var4] = (short) var1.readLEShort();
				aShortArray1243[var4] = (short) var1.readLEShort();
			}
		} else if (var2 == 60) {
			var3 = var1.readUByte();
			anIntArray1232 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1232[var4] = var1.readLEShort();
		} else if (var2 == 93)
			aBool1255 = false;
		else if (var2 == 95)
			anInt1246 = var1.readLEShort();
		else if (var2 == 97)
			anInt1227 = var1.readLEShort();
		else if (var2 == 98)
			anInt1248 = var1.readLEShort();
		else if (var2 == 99)
			aBool1247 = true;
		else if (var2 == 100)
			anInt1250 = var1.readByte();
		else if (var2 == 101)
			anInt1226 = var1.readByte() * 5;
		else if (var2 == 102)
			anInt1252 = var1.readLEShort();
		else if (var2 == 103)
			anInt1253 = var1.readLEShort();
		else if (var2 == 106) {
			anInt1254 = var1.readLEShort();
			if (anInt1254 == '\uffff')
				anInt1254 = -1;

			anInt1256 = var1.readLEShort();
			if (anInt1256 == '\uffff')
				anInt1256 = -1;

			var3 = var1.readUByte();
			anIntArray1230 = new int[1 + var3];

			for (var4 = 0; var4 <= var3; ++var4) {
				anIntArray1230[var4] = var1.readLEShort();
				if (anIntArray1230[var4] == '\uffff')
					anIntArray1230[var4] = -1;
			}
		} else if (var2 == 107)
			aBool1257 = false;
		else if (var2 == 109)
			aBool1258 = false;

	}

	public boolean method679() {
		if (anIntArray1230 == null)
			return true;
		else {
			int var1 = -1;
			if (anInt1254 != -1)
				var1 = Class52.method228(anInt1254);
			else if (anInt1256 != -1)
				var1 = Class71.anIntArray576[anInt1256];

			return (var1 >= 0) && (var1 < anIntArray1230.length) && (anIntArray1230[var1] != -1);
		}
	}

	static void drawlogin(final String var0, final String var1, final String var2) {
		Class66.aString537 = var0;
		Class66.aString516 = var1;
		Class66.aString539 = var2;
	}
}
