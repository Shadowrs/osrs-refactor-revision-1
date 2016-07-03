import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Class14 implements MouseListener, MouseMotionListener, FocusListener {
	static int[] anIntArray92;
	static int anInt105;
	public static volatile int anInt89 = 0;
	public static volatile int anInt97 = 0;
	public static volatile int anInt98 = 0;
	public static volatile long aLong99 = 0L;
	public static volatile int anInt88 = 0;
	public static volatile int anInt90 = 0;
	public static volatile int anInt104 = -1;
	public static volatile int anInt96 = -1;
	public static Class14 aClass14_94 = new Class14();
	public static int anInt93 = 0;
	public static int anInt91 = 0;
	public static int anInt95 = 0;
	public static int anInt100 = 0;
	public static int anInt101 = 0;
	public static int anInt102 = 0;
	public static long aLong103 = 0L;

	@Override
	public final synchronized void mousePressed(final MouseEvent var1) {
		if (null != aClass14_94) {
			anInt89 = 0;
			anInt97 = var1.getX();
			anInt98 = var1.getY();
			aLong99 = Class71.method332();
			if (var1.isMetaDown()) {
				anInt88 = 2;
				anInt90 = 2;
			} else {
				anInt88 = 1;
				anInt90 = 1;
			}
		}

		if (var1.isPopupTrigger())
			var1.consume();

	}

	@Override
	public final synchronized void focusLost(final FocusEvent var1) {
		if (null != aClass14_94)
			anInt90 = 0;

	}

	@Override
	public final synchronized void mouseExited(final MouseEvent var1) {
		if (aClass14_94 != null) {
			anInt89 = 0;
			anInt104 = -1;
			anInt96 = -1;
		}

	}

	@Override
	public final synchronized void mouseMoved(final MouseEvent var1) {
		if (aClass14_94 != null) {
			anInt89 = 0;
			anInt104 = var1.getX();
			anInt96 = var1.getY();
		}

	}

	@Override
	public final void focusGained(final FocusEvent var1) {
	}

	@Override
	public final synchronized void mouseDragged(final MouseEvent var1) {
		if (aClass14_94 != null) {
			anInt89 = 0;
			anInt104 = var1.getX();
			anInt96 = var1.getY();
		}

	}

	@Override
	public final synchronized void mouseEntered(final MouseEvent var1) {
		if (null != aClass14_94) {
			anInt89 = 0;
			anInt104 = var1.getX();
			anInt96 = var1.getY();
		}

	}

	@Override
	public final void mouseClicked(final MouseEvent var1) {
		if (var1.isPopupTrigger())
			var1.consume();

	}

	@Override
	public final synchronized void mouseReleased(final MouseEvent var1) {
		if (null != aClass14_94) {
			anInt89 = 0;
			anInt90 = 0;
		}

		if (var1.isPopupTrigger())
			var1.consume();

	}
}
