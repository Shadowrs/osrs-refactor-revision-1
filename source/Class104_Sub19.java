public class Class104_Sub19 extends Class104 {
	int[] anIntArray1146;
	static int[] anIntArray1145;
	boolean aBool1141 = false;
	int anInt1139;
	boolean aBool1138;
	int[] anIntArray1147;
	int[] anIntArray1140;
	int[] anIntArray1142;
	int[] anIntArray1143;
	int anInt1144;
	int anInt1137;

	boolean method556(final double var1, final int var3, final Class61 var4) {
		int var5;
		for (var5 = 0; var5 < anIntArray1147.length; ++var5)
			if (var4.method263(anIntArray1147[var5]) == null)
				return false;

		var5 = var3 * var3;
		anIntArray1146 = new int[var5];

		for (int var6 = 0; var6 < anIntArray1147.length; ++var6) {
			final Class104_Sub18_Sub17_Sub3 var7 = Class94.method421(var4, anIntArray1147[var6]);
			var7.method887();
			final byte[] var8 = var7.aByteArray1616;
			final int[] var9 = var7.anIntArray1617;
			final int var10 = anIntArray1143[var6];
			if ((var10 & -16777216) == 16777216)
				;

			if ((var10 & -16777216) == 33554432)
				;

			int var11;
			int var12;
			int var13;
			int var14;
			if ((var10 & -16777216) == 50331648) {
				var11 = var10 & 16711935;
				var12 = (var10 >> 8) & 255;

				for (var13 = 0; var13 < var9.length; ++var13) {
					var14 = var9[var13];
					if ((var14 & '\uffff') == (var14 >> 8)) {
						var14 &= 255;
						var9[var13] = (((var11 * var14) >> 8) & 16711935) | ((var12 * var14) & '\uff00');
					}
				}
			}

			for (var11 = 0; var11 < var9.length; ++var11)
				var9[var11] = Class104_Sub18_Sub17_Sub4.method915(var9[var11], var1);

			if (var6 == 0)
				var11 = 0;
			else
				var11 = anIntArray1140[var6 - 1];

			if (var6 == 0)
				;

			if (var11 == 0)
				if (var7.anInt1618 == var3)
					for (var12 = 0; var12 < var5; ++var12)
						anIntArray1146[var12] = var9[var8[var12] & 255];
				else if ((var7.anInt1618 == 64) && (var3 == 128)) {
					var12 = 0;

					for (var13 = 0; var13 < var3; ++var13)
						for (var14 = 0; var14 < var3; ++var14)
							anIntArray1146[var12++] = var9[var8[(var14 >> 1) + ((var13 >> 1) << 6)] & 255];
				} else {
					if ((var7.anInt1618 != 128) || (var3 != 64))
						throw new RuntimeException();

					var12 = 0;

					for (var13 = 0; var13 < var3; ++var13)
						for (var14 = 0; var14 < var3; ++var14)
							anIntArray1146[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
				}

			if (var11 == 1)
				;

			if (var11 == 2)
				;

			if (var11 == 3)
				;
		}

		return true;
	}

	void method557() {
		anIntArray1146 = null;
	}

	void method558(final int var1) {
		if (anIntArray1146 != null) {
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var8;
			if ((anInt1144 == 1) || (anInt1144 == 3)) {
				if ((anIntArray1145 == null) || (anIntArray1145.length < anIntArray1146.length))
					anIntArray1145 = new int[anIntArray1146.length];

				if (anIntArray1146.length == 4096)
					var2 = 64;
				else
					var2 = 128;

				var3 = anIntArray1146.length;
				var4 = var2 * var1 * anInt1137;
				var5 = var3 - 1;
				if (anInt1144 == 1)
					var4 = -var4;

				for (var6 = 0; var6 < var3; ++var6) {
					var7 = (var6 + var4) & var5;
					anIntArray1145[var6] = anIntArray1146[var7];
				}

				var8 = anIntArray1146;
				anIntArray1146 = anIntArray1145;
				anIntArray1145 = var8;
			}

			if ((anInt1144 == 2) || (anInt1144 == 4)) {
				if ((anIntArray1145 == null) || (anIntArray1145.length < anIntArray1146.length))
					anIntArray1145 = new int[anIntArray1146.length];

				if (anIntArray1146.length == 4096)
					var2 = 64;
				else
					var2 = 128;

				var3 = anIntArray1146.length;
				var4 = var1 * anInt1137;
				var5 = var2 - 1;
				if (anInt1144 == 2)
					var4 = -var4;

				for (var6 = 0; var6 < var3; var6 += var2)
					for (var7 = 0; var7 < var2; ++var7) {
						final int var9 = var6 + var7;
						final int var10 = var6 + ((var7 + var4) & var5);
						anIntArray1145[var9] = anIntArray1146[var10];
					}

				var8 = anIntArray1146;
				anIntArray1146 = anIntArray1145;
				anIntArray1145 = var8;
			}

		}
	}

	Class104_Sub19(final RSBuf var1) {
		anInt1139 = var1.readLEShort();
		aBool1138 = var1.readUByte() == 1;
		final int var2 = var1.readUByte();
		if ((var2 >= 1) && (var2 <= 4)) {
			anIntArray1147 = new int[var2];

			int var3;
			for (var3 = 0; var3 < var2; ++var3)
				anIntArray1147[var3] = var1.readLEShort();

			if (var2 > 1) {
				anIntArray1140 = new int[var2 - 1];

				for (var3 = 0; var3 < (var2 - 1); ++var3)
					anIntArray1140[var3] = var1.readUByte();
			}

			if (var2 > 1) {
				anIntArray1142 = new int[var2 - 1];

				for (var3 = 0; var3 < (var2 - 1); ++var3)
					anIntArray1142[var3] = var1.readUByte();
			}

			anIntArray1143 = new int[var2];

			for (var3 = 0; var3 < var2; ++var3)
				anIntArray1143[var3] = var1.readLEInt();

			anInt1144 = var1.readUByte();
			anInt1137 = var1.readUByte();
			anIntArray1146 = null;
		} else
			throw new RuntimeException();
	}
}
