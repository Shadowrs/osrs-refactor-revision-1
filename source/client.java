import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

public final class client extends Applet_Sub1 {
	/**
	 *
	 */
	private static final long serialVersionUID = 5022855324589529166L;
	static Class61_Sub1 aClass61_Sub1_1820;
	static Class61_Sub1 aClass61_Sub1_1838;
	static int anInt1969;
	static boolean aBool1794 = false;
	static int anInt1939 = 1;
	static int anInt1913 = 0;
	static int anInt1792 = 0;
	static int anInt1938 = 1;
	static boolean aBool1852 = false;
	static int anInt1799 = 0;
	static int anInt1983;
	static int anInt1879 = 0;
	static int anInt1842 = 0;
	static int anInt1836 = 0;
	static boolean aBool1840 = false;
	static int anInt1843 = 0;
	static int anInt2043 = 0;
	static int pktOpc = 0;
	static int pktSize = 0;
	static long aLong1800 = 0L;
	static int anInt1878 = 0;
	static int anInt1834 = 0;
	static int anInt1815 = 0;
	static int anInt2042 = 0;
	static int anInt1837 = 0;
	static boolean aBool1791 = false;
	static int anInt1948;
	static boolean aBool1945 = true;
	static Class104_Sub12 aClass104_Sub12_1951;
	static int anInt1801 = 0;
	static int anInt1802 = 0;
	static int anInt2013;
	static int anInt1803 = 0;
	static int anInt2028;
	static int anInt2014;
	static int anInt1867 = 0;
	static boolean aBool2041;
	static int anInt1897;
	static int anInt1898;
	static int anInt1899;
	static Class104_Sub12 aClass104_Sub12_1961;
	static boolean aBool1965;
	static boolean aBool1987;
	static int anInt2008;
	static int anInt1793;
	static boolean aBool1905;
	static int anInt1944;
	static int anInt1980;
	static int anInt1978;
	static int anInt2004;
	static int anInt2005;
	static int anInt2007;
	static int anInt1947;
	static int anInt1895;
	static int anInt1896;
	static Class104_Sub12 aClass104_Sub12_1958;
	static boolean aBool2034;
	static int anInt1953;
	static int anInt1864;
	static boolean aBool1930;
	static boolean aBool1804;
	static int anInt1901;
	static int anInt1902;
	static int anInt1903;
	static int anInt1950 = 0;
	static int anInt1877 = 0;
	static int anInt2021;
	static int anInt1866 = 0;
	static int anInt1962 = 128;
	static int anInt1916;
	static Class58 aClass58_1926;
	static int anInt1821 = 0;
	static int anInt2024;
	static int anInt1846;
	static int anInt1851;
	static int anInt1861 = 0;
	static int anInt1986 = 0;
	static int anInt1856 = 2;
	static int anInt2018;
	static int anInt1857 = 0;
	static int anInt1797 = 0;
	static int anInt1859 = 0;
	static int anInt1858 = 2;
	static int anInt1808 = 0;
	static int anInt1908 = 1;
	static int anInt2037;
	static int anInt1809 = 0;
	static int anInt1989 = 0;
	static int anInt1813 = 0;
	static int anInt1814 = 0;
	static int anInt1862 = 0;
	static int anInt1789 = 2;
	static String aString1829;
	static String aString2012;
	static int anInt1921 = 0;
	static int anInt1831 = 1;
	static int anInt1810 = 0;
	static int anInt1811 = 0;
	static int anInt1812 = 0;
	static int anInt1835 = 0;
	static int anInt1904;
	static int anInt1910;
	static int anInt1832 = 0;
	static int anInt1805;
	static int anInt1893 = 1;
	static int anInt1844 = 1;
	static int anInt1928;
	static int anInt1841;
	static int anInt1845;
	static int anInt1982;
	static int anInt1806 = 0;
	static int anInt1818 = 0;
	static int anInt1954 = 0;
	static long aLong1819;
	static int anInt1855 = 0;
	static boolean aBool1979 = true;
	static boolean aBool1798 = true;
	static boolean aBool1860 = false;
	static RSBuf aClass104_Sub21_1885 = new RSBuf(new byte[5000]);
	static int anInt1816 = 0;
	static int step = 0;
	static int anInt1824 = 0;
	static int anInt1968 = 0;
	static int anInt1826 = 0;
	static Class104_Sub18_Sub16_Sub7_Sub2[] aClass104_Sub18_Sub16_Sub7_Sub2Array1828 = new Class104_Sub18_Sub16_Sub7_Sub2['\u8000'];
	static int[] anIntArray1830 = new int['\u8000'];
	static Class104_Sub21_Sub1 secureBuf = new Class104_Sub21_Sub1(5000);
	static Class104_Sub21_Sub1 loginbuf = new Class104_Sub21_Sub1(5000);
	static Class104_Sub21_Sub1 gamecon = new Class104_Sub21_Sub1(5000);
	static int anInt1988 = 0;
	static Class67[] aClass67Array1975 = new Class67[4];
	static boolean dynamicRegion = false;
	static int[][][] anIntArrayArrayArray1848 = new int[4][13][13];
	static int[] anIntArray1849 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	static int anInt1850 = 0;
	static int[][] anIntArrayArray1907 = new int[104][104];
	static int[][] anIntArrayArray1822 = new int[104][104];
	static int[] anIntArray1853 = new int[4000];
	static int[] anIntArray1854 = new int[4000];
	static int anInt1796 = 1;
	static int anInt1974 = 1;
	static int anInt1959 = 1;
	static int anInt1871 = 7759444;
	static boolean aBool1872 = false;
	static int anInt1873 = 0;
	static int anInt1881 = 0;
	static int anInt1882 = 50;
	static int[] anIntArray1883;
	static int[] anIntArray1884;
	static int[] anIntArray1807;
	static int[] anIntArray1886;
	static int[] anIntArray2011;
	static int[] anIntArray1888;
	static int[] anIntArray1889;
	static String[] aStringArray1890;
	static int[][] anIntArrayArray1891;
	static int anInt1892;
	static int anInt1999;
	static int anInt1894;
	static int anInt1900;
	static int anInt1924;
	static int anInt1906;
	static Class104_Sub18_Sub16_Sub7_Sub1[] aClass104_Sub18_Sub16_Sub7_Sub1Array1937;
	static int anInt1994;
	static int[] anIntArray1909;
	static int[] anIntArray1911;
	static RSBuf[] aClass104_Sub21Array2030;
	static int anInt1874;
	static int anInt1990;
	static int[] anIntArray2048;
	static int[] anIntArray1917;
	static String[] aStringArray1918;
	static boolean[] aBoolArray1919;
	static int[] anIntArray1817;
	static Class59[][][] aClass59ArrayArrayArray1952;
	static Class59 aClass59_1922;
	static Class59 aClass59_1923;
	static Class59 aClass59_1869;
	static int[] anIntArray1925;
	static int[] anIntArray1833;
	static int[] anIntArray1927;
	static int anInt1920;
	static int[] anIntArray1931;
	static int[] anIntArray1932;
	static int[] anIntArray1933;
	static int[] anIntArray1934;
	static String[] aStringArray1863;
	static String[] aStringArray1936;
	static int anInt1940;
	static int anInt1941;
	static String aString1942;
	static boolean aBool1943;
	static int anInt1970;
	static String aString1914;
	static String aString1946;
	static Class58 aClass58_1795;
	static int anInt1949;
	static int anInt1839;
	static int anInt1915;
	static boolean aBool1955;
	static boolean aBool1956;
	static boolean aBool1870;
	static Class104_Sub12 aClass104_Sub12_2019;
	static int anInt1976;
	static int anInt1960;
	static int anInt2035;
	static int anInt1964;
	static int anInt1966;
	static int anInt1967;
	static int[] anIntArray1971;
	static int[] anIntArray1973;
	static int[] anIntArray1868;
	static int anInt1977;
	static int[] anIntArray1981;
	static String[] aStringArray1865;
	static Class59 aClass59_1984;
	static Class59 aClass59_1985;
	static Class59 aClass59_1957;
	static boolean[] aBoolArray2027;
	static boolean[] aBoolArray1991;
	static boolean[] aBoolArray1992;
	static int[] anIntArray1993;
	static int[] anIntArray1876;
	static int[] anIntArray1995;
	static int[] anIntArray1996;
	static int anInt1997;
	static int[] anIntArray1998;
	static String[] aStringArray1912;
	static String[] aStringArray2025;
	static String[] aStringArray2001;
	static int anInt2000;
	static int[] anIntArray2003;
	static long[] aLongArray2006;
	static int[] anIntArray2009;
	static int[] anIntArray2010;
	static int[] anIntArray2015;
	static int[] anIntArray2016;
	static Class104_Sub18_Sub17_Sub1[] aClass104_Sub18_Sub17_Sub1Array2017;
	static int anInt1880;
	static int anInt2022;
	static int anInt2023;
	static int anInt1827;
	static int anInt2026;
	static int[] anIntArray2029;
	static int[] anIntArray1875;
	static int[] anIntArray2031;
	static int[] anIntArray2032;
	static Class82[] aClass82Array2033;
	static boolean[] aBoolArray2036;
	static int[] anIntArray2039;
	static int[] anIntArray2038;
	static int[] anIntArray2020;
	static int[] anIntArray2040;
	static int anInt1935;
	static Class86[] aClass86Array1972;
	static Class51 aClass51_2044;
	static int anInt2045;
	static Class78[] aClass78Array2046;
	static Class85 aClass85_2047;
	static int anInt1887;
	static int anInt2049;

	@Override
	final void method945(final int var1) {
	}

	@Override
	public final void init() {
		if (method941()) {
			final Class54[] var1 = new Class54[] { Class54.aClass54_438, Class54.aClass54_444, Class54.aClass54_446,
					Class54.aClass54_441, Class54.aClass54_442, Class54.aClass54_443, Class54.aClass54_445,
					Class54.aClass54_440, Class54.aClass54_439 };
			final Class54[] var2 = var1;

			int var3;
			int var9;
			for (var3 = 0; var3 < var2.length; ++var3) {
				final Class54 var4 = var2[var3];
				final String var5 = getParameter(var4.aString437);
				if (var5 != null)
					switch (Integer.parseInt(var4.aString437)) {
					case 1:
						if (var5.equalsIgnoreCase("true"))
							anInt1938 = 1;
						else
							anInt1938 = 0;
						break;
					case 2:
						anInt1939 = Integer.parseInt(var5);
					case 3:
					default:
						break;
					case 4:
						anInt1913 = Integer.parseInt(var5);
						break;
					case 5:
						final int var6 = Integer.parseInt(var5);
						final Class30[] var7 = new Class30[] { Class30.aClass30_279, Class30.aClass30_281,
								Class30.aClass30_280, Class30.aClass30_282 };
						final Class30[] var25 = var7;
						var9 = 0;

						Class30 var28;
						while (true) {
							if (var9 >= var25.length) {
								var28 = null;
								break;
							}

							final Class30 var27 = var25[var9];
							if (var27.anInt284 == var6) {
								var28 = var27;
								break;
							}

							++var9;
						}

						Class96.aClass30_760 = var28;
						break;
					case 6:
						if (var5.equalsIgnoreCase("true"))
							aBool1852 = true;
						else
							aBool1852 = false;
						break;
					case 7:
						anInt1792 = Integer.parseInt(var5);
						break;
					case 8:
						final Class41[] var12 = Class38.method178();
						final int var13 = Integer.parseInt(var5);
						final Class41[] var8 = var12;
						var9 = 0;

						Class41 var11;
						while (true) {
							if (var9 >= var8.length) {
								var11 = null;
								break;
							}

							final Class41 var10 = var8[var9];
							if (var13 == var10.method5((byte) -45)) {
								var11 = var10;
								break;
							}

							++var9;
						}

						Class101.aClass41_812 = var11;
						if (Class101.aClass41_812 == Class41.aClass41_366)
							Class2.aClass101_8 = Class101.aClass101_810;
						else
							Class2.aClass101_8 = Class101.aClass101_808;
						break;
					case 9:
						Class30.aString285 = var5;
					}
			}

			Class17.aBool127 = false;
			aBool1794 = false;
			Class57.aString466 = getCodeBase().getHost();
			final String var22 = Class96.aClass30_760.aString283;
			final byte var14 = 0;

			try {
				Class24.anInt238 = 16;
				Class16.anInt116 = var14;

				try {
					Class64.aString513 = System.getProperty("os.name");
				} catch (final Exception var20) {
					Class64.aString513 = "Unknown";
				}

				Class90.aString716 = Class64.aString513.toLowerCase();

				try {
					Class104_Sub23.HOME = System.getProperty("user.home");
					if (null != Class104_Sub23.HOME)
						Class104_Sub23.HOME = Class104_Sub23.HOME + "/";
				} catch (final Exception var19) {
					;
				}

				try {
					if (Class90.aString716.startsWith("win")) {
						if (Class104_Sub23.HOME == null)
							Class104_Sub23.HOME = System.getenv("USERPROFILE");
					} else if (null == Class104_Sub23.HOME)
						Class104_Sub23.HOME = System.getenv("HOME");

					if (Class104_Sub23.HOME != null)
						Class104_Sub23.HOME = Class104_Sub23.HOME + "/";
				} catch (final Exception var18) {
					;
				}

				if (null == Class104_Sub23.HOME)
					Class104_Sub23.HOME = "~/";

				// DIRECTORIES
				Class49.targets = new String[] { /*"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/",*/ Class104_Sub23.HOME, /*"/tmp/", "" */};
				Class7.store = new String[] { "os-rev1", /*".jagex_cache_" + Class16.anInt116, ".file_store_" + Class16.anInt116 */};

				label129: for (var3 = 0; var3 < 4; ++var3) {
					Class24.aFile239 = Class70.method325("gamename", var22, var3);
					if (!Class24.aFile239.exists())
						Class24.aFile239.mkdirs();

					final File[] var23 = Class24.aFile239.listFiles();
					if (var23 == null)
						break;

					final File[] var24 = var23;
					int var16 = 0;

					while (true) {
						if (var16 >= var24.length)
							break label129;

						final File var29 = var24[var16];

						boolean var30;
						try {
							final RandomAccessFile var26 = new RandomAccessFile(var29, "rw");
							var9 = var26.read();
							var26.seek(0L);
							var26.write(var9);
							var26.seek(0L);
							var26.close();
							var30 = true;
						} catch (final Exception var17) {
							var30 = false;
						}

						if (!var30)
							break;

						++var16;
					}
				}

				Class72.method333(Class24.aFile239);
				Class89.method406();
				Class24.aClass96_242 = new Class96(
						new Class94(Class75.method341("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
				Class24.aClass96_243 = new Class96(
						new Class94(Class75.method341("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
				Class22.aClass96Array227 = new Class96[Class24.anInt238];

				for (var3 = 0; var3 < Class24.anInt238; ++var3)
					Class22.aClass96Array227[var3] = new Class96(
							new Class94(Class75.method341("main_file_cache.idx" + var3), "rw", 1048576L), 6000, 0);
			} catch (final Exception var21) {
				Class104_Sub9.method520((String) null, var21);
			}

			method937(765, 503, 1);
		}
	}

	@Override
final void method943(final byte var1) {
      ++anInt1799;
      method951();

      while(true) {
         final Class59 var2 = Class52.aClass59_429;
         Class104_Sub13 var3;
         synchronized(var2) {
            var3 = (Class104_Sub13)Class52.aClass59_427.method250();
         }

         if(null == var3) {
            Class49.method220();
            Class101.method465();
            final Class25 var73 = Class25.aClass25_248;
            int var5;
            synchronized(var73) {
               ++Class25.anInt256;
               Class25.anInt254 = Class25.anInt246;
               if(Class25.anInt245 >= 0)
				while(Class25.anInt247 != Class25.anInt245) {
                     var5 = Class25.anIntArray250[Class25.anInt247];
                     Class25.anInt247 = (Class25.anInt247 + 1) & 127;
                     if(var5 < 0)
						Class25.aBoolArray249[~var5] = false;
					else
						Class25.aBoolArray249[var5] = true;
                  }
			else {
                  for(var5 = 0; var5 < 112; ++var5)
					Class25.aBoolArray249[var5] = false;

                  Class25.anInt245 = Class25.anInt247;
               }

               Class25.anInt246 = Class25.anInt255;
            }

            final Class14 var74 = Class14.aClass14_94;
            synchronized(var74) {
               Class14.anInt93 = Class14.anInt90;
               Class14.anInt91 = Class14.anInt104;
               Class14.anInt95 = Class14.anInt96;
               Class14.anInt100 = Class14.anInt88;
               Class14.anInt101 = Class14.anInt97;
               Class14.anInt102 = Class14.anInt98;
               Class14.aLong103 = Class14.aLong99;
               Class14.anInt88 = 0;
            }

            int var8;
            if(null != Class25.aClass3_257) {
               var8 = Class25.aClass3_257.method25(2125035565);
               anInt1983 = var8;
            }

            int var9;
            int var10;
            int var11;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            Class104_Sub3 var81;
            boolean var95;
            if(anInt1806 == 0) {
               Class46.method206();
               Class36.method171();
            } else if(anInt1806 == 5) {
               Class88.method401(this);
               Class46.method206();
               Class36.method171();
            } else if(anInt1806 == 10)
				Class88.method401(this);
			else if(anInt1806 == 20) {
               Class88.method401(this);
               Class104_Sub8_Sub4.login();
            } else if(anInt1806 == 25) {
               Class20.method121(false);
               anInt1842 = 0;
               boolean var84 = true;

               for(var5 = 0; var5 < Class104_Sub15.aByteArrayArray1124.length; ++var5) {
                  if((Class40.anIntArray360[var5] != -1) && (null == Class104_Sub15.aByteArrayArray1124[var5])) {
                     Class104_Sub15.aByteArrayArray1124[var5] = Class67.aClass61_Sub1_555.method259(Class40.anIntArray360[var5], 0);
                     if(null == Class104_Sub15.aByteArrayArray1124[var5]) {
                        var84 = false;
                        ++anInt1842;
                     }
                  }

                  if((Class75.anIntArray597[var5] != -1) && (null == Class70.aByteArrayArray574[var5])) {
                     Class70.aByteArrayArray574[var5] = Class67.aClass61_Sub1_555.method275(Class75.anIntArray597[var5], 0, Class13.xteakeys[var5]);
                     if(Class70.aByteArrayArray574[var5] == null) {
                        var84 = false;
                        ++anInt1842;
                     }
                  }
               }

               if(!var84)
				anInt2043 = 1;
			else {
                  anInt1843 = 0;
                  var84 = true;

                  for(var5 = 0; var5 < Class104_Sub15.aByteArrayArray1124.length; ++var5) {
                     final byte[] var4 = Class70.aByteArrayArray574[var5];
                     if(var4 != null) {
                        var9 = ((Class47.anIntArray406[var5] >> 8) * 64) - Class53.anInt436;
                        var10 = ((Class47.anIntArray406[var5] & 255) * 64) - Class20.anInt206;
                        if(dynamicRegion) {
                           var9 = 10;
                           var10 = 10;
                        }

                        var84 &= Class19.method119(var4, var9, var10);
                     }
                  }

                  if(!var84)
					anInt2043 = 2;
				else {
                     if(anInt2043 != 0)
						Class104_Sub15.method550("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);

                     Class101.method465();
                     Class33.method158();
                     Class101.method465();
                     Class81.aClass17_643.method69();
                     Class101.method465();
                     System.gc();

                     for(var5 = 0; var5 < 4; ++var5)
						aClass67Array1975[var5].method304();

                     for(var5 = 0; var5 < 4; ++var5)
						for(var11 = 0; var11 < 104; ++var11)
							for(var9 = 0; var9 < 104; ++var9)
								Class76.aByteArrayArrayArray600[var5][var11][var9] = 0;

                     Class101.method465();
                     Class76.anInt601 = 99;
                     Class76.aByteArrayArrayArray603 = new byte[4][104][104];
                     Class76.aByteArrayArrayArray602 = new byte[4][104][104];
                     Class76.aByteArrayArrayArray609 = new byte[4][104][104];
                     Class76.aByteArrayArrayArray604 = new byte[4][104][104];
                     Class41.anIntArrayArrayArray369 = new int[4][105][105];
                     Class76.aByteArrayArrayArray605 = new byte[4][105][105];
                     Class7.anIntArrayArray41 = new int[105][105];
                     Class23.anIntArray237 = new int[104];
                     Class101.anIntArray811 = new int[104];
                     Class76.anIntArray615 = new int[104];
                     Class2_Sub2.anIntArray866 = new int[104];
                     Class76.anIntArray607 = new int[104];
                     var5 = Class104_Sub15.aByteArrayArray1124.length;

                     for(Class104_Sub1 var77 = (Class104_Sub1)Class104_Sub1.aClass59_849.method251(); null != var77; var77 = (Class104_Sub1)Class104_Sub1.aClass59_849.method252()) {
                        if(null != var77.aClass104_Sub8_Sub3_840) {
                           Class79.aClass104_Sub8_Sub2_630.method667(var77.aClass104_Sub8_Sub3_840);
                           var77.aClass104_Sub8_Sub3_840 = null;
                        }

                        if(var77.aClass104_Sub8_Sub3_851 != null) {
                           Class79.aClass104_Sub8_Sub2_630.method667(var77.aClass104_Sub8_Sub3_851);
                           var77.aClass104_Sub8_Sub3_851 = null;
                        }
                     }

                     Class104_Sub1.aClass59_849.method247();
                     Class20.method121(true);
                     if(!dynamicRegion) {
                        byte[] var12;
                        for(var11 = 0; var11 < var5; ++var11) {
                           var9 = ((Class47.anIntArray406[var11] >> 8) * 64) - Class53.anInt436;
                           var10 = ((Class47.anIntArray406[var11] & 255) * 64) - Class20.anInt206;
                           var12 = Class104_Sub15.aByteArrayArray1124[var11];
                           if(null != var12) {
                              Class101.method465();
                              Class1.method16(var12, var9, var10, (Class54.anInt447 * 8) - 48, (Class96.anInt761 * 8) - 48, aClass67Array1975);
                           }
                        }

                        for(var11 = 0; var11 < var5; ++var11) {
                           var9 = (64 * (Class47.anIntArray406[var11] >> 8)) - Class53.anInt436;
                           var10 = ((Class47.anIntArray406[var11] & 255) * 64) - Class20.anInt206;
                           var12 = Class104_Sub15.aByteArrayArray1124[var11];
                           if((var12 == null) && (Class96.anInt761 < 800)) {
                              Class101.method465();
                              Class104_Sub9.method519(var9, var10, 64, 64);
                           }
                        }

                        Class20.method121(true);

                        for(var11 = 0; var11 < var5; ++var11) {
                           final byte[] var6 = Class70.aByteArrayArray574[var11];
                           if(var6 != null) {
                              var10 = ((Class47.anIntArray406[var11] >> 8) * 64) - Class53.anInt436;
                              var13 = ((Class47.anIntArray406[var11] & 255) * 64) - Class20.anInt206;
                              Class101.method465();
                              Class105.method472(var6, var10, var13, Class81.aClass17_643, aClass67Array1975);
                           }
                        }
                     }

                     if(dynamicRegion) {
                        var11 = 0;

                        label3026:
                        while(true) {
                           if(var11 >= 4) {
                              for(var11 = 0; var11 < 13; ++var11)
								for(var9 = 0; var9 < 13; ++var9) {
                                    var10 = anIntArrayArrayArray1848[0][var11][var9];
                                    if(var10 == -1)
										Class104_Sub9.method519(8 * var11, 8 * var9, 8, 8);
                                 }

                              Class20.method121(true);
                              var11 = 0;

                              while(true) {
                                 if(var11 >= 4)
									break label3026;

                                 Class101.method465();

                                 for(var9 = 0; var9 < 13; ++var9)
									for(var10 = 0; var10 < 13; ++var10) {
                                       var13 = anIntArrayArrayArray1848[var11][var9][var10];
                                       if(var13 != -1) {
                                          var14 = (var13 >> 24) & 3;
                                          var15 = (var13 >> 1) & 3;
                                          var16 = (var13 >> 14) & 1023;
                                          var17 = (var13 >> 3) & 2047;
                                          var18 = (var17 / 8) + ((var16 / 8) << 8);

                                          for(var19 = 0; var19 < Class47.anIntArray406.length; ++var19)
											if((var18 == Class47.anIntArray406[var19]) && (null != Class70.aByteArrayArray574[var19])) {
                                                Class7.method34(Class70.aByteArrayArray574[var19], var11, var9 * 8, 8 * var10, var14, (var16 & 7) * 8, (var17 & 7) * 8, var15, Class81.aClass17_643, aClass67Array1975);
                                                break;
                                             }
                                       }
                                    }

                                 ++var11;
                              }
                           }

                           Class101.method465();

                           for(var9 = 0; var9 < 13; ++var9)
							for(var10 = 0; var10 < 13; ++var10) {
                                 var95 = false;
                                 var14 = anIntArrayArrayArray1848[var11][var9][var10];
                                 if(var14 != -1) {
                                    var15 = (var14 >> 24) & 3;
                                    var16 = (var14 >> 1) & 3;
                                    var17 = (var14 >> 14) & 1023;
                                    var18 = (var14 >> 3) & 2047;
                                    var19 = (var18 / 8) + ((var17 / 8) << 8);

                                    for(var20 = 0; var20 < Class47.anIntArray406.length; ++var20)
										if((var19 == Class47.anIntArray406[var20]) && (Class104_Sub15.aByteArrayArray1124[var20] != null)) {
										      Class1.method14(Class104_Sub15.aByteArrayArray1124[var20], var11, 8 * var9, 8 * var10, var15, (var17 & 7) * 8, 8 * (var18 & 7), var16, aClass67Array1975);
										      var95 = true;
										      break;
										   }
                                 }

                                 if(!var95) {
                                    var15 = var11;
                                    var16 = var9 * 8;
                                    var17 = var10 * 8;

                                    for(var18 = 0; var18 < 8; ++var18)
										for(var19 = 0; var19 < 8; ++var19)
											Class76.anIntArrayArrayArray611[var15][var18 + var16][var19 + var17] = 0;

                                    if(var16 > 0)
										for(var18 = 1; var18 < 8; ++var18)
											Class76.anIntArrayArrayArray611[var15][var16][var18 + var17] = Class76.anIntArrayArrayArray611[var15][var16 - 1][var17 + var18];

                                    if(var17 > 0)
										for(var18 = 1; var18 < 8; ++var18)
											Class76.anIntArrayArrayArray611[var15][var18 + var16][var17] = Class76.anIntArrayArrayArray611[var15][var18 + var16][var17 - 1];

                                    if((var16 > 0) && (Class76.anIntArrayArrayArray611[var15][var16 - 1][var17] != 0))
										Class76.anIntArrayArrayArray611[var15][var16][var17] = Class76.anIntArrayArrayArray611[var15][var16 - 1][var17];
									else if((var17 > 0) && (Class76.anIntArrayArrayArray611[var15][var16][var17 - 1] != 0))
										Class76.anIntArrayArrayArray611[var15][var16][var17] = Class76.anIntArrayArrayArray611[var15][var16][var17 - 1];
									else if((var16 > 0) && (var17 > 0) && (Class76.anIntArrayArrayArray611[var15][var16 - 1][var17 - 1] != 0))
										Class76.anIntArrayArrayArray611[var15][var16][var17] = Class76.anIntArrayArrayArray611[var15][var16 - 1][var17 - 1];
                                 }
                              }

                           ++var11;
                        }
                     }

                     Class20.method121(true);
                     Class33.method158();
                     Class101.method465();
                     Class104_Sub18_Sub14.method785(Class81.aClass17_643, aClass67Array1975);
                     Class20.method121(true);
                     var11 = Class76.anInt601;
                     if(var11 > Class12.anInt73)
						var11 = Class12.anInt73;

                     if(var11 < (Class12.anInt73 - 1))
						var11 = Class12.anInt73 - 1;

                     if(aBool1794)
						Class81.aClass17_643.method70(Class76.anInt601);
					else
						Class81.aClass17_643.method70(0);

                     for(var9 = 0; var9 < 104; ++var9)
						for(var10 = 0; var10 < 104; ++var10)
							Class102_Sub1.method496(var9, var10);

                     Class101.method465();

                     for(var81 = (Class104_Sub3)aClass59_1922.method251(); var81 != null; var81 = (Class104_Sub3)aClass59_1922.method252())
						if(var81.anInt878 == -1) {
                           var81.anInt877 = 0;
                           Class1_Sub1.method475(var81);
                        } else
							var81.method470();

                     Class104_Sub18_Sub6.aClass56_1326.method239();
                     if(Class53.aFrame435 != null) {
                        secureBuf.method623(210);
                        secureBuf.writeInt(1057001181);
                     }

                     if(!dynamicRegion) {
                        var9 = (Class54.anInt447 - 6) / 8;
                        var10 = (6 + Class54.anInt447) / 8;
                        var13 = (Class96.anInt761 - 6) / 8;
                        var14 = (6 + Class96.anInt761) / 8;

                        for(var15 = var9 - 1; var15 <= (var10 + 1); ++var15)
							for(var16 = var13 - 1; var16 <= (var14 + 1); ++var16)
								if((var15 < var9) || (var15 > var10) || (var16 < var13) || (var16 > var14)) {
							         Class67.aClass61_Sub1_555.method268("m" + var15 + "_" + var16);
							         Class67.aClass61_Sub1_555.method268("l" + var15 + "_" + var16);
							      }
                     }

                     Class10.method40(30);
                     Class101.method465();
                     Class36.method172();
                     secureBuf.method623(197);
                     Class36.method171();
                  }
               }
            }

            if(anInt1806 == 30) {
               if(anInt1879 > 1)
				--anInt1879;

               if(anInt1836 > 0)
				--anInt1836;

               if(aBool1840) {
                  aBool1840 = false;
                  if(anInt1836 > 0)
					Class61_Sub1.method494();
				else {
                     Class10.method40(40);
                     Class57.aClass13_467 = Class20.stream;
                     Class20.stream = null;
                  }
               } else {
                  Class104_Sub12 var7;
                  Class86 var22;
                  int var32;
                  int var45;
                  boolean var103;
                  boolean var106;
                  Class104_Sub12 var120;
                  for(var8 = 0; var8 < 100; ++var8) {
                     boolean var87;
                     if(null == Class20.stream)
						var87 = false;
					else
						label3291: {
                           String var82;
                           try {
                              var11 = Class20.stream.avail();
                              if(var11 == 0) {
                                 var87 = false;
                                 break label3291;
                              }

                              if(pktOpc == -1) {
                                 Class20.stream.readbytes(gamecon.aByteArray1174, 0, 1);
                                 gamecon.pos = 0;
                                 pktOpc = gamecon.opcode();
                                 pktSize = Class95.anIntArray746[pktOpc];
                                 --var11;
                              }

                              if(pktSize == -1) {
                                 if(var11 <= 0) {
                                    var87 = false;
                                    break label3291;
                                 }

                                 Class20.stream.readbytes(gamecon.aByteArray1174, 0, 1);
                                 pktSize = gamecon.aByteArray1174[0] & 255;
                                 --var11;
                              }

                              if(pktSize == -2) {
                                 if(var11 <= 1) {
                                    var87 = false;
                                    break label3291;
                                 }

                                 Class20.stream.readbytes(gamecon.aByteArray1174, 0, 2);
                                 gamecon.pos = 0;
                                 pktSize = gamecon.readLEShort();
                                 var11 -= 2;
                              }

                              if(var11 < pktSize) {
                                 var87 = false;
                                 break label3291;
                              }

                              gamecon.pos = 0;
                              Class20.stream.readbytes(gamecon.aByteArray1174, 0, pktSize);
                              anInt1834 = 0;
                              anInt1815 = anInt2042;
                              anInt2042 = anInt1837;
                              anInt1837 = pktOpc;
                              if(pktOpc == 180) {
                                 var9 = gamecon.readShortN();
                                 var10 = gamecon.method574();
                                 Class71.anIntArray577[var9] = var10;
                                 if(var10 != Class71.anIntArray576[var9]) {
                                    Class71.anIntArray576[var9] = var10;
                                    Class46.method204(var9);
                                 }

                                 anIntArray1971[(++anInt1948 - 1) & 31] = var9;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              String var112;
                              String var117;
                              if(pktOpc == 168) {
                                 var82 = gamecon.method608();
                                 final Class104_Sub21_Sub1 var104 = gamecon;

                                 try {
                                    var15 = var104.method599();
                                    if(var15 > 32767)
										var15 = 32767;

                                    final byte[] var114 = new byte[var15];
                                    var104.pos += Class106.aClass49_826.method218(var104.aByteArray1174, var104.pos, var114, 0, var15);
                                    var112 = Class104_Sub18_Sub6.method751(var114, 0, var15);
                                    var117 = var112;
                                 } catch (final Exception var58) {
                                    var117 = "Cabbage";
                                 }

                                 var117 = Class104_Sub18_Sub17_Sub2.method879(Class80.method351(var117));
                                 Class15.method60(6, var82, var117);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 87) {
                                 var9 = gamecon.method574();
                                 final Class104_Sub9 var90 = (Class104_Sub9)aClass58_1795.method241(var9);
                                 if(null != var90)
									Class13.method56(var90, true);

                                 if(null != aClass104_Sub12_1951) {
                                    Class79.method348(aClass104_Sub12_1951);
                                    aClass104_Sub12_1951 = null;
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              Class104_Sub12 var92;
                              if(pktOpc == 176) {
                                 var9 = gamecon.method597();
                                 var10 = gamecon.method574();
                                 var92 = Class47.method210(var10);
                                 if((var9 != var92.anInt1058) || (var9 == -1)) {
                                    var92.anInt1058 = var9;
                                    var92.anInt974 = 0;
                                    var92.anInt1085 = 0;
                                    Class79.method348(var92);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              String var83;
                              if(pktOpc == 100) {
                                 var82 = gamecon.method608();
                                 if(var82.endsWith(":tradereq:")) {
                                    var83 = Class33.method155(var82.substring(0, var82.indexOf(":")), Class2.aClass101_8);
                                    var95 = false;
                                    if(Class34.method166(var83))
										var95 = true;

                                    if(!var95 && (anInt1906 == 0))
										Class15.method60(4, var83, "wishes to trade with you.");
                                 } else if(var82.endsWith(":duelreq:")) {
                                    var83 = Class33.method155(var82.substring(0, var82.indexOf(":")), Class2.aClass101_8);
                                    var95 = false;
                                    if(Class34.method166(var83))
										var95 = true;

                                    if(!var95 && (anInt1906 == 0))
										Class15.method60(8, var83, "wishes to duel with you.");
                                 } else if(var82.endsWith(":chalreq:")) {
                                    var83 = Class33.method155(var82.substring(0, var82.indexOf(":")), Class2.aClass101_8);
                                    var95 = false;
                                    if(Class34.method166(var83))
										var95 = true;

                                    if(!var95 && (anInt1906 == 0)) {
                                       var117 = var82.substring(var82.indexOf(":") + 1, var82.length() - 9);
                                       Class15.method60(8, var83, var117);
                                    }
                                 } else if(var82.endsWith(":assistreq:")) {
                                    var83 = Class33.method155(var82.substring(0, var82.indexOf(":")), Class2.aClass101_8);
                                    var95 = false;
                                    if(Class34.method166(var83))
										var95 = true;

                                    if(!var95 && (anInt1906 == 0))
										Class15.method60(10, var83, "");
                                 } else if(var82.endsWith(":clan:")) {
                                    var83 = var82.substring(0, var82.indexOf(":clan:"));
                                    Class15.method60(11, "", var83);
                                 } else if(var82.endsWith(":trade:")) {
                                    var83 = var82.substring(0, var82.indexOf(":trade:"));
                                    if(anInt1906 == 0)
										Class15.method60(12, "", var83);
                                 } else if(var82.endsWith(":assist:")) {
                                    var83 = var82.substring(0, var82.indexOf(":assist:"));
                                    if(anInt1906 == 0)
										Class15.method60(13, "", var83);
                                 } else
									Class15.method60(0, "", var82);

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 89) {
                                 Class93.anInt742 = gamecon.method570();
                                 Class19.anInt195 = gamecon.method588();
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 246) {
                                 var9 = gamecon.readByteN();
                                 var10 = gamecon.method576();
                                 var13 = gamecon.method588();
                                 Class12.anInt73 = var13 >> 1;
                                 Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.method933(var10, var9, (var13 & 1) == 1);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 88) {
                                 var9 = gamecon.readShort();
                                 final byte var131 = gamecon.method590();
                                 Class71.anIntArray577[var9] = var131;
                                 if(Class71.anIntArray576[var9] != var131) {
                                    Class71.anIntArray576[var9] = var131;
                                    Class46.method204(var9);
                                 }

                                 anIntArray1971[(++anInt1948 - 1) & 31] = var9;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 42) {
                                 if(anInt1947 != -1)
									Class9.method36(anInt1947, 0);

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if((pktOpc == 205) || (pktOpc == 106) || (pktOpc == 245) || (pktOpc == 215) || (pktOpc == 20) || (pktOpc == 32) || (pktOpc == 207) || (pktOpc == 173) || (pktOpc == 6) || (pktOpc == 7) || (pktOpc == 154)) {
                                 Class9.method35();
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 41) {
                                 Class66.method301();
                                 anInt1944 = gamecon.method570();
                                 anInt1980 = anInt1978;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              long var25;
                              long var27;
                              if(pktOpc == 86) {
                                 var82 = gamecon.method608();
                                 var25 = gamecon.readLEShort();
                                 var27 = gamecon.method614();
                                 var16 = gamecon.method570();
                                 final long var29 = (var25 << 32) + var27;
                                 boolean var108 = false;

                                 for(var20 = 0; var20 < 100; ++var20)
									if(aLongArray2006[var20] == var29) {
                                       var108 = true;
                                       break;
                                    }

                                 if(Class34.method166(var82))
									var108 = true;

                                 if(!var108 && (anInt1906 == 0)) {
                                    aLongArray2006[anInt2007] = var29;
                                    anInt2007 = (anInt2007 + 1) % 100;
                                    final Class104_Sub21_Sub1 var129 = gamecon;

                                    String var133;
                                    try {
                                       var32 = var129.method599();
                                       if(var32 > 32767)
										var32 = 32767;

                                       final byte[] var132 = new byte[var32];
                                       var129.pos += Class106.aClass49_826.method218(var129.aByteArray1174, var129.pos, var132, 0, var32);
                                       final String var34 = Class104_Sub18_Sub6.method751(var132, 0, var32);
                                       var133 = var34;
                                    } catch (final Exception var57) {
                                       var133 = "Cabbage";
                                    }

                                    var133 = Class104_Sub18_Sub17_Sub2.method879(Class80.method351(var133));
                                    if((var16 != 2) && (var16 != 3)) {
                                       if(var16 == 1)
										Class15.method60(7, Class72.method335(0) + var82, var133);
									else
										Class15.method60(3, var82, var133);
                                    } else
										Class15.method60(7, Class72.method335(1) + var82, var133);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              Class104_Sub9 var124;
                              if(pktOpc == 184) {
                                 var9 = gamecon.readByteN();
                                 var10 = gamecon.method594();
                                 var13 = gamecon.method566();
                                 var124 = (Class104_Sub9)aClass58_1795.method241(var13);
                                 if(var124 != null)
									Class13.method56(var124, var10 != var124.anInt957);

                                 Class97.method440(var13, var10, var9);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 214) {
                                 gamecon.pos += 28;
                                 if(gamecon.method602())
									Class104_Sub8_Sub4.method739(gamecon, gamecon.pos - 28);

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 137) {
                                 anInt2004 = gamecon.method570();
                                 anInt2005 = gamecon.method570();
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 224) {
                                 Class61_Sub1.method494();
                                 pktOpc = -1;
                                 var87 = false;
                                 break label3291;
                              }

                              if(pktOpc == 147) {
                                 var9 = gamecon.readShort();
                                 anInt1947 = var9;
                                 Class80.method354(var9);
                                 Class88.method404(anInt1947);

                                 for(var10 = 0; var10 < 100; ++var10)
									aBoolArray2027[var10] = true;

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 241) {
                                 var9 = gamecon.method566();
                                 Class66.aClass8_548 = aClass11_1760.method44(var9);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 225) {
                                 aBool2034 = true;
                                 Class85.anInt673 = gamecon.method570();
                                 Class41.anInt370 = gamecon.method570();
                                 Class79.anInt631 = gamecon.readLEShort();
                                 Class104_Sub1.anInt853 = gamecon.method570();
                                 Class103.anInt821 = gamecon.method570();
                                 if(Class103.anInt821 >= 100) {
                                    var9 = 64 + (Class85.anInt673 * 128);
                                    var10 = (Class41.anInt370 * 128) + 64;
                                    var13 = Class47.method211(var9, var10, Class12.anInt73) - Class79.anInt631;
                                    var14 = var9 - Class85.anInt672;
                                    var15 = var13 - Class46.anInt403;
                                    var16 = var10 - Class99.anInt793;
                                    var17 = (int)Math.sqrt((var16 * var16) + (var14 * var14));
                                    Class27.anInt266 = (int)(Math.atan2(var15, var17) * 325.949D) & 2047;
                                    Class44.anInt395 = (int)(Math.atan2(var14, var16) * -325.949D) & 2047;
                                    if(Class27.anInt266 < 128)
										Class27.anInt266 = 128;

                                    if(Class27.anInt266 > 383)
										Class27.anInt266 = 383;
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 234) {
                                 var9 = gamecon.method566();
                                 var10 = gamecon.readLEShort();
                                 var13 = (var10 >> 10) & 31;
                                 var14 = (var10 >> 5) & 31;
                                 var15 = var10 & 31;
                                 var16 = (var13 << 19) + (var14 << 11) + (var15 << 3);
                                 final Class104_Sub12 var122 = Class47.method210(var9);
                                 if(var122.anInt1017 != var16) {
                                    var122.anInt1017 = var16;
                                    Class79.method348(var122);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 85) {
                                 var9 = gamecon.method596();
                                 var10 = gamecon.method611();
                                 var13 = gamecon.method566();
                                 var120 = Class47.method210(var13);
                                 var15 = var10 + var120.anInt985;
                                 var16 = var120.anInt975 + var9;
                                 if((var15 != var120.anInt983) || (var120.anInt1005 != var16)) {
                                    var120.anInt983 = var15;
                                    var120.anInt1005 = var16;
                                    Class79.method348(var120);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 1) {
                                 Class66.method301();
                                 anInt1953 = gamecon.method572();
                                 anInt1980 = anInt1978;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              long var38;
                              if(pktOpc == 48) {
                                 var9 = gamecon.method574();
                                 var10 = gamecon.readShortN();
                                 if(var10 == '\uffff')
									var10 = -1;

                                 var13 = gamecon.readInt();
                                 var14 = gamecon.readShort();
                                 if(var14 == '\uffff')
									var14 = -1;

                                 for(var15 = var14; var15 <= var10; ++var15) {
                                    var38 = var15 + ((long)var13 << 32);
                                    final Class104 var40 = aClass58_1926.method241(var38);
                                    if(null != var40)
										var40.method470();

                                    aClass58_1926.method242(new Class104_Sub17(var9), var38);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 73) {
                                 Class95.readregionpacket(true);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 17) {
                                 var9 = gamecon.method570();
                                 var10 = gamecon.method570();
                                 var13 = gamecon.method570();
                                 var14 = gamecon.method570();
                                 aBoolArray2036[var9] = true;
                                 anIntArray2039[var9] = var10;
                                 anIntArray2038[var9] = var13;
                                 anIntArray2020[var9] = var14;
                                 anIntArray2040[var9] = 0;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 113) {
                                 Class104_Sub15.method549();
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 222) {
                                 var9 = gamecon.method574();
                                 var10 = gamecon.readLEShort();
                                 if(var9 < -70000)
									var10 += '\u8000';

                                 if(var9 >= 0)
									var92 = Class47.method210(var9);
								else
									var92 = null;

                                 for(; gamecon.pos < pktSize; Class104_Sub18_Sub16_Sub2.method809(var10, var14, var15 - 1, var16)) {
                                    var14 = gamecon.method599();
                                    var15 = gamecon.readLEShort();
                                    var16 = 0;
                                    if(var15 != 0) {
                                       var16 = gamecon.method570();
                                       if(var16 == 255)
										var16 = gamecon.method574();
                                    }

                                    if((var92 != null) && (var14 >= 0) && (var14 < var92.anIntArray1080.length)) {
                                       var92.anIntArray1080[var14] = var15;
                                       var92.anIntArray1081[var14] = var16;
                                    }
                                 }

                                 if(var92 != null)
									Class79.method348(var92);

                                 Class66.method301();
                                 anIntArray1973[(++anInt1916 - 1) & 31] = var10 & 32767;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              long var41;
                              if(pktOpc == 39) {
                                 var9 = gamecon.pos + pktSize;
                                 var10 = gamecon.readLEShort();
                                 var13 = gamecon.readLEShort();
                                 if(var10 != anInt1947) {
                                    anInt1947 = var10;
                                    Class80.method354(anInt1947);
                                    Class88.method404(anInt1947);

                                    for(var14 = 0; var14 < 100; ++var14)
										aBoolArray2027[var14] = true;
                                 }

                                 Class104_Sub9 var116;
                                 for(; var13-- > 0; var116.aBool958 = true) {
                                    var14 = gamecon.method574();
                                    var15 = gamecon.readLEShort();
                                    var16 = gamecon.method570();
                                    var116 = (Class104_Sub9)aClass58_1795.method241(var14);
                                    if((null != var116) && (var15 != var116.anInt957)) {
                                       Class13.method56(var116, true);
                                       var116 = null;
                                    }

                                    if(null == var116)
										var116 = Class97.method440(var14, var15, var16);
                                 }

                                 for(var124 = (Class104_Sub9)aClass58_1795.method245(); var124 != null; var124 = (Class104_Sub9)aClass58_1795.method243())
									if(var124.aBool958)
										var124.aBool958 = false;
									else
										Class13.method56(var124, true);

                                 aClass58_1926 = new Class58(512);

                                 while(gamecon.pos < var9) {
                                    var14 = gamecon.method574();
                                    var15 = gamecon.readLEShort();
                                    var16 = gamecon.readLEShort();
                                    var17 = gamecon.method574();

                                    for(var18 = var15; var18 <= var16; ++var18) {
                                       var41 = var18 + ((long)var14 << 32);
                                       aClass58_1926.method242(new Class104_Sub17(var17), var41);
                                    }
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 21) {
                                 Class95.readregionpacket(false);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 190) {
                                 anInt2021 = gamecon.method570();
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 84) {
                                 var9 = gamecon.method566();
                                 var103 = gamecon.method588() == 1;
                                 var92 = Class47.method210(var9);
                                 if(var103 != var92.aBool1075) {
                                    var92.aBool1075 = var103;
                                    Class79.method348(var92);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 129) {
                                 for(var9 = 0; var9 < Class104_Sub18_Sub6.anInt1373; ++var9) {
                                    final Class104_Sub18_Sub11 var88 = Class104_Sub23.method622(var9);
                                    if((var88 != null) && (var88.anInt1412 == 0)) {
                                       Class71.anIntArray577[var9] = 0;
                                       Class71.anIntArray576[var9] = 0;
                                    }
                                 }

                                 Class66.method301();
                                 anInt1948 += 32;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 92) {
                                 var82 = gamecon.method608();
                                 final Object[] var86 = new Object[var82.length() + 1];

                                 for(var13 = var82.length() - 1; var13 >= 0; --var13)
									if(var82.charAt(var13) == 115)
										var86[var13 + 1] = gamecon.method608();
									else
										var86[var13 + 1] = new Integer(gamecon.method574());

                                 var86[0] = new Integer(gamecon.method574());
                                 final Class104_Sub6 var101 = new Class104_Sub6();
                                 var101.anObjectArray936 = var86;
                                 Class46.method203(var101);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 67) {
                                 Class93.anInt742 = gamecon.method576();
                                 Class19.anInt195 = gamecon.method588();

                                 for(var9 = Class19.anInt195; var9 < (Class19.anInt195 + 8); ++var9)
									for(var10 = Class93.anInt742; var10 < (Class93.anInt742 + 8); ++var10)
										if(null != aClass59ArrayArrayArray1952[Class12.anInt73][var9][var10]) {
										      aClass59ArrayArrayArray1952[Class12.anInt73][var9][var10] = null;
										      Class102_Sub1.method496(var9, var10);
										   }

                                 for(var81 = (Class104_Sub3)aClass59_1922.method251(); null != var81; var81 = (Class104_Sub3)aClass59_1922.method252())
									if((var81.anInt871 >= Class19.anInt195) && (var81.anInt871 < (8 + Class19.anInt195)) && (var81.anInt870 >= Class93.anInt742) && (var81.anInt870 < (Class93.anInt742 + 8)) && (var81.anInt876 == Class12.anInt73))
										var81.anInt878 = 0;

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 66) {
                                 var9 = gamecon.readInt();
                                 var10 = gamecon.method594();
                                 var92 = Class47.method210(var9);
                                 if((var92.anInt1010 != 2) || (var10 != var92.anInt1011)) {
                                    var92.anInt1010 = 2;
                                    var92.anInt1011 = var10;
                                    Class79.method348(var92);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 208) {
                                 Class66.method301();
                                 var9 = gamecon.method576();
                                 var10 = gamecon.method576();
                                 var13 = gamecon.method574();
                                 anIntArray1927[var10] = var13;
                                 anIntArray1925[var10] = var9;
                                 anIntArray1833[var10] = 1;

                                 for(var14 = 0; var14 < 98; ++var14)
									if(var13 >= Class38.anIntArray356[var14])
										anIntArray1833[var10] = var14 + 2;

                                 anIntArray1868[(++anInt1851 - 1) & 31] = var10;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 95) {
                                 anInt2024 = 1;
                                 anInt1846 = anInt1978;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 164) {
                                 var82 = gamecon.method608();
                                 var10 = gamecon.method576();
                                 var13 = gamecon.method588();
                                 if((var10 >= 1) && (var10 <= 8)) {
                                    if(var82.equalsIgnoreCase("null"))
										var82 = null;

                                    aStringArray1918[var10 - 1] = var82;
                                    aBoolArray1919[var10 - 1] = var13 == 0;
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 117) {
                                 var9 = gamecon.method566();
                                 var7 = Class47.method210(var9);

                                 for(var13 = 0; var13 < var7.anIntArray1080.length; ++var13) {
                                    var7.anIntArray1080[var13] = -1;
                                    var7.anIntArray1080[var13] = 0;
                                 }

                                 Class79.method348(var7);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 172) {
                                 var9 = gamecon.method594();
                                 Class80.method352(var9);
                                 anIntArray1973[(++anInt1916 - 1) & 31] = var9 & 32767;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 70) {
                                 var10 = gamecon.method570();
                                 final Class27[] var100 = Class30.method145();
                                 var14 = 0;

                                 Class27 var89;
                                 while(true) {
                                    if(var14 >= var100.length) {
                                       var89 = null;
                                       break;
                                    }

                                    final Class27 var127 = var100[var14];
                                    if(var10 == var127.anInt261) {
                                       var89 = var127;
                                       break;
                                    }

                                    ++var14;
                                 }

                                 Class21.aClass27_222 = var89;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              boolean var98;
                              if(pktOpc == 140) {
                                 var82 = gamecon.method608();
                                 var10 = gamecon.readLEShort();
                                 final byte var102 = gamecon.method565();
                                 var98 = false;
                                 if(var102 == -128)
									var98 = true;

                                 if(var98) {
                                    if(Class89.anInt704 == 0) {
                                       pktOpc = -1;
                                       var87 = true;
                                       break label3291;
                                    }

                                    var106 = false;

                                    for(var15 = 0; (var15 < Class89.anInt704) && (!Class104_Sub13.aClass104_Sub7Array1099[var15].aString947.equals(var82) || (Class104_Sub13.aClass104_Sub7Array1099[var15].anInt950 != var10)); ++var15)
										;

                                    if(var15 < Class89.anInt704) {
                                       while(var15 < (Class89.anInt704 - 1)) {
                                          Class104_Sub13.aClass104_Sub7Array1099[var15] = Class104_Sub13.aClass104_Sub7Array1099[1 + var15];
                                          ++var15;
                                       }

                                       --Class89.anInt704;
                                       Class104_Sub13.aClass104_Sub7Array1099[Class89.anInt704] = null;
                                    }
                                 } else {
                                    gamecon.method608();
                                    final Class104_Sub7 var126 = new Class104_Sub7();
                                    var126.aString947 = var82;
                                    var126.aString948 = Class33.method155(var126.aString947, Class2.aClass101_8);
                                    var126.anInt950 = var10;
                                    var126.aByte949 = var102;

                                    for(var16 = Class89.anInt704 - 1; var16 >= 0; --var16) {
                                       var17 = Class104_Sub13.aClass104_Sub7Array1099[var16].aString948.compareTo(var126.aString947);
                                       if(var17 == 0) {
                                          Class104_Sub13.aClass104_Sub7Array1099[var16].anInt950 = var10;
                                          Class104_Sub13.aClass104_Sub7Array1099[var16].aByte949 = var102;
                                          if(var82.equals(Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.aString1780))
											Class97.aByte766 = var102;

                                          anInt2037 = anInt1978;
                                          pktOpc = -1;
                                          var87 = true;
                                          break label3291;
                                       }

                                       if(var17 < 0)
										break;
                                    }

                                    if(Class89.anInt704 >= Class104_Sub13.aClass104_Sub7Array1099.length) {
                                       pktOpc = -1;
                                       var87 = true;
                                       break label3291;
                                    }

                                    for(var17 = Class89.anInt704 - 1; var17 > var16; --var17)
										Class104_Sub13.aClass104_Sub7Array1099[var17 + 1] = Class104_Sub13.aClass104_Sub7Array1099[var17];

                                    if(Class89.anInt704 == 0)
										Class104_Sub13.aClass104_Sub7Array1099 = new Class104_Sub7[100];

                                    Class104_Sub13.aClass104_Sub7Array1099[1 + var16] = var126;
                                    ++Class89.anInt704;
                                    if(var82.equals(Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.aString1780))
										Class97.aByte766 = var102;
                                 }

                                 anInt2037 = anInt1978;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 25) {
                                 final Class104_Sub21_Sub1 var85 = gamecon;
                                 var10 = pktSize;
                                 final Class104_Sub16 var99 = new Class104_Sub16();
                                 var99.anInt1127 = var85.method570();
                                 var99.anInt1128 = var85.method574();
                                 var99.anIntArray1132 = new int[var99.anInt1127];
                                 var99.anIntArray1129 = new int[var99.anInt1127];
                                 var99.aFieldArray1126 = new Field[var99.anInt1127];
                                 var99.anIntArray1130 = new int[var99.anInt1127];
                                 var99.aMethodArray1133 = new Method[var99.anInt1127];
                                 var99.aByteArrayArrayArray1131 = new byte[var99.anInt1127][][];

                                 for(var14 = 0; var14 < var99.anInt1127; ++var14)
									try {
                                       var15 = var85.method570();
                                       String var110;
                                       if((var15 != 0) && (var15 != 1) && (var15 != 2)) {
                                          if((var15 == 3) || (var15 == 4)) {
                                             var110 = new String(var85.method608());
                                             var112 = new String(var85.method608());
                                             var18 = var85.method570();
                                             final String[] var43 = new String[var18];

                                             for(var20 = 0; var20 < var18; ++var20)
												var43[var20] = new String(var85.method608());

                                             final byte[][] var135 = new byte[var18][];
                                             if(var15 == 3)
												for(int var137 = 0; var137 < var18; ++var137) {
                                                   var45 = var85.method574();
                                                   var135[var137] = new byte[var45];
                                                   var85.method577(var135[var137], 0, var45);
                                                }

                                             var99.anIntArray1132[var14] = var15;
                                             final Class[] var31 = new Class[var18];

                                             for(var45 = 0; var45 < var18; ++var45)
												var31[var45] = Class78.method347(var43[var45]);

                                             var99.aMethodArray1133[var14] = Class78.method347(var110).getDeclaredMethod(var112, var31);
                                             var99.aByteArrayArrayArray1131[var14] = var135;
                                          }
                                       } else {
                                          var110 = new String(var85.method608());
                                          var112 = new String(var85.method608());
                                          var18 = 0;
                                          if(var15 == 1)
											var18 = var85.method574();

                                          var99.anIntArray1132[var14] = var15;
                                          var99.anIntArray1130[var14] = var18;
                                          var99.aFieldArray1126[var14] = Class78.method347(var110).getDeclaredField(var112);
                                       }
                                    } catch (final ClassNotFoundException var63) {
                                       var99.anIntArray1129[var14] = -1;
                                    } catch (final SecurityException var64) {
                                       var99.anIntArray1129[var14] = -2;
                                    } catch (final NullPointerException var65) {
                                       var99.anIntArray1129[var14] = -3;
                                    } catch (final Exception var66) {
                                       var99.anIntArray1129[var14] = -4;
                                    } catch (final Throwable var67) {
                                       var99.anIntArray1129[var14] = -5;
                                    }

                                 Class105.aClass59_825.method248(var99);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 161) {
                                 anInt2018 = 0;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 160) {
                                 anInt1797 = gamecon.method570();
                                 if(anInt1797 == 1)
									anInt1808 = gamecon.readLEShort();

                                 if((anInt1797 >= 2) && (anInt1797 <= 6)) {
                                    if(anInt1797 == 2) {
                                       anInt1813 = 64;
                                       anInt1814 = 64;
                                    }

                                    if(anInt1797 == 3) {
                                       anInt1813 = 0;
                                       anInt1814 = 64;
                                    }

                                    if(anInt1797 == 4) {
                                       anInt1813 = 128;
                                       anInt1814 = 64;
                                    }

                                    if(anInt1797 == 5) {
                                       anInt1813 = 64;
                                       anInt1814 = 0;
                                    }

                                    if(anInt1797 == 6) {
                                       anInt1813 = 64;
                                       anInt1814 = 128;
                                    }

                                    anInt1797 = 2;
                                    anInt1810 = gamecon.readLEShort();
                                    anInt1811 = gamecon.readLEShort();
                                    anInt1812 = gamecon.method570();
                                 }

                                 if(anInt1797 == 10)
									anInt1809 = gamecon.readLEShort();

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 217) {
                                 var9 = gamecon.method566();
                                 var10 = gamecon.readShortN();
                                 var13 = gamecon.readShortN();
                                 var120 = Class47.method210(var9);
                                 var120.anInt1022 = var13 + (var10 << 16);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 102) {
                                 var9 = gamecon.method574();
                                 var10 = gamecon.method594();
                                 if(var10 == '\uffff')
									var10 = -1;

                                 var13 = gamecon.method566();
                                 var120 = Class47.method210(var9);
                                 Class104_Sub18_Sub12 var123;
                                 if(!var120.aBool977) {
                                    if(var10 == -1) {
                                       var120.anInt1010 = 0;
                                       pktOpc = -1;
                                       var87 = true;
                                       break label3291;
                                    }

                                    var123 = Class27.method137(var10);
                                    var120.anInt1010 = 4;
                                    var120.anInt1011 = var10;
                                    var120.anInt1043 = var123.anInt1426;
                                    var120.anInt1019 = var123.anInt1427;
                                    var120.anInt1021 = (var123.anInt1425 * 100) / var13;
                                    Class79.method348(var120);
                                 } else {
                                    var120.anInt986 = var10;
                                    var120.anInt1083 = var13;
                                    var123 = Class27.method137(var10);
                                    var120.anInt1043 = var123.anInt1426;
                                    var120.anInt1019 = var123.anInt1427;
                                    var120.anInt1012 = var123.anInt1446;
                                    var120.anInt1016 = var123.anInt1454;
                                    var120.anInt993 = var123.anInt1430;
                                    var120.anInt1021 = var123.anInt1425;
                                    if(var120.anInt987 > 0)
										var120.anInt1021 = (var120.anInt1021 * 32) / var120.anInt987;

                                    Class79.method348(var120);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              boolean var44;
                              if(pktOpc == 57) {
                                 var82 = gamecon.method608();
                                 var25 = gamecon.method575();
                                 var27 = gamecon.readLEShort();
                                 var38 = gamecon.method614();
                                 var18 = gamecon.method570();
                                 var41 = (var27 << 32) + var38;
                                 var44 = false;

                                 for(var45 = 0; var45 < 100; ++var45)
									if(aLongArray2006[var45] == var41) {
                                       var44 = true;
                                       break;
                                    }

                                 if((var18 <= 1) && Class34.method166(var82))
									var44 = true;

                                 if(!var44 && (anInt1906 == 0)) {
                                    aLongArray2006[anInt2007] = var41;
                                    anInt2007 = (1 + anInt2007) % 100;
                                    final Class104_Sub21_Sub1 var36 = gamecon;

                                    String var33;
                                    try {
                                       int var46 = var36.method599();
                                       if(var46 > 32767)
										var46 = 32767;

                                       final byte[] var47 = new byte[var46];
                                       var36.pos += Class106.aClass49_826.method218(var36.aByteArray1174, var36.pos, var47, 0, var46);
                                       final String var48 = Class104_Sub18_Sub6.method751(var47, 0, var46);
                                       var33 = var48;
                                    } catch (final Exception var56) {
                                       var33 = "Cabbage";
                                    }

                                    var33 = Class104_Sub18_Sub17_Sub2.method879(Class80.method351(var33));
                                    if((var18 != 2) && (var18 != 3)) {
                                       if(var18 == 1)
										Class43.method188(9, Class72.method335(0) + var82, var33, Class32.method151(var25));
									else
										Class43.method188(9, var82, var33, Class32.method151(var25));
                                    } else
										Class43.method188(9, Class72.method335(1) + var82, var33, Class32.method151(var25));
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              String var94;
                              if(pktOpc == 80) {
                                 boolean var115;
                                 for(; gamecon.pos < pktSize;) {
                                    var115 = gamecon.method570() == 1;
                                    var83 = gamecon.method608();
                                    var94 = gamecon.method608();
                                    var14 = gamecon.readLEShort();
                                    var15 = gamecon.method570();
                                    var16 = gamecon.method570();
                                    final boolean var105 = (var16 & 2) != 0;
                                    final boolean var111 = (var16 & 1) != 0;
                                    if(var14 > 0) {
                                       gamecon.method608();
                                       gamecon.method570();
                                       gamecon.method574();
                                    }

                                    gamecon.method608();

                                    for(var19 = 0; var19 < anInt1935; ++var19) {
                                       final Class86 var37 = aClass86Array1972[var19];
                                       if(!var115) {
                                          if(var83.equals(var37.aString675)) {
                                             if(var37.anInt676 != var14) {
                                                var44 = true;

                                                for(Class102_Sub1 var35 = (Class102_Sub1)aClass51_2044.method226(); var35 != null; var35 = (Class102_Sub1)aClass51_2044.method227())
													if(var35.aString894.equals(var83))
														if((var14 != 0) && (var35.aShort893 == 0)) {
													         var35.method467();
													         var44 = false;
													      } else if((var14 == 0) && (var35.aShort893 != 0)) {
													         var35.method467();
													         var44 = false;
													      }

                                                if(var44)
													aClass51_2044.method225(new Class102_Sub1(var83, var14));

                                                var37.anInt676 = var14;
                                             }

                                             var37.aString679 = var94;
                                             var37.anInt677 = var15;
                                             var37.aBool674 = var105;
                                             var37.aBool678 = var111;
                                             var7 = null;
                                             break;
                                          }
                                       } else if(var94.equals(var37.aString675)) {
                                          var37.aString675 = var83;
                                          var37.aString679 = var94;
                                          var7 = null;
                                          break;
                                       }
                                    }
                                 }

                                 anInt2024 = 2;
                                 anInt1846 = anInt1978;
                                 var115 = false;
                                 var10 = anInt1935;

                                 while(var10 > 0) {
                                    var115 = true;
                                    --var10;

                                    for(var13 = 0; var13 < var10; ++var13) {
                                       var98 = false;
                                       final Class86 var121 = aClass86Array1972[var13];
                                       final Class86 var109 = aClass86Array1972[var13 + 1];
                                       if((var121.anInt676 != anInt1939) && (anInt1939 == var109.anInt676))
										var98 = true;

                                       if(!var98 && (var121.anInt676 == 0) && (var109.anInt676 != 0))
										var98 = true;

                                       if(!var98 && !var121.aBool674 && var109.aBool674)
										var98 = true;

                                       if(!var98 && !var121.aBool678 && var109.aBool678)
										var98 = true;

                                       if(var98) {
                                          var22 = aClass86Array1972[var13];
                                          aClass86Array1972[var13] = aClass86Array1972[1 + var13];
                                          aClass86Array1972[var13 + 1] = var22;
                                          var115 = false;
                                       }
                                    }

                                    if(var115)
										break;
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 120) {
                                 anInt2037 = anInt1978;
                                 if(pktSize == 0) {
                                    aString1829 = null;
                                    aString2012 = null;
                                    Class89.anInt704 = 0;
                                    Class104_Sub13.aClass104_Sub7Array1099 = null;
                                    pktOpc = -1;
                                    var87 = true;
                                    break label3291;
                                 }

                                 aString2012 = gamecon.method608();
                                 final long var49 = gamecon.method575();
                                 aString1829 = Class36.method169(var49);
                                 Class103.aByte820 = gamecon.method565();
                                 var13 = gamecon.method570();
                                 if(var13 == 255) {
                                    pktOpc = -1;
                                    var87 = true;
                                    break label3291;
                                 }

                                 Class89.anInt704 = var13;
                                 final Class104_Sub7[] var119 = new Class104_Sub7[100];

                                 for(var15 = 0; var15 < Class89.anInt704; ++var15) {
                                    var119[var15] = new Class104_Sub7();
                                    var119[var15].aString947 = gamecon.method608();
                                    var119[var15].aString948 = Class33.method155(var119[var15].aString947, Class2.aClass101_8);
                                    var119[var15].anInt950 = gamecon.readLEShort();
                                    var119[var15].aByte949 = gamecon.method565();
                                    gamecon.method608();
                                    if(var119[var15].aString947.equals(Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.aString1780))
										Class97.aByte766 = var119[var15].aByte949;
                                 }

                                 var106 = false;
                                 var17 = Class89.anInt704;

                                 while(var17 > 0) {
                                    var106 = true;
                                    --var17;

                                    for(var18 = 0; var18 < var17; ++var18)
										if(var119[var18].aString948.compareTo(var119[1 + var18].aString948) > 0) {
										      final Class104_Sub7 var107 = var119[var18];
										      var119[var18] = var119[var18 + 1];
										      var119[1 + var18] = var107;
										      var106 = false;
										   }

                                    if(var106)
										break;
                                 }

                                 Class104_Sub13.aClass104_Sub7Array1099 = var119;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 29) {
                                 var9 = gamecon.method574();
                                 var10 = gamecon.readLEShort();
                                 if(var9 < -70000)
									var10 += '\u8000';

                                 if(var9 >= 0)
									var92 = Class47.method210(var9);
								else
									var92 = null;

                                 final Class104_Sub2 var118 = (Class104_Sub2)Class104_Sub2.aClass58_857.method241(var10);
                                 if(null != var118)
									for(var15 = 0; var15 < var118.anIntArray856.length; ++var15) {
                                       var118.anIntArray856[var15] = -1;
                                       var118.anIntArray858[var15] = 0;
                                    }

                                 var14 = gamecon.readLEShort();

                                 for(var15 = 0; var15 < var14; ++var15) {
                                    var16 = gamecon.method588();
                                    if(var16 == 255)
										var16 = gamecon.method566();

                                    var17 = gamecon.readShort();
                                    if((null != var92) && (var15 < var92.anIntArray1080.length)) {
                                       var92.anIntArray1080[var15] = var17;
                                       var92.anIntArray1081[var15] = var16;
                                    }

                                    Class104_Sub18_Sub16_Sub2.method809(var10, var15, var17 - 1, var16);
                                 }

                                 if(null != var92)
									Class79.method348(var92);

                                 Class66.method301();
                                 anIntArray1973[(++anInt1916 - 1) & 31] = var10 & 32767;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 131) {
                                 Class93.anInt742 = gamecon.readByteN();
                                 Class19.anInt195 = gamecon.method576();

                                 while(gamecon.pos < pktSize) {
                                    pktOpc = gamecon.method570();
                                    Class9.method35();
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 169) {
                                 aBool2034 = true;
                                 Class30.anInt287 = gamecon.method570();
                                 Class43.anInt375 = gamecon.method570();
                                 Class61_Sub1.anInt892 = gamecon.readLEShort();
                                 Class104_Sub6.anInt944 = gamecon.method570();
                                 Class75.anInt598 = gamecon.method570();
                                 if(Class75.anInt598 >= 100) {
                                    Class85.anInt672 = (Class30.anInt287 * 128) + 64;
                                    Class99.anInt793 = 64 + (Class43.anInt375 * 128);
                                    Class46.anInt403 = Class47.method211(Class85.anInt672, Class99.anInt793, Class12.anInt73) - Class61_Sub1.anInt892;
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 72) {
                                 for(var9 = 0; var9 < aClass104_Sub18_Sub16_Sub7_Sub1Array1937.length; ++var9)
									if(aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var9] != null)
										aClass104_Sub18_Sub16_Sub7_Sub1Array1937[var9].anInt1722 = -1;

                                 for(var9 = 0; var9 < aClass104_Sub18_Sub16_Sub7_Sub2Array1828.length; ++var9)
									if(aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var9] != null)
										aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var9].anInt1722 = -1;

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 50) {
                                 var9 = gamecon.method573();
                                 var10 = gamecon.readLEShort();
                                 var92 = Class47.method210(var9);
                                 if((null != var92) && (var92.anInt980 == 0)) {
                                    if(var10 > (var92.anInt994 - var92.anInt988))
										var10 = var92.anInt994 - var92.anInt988;

                                    if(var10 < 0)
										var10 = 0;

                                    if(var10 != var92.anInt992) {
                                       var92.anInt992 = var10;
                                       Class79.method348(var92);
                                    }
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 26) {
                                 var9 = gamecon.method594();
                                 var10 = gamecon.readLEShort();
                                 var13 = gamecon.method566();
                                 var14 = gamecon.readLEShort();
                                 final Class104_Sub12 var24 = Class47.method210(var13);
                                 if((var9 != var24.anInt1043) || (var14 != var24.anInt1019) || (var24.anInt1021 != var10)) {
                                    var24.anInt1043 = var9;
                                    var24.anInt1019 = var14;
                                    var24.anInt1021 = var10;
                                    Class79.method348(var24);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 97) {
                                 anInt1879 = gamecon.method594() * 30;
                                 anInt1980 = anInt1978;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 251) {
                                 var9 = gamecon.readLEShort();
                                 var10 = gamecon.readInt();
                                 var92 = Class47.method210(var10);
                                 if((var92.anInt1010 != 1) || (var9 != var92.anInt1011)) {
                                    var92.anInt1010 = 1;
                                    var92.anInt1011 = var9;
                                    Class79.method348(var92);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 229) {
                                 var9 = gamecon.readLEShort();
                                 var10 = gamecon.method570();
                                 var13 = gamecon.readLEShort();
                                 if((anInt1827 != 0) && (var10 != 0) && (anInt2028 < 50)) {
                                    anIntArray2029[anInt2028] = var9;
                                    anIntArray1875[anInt2028] = var10;
                                    anIntArray2031[anInt2028] = var13;
                                    aClass82Array2033[anInt2028] = null;
                                    anIntArray2032[anInt2028] = 0;
                                    ++anInt2028;
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 142) {
                                 while(gamecon.pos < pktSize) {
                                    var9 = gamecon.method570();
                                    var103 = (var9 & 1) == 1;
                                    var94 = gamecon.method608();
                                    var117 = gamecon.method608();
                                    gamecon.method608();

                                    for(var15 = 0; var15 < anInt2045; ++var15) {
                                       final Class78 var21 = aClass78Array2046[var15];
                                       if(var103) {
                                          if(var117.equals(var21.aString625)) {
                                             var21.aString625 = var94;
                                             var21.aString624 = var117;
                                             var92 = null;
                                             break;
                                          }
                                       } else if(var94.equals(var21.aString625)) {
                                          var21.aString625 = var94;
                                          var21.aString624 = var117;
                                          var92 = null;
                                          break;
                                       }
                                    }
                                 }

                                 anInt1846 = anInt1978;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 171) {
                                 var9 = gamecon.method573();
                                 var7 = Class47.method210(var9);
                                 var7.anInt1010 = 3;
                                 var7.anInt1011 = Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.aClass85_1770.method390();
                                 Class79.method348(var7);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 198) {
                                 aBool2034 = false;

                                 for(var9 = 0; var9 < 5; ++var9)
									aBoolArray2036[var9] = false;

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 211) {
                                 var9 = gamecon.readShort();
                                 if(var9 == '\uffff')
									var9 = -1;

                                 Class67.method317(var9);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 53) {
                                 var9 = gamecon.method594();
                                 if(var9 == '\uffff')
									var9 = -1;

                                 var10 = gamecon.method567();
                                 if((anInt2022 != 0) && (var9 != -1)) {
                                    Class87.method400(Class106.aClass61_Sub1_827, var9, 0, anInt2022, false);
                                    aBool2041 = true;
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 111) {
                                 for(var9 = 0; var9 < Class71.anIntArray576.length; ++var9)
									if(Class71.anIntArray576[var9] != Class71.anIntArray577[var9]) {
                                       Class71.anIntArray576[var9] = Class71.anIntArray577[var9];
                                       Class46.method204(var9);
                                       anIntArray1971[(++anInt1948 - 1) & 31] = var9;
                                    }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 167) {
                                 anInt1904 = 0;
                                 anInt1910 = 0;
                                 gamecon.method624();
                                 var9 = gamecon.method625(8);
                                 if(var9 < anInt1832)
									for(var10 = var9; var10 < anInt1832; ++var10)
										anIntArray2048[++anInt1904 - 1] = anIntArray1830[var10];

                                 if(var9 > anInt1832)
									throw new RuntimeException("");

                                 anInt1832 = 0;

                                 for(var10 = 0; var10 < var9; ++var10) {
                                    var13 = anIntArray1830[var10];
                                    final Class104_Sub18_Sub16_Sub7_Sub2 var23 = aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var13];
                                    var15 = gamecon.method625(1);
                                    if(var15 == 0) {
                                       anIntArray1830[++anInt1832 - 1] = var13;
                                       var23.anInt1739 = anInt1799;
                                    } else {
                                       var16 = gamecon.method625(2);
                                       if(var16 == 0) {
                                          anIntArray1830[++anInt1832 - 1] = var13;
                                          var23.anInt1739 = anInt1799;
                                          anIntArray1911[++anInt1910 - 1] = var13;
                                       } else if(var16 == 1) {
                                          anIntArray1830[++anInt1832 - 1] = var13;
                                          var23.anInt1739 = anInt1799;
                                          var17 = gamecon.method625(3);
                                          var23.method934(var17, false);
                                          var18 = gamecon.method625(1);
                                          if(var18 == 1)
											anIntArray1911[++anInt1910 - 1] = var13;
                                       } else if(var16 == 2) {
                                          anIntArray1830[++anInt1832 - 1] = var13;
                                          var23.anInt1739 = anInt1799;
                                          var17 = gamecon.method625(3);
                                          var23.method934(var17, true);
                                          var18 = gamecon.method625(3);
                                          var23.method934(var18, true);
                                          var19 = gamecon.method625(1);
                                          if(var19 == 1)
											anIntArray1911[++anInt1910 - 1] = var13;
                                       } else if(var16 == 3)
										anIntArray2048[++anInt1904 - 1] = var13;
                                    }
                                 }

                                 Class2_Sub2.method483();
                                 Class7.method33();

                                 for(var9 = 0; var9 < anInt1904; ++var9) {
                                    var10 = anIntArray2048[var9];
                                    if(aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var10].anInt1739 != anInt1799) {
                                       aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var10].aClass104_Sub18_Sub2_1788 = null;
                                       aClass104_Sub18_Sub16_Sub7_Sub2Array1828[var10] = null;
                                    }
                                 }

                                 if(gamecon.pos != pktSize)
									throw new RuntimeException(gamecon.pos + "," + pktSize);

                                 for(var9 = 0; var9 < anInt1832; ++var9)
									if(null == aClass104_Sub18_Sub16_Sub7_Sub2Array1828[anIntArray1830[var9]])
										throw new RuntimeException(var9 + "," + anInt1832);

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 197) {
                                 var82 = gamecon.method608();
                                 var10 = gamecon.method573();
                                 var92 = Class47.method210(var10);
                                 if(!var82.equals(var92.aString1025)) {
                                    var92.aString1025 = var82;
                                    Class79.method348(var92);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              Class104_Sub9.method520("" + pktOpc + "," + anInt2042 + "," + anInt1815 + "," + pktSize, (Throwable)null);
                              Class61_Sub1.method494();
                           } catch (final IOException var68) {
                              if(anInt1836 > 0)
								Class61_Sub1.method494();
							else {
                                 Class10.method40(40);
                                 Class57.aClass13_467 = Class20.stream;
                                 Class20.stream = null;
                              }
                           } catch (final Exception var69) {
                              var82 = "" + pktOpc + "," + anInt2042 + "," + anInt1815 + "," + pktSize + "," + (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1745[0] + Class53.anInt436) + "," + (Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1746[0] + Class20.anInt206) + ",";

                              for(var10 = 0; (var10 < pktSize) && (var10 < 50); ++var10)
								var82 = var82 + gamecon.aByteArray1174[var10] + ",";

                              Class104_Sub9.method520(var82, var69);
                              Class61_Sub1.method494();
                           }

                           var87 = true;
                        }

                     if(!var87)
						break;
                  }

                  if(anInt1806 == 30) {
                     Class43.method185(secureBuf, 108);
                     final Object var76 = Class2_Sub2.aClass72_865.anObject583;
                     synchronized(var76) {
                        if(!aBool1979)
							Class2_Sub2.aClass72_865.anInt581 = 0;
						else if((Class14.anInt100 != 0) || (Class2_Sub2.aClass72_865.anInt581 >= 40)) {
                           secureBuf.method623(72);
                           secureBuf.writebyte(0);
                           var5 = secureBuf.pos;
                           var11 = 0;

                           for(var9 = 0; (var9 < Class2_Sub2.aClass72_865.anInt581) && ((secureBuf.pos - var5) < 240); ++var9) {
                              ++var11;
                              var10 = Class2_Sub2.aClass72_865.anIntArray580[var9];
                              if(var10 < 0)
								var10 = 0;
							else if(var10 > 502)
								var10 = 502;

                              var13 = Class2_Sub2.aClass72_865.anIntArray582[var9];
                              if(var13 < 0)
								var13 = 0;
							else if(var13 > 764)
								var13 = 764;

                              var14 = (var10 * 765) + var13;
                              if((Class2_Sub2.aClass72_865.anIntArray580[var9] == -1) && (Class2_Sub2.aClass72_865.anIntArray582[var9] == -1)) {
                                 var13 = -1;
                                 var10 = -1;
                                 var14 = 524287;
                              }

                              if((var13 == anInt1801) && (var10 == anInt1802)) {
                                 if(anInt1803 < 2047)
									++anInt1803;
                              } else {
                                 var15 = var13 - anInt1801;
                                 anInt1801 = var13;
                                 var16 = var10 - anInt1802;
                                 anInt1802 = var10;
                                 if((anInt1803 < 8) && (var15 >= -32) && (var15 <= 31) && (var16 >= -32) && (var16 <= 31)) {
                                    var15 += 32;
                                    var16 += 32;
                                    secureBuf.writeShort(var16 + (anInt1803 << 12) + (var15 << 6));
                                    anInt1803 = 0;
                                 } else if(anInt1803 < 8) {
                                    secureBuf.method587(var14 + (anInt1803 << 19) + 8388608);
                                    anInt1803 = 0;
                                 } else {
                                    secureBuf.writeInt((anInt1803 << 19) + -1073741824 + var14);
                                    anInt1803 = 0;
                                 }
                              }
                           }

                           secureBuf.method613(secureBuf.pos - var5);
                           if(var11 >= Class2_Sub2.aClass72_865.anInt581)
							Class2_Sub2.aClass72_865.anInt581 = 0;
						else {
                              Class2_Sub2.aClass72_865.anInt581 -= var11;

                              for(var9 = 0; var9 < Class2_Sub2.aClass72_865.anInt581; ++var9) {
                                 Class2_Sub2.aClass72_865.anIntArray582[var9] = Class2_Sub2.aClass72_865.anIntArray582[var9 + var11];
                                 Class2_Sub2.aClass72_865.anIntArray580[var9] = Class2_Sub2.aClass72_865.anIntArray580[var9 + var11];
                              }
                           }
                        }
                     }

                     if(Class14.anInt100 != 0) {
                        long var52 = (Class14.aLong103 - aLong1800) / 50L;
                        if(var52 > 4095L)
							var52 = 4095L;

                        aLong1800 = Class14.aLong103;
                        var11 = Class14.anInt102;
                        if(var11 < 0)
							var11 = 0;
						else if(var11 > 502)
							var11 = 502;

                        var9 = Class14.anInt101;
                        if(var9 < 0)
							var9 = 0;
						else if(var9 > 764)
							var9 = 764;

                        var10 = var9 + (var11 * 765);
                        byte var128 = 0;
                        if(Class14.anInt100 == 2)
							var128 = 1;

                        var14 = (int)var52;
                        secureBuf.method623(161);
                        secureBuf.method612((var14 << 20) + (var128 << 19) + var10);
                     }

                     if(anInt1878 > 0)
						--anInt1878;

                     if(Class25.aBoolArray249[96] || Class25.aBoolArray249[97] || Class25.aBoolArray249[98] || Class25.aBoolArray249[99])
						aBool1791 = true;

                     if(aBool1791 && (anInt1878 <= 0)) {
                        anInt1878 = 20;
                        aBool1791 = false;
                        secureBuf.method623(79);
                        secureBuf.method606(anInt1962);
                        secureBuf.method591(anInt1866);
                     }

                     if(Class100.aBool799 && !aBool1945) {
                        aBool1945 = true;
                        secureBuf.method623(178);
                        secureBuf.writebyte(1);
                     }

                     if(!Class100.aBool799 && aBool1945) {
                        aBool1945 = false;
                        secureBuf.method623(178);
                        secureBuf.writebyte(0);
                     }

                     if(aBool1794 && (anInt1988 != Class12.anInt73))
						Class19.method120(Class54.anInt447, Class96.anInt761, Class12.anInt73, Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1745[0], Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1746[0]);
					else if(anInt2013 != Class12.anInt73) {
                        anInt2013 = Class12.anInt73;
                        var8 = Class12.anInt73;
                        final int[] var71 = Class104_Sub2.aClass104_Sub18_Sub17_Sub1_861.anIntArray1592;
                        var11 = var71.length;

                        for(var9 = 0; var9 < var11; ++var9)
							var71[var9] = 0;

                        var9 = 1;

                        while(true) {
                           if(var9 >= 103) {
                              var9 = (((238 + (int)(Math.random() * 20.0D)) - 10) << 16) + (((238 + (int)(Math.random() * 20.0D)) - 10) << 8) + ((238 + (int)(Math.random() * 20.0D)) - 10);
                              var10 = ((238 + (int)(Math.random() * 20.0D)) - 10) << 16;
                              Class104_Sub2.aClass104_Sub18_Sub17_Sub1_861.method833();

                              for(var13 = 1; var13 < 103; ++var13)
								for(var14 = 1; var14 < 103; ++var14) {
                                    if((Class76.aByteArrayArrayArray600[var8][var14][var13] & 24) == 0)
										Class44.method191(var8, var14, var13, var9, var10);

                                    if((var8 < 3) && ((Class76.aByteArrayArrayArray600[var8 + 1][var14][var13] & 8) != 0))
										Class44.method191(var8 + 1, var14, var13, var9, var10);
                                 }

                              anInt2014 = 0;

                              for(var13 = 0; var13 < 104; ++var13)
								for(var14 = 0; var14 < 104; ++var14) {
                                    var15 = Class81.aClass17_643.method88(Class12.anInt73, var13, var14);
                                    if(var15 != 0) {
                                       var15 = (var15 >> 14) & 32767;
                                       var16 = Class104_Sub18_Sub12.method782(var15).anInt1351;
                                       if(var16 >= 0) {
                                          var17 = var13;
                                          var18 = var14;
                                          if((var16 != 22) && (var16 != 29) && (var16 != 34) && (var16 != 36) && (var16 != 46) && (var16 != 47) && (var16 != 48)) {
                                             final int[][] var130 = aClass67Array1975[Class12.anInt73].anIntArrayArray553;

                                             for(var45 = 0; var45 < 10; ++var45) {
                                                var32 = (int)(Math.random() * 4.0D);
                                                if((var32 == 0) && (var17 > 0) && (var17 > (var13 - 3)) && ((var130[var17 - 1][var18] & 19661064) == 0))
													--var17;

                                                if((var32 == 1) && (var17 < 103) && (var17 < (3 + var13)) && ((var130[var17 + 1][var18] & 19661184) == 0))
													++var17;

                                                if((var32 == 2) && (var18 > 0) && (var18 > (var14 - 3)) && ((var130[var17][var18 - 1] & 19661058) == 0))
													--var18;

                                                if((var32 == 3) && (var18 < 103) && (var18 < (3 + var14)) && ((var130[var17][var18 + 1] & 19661088) == 0))
													++var18;
                                             }
                                          }

                                          aClass104_Sub18_Sub17_Sub1Array2017[anInt2014] = Class104_Sub23.aClass104_Sub18_Sub17_Sub1Array1183[var16];
                                          anIntArray2015[anInt2014] = var17;
                                          anIntArray2016[anInt2014] = var18;
                                          ++anInt2014;
                                       }
                                    }
                                 }

                              aClass2_1764.method18();
                              break;
                           }

                           var10 = (2048 * (103 - var9)) + 24628;

                           for(var13 = 1; var13 < 103; ++var13) {
                              if((Class76.aByteArrayArrayArray600[var8][var13][var9] & 24) == 0)
								Class81.aClass17_643.method92(var71, var10, 512, var8, var13, var9);

                              if((var8 < 3) && ((Class76.aByteArrayArrayArray600[1 + var8][var13][var9] & 8) != 0))
								Class81.aClass17_643.method92(var71, var10, 512, 1 + var8, var13, var9);

                              var10 += 4;
                           }

                           ++var9;
                        }
                     }

                     if(anInt1806 == 30) {
                        for(Class104_Sub3 var78 = (Class104_Sub3)aClass59_1922.method251(); null != var78; var78 = (Class104_Sub3)aClass59_1922.method252()) {
                           if(var78.anInt878 > 0)
							--var78.anInt878;

                           if(var78.anInt878 == 0) {
                              if((var78.anInt867 < 0) || Class36.method173(var78.anInt867, var78.anInt873)) {
                                 Class64.method295(var78.anInt876, var78.anInt868, var78.anInt871, var78.anInt870, var78.anInt867, var78.anInt872, var78.anInt873);
                                 var78.method470();
                              }
                           } else {
                              if(var78.anInt877 > 0)
								--var78.anInt877;

                              if((var78.anInt877 == 0) && (var78.anInt871 >= 1) && (var78.anInt870 >= 1) && (var78.anInt871 <= 102) && (var78.anInt870 <= 102) && ((var78.anInt874 < 0) || Class36.method173(var78.anInt874, var78.anInt869))) {
                                 Class64.method295(var78.anInt876, var78.anInt868, var78.anInt871, var78.anInt870, var78.anInt874, var78.anInt875, var78.anInt869);
                                 var78.anInt877 = -1;
                                 if((var78.anInt874 == var78.anInt867) && (var78.anInt867 == -1))
									var78.method470();
								else if((var78.anInt874 == var78.anInt867) && (var78.anInt872 == var78.anInt875) && (var78.anInt873 == var78.anInt869))
									var78.method470();
                              }
                           }
                        }

                        for(var8 = 0; var8 < anInt2028; ++var8) {
                           --anIntArray2031[var8];
                           if(anIntArray2031[var8] >= -10) {
                              Class82 var72 = aClass82Array2033[var8];
                              if(null == var72) {
                                 var72 = Class82.method359(Class103.aClass61_Sub1_818, anIntArray2029[var8], 0);
                                 if(var72 == null)
									continue;

                                 anIntArray2031[var8] += var72.method357();
                                 aClass82Array2033[var8] = var72;
                              }

                              if(anIntArray2031[var8] < 0) {
                                 if(anIntArray2032[var8] != 0) {
                                    var9 = (anIntArray2032[var8] & 255) * 128;
                                    var10 = (anIntArray2032[var8] >> 16) & 255;
                                    var13 = ((128 * var10) + 64) - Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695;
                                    if(var13 < 0)
										var13 = -var13;

                                    var14 = (anIntArray2032[var8] >> 8) & 255;
                                    var15 = ((var14 * 128) + 64) - Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694;
                                    if(var15 < 0)
										var15 = -var15;

                                    var16 = (var13 + var15) - 128;
                                    if(var16 > var9) {
                                       anIntArray2031[var8] = -100;
                                       continue;
                                    }

                                    if(var16 < 0)
										var16 = 0;

                                    var11 = (anInt2026 * (var9 - var16)) / var9;
                                 } else
									var11 = anInt1827;

                                 if(var11 > 0) {
                                    final Class104_Sub4_Sub1 var93 = var72.method356().method689(RSBuf.aClass84_1175);
                                    final Class104_Sub8_Sub3 var91 = Class104_Sub8_Sub3.method727(var93, 100, var11);
                                    var91.method692(anIntArray1875[var8] - 1);
                                    Class79.aClass104_Sub8_Sub2_630.method666(var91);
                                 }

                                 anIntArray2031[var8] = -100;
                              }
                           } else {
                              --anInt2028;

                              for(var5 = var8; var5 < anInt2028; ++var5) {
                                 anIntArray2029[var5] = anIntArray2029[1 + var5];
                                 aClass82Array2033[var5] = aClass82Array2033[var5 + 1];
                                 anIntArray1875[var5] = anIntArray1875[1 + var5];
                                 anIntArray2031[var5] = anIntArray2031[var5 + 1];
                                 anIntArray2032[var5] = anIntArray2032[1 + var5];
                              }

                              --var8;
                           }
                        }

                        if(aBool2041 && !Class104_Sub18_Sub5.method733()) {
                           if((anInt2022 != 0) && (anInt2023 != -1))
							Class87.method400(Class27.aClass61_Sub1_264, anInt2023, 0, anInt2022, false);

                           aBool2041 = false;
                        }

                        ++anInt1834;
                        if(anInt1834 > 750) {
                           if(anInt1836 > 0)
							Class61_Sub1.method494();
						else {
                              Class10.method40(40);
                              Class57.aClass13_467 = Class20.stream;
                              Class20.stream = null;
                           }
                        } else {
                           Class104_Sub12.method537();
                           Class76.method344();
                           Class2_Sub2.method484();
                           ++anInt1867;
                           if(anInt1898 != 0) {
                              anInt1897 += 20;
                              if(anInt1897 >= 400)
								anInt1898 = 0;
                           }

                           if(null != Class30.aClass104_Sub12_288) {
                              ++anInt1899;
                              if(anInt1899 >= 15) {
                                 Class79.method348(Class30.aClass104_Sub12_288);
                                 Class30.aClass104_Sub12_288 = null;
                              }
                           }

                           Class104_Sub12 var79;
                           boolean var113;
                           if(Class67.aClass104_Sub12_556 != null) {
                              Class79.method348(Class67.aClass104_Sub12_556);
                              ++anInt1793;
                              if((Class14.anInt91 > (anInt1902 + 5)) || (Class14.anInt91 < (anInt1902 - 5)) || (Class14.anInt95 > (5 + anInt1903)) || (Class14.anInt95 < (anInt1903 - 5)))
								aBool1905 = true;

                              if(Class14.anInt93 == 0) {
                                 if(aBool1905 && (anInt1793 >= 5)) {
                                    if((Class67.aClass104_Sub12_556 == Class89.aClass104_Sub12_705) && (anInt1924 != anInt1901)) {
                                       var79 = Class67.aClass104_Sub12_556;
                                       byte var134 = 0;
                                       if((anInt1839 == 1) && (var79.anInt982 == 206))
										var134 = 1;

                                       if(var79.anIntArray1080[anInt1924] <= 0)
										var134 = 0;

                                       var9 = Class104_Sub3.method485(var79);
                                       var113 = ((var9 >> 29) & 1) != 0;
                                       if(var113) {
                                          var10 = anInt1901;
                                          var13 = anInt1924;
                                          var79.anIntArray1080[var13] = var79.anIntArray1080[var10];
                                          var79.anIntArray1081[var13] = var79.anIntArray1081[var10];
                                          var79.anIntArray1080[var10] = -1;
                                          var79.anIntArray1081[var10] = 0;
                                       } else if(var134 == 1) {
                                          var10 = anInt1901;
                                          var13 = anInt1924;

                                          while(var13 != var10)
											if(var10 > var13) {
                                                var79.method530(var10 - 1, var10);
                                                --var10;
                                             } else if(var10 < var13) {
                                                var79.method530(1 + var10, var10);
                                                ++var10;
                                             }
                                       } else
										var79.method530(anInt1924, anInt1901);

                                       secureBuf.method623(2);
                                       secureBuf.method612(Class67.aClass104_Sub12_556.anInt978);
                                       secureBuf.method592(anInt1924);
                                       secureBuf.method585(var134);
                                       secureBuf.method606(anInt1901);
                                    }
                                 } else if(((anInt1920 == 1) || Class43.method187(anInt1805 - 1)) && (anInt1805 > 2))
									Class36.method170();
								else if(anInt1805 > 0)
									Class78.method346(anInt1805 - 1);

                                 anInt1899 = 10;
                                 Class14.anInt100 = 0;
                                 Class67.aClass104_Sub12_556 = null;
                              }
                           }

                           var79 = Class76.aClass104_Sub12_619;
                           final Class104_Sub12 var75 = Class20.aClass104_Sub12_207;
                           Class76.aClass104_Sub12_619 = null;
                           Class20.aClass104_Sub12_207 = null;
                           aClass104_Sub12_1961 = null;
                           aBool1965 = false;
                           aBool1987 = false;
                           anInt2008 = 0;

                           while(true) {
                              final Class25 var96 = Class25.aClass25_248;
                              synchronized(var96) {
                                 if(Class25.anInt246 == Class25.anInt254)
									var113 = false;
								else {
                                    Class80.anInt633 = Class25.anIntArray253[Class25.anInt254];
                                    Class50.aChar423 = Class25.aCharArray252[Class25.anInt254];
                                    Class25.anInt254 = (1 + Class25.anInt254) & 127;
                                    var113 = true;
                                 }
                              }

                              if(!var113 || (anInt2008 >= 128)) {
                                 Class97.method438(anInt1947, 0, 0, 765, 503, 0, 0);
                                 ++anInt1978;

                                 while(true) {
                                    Class104_Sub6 var80;
                                    Class104_Sub12 var97;
                                    do {
                                       var80 = (Class104_Sub6)aClass59_1985.method250();
                                       if(null == var80)
										while(true) {
                                             do {
                                                var80 = (Class104_Sub6)aClass59_1957.method250();
                                                if(var80 == null)
													while(true) {
													      do {
													         var80 = (Class104_Sub6)aClass59_1984.method250();
													         if(null == var80) {
													            if(null != aClass104_Sub12_1958) {
													               Class79.method348(aClass104_Sub12_1958);
													               ++Class89.anInt703;
													               if(aBool1965 && aBool1987) {
													                  var11 = Class14.anInt91;
													                  var9 = Class14.anInt95;
													                  var11 -= anInt1976;
													                  var9 -= anInt1960;
													                  if(var11 < anInt2035)
																		var11 = anInt2035;

													                  if((var11 + aClass104_Sub12_1958.anInt987) > (anInt2035 + aClass104_Sub12_2019.anInt987))
																		var11 = (aClass104_Sub12_2019.anInt987 + anInt2035) - aClass104_Sub12_1958.anInt987;

													                  if(var9 < anInt1964)
																		var9 = anInt1964;

													                  if((aClass104_Sub12_1958.anInt988 + var9) > (anInt1964 + aClass104_Sub12_2019.anInt988))
																		var9 = (anInt1964 + aClass104_Sub12_2019.anInt988) - aClass104_Sub12_1958.anInt988;

													                  var10 = var11 - anInt1966;
													                  var13 = var9 - anInt1967;
													                  var14 = aClass104_Sub12_1958.anInt1041;
													                  if((Class89.anInt703 > aClass104_Sub12_1958.anInt1082) && ((var10 > var14) || (var10 < -var14) || (var13 > var14) || (var13 < -var14)))
																		aBool1804 = true;

													                  var15 = (var11 - anInt2035) + aClass104_Sub12_2019.anInt991;
													                  var16 = aClass104_Sub12_2019.anInt992 + (var9 - anInt1964);
													                  Class104_Sub6 var125;
													                  if((aClass104_Sub12_1958.anObjectArray976 != null) && aBool1804) {
													                     var125 = new Class104_Sub6();
													                     var125.aClass104_Sub12_938 = aClass104_Sub12_1958;
													                     var125.anInt937 = var15;
													                     var125.anInt935 = var16;
													                     var125.anObjectArray936 = aClass104_Sub12_1958.anObjectArray976;
													                     Class46.method203(var125);
													                  }

													                  if(Class14.anInt93 == 0) {
													                     if(aBool1804) {
													                        if(null != aClass104_Sub12_1958.anObjectArray1055) {
													                           var125 = new Class104_Sub6();
													                           var125.aClass104_Sub12_938 = aClass104_Sub12_1958;
													                           var125.anInt937 = var15;
													                           var125.anInt935 = var16;
													                           var125.aClass104_Sub12_940 = aClass104_Sub12_1961;
													                           var125.anObjectArray936 = aClass104_Sub12_1958.anObjectArray1055;
													                           Class46.method203(var125);
													                        }

													                        if(aClass104_Sub12_1961 != null) {
													                           Class104_Sub12 var136 = aClass104_Sub12_1958;
													                           var19 = Class25.method130(Class104_Sub3.method485(var136), 1430389992);
													                           if(var19 == 0)
																				var22 = null;
																			else {
													                              var20 = 0;

													                              while(true) {
													                                 if(var20 >= var19)
																						break;

													                                 var136 = Class47.method210(var136.anInt1091);
													                                 if(var136 == null) {
													                                    var22 = null;
													                                    break;
													                                 }

													                                 ++var20;
													                              }
													                           }
													                        }
													                     } else if(((anInt1920 == 1) || Class43.method187(anInt1805 - 1)) && (anInt1805 > 2))
																			Class36.method170();
																		else if(anInt1805 > 0)
																			Class78.method346(anInt1805 - 1);

													                     aClass104_Sub12_1958 = null;
													                  }
													               } else if(Class89.anInt703 > 1)
																	aClass104_Sub12_1958 = null;
													            }

													            if(Class17.anInt117 != -1) {
													               var11 = Class17.anInt117;
													               var9 = Class17.anInt159;
													               var103 = Class104_Sub13.method543(Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1745[0], Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anIntArray1746[0], var11, var9, true, 0, 0, 0, 0, 0, 0);
													               Class17.anInt117 = -1;
													               if(var103) {
													                  anInt1895 = Class14.anInt101;
													                  anInt1896 = Class14.anInt102;
													                  anInt1898 = 1;
													                  anInt1897 = 0;
													               }
													            }

													            if((null == Class67.aClass104_Sub12_556) && (null == aClass104_Sub12_1958)) {
													               var11 = Class14.anInt100;
													               if(aBool1930) {
													                  if(var11 != 1) {
													                     var9 = Class14.anInt91;
													                     var10 = Class14.anInt95;
													                     if((var9 < (Class50.anInt422 - 10)) || (var9 > (Class12.anInt74 + Class50.anInt422 + 10)) || (var10 < (Class36.anInt349 - 10)) || (var10 > (Class78.anInt627 + Class36.anInt349 + 10))) {
													                        aBool1930 = false;
													                        Class44.method192(Class50.anInt422, Class36.anInt349, Class12.anInt74, Class78.anInt627);
													                     }
													                  }

													                  if(var11 == 1) {
													                     var9 = Class50.anInt422;
													                     var10 = Class36.anInt349;
													                     var13 = Class12.anInt74;
													                     var14 = Class14.anInt101;
													                     var15 = Class14.anInt102;
													                     var16 = -1;

													                     for(var17 = 0; var17 < anInt1805; ++var17) {
													                        var18 = ((anInt1805 - 1 - var17) * 15) + 31 + var10;
													                        if((var14 > var9) && (var14 < (var13 + var9)) && (var15 > (var18 - 13)) && (var15 < (var18 + 3)))
																				var16 = var17;
													                     }

													                     if(var16 != -1)
																			Class78.method346(var16);

													                     aBool1930 = false;
													                     Class44.method192(Class50.anInt422, Class36.anInt349, Class12.anInt74, Class78.anInt627);
													                  }
													               } else
																	label3378: {
													                     if((var11 == 1) && (anInt1805 > 0)) {
													                        var9 = anIntArray1933[anInt1805 - 1];
													                        if((var9 == 39) || (var9 == 40) || (var9 == 41) || (var9 == 42) || (var9 == 43) || (var9 == 33) || (var9 == 34) || (var9 == 35) || (var9 == 36) || (var9 == 37) || (var9 == 38) || (var9 == 1005))
																				label3386: {
																				      var10 = anIntArray1931[anInt1805 - 1];
																				      var13 = anIntArray1932[anInt1805 - 1];
																				      var120 = Class47.method210(var13);
																				      if(!Class39.method180(Class104_Sub3.method485(var120))) {
																				         var16 = Class104_Sub3.method485(var120);
																				         var106 = ((var16 >> 29) & 1) != 0;
																				         if(!var106)
																							break label3386;
																				      }

																				      aBool1905 = false;
																				      anInt1793 = 0;
																				      if(Class67.aClass104_Sub12_556 != null)
																						Class79.method348(Class67.aClass104_Sub12_556);

																				      Class67.aClass104_Sub12_556 = Class47.method210(var13);
																				      anInt1901 = var10;
																				      anInt1902 = Class14.anInt101;
																				      anInt1903 = Class14.anInt102;
																				      Class79.method348(Class67.aClass104_Sub12_556);
																				      break label3378;
																				   }
													                     }

													                     if((var11 == 1) && (((anInt1920 == 1) && (anInt1805 > 2)) || Class43.method187(anInt1805 - 1)))
																			var11 = 2;

													                     if((var11 == 1) && (anInt1805 > 0))
																			Class78.method346(anInt1805 - 1);

													                     if((var11 == 2) && (anInt1805 > 0))
																			Class36.method170();
													                  }
													            }

													            if(var79 != Class76.aClass104_Sub12_619) {
													               if(null != var79)
																	Class79.method348(var79);

													               if(Class76.aClass104_Sub12_619 != null)
																	Class79.method348(Class76.aClass104_Sub12_619);
													            }

													            if((var75 != Class20.aClass104_Sub12_207) && (anInt1940 == anInt1864)) {
													               if(var75 != null)
																	Class79.method348(var75);

													               if(Class20.aClass104_Sub12_207 != null)
																	Class79.method348(Class20.aClass104_Sub12_207);
													            }

													            if(null != Class20.aClass104_Sub12_207) {
													               if(anInt1864 < anInt1940) {
													                  ++anInt1864;
													                  if(anInt1864 == anInt1940)
																		Class79.method348(Class20.aClass104_Sub12_207);
													               }
													            } else if(anInt1864 > 0)
																	--anInt1864;

													            var11 = anInt1986 + Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695;
													            var9 = anInt1857 + Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694;
													            if(((Class50.anInt421 - var11) < -500) || ((Class50.anInt421 - var11) > 500) || ((Class104_Sub2.anInt860 - var9) < -500) || ((Class104_Sub2.anInt860 - var9) > 500)) {
													               Class50.anInt421 = var11;
													               Class104_Sub2.anInt860 = var9;
													            }

													            if(Class50.anInt421 != var11)
																	Class50.anInt421 += (var11 - Class50.anInt421) / 16;

													            if(var9 != Class104_Sub2.anInt860)
																	Class104_Sub2.anInt860 += (var9 - Class104_Sub2.anInt860) / 16;

													            if(Class25.aBoolArray249[96])
																	anInt1950 += (-24 - anInt1950) / 2;
																else if(Class25.aBoolArray249[97])
																	anInt1950 += (24 - anInt1950) / 2;
																else
																	anInt1950 /= 2;

													            if(Class25.aBoolArray249[98])
																	anInt1877 += (12 - anInt1877) / 2;
																else if(Class25.aBoolArray249[99])
																	anInt1877 += (-12 - anInt1877) / 2;
																else
																	anInt1877 /= 2;

													            anInt1866 = ((anInt1950 / 2) + anInt1866) & 2047;
													            anInt1962 += anInt1877 / 2;
													            if(anInt1962 < 128)
																	anInt1962 = 128;

													            if(anInt1962 > 383)
																	anInt1962 = 383;

													            var10 = Class50.anInt421 >> 7;
													            var13 = Class104_Sub2.anInt860 >> 7;
													            var14 = Class47.method211(Class50.anInt421, Class104_Sub2.anInt860, Class12.anInt73);
													            var15 = 0;
													            if((var10 > 3) && (var13 > 3) && (var10 < 100) && (var13 < 100))
																	for(var16 = var10 - 4; var16 <= (4 + var10); ++var16)
																		for(var17 = var13 - 4; var17 <= (var13 + 4); ++var17) {
																	         var18 = Class12.anInt73;
																	         if((var18 < 3) && ((Class76.aByteArrayArrayArray600[1][var16][var17] & 2) == 2))
																				++var18;

																	         var19 = var14 - Class76.anIntArrayArrayArray611[var18][var16][var17];
																	         if(var19 > var15)
																				var15 = var19;
																	      }

													            var16 = var15 * 192;
													            if(var16 > 98048)
																	var16 = 98048;

													            if(var16 < '\u8000')
																	var16 = '\u8000';

													            if(var16 > anInt1821)
																	anInt1821 += (var16 - anInt1821) / 24;
																else if(var16 < anInt1821)
																	anInt1821 += (var16 - anInt1821) / 80;

													            if(aBool2034)
																	Class104_Sub23.method620();

													            for(var11 = 0; var11 < 5; ++var11)
																	++anIntArray2040[var11];

													            var11 = ++Class14.anInt89 - 1;
													            var10 = Class25.anInt256;
													            if((var11 > 15000) && (var10 > 15000)) {
													               anInt1836 = 250;
													               Class104_Sub16.method553(14500);
													               secureBuf.method623(38);
													            }

													            ++anInt1861;
													            if(anInt1861 > 500) {
													               anInt1861 = 0;
													               var14 = (int)(Math.random() * 8.0D);
													               if((var14 & 1) == 1)
																	anInt1986 += anInt1856;

													               if((var14 & 2) == 2)
																	anInt1857 += anInt1858;

													               if((var14 & 4) == 4)
																	anInt1859 += anInt1908;
													            }

													            if(anInt1986 < -50)
																	anInt1856 = 2;

													            if(anInt1986 > 50)
																	anInt1856 = -2;

													            if(anInt1857 < -55)
																	anInt1858 = 2;

													            if(anInt1857 > 55)
																	anInt1858 = -2;

													            if(anInt1859 < -40)
																	anInt1908 = 1;

													            if(anInt1859 > 40)
																	anInt1908 = -1;

													            ++anInt1989;
													            if(anInt1989 > 500) {
													               anInt1989 = 0;
													               var14 = (int)(Math.random() * 8.0D);
													               if((var14 & 1) == 1)
																	anInt1862 += anInt1789;

													               if((var14 & 2) == 2)
																	anInt1921 += anInt1831;
													            }

													            if(anInt1862 < -60)
																	anInt1789 = 2;

													            if(anInt1862 > 60)
																	anInt1789 = -2;

													            if(anInt1921 < -20)
																	anInt1831 = 1;

													            if(anInt1921 > 10)
																	anInt1831 = -1;

													            ++anInt1835;
													            if(anInt1835 > 50)
																	secureBuf.method623(228);

													            try {
													               if((null != Class20.stream) && (secureBuf.pos > 0)) {
													                  Class20.stream.flushbytes(secureBuf.aByteArray1174, 0, secureBuf.pos);
													                  secureBuf.pos = 0;
													                  anInt1835 = 0;
													                  return;
													               }
													            } catch (final IOException var61) {
													               if(anInt1836 > 0)
																	Class61_Sub1.method494();
																else {
													                  Class10.method40(40);
													                  Class57.aClass13_467 = Class20.stream;
													                  Class20.stream = null;
													               }

													               return;
													            }

													            return;
													         }

													         var97 = var80.aClass104_Sub12_938;
													         if(var97.anInt1018 < 0)
																break;

													         var7 = Class47.method210(var97.anInt1091);
													      } while((null == var7) || (null == var7.aClass104_Sub12Array1020) || (var97.anInt1018 >= var7.aClass104_Sub12Array1020.length) || (var97 != var7.aClass104_Sub12Array1020[var97.anInt1018]));

													      Class46.method203(var80);
													   }

                                                var97 = var80.aClass104_Sub12_938;
                                                if(var97.anInt1018 < 0)
													break;

                                                var7 = Class47.method210(var97.anInt1091);
                                             } while((var7 == null) || (var7.aClass104_Sub12Array1020 == null) || (var97.anInt1018 >= var7.aClass104_Sub12Array1020.length) || (var97 != var7.aClass104_Sub12Array1020[var97.anInt1018]));

                                             Class46.method203(var80);
                                          }

                                       var97 = var80.aClass104_Sub12_938;
                                       if(var97.anInt1018 < 0)
										break;

                                       var7 = Class47.method210(var97.anInt1091);
                                    } while((var7 == null) || (null == var7.aClass104_Sub12Array1020) || (var97.anInt1018 >= var7.aClass104_Sub12Array1020.length) || (var97 != var7.aClass104_Sub12Array1020[var97.anInt1018]));

                                    Class46.method203(var80);
                                 }
                              }

                              anIntArray2010[anInt2008] = Class80.anInt633;
                              anIntArray2009[anInt2008] = Class50.aChar423;
                              ++anInt2008;
                           }
                        }
                     }
                  }
               }
            } else if(anInt1806 == 40)
				Class104_Sub8_Sub4.login();

            return;
         }

         var3.aClass61_Sub1_1098.method488(var3.aClass16_1095, (int)var3.aLong824, var3.aByteArray1096, false);
      }
   }

	@Override
	final void method948(final int var1) {
		final boolean var2 = Class24.method125();
		if (var2 && aBool2041 && (Class76.aClass99_620 != null))
			Class76.aClass99_620.method448();

		if (aBool1766) {
			Class91.method411(Class57.aCanvas468);
			final Canvas var3 = Class57.aCanvas468;
			var3.removeMouseListener(Class14.aClass14_94);
			var3.removeMouseMotionListener(Class14.aClass14_94);
			var3.removeFocusListener(Class14.aClass14_94);
			Class14.anInt90 = 0;
			if (null != Class25.aClass3_257)
				Class25.aClass3_257.method24(Class57.aCanvas468, (byte) 14);

			method947();
			Class80.method350(Class57.aCanvas468);
			Class96.method437(Class57.aCanvas468);
			if (Class25.aClass3_257 != null)
				Class25.aClass3_257.method23(Class57.aCanvas468, 1813162168);
		}

		int var4;
		int var9;
		int var10;
		int var11;
		if (anInt1806 == 0) {
			var4 = Class66.anInt534;
			final String var5 = Class66.aString540;
			Color var6 = null;

			try {
				final Graphics var7 = Class57.aCanvas468.getGraphics();
				if (null == Class50.aFont420) {
					Class50.aFont420 = new Font("Helvetica", 1, 13);
					Class104_Sub18_Sub15.aFontMetrics1466 = Class57.aCanvas468.getFontMetrics(Class50.aFont420);
				}

				if (aBool1755) {
					aBool1755 = false;
					var7.setColor(Color.black);
					var7.fillRect(0, 0, anInt1762, Class15.anInt110);
				}

				if (null == var6)
					var6 = new Color(140, 17, 17);

				try {
					if (Class54.anImage449 == null)
						Class54.anImage449 = Class57.aCanvas468.createImage(304, 34);

					final Graphics var8 = Class54.anImage449.getGraphics();
					var8.setColor(var6);
					var8.drawRect(0, 0, 303, 33);
					var8.fillRect(2, 2, 3 * var4, 30);
					var8.setColor(Color.black);
					var8.drawRect(1, 1, 301, 31);
					var8.fillRect(2 + (3 * var4), 2, 300 - (3 * var4), 30);
					var8.setFont(Class50.aFont420);
					var8.setColor(Color.white);
					var8.drawString(var5, (304 - Class104_Sub18_Sub15.aFontMetrics1466.stringWidth(var5)) / 2, 22);
					var7.drawImage(Class54.anImage449, (anInt1762 / 2) - 152, (Class15.anInt110 / 2) - 18,
							(ImageObserver) null);
				} catch (final Exception var20) {
					var9 = (anInt1762 / 2) - 152;
					var10 = (Class15.anInt110 / 2) - 18;
					var7.setColor(var6);
					var7.drawRect(var9, var10, 303, 33);
					var7.fillRect(2 + var9, 2 + var10, var4 * 3, 30);
					var7.setColor(Color.black);
					var7.drawRect(var9 + 1, var10 + 1, 301, 31);
					var7.fillRect((3 * var4) + var9 + 2, var10 + 2, 300 - (3 * var4), 30);
					var7.setFont(Class50.aFont420);
					var7.setColor(Color.white);
					var7.drawString(var5, var9 + ((304 - Class104_Sub18_Sub15.aFontMetrics1466.stringWidth(var5)) / 2),
							22 + var10);
				}
			} catch (final Exception var21) {
				Class57.aCanvas468.repaint();
			}
		} else if (anInt1806 == 5)
			Class32.method153(Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36,
					Class104_Sub7.aClass104_Sub18_Sub17_Sub2_Sub1_951);
		else if (anInt1806 == 10)
			Class32.method153(Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36,
					Class104_Sub7.aClass104_Sub18_Sub17_Sub2_Sub1_951);
		else if (anInt1806 == 20)
			Class32.method153(Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36,
					Class104_Sub7.aClass104_Sub18_Sub17_Sub2_Sub1_951);
		else if (anInt1806 == 25) {
			if (anInt2043 == 1) {
				if (anInt1842 > anInt1893)
					anInt1893 = anInt1842;

				var4 = ((anInt1893 * 50) - (anInt1842 * 50)) / anInt1893;
				Class104_Sub15.method550("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
			} else if (anInt2043 == 2) {
				if (anInt1843 > anInt1844)
					anInt1844 = anInt1843;

				var4 = (((anInt1844 * 50) - (anInt1843 * 50)) / anInt1844) + 50;
				Class104_Sub15.method550("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
			} else
				Class104_Sub15.method550("Loading - please wait.", false);
		} else if (anInt1806 == 30) {
			if (!aBool1930) {
				aStringArray1863[0] = "Cancel";
				aStringArray1936[0] = "";
				anIntArray1933[0] = 1006;
				anInt1805 = 1;
			}

			if (anInt1947 != -1) {
				var4 = anInt1947;
				if (Class104_Sub7.method508(var4))
					Class97.method439(Class22.aClass104_Sub12ArrayArray228[var4], -1);
			}

			for (var4 = 0; var4 < anInt1982; ++var4) {
				if (aBoolArray2027[var4])
					aBoolArray1991[var4] = true;

				aBoolArray1992[var4] = aBoolArray2027[var4];
				aBoolArray2027[var4] = false;
			}

			anInt1928 = anInt1799;
			anInt1841 = -1;
			anInt1845 = -1;
			Class89.aClass104_Sub12_705 = null;
			if (anInt1947 != -1) {
				anInt1982 = 0;
				Class104_Sub18_Sub11.method770(anInt1947, 0, 0, 765, 503, 0, 0, -1);
			}

			Class104_Sub18_Sub17.method791();
			boolean var25 = false;

			int var12;
			String var26;
			while (!var25) {
				var25 = true;

				for (var11 = 0; var11 < (anInt1805 - 1); ++var11)
					if ((anIntArray1933[var11] < 1000) && (anIntArray1933[1 + var11] > 1000)) {
						var26 = aStringArray1936[var11];
						aStringArray1936[var11] = aStringArray1936[1 + var11];
						aStringArray1936[var11 + 1] = var26;
						final String var27 = aStringArray1863[var11];
						aStringArray1863[var11] = aStringArray1863[var11 + 1];
						aStringArray1863[1 + var11] = var27;
						var12 = anIntArray1933[var11];
						anIntArray1933[var11] = anIntArray1933[1 + var11];
						anIntArray1933[1 + var11] = var12;
						var12 = anIntArray1931[var11];
						anIntArray1931[var11] = anIntArray1931[1 + var11];
						anIntArray1931[var11 + 1] = var12;
						var12 = anIntArray1932[var11];
						anIntArray1932[var11] = anIntArray1932[var11 + 1];
						anIntArray1932[var11 + 1] = var12;
						var12 = anIntArray1934[var11];
						anIntArray1934[var11] = anIntArray1934[var11 + 1];
						anIntArray1934[1 + var11] = var12;
						var25 = false;
					}
			}

			if (!aBool1930) {
				if (anInt1841 != -1) {
					var4 = anInt1841;
					var11 = anInt1845;
					if ((anInt1805 >= 2) || (anInt1941 != 0) || aBool1943) {
						if ((anInt1941 == 1) && (anInt1805 < 2))
							var26 = "Use" + " " + aString1942 + " " + "->";
						else if (aBool1943 && (anInt1805 < 2))
							var26 = aString1914 + " " + aString1946 + " " + "->";
						else
							var26 = Class79.method349(anInt1805 - 1);

						if (anInt1805 > 2)
							var26 = var26 + Class70.method326(16777215) + " " + '\u002f' + " " + (anInt1805 - 2)
									+ " more options";

						Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.method869(var26, var4 + 4, 15 + var11, 16777215, 0,
								anInt1799 / 1000);
					}
				}
			} else {
				var4 = Class50.anInt422;
				var11 = Class36.anInt349;
				final int var13 = Class12.anInt74;
				final int var14 = Class78.anInt627;
				var12 = 6116423;
				Class104_Sub18_Sub17.method805(var4, var11, var13, var14, var12);
				Class104_Sub18_Sub17.method805(1 + var4, 1 + var11, var13 - 2, 16, 0);
				Class104_Sub18_Sub17.method806(1 + var4, 18 + var11, var13 - 2, var14 - 19, 0);
				Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.drawstr("Choose Option", var4 + 3, var11 + 14, var12, -1);
				var9 = Class14.anInt91;
				var10 = Class14.anInt95;

				int var15;
				int var16;
				int var17;
				for (var15 = 0; var15 < anInt1805; ++var15) {
					var16 = var11 + 31 + ((anInt1805 - 1 - var15) * 15);
					var17 = 16777215;
					if ((var9 > var4) && (var9 < (var13 + var4)) && (var10 > (var16 - 13)) && (var10 < (var16 + 3)))
						var17 = 16776960;

					Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.drawstr(Class79.method349(var15), 3 + var4, var16,
							var17, 0);
				}

				var15 = Class50.anInt422;
				var16 = Class36.anInt349;
				var17 = Class12.anInt74;
				final int var18 = Class78.anInt627;

				for (int var19 = 0; var19 < anInt1982; ++var19)
					if (((anIntArray1993[var19] + anIntArray1995[var19]) > var15)
							&& (anIntArray1993[var19] < (var17 + var15))
							&& ((anIntArray1876[var19] + anIntArray1996[var19]) > var16)
							&& (anIntArray1876[var19] < (var18 + var16)))
						aBoolArray1991[var19] = true;
			}

			if (anInt1997 == 3)
				for (var4 = 0; var4 < anInt1982; ++var4)
					if (aBoolArray1992[var4])
						Class104_Sub18_Sub17.method802(anIntArray1993[var4], anIntArray1876[var4], anIntArray1995[var4],
								anIntArray1996[var4], 16711935, 128);
					else if (aBoolArray1991[var4])
						Class104_Sub18_Sub17.method802(anIntArray1993[var4], anIntArray1876[var4], anIntArray1995[var4],
								anIntArray1996[var4], 16711680, 128);

			Class104_Sub8_Sub4.method738(Class12.anInt73, Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1695,
					Class81.aClass104_Sub18_Sub16_Sub7_Sub1_644.anInt1694, anInt1867);
			anInt1867 = 0;
		} else if (anInt1806 == 40)
			Class104_Sub15.method550("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);

		Graphics var24;
		if ((anInt1806 == 30) && (anInt1997 == 0) && !aBool1755)
			try {
				var24 = Class57.aCanvas468.getGraphics();

				for (var11 = 0; var11 < anInt1982; ++var11)
					if (aBoolArray1991[var11]) {
						aClass2_1764.method20(var24, anIntArray1993[var11], anIntArray1876[var11],
								anIntArray1995[var11], anIntArray1996[var11], 1648384080);
						aBoolArray1991[var11] = false;
					}
			} catch (final Exception var23) {
				Class57.aCanvas468.repaint();
			}
		else if (anInt1806 > 0)
			try {
				var24 = Class57.aCanvas468.getGraphics();
				aClass2_1764.method19(var24, 0, 0, 1866517698);
				aBool1755 = false;

				for (var11 = 0; var11 < anInt1982; ++var11)
					aBoolArray1991[var11] = false;
			} catch (final Exception var22) {
				Class57.aCanvas468.repaint();
			}

	}

	@Override
	final void method940(final byte var1) {
		if (Class2_Sub2.aClass72_865 != null)
			Class2_Sub2.aClass72_865.aBool579 = false;

		Class2_Sub2.aClass72_865 = null;
		if (Class20.stream != null) {
			Class20.stream.destory();
			Class20.stream = null;
		}

		Class104_Sub7.method509();
		if (null != Class14.aClass14_94) {
			final Class14 var2 = Class14.aClass14_94;
			synchronized (var2) {
				Class14.aClass14_94 = null;
			}
		}

		Class25.aClass3_257 = null;
		if (Class76.aClass99_620 != null)
			Class76.aClass99_620.method459();

		if (null != Class102_Sub1.aClass99_895)
			Class102_Sub1.aClass99_895.method459();

		if (null != Class66.aClass13_547)
			Class66.aClass13_547.destory();

		Class46.method207();
		Class91.method409();
	}

	void method951() {
		if (anInt1806 != 1000) {
			final boolean var1 = Class49.method221();
			if (!var1)
				method952();

		}
	}

	void method952() {
		if (Class87.anInt693 >= 4) {
			method944("js5crc");
			anInt1806 = 1000;
		} else {
			if (Class87.anInt698 >= 4) {
				if (anInt1806 <= 5) {
					method944("js5io");
					anInt1806 = 1000;
					return;
				}

				anInt1818 = 3000;
				Class87.anInt698 = 3;
			}

			if ((--anInt1818 + 1) <= 0)
				try {
					if (anInt1954 == 0) {
						Class76.aClass8_618 = aClass11_1760.method47(Class57.aString466, Class87.anInt699);
						++anInt1954;
					}

					if (anInt1954 == 1) {
						if (Class76.aClass8_618.anInt46 == 2) {
							method953(-1);
							return;
						}

						if (Class76.aClass8_618.anInt46 == 1)
							++anInt1954;
					}

					if (anInt1954 == 2) {
						Class43.aClass13_374 = new Class13((Socket) Class76.aClass8_618.anObject50, aClass11_1760);
						final RSBuf var1 = new RSBuf(5);
						var1.writebyte(15);
						var1.writeInt(1);
						Class43.aClass13_374.flushbytes(var1.aByteArray1174, 0, 5);
						++anInt1954;
						aLong1819 = Class71.method332();
					}

					if (anInt1954 == 3)
						if ((anInt1806 > 5) && (Class43.aClass13_374.avail() <= 0)) {
							if ((Class71.method332() - aLong1819) > 30000L) {
								method953(-2);
								return;
							}
						} else {
							final int var2 = Class43.aClass13_374.read();
							if (var2 != 0) {
								method953(var2);
								return;
							}

							++anInt1954;
						}

					if (anInt1954 == 4) {
						Class86.method394(Class43.aClass13_374, anInt1806 > 20);
						Class76.aClass8_618 = null;
						Class43.aClass13_374 = null;
						anInt1954 = 0;
						anInt1855 = 0;
					}
				} catch (final IOException var3) {
					method953(-3);
				}
		}
	}

	void method953(final int var1) {
		Class76.aClass8_618 = null;
		Class43.aClass13_374 = null;
		anInt1954 = 0;
		if (Class104_Sub3.anInt879 == Class87.anInt699)
			Class87.anInt699 = Class60.anInt478;
		else
			Class87.anInt699 = Class104_Sub3.anInt879;

		++anInt1855;
		if ((anInt1855 < 2) || ((var1 != 7) && (var1 != 9))) {
			if ((anInt1855 >= 2) && (var1 == 6)) {
				method944("js5connect_outofdate");
				anInt1806 = 1000;
			} else if (anInt1855 >= 4)
				if (anInt1806 <= 5) {
					method944("js5connect");
					anInt1806 = 1000;
				} else
					anInt1818 = 3000;
		} else if (anInt1806 <= 5) {
			method944("js5connect_full");
			anInt1806 = 1000;
		} else
			anInt1818 = 3000;

	}

	static {
		anIntArray1883 = new int[anInt1882];
		anIntArray1884 = new int[anInt1882];
		anIntArray1807 = new int[anInt1882];
		anIntArray1886 = new int[anInt1882];
		anIntArray2011 = new int[anInt1882];
		anIntArray1888 = new int[anInt1882];
		anIntArray1889 = new int[anInt1882];
		aStringArray1890 = new String[anInt1882];
		anIntArrayArray1891 = new int[104][104];
		anInt1892 = 0;
		anInt1999 = -1;
		anInt1894 = -1;
		anInt1895 = 0;
		anInt1896 = 0;
		anInt1897 = 0;
		anInt1898 = 0;
		anInt1899 = 0;
		anInt1900 = 0;
		anInt1901 = 0;
		anInt1902 = 0;
		anInt1903 = 0;
		anInt1924 = 0;
		aBool1905 = false;
		anInt1793 = 0;
		anInt1906 = 0;
		aClass104_Sub18_Sub16_Sub7_Sub1Array1937 = new Class104_Sub18_Sub16_Sub7_Sub1[2048];
		anInt1994 = 0;
		anIntArray1909 = new int[2048];
		anInt1910 = 0;
		anIntArray1911 = new int[2048];
		aClass104_Sub21Array2030 = new RSBuf[2048];
		anInt1874 = -1;
		anInt1990 = 0;
		anInt1904 = 0;
		anIntArray2048 = new int[1000];
		anIntArray1917 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		aStringArray1918 = new String[8];
		aBoolArray1919 = new boolean[8];
		anIntArray1817 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		aClass59ArrayArrayArray1952 = new Class59[4][104][104];
		aClass59_1922 = new Class59();
		aClass59_1923 = new Class59();
		aClass59_1869 = new Class59();
		anIntArray1925 = new int[25];
		anIntArray1833 = new int[25];
		anIntArray1927 = new int[25];
		anInt1920 = 0;
		aBool1930 = false;
		anInt1805 = 0;
		anIntArray1931 = new int[500];
		anIntArray1932 = new int[500];
		anIntArray1933 = new int[500];
		anIntArray1934 = new int[500];
		aStringArray1863 = new String[500];
		aStringArray1936 = new String[500];
		anInt1841 = -1;
		anInt1845 = -1;
		anInt1864 = 0;
		anInt1940 = 50;
		anInt1941 = 0;
		aString1942 = null;
		aBool1943 = false;
		anInt1970 = -1;
		aString1914 = null;
		aString1946 = null;
		anInt1947 = -1;
		aClass58_1795 = new Class58(8);
		anInt1949 = 0;
		anInt1839 = 0;
		aClass104_Sub12_1951 = null;
		anInt1944 = 0;
		anInt1953 = 0;
		anInt1915 = 0;
		aBool1955 = false;
		aBool1956 = false;
		aBool1870 = false;
		aClass104_Sub12_1958 = null;
		aClass104_Sub12_2019 = null;
		anInt1976 = 0;
		anInt1960 = 0;
		aClass104_Sub12_1961 = null;
		aBool1987 = false;
		anInt2035 = -1;
		anInt1964 = -1;
		aBool1965 = false;
		anInt1966 = -1;
		anInt1967 = -1;
		aBool1804 = false;
		anInt1978 = 1;
		anIntArray1971 = new int[32];
		anInt1948 = 0;
		anIntArray1973 = new int[32];
		anInt1916 = 0;
		anIntArray1868 = new int[32];
		anInt1851 = 0;
		anInt1977 = 0;
		anInt1846 = 0;
		anInt2037 = 0;
		anInt1980 = 0;
		anIntArray1981 = new int[2000];
		aStringArray1865 = new String[1000];
		anInt1983 = 0;
		aClass59_1984 = new Class59();
		aClass59_1985 = new Class59();
		aClass59_1957 = new Class59();
		aClass58_1926 = new Class58(512);
		anInt1982 = 0;
		anInt1928 = -2;
		aBoolArray2027 = new boolean[100];
		aBoolArray1991 = new boolean[100];
		aBoolArray1992 = new boolean[100];
		anIntArray1993 = new int[100];
		anIntArray1876 = new int[100];
		anIntArray1995 = new int[100];
		anIntArray1996 = new int[100];
		anInt1997 = 0;
		anIntArray1998 = new int[100];
		aStringArray1912 = new String[100];
		aStringArray2025 = new String[100];
		aStringArray2001 = new String[100];
		anInt2000 = 0;
		anIntArray2003 = new int[] { 16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215 };
		anInt2004 = 0;
		anInt2005 = 0;
		aLongArray2006 = new long[100];
		anInt2007 = 0;
		anInt2008 = 0;
		anIntArray2009 = new int[128];
		anIntArray2010 = new int[128];
		aString1829 = null;
		aString2012 = null;
		anInt2013 = -1;
		anInt2014 = 0;
		anIntArray2015 = new int[1000];
		anIntArray2016 = new int[1000];
		aClass104_Sub18_Sub17_Sub1Array2017 = new Class104_Sub18_Sub17_Sub1[1000];
		anInt2018 = 0;
		anInt1880 = 0;
		anInt2021 = 0;
		anInt2022 = 255;
		anInt2023 = -1;
		aBool2041 = false;
		anInt1827 = 127;
		anInt2026 = 127;
		anInt2028 = 0;
		anIntArray2029 = new int[50];
		anIntArray1875 = new int[50];
		anIntArray2031 = new int[50];
		anIntArray2032 = new int[50];
		aClass82Array2033 = new Class82[50];
		aBool2034 = false;
		aBoolArray2036 = new boolean[5];
		anIntArray2039 = new int[5];
		anIntArray2038 = new int[5];
		anIntArray2020 = new int[5];
		anIntArray2040 = new int[5];
		anInt1935 = 0;
		anInt2024 = 0;
		aClass86Array1972 = new Class86[200];
		aClass51_2044 = new Class51();
		anInt2045 = 0;
		aClass78Array2046 = new Class78[100];
		aClass85_2047 = new Class85();
		anInt1887 = -1;
		anInt2049 = -1;
	}

	@Override
	final void method942(final int var1) {
		Class104_Sub3.anInt879 = anInt1792 == 0 ? '\uaa4a' : anInt1939 + '\u9c40';
		Class60.anInt478 = anInt1792 == 0 ? 443 : '\uc350' + anInt1939;
		Class87.anInt699 = Class104_Sub3.anInt879;
		Class57.aShortArray465 = Class97.aShortArray764;
		Class47.aShortArrayArray405 = Class97.aShortArrayArray763;
		Class85.aShortArray663 = Class97.aShortArray762;
		Class85.aShortArrayArray668 = Class97.aShortArrayArray765;
		if (Class11.aString64.toLowerCase().indexOf("microsoft") != -1) {
			Class25.anIntArray251[186] = 57;
			Class25.anIntArray251[187] = 27;
			Class25.anIntArray251[188] = 71;
			Class25.anIntArray251[189] = 26;
			Class25.anIntArray251[190] = 72;
			Class25.anIntArray251[191] = 73;
			Class25.anIntArray251[192] = 58;
			Class25.anIntArray251[219] = 42;
			Class25.anIntArray251[220] = 74;
			Class25.anIntArray251[221] = 43;
			Class25.anIntArray251[222] = 59;
			Class25.anIntArray251[223] = 28;
		} else {
			Class25.anIntArray251[44] = 71;
			Class25.anIntArray251[45] = 26;
			Class25.anIntArray251[46] = 72;
			Class25.anIntArray251[47] = 73;
			Class25.anIntArray251[59] = 57;
			Class25.anIntArray251[61] = 27;
			Class25.anIntArray251[91] = 42;
			Class25.anIntArray251[92] = 74;
			Class25.anIntArray251[93] = 43;
			Class25.anIntArray251[192] = 28;
			Class25.anIntArray251[222] = 58;
			Class25.anIntArray251[520] = 59;
		}

		Class80.method350(Class57.aCanvas468);
		Class96.method437(Class57.aCanvas468);
		Class25.aClass3_257 = Class46.method205(-1943632078);
		if (Class25.aClass3_257 != null)
			Class25.aClass3_257.method23(Class57.aCanvas468, 1813162168);

		Class88.aClass16_701 = new Class16(255, Class24.aClass96_242, Class24.aClass96_243, 500000);
		if (anInt1792 != 0)
			aBool1860 = true;

	}

	static void method954(final int var0, final int var1) {
		final int[] var2 = new int[4];
		final int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5)
			if (var0 != Class66.anIntArray519[var5]) {
				var2[var4] = Class66.anIntArray519[var5];
				var3[var4] = Class66.anIntArray545[var5];
				++var4;
			}

		Class66.anIntArray519 = var2;
		Class66.anIntArray545 = var3;
		Class33.method159(Class96.aClass57Array758, 0, Class96.aClass57Array758.length - 1, Class66.anIntArray519,
				Class66.anIntArray545);
	}
}
