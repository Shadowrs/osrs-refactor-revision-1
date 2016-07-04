import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class JagFS {
	RandomAccessFile aRandomAccessFile745;
	long aLong744;
	long aLong743;

	public JagFS(final File f, final String var2, long var3) throws IOException {
		if (-1L == var3)
			var3 = Long.MAX_VALUE;

		if (f.length() >= var3)
			f.delete();

		aRandomAccessFile745 = new RandomAccessFile(f, var2);
		aLong744 = var3;
		aLong743 = 0L;
		final int var5 = aRandomAccessFile745.read();
		if ((var5 != -1) && !var2.equals("r")) {
			aRandomAccessFile745.seek(0L);
			aRandomAccessFile745.write(var5);
		}

		aRandomAccessFile745.seek(0L);
		System.out.println("JagFS at "+f.getAbsolutePath());
	}

	final void method416(final long var1) throws IOException {
		aRandomAccessFile745.seek(var1);
		aLong743 = var1;
	}

	public final void method417(final byte[] var1, final int var2, final int var3) throws IOException {
		if ((aLong743 + var3) > aLong744) {
			aRandomAccessFile745.seek(1L + aLong744);
			aRandomAccessFile745.write(1);
			throw new EOFException();
		} else {
			aRandomAccessFile745.write(var1, var2, var3);
			aLong743 += var3;
		}
	}

	public final void close() throws IOException {
		if (aRandomAccessFile745 != null) {
			aRandomAccessFile745.close();
			aRandomAccessFile745 = null;
		}

	}

	public final long length() throws IOException {
		return aRandomAccessFile745.length();
	}

	public final int read(final byte[] var1, final int var2, final int var3) throws IOException {
		final int var4 = aRandomAccessFile745.read(var1, var2, var3);
		if (var4 > 0)
			aLong743 += var4;

		return var4;
	}

	@Override
	public void finalize() throws Throwable {
		if (aRandomAccessFile745 != null) {
			System.out.println("");
			close();
		}

	}

	public static Class104_Sub18_Sub17_Sub3 method421(final Class61 var0, final int var1) {
		return !Class9.method39(var0, var1) ? null : Class15.method57();
	}

	public static void method422(final Class61 var0) {
		Class104_Sub18_Sub1.aClass61_1191 = var0;
	}

	static Class61_Sub1 method423(final int var0, final boolean var1, final boolean var2, final boolean var3) {
		Class16 var4 = null;
		if (null != Class24.maindata)
			var4 = new Class16(var0, Class24.maindata, Class22.managers[var0], 1000000);

		return new Class61_Sub1(var4, Class88.aClass16_701, var0, var1, var2, var3);
	}
}
