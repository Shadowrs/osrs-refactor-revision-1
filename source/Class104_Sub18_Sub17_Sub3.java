public final class Class104_Sub18_Sub17_Sub3 extends Class104_Sub18_Sub17 {
	public int[] anIntArray1617;
	public int anInt1622;
	public int anInt1623;
	public byte[] aByteArray1616;
	public int anInt1618;
	public int anInt1619;
	public int anInt1620;
	public int anInt1621;

	public void method887() {
		if ((anInt1618 != anInt1622) || (anInt1619 != anInt1623)) {
			final byte[] var1 = new byte[anInt1622 * anInt1623];
			int var2 = 0;

			for (int var3 = 0; var3 < anInt1619; ++var3)
				for (int var4 = 0; var4 < anInt1618; ++var4)
					var1[var4 + anInt1620 + ((var3 + anInt1621) * anInt1622)] = aByteArray1616[var2++];

			aByteArray1616 = var1;
			anInt1618 = anInt1622;
			anInt1619 = anInt1623;
			anInt1620 = 0;
			anInt1621 = 0;
		}
	}

	static void method888(final int[] var0, final byte[] var1, final int[] var2, int var3, int var4, int var5,
			final int var6, final int var7, final int var8) {
		final int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			byte var12;
			for (var11 = var9; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0)
					var0[var4++] = var2[var12 & 255];
				else
					++var4;

				var12 = var1[var3++];
				if (var12 != 0)
					var0[var4++] = var2[var12 & 255];
				else
					++var4;

				var12 = var1[var3++];
				if (var12 != 0)
					var0[var4++] = var2[var12 & 255];
				else
					++var4;

				var12 = var1[var3++];
				if (var12 != 0)
					var0[var4++] = var2[var12 & 255];
				else
					++var4;
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0)
					var0[var4++] = var2[var12 & 255];
				else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method889(int var1, int var2) {
		var1 += anInt1620;
		var2 += anInt1621;
		int var3 = var1 + (var2 * anInt1469);
		int var4 = 0;
		int var5 = anInt1619;
		int var6 = anInt1618;
		int var7 = anInt1469 - var6;
		int var8 = 0;
		int var9;
		if (var2 < anInt1471) {
			var9 = anInt1471 - var2;
			var5 -= var9;
			var2 = anInt1471;
			var4 += var9 * var6;
			var3 += var9 * anInt1469;
		}

		if ((var2 + var5) > anInt1470)
			var5 -= (var2 + var5) - anInt1470;

		if (var1 < anInt1473) {
			var9 = anInt1473 - var1;
			var6 -= var9;
			var1 = anInt1473;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if ((var1 + var6) > anInt1472) {
			var9 = (var1 + var6) - anInt1472;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if ((var6 > 0) && (var5 > 0))
			method888(anIntArray1474, aByteArray1616, anIntArray1617, var4, var3, var6, var5, var7, var8);
	}

	public void method890(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anIntArray1617.length; ++var4) {
			int var5 = (anIntArray1617[var4] >> 16) & 255;
			var5 += var1;
			if (var5 < 0)
				var5 = 0;
			else if (var5 > 255)
				var5 = 255;

			int var6 = (anIntArray1617[var4] >> 8) & 255;
			var6 += var2;
			if (var6 < 0)
				var6 = 0;
			else if (var6 > 255)
				var6 = 255;

			int var7 = anIntArray1617[var4] & 255;
			var7 += var3;
			if (var7 < 0)
				var7 = 0;
			else if (var7 > 255)
				var7 = 255;

			anIntArray1617[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}
}
