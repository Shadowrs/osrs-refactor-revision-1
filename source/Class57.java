import java.awt.Canvas;

public class Class57 {
	String aString459;
	int anInt460;
	int anInt461;
	int anInt462;
	int anInt463;
	boolean aBool464;
	public static short[] aShortArray465;
	static String aString466;
	static Class13 aClass13_467;
	public static Canvas aCanvas468;

	static final byte[] method240(final byte[] data) {
		final RSBuf buf = new RSBuf(data);
		final int opcode = buf.readUByte();
		final int size = buf.readLEInt();
		if ((size >= 0) && ((Class61.anInt490 == 0) || (size <= Class61.anInt490))) {
			if (opcode == 0) {
				final byte[] dataa = new byte[size];
				buf.readBytes(dataa, 0, size);
				return dataa;
			} else {
				final int count = buf.readLEInt();

				// Xtea crashpatch
				if (count > 1000000) {
					System.err.println("XTEA crash intercepted; returning null bytes (count: "+count+")");
					return new byte[100];
				}
				
				if ((count < 0) || ((Class61.anInt490 != 0) && (count > Class61.anInt490))) {
					//throw new RuntimeException();
					System.err.println("ERROR IN ARCHIVELOADING; RETURNING EMPTY ARRAY (count: "+count+")");
					return new byte[100];
				} else {
					final byte[] bytes = new byte[count];
					if (opcode == 1)
						Class45.method195(bytes, count, data, size, 9);
					else
						Class61.inflation.copyTo(buf, bytes);

					return bytes;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}
}
