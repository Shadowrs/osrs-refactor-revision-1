import java.awt.event.ActionEvent;

public class Class64 implements Runnable {
	Class11 aClass11_509;
	public static String aString513;
	volatile Class99[] aClass99Array512 = new Class99[2];
	volatile boolean aBool511 = false;
	volatile boolean aBool510 = false;

	@Override
	public void run() {
		aBool510 = true;

		try {
			try {
				while (!aBool511) {
					Class99 var2;
					for (int var1 = 0; var1 < 2; ++var1) {
						var2 = aClass99Array512[var1];
						if (var2 != null)
							var2.method457();
					}

					Class69.method323(10L);
					final Class11 var3 = aClass11_509;
					var2 = null;
					if (var3.anEventQueue65 != null) {
						for (int var4 = 0; (var4 < 50) && (var3.anEventQueue65.peekEvent() != null); ++var4)
							Class69.method323(1L);

						if (var2 != null)
							var3.anEventQueue65.postEvent(new ActionEvent(var2, 1001, "dummy"));
					}
				}
			} catch (final Exception var8) {
				Nodee.report((String) null, var8);
				aBool510 = false;
				return;
			}

			aBool510 = false;
		} finally {
			aBool510 = false;
		}
	}

	static final void method295(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6) {
		if ((var2 >= 1) && (var3 >= 1) && (var2 <= 102) && (var3 <= 102)) {
			if (client.lowmvm && (var0 != Class12.anInt73))
				return;

			int var7 = 0;
			if (var1 == 0)
				var7 = Class81.aClass17_643.method85(var0, var2, var3);

			if (var1 == 1)
				var7 = Class81.aClass17_643.method86(var0, var2, var3);

			if (var1 == 2)
				var7 = Class81.aClass17_643.method87(var0, var2, var3);

			if (var1 == 3)
				var7 = Class81.aClass17_643.method88(var0, var2, var3);

			int var11;
			if (var7 != 0) {
				var11 = Class81.aClass17_643.method89(var0, var2, var3, var7);
				final int var13 = (var7 >> 14) & 32767;
				final int var14 = var11 & 31;
				final int var15 = (var11 >> 6) & 3;
				ObjectDefinition var12;
				if (var1 == 0) {
					Class81.aClass17_643.method79(var0, var2, var3);
					var12 = Class104_Sub18_Sub12.forId(var13);
					if (var12.anInt1363 != 0)
						client.aClass67Array1975[var0].method309(var2, var3, var14, var15, var12.aBool1340);
				}

				if (var1 == 1)
					Class81.aClass17_643.method80(var0, var2, var3);

				if (var1 == 2) {
					Class81.aClass17_643.method81(var0, var2, var3);
					var12 = Class104_Sub18_Sub12.forId(var13);
					if (((var2 + var12.anInt1365) > 103) || ((var12.anInt1365 + var3) > 103)
							|| ((var2 + var12.anInt1339) > 103) || ((var3 + var12.anInt1339) > 103))
						return;

					if (var12.anInt1363 != 0)
						client.aClass67Array1975[var0].method315(var2, var3, var12.anInt1365, var12.anInt1339, var15,
								var12.aBool1340);
				}

				if (var1 == 3) {
					Class81.aClass17_643.method82(var0, var2, var3);
					var12 = Class104_Sub18_Sub12.forId(var13);
					if (var12.anInt1363 == 1)
						client.aClass67Array1975[var0].method310(var2, var3);
				}
			}

			if (var4 >= 0) {
				var11 = var0;
				if ((var0 < 3) && ((Class76.aByteArrayArrayArray600[1][var2][var3] & 2) == 2))
					var11 = var0 + 1;

				Class28.method139(var0, var11, var2, var3, var4, var5, var6, Class81.aClass17_643,
						client.aClass67Array1975[var0]);
			}
		}

	}

	public static Class104_Sub18_Sub2 method296(final int var0) {
		Class104_Sub18_Sub2 var1 = (Class104_Sub18_Sub2) Class104_Sub18_Sub2.aClass56_1231.method236(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class104_Sub18_Sub2.aClass61_1238.decompress(9, var0);
			var1 = new Class104_Sub18_Sub2();
			var1.anInt1228 = var0;
			if (null != var2)
				var1.method674(new RSBuf(var2));

			var1.method673();
			Class104_Sub18_Sub2.aClass56_1231.method238(var1, var0);
			return var1;
		}
	}
}
