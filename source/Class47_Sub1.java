import java.nio.ByteBuffer;

public class Class47_Sub1 extends Class47 {
	ByteBuffer aByteBuffer830;

	@Override
	byte[] method208(final int var1) {
		final byte[] var2 = new byte[aByteBuffer830.capacity()];
		aByteBuffer830.position(0);
		aByteBuffer830.get(var2);
		return var2;
	}

	@Override
	void method209(final byte[] var1, final int var2) {
		aByteBuffer830 = ByteBuffer.allocateDirect(var1.length);
		aByteBuffer830.position(0);
		aByteBuffer830.put(var1);
	}
}
