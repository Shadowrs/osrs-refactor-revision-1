import java.util.zip.Inflater;

public class GZIPDecompressor {
	Inflater anInflater289;

	GZIPDecompressor(final int var1, final int var2, final int var3) {
	}

	public void unzip(final RSBuf buf, final byte[] bytes) {
		if ((buf.backing[buf.pos] == 31) && (buf.backing[1 + buf.pos] == -117)) {
			if (null == anInflater289)
				anInflater289 = new Inflater(true);

			try {
				anInflater289.setInput(buf.backing, buf.pos + 10, buf.backing.length - (8 + buf.pos + 10));
				anInflater289.inflate(bytes);
			} catch (final Exception var4) {
				anInflater289.reset();
				throw new RuntimeException("");
			}

			anInflater289.reset();
		} else
			throw new RuntimeException("");
	}

	public GZIPDecompressor() {
		this(-1, 1000000, 1000000);
	}
}
