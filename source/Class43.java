import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Class43 {
	static Class13 aClass13_374;
	static int anInt375;

	public static void writeClasscheckPacket(final GameBuf buf, final int var1) {
		while (true) {
			final Class104_Sub16 var2 = (Class104_Sub16) Class105.aClass59_825.method251();
			if (null == var2)
				return;

			buf.putOpcode(var1);
			buf.writebyte(0);
			final int var3 = buf.pos;
			buf.writeInt(var2.anInt1128);

			for (int var4 = 0; var4 < var2.anInt1127; ++var4)
				if (var2.anIntArray1129[var4] != 0)
					buf.writebyte(var2.anIntArray1129[var4]);
				else
					try {
						final int var5 = var2.anIntArray1132[var4];
						Field var6;
						int var7;
						if (var5 == 0) {
							var6 = var2.aFieldArray1126[var4];
							var7 = var6.getInt((Object) null);
							buf.writebyte(0);
							buf.writeInt(var7);
						} else if (var5 == 1) {
							var6 = var2.aFieldArray1126[var4];
							var6.setInt((Object) null, var2.anIntArray1130[var4]);
							buf.writebyte(0);
						} else if (var5 == 2) {
							var6 = var2.aFieldArray1126[var4];
							var7 = var6.getModifiers();
							buf.writebyte(0);
							buf.writeInt(var7);
						}

						Method var26;
						if (var5 != 3) {
							if (var5 == 4) {
								var26 = var2.aMethodArray1133[var4];
								var7 = var26.getModifiers();
								buf.writebyte(0);
								buf.writeInt(var7);
							}
						} else {
							var26 = var2.aMethodArray1133[var4];
							final byte[][] var8 = var2.aByteArrayArrayArray1131[var4];
							final Object[] var9 = new Object[var8.length];

							for (int var10 = 0; var10 < var8.length; ++var10) {
								final ObjectInputStream var11 = new ObjectInputStream(
										new ByteArrayInputStream(var8[var10]));
								var9[var10] = var11.readObject();
							}

							final Object var12 = var26.invoke((Object) null, var9);
							if (var12 == null)
								buf.writebyte(0);
							else if (var12 instanceof Number) {
								buf.writebyte(1);
								buf.writeLong(((Number) var12).longValue());
							} else if (var12 instanceof String) {
								buf.writebyte(2);
								buf.writeString((String) var12);
							} else
								buf.writebyte(4);
						}
					} catch (final ClassNotFoundException var14) {
						buf.writebyte(-10);
					} catch (final InvalidClassException var15) {
						buf.writebyte(-11);
					} catch (final StreamCorruptedException var16) {
						buf.writebyte(-12);
					} catch (final OptionalDataException var17) {
						buf.writebyte(-13);
					} catch (final IllegalAccessException var18) {
						buf.writebyte(-14);
					} catch (final IllegalArgumentException var19) {
						buf.writebyte(-15);
					} catch (final InvocationTargetException var20) {
						buf.writebyte(-16);
					} catch (final SecurityException var21) {
						buf.writebyte(-17);
					} catch (final IOException var22) {
						buf.writebyte(-18);
					} catch (final NullPointerException var23) {
						buf.writebyte(-19);
					} catch (final Exception var24) {
						buf.writebyte(-20);
					} catch (final Throwable var25) {
						buf.writebyte(-21);
					}

			buf.method583(var3);
			buf.method613(buf.pos - var3);
			var2.method470();
		}
	}

	static final void method186(final Class104_Sub18_Sub17_Sub3 var0) {
		final short var1 = 256;

		int var2;
		for (var2 = 0; var2 < Class14.anIntArray92.length; ++var2)
			Class14.anIntArray92[var2] = 0;

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int) (Math.random() * 128.0D * var1);
			Class14.anIntArray92[var3] = (int) (Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < (var1 - 1); ++var3)
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					Class24.anIntArray244[var5] = (Class14.anIntArray92[var5 - 128] + Class14.anIntArray92[var5 - 1]
							+ Class14.anIntArray92[var5 + 1] + Class14.anIntArray92[128 + var5]) / 4;
				}

			final int[] var6 = Class14.anIntArray92;
			Class14.anIntArray92 = Class24.anIntArray244;
			Class24.anIntArray244 = var6;
		}

		if (null != var0) {
			var2 = 0;

			for (var3 = 0; var3 < var0.anInt1619; ++var3)
				for (var4 = 0; var4 < var0.anInt1618; ++var4)
					if (var0.aByteArray1616[var2++] != 0) {
						var5 = var0.anInt1620 + var4 + 16;
						final int var7 = var0.anInt1621 + 16 + var3;
						final int var8 = (var7 << 7) + var5;
						Class14.anIntArray92[var8] = 0;
					}
		}

	}

	static final boolean method187(final int var0) {
		if (var0 < 0)
			return false;
		else {
			int var1 = client.anIntArray1933[var0];
			if (var1 >= 2000)
				var1 -= 2000;

			return var1 == 1007;
		}
	}

	static final void method188(final int var0, final String var1, final String var2, final String var3) {
		for (int var4 = 99; var4 > 0; --var4) {
			client.anIntArray1998[var4] = client.anIntArray1998[var4 - 1];
			client.aStringArray1912[var4] = client.aStringArray1912[var4 - 1];
			client.aStringArray2001[var4] = client.aStringArray2001[var4 - 1];
			client.aStringArray2025[var4] = client.aStringArray2025[var4 - 1];
		}

		client.anIntArray1998[0] = var0;
		client.aStringArray1912[0] = var1;
		client.aStringArray2001[0] = var2;
		client.aStringArray2025[0] = var3;
		++client.anInt2000;
		client.anInt1977 = client.anInt1978;
	}
}
