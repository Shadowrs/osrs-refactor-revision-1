import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas {
	/**
	 *
	 */
	private static final long serialVersionUID = 2085254764695277321L;
	Component aComponent1458;

	@Override
	public final void update(final Graphics var1) {
		aComponent1458.update(var1);
	}

	@Override
	public final void paint(final Graphics var1) {
		aComponent1458.paint(var1);
	}

	Canvas_Sub1(final Component var1) {
		aComponent1458 = var1;
	}
}
