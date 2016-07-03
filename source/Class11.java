import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class11 implements Runnable {
	Interface4 anInterface4_60;
	static int anInt66;
	Class8 aClass8_58 = null;
	Class8 aClass8_62 = null;
	boolean aBool61 = false;
	public static String aString64;
	static String aString59;
	public EventQueue anEventQueue65;
	Thread aThread63;

	final Class8 method41(final int var1, final int var2, final int var3, final Object var4) {
		final Class8 var5 = new Class8();
		var5.anInt45 = var1;
		var5.anInt47 = var2;
		var5.anObject49 = var4;
		synchronized (this) {
			if (aClass8_62 != null) {
				aClass8_62.aClass8_48 = var5;
				aClass8_62 = var5;
			} else
				aClass8_62 = aClass8_58 = var5;

			notify();
			return var5;
		}
	}

	final void method42() {
		synchronized (this) {
			aBool61 = true;
			notifyAll();
		}

		try {
			aThread63.join();
		} catch (final InterruptedException var3) {
			;
		}

	}

	public final Class8 method43(final Runnable var1, final int var2) {
		return method41(2, var2, 0, var1);
	}

	public final Class8 method44(final int var1) {
		return method41(3, var1, 0, (Object) null);
	}

	public final Interface4 method45() {
		return anInterface4_60;
	}

	Class11() {
		aString64 = "Unknown";
		aString59 = "1.1";

		try {
			aString64 = System.getProperty("java.vendor");
			aString59 = System.getProperty("java.version");
		} catch (final Exception var3) {
			;
		}

		try {
			anEventQueue65 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (final Throwable var2) {
			;
		}

		aBool61 = false;
		aThread63 = new Thread(this);
		aThread63.setPriority(10);
		aThread63.setDaemon(true);
		aThread63.start();
	}

	public final Class8 method46(final URL var1) {
		return method41(4, 0, 0, var1);
	}

	@Override
	public final void run() {
		while (true) {
			Class8 var2;
			synchronized (this) {
				while (true) {
					if (aBool61)
						return;

					if (null != aClass8_58) {
						var2 = aClass8_58;
						aClass8_58 = aClass8_58.aClass8_48;
						if (aClass8_58 == null)
							aClass8_62 = null;
						break;
					}

					try {
						this.wait();
					} catch (final InterruptedException var8) {
						;
					}
				}
			}

			try {
				final int var5 = var2.anInt45;
				if (var5 == 1)
					var2.anObject50 = new Socket(InetAddress.getByName((String) var2.anObject49), var2.anInt47);
				else if (var5 == 2) {
					final Thread var3 = new Thread((Runnable) var2.anObject49);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var2.anInt47);
					var2.anObject50 = var3;
				} else if (var5 == 4)
					var2.anObject50 = new DataInputStream(((URL) var2.anObject49).openStream());
				else if (var5 == 3) {
					final String var10 = ((var2.anInt47 >> 24) & 255) + "." + ((var2.anInt47 >> 16) & 255) + "."
							+ ((var2.anInt47 >> 8) & 255) + "." + (var2.anInt47 & 255);
					var2.anObject50 = InetAddress.getByName(var10).getHostName();
				}

				var2.anInt46 = 1;
			} catch (final ThreadDeath var6) {
				throw var6;
			} catch (final Throwable var7) {
				var2.anInt46 = 2;
			}
		}
	}

	public final Class8 method47(final String var1, final int var2) {
		return method41(1, var2, 0, var1);
	}

	public static Class104_Sub18_Sub17_Sub3 method48(final Class61 var0, final String var1, final String var2) {
		final int var3 = var0.method271(var1);
		final int var4 = var0.method273(var3, var2);
		Class104_Sub18_Sub17_Sub3 var5;
		if (!Class39.method181(var0, var3, var4))
			var5 = null;
		else
			var5 = Class15.method57();

		return var5;
	}

	static final void method49(final int var0, final int var1, final int var2, final int var3,
			final Class104_Sub18_Sub17_Sub1 var4) {
		final int var5 = (var3 * var3) + (var2 * var2);
		if ((var5 > 4225) && (var5 < 90000)) {
			final int var6 = (client.anInt1862 + client.anInt1866) & 2047;
			int var7 = Class104_Sub18_Sub17_Sub4.anIntArray1680[var6];
			int var8 = Class104_Sub18_Sub17_Sub4.anIntArray1678[var6];
			var7 = (var7 * 256) / (client.anInt1921 + 256);
			var8 = (var8 * 256) / (256 + client.anInt1921);
			final int var9 = ((var3 * var7) + (var8 * var2)) >> 16;
			final int var10 = ((var8 * var3) - (var7 * var2)) >> 16;
			final double var11 = Math.atan2(var9, var10);
			final int var13 = (int) (Math.sin(var11) * 63.0D);
			final int var14 = (int) (Math.cos(var11) * 57.0D);
			Class103.aClass104_Sub18_Sub17_Sub1_819.method836((var13 + 94 + var0 + 4) - 10, (83 + var1) - var14 - 20,
					20, 20, 15, 15, var11, 256);
		} else
			Class66.method302(var0, var1, var2, var3, var4);

	}
}
