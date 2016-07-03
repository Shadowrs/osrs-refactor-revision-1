import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Class13 implements Runnable {
	static int[][] anIntArrayArray87;
	byte[] aByteArray80;
	boolean aBool81 = false;
	int anInt84 = 0;
	boolean aBool77 = false;
	Class8 aClass8_82;
	int anInt85 = 0;
	Class11 aClass11_83;
	Socket aSocket79;
	InputStream anInputStream86;
	OutputStream anOutputStream78;

	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					int var3;
					int var4;
					synchronized (this) {
						if (anInt85 == anInt84) {
							if (aBool77)
								break label80;

							try {
								this.wait();
							} catch (final InterruptedException var10) {
								;
							}
						}

						var3 = anInt84;
						if (anInt85 >= anInt84)
							var4 = anInt85 - anInt84;
						else
							var4 = 5000 - anInt84;
					}

					if (var4 <= 0)
						continue;

					try {
						anOutputStream78.write(aByteArray80, var3, var4);
					} catch (final IOException var9) {
						aBool81 = true;
					}

					anInt84 = (anInt84 + var4) % 5000;

					try {
						if (anInt85 == anInt84)
							anOutputStream78.flush();
					} catch (final IOException var8) {
						aBool81 = true;
					}
					continue;
				}

				try {
					if (anInputStream86 != null)
						anInputStream86.close();

					if (null != anOutputStream78)
						anOutputStream78.close();

					if (null != aSocket79)
						aSocket79.close();
				} catch (final IOException var7) {
					;
				}

				aByteArray80 = null;
				break;
			}
		} catch (final Exception var12) {
			Class104_Sub9.method520((String) null, var12);
		}

	}

	public void method51(final byte[] var1, int var2, int var3) throws IOException {
		if (!aBool77)
			while (var3 > 0) {
				final int var4 = anInputStream86.read(var1, var2, var3);
				if (var4 <= 0)
					throw new EOFException();

				var2 += var4;
				var3 -= var4;
			}
	}

	public void method52() {
		if (!aBool77) {
			synchronized (this) {
				aBool77 = true;
				notifyAll();
			}

			if (null != aClass8_82) {
				while (aClass8_82.anInt46 == 0)
					Class69.method323(1L);

				if (aClass8_82.anInt46 == 1)
					try {
						((Thread) aClass8_82.anObject50).join();
					} catch (final InterruptedException var3) {
						;
					}
			}

			aClass8_82 = null;
		}
	}

	public int method53() throws IOException {
		return aBool77 ? 0 : anInputStream86.available();
	}

	public void method54(final byte[] var1, final int var2, final int var3) throws IOException {
		if (!aBool77)
			if (aBool81) {
				aBool81 = false;
				throw new IOException();
			} else {
				if (null == aByteArray80)
					aByteArray80 = new byte[5000];

				synchronized (this) {
					for (int var5 = 0; var5 < var3; ++var5) {
						aByteArray80[anInt85] = var1[var5 + var2];
						anInt85 = (anInt85 + 1) % 5000;
						if (((4900 + anInt84) % 5000) == anInt85)
							throw new IOException();
					}

					if (aClass8_82 == null)
						aClass8_82 = aClass11_83.method43(this, 3);

					notifyAll();
				}
			}
	}

	public Class13(final Socket var1, final Class11 var2) throws IOException {
		aClass11_83 = var2;
		aSocket79 = var1;
		aSocket79.setSoTimeout(30000);
		aSocket79.setTcpNoDelay(true);
		anInputStream86 = aSocket79.getInputStream();
		anOutputStream78 = aSocket79.getOutputStream();
	}

	@Override
	public void finalize() {
		method52();
	}

	public int method55() throws IOException {
		return aBool77 ? 0 : anInputStream86.read();
	}

	static final void method56(final Class104_Sub9 var0, final boolean var1) {
		final int var2 = var0.anInt957;
		final int var3 = (int) var0.aLong824;
		var0.method470();
		if (var1 && (var2 != -1) && Class103.aBoolArray817[var2]) {
			Class104_Sub12.aClass61_1001.method276(var2, -130954046);
			if (null != Class22.aClass104_Sub12ArrayArray228[var2]) {
				boolean var4 = true;

				for (int var5 = 0; var5 < Class22.aClass104_Sub12ArrayArray228[var2].length; ++var5)
					if (Class22.aClass104_Sub12ArrayArray228[var2][var5] != null)
						if (Class22.aClass104_Sub12ArrayArray228[var2][var5].anInt980 != 2)
							Class22.aClass104_Sub12ArrayArray228[var2][var5] = null;
						else
							var4 = false;

				if (var4)
					Class22.aClass104_Sub12ArrayArray228[var2] = null;

				Class103.aBoolArray817[var2] = false;
			}
		}

		Class90.method408(var2);
		final Class104_Sub12 var6 = Class47.method210(var3);
		if (null != var6)
			Class79.method348(var6);

		client.aBool1930 = false;
		client.anInt1805 = 0;
		Class44.method192(Class50.anInt422, Class36.anInt349, Class12.anInt74, Class78.anInt627);
		if (client.anInt1947 != -1)
			Class9.method36(client.anInt1947, 1);

	}
}
