import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

public final class Class2_Sub2 extends Class2 implements ImageProducer, ImageObserver {
	static Class72 aClass72_865;
	static int[] anIntArray866;
	ColorModel aColorModel863;
	ImageConsumer anImageConsumer864;

	@Override
	public final void method19(final Graphics var1, final int var2, final int var3, final int var4) {
		method481();
		var1.drawImage(anImage4, var2, var3, this);
	}

	@Override
	public final void method21(final int var1, final int var2, final Component var3, final int var4) {
		anInt6 = var1;
		anInt5 = var2;
		anIntArray3 = new int[(var2 * var1) + 1];
		aColorModel863 = new DirectColorModel(32, 16711680, '\uff00', 255);
		anImage4 = var3.createImage(this);
		method481();
		var3.prepareImage(anImage4, this);
		method481();
		var3.prepareImage(anImage4, this);
		method481();
		var3.prepareImage(anImage4, this);
		method18();
	}

	@Override
	public synchronized boolean isConsumer(final ImageConsumer var1) {
		return var1 == anImageConsumer864;
	}

	@Override
	public final void method20(final Graphics var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		method482(var2, var3, var4, var5);
		final Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage4, 0, 0, this);
		var1.setClip(var7);
	}

	synchronized void method481() {
		if (anImageConsumer864 != null) {
			anImageConsumer864.setPixels(0, 0, anInt6, anInt5, aColorModel863, anIntArray3, 0, anInt6);
			anImageConsumer864.imageComplete(2);
		}
	}

	@Override
	public synchronized void removeConsumer(final ImageConsumer var1) {
		if (anImageConsumer864 == var1)
			anImageConsumer864 = null;

	}

	@Override
	public void startProduction(final ImageConsumer var1) {
		addConsumer(var1);
	}

	@Override
	public void requestTopDownLeftRightResend(final ImageConsumer var1) {
	}

	synchronized void method482(final int var1, final int var2, final int var3, final int var4) {
		if (anImageConsumer864 != null) {
			anImageConsumer864.setPixels(var1, var2, var3, var4, aColorModel863, anIntArray3, (anInt6 * var2) + var1,
					anInt6);
			anImageConsumer864.imageComplete(2);
		}
	}

	@Override
	public boolean imageUpdate(final Image var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		return true;
	}

	@Override
	public synchronized void addConsumer(final ImageConsumer var1) {
		anImageConsumer864 = var1;
		var1.setDimensions(anInt6, anInt5);
		var1.setProperties((Hashtable) null);
		var1.setColorModel(aColorModel863);
		var1.setHints(14);
	}

	static final void method483() {
		while (true) {
			if (client.gamecon.availbits(client.pktSize) >= 27) {
				final int var0 = client.gamecon.readbits(15);
				if (var0 != 32767) {
					boolean var1 = false;
					if (null == client.localNpcs[var0]) {
						client.localNpcs[var0] = new Class104_Sub18_Sub16_Sub7_Sub2();
						var1 = true;
					}

					final Class104_Sub18_Sub16_Sub7_Sub2 var2 = client.localNpcs[var0];
					client.localNpcIndicies[++client.localNpcSize - 1] = var0;
					var2.anInt1739 = client.currentTime;
					final int var3 = client.anIntArray1817[client.gamecon.readbits(3)];
					if (var1)
						var2.anInt1698 = var2.anInt1725 = var3;

					int var4 = client.gamecon.readbits(5);
					if (var4 > 15)
						var4 -= 32;

					final int var5 = client.gamecon.readbits(1);
					if (var5 == 1)
						client.updates[++client.anInt1910 - 1] = var0;

					final int var6 = client.gamecon.readbits(1);
					var2.aClass104_Sub18_Sub2_1788 = Class64.method296(client.gamecon.readbits(14));
					int var7 = client.gamecon.readbits(5);
					if (var7 > 15)
						var7 -= 32;

					var2.anInt1736 = var2.aClass104_Sub18_Sub2_1788.anInt1240;
					var2.anInt1740 = var2.aClass104_Sub18_Sub2_1788.anInt1253;
					if (var2.anInt1740 == 0)
						var2.anInt1725 = 0;

					var2.walkAnim = var2.aClass104_Sub18_Sub2_1788.anInt1236;
					var2.turn180 = var2.aClass104_Sub18_Sub2_1788.anInt1237;
					var2.turn90c = var2.aClass104_Sub18_Sub2_1788.anInt1251;
					var2.turn90cc = var2.aClass104_Sub18_Sub2_1788.anInt1239;
					var2.stand = var2.aClass104_Sub18_Sub2_1788.anInt1233;
					var2.turn = var2.aClass104_Sub18_Sub2_1788.anInt1244;
					var2.walk = var2.aClass104_Sub18_Sub2_1788.anInt1235;
					var2.placeEntity(Class81.activePlayer.stepx[0] + var7,
							Class81.activePlayer.stepy[0] + var4, var6 == 1);
					continue;
				}
			}

			client.gamecon.endbits();
			return;
		}
	}

	static final void method484() {
		int var0;
		int var1;
		for (var0 = -1; var0 < client.localPlrSize; ++var0) {
			if (var0 == -1)
				var1 = 2047;
			else
				var1 = client.localPlayerIndexs[var0];

			final Player var2 = client.localPlayers[var1];
			if ((null != var2) && (var2.anInt1713 > 0)) {
				--var2.anInt1713;
				if (var2.anInt1713 == 0)
					var2.forceChat = null;
			}
		}

		for (var0 = 0; var0 < client.localNpcSize; ++var0) {
			var1 = client.localNpcIndicies[var0];
			final Class104_Sub18_Sub16_Sub7_Sub2 var3 = client.localNpcs[var1];
			if ((var3 != null) && (var3.anInt1713 > 0)) {
				--var3.anInt1713;
				if (var3.anInt1713 == 0)
					var3.forceChat = null;
			}
		}

	}
}
