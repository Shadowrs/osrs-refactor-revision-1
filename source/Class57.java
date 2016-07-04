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
		final int uncompressedLength = buf.readLEInt();
		if ((uncompressedLength >= 0) && ((Class61.maxSize == 0) || (uncompressedLength <= Class61.maxSize))) {
			if (compression == 0) {
				final byte[] dataa = new byte[uncompressedLength];
				buf.readBytes(dataa, 0, uncompressedLength);
				return dataa;
			} else {
				final int decompressedLength = buf.readLEInt();

				if (decompressedLength > 1000000 || decompressedLength < 0) {
					System.out.printf("BAD compression %d size %d \n", compression, uncompressedLength);
					return new byte[100];
				}
				
				if ((decompressedLength < 0) || ((Class61.maxSize != 0) && (decompressedLength > Class61.maxSize))) {
					//throw new RuntimeException();
					System.err.println("ERROR IN ARCHIVELOADING; RETURNING EMPTY ARRAY (size: "+decompressedLength+")");
					return new byte[] {}; // fail data, still some tho
				} else {
					final byte[] bytes = new byte[decompressedLength];
					if (compression == 1)
						Class45.bzipFill(bytes, decompressedLength, packedData, uncompressedLength, 9);
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
