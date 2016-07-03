public class Class104_Sub8_Sub2 extends Class104_Sub8 {
	int anInt1223 = 0;
	int anInt1221 = -1;
	Class59 aClass59_1224 = new Class59();
	Class59 aClass59_1222 = new Class59();

	@Override
	public final synchronized void method515(final int[] var1, int var2, int var3) {
		do {
			if (anInt1221 < 0) {
				method672(var1, var2, var3);
				return;
			}

			if ((anInt1223 + var3) < anInt1221) {
				anInt1223 += var3;
				method672(var1, var2, var3);
				return;
			}

			final int var4 = anInt1221 - anInt1223;
			method672(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			anInt1223 += var4;
			method668();
			final Class104_Sub10 var5 = (Class104_Sub10) aClass59_1222.method251();
			synchronized (var5) {
				final int var7 = var5.method521(this);
				if (var7 < 0) {
					var5.anInt960 = 0;
					method670(var5);
				} else {
					var5.anInt960 = var7;
					method669(var5.aClass104_823, var5);
				}
			}
		} while (var3 != 0);

	}

	public final synchronized void method666(final Class104_Sub8 var1) {
		aClass59_1224.method255(var1);
	}

	public final synchronized void method667(final Class104_Sub8 var1) {
		var1.method470();
	}

	void method668() {
		if (anInt1223 > 0) {
			for (Class104_Sub10 var1 = (Class104_Sub10) aClass59_1222
					.method251(); var1 != null; var1 = (Class104_Sub10) aClass59_1222.method252())
				var1.anInt960 -= anInt1223;

			anInt1221 -= anInt1223;
			anInt1223 = 0;
		}

	}

	void method669(Class104 var1, final Class104_Sub10 var2) {
		while ((var1 != aClass59_1222.aClass104_474) && (((Class104_Sub10) var1).anInt960 <= var2.anInt960))
			var1 = var1.aClass104_823;

		Class59.method249(var2, var1);
		anInt1221 = ((Class104_Sub10) aClass59_1222.aClass104_474.aClass104_823).anInt960;
	}

	void method670(final Class104_Sub10 var1) {
		var1.method470();
		var1.method522();
		final Class104 var2 = aClass59_1222.aClass104_474.aClass104_823;
		if (var2 == aClass59_1222.aClass104_474)
			anInt1221 = -1;
		else
			anInt1221 = ((Class104_Sub10) var2).anInt960;

	}

	@Override
	Class104_Sub8 method512() {
		return (Class104_Sub8) aClass59_1224.method251();
	}

	@Override
	int method514() {
		return 0;
	}

	@Override
	public final synchronized void method516(int var1) {
		do {
			if (anInt1221 < 0) {
				method671(var1);
				return;
			}

			if ((anInt1223 + var1) < anInt1221) {
				anInt1223 += var1;
				method671(var1);
				return;
			}

			final int var2 = anInt1221 - anInt1223;
			method671(var2);
			var1 -= var2;
			anInt1223 += var2;
			method668();
			final Class104_Sub10 var3 = (Class104_Sub10) aClass59_1222.method251();
			synchronized (var3) {
				final int var5 = var3.method521(this);
				if (var5 < 0) {
					var3.anInt960 = 0;
					method670(var3);
				} else {
					var3.anInt960 = var5;
					method669(var3.aClass104_823, var3);
				}
			}
		} while (var1 != 0);

	}

	void method671(final int var1) {
		for (Class104_Sub8 var2 = (Class104_Sub8) aClass59_1224
				.method251(); var2 != null; var2 = (Class104_Sub8) aClass59_1224.method252())
			var2.method516(var1);

	}

	void method672(final int[] var1, final int var2, final int var3) {
		for (Class104_Sub8 var4 = (Class104_Sub8) aClass59_1224
				.method251(); var4 != null; var4 = (Class104_Sub8) aClass59_1224.method252())
			var4.method517(var1, var2, var3);

	}

	@Override
	Class104_Sub8 method513() {
		return (Class104_Sub8) aClass59_1224.method252();
	}
}
