import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class99_Sub1 extends Class99 {
	SourceDataLine aSourceDataLine900;
	int anInt899;
	AudioFormat anAudioFormat898;
	byte[] aByteArray897;

	@Override
	void method452(final int var1) throws LineUnavailableException {
		try {
			final Info var2 = new Info(SourceDataLine.class, anAudioFormat898, var1 << (aBool773 ? 2 : 1));
			aSourceDataLine900 = (SourceDataLine) AudioSystem.getLine(var2);
			aSourceDataLine900.open();
			aSourceDataLine900.start();
			anInt899 = var1;
		} catch (final LineUnavailableException var5) {
			if (Widget.method540(var1) != 1) {
				int var3 = var1 - 1;
				var3 |= var3 >>> 1;
				var3 |= var3 >>> 2;
				var3 |= var3 >>> 4;
				var3 |= var3 >>> 8;
				var3 |= var3 >>> 16;
				final int var4 = 1 + var3;
				method452(var4);
			} else {
				aSourceDataLine900 = null;
				throw var5;
			}
		}
	}

	@Override
	void method454() {
		int var1 = 256;
		if (aBool773)
			var1 <<= 1;

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = anIntArray779[var2];
			if (((8388608 + var3) & -16777216) != 0)
				var3 = 8388607 ^ (var3 >> 31);

			aByteArray897[var2 * 2] = (byte) (var3 >> 8);
			aByteArray897[1 + (2 * var2)] = (byte) (var3 >> 16);
		}

		aSourceDataLine900.write(aByteArray897, 0, var1 << 1);
	}

	@Override
	void method455() {
		if (aSourceDataLine900 != null) {
			aSourceDataLine900.close();
			aSourceDataLine900 = null;
		}

	}

	@Override
	void method456() {
		aSourceDataLine900.flush();
	}

	@Override
	int method453() {
		return anInt899 - (aSourceDataLine900.available() >> (aBool773 ? 2 : 1));
	}

	@Override
	void method449(final Component var1) {
		anAudioFormat898 = new AudioFormat(anInt777, 16, aBool773 ? 2 : 1, true, false);
		aByteArray897 = new byte[256 << (aBool773 ? 2 : 1)];
	}
}
