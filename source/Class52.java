public class Class52 implements Runnable {
	static Class61_Sub1 aClass61_Sub1_430;
	static int anInt426 = 0;
	public static Class59 aClass59_429 = new Class59();
	public static Class59 aClass59_427 = new Class59();
	static Object anObject428 = new Object();

	@Override
	public void run() {
		try {
			while (true) {
				Class59 var1 = aClass59_429;
				Class104_Sub13 var2;
				synchronized (var1) {
					var2 = (Class104_Sub13) aClass59_429.method251();
				}

				Object var14;
				if (var2 != null) {
					if (var2.anInt1097 == 0) {
						var2.aClass16_1095.method63((int) var2.nodeId, var2.aByteArray1096,
								var2.aByteArray1096.length);
						var1 = aClass59_429;
						synchronized (var1) {
							var2.method470();
						}
					} else if (var2.anInt1097 == 1) {
						var2.aByteArray1096 = var2.aClass16_1095.method65((int) var2.nodeId);
						var1 = aClass59_429;
						synchronized (var1) {
							aClass59_427.method248(var2);
						}
					}

					var14 = anObject428;
					synchronized (var14) {
						if (anInt426 <= 1) {
							anInt426 = 0;
							anObject428.notifyAll();
							return;
						}

						anInt426 = 600;
					}
				} else {
					Class69.method323(100L);
					var14 = anObject428;
					synchronized (var14) {
						if (anInt426 <= 1) {
							anInt426 = 0;
							anObject428.notifyAll();
							return;
						}

						--anInt426;
					}
				}
			}
		} catch (final Exception var13) {
			Nodee.method520((String) null, var13);
		}
	}

	public static int method228(final int var0) {
		final Class104_Sub18_Sub8 var1 = Class86.method396(var0);
		final int var2 = var1.anInt1388;
		final int var3 = var1.anInt1386;
		final int var4 = var1.anInt1390;
		final int var5 = Class71.anIntArray578[var4 - var3];
		return (Class71.anIntArray576[var2] >> var3) & var5;
	}

	public static Object method229(final byte[] var0, final boolean var1) {
		if (null == var0)
			return null;
		else {
			if ((var0.length > 136) && !Class47.aBool404)
				try {
					final Class47_Sub1 var2 = new Class47_Sub1();
					var2.method209(var0, -1517450569);
					return var2;
				} catch (final Throwable var3) {
					Class47.aBool404 = true;
				}

			return var0;
		}
	}
}
