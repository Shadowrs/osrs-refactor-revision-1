public class Def extends Class104_Sub18 {
	static Class61 aClass61_1259;
	public int[] anIntArray1264;
	public int anInt1266 = -1;
	int[] anIntArray1267;
	public int[] anIntArray1262;
	public boolean aBool1272 = false;
	public int anInt1269 = 5;
	public int anInt1270 = -1;
	public int anInt1271 = -1;
	public int anInt1261 = 99;
	public int anInt1273 = -1;
	public int anInt1274 = -1;
	public int anInt1275 = 2;
	int[] anIntArray1263;
	public int[] anIntArray1265;
	static Class56 aClass56_1260 = new Class56(64);
	static Class56 aClass56_1268 = new Class56(100);

	void method681(final RSBuf var1) {
		while (true) {
			final int var2 = var1.readUByte();
			if (var2 == 0)
				return;

			method682(var1, var2);
		}
	}

	void method682(final RSBuf var1, final int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readShort();
			anIntArray1264 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1264[var4] = var1.readShort();

			anIntArray1262 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1262[var4] = var1.readShort();

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1262[var4] += var1.readShort() << 16;
		} else if (var2 == 2)
			anInt1266 = var1.readShort();
		else if (var2 == 3) {
			var3 = var1.readUByte();
			anIntArray1267 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1267[var4] = var1.readUByte();

			anIntArray1267[var3] = 9999999;
		} else if (var2 == 4)
			aBool1272 = true;
		else if (var2 == 5)
			anInt1269 = var1.readUByte();
		else if (var2 == 6)
			anInt1270 = var1.readShort();
		else if (var2 == 7)
			anInt1271 = var1.readShort();
		else if (var2 == 8)
			anInt1261 = var1.readUByte();
		else if (var2 == 9)
			anInt1273 = var1.readUByte();
		else if (var2 == 10)
			anInt1274 = var1.readUByte();
		else if (var2 == 11)
			anInt1275 = var1.readUByte();
		else if (var2 == 12) {
			var3 = var1.readUByte();
			anIntArray1263 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1263[var4] = var1.readShort();

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1263[var4] += var1.readShort() << 16;
		} else if (var2 == 13) {
			var3 = var1.readUByte();
			anIntArray1265 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1265[var4] = var1.method614();
		}

	}

	void method683() {
		if (anInt1273 == -1)
			if (null != anIntArray1267)
				anInt1273 = 2;
			else
				anInt1273 = 0;

		if (anInt1274 == -1)
			if (null != anIntArray1267)
				anInt1274 = 2;
			else
				anInt1274 = 0;

	}

	Class104_Sub18_Sub16_Sub4 method684(final Class104_Sub18_Sub16_Sub4 var1, int var2, int var3) {
		var2 = anIntArray1262[var2];
		final Class104_Sub18_Sub15 var4 = Class34.method165(var2 >> 16);
		var2 &= '\uffff';
		if (null == var4)
			return var1.method811(true);
		else {
			final Class104_Sub18_Sub16_Sub4 var5 = var1.method811(!var4.method786(var2));
			var3 &= 3;
			if (var3 == 1)
				var5.method820();
			else if (var3 == 2)
				var5.method819();
			else if (var3 == 3)
				var5.method818();

			var5.method815(var4, var2);
			if (var3 == 1)
				var5.method818();
			else if (var3 == 2)
				var5.method819();
			else if (var3 == 3)
				var5.method820();

			return var5;
		}
	}

	public Class104_Sub18_Sub16_Sub4 method685(final Class104_Sub18_Sub16_Sub4 var1, int var2,
			final Def var3, int var4) {
		var2 = anIntArray1262[var2];
		final Class104_Sub18_Sub15 var5 = Class34.method165(var2 >> 16);
		var2 &= '\uffff';
		if (var5 == null)
			return var3.method687(var1, var4);
		else {
			var4 = var3.anIntArray1262[var4];
			final Class104_Sub18_Sub15 var6 = Class34.method165(var4 >> 16);
			var4 &= '\uffff';
			Class104_Sub18_Sub16_Sub4 var7;
			if (var6 == null) {
				var7 = var1.method811(!var5.method786(var2));
				var7.method815(var5, var2);
				return var7;
			} else {
				var7 = var1.method811(!var5.method786(var2) & !var6.method786(var4));
				var7.method816(var5, var2, var6, var4, anIntArray1267);
				return var7;
			}
		}
	}

	public Class104_Sub18_Sub16_Sub4 method686(final Class104_Sub18_Sub16_Sub4 var1, final int var2) {
		int var3 = anIntArray1262[var2];
		final Class104_Sub18_Sub15 var4 = Class34.method165(var3 >> 16);
		var3 &= '\uffff';
		if (null == var4)
			return var1.method811(true);
		else {
			Class104_Sub18_Sub15 var5 = null;
			int var6 = 0;
			if ((anIntArray1263 != null) && (var2 < anIntArray1263.length)) {
				var6 = anIntArray1263[var2];
				var5 = Class34.method165(var6 >> 16);
				var6 &= '\uffff';
			}

			Class104_Sub18_Sub16_Sub4 var7;
			if ((var5 != null) && (var6 != '\uffff')) {
				var7 = var1.method811(!var4.method786(var3) & !var5.method786(var6));
				var7.method815(var4, var3);
				var7.method815(var5, var6);
				return var7;
			} else {
				var7 = var1.method811(!var4.method786(var3));
				var7.method815(var4, var3);
				return var7;
			}
		}
	}

	public Class104_Sub18_Sub16_Sub4 method687(final Class104_Sub18_Sub16_Sub4 var1, int var2) {
		var2 = anIntArray1262[var2];
		final Class104_Sub18_Sub15 var3 = Class34.method165(var2 >> 16);
		var2 &= '\uffff';
		if (var3 == null)
			return var1.method811(true);
		else {
			final Class104_Sub18_Sub16_Sub4 var4 = var1.method811(!var3.method786(var2));
			var4.method815(var3, var2);
			return var4;
		}
	}

	Class104_Sub18_Sub16_Sub4 method688(final Class104_Sub18_Sub16_Sub4 var1, int var2) {
		var2 = anIntArray1262[var2];
		final Class104_Sub18_Sub15 var3 = Class34.method165(var2 >> 16);
		var2 &= '\uffff';
		if (null == var3)
			return var1.method829(true);
		else {
			final Class104_Sub18_Sub16_Sub4 var4 = var1.method829(!var3.method786(var2));
			var4.method815(var3, var2);
			return var4;
		}
	}
}
