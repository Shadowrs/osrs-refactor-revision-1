public final class Class56 {
	int anInt456;
	Class104_Sub18 aClass104_Sub18_454 = new Class104_Sub18();
	Class63 aClass63_458 = new Class63();
	int anInt457;
	Class58 aClass58_455;

	public Class104_Sub18 method236(final long var1) {
		final Class104_Sub18 var3 = (Class104_Sub18) aClass58_455.method241(var1);
		if (var3 != null)
			aClass63_458.method290(var3);

		return var3;
	}

	public void method237(final long var1) {
		final Class104_Sub18 var3 = (Class104_Sub18) aClass58_455.method241(var1);
		if (var3 != null) {
			var3.method470();
			var3.method555();
			++anInt456;
		}

	}

	public Class56(final int var1) {
		anInt457 = var1;
		anInt456 = var1;

		int var2;
		for (var2 = 1; (var2 + var2) < var1; var2 += var2)
			;

		aClass58_455 = new Class58(var2);
	}

	public void method238(final Class104_Sub18 var1, final long var2) {
		if (anInt456 == 0) {
			Class104_Sub18 var4 = aClass63_458.method292();
			var4.method470();
			var4.method555();
			if (var4 == aClass104_Sub18_454) {
				var4 = aClass63_458.method292();
				var4.method470();
				var4.method555();
			}
		} else
			--anInt456;

		aClass58_455.method242(var1, var2);
		aClass63_458.method290(var1);
	}

	public void method239() {
		aClass63_458.method294();
		aClass58_455.method244();
		aClass104_Sub18_454 = new Class104_Sub18();
		anInt456 = anInt457;
	}
}
