import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
	/**
	 *
	 */
	private static final long serialVersionUID = -4255312875644960765L;
	static int anInt1752 = 0;
	static Applet_Sub1 anApplet_Sub1_1751 = null;
	protected static int anInt1762;
	public static Class11 aClass11_1760;
	public static Class2 aClass2_1764;
	static int anInt1756;
	static int anInt1758 = 1;
	static int anInt1765 = 500;
	protected static int anInt1759 = 0;
	protected static volatile boolean aBool1755 = true;
	static long aLong1768 = 0L;
	protected static volatile boolean aBool1766 = false;
	static volatile boolean aBool1754 = true;
	boolean aBool1750;
	static boolean aBool1763 = false;
	static int anInt1757 = 20;
	static long[] aLongArray1753 = new long[32];
	static long[] aLongArray1761 = new long[32];
	static volatile long aLong1767 = 0L;

	final void method937(final int var1, final int var2, final int var3) {
		try {
			if (anApplet_Sub1_1751 != null) {
				++anInt1752;
				if (anInt1752 >= 3) {
					method944("alreadyloaded");
					return;
				}

				getAppletContext().showDocument(getDocumentBase(), "_self");
				return;
			}

			anApplet_Sub1_1751 = this;
			anInt1762 = var1;
			Class15.anInt110 = var2;
			RuntimeException_Sub1.anInt1477 = var3;
			RuntimeException_Sub1.anApplet1476 = this;
			if (aClass11_1760 == null)
				aClass11_1760 = new Class11();

			aClass11_1760.method43(this, 1);
		} catch (final Exception var5) {
			Nodee.method520((String) null, var5);
			method944("crash");
		}

	}

	@Override
	public void run() {
		try {
			int var3;
			if (Class11.aString64 != null) {
				final String var1 = Class11.aString64.toLowerCase();
				if ((var1.indexOf("sun") != -1) || (var1.indexOf("apple") != -1)) {
					final String var2 = Class11.aString59;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")
							|| var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4")
							|| var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.")
							|| var2.equals("1.6.0")) {
						method944("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						for (var3 = 6; var3 < var2.length(); ++var3) {
							final char var4 = var2.charAt(var3);
							final boolean var5 = (var4 >= 48) && (var4 <= 57);
							if (!var5)
								break;
						}

						final String var6 = var2.substring(6, var3);
						if (Class72.method334(var6)) {
							final int var17 = Class66.method299(var6, 10, true);
							if (var17 < 10) {
								method944("wrongjava");
								return;
							}
						}
					}

					anInt1758 = 5;
				}
			}

			setFocusCycleRoot(true);
			method947();
			final int var7 = anInt1762;
			var3 = Class15.anInt110;
			final Canvas var18 = Class57.aCanvas468;

			Object var16;
			try {
				final Class2_Sub1 var8 = new Class2_Sub1();
				var8.method21(var7, var3, var18, -827826375);
				var16 = var8;
			} catch (final Throwable var14) {
				final Class2_Sub2 var9 = new Class2_Sub2();
				var9.method21(var7, var3, var18, -1339897279);
				var16 = var9;
			}

			aClass2_1764 = (Class2) var16;
			method942(1448440295);

			Object var19;
			try {
				var19 = new Class1_Sub2();
			} catch (final Throwable var13) {
				var19 = new Class1_Sub1();
			}

			Class28.aClass1_267 = (Class1) var19;

			label94: while (true) {
				Canvas var11;
				Class11 var20;
				do {
					if ((aLong1768 != 0L) && (Class71.method332() >= aLong1768))
						break label94;

					anInt1756 = Class28.aClass1_267.method12(anInt1757, anInt1758, (byte) 7);

					for (int var10 = 0; var10 < anInt1756; ++var10)
						method938();

					method939();
					var20 = aClass11_1760;
					var11 = Class57.aCanvas468;
				} while (null == var20.anEventQueue65);

				for (int var12 = 0; (var12 < 50) && (var20.anEventQueue65.peekEvent() != null); ++var12)
					Class69.method323(1L);

				if (null != var11)
					var20.anEventQueue65.postEvent(new ActionEvent(var11, 1001, "dummy"));
			}
		} catch (final Exception var15) {
			Nodee.method520((String) null, var15);
			method944("crash");
		}

		method946();
	}

	void method938() {
		final long var1 = Class71.method332();
		final long var3 = aLongArray1761[Class89.anInt702];
		aLongArray1761[Class89.anInt702] = var1;
		Class89.anInt702 = (1 + Class89.anInt702) & 31;
		if ((0L != var3) && (var1 > var3))
			;

		synchronized (this) {
			Class100.aBool799 = aBool1754;
		}

		method943((byte) 1);
	}

	void method939() {
		final long var1 = Class71.method332();
		final long var3 = aLongArray1753[Class38.anInt358];
		aLongArray1753[Class38.anInt358] = var1;
		Class38.anInt358 = (Class38.anInt358 + 1) & 31;
		if ((var3 != 0L) && (var1 > var3)) {
			final int var5 = (int) (var1 - var3);
			anInt1759 = (32000 + (var5 >> 1)) / var5;
		}

		if ((++anInt1765 - 1) > 50) {
			anInt1765 -= 50;
			aBool1755 = true;
			Class57.aCanvas468.setSize(anInt1762, Class15.anInt110);
			Class57.aCanvas468.setVisible(true);
			if (null != Class53.aFrame435) {
				final Insets var6 = Class53.aFrame435.getInsets();
				Class57.aCanvas468.setLocation(var6.left, var6.top);
			} else
				Class57.aCanvas468.setLocation(0, 0);
		}

		method948(-1982946377);
	}

	@Override
	public void start() {
		if ((this == anApplet_Sub1_1751) && !aBool1763)
			aLong1768 = 0L;
	}

	@Override
	public void stop() {
		if ((anApplet_Sub1_1751 == this) && !aBool1763)
			aLong1768 = Class71.method332() + 4000L;
	}

	abstract void method940(byte var1);

	@Override
	public final synchronized void paint(final Graphics var1) {
		if ((this == anApplet_Sub1_1751) && !aBool1763) {
			aBool1755 = true;
			if ((Class11.aString59 != null) && Class11.aString59.startsWith("1.5")
					&& ((Class71.method332() - aLong1767) > 1000L)) {
				final Rectangle var2 = var1.getClipBounds();
				if ((var2 == null) || ((var2.width >= anInt1762) && (var2.height >= Class15.anInt110)))
					aBool1766 = true;
			}

		}
	}

	@Override
	public final void focusLost(final FocusEvent var1) {
		aBool1754 = false;
	}

	@Override
	public final void windowActivated(final WindowEvent var1) {
	}

	@Override
	public final void windowClosed(final WindowEvent var1) {
	}

	@Override
	public final void windowIconified(final WindowEvent var1) {
	}

	final boolean method941() {
		String var1 = getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (!var1.equals("mechscape.com") && !var1.endsWith(".mechscape.com")) {
					if (var1.endsWith("127.0.0.1"))
						return true;
					else {
						while ((var1.length() > 0) && (var1.charAt(var1.length() - 1) >= 48)
								&& (var1.charAt(var1.length() - 1) <= 57))
							var1 = var1.substring(0, var1.length() - 1);

						if (var1.endsWith("192.168.1."))
							return true;
						else {
							method944("invalidhost");
							return false;
						}
					}
				} else
					return true;
			} else
				return true;
		} else
			return true;
	}

	abstract void method942(int var1);

	abstract void method943(byte var1);

	void method944(final String var1) {
		if (!aBool1750) {
			aBool1750 = true;
			System.out.println("error_game_" + var1);

			try {
				getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (final Exception var3) {
				;
			}

		}
	}

	abstract void method945(int var1);

	final synchronized void method946() {
		if (!aBool1763) {
			aBool1763 = true;

			try {
				Class57.aCanvas468.removeFocusListener(this);
			} catch (final Exception var5) {
				;
			}

			try {
				method940((byte) 30);
			} catch (final Exception var4) {
				;
			}

			if (Class53.aFrame435 != null)
				try {
					System.exit(0);
				} catch (final Throwable var3) {
					;
				}

			if (aClass11_1760 != null)
				try {
					aClass11_1760.method42();
				} catch (final Exception var2) {
					;
				}

			method945(-2100615651);
		}
	}

	final synchronized void method947() {
		Object var1;
		if (Class53.aFrame435 != null)
			var1 = Class53.aFrame435;
		else
			var1 = this;

		if (null != Class57.aCanvas468) {
			Class57.aCanvas468.removeFocusListener(this);
			((Container) var1).remove(Class57.aCanvas468);
		}

		Class57.aCanvas468 = new Canvas_Sub1(this);
		((Container) var1).add(Class57.aCanvas468);
		Class57.aCanvas468.setSize(anInt1762, Class15.anInt110);
		Class57.aCanvas468.setVisible(true);
		if (null != Class53.aFrame435) {
			final Insets var2 = Class53.aFrame435.getInsets();
			Class57.aCanvas468.setLocation(var2.left, var2.top);
		} else
			Class57.aCanvas468.setLocation(0, 0);

		Class57.aCanvas468.addFocusListener(this);
		Class57.aCanvas468.requestFocus();
		aBool1755 = true;
		aBool1766 = false;
		aLong1767 = Class71.method332();
	}

	@Override
	public abstract void init();

	@Override
	public final void windowDeactivated(final WindowEvent var1) {
	}

	@Override
	public final void windowClosing(final WindowEvent var1) {
		destroy();
	}

	abstract void method948(int var1);

	@Override
	public final void update(final Graphics var1) {
		paint(var1);
	}

	@Override
	public final void windowOpened(final WindowEvent var1) {
	}

	@Override
	public void destroy() {
		if ((anApplet_Sub1_1751 == this) && !aBool1763) {
			aLong1768 = Class71.method332();
			Class69.method323(5000L);
			method946();
		}
	}

	@Override
	public final void windowDeiconified(final WindowEvent var1) {
	}

	@Override
	public final void focusGained(final FocusEvent var1) {
		aBool1754 = true;
		aBool1755 = true;
	}

	static int method949(final int var0, final int var1) {
		final Class104_Sub2 var2 = (Class104_Sub2) Class104_Sub2.aClass58_857.method241(var0);
		if (null == var2)
			return 0;
		else if (var1 == -1)
			return 0;
		else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.anIntArray858.length; ++var4)
				if (var1 == var2.anIntArray856[var4])
					var3 += var2.anIntArray858[var4];

			return var3;
		}
	}
}
