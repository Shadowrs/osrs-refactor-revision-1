import java.util.zip.CRC32;

public class Class61_Sub1 extends Class61 {
	static int anInt892;
	volatile boolean aBool885 = false;
	volatile boolean[] aBoolArray882;
	int anInt891 = -1;
	static CRC32 aCRC32_889 = new CRC32();
	int crc;
	int anInt887;
	boolean aBool886 = false;
	Class16 aClass16_888;
	Class16 aClass16_883;
	int anInt884;

	@Override
	void method258(final int var1, final byte var2) {
		Class2.method22(anInt884, var1);
	}

	void method487(final int var1, final byte[] var2, final boolean var3, final boolean var4) {
		if (var3) {
			if (aBool885)
				throw new RuntimeException();

			if (aClass16_883 != null) {
				final int var5 = anInt884;
				final Class16 var6 = aClass16_883;
				final Class104_Sub13 var7 = new Class104_Sub13();
				var7.anInt1097 = 0;
				var7.nodeId = var5;
				var7.aByteArray1096 = var2;
				var7.aClass16_1095 = var6;
				final Class59 var8 = Class52.aClass59_429;
				synchronized (var8) {
					Class52.aClass59_429.method248(var7);
				}

				final Object var21 = Class52.anObject428;
				synchronized (var21) {
					if (Class52.anInt426 == 0)
						Applet_Sub1.aClass11_1760.method43(new Class52(), 5);

					Class52.anInt426 = 600;
				}
			}

			method257(var2);
			method489();
		} else {
			var2[var2.length - 2] = (byte) (anIntArray493[var1] >> 8);
			var2[var2.length - 1] = (byte) anIntArray493[var1];
			if (null != aClass16_888) {
				final Class16 var11 = aClass16_888;
				final Class104_Sub13 var18 = new Class104_Sub13();
				var18.anInt1097 = 0;
				var18.nodeId = var1;
				var18.aByteArray1096 = var2;
				var18.aClass16_1095 = var11;
				final Class59 var19 = Class52.aClass59_429;
				synchronized (var19) {
					Class52.aClass59_429.method248(var18);
				}

				final Object var20 = Class52.anObject428;
				synchronized (var20) {
					if (Class52.anInt426 == 0)
						Applet_Sub1.aClass11_1760.method43(new Class52(), 5);

					Class52.anInt426 = 600;
				}

				aBoolArray882[var1] = true;
			}

			if (var4)
				anObjectArray492[var1] = Class52.method229(var2, false);
		}

	}

	public void method488(final Class16 var1, final int var2, final byte[] data, final boolean var4) {
		int ucrc;
		if (var1 == aClass16_883) {
			if (aBool885)
				throw new RuntimeException();
			else if (null == data)
				Class49.method222(this, 255, anInt884, crc, (byte) 0, true);
			else {
				aCRC32_889.reset();
				aCRC32_889.update(data, 0, data.length);
				ucrc = (int) aCRC32_889.getValue();
				final RSBuf buf = new RSBuf(Class57.decodeCompression(data));
				final int opcode = buf.readUByte();
				if ((opcode != 5) && (opcode != 6))
					throw new RuntimeException("");
				else {
					int var8 = 0;
					if (opcode >= 6)
						var8 = buf.readLEInt();

					if ((crc != ucrc) || (anInt887 != var8))
						Class49.method222(this, 255, anInt884, crc, (byte) 0, true);
					else {
						method257(data);
						method489();
					}
				}
			}
		} else {
			if (!var4 && (anInt891 == var2))
				aBool885 = true;

			if ((null != data) && (data.length > 2)) {
				aCRC32_889.reset();
				aCRC32_889.update(data, 0, data.length - 2);
				ucrc = (int) aCRC32_889.getValue();
				final int var9 = ((data[data.length - 2] & 255) << 8) + (data[data.length - 1] & 255);
				if ((ucrc == anIntArray483[var2]) && (var9 == anIntArray493[var2])) {
					aBoolArray882[var2] = true;
					if (var4)
						anObjectArray492[var2] = Class52.method229(data, false);

				} else {
					aBoolArray882[var2] = false;
					if (aBool886 || var4)
						Class49.method222(this, anInt884, var2, anIntArray483[var2], (byte) 2, var4);

				}
			} else {
				aBoolArray882[var2] = false;
				if (aBool886 || var4)
					Class49.method222(this, anInt884, var2, anIntArray483[var2], (byte) 2, var4);

			}
		}
	}

	void method489() {
		aBoolArray882 = new boolean[anObjectArray492.length];

		int var1;
		for (var1 = 0; var1 < aBoolArray882.length; ++var1)
			aBoolArray882[var1] = false;

		if (aClass16_888 == null)
			aBool885 = true;
		else {
			anInt891 = -1;

			for (var1 = 0; var1 < aBoolArray882.length; ++var1)
				if (anIntArray485[var1] > 0) {
					final Class16 var2 = aClass16_888;
					final Class104_Sub13 var4 = new Class104_Sub13();
					var4.anInt1097 = 1;
					var4.nodeId = var1;
					var4.aClass16_1095 = var2;
					var4.aClass61_Sub1_1098 = this;
					final Class59 var5 = Class52.aClass59_429;
					synchronized (var5) {
						Class52.aClass59_429.method248(var4);
					}

					final Object var10 = Class52.anObject428;
					synchronized (var10) {
						if (Class52.anInt426 == 0)
							Applet_Sub1.aClass11_1760.method43(new Class52(), 5);

						Class52.anInt426 = 600;
					}

					anInt891 = var1;
				}

			if (anInt891 == -1)
				aBool885 = true;

		}
	}

	public int method490() {
		int var1 = 0;
		int var2 = 0;

		int var3;
		for (var3 = 0; var3 < anObjectArray492.length; ++var3)
			if (anIntArray485[var3] > 0) {
				var1 += 100;
				var2 += method491(var3);
			}

		if (var1 == 0)
			return 100;
		else {
			var3 = (var2 * 100) / var1;
			return var3;
		}
	}

	@Override
	void submitArchiveRequest(final int var1, final byte var2) {
		if ((aClass16_888 != null) && (aBoolArray882 != null) && aBoolArray882[var1])
			Class87.method397(var1, aClass16_888, this);
		else
			Class49.method222(this, anInt884, var1, anIntArray483[var1], (byte) 2, true);

	}

	int method491(final int var1) {
		return null != anObjectArray492[var1] ? 100 : (aBoolArray882[var1] ? 100 : Class96.method435(anInt884, var1));
	}

	void method492(final int var1, final int var2) {
		crc = var1;
		anInt887 = var2;
		if (aClass16_883 != null)
			Class87.method397(anInt884, aClass16_883, this);
		else
			Class49.method222(this, 255, anInt884, crc, (byte) 0, true);

	}

	public Class61_Sub1(final Class16 var1, final Class16 var2, final int var3, final boolean var4, final boolean var5,
			final boolean var6) {
		super(var4, var5);
		aClass16_888 = var1;
		aClass16_883 = var2;
		anInt884 = var3;
		aBool886 = var6;
		final int var8 = anInt884;
		if (null != Class2.aClass104_Sub21_7) {
			Class2.aClass104_Sub21_7.pos = (8 * var8) + 5;
			final int var9 = Class2.aClass104_Sub21_7.readLEInt();
			final int var10 = Class2.aClass104_Sub21_7.readLEInt();
			method492(var9, var10);
		} else {
			Class49.method222((Class61_Sub1) null, 255, 255, 0, (byte) 0, true);
			Class87.aClass61_Sub1Array695[var8] = this;
		}

	}

	public int method493() {
		if (aBool885)
			return 100;
		else if (null != anObjectArray492)
			return 99;
		else {
			int var1 = Class96.method435(255, anInt884);
			if (var1 >= 100)
				var1 = 99;

			return var1;
		}
	}

	static final void method494() {
		if (Class20.stream != null) {
			Class20.stream.destory();
			Class20.stream = null;
		}

		Class33.method158();
		Class81.aClass17_643.method69();

		for (int var0 = 0; var0 < 4; ++var0)
			client.aClass67Array1975[var0].method304();

		System.gc();
		Class29.anInt272 = 1;
		Class29.aClass61_273 = null;
		Class1.anInt1 = -1;
		Class29.anInt276 = -1;
		Class29.anInt275 = 0;
		Class104_Sub2.aBool859 = false;
		Class69.anInt565 = 2;
		client.anInt2023 = -1;
		client.aBool2041 = false;

		for (Class104_Sub1 var1 = (Class104_Sub1) Class104_Sub1.aClass59_849
				.method251(); var1 != null; var1 = (Class104_Sub1) Class104_Sub1.aClass59_849.method252()) {
			if (var1.aClass104_Sub8_Sub3_840 != null) {
				Class79.aClass104_Sub8_Sub2_630.method667(var1.aClass104_Sub8_Sub3_840);
				var1.aClass104_Sub8_Sub3_840 = null;
			}

			if (null != var1.aClass104_Sub8_Sub3_851) {
				Class79.aClass104_Sub8_Sub2_630.method667(var1.aClass104_Sub8_Sub3_851);
				var1.aClass104_Sub8_Sub3_851 = null;
			}
		}

		Class104_Sub1.aClass59_849.method247();
		Class10.method40(10);
	}
}
