import java.io.File;
import java.util.Hashtable;

public class Class22 {
	static File aFile224;
	public static Class96[] aClass96Array227;
	public static Widget[][] widgets;
	static boolean aBool225 = false;
	static Hashtable aHashtable226 = new Hashtable(16);

	public static int method123(int var0, int var1) {
		int var2;
		if (var1 > var0) {
			var2 = var0;
			var0 = var1;
			var1 = var2;
		}

		while (var1 != 0) {
			var2 = var0 % var1;
			var0 = var1;
			var1 = var2;
		}

		return var0;
	}

	public static void method124(final Class61 var0, final Class61 var1, final boolean var2) {
		Class72.aClass61_584 = var0;
		ObjectDefinition.aClass61_1324 = var1;
		ObjectDefinition.aBool1361 = var2;
	}
}
