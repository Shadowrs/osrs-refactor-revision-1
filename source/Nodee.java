import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class Nodee extends Class104 {
	int anInt956;
	int rsfaceID;
	static Class61 aClass61_959;
	boolean aBool958 = false;

	static final String method518(final int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3)
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);

		return var1.length() > 9
				? " " + Class70.method326('\uff80') + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1
						+ ")" + "</col>"
				: (var1.length() > 6 ? " " + Class70.method326(16777215) + var1.substring(0, var1.length() - 4) + "K"
						+ " " + " (" + var1 + ")" + "</col>" : " " + Class70.method326(16776960) + var1 + "</col>");
	}

	static final void method519(final int var0, final int var1, final int var2, final int var3) {
		for (int var4 = var1; var4 <= (var3 + var1); ++var4)
			for (int var5 = var0; var5 <= (var2 + var0); ++var5)
				if ((var5 >= 0) && (var5 < 104) && (var4 >= 0) && (var4 < 104)) {
					Class76.aByteArrayArrayArray605[0][var5][var4] = 127;
					if ((var0 == var5) && (var5 > 0))
						Class76.anIntArrayArrayArray611[0][var5][var4] = Class76.anIntArrayArrayArray611[0][var5
								- 1][var4];

					if ((var5 == (var2 + var0)) && (var5 < 103))
						Class76.anIntArrayArrayArray611[0][var5][var4] = Class76.anIntArrayArrayArray611[0][var5
								+ 1][var4];

					if ((var4 == var1) && (var4 > 0))
						Class76.anIntArrayArrayArray611[0][var5][var4] = Class76.anIntArrayArrayArray611[0][var5][var4
								- 1];

					if (((var1 + var3) == var4) && (var4 < 103))
						Class76.anIntArrayArrayArray611[0][var5][var4] = Class76.anIntArrayArrayArray611[0][var5][1
								+ var4];
				}

	}

	public static void method520(final String var0, final Throwable var1) {
		try {
			String var2 = "";
			if (null != var1) {
				Throwable var3 = var1;
				String var5;
				if (var1 instanceof RuntimeException_Sub1) {
					final RuntimeException_Sub1 var4 = (RuntimeException_Sub1) var1;
					var5 = var4.aString1475 + " | ";
					var3 = var4.aThrowable1479;
				} else
					var5 = "";

				final StringWriter var18 = new StringWriter();
				final PrintWriter var6 = new PrintWriter(var18);
				var3.printStackTrace(var6);
				var6.close();
				final String var7 = var18.toString();
				final BufferedReader var8 = new BufferedReader(new StringReader(var7));
				final String var9 = var8.readLine();

				while (true) {
					String var10 = var8.readLine();
					if (var10 == null) {
						var5 = var5 + "| " + var9;
						var2 = var5;
						break;
					}

					final int var11 = var10.indexOf(40);
					final int var12 = var10.indexOf(41, var11 + 1);
					if ((var11 >= 0) && (var12 >= 0)) {
						String var13 = var10.substring(var11 + 1, var12);
						final int var14 = var13.indexOf(".java:");
						if (var14 >= 0) {
							var13 = var13.substring(0, var14) + var13.substring(5 + var14);
							var5 = var5 + var13 + '\u0020';
							continue;
						}

						var10 = var10.substring(0, var11);
					}

					var10 = var10.trim();
					var10 = var10.substring(var10.lastIndexOf(32) + 1);
					var10 = var10.substring(var10.lastIndexOf(9) + 1);
					var5 = var5 + var10 + '\u0020';
				}
			}

			if (var0 != null) {
				if (null != var1)
					var2 = var2 + " | ";

				var2 = var2 + var0;
			}

			System.out.println("Error: " + var2);
			var2 = var2.replace('\u003a', '\u002e');
			var2 = var2.replace('\u0040', '\u005f');
			var2 = var2.replace('\u0026', '\u005f');
			var2 = var2.replace('\u0023', '\u005f');
			if (RuntimeException_Sub1.anApplet1476 == null)
				return;

			final URL var15 = new URL(RuntimeException_Sub1.anApplet1476.getCodeBase(),
					"clienterror.ws?c=" + RuntimeException_Sub1.anInt1477 + "&u=" + RuntimeException_Sub1.aString1478
							+ "&v1=" + Class11.aString64 + "&v2=" + Class11.aString59 + "&e=" + var2);
			final DataInputStream var17 = new DataInputStream(var15.openStream());
			var17.read();
			var17.close();
		} catch (final Exception var16) {
			;
		}

	}
}
