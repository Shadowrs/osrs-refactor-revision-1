import java.awt.Component;

public class Class99 {
	static boolean aBool773;
	static int anInt775;
	public static int anInt777;
	int anInt782;
	static int anInt793;
	static Class104_Sub18_Sub17_Sub3[] aClass104_Sub18_Sub17_Sub3Array794;
	int anInt790 = 32;
	long aLong780 = Class71.method332();
	long aLong784 = 0L;
	int anInt785 = 0;
	int anInt789 = 0;
	int anInt787 = 0;
	long aLong786 = 0L;
	boolean aBool788 = true;
	int anInt791 = 0;
	Class104_Sub8[] aClass104_Sub8Array776 = new Class104_Sub8[8];
	Class104_Sub8[] aClass104_Sub8Array792 = new Class104_Sub8[8];
	int anInt781;
	int anInt783;
	Class104_Sub8 aClass104_Sub8_778;
	int[] anIntArray779;
	static Class64 aClass64_774;

	public final void method447() {
		aBool788 = true;
	}

	public final synchronized void method448() {
		aBool788 = true;

		try {
			method456();
		} catch (final Exception var2) {
			method455();
			aLong784 = Class71.method332() + 2000L;
		}

	}

	void method449(final Component var1) throws Exception {
	}

	final void method450(final int var1) {
		anInt791 -= var1;
		if (anInt791 < 0)
			anInt791 = 0;

		if (null != aClass104_Sub8_778)
			aClass104_Sub8_778.method516(var1);

	}

	final void method451(final Class104_Sub8 var1, final int var2) {
		final int var3 = var2 >> 5;
		final Class104_Sub8 var4 = aClass104_Sub8Array792[var3];
		if (var4 == null)
			aClass104_Sub8Array776[var3] = var1;
		else
			var4.aClass104_Sub8_954 = var1;

		aClass104_Sub8Array792[var3] = var1;
		var1.anInt955 = var2;
	}

	void method452(final int var1) throws Exception {
	}

	int method453() throws Exception {
		return anInt781;
	}

	void method454() throws Exception {
	}

	void method455() {
	}

	void method456() throws Exception {
	}

	public final synchronized void method457() {
		if (null != anIntArray779) {
			long var1 = Class71.method332();

			try {
				if (0L != aLong784) {
					if (var1 < aLong784)
						return;

					method452(anInt781);
					aLong784 = 0L;
					aBool788 = true;
				}

				int var3 = method453();
				if ((anInt787 - var3) > anInt785)
					anInt785 = anInt787 - var3;

				int var4 = anInt782 + anInt783;
				if ((256 + var4) > 16384)
					var4 = 16128;

				if ((256 + var4) > anInt781) {
					anInt781 += 1024;
					if (anInt781 > 16384)
						anInt781 = 16384;

					method455();
					method452(anInt781);
					var3 = 0;
					aBool788 = true;
					if ((256 + var4) > anInt781) {
						var4 = anInt781 - 256;
						anInt783 = var4 - anInt782;
					}
				}

				while (var3 < var4) {
					method460(anIntArray779, 256);
					method454();
					var3 += 256;
				}

				if (var1 > aLong786) {
					if (!aBool788) {
						if ((anInt785 == 0) && (anInt789 == 0)) {
							method455();
							aLong784 = var1 + 2000L;
							return;
						}

						anInt783 = Math.min(anInt789, anInt785);
						anInt789 = anInt785;
					} else
						aBool788 = false;

					anInt785 = 0;
					aLong786 = var1 + 2000L;
				}

				anInt787 = var3;
			} catch (final Exception var7) {
				method455();
				aLong784 = var1 + 2000L;
			}

			try {
				if (var1 > (aLong780 + 500000L))
					var1 = aLong780;

				while (var1 > (aLong780 + 5000L)) {
					method450(256);
					aLong780 += 256000 / anInt777;
				}
			} catch (final Exception var6) {
				aLong780 = var1;
			}

		}
	}

	public final synchronized void method458(final Class104_Sub8 var1) {
		aClass104_Sub8_778 = var1;
	}

	public final synchronized void method459() {
		if (aClass64_774 != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == aClass64_774.aClass99Array512[var2])
					aClass64_774.aClass99Array512[var2] = null;

				if (null != aClass64_774.aClass99Array512[var2])
					var1 = false;
			}

			if (var1) {
				aClass64_774.aBool511 = true;

				while (aClass64_774.aBool510)
					Class69.method323(50L);

				aClass64_774 = null;
			}
		}

		method455();
		anIntArray779 = null;
	}

	final void method460(final int[] var1, final int var2) {
		int var3 = var2;
		if (aBool773)
			var3 = var2 << 1;

		Class35.method167(var1, 0, var3);
		anInt791 -= var2;
		if ((aClass104_Sub8_778 != null) && (anInt791 <= 0)) {
			anInt791 += anInt777 >> 4;
			Class47.method212(aClass104_Sub8_778);
			method451(aClass104_Sub8_778, aClass104_Sub8_778.method511());
			int var4 = 0;
			int var5 = 255;

			int var6;
			Class104_Sub8 var10;
			label103: for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = (var5 >>> var7) & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						Class104_Sub8 var11 = aClass104_Sub8Array776[var7];

						label97: while (true)
							while (true) {
								if (var11 == null)
									break label97;

								final Class104_Sub4 var12 = var11.aClass104_Sub4_953;
								if ((null != var12) && (var12.anInt880 > var8)) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.aClass104_Sub8_954;
								} else {
									var11.aBool952 = true;
									final int var13 = var11.method514();
									var4 += var13;
									if (null != var12)
										var12.anInt880 += var13;

									if (var4 >= anInt790)
										break label103;

									Class104_Sub8 var14 = var11.method512();
									if (null != var14)
										for (final int var15 = var11.anInt955; null != var14; var14 = var11.method513())
											method451(var14, (var15 * var14.method511()) >> 8);

									final Class104_Sub8 var16 = var11.aClass104_Sub8_954;
									var11.aClass104_Sub8_954 = null;
									if (null == var10)
										aClass104_Sub8Array776[var7] = var16;
									else
										var10.aClass104_Sub8_954 = var16;

									if (var16 == null)
										aClass104_Sub8Array792[var7] = var10;

									var11 = var16;
								}
							}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				Class104_Sub8 var17 = aClass104_Sub8Array776[var6];
				final Class104_Sub8[] var18 = aClass104_Sub8Array776;
				aClass104_Sub8Array792[var6] = null;

				for (var18[var6] = null; null != var17; var17 = var10) {
					var10 = var17.aClass104_Sub8_954;
					var17.aClass104_Sub8_954 = null;
				}
			}
		}

		if (anInt791 < 0)
			anInt791 = 0;

		if (null != aClass104_Sub8_778)
			aClass104_Sub8_778.method515(var1, 0, var2);

		aLong780 = Class71.method332();
	}

	public static Class104_Sub18_Sub17_Sub2_Sub1 method461(final byte[] var0) {
		if (var0 == null)
			return null;
		else {
			final Class104_Sub18_Sub17_Sub2_Sub1 var1 = new Class104_Sub18_Sub17_Sub2_Sub1(var0, Class12.anIntArray70,
					Class12.anIntArray71, Class78.anIntArray626, Class69.anIntArray564, Class12.anIntArray68,
					Class41.aByteArrayArray368);
			Class12.anIntArray70 = null;
			Class12.anIntArray71 = null;
			Class78.anIntArray626 = null;
			Class69.anIntArray564 = null;
			Class12.anIntArray68 = null;
			Class41.aByteArrayArray368 = null;
			return var1;
		}
	}

	static char method462(final char var0) {
		return (var0 != 181) && (var0 != 402) ? Character.toTitleCase(var0) : var0;
	}
}
