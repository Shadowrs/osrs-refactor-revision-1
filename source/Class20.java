import java.io.IOException;
import java.util.Arrays;

public final class Class20 {
	int anInt196;
	int anInt197;
	int anInt198;
	public Class104_Sub18_Sub16 aClass104_Sub18_Sub16_199;
	int anInt201;
	public Class104_Sub18_Sub16 aClass104_Sub18_Sub16_202;
	int anInt203;
	static Class13 stream;
	static int anInt206;
	static Widget aClass104_Sub12_207;
	public int anInt200 = 0;
	int anInt204 = 0;

	static final void writePkt228(final boolean var0) {
		Class101.method465();
		++client.internalCycles;
		if ((client.internalCycles >= 50) || var0) {
			client.internalCycles = 0;
			if (!client.aBool1840 && (stream != null)) {
				client.secureBuf.putOpcode(228); // ping
				try {
					stream.flushbytes(client.secureBuf.backing, 0, client.secureBuf.pos);
					System.out.println("wrote 228 size="+client.secureBuf.pos);
					//System.out.println(Arrays.toString(client.secureBuf.backing));
					client.secureBuf.pos = 0;
				} catch (final IOException var2) {
					client.aBool1840 = true;
				}
			}

		}
	}
}
