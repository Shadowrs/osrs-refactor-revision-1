import java.io.IOException;

public final class Class20 {
	int anInt196;
	int anInt197;
	int anInt198;
	public Class104_Sub18_Sub16 aClass104_Sub18_Sub16_199;
	int anInt201;
	public Class104_Sub18_Sub16 aClass104_Sub18_Sub16_202;
	int anInt203;
	static Class13 aClass13_205;
	static int anInt206;
	static Class104_Sub12 aClass104_Sub12_207;
	public int anInt200 = 0;
	int anInt204 = 0;

	static final void method121(final boolean var0) {
		Class101.method465();
		++client.anInt1835;
		if ((client.anInt1835 >= 50) || var0) {
			client.anInt1835 = 0;
			if (!client.aBool1840 && (aClass13_205 != null)) {
				client.aClass104_Sub21_Sub1_1825.method623(228);

				try {
					aClass13_205.method54(client.aClass104_Sub21_Sub1_1825.aByteArray1174, 0,
							client.aClass104_Sub21_Sub1_1825.anInt1172);
					client.aClass104_Sub21_Sub1_1825.anInt1172 = 0;
				} catch (final IOException var2) {
					client.aBool1840 = true;
				}
			}

		}
	}
}