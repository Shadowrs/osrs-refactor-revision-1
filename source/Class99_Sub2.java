import java.awt.Component;

public class Class99_Sub2 extends Class99 {
	static Interface4 anInterface4_946;
	int anInt945;

	@Override
	int method453() {
		return anInterface4_946.method7();
	}

	@Override
	void method456() {
		anInterface4_946.method9();
	}

	@Override
	void method452(final int var1) throws Exception {
		if (var1 > '\u8000')
			throw new IllegalArgumentException();
		else {
			anInterface4_946.method11();
		}
	}

	@Override
	void method449(final Component var1) throws Exception {
		anInterface4_946.method6(var1, anInt777, aBool773);
	}

	@Override
	void method454() {
		anInterface4_946.method8(anInt945, anIntArray779);
	}

	@Override
	void method455() {
		anInterface4_946.method10();
	}

	Class99_Sub2(final Class11 var1, final int var2) {
		anInterface4_946 = var1.method45();
		anInt945 = var2;
	}
}
