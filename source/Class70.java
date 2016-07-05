import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

public class Class70 {
	static byte[][] landscapedata;
	static Sprite[] prayers;
	DataInputStream aDataInputStream568;
	int anInt567;
	int anInt570;
	byte[] aByteArray566;
	int anInt572;
	byte[] aByteArray573 = new byte[4];
	Class8 aClass8_569;
	long aLong571;

	byte[] method324() throws IOException {
		if (Class71.method332() > aLong571)
			throw new IOException();
		else {
			if (anInt567 == 0) {
				if (aClass8_569.anInt46 == 2)
					throw new IOException();

				if (aClass8_569.anInt46 == 1) {
					aDataInputStream568 = (DataInputStream) aClass8_569.anObject50;
					anInt567 = 1;
				}
			}

			int var1;
			if (anInt567 == 1) {
				var1 = aDataInputStream568.available();
				if (var1 > 0) {
					if ((var1 + anInt570) > 4)
						var1 = 4 - anInt570;

					anInt570 += aDataInputStream568.read(aByteArray573, anInt570, var1);
					if (anInt570 == 4) {
						final int var2 = (new RSBuf(aByteArray573)).readLEInt();
						aByteArray566 = new byte[var2];
						anInt567 = 2;
					}
				}
			}

			if (anInt567 == 2) {
				var1 = aDataInputStream568.available();
				if (var1 > 0) {
					if ((var1 + anInt572) > aByteArray566.length)
						var1 = aByteArray566.length - anInt572;

					anInt572 += aDataInputStream568.read(aByteArray566, anInt572, var1);
					if (anInt572 == aByteArray566.length)
						return aByteArray566;
				}
			}

			return null;
		}
	}

	Class70(final Class11 var1, final URL var2) {
		aClass8_569 = var1.method46(var2);
		anInt567 = 0;
		aLong571 = Class71.method332() + 30000L;
	}

	public static File method325(final String var0, final String var1, final int type) {
		final String var3 = type == 0 ? "" : "" + type;
		Class24.settings = new File(Class104_Sub23.homeDir, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String dir = null;
		String var5 = null;
		boolean var6 = false;
		RSBuf var8;
		int var12;
		File var27;
		if (Class24.settings.exists()) {
			try {
				final JagFS var7 = new JagFS(Class24.settings, "rw", 10000L);

				int var9;
				for (var8 = new RSBuf(
						(int) var7.length()); var8.pos < var8.backing.length; var8.pos += var9) {
					var9 = var7.read(var8.backing, var8.pos,
							var8.backing.length - var8.pos);
					if (var9 == -1)
						throw new IOException();
				}

				var8.pos = 0;
				var9 = var8.readUByte();
				if ((var9 < 1) || (var9 > 3))
					throw new IOException("" + var9);

				int var10 = 0;
				if (var9 > 1)
					var10 = var8.readUByte();

				if (var9 <= 2) {
					dir = var8.method616();
					if (var10 == 1)
						var5 = var8.method616();
				} else {
					dir = var8.readStr();
					if (var10 == 1)
						var5 = var8.readStr();
				}

				var7.close();
			} catch (final IOException var25) {
				var25.printStackTrace();
			}

			if (dir != null) {
				var27 = new File(dir);
				if (!var27.exists())
					dir = null;
			}

			if (dir != null) {
				var27 = new File(dir, "test.dat");

				boolean var28;
				try {
					final RandomAccessFile var11 = new RandomAccessFile(var27, "rw");
					var12 = var11.read();
					var11.seek(0L);
					var11.write(var12);
					var11.seek(0L);
					var11.close();
					var27.delete();
					var28 = true;
				} catch (final Exception var23) {
					var28 = false;
				}

				if (!var28)
					dir = null;
			}
		}

		if ((dir == null) && (type == 0))
			label125: for (int var13 = 0; var13 < Class7.store.length; ++var13)
				for (int var14 = 0; var14 < Class49.rootDirectory.length; ++var14) {
					final File var15 = new File(Class49.rootDirectory[var14] + Class7.store[var13] + File.separatorChar + var0 + File.separatorChar);
					if (var15.exists()) {
						final File test = new File(var15, "test.dat");

						boolean var30;
						try {
							final RandomAccessFile var17 = new RandomAccessFile(test, "rw");
							final int var18 = var17.read();
							var17.seek(0L);
							var17.write(var18);
							var17.seek(0L);
							var17.close();
							test.delete();
							var30 = true;
						} catch (final Exception var22) {
							var30 = false;
						}

						if (var30) {
							dir = var15.toString();
							var6 = true;
							break label125;
						}
					}
				}

		if (null == dir) {
			// jagexcache
			dir = Class104_Sub23.homeDir + File.separatorChar + "timelord" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		File var26;
		if (var5 != null) {
			var26 = new File(var5);
			var27 = new File(dir);

			try {
				final File[] var32 = var26.listFiles();
				final File[] var29 = var32;

				for (var12 = 0; var12 < var29.length; ++var12) {
					final File var34 = var29[var12];
					final File var19 = new File(var27, var34.getName());
					final boolean var20 = var34.renameTo(var19);
					if (!var20)
						throw new IOException();
				}
			} catch (final Exception var24) {
				var24.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			var26 = new File(dir);
			var8 = null;

			try {
				final JagFS var33 = new JagFS(Class24.settings, "rw", 10000L);
				final RSBuf var31 = new RSBuf(500);
				var31.writeByte(3);
				var31.writeByte(null != var8 ? 1 : 0);
				var31.writeSpecialString(var26.getPath());
				var33.method417(var31.backing, 0, var31.pos);
				var33.close();
			} catch (final IOException var21) {
				var21.printStackTrace();
			}
		}
		System.out.println("Dir at : "+dir);
		return new File(dir);
	}

	static String method326(final int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	public static Def forId(final int id) {
		Def var1 = (Def) Def.aClass56_1260.method236(id);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class106.aClass61_829.decompress(12, id);
			var1 = new Def();
			if (var2 != null)
				var1.method681(new RSBuf(var2));

			var1.method683();
			Def.aClass56_1260.method238(var1, id);
			return var1;
		}
	}

	public static void method328(final int var0) {
		if (Class29.anInt272 != 0)
			Class29.anInt275 = var0;
		else
			Class29.aClass104_Sub8_Sub1_271.method642(var0);

	}
}
