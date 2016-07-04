import java.awt.Component;

public class Class80 {
	public static int anInt633;

	public static void method350(final Component var0) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(Class25.aClass25_248);
		var0.addFocusListener(Class25.aClass25_248);
	}

	public static String method351(final String var0) {
		final int var1 = var0.length();
		final char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0)
				var5 = Character.toLowerCase(var5);
			else if ((var3 == 2) || Character.isUpperCase(var5))
				var5 = Class99.method462(var5);

			if (Character.isLetter(var5))
				var3 = 0;
			else if ((var5 != 46) && (var5 != 63) && (var5 != 33)) {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2)
						var3 = 1;
				} else
					var3 = 1;
			} else
				var3 = 2;

			var2[var4] = var5;
		}

		return new String(var2);
	}

	static void method352(final int var0) {
		final Class104_Sub2 var1 = (Class104_Sub2) Class104_Sub2.aClass58_857.method241(var0);
		if (var1 != null)
			var1.method470();
	}

	static final boolean method353(final Widget var0) {
		if (var0.anIntArray984 == null)
			return false;
		else {
			for (int var1 = 0; var1 < var0.anIntArray984.length; ++var1) {
				final int var2 = Class26.method133(var0, var1);
				final int var3 = var0.anIntArray1076[var1];
				if (var0.anIntArray984[var1] == 2) {
					if (var2 >= var3)
						return false;
				} else if (var0.anIntArray984[var1] == 3) {
					if (var2 <= var3)
						return false;
				} else if (var0.anIntArray984[var1] == 4) {
					if (var2 == var3)
						return false;
				} else if (var2 != var3)
					return false;
			}

			return true;
		}
	}

	static final void empty(final int var0) {
		if (Class104_Sub7.laoded(var0)) {
			final Widget[] var1 = Class22.widgets[var0];

			for (final Widget element : var1) {
				final Widget var3 = element;
				if (var3 != null) {
					var3.anInt974 = 0;
					var3.anInt1085 = 0;
				}
			}

		}
	}
}
