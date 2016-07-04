public class Class81 {
	int anInt634;
	byte[] aByteArray635;
	int anInt636;
	int anInt637;
	int anInt638;
	byte[] aByteArray639;
	int anInt640;
	int anInt641;
	int anInt642;
	static Class17 aClass17_643;
	static Player pf;

	static final void method355(final Player var0, final int var1, final int var2,
			final int var3) {
		if (pf != var0)
			if (client.anInt1805 < 400) {
				int var5;
				String var9;
				if (var0.anInt1774 == 0) {
					final String var4 = var0.aString1780;
					var5 = var0.anInt1773;
					final int var6 = pf.anInt1773;
					final int var7 = var6 - var5;
					String var8;
					if (var7 < -9)
						var8 = Class70.method326(16711680);
					else if (var7 < -6)
						var8 = Class70.method326(16723968);
					else if (var7 < -3)
						var8 = Class70.method326(16740352);
					else if (var7 < 0)
						var8 = Class70.method326(16756736);
					else if (var7 > 9)
						var8 = Class70.method326('\uff00');
					else if (var7 > 6)
						var8 = Class70.method326(4259584);
					else if (var7 > 3)
						var8 = Class70.method326(8453888);
					else if (var7 > 0)
						var8 = Class70.method326(12648192);
					else
						var8 = Class70.method326(16776960);

					var9 = var4 + var8 + " " + " (" + "level-" + var0.anInt1773 + ")";
				} else
					var9 = var0.aString1780 + " " + " (" + "skill-" + var0.anInt1774 + ")";

				int var10;
				if (client.anInt1941 == 1)
					Class60.method256("Use", client.aString1942 + " " + "->" + " " + Class70.method326(16777215) + var9,
							14, var1, var2, var3);
				else if (client.aBool1943) {
					if ((Class11.anInt66 & 8) == 8)
						Class60.method256(client.aString1914,
								client.aString1946 + " " + "->" + " " + Class70.method326(16777215) + var9, 15, var1,
								var2, var3);
				} else
					for (var10 = 7; var10 >= 0; --var10)
						if (null != client.aStringArray1918[var10]) {
							short var11 = 0;
							if (client.aStringArray1918[var10].equalsIgnoreCase("Attack")) {
								if (var0.anInt1773 > pf.anInt1773)
									var11 = 2000;

								if ((pf.anInt1787 != 0) && (var0.anInt1787 != 0))
									if (pf.anInt1787 == var0.anInt1787)
										var11 = 2000;
									else
										var11 = 0;
							} else if (client.aBoolArray1919[var10])
								var11 = 2000;

							var5 = var11 + client.anIntArray1917[var10];
							Class60.method256(client.aStringArray1918[var10], Class70.method326(16777215) + var9, var5,
									var1, var2, var3);
						}

				for (var10 = 0; var10 < client.anInt1805; ++var10)
					if (client.anIntArray1933[var10] == 23) {
						client.aStringArray1936[var10] = Class70.method326(16777215) + var9;
						break;
					}

			}
	}
}
