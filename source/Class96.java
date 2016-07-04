import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;

public class Class96 {
	static Class57[] aClass57Array758;
	static Class104_Sub18_Sub17_Sub3 aClass104_Sub18_Sub17_Sub3_759;
	static Class30 aClass30_760;
	static int anInt761;
	int anInt747;
	long aLong750;
	long aLong749 = -1L;
	long aLong754;
	long aLong755;
	long aLong756 = -1L;
	int anInt753 = 0;
	Class94 aClass94_748;
	long aLong757;
	byte[] aByteArray752;
	byte[] aByteArray751;

	void method427() throws IOException {
		anInt747 = 0;
		if (aLong754 != aLong750) {
			aClass94_748.method416(aLong754);
			aLong750 = aLong754;
		}

		int var1;
		for (aLong749 = aLong754; anInt747 < aByteArray752.length; anInt747 += var1) {
			var1 = aClass94_748.method420(aByteArray752, anInt747, aByteArray752.length - anInt747);
			if (var1 == -1)
				break;

			aLong750 += var1;
		}

	}

	public void method428(final long var1) throws IOException {
		if (var1 < 0L)
			throw new IOException("");
		else
			aLong754 = var1;
	}

	public long method429() {
		return aLong757;
	}

	public void method430(final byte[] var1) throws IOException {
		method431(var1, 0, var1.length);
	}

	public void method431(final byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((var3 + var2) > var1.length)
				throw new ArrayIndexOutOfBoundsException((var2 + var3) - var1.length);

			if ((-1L != aLong756) && (aLong754 >= aLong756)
					&& ((aLong754 + var3) <= (aLong756 + anInt753 * 1663746677))) {
				System.arraycopy(aByteArray751, (int) (aLong754 - aLong756), var1, var2, var3);
				aLong754 += var3;
				return;
			}

			final long var4 = aLong754;
			final int var7 = var3;
			int var8;
			if ((aLong754 >= aLong749) && (aLong754 < (aLong749 + anInt747))) {
				var8 = (int) (anInt747 - (aLong754 - aLong749));
				if (var8 > var3)
					var8 = var3;

				System.arraycopy(aByteArray752, (int) (aLong754 - aLong749), var1, var2, var8);
				aLong754 += var8;
				var2 += var8;
				var3 -= var8;
			}

			if (var3 > aByteArray752.length) {
				aClass94_748.method416(aLong754);

				for (aLong750 = aLong754; var3 > 0; var3 -= var8) {
					var8 = aClass94_748.method420(var1, var2, var3);
					if (var8 == -1)
						break;

					aLong750 += var8;
					aLong754 += var8;
					var2 += var8;
				}
			} else if (var3 > 0) {
				method427();
				var8 = var3;
				if (var3 > anInt747)
					var8 = anInt747;

				System.arraycopy(aByteArray752, 0, var1, var2, var8);
				var2 += var8;
				var3 -= var8;
				aLong754 += var8;
			}

			if (-1L != aLong756) {
				if ((aLong756 > aLong754) && (var3 > 0)) {
					var8 = var2 + (int) (aLong756 - aLong754);
					if (var8 > (var3 + var2))
						var8 = var3 + var2;

					while (var2 < var8) {
						var1[var2++] = 0;
						--var3;
						++aLong754;
					}
				}

				long var9 = -1L;
				long var11 = -1L;
				if ((aLong756 >= var4) && (aLong756 < (var7 + var4)))
					var9 = aLong756;
				else if ((var4 >= aLong756) && (var4 < (aLong756 + anInt753 * 1663746677)))
					var9 = var4;

				if (((aLong756 + anInt753 * 1663746677) > var4)
						&& ((anInt753 * 1663746677 + aLong756) <= (var4 + var7)))
					var11 = aLong756 + anInt753 * 1663746677;
				else if (((var7 + var4) > aLong756) && ((var4 + var7) <= (anInt753 * 1663746677 + aLong756)))
					var11 = var7 + var4;

				if ((var9 > -1L) && (var11 > var9)) {
					final int var13 = (int) (var11 - var9);
					System.arraycopy(aByteArray751, (int) (var9 - aLong756), var1, var2 + (int) (var9 - var4), var13);
					if (var11 > aLong754) {
						var3 = (int) (var3 - (var11 - aLong754));
						aLong754 = var11;
					}
				}
			}
		} catch (final IOException var15) {
			aLong750 = -1L;
			throw var15;
		}

		if (var3 > 0)
			throw new EOFException();
	}

	public void method432(final int var1) throws IOException {
		method433();
		aClass94_748.method418();
	}

	void method433() throws IOException {
		if (-1L != aLong756) {
			if (aLong756 != aLong750) {
				aClass94_748.method416(aLong756);
				aLong750 = aLong756;
			}

			aClass94_748.method417(aByteArray751, 0, anInt753 * 1663746677);
			aLong750 += 1663746677L * anInt753;
			if (aLong750 > aLong755)
				aLong755 = aLong750;

			long var1 = -1L;
			long var3 = -1L;
			if ((aLong756 >= aLong749) && (aLong756 < (aLong749 + anInt747)))
				var1 = aLong756;
			else if ((aLong749 >= aLong756) && (aLong749 < (aLong756 + anInt753 * 1663746677)))
				var1 = aLong749;

			if (((aLong756 + anInt753 * 1663746677) > aLong749)
					&& ((aLong756 + anInt753 * 1663746677) <= (anInt747 + aLong749)))
				var3 = anInt753 * 1663746677 + aLong756;
			else if (((aLong749 + anInt747) > aLong756)
					&& ((aLong749 + anInt747) <= (aLong756 + anInt753 * 1663746677)))
				var3 = anInt747 + aLong749;

			if ((var1 > -1L) && (var3 > var1)) {
				final int var5 = (int) (var3 - var1);
				System.arraycopy(aByteArray751, (int) (var1 - aLong756), aByteArray752, (int) (var1 - aLong749), var5);
			}

			aLong756 = -1L;
			anInt753 = 0;
		}

	}

	public Class96(final Class94 var1, final int var2, final int var3) throws IOException {
		aClass94_748 = var1;
		aLong757 = aLong755 = var1.method419();
		aByteArray752 = new byte[var2];
		aByteArray751 = new byte[var3];
		aLong754 = 0L;
	}

	public void method434(final byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((var3 + aLong754) > aLong757)
				aLong757 = aLong754 + var3;

			if ((aLong756 != -1L) && ((aLong754 < aLong756) || (aLong754 > (anInt753 * 1663746677 + aLong756))))
				method433();

			if ((-1L != aLong756) && ((aLong754 + var3) > (aLong756 + aByteArray751.length))) {
				final int var4 = (int) (aByteArray751.length - (aLong754 - aLong756));
				System.arraycopy(var1, var2, aByteArray751, (int) (aLong754 - aLong756), var4);
				aLong754 += var4;
				var2 += var4;
				var3 -= var4;
				anInt753 = aByteArray751.length * 1278705117;
				method433();
			}

			if (var3 <= aByteArray751.length) {
				if (var3 > 0) {
					if (aLong756 == -1L)
						aLong756 = aLong754;

					System.arraycopy(var1, var2, aByteArray751, (int) (aLong754 - aLong756), var3);
					aLong754 += var3;
					if ((aLong754 - aLong756) > anInt753 * 1663746677)
						anInt753 = (int) (aLong754 - aLong756) * 1278705117;

				}
			} else {
				if (aLong754 != aLong750) {
					aClass94_748.method416(aLong754);
					aLong750 = aLong754;
				}

				aClass94_748.method417(var1, var2, var3);
				aLong750 += var3;
				if (aLong750 > aLong755)
					aLong755 = aLong750;

				long var5 = -1L;
				long var7 = -1L;
				if ((aLong754 >= aLong749) && (aLong754 < (aLong749 + anInt747)))
					var5 = aLong754;
				else if ((aLong749 >= aLong754) && (aLong749 < (aLong754 + var3)))
					var5 = aLong749;

				if (((aLong754 + var3) > aLong749) && ((aLong754 + var3) <= (anInt747 + aLong749)))
					var7 = aLong754 + var3;
				else if (((anInt747 + aLong749) > aLong754) && ((aLong749 + anInt747) <= (var3 + aLong754)))
					var7 = aLong749 + anInt747;

				if ((var5 > -1L) && (var7 > var5)) {
					final int var9 = (int) (var7 - var5);
					System.arraycopy(var1, (int) ((var2 + var5) - aLong754), aByteArray752, (int) (var5 - aLong749),
							var9);
				}

				aLong754 += var3;
			}
		} catch (final IOException var11) {
			aLong750 = -1L;
			throw var11;
		}
	}

	static int method435(final int var0, final int var1) {
		final long var2 = (var0 << 16) + var1;
		return (null != Class48.aClass104_Sub18_Sub13_410) && (Class48.aClass104_Sub18_Sub13_410.aLong824 == var2)
				? ((Class87.aClass104_Sub21_691.pos * 99) / (Class87.aClass104_Sub21_691.backing.length
						- Class48.aClass104_Sub18_Sub13_410.aByte1459)) + 1
				: 0;
	}

	static int method436(final int var0) {
		return 6;
	}

	public static void method437(final Component var0) {
		var0.addMouseListener(Class14.aClass14_94);
		var0.addMouseMotionListener(Class14.aClass14_94);
		var0.addFocusListener(Class14.aClass14_94);
	}
}
