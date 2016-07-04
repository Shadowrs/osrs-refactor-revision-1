import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class104_Sub16 extends Class104 {
	public Field[] aFieldArray1126;
	public int anInt1127;
	public int anInt1128;
	public int[] anIntArray1129;
	public int[] anIntArray1130;
	public byte[][][] aByteArrayArrayArray1131;
	public int[] anIntArray1132;
	public Method[] aMethodArray1133;

	static final void method551(final int var0, final int var1) {
		if (client.anInt1898 == 1)
			Class104_Sub15.aClass104_Sub18_Sub17_Sub1Array1123[client.anInt1897 / 100].method841(client.anInt1895 - 8,
					client.anInt1896 - 8);

		if (client.anInt1898 == 2)
			Class104_Sub15.aClass104_Sub18_Sub17_Sub1Array1123[(client.anInt1897 / 100) + 4]
					.method841(client.anInt1895 - 8, client.anInt1896 - 8);

		client.anInt1906 = 0;
		int var2 = Class53.anInt436 + (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695 >> 7);
		int var3 = Class20.anInt206 + (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694 >> 7);
		if ((var2 >= 3053) && (var2 <= 3156) && (var3 >= 3056) && (var3 <= 3136))
			client.anInt1906 = 1;

		if ((var2 >= 3072) && (var2 <= 3118) && (var3 >= 9492) && (var3 <= 9535))
			client.anInt1906 = 1;

		if ((client.anInt1906 == 1) && (var2 >= 3139) && (var2 <= 3199) && (var3 >= 3008) && (var3 <= 3062))
			client.anInt1906 = 0;

		if (client.aBool1860) {
			var2 = (512 + var0) - 5;
			var3 = var1 + 20;
			Class29.aClass104_Sub18_Sub17_Sub2_Sub1_277.method881("Fps:" + Applet_Sub1.anInt1759, var2, var3, 16776960,
					-1);
			var3 += 15;
			final Runtime var4 = Runtime.getRuntime();
			final int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 16776960;
			if ((var5 > '\u8000') && client.lowmvm)
				var6 = 16711680;

			if ((var5 > 65536) && !client.lowmvm)
				var6 = 16711680;

			Class29.aClass104_Sub18_Sub17_Sub2_Sub1_277.method881("Mem:" + var5 + "k", var2, var3, var6, -1);
			var3 += 15;
		}

	}

	public static Class104_Sub18_Sub10 method552(final int var0) {
		Class104_Sub18_Sub10 var1 = (Class104_Sub18_Sub10) Class104_Sub18_Sub10.aClass56_1406.method236(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class104_Sub18_Sub10.aClass61_1403.decompress(8, var0);
			var1 = new Class104_Sub18_Sub10();
			if (var2 != null)
				var1.method765(new RSBuf(var2));

			Class104_Sub18_Sub10.aClass56_1406.method238(var1, var0);
			return var1;
		}
	}

	public static void method553(final int var0) {
		Class14.anInt89 = var0;
	}

	public static String method554(final int var0) {
		return ((var0 >> 24) & 255) + "." + ((var0 >> 16) & 255) + "." + ((var0 >> 8) & 255) + "." + (var0 & 255);
	}
}
