import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class25 implements KeyListener, FocusListener {
	static Class3 aClass3_257;
	public static volatile int anInt256 = 0;
	public static int anInt245 = 0;
	public static int anInt255 = 0;
	public static Class25 aClass25_248 = new Class25();
	public static boolean[] run = new boolean[112];
	public static int[] anIntArray250 = new int[128];
	public static int anInt247 = 0;
	public static char[] aCharArray252 = new char[128];
	public static int[] anIntArray253 = new int[128];
	public static int anInt254 = 0;
	public static int anInt246 = 0;
	public static int[] anIntArray251 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81,
			82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1,
			-1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34,
			51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228,
			231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
			-1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@Override
	public final synchronized void keyPressed(final KeyEvent var1) {
		if (aClass25_248 != null) {
			anInt256 = 0;
			int var2 = var1.getKeyCode();
			if ((var2 >= 0) && (var2 < anIntArray251.length)) {
				var2 = anIntArray251[var2];
				if ((var2 & 128) != 0)
					var2 = -1;
			} else
				var2 = -1;

			if ((anInt245 >= 0) && (var2 >= 0)) {
				anIntArray250[anInt245] = var2;
				anInt245 = (1 + anInt245) & 127;
				if (anInt247 == anInt245)
					anInt245 = -1;
			}

			int var3;
			if (var2 >= 0) {
				var3 = (1 + anInt255) & 127;
				if (var3 != anInt254) {
					anIntArray253[anInt255] = var2;
					aCharArray252[anInt255] = 0;
					anInt255 = var3;
				}
			}

			var3 = var1.getModifiers();
			if (((var3 & 10) != 0) || (var2 == 85) || (var2 == 10))
				var1.consume();
		}

	}

	@Override
	public final synchronized void keyReleased(final KeyEvent var1) {
		if (aClass25_248 != null) {
			anInt256 = 0;
			int var2 = var1.getKeyCode();
			if ((var2 >= 0) && (var2 < anIntArray251.length))
				var2 = anIntArray251[var2] & -129;
			else
				var2 = -1;

			if ((anInt245 >= 0) && (var2 >= 0)) {
				anIntArray250[anInt245] = ~var2;
				anInt245 = (1 + anInt245) & 127;
				if (anInt245 == anInt247)
					anInt245 = -1;
			}
		}

		var1.consume();
	}

	@Override
	public final synchronized void focusLost(final FocusEvent var1) {
		if (null != aClass25_248)
			anInt245 = -1;

	}

	@Override
	public final void focusGained(final FocusEvent var1) {
	}

	@Override
	public final void keyTyped(final KeyEvent var1) {
		if (null != aClass25_248) {
			final char var2 = var1.getKeyChar();
			if ((var2 != 0) && (var2 != '\uffff') && Class36.method168(var2)) {
				final int var3 = (anInt255 + 1) & 127;
				if (var3 != anInt254) {
					anIntArray253[anInt255] = -1;
					aCharArray252[anInt255] = var2;
					anInt255 = var3;
				}
			}
		}

		var1.consume();
	}

	static void method128() {
		for (Class104_Sub1 var0 = (Class104_Sub1) Class104_Sub1.aClass59_849
				.method251(); null != var0; var0 = (Class104_Sub1) Class104_Sub1.aClass59_849.method252())
			if (null != var0.aClass104_Sub18_Sub6_852)
				var0.method476();

	}

	public static int method129(int var0, final byte var1) {
		int var2 = 0;
		if ((var0 < 0) || (var0 >= 65536)) {
			var0 >>>= 16;
			var2 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var2 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var2 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var2 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var2;
		}

		return var0 + var2;
	}

	public static int method130(final int var0, final int var1) {
		return (var0 >> 17) & 7;
	}
}
