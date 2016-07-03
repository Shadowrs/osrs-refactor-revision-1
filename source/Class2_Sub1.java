import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class2_Sub1 extends Class2 {
	Component aComponent855;

	@Override
	public final void method19(final Graphics var1, final int var2, final int var3, final int var4) {
		var1.drawImage(anImage4, var2, var3, aComponent855);
	}

	@Override
	public final void method20(final Graphics var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		final Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage4, 0, 0, aComponent855);
		var1.setClip(var7);
	}

	@Override
	public final void method21(final int var1, final int var2, final Component var3, final int var4) {
		anInt6 = var1;
		anInt5 = var2;
		anIntArray3 = new int[(var1 * var2) + 1];
		final DataBufferInt var5 = new DataBufferInt(anIntArray3, anIntArray3.length);
		final DirectColorModel var6 = new DirectColorModel(32, 16711680, '\uff00', 255);
		final WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(anInt6, anInt5), var5,
				(Point) null);
		anImage4 = new BufferedImage(var6, var7, false, new Hashtable());
		aComponent855 = var3;
		method18();
	}
}
