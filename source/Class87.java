import java.util.zip.CRC32;

public class Class87 {
	static boolean aBool689;
	static RSBuf aClass104_Sub21_691;
	static int anInt699;
	static int anInt686 = 0;
	static Class58 aClass58_681 = new Class58(4096);
	public static int anInt682 = 0;
	static Class58 aClass58_683 = new Class58(32);
	public static int anInt684 = 0;
	static Class63 aClass63_685 = new Class63();
	static Class58 aClass58_688 = new Class58(4096);
	public static int anInt687 = 0;
	static Class58 aClass58_694 = new Class58(4096);
	public static int anInt692 = 0;
	static RSBuf aClass104_Sub21_690 = new RSBuf(8);
	static int anInt696 = 0;
	static CRC32 aCRC32_680 = new CRC32();
	static Class61_Sub1[] aClass61_Sub1Array695 = new Class61_Sub1[256];
	static byte aByte697 = 0;
	public static int anInt693 = 0;
	public static int anInt698 = 0;

	static void method397(final int var0, final Class16 var1, final Class61_Sub1 var2) {
		byte[] var3 = null;
		final Class59 var4 = Class52.aClass59_429;
		synchronized (var4) {
			for (Class104_Sub13 var5 = (Class104_Sub13) Class52.aClass59_429
					.method251(); null != var5; var5 = (Class104_Sub13) Class52.aClass59_429.method252())
				if ((var5.nodeId == var0) && (var1 == var5.aClass16_1095) && (var5.anInt1097 == 0)) {
					var3 = var5.aByteArray1096;
					break;
				}
		}

		if (null != var3)
			var2.method488(var1, var0, var3, true);
		else {
			final byte[] var8 = var1.method65(var0);
			var2.method488(var1, var0, var8, true);
		}
	}

	public static void method398() {
		Class104_Sub18_Sub3.aClass56_1260.method239();
		Class104_Sub18_Sub3.aClass56_1268.method239();
	}

	public static boolean method399(final char var0) {
		return ((var0 >= 65) && (var0 <= 90)) || ((var0 >= 97) && (var0 <= 122));
	}

	public static void method400(final Class61 var0, final int var1, final int var2, final int var3,
			final boolean var4) {
		Class29.anInt272 = 1;
		Class29.aClass61_273 = var0;
		Class1.anInt1 = var1;
		Class29.anInt276 = var2;
		Class29.anInt275 = var3;
		Class104_Sub2.aBool859 = var4;
		Class69.anInt565 = 10000;
	}
}
