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

	static final byte[] decodeCompression(final byte[] packedData) {
		final RSBuf buf = new RSBuf(packedData);
		final int compression = buf.readUByte();
		final int containerSize = buf.readLEInt();
		if ((containerSize >= 0) && ((Class61.maxSize == 0) || (containerSize <= Class61.maxSize))) {
			if (compression == 0) {
				final byte[] dataa = new byte[containerSize];
				buf.readBytes(dataa, 0, containerSize);
				return dataa;
			} else {
				final int decompressedSize = buf.readLEInt();

				if (decompressedSize > 1000000 || decompressedSize < 0) {
					System.out.printf("BAD compression %d size %d \n", compression, containerSize);
					return new byte[100];
				}
				
				if ((decompressedSize < 0) || ((Class61.maxSize != 0) && (decompressedSize > Class61.maxSize))) {
					//throw new RuntimeException();
					System.err.println("ERROR IN ARCHIVELOADING; RETURNING EMPTY ARRAY (size: "+decompressedSize+")");
					return new byte[] {}; // fail data, still some tho
				} else {
					final byte[] bytes = new byte[decompressedSize];
					if (compression == 1)
						Class45.bzipFill(bytes, decompressedSize, packedData, containerSize, 9);
					else
						Class61.inflation.unzip(buf, bytes);

					return bytes;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}
}
