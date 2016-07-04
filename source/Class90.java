import java.util.Calendar;

public class Class90 {
	static int[] anIntArray707;
	static String[] aStringArray709;
	public static String aString716;
	static int[] anIntArray711 = new int[5];
	static int[][] anIntArrayArray710 = new int[5][5000];
	static int[] anIntArray706 = new int[1000];
	static String[] aStringArray712 = new String[1000];
	static int anInt713 = 0;
	static Class100[] aClass100Array714 = new Class100[50];
	static Calendar aCalendar715 = Calendar.getInstance();
	static String[] aStringArray708 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
			"Oct", "Nov", "Dec" };

	public static byte[] fileToByteArray(final Object var0, final boolean var1) {
		if (var0 == null)
			return null;
		else if (var0 instanceof byte[]) {
			final byte[] var6 = ((byte[]) var0);
			if (var1) {
				final int var3 = var6.length;
				final byte[] var4 = new byte[var3];
				System.arraycopy(var6, 0, var4, 0, var3);
				return var4;
			} else
				return var6;
		} else if (var0 instanceof Class47) {
			final Class47 var2 = (Class47) var0;
			return var2.method208(-215688623);
		} else
			throw new IllegalArgumentException();
	}

	static void method408(final int var0) {
		for (Class104_Sub17 var1 = (Class104_Sub17) client.aClass58_1926
				.method245(); null != var1; var1 = (Class104_Sub17) client.aClass58_1926.method243())
			if (var0 == ((var1.aLong824 >> 48) & 65535L))
				var1.method470();

	}
}
