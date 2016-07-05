import java.awt.Component;

public class Class80 {
	public static int anInt633;

	public static void method350(final Component var0) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(Class25.aClass25_248);
		var0.addFocusListener(Class25.aClass25_248);
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
		if (Class104_Sub7.loaded(var0)) {
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
