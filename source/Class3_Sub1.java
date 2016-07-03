import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class3_Sub1 extends Class3 implements MouseWheelListener {
	int anInt854 = 0;

	@Override
	public void method23(final Component var1, final int var2) {
		var1.addMouseWheelListener(this);
	}

	@Override
	public void method24(final Component var1, final byte var2) {
		var1.removeMouseWheelListener(this);
	}

	@Override
	public synchronized int method25(final int var1) {
		final int var2 = anInt854;
		anInt854 = 0;
		return var2;
	}

	@Override
	public synchronized void mouseWheelMoved(final MouseWheelEvent var1) {
		anInt854 += var1.getWheelRotation();
	}
}
