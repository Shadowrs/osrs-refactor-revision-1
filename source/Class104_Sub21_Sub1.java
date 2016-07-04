public final class Class104_Sub21_Sub1 extends RSBuf {
	int anInt1184;
	static int[] anIntArray1185 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383,
			32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863,
			134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	ISAAC isaac;

	public void method623(final int var1) {
		aByteArray1174[++anInt1172 - 1] = (byte) (var1 + isaac.nextKey());
	}

	public Class104_Sub21_Sub1(final int var1) {
		super(var1);
	}

	public void method624() {
		anInt1184 = anInt1172 * 8;
	}

	public int method625(int var1) {
		int var2 = anInt1184 >> 3;
		int var3 = 8 - (anInt1184 & 7);
		int var4 = 0;

		for (anInt1184 += var1; var1 > var3; var3 = 8) {
			var4 += (aByteArray1174[var2++] & anIntArray1185[var3]) << (var1 - var3);
			var1 -= var3;
		}

		if (var1 == var3)
			var4 += aByteArray1174[var2] & anIntArray1185[var3];
		else
			var4 += (aByteArray1174[var2] >> (var3 - var1)) & anIntArray1185[var1];

		return var4;
	}

	public int method626(final int var1) {
		return (8 * var1) - anInt1184;
	}

	public void setisaac(final int[] var1) {
		isaac = new ISAAC(var1);
	}

	public int opcode() {
		return (aByteArray1174[++anInt1172 - 1] - isaac.nextKey()) & 255;
	}

	public void endbits() {
		anInt1172 = (7 + anInt1184) / 8;
	}

	public static int strlen(final String var0) {
		return var0.length() + 1;
	}
}
