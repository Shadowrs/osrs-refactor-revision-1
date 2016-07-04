public final class Class6 {
	int anInt30;
	int anInt31;
	int anInt32;
	public Class104_Sub18_Sub16 aClass104_Sub18_Sub16_33;
	public int anInt34;
	int anInt35;
	static Class104_Sub18_Sub17_Sub2_Sub1 aClass104_Sub18_Sub17_Sub2_Sub1_36;

	static final void method32(final String var0) {
		if (!var0.equals("")) {
			client.secureBuf.putOpcode(185);
			client.secureBuf.writebyte(GameBuf.lengthOf(var0));
			client.secureBuf.writeString(var0);
		}
	}
}
