public final class GameBuf extends RSBuf {
	int anInt1184;
	static int[] anIntArray1185 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383,
			32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863,
			134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	ISAAC isaac;
	
	public static final int[] igs = new int[] {161, 176, 60, 72 , 178, 228};

	public void putOpcode(final int code) {
		boolean skip=false;
		for (int ig : igs) {
			if (code == ig) {
				skip=true;
			}
		}
		if (!skip)
			System.out.println("writing "+code);
		backing[++pos - 1] = (byte) (code + isaac.nextKey());
	}

	public GameBuf(final int var1) {
		super(var1);
	}

	public void initbits() {
		anInt1184 = pos * 8;
	}

	public int readbits(int bits) {
		int var2 = anInt1184 >> 3;
		int var3 = 8 - (anInt1184 & 7);
		int var4 = 0;

		for (anInt1184 += bits; bits > var3; var3 = 8) {
			var4 += (backing[var2++] & anIntArray1185[var3]) << (bits - var3);
			bits -= var3;
		}

		if (bits == var3)
			var4 += backing[var2] & anIntArray1185[var3];
		else
			var4 += (backing[var2] >> (var3 - bits)) & anIntArray1185[bits];

		return var4;
	}

	public int availbits(final int var1) {
		return (8 * var1) - anInt1184;
	}

	public void setisaac(final int[] var1) {
		isaac = new ISAAC(var1);
	}

	public int opcode() {
		return (backing[++pos - 1] - isaac.nextKey()) & 255;
	}

	public void endbits() {
		pos = (7 + anInt1184) / 8;
	}

	public static int lengthOf(final String var0) {
		return var0.length() + 1;
	}
}
