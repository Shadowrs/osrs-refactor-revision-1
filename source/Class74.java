public class Class74 {
	int anInt589 = 2;
	int[] anIntArray587 = new int[2];
	int[] anIntArray588 = new int[2];
	int anInt586;
	int anInt596;
	int anInt590;
	int anInt591;
	int anInt595;
	int anInt593;
	int anInt592;
	int anInt594;

	Class74() {
		anIntArray587[0] = 0;
		anIntArray587[1] = '\uffff';
		anIntArray588[0] = 0;
		anIntArray588[1] = '\uffff';
	}

	final void method337(final Class104_Sub21 var1) {
		anInt586 = var1.method570();
		anInt596 = var1.method574();
		anInt590 = var1.method574();
		method338(var1);
	}

	final void method338(final Class104_Sub21 var1) {
		anInt589 = var1.method570();
		anIntArray587 = new int[anInt589];
		anIntArray588 = new int[anInt589];

		for (int var2 = 0; var2 < anInt589; ++var2) {
			anIntArray587[var2] = var1.method571();
			anIntArray588[var2] = var1.method571();
		}

	}

	final int method339(final int var1) {
		if (anInt593 >= anInt592) {
			anInt595 = anIntArray588[anInt591++] << 15;
			if (anInt591 >= anInt589)
				anInt591 = anInt589 - 1;

			anInt592 = (int) ((anIntArray587[anInt591] / 65536.0D) * var1);
			if (anInt592 > anInt593)
				anInt594 = ((anIntArray588[anInt591] << 15) - anInt595) / (anInt592 - anInt593);
		}

		anInt595 += anInt594;
		++anInt593;
		return (anInt595 - anInt594) >> 15;
	}

	final void method340() {
		anInt592 = 0;
		anInt591 = 0;
		anInt594 = 0;
		anInt595 = 0;
		anInt593 = 0;
	}
}
