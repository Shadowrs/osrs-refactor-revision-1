public class Class104_Sub4_Sub1 extends Class104_Sub4 {
	public byte[] aByteArray1288;
	public int anInt1284;
	public int anInt1286;
	int anInt1287;
	public boolean aBool1285;

	public Class104_Sub4_Sub1 method689(final Class84 var1) {
		aByteArray1288 = var1.method377(aByteArray1288);
		anInt1284 = var1.method375(anInt1284);
		if (anInt1286 == anInt1287)
			anInt1286 = anInt1287 = var1.method376(anInt1286);
		else {
			anInt1286 = var1.method376(anInt1286);
			anInt1287 = var1.method376(anInt1287);
			if (anInt1286 == anInt1287)
				--anInt1286;
		}

		return this;
	}

	Class104_Sub4_Sub1(final int var1, final byte[] var2, final int var3, final int var4, final boolean var5) {
		anInt1284 = var1;
		aByteArray1288 = var2;
		anInt1286 = var3;
		anInt1287 = var4;
		aBool1285 = var5;
	}

	Class104_Sub4_Sub1(final int var1, final byte[] var2, final int var3, final int var4) {
		anInt1284 = var1;
		aByteArray1288 = var2;
		anInt1286 = var3;
		anInt1287 = var4;
	}
}
