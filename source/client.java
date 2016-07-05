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
	static boolean lowmvm = false;
	static int anInt1939 = 1;
	static int anInt1913 = 0;
	static int anInt1792 = 0;
	static int anInt1938 = 1;
	static boolean aBool1852 = false;
	static int currentTime = 0;
	static int anInt1983;
	static int anInt1879 = 0;
	static int mapfails = 0;
	static int anInt1836 = 0;
	static boolean aBool1840 = false;
	static int anInt1843 = 0;
	static int loadtype = 0;
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
	static Widget aClass104_Sub12_1951;
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
	static Widget aClass104_Sub12_1961;
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
	static int currentWidget;
	static int anInt1895;
	static int anInt1896;
	static Widget aClass104_Sub12_1958;
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
	static int localNpcSize = 0;
	static int anInt1805;
	static int prog = 1;
	static int anInt1844 = 1;
	static int anInt1928;
	static int anInt1841;
	static int anInt1845;
	static int anInt1982;
	static int loadstage = 0;
	static int anInt1818 = 0;
	static int anInt1954 = 0;
	static long aLong1819;
	static int anInt1855 = 0;
	static boolean aBool1979 = true;
	static boolean aBool1798 = true;
	static boolean aBool1860 = false;
	static RSBuf somebuf = new RSBuf(new byte[5000]);
	static int anInt1816 = 0;
	static int step = 0;
	static int anInt1824 = 0;
	static int anInt1968 = 0;
	static int anInt1826 = 0;
	static Class104_Sub18_Sub16_Sub7_Sub2[] localNpcs = new Class104_Sub18_Sub16_Sub7_Sub2['\u8000'];
	static int[] localNpcIndicies = new int['\u8000'];
	static GameBuf secureBuf = new GameBuf(5000);
	static GameBuf loginbuf = new GameBuf(5000);
	static GameBuf gamecon = new GameBuf(5000);
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
	static Player[] localPlayers;
	static int localPlrSize;
	static int[] localPlayerIndexs;
	static int[] updates;
	static RSBuf[] cachedAppearances;
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
	static Widget aClass104_Sub12_2019;
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
	static boolean[] rsfacesFlag;
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
	static Sprite[] aClass104_Sub18_Sub17_Sub1Array2017;
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
	static Looks aClass85_2047;
	static int anInt1887;
	static int anInt2049;
	public static Class104_Sub18_Sub17_Sub2_Sub1 aClass104_Sub18_Sub17_Sub2_Sub1_290;
	static Sprite[] skulls;
	static char[] validChars = new char[] { '\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020',
	'\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000',
	'\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
	'\u203a', '\u0153', '\u0000', '\u017e', '\u0178' };

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

			int yo;
			int var9;
			for (yo = 0; yo < var2.length; ++yo) {
				final Class54 var4 = var2[yo];
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

						FSManager.aClass30_760 = var28;
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
			lowmvm = false;
			Class57.aString466 = getCodeBase().getHost();
			final String var22 = FSManager.aClass30_760.aString283;
			final byte var14 = 0;

			try {
				Class24.idxCount = 16;
				JagFS2.anInt116 = var14;

				try {
					Class64.osName = System.getProperty("os.name");
				} catch (final Exception var20) {
					Class64.osName = "Unknown";
				}

				Class90.lowercaseOsName = Class64.osName.toLowerCase();

				try {
					Class104_Sub23.homeDir = System.getProperty("user.home");
					if (null != Class104_Sub23.homeDir)
						Class104_Sub23.homeDir = Class104_Sub23.homeDir + "/";
				} catch (final Exception var19) {
					;
				}

				try {
					if (Class90.lowercaseOsName.startsWith("win")) {
						if (Class104_Sub23.homeDir == null)
							Class104_Sub23.homeDir = System.getenv("USERPROFILE");
					} else if (null == Class104_Sub23.homeDir)
						Class104_Sub23.homeDir = System.getenv("HOME");

					if (Class104_Sub23.homeDir != null)
						Class104_Sub23.homeDir = Class104_Sub23.homeDir + "/";
				} catch (final Exception var18) {
					;
				}

				if (null == Class104_Sub23.homeDir)
					Class104_Sub23.homeDir = "~/";

				// DIRECTORIES
				Class49.rootDirectory = new String[] { /*"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/",*/ Class104_Sub23.homeDir, /*"/tmp/", "" */};
				Class7.store = new String[] { "os-rev4", /*".jagex_cache_" + Class16.anInt116, ".file_store_" + Class16.anInt116 */};

				label129: for (yo = 0; yo < 4; ++yo) {
					Class24.rootdirectory = Class70.method325("gamename", var22, yo);
					if (!Class24.rootdirectory.exists())
						Class24.rootdirectory.mkdirs();

					final File[] child = Class24.rootdirectory.listFiles();
					if (child == null)
						break;

					final File[] child2 = child;
					int var16 = 0;

					while (true) {
						if (var16 >= child2.length)
							break label129;

						final File var29 = child2[var16];

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

				Class72.verifyCreated(Class24.rootdirectory);
				Class89.createRandomDat();
				Class24.maindata = new FSManager( new JagFS(Class75.method341("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
				Class24.idx255 = new FSManager(new JagFS(Class75.method341("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
				Class22.managers = new FSManager[Class24.idxCount];

				for (yo = 0; yo < Class24.idxCount; ++yo)
					Class22.managers[yo] = new FSManager(new JagFS(Class75.method341("main_file_cache.idx" + yo), "rw", 1048576L), 6000, 0);
			} catch (final Exception var21) {
				Nodee.report((String) null, var21);
			}

			method937(765, 503, 1);
		}
	}

	@Override
final void method943(final byte var1) {
      ++currentTime;
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
            int map;
            synchronized(var73) {
               ++Class25.anInt256;
               Class25.anInt254 = Class25.anInt246;
               if(Class25.anInt245 >= 0)
				while(Class25.anInt247 != Class25.anInt245) {
                     map = Class25.anIntArray250[Class25.anInt247];
                     Class25.anInt247 = (Class25.anInt247 + 1) & 127;
                     if(map < 0)
						Class25.aBoolArray249[~map] = false;
					else
						Class25.aBoolArray249[map] = true;
                  }
			else {
                  for(map = 0; map < 112; ++map)
					Class25.aBoolArray249[map] = false;

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

            int localx;
            int localy;
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
            if(loadstage == 0) {
               Class46.method206();
               Class36.method171();
            } else if(loadstage == 5) {
               Class88.method401(this);
               Class46.method206();
               Class36.method171();
            } else if(loadstage == 10)
				Class88.method401(this);
			else if(loadstage == 20) {
               Class88.method401(this);
               Class104_Sub8_Sub4.login();
            } else if(loadstage == 25) {
               Class20.writePkt228(false);
               mapfails = 0;
               boolean valid = true;

               for(map = 0; map < Class104_Sub15.terrainData.length; ++map) {
                  if((Class40.mapFileIds[map] != -1) && (null == Class104_Sub15.terrainData[map])) {
                     Class104_Sub15.terrainData[map] = Class67.fs.decompress(Class40.mapFileIds[map], 0);
                     if(null == Class104_Sub15.terrainData[map]) {
                        valid = false;
                        ++mapfails;
                     }
                  }

                  if((Class75.landscapeFileIds[map] != -1) && (null == Class70.landscapedata[map])) {
                     Class70.landscapedata[map] = Class67.fs.filedata(Class75.landscapeFileIds[map], 0, Class13.xteakeys[map]);
                     if(Class70.landscapedata[map] == null) {
                        valid = false;
                        ++mapfails;
                     }
                  }
               }

            if(!valid) {
				loadtype = 1;
            } else {
                  anInt1843 = 0;
                  valid = true;

                  for(map = 0; map < Class104_Sub15.terrainData.length; ++map) {
                     final byte[] INFO = Class70.landscapedata[map];
                     if(INFO != null) {
                        localx = ((Class47.mapCoordinates[map] >> 8) * 64) - Class53.anInt436;
                        localy = ((Class47.mapCoordinates[map] & 255) * 64) - Class20.anInt206;
                        if(dynamicRegion) {
                           localx = 10;
                           localy = 10;
                        }

                        valid &= Class19.loadClipping(INFO, localx, localy);
                     }
                  }

                  if(!valid)
					loadtype = 2;
				else {
                     if(loadtype != 0)
						Class104_Sub15.drawLoading("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);

                     Class101.method465();
                     Class33.method158();
                     Class101.method465();
                     Class81.aClass17_643.method69();
                     Class101.method465();
                     System.gc();

                     for(map = 0; map < 4; ++map)
						aClass67Array1975[map].method304();

                     for(map = 0; map < 4; ++map)
						for(var11 = 0; var11 < 104; ++var11)
							for(localx = 0; localx < 104; ++localx)
								Class76.aByteArrayArrayArray600[map][var11][localx] = 0;

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
                     map = Class104_Sub15.terrainData.length;

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
                     Class20.writePkt228(true);
                     if(!dynamicRegion) {
                        byte[] var12;
                        for(var11 = 0; var11 < map; ++var11) {
                           localx = ((Class47.mapCoordinates[var11] >> 8) * 64) - Class53.anInt436;
                           localy = ((Class47.mapCoordinates[var11] & 255) * 64) - Class20.anInt206;
                           var12 = Class104_Sub15.terrainData[var11];
                           if(null != var12) {
                              Class101.method465();
                              Class1.method16(var12, localx, localy, (Class54.anInt447 * 8) - 48, (FSManager.anInt761 * 8) - 48, aClass67Array1975);
                           }
                        }

                        for(var11 = 0; var11 < map; ++var11) {
                           localx = (64 * (Class47.mapCoordinates[var11] >> 8)) - Class53.anInt436;
                           localy = ((Class47.mapCoordinates[var11] & 255) * 64) - Class20.anInt206;
                           var12 = Class104_Sub15.terrainData[var11];
                           if((var12 == null) && (FSManager.anInt761 < 800)) {
                              Class101.method465();
                              Nodee.method519(localx, localy, 64, 64);
                           }
                        }

                        Class20.writePkt228(true);

                        for(var11 = 0; var11 < map; ++var11) {
                           final byte[] var6 = Class70.landscapedata[var11];
                           if(var6 != null) {
                              localy = ((Class47.mapCoordinates[var11] >> 8) * 64) - Class53.anInt436;
                              var13 = ((Class47.mapCoordinates[var11] & 255) * 64) - Class20.anInt206;
                              Class101.method465();
                              Class105.method472(var6, localy, var13, Class81.aClass17_643, aClass67Array1975);
                           }
                        }
                     }

                     if(dynamicRegion) {
                        var11 = 0;

                        label3026:
                        while(true) {
                           if(var11 >= 4) {
                              for(var11 = 0; var11 < 13; ++var11)
								for(localx = 0; localx < 13; ++localx) {
                                    localy = anIntArrayArrayArray1848[0][var11][localx];
                                    if(localy == -1)
										Nodee.method519(8 * var11, 8 * localx, 8, 8);
                                 }

                              Class20.writePkt228(true);
                              var11 = 0;

                              while(true) {
                                 if(var11 >= 4)
									break label3026;

                                 Class101.method465();

                                 for(localx = 0; localx < 13; ++localx)
									for(localy = 0; localy < 13; ++localy) {
                                       var13 = anIntArrayArrayArray1848[var11][localx][localy];
                                       if(var13 != -1) {
                                          var14 = (var13 >> 24) & 3;
                                          var15 = (var13 >> 1) & 3;
                                          var16 = (var13 >> 14) & 1023;
                                          var17 = (var13 >> 3) & 2047;
                                          var18 = (var17 / 8) + ((var16 / 8) << 8);

                                          for(var19 = 0; var19 < Class47.mapCoordinates.length; ++var19)
											if((var18 == Class47.mapCoordinates[var19]) && (null != Class70.landscapedata[var19])) {
                                                Class7.method34(Class70.landscapedata[var19], var11, localx * 8, 8 * localy, var14, (var16 & 7) * 8, (var17 & 7) * 8, var15, Class81.aClass17_643, aClass67Array1975);
                                                break;
                                             }
                                       }
                                    }

                                 ++var11;
                              }
                           }

                           Class101.method465();

                           for(localx = 0; localx < 13; ++localx)
							for(localy = 0; localy < 13; ++localy) {
                                 var95 = false;
                                 var14 = anIntArrayArrayArray1848[var11][localx][localy];
                                 if(var14 != -1) {
                                    var15 = (var14 >> 24) & 3;
                                    var16 = (var14 >> 1) & 3;
                                    var17 = (var14 >> 14) & 1023;
                                    var18 = (var14 >> 3) & 2047;
                                    var19 = (var18 / 8) + ((var17 / 8) << 8);

                                    for(var20 = 0; var20 < Class47.mapCoordinates.length; ++var20)
										if((var19 == Class47.mapCoordinates[var20]) && (Class104_Sub15.terrainData[var20] != null)) {
										      Class1.method14(Class104_Sub15.terrainData[var20], var11, 8 * localx, 8 * localy, var15, (var17 & 7) * 8, 8 * (var18 & 7), var16, aClass67Array1975);
										      var95 = true;
										      break;
										   }
                                 }

                                 if(!var95) {
                                    var15 = var11;
                                    var16 = localx * 8;
                                    var17 = localy * 8;

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

                     Class20.writePkt228(true);
                     Class33.method158();
                     Class101.method465();
                     Class104_Sub18_Sub14.method785(Class81.aClass17_643, aClass67Array1975);
                     Class20.writePkt228(true);
                     var11 = Class76.anInt601;
                     if(var11 > Class12.myplayerHeight)
						var11 = Class12.myplayerHeight;

                     if(var11 < (Class12.myplayerHeight - 1))
						var11 = Class12.myplayerHeight - 1;

                     if(lowmvm)
						Class81.aClass17_643.method70(Class76.anInt601);
					else
						Class81.aClass17_643.method70(0);

                     for(localx = 0; localx < 104; ++localx)
						for(localy = 0; localy < 104; ++localy)
							Class102_Sub1.method496(localx, localy);

                     Class101.method465();

                     for(var81 = (Class104_Sub3)aClass59_1922.method251(); var81 != null; var81 = (Class104_Sub3)aClass59_1922.method252())
						if(var81.anInt878 == -1) {
                           var81.anInt877 = 0;
                           Class1_Sub1.method475(var81);
                        } else
							var81.method470();

                     ObjectDefinition.aClass56_1326.method239();
                     if(Class53.aFrame435 != null) {
                        secureBuf.putOpcode(210);
                        secureBuf.writeInt(1057001181);
                     }

                     if(!dynamicRegion) {
                        localx = (Class54.anInt447 - 6) / 8;
                        localy = (6 + Class54.anInt447) / 8;
                        var13 = (FSManager.anInt761 - 6) / 8;
                        var14 = (6 + FSManager.anInt761) / 8;

                        for(var15 = localx - 1; var15 <= (localy + 1); ++var15)
							for(var16 = var13 - 1; var16 <= (var14 + 1); ++var16)
								if((var15 < localx) || (var15 > localy) || (var16 < var13) || (var16 > var14)) {
							         Class67.fs.method268("m" + var15 + "_" + var16);
							         Class67.fs.method268("l" + var15 + "_" + var16);
							      }
                     }

                     Class10.method40(30);
                     Class101.method465();
                     Class36.method172();
                     secureBuf.putOpcode(197);
                     Class36.method171();
                  }
               }
            }

            if(loadstage == 30) {
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
                  Widget var7;
                  Class86 var22;
                  int var32;
                  int var45;
                  boolean var103;
                  boolean var106;
                  Widget var120;
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
                              // read packets
                              if(pktOpc == -1) {
                                 Class20.stream.readbytes(gamecon.backing, 0, 1);
                                 gamecon.pos = 0;
                                 pktOpc = gamecon.opcode();
                                 pktSize = Class95.PACKETSIZES[pktOpc];
                                 --var11;
                              }

                              if(pktSize == -1) {
                                 if(var11 <= 0) {
                                    var87 = false;
                                    break label3291;
                                 }

                                 Class20.stream.readbytes(gamecon.backing, 0, 1);
                                 pktSize = gamecon.backing[0] & 255;
                                 --var11;
                              }

                              if(pktSize == -2) {
                                 if(var11 <= 1) {
                                    var87 = false;
                                    break label3291;
                                 }

                                 Class20.stream.readbytes(gamecon.backing, 0, 2);
                                 gamecon.pos = 0;
                                 pktSize = gamecon.readShort();
                                 var11 -= 2;
                              }

                              if(var11 < pktSize) {
                                 var87 = false;
                                 break label3291;
                              }

                              gamecon.pos = 0;
                              Class20.stream.readbytes(gamecon.backing, 0, pktSize);
                              anInt1834 = 0;
                              anInt1815 = anInt2042;
                              anInt2042 = anInt1837;
                              anInt1837 = pktOpc;
                              System.out.println("inc opcode "+pktOpc+" size "+pktSize);
                              if(pktOpc == 180) {
                                 localx = gamecon.readLEShortA();
                                 localy = gamecon.readLEInt();
                                 Class71.anIntArray577[localx] = localy;
                                 if(localy != Class71.anIntArray576[localx]) {
                                    Class71.anIntArray576[localx] = localy;
                                    Class46.redrawComponent(localx);
                                 }

                                 anIntArray1971[(++anInt1948 - 1) & 31] = localx;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              String str0;
                              String str1;
                              if(pktOpc == 168) {
                                 var82 = gamecon.readString();
                                 final GameBuf var104 = gamecon;

                                 try {
                                    var15 = var104.readsmart();
                                    if(var15 > 32767)
										var15 = 32767;

                                    final byte[] var114 = new byte[var15];
                                    var104.pos += Class106.huffman.decihper(var104.backing, var104.pos, var114, 0, var15);
                                    str0 = client.decodeStr(var114, 0, var15);
                                    str1 = str0;
                                 } catch (final Exception var58) {
                                    str1 = "Cabbage";
                                 }

                                 str1 = client.fixed(client.format(str1));
                                 Class15.chat(6, var82, str1);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 87) {
                                 localx = gamecon.readLEInt();
                                 final Nodee var90 = (Nodee)aClass58_1795.method241(localx);
                                 if(null != var90)
									Class13.method56(var90, true);

                                 if(null != aClass104_Sub12_1951) {
                                    Class79.setflags(aClass104_Sub12_1951);
                                    aClass104_Sub12_1951 = null;
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              Widget var92;
                              if(pktOpc == 176) {
                                 localx = gamecon.readULEShortA();
                                 localy = gamecon.readLEInt();
                                 var92 = Class47.method210(localy);
                                 if((localx != var92.anInt1058) || (localx == -1)) {
                                    var92.anInt1058 = localx;
                                    var92.anInt974 = 0;
                                    var92.anInt1085 = 0;
                                    Class79.setflags(var92);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              String var83;
                              if(pktOpc == 100) {
                                 var82 = gamecon.readString();
                                 if(var82.endsWith(":tradereq:")) {
                                    var83 = Class33.method155(var82.substring(0, var82.indexOf(":")), Class2.aClass101_8);
                                    var95 = false;
                                    if(Class34.method166(var83))
										var95 = true;

                                    if(!var95 && (anInt1906 == 0))
										Class15.chat(4, var83, "wishes to trade with you.");
                                 } else if(var82.endsWith(":duelreq:")) {
                                    var83 = Class33.method155(var82.substring(0, var82.indexOf(":")), Class2.aClass101_8);
                                    var95 = false;
                                    if(Class34.method166(var83))
										var95 = true;

                                    if(!var95 && (anInt1906 == 0))
										Class15.chat(8, var83, "wishes to duel with you.");
                                 } else if(var82.endsWith(":chalreq:")) {
                                    var83 = Class33.method155(var82.substring(0, var82.indexOf(":")), Class2.aClass101_8);
                                    var95 = false;
                                    if(Class34.method166(var83))
										var95 = true;

                                    if(!var95 && (anInt1906 == 0)) {
                                       str1 = var82.substring(var82.indexOf(":") + 1, var82.length() - 9);
                                       Class15.chat(8, var83, str1);
                                    }
                                 } else if(var82.endsWith(":assistreq:")) {
                                    var83 = Class33.method155(var82.substring(0, var82.indexOf(":")), Class2.aClass101_8);
                                    var95 = false;
                                    if(Class34.method166(var83))
										var95 = true;

                                    if(!var95 && (anInt1906 == 0))
										Class15.chat(10, var83, "");
                                 } else if(var82.endsWith(":clan:")) {
                                    var83 = var82.substring(0, var82.indexOf(":clan:"));
                                    Class15.chat(11, "", var83);
                                 } else if(var82.endsWith(":trade:")) {
                                    var83 = var82.substring(0, var82.indexOf(":trade:"));
                                    if(anInt1906 == 0)
										Class15.chat(12, "", var83);
                                 } else if(var82.endsWith(":assist:")) {
                                    var83 = var82.substring(0, var82.indexOf(":assist:"));
                                    if(anInt1906 == 0)
										Class15.chat(13, "", var83);
                                 } else
									Class15.chat(0, "", var82);

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 89) {
                                 Class93.anInt742 = gamecon.readUByte();
                                 Class19.anInt195 = gamecon.readUByteS();
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 246) {
                                 localx = gamecon.readUByteN();
                                 localy = gamecon.readUByteA();
                                 var13 = gamecon.readUByteS();
                                 Class12.myplayerHeight = var13 >> 1;
                                 Class81.activePlayer.placeEntity(localy, localx, (var13 & 1) == 1);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 88) {
                                 localx = gamecon.readLEShort();
                                 final byte var131 = gamecon.readByteS();
                                 Class71.anIntArray577[localx] = var131;
                                 if(Class71.anIntArray576[localx] != var131) {
                                    Class71.anIntArray576[localx] = var131;
                                    Class46.redrawComponent(localx);
                                 }

                                 anIntArray1971[(++anInt1948 - 1) & 31] = localx;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 42) { // close?
                                 if(currentWidget != -1)
									Class9.doWidgetOp(currentWidget, 0);

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if((pktOpc == 205) || (pktOpc == 106) || (pktOpc == 245) || (pktOpc == 215) || (pktOpc == 20) || (pktOpc == 32) || (pktOpc == 207) || (pktOpc == 173) || (pktOpc == 6) || (pktOpc == 7) || (pktOpc == 154)) {
                                 Class9.otherPackets();
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 41) {
                                 Class66.redraw();
                                 anInt1944 = gamecon.readUByte();
                                 anInt1980 = anInt1978;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              long var25;
                              long var27;
                              if(pktOpc == 86) {
                                 var82 = gamecon.readString();
                                 var25 = gamecon.readShort();
                                 var27 = gamecon.method614();
                                 var16 = gamecon.readUByte();
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
                                    final GameBuf var129 = gamecon;

                                    String var133;
                                    try {
                                       var32 = var129.readsmart();
                                       if(var32 > 32767)
										var32 = 32767;

                                       final byte[] var132 = new byte[var32];
                                       var129.pos += Class106.huffman.decihper(var129.backing, var129.pos, var132, 0, var32);
                                       final String var34 = client.decodeStr(var132, 0, var32);
                                       var133 = var34;
                                    } catch (final Exception var57) {
                                       var133 = "Cabbage";
                                    }

                                    var133 = client.fixed(client.format(var133));
                                    if((var16 != 2) && (var16 != 3)) {
                                       if(var16 == 1)
										Class15.chat(7, Class72.method335(0) + var82, var133);
									else
										Class15.chat(3, var82, var133);
                                    } else
										Class15.chat(7, Class72.method335(1) + var82, var133);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              Nodee var124;
                              if(pktOpc == 184) {
                                 localx = gamecon.readUByteN();
                                 localy = gamecon.readUShortA();
                                 var13 = gamecon.readInt();
                                 var124 = (Nodee)aClass58_1795.method241(var13);
                                 if(var124 != null)
									Class13.method56(var124, localy != var124.rsfaceID);

                                 Class97.method440(var13, localy, localx);
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
                                 anInt2004 = gamecon.readUByte();
                                 anInt2005 = gamecon.readUByte();
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 224) { // probs logout
                                 Class61_Sub1.method494();
                                 pktOpc = -1;
                                 var87 = false;
                                 break label3291;
                              }

                              if(pktOpc == 147) { // window pane
                                 localx = gamecon.readLEShort();
                                 System.out.println("pane: "+localx);
                                 currentWidget = localx;
                                 Class80.empty(localx);
                                 Class88.handleCSCodes(currentWidget);

                                 for(localy = 0; localy < 100; ++localy)
									rsfacesFlag[localy] = true;

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 241) {
                                 localx = gamecon.readInt();
                                 Class66.aClass8_548 = aClass11_1760.method44(localx);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 225) {
                                 aBool2034 = true;
                                 Looks.anInt673 = gamecon.readUByte();
                                 Class41.anInt370 = gamecon.readUByte();
                                 Class79.anInt631 = gamecon.readShort();
                                 Class104_Sub1.anInt853 = gamecon.readUByte();
                                 Class103.anInt821 = gamecon.readUByte();
                                 if(Class103.anInt821 >= 100) {
                                    localx = 64 + (Looks.anInt673 * 128);
                                    localy = (Class41.anInt370 * 128) + 64;
                                    var13 = Class47.method211(localx, localy, Class12.myplayerHeight) - Class79.anInt631;
                                    var14 = localx - Looks.anInt672;
                                    var15 = var13 - Class46.anInt403;
                                    var16 = localy - Class99.anInt793;
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
                                 localx = gamecon.readInt();
                                 localy = gamecon.readShort();
                                 var13 = (localy >> 10) & 31;
                                 var14 = (localy >> 5) & 31;
                                 var15 = localy & 31;
                                 var16 = (var13 << 19) + (var14 << 11) + (var15 << 3);
                                 final Widget var122 = Class47.method210(localx);
                                 if(var122.anInt1017 != var16) {
                                    var122.anInt1017 = var16;
                                    Class79.setflags(var122);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 85) {
                                 localx = gamecon.readUShortLE();
                                 localy = gamecon.method611();
                                 var13 = gamecon.readInt();
                                 var120 = Class47.method210(var13);
                                 var15 = localy + var120.anInt985;
                                 var16 = var120.anInt975 + localx;
                                 if((var15 != var120.anInt983) || (var120.anInt1005 != var16)) {
                                    var120.anInt983 = var15;
                                    var120.anInt1005 = var16;
                                    Class79.setflags(var120);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 1) {
                                 Class66.redraw();
                                 anInt1953 = gamecon.readUShort();
                                 anInt1980 = anInt1978;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              long var38;
                              if(pktOpc == 48) {
                                 localx = gamecon.readLEInt();
                                 localy = gamecon.readLEShortA();
                                 if(localy == '\uffff')
									localy = -1;

                                 var13 = gamecon.readIntV1();
                                 var14 = gamecon.readLEShort();
                                 if(var14 == '\uffff')
									var14 = -1;

                                 for(var15 = var14; var15 <= localy; ++var15) {
                                    var38 = var15 + ((long)var13 << 32);
                                    final Class104 var40 = aClass58_1926.method241(var38);
                                    if(null != var40)
										var40.method470();

                                    aClass58_1926.method242(new Class104_Sub17(localx), var38);
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
                                 localx = gamecon.readUByte();
                                 localy = gamecon.readUByte();
                                 var13 = gamecon.readUByte();
                                 var14 = gamecon.readUByte();
                                 aBoolArray2036[localx] = true;
                                 anIntArray2039[localx] = localy;
                                 anIntArray2038[localx] = var13;
                                 anIntArray2020[localx] = var14;
                                 anIntArray2040[localx] = 0;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 113) {
                                 Class104_Sub15.playerUpdate();
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 222) {
                                 localx = gamecon.readLEInt();
                                 localy = gamecon.readShort();
                                 if(localx < -70000)
									localy += '\u8000';

                                 if(localx >= 0)
									var92 = Class47.method210(localx);
								else
									var92 = null;

                                 for(; gamecon.pos < pktSize; Class104_Sub18_Sub16_Sub2.method809(localy, var14, var15 - 1, var16)) {
                                    var14 = gamecon.readsmart();
                                    var15 = gamecon.readShort();
                                    var16 = 0;
                                    if(var15 != 0) {
                                       var16 = gamecon.readUByte();
                                       if(var16 == 255)
										var16 = gamecon.readLEInt();
                                    }

                                    if((var92 != null) && (var14 >= 0) && (var14 < var92.anIntArray1080.length)) {
                                       var92.anIntArray1080[var14] = var15;
                                       var92.anIntArray1081[var14] = var16;
                                    }
                                 }

                                 if(var92 != null)
									Class79.setflags(var92);

                                 Class66.redraw();
                                 anIntArray1973[(++anInt1916 - 1) & 31] = localy & 32767;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              long var41;
                              if(pktOpc == 39) {
                                 localx = gamecon.pos + pktSize;
                                 localy = gamecon.readShort();
                                 var13 = gamecon.readShort();
                                 if(localy != currentWidget) {
                                    currentWidget = localy;
                                    Class80.empty(currentWidget);
                                    Class88.handleCSCodes(currentWidget);

                                    for(var14 = 0; var14 < 100; ++var14)
										rsfacesFlag[var14] = true;
                                 }

                                 Nodee var116;
                                 for(; var13-- > 0; var116.aBool958 = true) {
                                    var14 = gamecon.readLEInt();
                                    var15 = gamecon.readShort();
                                    var16 = gamecon.readUByte();
                                    var116 = (Nodee)aClass58_1795.method241(var14);
                                    if((null != var116) && (var15 != var116.rsfaceID)) {
                                       Class13.method56(var116, true);
                                       var116 = null;
                                    }

                                    if(null == var116)
										var116 = Class97.method440(var14, var15, var16);
                                 }

                                 for(var124 = (Nodee)aClass58_1795.method245(); var124 != null; var124 = (Nodee)aClass58_1795.method243())
									if(var124.aBool958)
										var124.aBool958 = false;
									else
										Class13.method56(var124, true);

                                 aClass58_1926 = new Class58(512);

                                 while(gamecon.pos < localx) {
                                    var14 = gamecon.readLEInt();
                                    var15 = gamecon.readShort();
                                    var16 = gamecon.readShort();
                                    var17 = gamecon.readLEInt();

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
                                 anInt2021 = gamecon.readUByte();
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 84) {
                                 localx = gamecon.readInt();
                                 var103 = gamecon.readUByteS() == 1;
                                 var92 = Class47.method210(localx);
                                 if(var103 != var92.aBool1075) {
                                    var92.aBool1075 = var103;
                                    Class79.setflags(var92);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 129) {
                                 for(localx = 0; localx < ObjectDefinition.anInt1373; ++localx) {
                                    final Class104_Sub18_Sub11 var88 = Class104_Sub23.method622(localx);
                                    if((var88 != null) && (var88.anInt1412 == 0)) {
                                       Class71.anIntArray577[localx] = 0;
                                       Class71.anIntArray576[localx] = 0;
                                    }
                                 }

                                 Class66.redraw();
                                 anInt1948 += 32;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 92) { // client script
                                 var82 = gamecon.readString();
                                 final Object[] var86 = new Object[var82.length() + 1];

                                 for(var13 = var82.length() - 1; var13 >= 0; --var13)
									if(var82.charAt(var13) == 115)
										var86[var13 + 1] = gamecon.readString();
									else
										var86[var13 + 1] = new Integer(gamecon.readLEInt());

                                 var86[0] = new Integer(gamecon.readLEInt());
                                 final CS var101 = new CS();
                                 var101.params = var86;
                                 Class46.doCS(var101);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 67) {
                                 Class93.anInt742 = gamecon.readUByteA();
                                 Class19.anInt195 = gamecon.readUByteS();

                                 for(localx = Class19.anInt195; localx < (Class19.anInt195 + 8); ++localx)
									for(localy = Class93.anInt742; localy < (Class93.anInt742 + 8); ++localy)
										if(null != aClass59ArrayArrayArray1952[Class12.myplayerHeight][localx][localy]) {
										      aClass59ArrayArrayArray1952[Class12.myplayerHeight][localx][localy] = null;
										      Class102_Sub1.method496(localx, localy);
										   }

                                 for(var81 = (Class104_Sub3)aClass59_1922.method251(); null != var81; var81 = (Class104_Sub3)aClass59_1922.method252())
									if((var81.anInt871 >= Class19.anInt195) && (var81.anInt871 < (8 + Class19.anInt195)) && (var81.anInt870 >= Class93.anInt742) && (var81.anInt870 < (Class93.anInt742 + 8)) && (var81.anInt876 == Class12.myplayerHeight))
										var81.anInt878 = 0;

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 66) {
                                 localx = gamecon.readIntV1();
                                 localy = gamecon.readUShortA();
                                 var92 = Class47.method210(localx);
                                 if((var92.anInt1010 != 2) || (localy != var92.anInt1011)) {
                                    var92.anInt1010 = 2;
                                    var92.anInt1011 = localy;
                                    Class79.setflags(var92);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 208) {
                                 Class66.redraw();
                                 localx = gamecon.readUByteA();
                                 localy = gamecon.readUByteA();
                                 var13 = gamecon.readLEInt();
                                 anIntArray1927[localy] = var13;
                                 anIntArray1925[localy] = localx;
                                 anIntArray1833[localy] = 1;

                                 for(var14 = 0; var14 < 98; ++var14)
									if(var13 >= Class38.anIntArray356[var14])
										anIntArray1833[localy] = var14 + 2;

                                 anIntArray1868[(++anInt1851 - 1) & 31] = localy;
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
                                 var82 = gamecon.readString();
                                 localy = gamecon.readUByteA();
                                 var13 = gamecon.readUByteS();
                                 if((localy >= 1) && (localy <= 8)) {
                                    if(var82.equalsIgnoreCase("null"))
										var82 = null;

                                    aStringArray1918[localy - 1] = var82;
                                    aBoolArray1919[localy - 1] = var13 == 0;
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 117) {
                                 localx = gamecon.readInt();
                                 var7 = Class47.method210(localx);

                                 for(var13 = 0; var13 < var7.anIntArray1080.length; ++var13) {
                                    var7.anIntArray1080[var13] = -1;
                                    var7.anIntArray1080[var13] = 0;
                                 }

                                 Class79.setflags(var7);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 172) {
                                 localx = gamecon.readUShortA();
                                 Class80.method352(localx);
                                 anIntArray1973[(++anInt1916 - 1) & 31] = localx & 32767;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 70) {
                                 localy = gamecon.readUByte();
                                 final Class27[] var100 = Class30.method145();
                                 var14 = 0;

                                 Class27 var89;
                                 while(true) {
                                    if(var14 >= var100.length) {
                                       var89 = null;
                                       break;
                                    }

                                    final Class27 var127 = var100[var14];
                                    if(localy == var127.anInt261) {
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
                                 var82 = gamecon.readString();
                                 localy = gamecon.readShort();
                                 final byte var102 = gamecon.readByte();
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

                                    for(var15 = 0; (var15 < Class89.anInt704) && (!Class104_Sub13.aClass104_Sub7Array1099[var15].aString947.equals(var82) || (Class104_Sub13.aClass104_Sub7Array1099[var15].anInt950 != localy)); ++var15)
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
                                    gamecon.readString();
                                    final Class104_Sub7 var126 = new Class104_Sub7();
                                    var126.aString947 = var82;
                                    var126.aString948 = Class33.method155(var126.aString947, Class2.aClass101_8);
                                    var126.anInt950 = localy;
                                    var126.aByte949 = var102;

                                    for(var16 = Class89.anInt704 - 1; var16 >= 0; --var16) {
                                       var17 = Class104_Sub13.aClass104_Sub7Array1099[var16].aString948.compareTo(var126.aString947);
                                       if(var17 == 0) {
                                          Class104_Sub13.aClass104_Sub7Array1099[var16].anInt950 = localy;
                                          Class104_Sub13.aClass104_Sub7Array1099[var16].aByte949 = var102;
                                          if(var82.equals(Class81.activePlayer.myName))
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
                                    if(var82.equals(Class81.activePlayer.myName))
										Class97.aByte766 = var102;
                                 }

                                 anInt2037 = anInt1978;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 25) {
                                 final GameBuf var85 = gamecon;
                                 localy = pktSize;
                                 final Class104_Sub16 var99 = new Class104_Sub16();
                                 var99.anInt1127 = var85.readUByte();
                                 var99.anInt1128 = var85.readLEInt();
                                 var99.anIntArray1132 = new int[var99.anInt1127];
                                 var99.anIntArray1129 = new int[var99.anInt1127];
                                 var99.aFieldArray1126 = new Field[var99.anInt1127];
                                 var99.anIntArray1130 = new int[var99.anInt1127];
                                 var99.aMethodArray1133 = new Method[var99.anInt1127];
                                 var99.aByteArrayArrayArray1131 = new byte[var99.anInt1127][][];

                                 for(var14 = 0; var14 < var99.anInt1127; ++var14)
									try {
                                       var15 = var85.readUByte();
                                       String var110;
                                       if((var15 != 0) && (var15 != 1) && (var15 != 2)) {
                                          if((var15 == 3) || (var15 == 4)) {
                                             var110 = new String(var85.readString());
                                             str0 = new String(var85.readString());
                                             var18 = var85.readUByte();
                                             final String[] var43 = new String[var18];

                                             for(var20 = 0; var20 < var18; ++var20)
												var43[var20] = new String(var85.readString());

                                             final byte[][] var135 = new byte[var18][];
                                             if(var15 == 3)
												for(int var137 = 0; var137 < var18; ++var137) {
                                                   var45 = var85.readLEInt();
                                                   var135[var137] = new byte[var45];
                                                   var85.readBytes(var135[var137], 0, var45);
                                                }

                                             var99.anIntArray1132[var14] = var15;
                                             final Class[] var31 = new Class[var18];

                                             for(var45 = 0; var45 < var18; ++var45)
												var31[var45] = Class78.method347(var43[var45]);

                                             var99.aMethodArray1133[var14] = Class78.method347(var110).getDeclaredMethod(str0, var31);
                                             var99.aByteArrayArrayArray1131[var14] = var135;
                                          }
                                       } else {
                                          var110 = new String(var85.readString());
                                          str0 = new String(var85.readString());
                                          var18 = 0;
                                          if(var15 == 1)
											var18 = var85.readLEInt();

                                          var99.anIntArray1132[var14] = var15;
                                          var99.anIntArray1130[var14] = var18;
                                          var99.aFieldArray1126[var14] = Class78.method347(var110).getDeclaredField(str0);
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
                                 anInt1797 = gamecon.readUByte();
                                 if(anInt1797 == 1)
									anInt1808 = gamecon.readShort();

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
                                    anInt1810 = gamecon.readShort();
                                    anInt1811 = gamecon.readShort();
                                    anInt1812 = gamecon.readUByte();
                                 }

                                 if(anInt1797 == 10)
									anInt1809 = gamecon.readShort();

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 217) {
                                 localx = gamecon.readInt();
                                 localy = gamecon.readLEShortA();
                                 var13 = gamecon.readLEShortA();
                                 var120 = Class47.method210(localx);
                                 var120.anInt1022 = var13 + (localy << 16);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 102) {
                                 localx = gamecon.readLEInt();
                                 localy = gamecon.readUShortA();
                                 if(localy == '\uffff')
									localy = -1;

                                 var13 = gamecon.readInt();
                                 var120 = Class47.method210(localx);
                                 ItemDef var123;
                                 if(!var120.isHeaderless) {
                                    if(localy == -1) {
                                       var120.anInt1010 = 0;
                                       pktOpc = -1;
                                       var87 = true;
                                       break label3291;
                                    }

                                    var123 = Class27.forId(localy);
                                    var120.anInt1010 = 4;
                                    var120.anInt1011 = localy;
                                    var120.anInt1043 = var123.anInt1426;
                                    var120.anInt1019 = var123.anInt1427;
                                    var120.anInt1021 = (var123.anInt1425 * 100) / var13;
                                    Class79.setflags(var120);
                                 } else {
                                    var120.anInt986 = localy;
                                    var120.anInt1083 = var13;
                                    var123 = Class27.forId(localy);
                                    var120.anInt1043 = var123.anInt1426;
                                    var120.anInt1019 = var123.anInt1427;
                                    var120.anInt1012 = var123.anInt1446;
                                    var120.anInt1016 = var123.anInt1454;
                                    var120.anInt993 = var123.anInt1430;
                                    var120.anInt1021 = var123.anInt1425;
                                    if(var120.anInt987 > 0)
										var120.anInt1021 = (var120.anInt1021 * 32) / var120.anInt987;

                                    Class79.setflags(var120);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              boolean var44;
                              if(pktOpc == 57) {
                                 var82 = gamecon.readString();
                                 var25 = gamecon.readLELong();
                                 var27 = gamecon.readShort();
                                 var38 = gamecon.method614();
                                 var18 = gamecon.readUByte();
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
                                    final GameBuf var36 = gamecon;

                                    String var33;
                                    try {
                                       int var46 = var36.readsmart();
                                       if(var46 > 32767)
										var46 = 32767;

                                       final byte[] var47 = new byte[var46];
                                       var36.pos += Class106.huffman.decihper(var36.backing, var36.pos, var47, 0, var46);
                                       final String var48 = client.decodeStr(var47, 0, var46);
                                       var33 = var48;
                                    } catch (final Exception var56) {
                                       var33 = "Cabbage";
                                    }

                                    var33 = client.fixed(client.format(var33));
                                    if((var18 != 2) && (var18 != 3)) {
                                       if(var18 == 1)
										Class43.setChat(9, Class72.method335(0) + var82, var33, BZip2Context.method151(var25));
									else
										Class43.setChat(9, var82, var33, BZip2Context.method151(var25));
                                    } else
										Class43.setChat(9, Class72.method335(1) + var82, var33, BZip2Context.method151(var25));
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              String var94;
                              if(pktOpc == 80) {
                                 boolean var115;
                                 for(; gamecon.pos < pktSize;) {
                                    var115 = gamecon.readUByte() == 1;
                                    var83 = gamecon.readString();
                                    var94 = gamecon.readString();
                                    var14 = gamecon.readShort();
                                    var15 = gamecon.readUByte();
                                    var16 = gamecon.readUByte();
                                    final boolean var105 = (var16 & 2) != 0;
                                    final boolean var111 = (var16 & 1) != 0;
                                    if(var14 > 0) {
                                       gamecon.readString();
                                       gamecon.readUByte();
                                       gamecon.readLEInt();
                                    }

                                    gamecon.readString();

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
                                 localy = anInt1935;

                                 while(localy > 0) {
                                    var115 = true;
                                    --localy;

                                    for(var13 = 0; var13 < localy; ++var13) {
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

                                 aString2012 = gamecon.readString();
                                 final long var49 = gamecon.readLELong();
                                 aString1829 = Class36.method169(var49);
                                 Class103.aByte820 = gamecon.readByte();
                                 var13 = gamecon.readUByte();
                                 if(var13 == 255) {
                                    pktOpc = -1;
                                    var87 = true;
                                    break label3291;
                                 }

                                 Class89.anInt704 = var13;
                                 final Class104_Sub7[] var119 = new Class104_Sub7[100];

                                 for(var15 = 0; var15 < Class89.anInt704; ++var15) {
                                    var119[var15] = new Class104_Sub7();
                                    var119[var15].aString947 = gamecon.readString();
                                    var119[var15].aString948 = Class33.method155(var119[var15].aString947, Class2.aClass101_8);
                                    var119[var15].anInt950 = gamecon.readShort();
                                    var119[var15].aByte949 = gamecon.readByte();
                                    gamecon.readString();
                                    if(var119[var15].aString947.equals(Class81.activePlayer.myName))
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
                                 localx = gamecon.readLEInt();
                                 localy = gamecon.readShort();
                                 if(localx < -70000)
									localy += '\u8000';

                                 if(localx >= 0)
									var92 = Class47.method210(localx);
								else
									var92 = null;

                                 final Class104_Sub2 var118 = (Class104_Sub2)Class104_Sub2.aClass58_857.method241(localy);
                                 if(null != var118)
									for(var15 = 0; var15 < var118.anIntArray856.length; ++var15) {
                                       var118.anIntArray856[var15] = -1;
                                       var118.anIntArray858[var15] = 0;
                                    }

                                 var14 = gamecon.readShort();

                                 for(var15 = 0; var15 < var14; ++var15) {
                                    var16 = gamecon.readUByteS();
                                    if(var16 == 255)
										var16 = gamecon.readInt();

                                    var17 = gamecon.readLEShort();
                                    if((null != var92) && (var15 < var92.anIntArray1080.length)) {
                                       var92.anIntArray1080[var15] = var17;
                                       var92.anIntArray1081[var15] = var16;
                                    }

                                    Class104_Sub18_Sub16_Sub2.method809(localy, var15, var17 - 1, var16);
                                 }

                                 if(null != var92)
									Class79.setflags(var92);

                                 Class66.redraw();
                                 anIntArray1973[(++anInt1916 - 1) & 31] = localy & 32767;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 131) {
                                 Class93.anInt742 = gamecon.readUByteN();
                                 Class19.anInt195 = gamecon.readUByteA();

                                 while(gamecon.pos < pktSize) {
                                    pktOpc = gamecon.readUByte();
                                    Class9.otherPackets();
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 169) {
                                 aBool2034 = true;
                                 Class30.anInt287 = gamecon.readUByte();
                                 Class43.anInt375 = gamecon.readUByte();
                                 Class61_Sub1.anInt892 = gamecon.readShort();
                                 CS.anInt944 = gamecon.readUByte();
                                 Class75.anInt598 = gamecon.readUByte();
                                 if(Class75.anInt598 >= 100) {
                                    Looks.anInt672 = (Class30.anInt287 * 128) + 64;
                                    Class99.anInt793 = 64 + (Class43.anInt375 * 128);
                                    Class46.anInt403 = Class47.method211(Looks.anInt672, Class99.anInt793, Class12.myplayerHeight) - Class61_Sub1.anInt892;
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 72) {
                                 for(localx = 0; localx < localPlayers.length; ++localx)
									if(localPlayers[localx] != null)
										localPlayers[localx].anInt1722 = -1;

                                 for(localx = 0; localx < localNpcs.length; ++localx)
									if(localNpcs[localx] != null)
										localNpcs[localx].anInt1722 = -1;

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 50) {
                                 localx = gamecon.readMInt();
                                 localy = gamecon.readShort();
                                 var92 = Class47.method210(localx);
                                 if((null != var92) && (var92.anInt980 == 0)) {
                                    if(localy > (var92.anInt994 - var92.anInt988))
										localy = var92.anInt994 - var92.anInt988;

                                    if(localy < 0)
										localy = 0;

                                    if(localy != var92.anInt992) {
                                       var92.anInt992 = localy;
                                       Class79.setflags(var92);
                                    }
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 26) {
                                 localx = gamecon.readUShortA();
                                 localy = gamecon.readShort();
                                 var13 = gamecon.readInt();
                                 var14 = gamecon.readShort();
                                 final Widget var24 = Class47.method210(var13);
                                 if((localx != var24.anInt1043) || (var14 != var24.anInt1019) || (var24.anInt1021 != localy)) {
                                    var24.anInt1043 = localx;
                                    var24.anInt1019 = var14;
                                    var24.anInt1021 = localy;
                                    Class79.setflags(var24);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 97) {
                                 anInt1879 = gamecon.readUShortA() * 30;
                                 anInt1980 = anInt1978;
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 251) {
                                 localx = gamecon.readShort();
                                 localy = gamecon.readIntV1();
                                 var92 = Class47.method210(localy);
                                 if((var92.anInt1010 != 1) || (localx != var92.anInt1011)) {
                                    var92.anInt1010 = 1;
                                    var92.anInt1011 = localx;
                                    Class79.setflags(var92);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 229) {
                                 localx = gamecon.readShort();
                                 localy = gamecon.readUByte();
                                 var13 = gamecon.readShort();
                                 if((anInt1827 != 0) && (localy != 0) && (anInt2028 < 50)) {
                                    anIntArray2029[anInt2028] = localx;
                                    anIntArray1875[anInt2028] = localy;
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
                                    localx = gamecon.readUByte();
                                    var103 = (localx & 1) == 1;
                                    var94 = gamecon.readString();
                                    str1 = gamecon.readString();
                                    gamecon.readString();

                                    for(var15 = 0; var15 < anInt2045; ++var15) {
                                       final Class78 var21 = aClass78Array2046[var15];
                                       if(var103) {
                                          if(str1.equals(var21.aString625)) {
                                             var21.aString625 = var94;
                                             var21.aString624 = str1;
                                             var92 = null;
                                             break;
                                          }
                                       } else if(var94.equals(var21.aString625)) {
                                          var21.aString625 = var94;
                                          var21.aString624 = str1;
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
                                 localx = gamecon.readMInt();
                                 var7 = Class47.method210(localx);
                                 var7.anInt1010 = 3;
                                 var7.anInt1011 = Class81.activePlayer.appearance.method390();
                                 Class79.setflags(var7);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 198) {
                                 aBool2034 = false;

                                 for(localx = 0; localx < 5; ++localx)
									aBoolArray2036[localx] = false;

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 211) {
                                 localx = gamecon.readLEShort();
                                 if(localx == '\uffff')
									localx = -1;

                                 Class67.method317(localx);
                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 53) {
                                 localx = gamecon.readUShortA();
                                 if(localx == '\uffff')
									localx = -1;

                                 localy = gamecon.readSTribyte();
                                 if((anInt2022 != 0) && (localx != -1)) {
                                    Class87.method400(Class106.aClass61_Sub1_827, localx, 0, anInt2022, false);
                                    aBool2041 = true;
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 111) {
                                 for(localx = 0; localx < Class71.anIntArray576.length; ++localx)
									if(Class71.anIntArray576[localx] != Class71.anIntArray577[localx]) {
                                       Class71.anIntArray576[localx] = Class71.anIntArray577[localx];
                                       Class46.redrawComponent(localx);
                                       anIntArray1971[(++anInt1948 - 1) & 31] = localx;
                                    }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 167) {
                                 anInt1904 = 0;
                                 anInt1910 = 0;
                                 gamecon.initbits();
                                 localx = gamecon.readbits(8);
                                 if(localx < localNpcSize)
									for(localy = localx; localy < localNpcSize; ++localy)
										anIntArray2048[++anInt1904 - 1] = localNpcIndicies[localy];

                                 if(localx > localNpcSize)
									throw new RuntimeException("");

                                 localNpcSize = 0;

                                 for(localy = 0; localy < localx; ++localy) {
                                    var13 = localNpcIndicies[localy];
                                    final Class104_Sub18_Sub16_Sub7_Sub2 var23 = localNpcs[var13];
                                    var15 = gamecon.readbits(1);
                                    if(var15 == 0) {
                                       localNpcIndicies[++localNpcSize - 1] = var13;
                                       var23.anInt1739 = currentTime;
                                    } else {
                                       var16 = gamecon.readbits(2);
                                       if(var16 == 0) {
                                          localNpcIndicies[++localNpcSize - 1] = var13;
                                          var23.anInt1739 = currentTime;
                                          updates[++anInt1910 - 1] = var13;
                                       } else if(var16 == 1) {
                                          localNpcIndicies[++localNpcSize - 1] = var13;
                                          var23.anInt1739 = currentTime;
                                          var17 = gamecon.readbits(3);
                                          var23.step(var17, false);
                                          var18 = gamecon.readbits(1);
                                          if(var18 == 1)
											updates[++anInt1910 - 1] = var13;
                                       } else if(var16 == 2) {
                                          localNpcIndicies[++localNpcSize - 1] = var13;
                                          var23.anInt1739 = currentTime;
                                          var17 = gamecon.readbits(3);
                                          var23.step(var17, true);
                                          var18 = gamecon.readbits(3);
                                          var23.step(var18, true);
                                          var19 = gamecon.readbits(1);
                                          if(var19 == 1)
											updates[++anInt1910 - 1] = var13;
                                       } else if(var16 == 3)
										anIntArray2048[++anInt1904 - 1] = var13;
                                    }
                                 }

                                 Class2_Sub2.method483();
                                 Class7.method33();

                                 for(localx = 0; localx < anInt1904; ++localx) {
                                    localy = anIntArray2048[localx];
                                    if(localNpcs[localy].anInt1739 != currentTime) {
                                       localNpcs[localy].aClass104_Sub18_Sub2_1788 = null;
                                       localNpcs[localy] = null;
                                    }
                                 }

                                 if(gamecon.pos != pktSize)
									throw new RuntimeException(gamecon.pos + "," + pktSize);

                                 for(localx = 0; localx < localNpcSize; ++localx)
									if(null == localNpcs[localNpcIndicies[localx]])
										throw new RuntimeException(localx + "," + localNpcSize);

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              if(pktOpc == 197) {
                                 var82 = gamecon.readString();
                                 localy = gamecon.readMInt();
                                 var92 = Class47.method210(localy);
                                 if(!var82.equals(var92.aString1025)) {
                                    var92.aString1025 = var82;
                                    Class79.setflags(var92);
                                 }

                                 pktOpc = -1;
                                 var87 = true;
                                 break label3291;
                              }

                              Nodee.report("" + pktOpc + "," + anInt2042 + "," + anInt1815 + "," + pktSize, (Throwable)null);
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
                              var82 = "" + pktOpc + "," + anInt2042 + "," + anInt1815 + "," + pktSize + "," + (Class81.activePlayer.stepx[0] + Class53.anInt436) + "," + (Class81.activePlayer.stepy[0] + Class20.anInt206) + ",";

                              for(localy = 0; (localy < pktSize) && (localy < 50); ++localy)
								var82 = var82 + gamecon.backing[localy] + ",";

                              Nodee.report(var82, var69);
                              Class61_Sub1.method494();
                           }

                           var87 = true;
                        }

                     if(!var87)
						break;
                  }

                  if(loadstage == 30) {
                     Class43.writeClasscheckPacket(secureBuf, 108);
                     final Object var76 = Class2_Sub2.aClass72_865.anObject583;
                     synchronized(var76) {
                        if(!aBool1979)
							Class2_Sub2.aClass72_865.anInt581 = 0;
						else if((Class14.anInt100 != 0) || (Class2_Sub2.aClass72_865.anInt581 >= 40)) {
                           secureBuf.putOpcode(72);
                           secureBuf.writebyte(0);
                           map = secureBuf.pos;
                           var11 = 0;

                           for(localx = 0; (localx < Class2_Sub2.aClass72_865.anInt581) && ((secureBuf.pos - map) < 240); ++localx) {
                              ++var11;
                              localy = Class2_Sub2.aClass72_865.anIntArray580[localx];
                              if(localy < 0)
								localy = 0;
							else if(localy > 502)
								localy = 502;

                              var13 = Class2_Sub2.aClass72_865.anIntArray582[localx];
                              if(var13 < 0)
								var13 = 0;
							else if(var13 > 764)
								var13 = 764;

                              var14 = (localy * 765) + var13;
                              if((Class2_Sub2.aClass72_865.anIntArray580[localx] == -1) && (Class2_Sub2.aClass72_865.anIntArray582[localx] == -1)) {
                                 var13 = -1;
                                 localy = -1;
                                 var14 = 524287;
                              }

                              if((var13 == anInt1801) && (localy == anInt1802)) {
                                 if(anInt1803 < 2047)
									++anInt1803;
                              } else {
                                 var15 = var13 - anInt1801;
                                 anInt1801 = var13;
                                 var16 = localy - anInt1802;
                                 anInt1802 = localy;
                                 if((anInt1803 < 8) && (var15 >= -32) && (var15 <= 31) && (var16 >= -32) && (var16 <= 31)) {
                                    var15 += 32;
                                    var16 += 32;
                                    secureBuf.writeShort(var16 + (anInt1803 << 12) + (var15 << 6));
                                    anInt1803 = 0;
                                 } else if(anInt1803 < 8) {
                                    secureBuf.writeTribyte(var14 + (anInt1803 << 19) + 8388608);
                                    anInt1803 = 0;
                                 } else {
                                    secureBuf.writeInt((anInt1803 << 19) + -1073741824 + var14);
                                    anInt1803 = 0;
                                 }
                              }
                           }

                           secureBuf.method613(secureBuf.pos - map);
                           if(var11 >= Class2_Sub2.aClass72_865.anInt581)
							Class2_Sub2.aClass72_865.anInt581 = 0;
						else {
                              Class2_Sub2.aClass72_865.anInt581 -= var11;

                              for(localx = 0; localx < Class2_Sub2.aClass72_865.anInt581; ++localx) {
                                 Class2_Sub2.aClass72_865.anIntArray582[localx] = Class2_Sub2.aClass72_865.anIntArray582[localx + var11];
                                 Class2_Sub2.aClass72_865.anIntArray580[localx] = Class2_Sub2.aClass72_865.anIntArray580[localx + var11];
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

                        localx = Class14.anInt101;
                        if(localx < 0)
							localx = 0;
						else if(localx > 764)
							localx = 764;

                        localy = localx + (var11 * 765);
                        byte var128 = 0;
                        if(Class14.anInt100 == 2)
							var128 = 1;

                        var14 = (int)var52;
                        secureBuf.putOpcode(161);
                        secureBuf.writeIntV1((var14 << 20) + (var128 << 19) + localy);
                     }

                     if(anInt1878 > 0)
						--anInt1878;

                     if(Class25.aBoolArray249[96] || Class25.aBoolArray249[97] || Class25.aBoolArray249[98] || Class25.aBoolArray249[99])
						aBool1791 = true;

                     if(aBool1791 && (anInt1878 <= 0)) {
                        anInt1878 = 20;
                        aBool1791 = false;
                        secureBuf.putOpcode(79);
                        secureBuf.writeLEShort(anInt1962);
                        secureBuf.writeShortA(anInt1866);
                     }

                     if(Class100.aBool799 && !aBool1945) {
                        aBool1945 = true;
                        secureBuf.putOpcode(178);
                        secureBuf.writebyte(1);
                     }

                     if(!Class100.aBool799 && aBool1945) {
                        aBool1945 = false;
                        secureBuf.putOpcode(178);
                        secureBuf.writebyte(0);
                     }

                     if(lowmvm && (anInt1988 != Class12.myplayerHeight))
						Class19.method120(Class54.anInt447, FSManager.anInt761, Class12.myplayerHeight, Class81.activePlayer.stepx[0], Class81.activePlayer.stepy[0]);
					else if(anInt2013 != Class12.myplayerHeight) {
                        anInt2013 = Class12.myplayerHeight;
                        var8 = Class12.myplayerHeight;
                        final int[] var71 = Class104_Sub2.aClass104_Sub18_Sub17_Sub1_861.anIntArray1592;
                        var11 = var71.length;

                        for(localx = 0; localx < var11; ++localx)
							var71[localx] = 0;

                        localx = 1;

                        while(true) {
                           if(localx >= 103) {
                              localx = (((238 + (int)(Math.random() * 20.0D)) - 10) << 16) + (((238 + (int)(Math.random() * 20.0D)) - 10) << 8) + ((238 + (int)(Math.random() * 20.0D)) - 10);
                              localy = ((238 + (int)(Math.random() * 20.0D)) - 10) << 16;
                              Class104_Sub2.aClass104_Sub18_Sub17_Sub1_861.method833();

                              for(var13 = 1; var13 < 103; ++var13)
								for(var14 = 1; var14 < 103; ++var14) {
                                    if((Class76.aByteArrayArrayArray600[var8][var14][var13] & 24) == 0)
										Class44.method191(var8, var14, var13, localx, localy);

                                    if((var8 < 3) && ((Class76.aByteArrayArrayArray600[var8 + 1][var14][var13] & 8) != 0))
										Class44.method191(var8 + 1, var14, var13, localx, localy);
                                 }

                              anInt2014 = 0;

                              for(var13 = 0; var13 < 104; ++var13)
								for(var14 = 0; var14 < 104; ++var14) {
                                    var15 = Class81.aClass17_643.method88(Class12.myplayerHeight, var13, var14);
                                    if(var15 != 0) {
                                       var15 = (var15 >> 14) & 32767;
                                       var16 = ItemDef.forId(var15).anInt1351;
                                       if(var16 >= 0) {
                                          var17 = var13;
                                          var18 = var14;
                                          if((var16 != 22) && (var16 != 29) && (var16 != 34) && (var16 != 36) && (var16 != 46) && (var16 != 47) && (var16 != 48)) {
                                             final int[][] var130 = aClass67Array1975[Class12.myplayerHeight].anIntArrayArray553;

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

                           localy = (2048 * (103 - localx)) + 24628;

                           for(var13 = 1; var13 < 103; ++var13) {
                              if((Class76.aByteArrayArrayArray600[var8][var13][localx] & 24) == 0)
								Class81.aClass17_643.method92(var71, localy, 512, var8, var13, localx);

                              if((var8 < 3) && ((Class76.aByteArrayArrayArray600[1 + var8][var13][localx] & 8) != 0))
								Class81.aClass17_643.method92(var71, localy, 512, 1 + var8, var13, localx);

                              localy += 4;
                           }

                           ++localx;
                        }
                     }

                     if(loadstage == 30) {
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
                                    localx = (anIntArray2032[var8] & 255) * 128;
                                    localy = (anIntArray2032[var8] >> 16) & 255;
                                    var13 = ((128 * localy) + 64) - Class81.activePlayer.anInt1695;
                                    if(var13 < 0)
										var13 = -var13;

                                    var14 = (anIntArray2032[var8] >> 8) & 255;
                                    var15 = ((var14 * 128) + 64) - Class81.activePlayer.anInt1694;
                                    if(var15 < 0)
										var15 = -var15;

                                    var16 = (var13 + var15) - 128;
                                    if(var16 > localx) {
                                       anIntArray2031[var8] = -100;
                                       continue;
                                    }

                                    if(var16 < 0)
										var16 = 0;

                                    var11 = (anInt2026 * (localx - var16)) / localx;
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

                              for(map = var8; map < anInt2028; ++map) {
                                 anIntArray2029[map] = anIntArray2029[1 + map];
                                 aClass82Array2033[map] = aClass82Array2033[map + 1];
                                 anIntArray1875[map] = anIntArray1875[1 + map];
                                 anIntArray2031[map] = anIntArray2031[map + 1];
                                 anIntArray2032[map] = anIntArray2032[1 + map];
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
                           Widget.method537();
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
                                 Class79.setflags(Class30.aClass104_Sub12_288);
                                 Class30.aClass104_Sub12_288 = null;
                              }
                           }

                           Widget var79;
                           boolean var113;
                           if(Class67.aClass104_Sub12_556 != null) {
                              Class79.setflags(Class67.aClass104_Sub12_556);
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

                                       localx = Class104_Sub3.method485(var79);
                                       var113 = ((localx >> 29) & 1) != 0;
                                       if(var113) {
                                          localy = anInt1901;
                                          var13 = anInt1924;
                                          var79.anIntArray1080[var13] = var79.anIntArray1080[localy];
                                          var79.anIntArray1081[var13] = var79.anIntArray1081[localy];
                                          var79.anIntArray1080[localy] = -1;
                                          var79.anIntArray1081[localy] = 0;
                                       } else if(var134 == 1) {
                                          localy = anInt1901;
                                          var13 = anInt1924;

                                          while(var13 != localy)
											if(localy > var13) {
                                                var79.method530(localy - 1, localy);
                                                --localy;
                                             } else if(localy < var13) {
                                                var79.method530(1 + localy, localy);
                                                ++localy;
                                             }
                                       } else
										var79.method530(anInt1924, anInt1901);

                                       secureBuf.putOpcode(2);
                                       secureBuf.writeIntV1(Class67.aClass104_Sub12_556.anInt978);
                                       secureBuf.writeLEShortA(anInt1924);
                                       secureBuf.writeByteA(var134);
                                       secureBuf.writeLEShort(anInt1901);
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
                           final Widget var75 = Class20.aClass104_Sub12_207;
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
                                 Class97.method438(currentWidget, 0, 0, 765, 503, 0, 0);
                                 ++anInt1978;

                                 while(true) {
                                    CS cs1;
                                    Widget var97;
                                    do {
                                       cs1 = (CS)aClass59_1985.method250();
                                       if(null == cs1)
										while(true) {
                                             do {
                                                cs1 = (CS)aClass59_1957.method250();
                                                if(cs1 == null)
													while(true) {
													      do {
													         cs1 = (CS)aClass59_1984.method250();
													         if(null == cs1) {
													            if(null != aClass104_Sub12_1958) {
													               Class79.setflags(aClass104_Sub12_1958);
													               ++Class89.anInt703;
													               if(aBool1965 && aBool1987) {
													                  var11 = Class14.anInt91;
													                  localx = Class14.anInt95;
													                  var11 -= anInt1976;
													                  localx -= anInt1960;
													                  if(var11 < anInt2035)
																		var11 = anInt2035;

													                  if((var11 + aClass104_Sub12_1958.anInt987) > (anInt2035 + aClass104_Sub12_2019.anInt987))
																		var11 = (aClass104_Sub12_2019.anInt987 + anInt2035) - aClass104_Sub12_1958.anInt987;

													                  if(localx < anInt1964)
																		localx = anInt1964;

													                  if((aClass104_Sub12_1958.anInt988 + localx) > (anInt1964 + aClass104_Sub12_2019.anInt988))
																		localx = (anInt1964 + aClass104_Sub12_2019.anInt988) - aClass104_Sub12_1958.anInt988;

													                  localy = var11 - anInt1966;
													                  var13 = localx - anInt1967;
													                  var14 = aClass104_Sub12_1958.anInt1041;
													                  if((Class89.anInt703 > aClass104_Sub12_1958.anInt1082) && ((localy > var14) || (localy < -var14) || (var13 > var14) || (var13 < -var14)))
																		aBool1804 = true;

													                  var15 = (var11 - anInt2035) + aClass104_Sub12_2019.anInt991;
													                  var16 = aClass104_Sub12_2019.anInt992 + (localx - anInt1964);
													                  CS cs2;
													                  if((aClass104_Sub12_1958.anObjectArray976 != null) && aBool1804) {
													                     cs2 = new CS();
													                     cs2.ownerRSFaceHash = aClass104_Sub12_1958;
													                     cs2.anInt937 = var15;
													                     cs2.anInt935 = var16;
													                     cs2.params = aClass104_Sub12_1958.anObjectArray976;
													                     Class46.doCS(cs2);
													                  }

													                  if(Class14.anInt93 == 0) {
													                     if(aBool1804) {
													                        if(null != aClass104_Sub12_1958.anObjectArray1055) {
													                           cs2 = new CS();
													                           cs2.ownerRSFaceHash = aClass104_Sub12_1958;
													                           cs2.anInt937 = var15;
													                           cs2.anInt935 = var16;
													                           cs2.aClass104_Sub12_940 = aClass104_Sub12_1961;
													                           cs2.params = aClass104_Sub12_1958.anObjectArray1055;
													                           Class46.doCS(cs2);
													                        }

													                        if(aClass104_Sub12_1961 != null) {
													                           Widget var136 = aClass104_Sub12_1958;
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
													               localx = Class17.anInt159;
													               var103 = Class104_Sub13.method543(Class81.activePlayer.stepx[0], Class81.activePlayer.stepy[0], var11, localx, true, 0, 0, 0, 0, 0, 0);
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
													                     localx = Class14.anInt91;
													                     localy = Class14.anInt95;
													                     if((localx < (Class50.anInt422 - 10)) || (localx > (Class12.anInt74 + Class50.anInt422 + 10)) || (localy < (Class36.anInt349 - 10)) || (localy > (Class78.anInt627 + Class36.anInt349 + 10))) {
													                        aBool1930 = false;
													                        Class44.method192(Class50.anInt422, Class36.anInt349, Class12.anInt74, Class78.anInt627);
													                     }
													                  }

													                  if(var11 == 1) {
													                     localx = Class50.anInt422;
													                     localy = Class36.anInt349;
													                     var13 = Class12.anInt74;
													                     var14 = Class14.anInt101;
													                     var15 = Class14.anInt102;
													                     var16 = -1;

													                     for(var17 = 0; var17 < anInt1805; ++var17) {
													                        var18 = ((anInt1805 - 1 - var17) * 15) + 31 + localy;
													                        if((var14 > localx) && (var14 < (var13 + localx)) && (var15 > (var18 - 13)) && (var15 < (var18 + 3)))
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
													                        localx = anIntArray1933[anInt1805 - 1];
													                        if((localx == 39) || (localx == 40) || (localx == 41) || (localx == 42) || (localx == 43) || (localx == 33) || (localx == 34) || (localx == 35) || (localx == 36) || (localx == 37) || (localx == 38) || (localx == 1005))
																				label3386: {
																				      localy = anIntArray1931[anInt1805 - 1];
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
																						Class79.setflags(Class67.aClass104_Sub12_556);

																				      Class67.aClass104_Sub12_556 = Class47.method210(var13);
																				      anInt1901 = localy;
																				      anInt1902 = Class14.anInt101;
																				      anInt1903 = Class14.anInt102;
																				      Class79.setflags(Class67.aClass104_Sub12_556);
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
																	Class79.setflags(var79);

													               if(Class76.aClass104_Sub12_619 != null)
																	Class79.setflags(Class76.aClass104_Sub12_619);
													            }

													            if((var75 != Class20.aClass104_Sub12_207) && (anInt1940 == anInt1864)) {
													               if(var75 != null)
																	Class79.setflags(var75);

													               if(Class20.aClass104_Sub12_207 != null)
																	Class79.setflags(Class20.aClass104_Sub12_207);
													            }

													            if(null != Class20.aClass104_Sub12_207) {
													               if(anInt1864 < anInt1940) {
													                  ++anInt1864;
													                  if(anInt1864 == anInt1940)
																		Class79.setflags(Class20.aClass104_Sub12_207);
													               }
													            } else if(anInt1864 > 0)
																	--anInt1864;

													            var11 = anInt1986 + Class81.activePlayer.anInt1695;
													            localx = anInt1857 + Class81.activePlayer.anInt1694;
													            if(((Class50.anInt421 - var11) < -500) || ((Class50.anInt421 - var11) > 500) || ((Class104_Sub2.anInt860 - localx) < -500) || ((Class104_Sub2.anInt860 - localx) > 500)) {
													               Class50.anInt421 = var11;
													               Class104_Sub2.anInt860 = localx;
													            }

													            if(Class50.anInt421 != var11)
																	Class50.anInt421 += (var11 - Class50.anInt421) / 16;

													            if(localx != Class104_Sub2.anInt860)
																	Class104_Sub2.anInt860 += (localx - Class104_Sub2.anInt860) / 16;

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

													            localy = Class50.anInt421 >> 7;
													            var13 = Class104_Sub2.anInt860 >> 7;
													            var14 = Class47.method211(Class50.anInt421, Class104_Sub2.anInt860, Class12.myplayerHeight);
													            var15 = 0;
													            if((localy > 3) && (var13 > 3) && (localy < 100) && (var13 < 100))
																	for(var16 = localy - 4; var16 <= (4 + localy); ++var16)
																		for(var17 = var13 - 4; var17 <= (var13 + 4); ++var17) {
																	         var18 = Class12.myplayerHeight;
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
													            localy = Class25.anInt256;
													            if((var11 > 15000) && (localy > 15000)) {
													               anInt1836 = 250;
													               Class104_Sub16.method553(14500);
													               secureBuf.putOpcode(38);
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
																	secureBuf.putOpcode(228);

													            try {
													               if((null != Class20.stream) && (secureBuf.pos > 0)) {
													                  Class20.stream.flushbytes(secureBuf.backing, 0, secureBuf.pos);
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

													         var97 = cs1.ownerRSFaceHash;
													         if(var97.anInt1018 < 0)
																break;

													         var7 = Class47.method210(var97.anInt1091);
													      } while((null == var7) || (null == var7.aClass104_Sub12Array1020) || (var97.anInt1018 >= var7.aClass104_Sub12Array1020.length) || (var97 != var7.aClass104_Sub12Array1020[var97.anInt1018]));

													      Class46.doCS(cs1);
													   }

                                                var97 = cs1.ownerRSFaceHash;
                                                if(var97.anInt1018 < 0)
													break;

                                                var7 = Class47.method210(var97.anInt1091);
                                             } while((var7 == null) || (var7.aClass104_Sub12Array1020 == null) || (var97.anInt1018 >= var7.aClass104_Sub12Array1020.length) || (var97 != var7.aClass104_Sub12Array1020[var97.anInt1018]));

                                             Class46.doCS(cs1);
                                          }

                                       var97 = cs1.ownerRSFaceHash;
                                       if(var97.anInt1018 < 0)
										break;

                                       var7 = Class47.method210(var97.anInt1091);
                                    } while((var7 == null) || (null == var7.aClass104_Sub12Array1020) || (var97.anInt1018 >= var7.aClass104_Sub12Array1020.length) || (var97 != var7.aClass104_Sub12Array1020[var97.anInt1018]));

                                    Class46.doCS(cs1);
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
            } else if(loadstage == 40)
				Class104_Sub8_Sub4.login();

            return;
         }

         var3.aClass61_Sub1_1098.method488(var3.aClass16_1095, (int)var3.nodeId, var3.aByteArray1096, false);
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
			FSManager.method437(Class57.aCanvas468);
			if (Class25.aClass3_257 != null)
				Class25.aClass3_257.method23(Class57.aCanvas468, 1813162168);
		}

		int perc;
		int var9;
		int var10;
		int var11;
		if (loadstage == 0) {
			perc = Class66.anInt534;
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
					var8.fillRect(2, 2, 3 * perc, 30);
					var8.setColor(Color.black);
					var8.drawRect(1, 1, 301, 31);
					var8.fillRect(2 + (3 * perc), 2, 300 - (3 * perc), 30);
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
					var7.fillRect(2 + var9, 2 + var10, perc * 3, 30);
					var7.setColor(Color.black);
					var7.drawRect(var9 + 1, var10 + 1, 301, 31);
					var7.fillRect((3 * perc) + var9 + 2, var10 + 2, 300 - (3 * perc), 30);
					var7.setFont(Class50.aFont420);
					var7.setColor(Color.white);
					var7.drawString(var5, var9 + ((304 - Class104_Sub18_Sub15.aFontMetrics1466.stringWidth(var5)) / 2),
							22 + var10);
				}
			} catch (final Exception var21) {
				Class57.aCanvas468.repaint();
			}
		} else if (loadstage == 5)
			BZip2Context.method153(Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36,
					Class104_Sub7.aClass104_Sub18_Sub17_Sub2_Sub1_951);
		else if (loadstage == 10)
			BZip2Context.method153(Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36,
					Class104_Sub7.aClass104_Sub18_Sub17_Sub2_Sub1_951);
		else if (loadstage == 20)
			BZip2Context.method153(Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36,
					Class104_Sub7.aClass104_Sub18_Sub17_Sub2_Sub1_951);
		else if (loadstage == 25) {
			if (loadtype == 1) {
				if (mapfails > prog)
					prog = mapfails;

				perc = ((prog * 50) - (mapfails * 50)) / prog;
				Class104_Sub15.drawLoading("Loading - please wait." + "<br>" + " (" + perc + "%" + ")", false);
			} else if (loadtype == 2) {
				if (anInt1843 > anInt1844)
					anInt1844 = anInt1843;

				perc = (((anInt1844 * 50) - (anInt1843 * 50)) / anInt1844) + 50;
				Class104_Sub15.drawLoading("Loading - please wait." + "<br>" + " (" + perc + "%" + ")", false);
			} else
				Class104_Sub15.drawLoading("Loading - please wait.", false);
		} else if (loadstage == 30) {
			if (!aBool1930) {
				aStringArray1863[0] = "Cancel";
				aStringArray1936[0] = "";
				anIntArray1933[0] = 1006;
				anInt1805 = 1;
			}

			if (currentWidget != -1) {
				perc = currentWidget;
				if (Class104_Sub7.loaded(perc))
					Class97.drawwid(Class22.widgets[perc], -1);
			}

			for (perc = 0; perc < anInt1982; ++perc) {
				if (rsfacesFlag[perc])
					aBoolArray1991[perc] = true;

				aBoolArray1992[perc] = rsfacesFlag[perc];
				rsfacesFlag[perc] = false;
			}

			anInt1928 = currentTime;
			anInt1841 = -1;
			anInt1845 = -1;
			Class89.aClass104_Sub12_705 = null;
			if (currentWidget != -1) {
				anInt1982 = 0;
				Class104_Sub18_Sub11.method770(currentWidget, 0, 0, 765, 503, 0, 0, -1);
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
					perc = anInt1841;
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

						Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.method869(var26, perc + 4, 15 + var11, 16777215, 0,
								currentTime / 1000);
					}
				}
			} else {
				perc = Class50.anInt422;
				var11 = Class36.anInt349;
				final int var13 = Class12.anInt74;
				final int var14 = Class78.anInt627;
				var12 = 6116423;
				Class104_Sub18_Sub17.method805(perc, var11, var13, var14, var12);
				Class104_Sub18_Sub17.method805(1 + perc, 1 + var11, var13 - 2, 16, 0);
				Class104_Sub18_Sub17.method806(1 + perc, 18 + var11, var13 - 2, var14 - 19, 0);
				Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.drawstr("Choose Option", perc + 3, var11 + 14, var12, -1);
				var9 = Class14.anInt91;
				var10 = Class14.anInt95;

				int var15;
				int var16;
				int var17;
				for (var15 = 0; var15 < anInt1805; ++var15) {
					var16 = var11 + 31 + ((anInt1805 - 1 - var15) * 15);
					var17 = 16777215;
					if ((var9 > perc) && (var9 < (var13 + perc)) && (var10 > (var16 - 13)) && (var10 < (var16 + 3)))
						var17 = 16776960;

					Class6.aClass104_Sub18_Sub17_Sub2_Sub1_36.drawstr(Class79.method349(var15), 3 + perc, var16,
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
				for (perc = 0; perc < anInt1982; ++perc)
					if (aBoolArray1992[perc])
						Class104_Sub18_Sub17.method802(anIntArray1993[perc], anIntArray1876[perc], anIntArray1995[perc],
								anIntArray1996[perc], 16711935, 128);
					else if (aBoolArray1991[perc])
						Class104_Sub18_Sub17.method802(anIntArray1993[perc], anIntArray1876[perc], anIntArray1995[perc],
								anIntArray1996[perc], 16711680, 128);

			Class104_Sub8_Sub4.method738(Class12.myplayerHeight, Class81.activePlayer.anInt1695,
					Class81.activePlayer.anInt1694, anInt1867);
			anInt1867 = 0;
		} else if (loadstage == 40)
			Class104_Sub15.drawLoading("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);

		Graphics var24;
		if ((loadstage == 30) && (anInt1997 == 0) && !aBool1755)
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
		else if (loadstage > 0)
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
		if (loadstage != 1000) {
			final boolean var1 = Class49.method221();
			if (!var1)
				method952();

		}
	}

	void method952() {
		if (Class87.anInt693 >= 4) {
			method944("js5crc");
			loadstage = 1000;
		} else {
			if (Class87.anInt698 >= 4) {
				if (loadstage <= 5) {
					method944("js5io");
					loadstage = 1000;
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
						Class43.aClass13_374.flushbytes(var1.backing, 0, 5);
						++anInt1954;
						aLong1819 = Class71.method332();
					}

					if (anInt1954 == 3)
						if ((loadstage > 5) && (Class43.aClass13_374.avail() <= 0)) {
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
						Class86.method394(Class43.aClass13_374, loadstage > 20);
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
				loadstage = 1000;
			} else if (anInt1855 >= 4)
				if (loadstage <= 5) {
					method944("js5connect");
					loadstage = 1000;
				} else
					anInt1818 = 3000;
		} else if (loadstage <= 5) {
			method944("js5connect_full");
			loadstage = 1000;
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
		localPlayers = new Player[2048];
		localPlrSize = 0;
		localPlayerIndexs = new int[2048];
		anInt1910 = 0;
		updates = new int[2048];
		cachedAppearances = new RSBuf[2048];
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
		currentWidget = -1;
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
		rsfacesFlag = new boolean[100];
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
		aClass104_Sub18_Sub17_Sub1Array2017 = new Sprite[1000];
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
		aClass85_2047 = new Looks();
		anInt1887 = -1;
		anInt2049 = -1;
	}

	@Override
	final void method942(final int var1) {
		Class104_Sub3.anInt879 = anInt1792 == 0 ? '\uaa4a' : anInt1939 + '\u9c40';
		Class60.anInt478 = anInt1792 == 0 ? 443 : '\uc350' + anInt1939;
		Class87.anInt699 = Class104_Sub3.anInt879;
		Class57.aShortArray465 = Class97.aShortArray764;
		Class47.skinCols = Class97.aShortArrayArray763;
		Looks.aShortArray663 = Class97.aShortArray762;
		Looks.aShortArrayArray668 = Class97.aShortArrayArray765;
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
		FSManager.method437(Class57.aCanvas468);
		Class25.aClass3_257 = Class46.method205(-1943632078);
		if (Class25.aClass3_257 != null)
			Class25.aClass3_257.method23(Class57.aCanvas468, 1813162168);

		Class88.aClass16_701 = new JagFS2(255, Class24.maindata, Class24.idx255, 500000);
		if (anInt1792 != 0)
			aBool1860 = true;

	}

	public static String huffmanDecode(final RSBuf buf) {
		String r;
		try {
			int size = buf.readsmart();
			if (size > 32767)
				size = 32767;
	
			final byte[] to = new byte[size];
			buf.pos += Class106.huffman.decihper(buf.backing, buf.pos, to, 0, size);
			final String result = decodeStr(to, 0, size);
			r = result;
		} catch (final Exception var6) {
			r = "Cabbage";
		}
	
		return r;
	}

	public static String format(final String src) {
		final int len = src.length();
		final char[] chars = new char[len];
		byte type = 2;
	
		for (int var4 = 0; var4 < len; ++var4) {
			char cur = src.charAt(var4);
			if (type == 0)
				cur = Character.toLowerCase(cur);
			else if ((type == 2) || Character.isUpperCase(cur))
				cur = Class99.cased(cur);
	
			if (Character.isLetter(cur))
				type = 0;
			else if ((cur != 46) && (cur != 63) && (cur != 33)) {
				if (Character.isSpaceChar(cur)) {
					if (type != 2)
						type = 1;
				} else
					type = 1;
			} else
				type = 2;
	
			chars[var4] = cur;
		}
	
		return new String(chars);
	}

	public static String fixed(final String src) {
		final int len = src.length();
		int size = 0;
	
		for (int i = 0; i < len; ++i) {
			final char c = src.charAt(i);
			if ((c == 60) || (c == 62))
				size += 3;
		}
	
		final StringBuilder sb = new StringBuilder(len + size);
	
		for (int i = 0; i < len; ++i) {
			final char c = src.charAt(i);
			if (c == 60)
				sb.append("<lt>");
			else if (c == 62)
				sb.append("<gt>");
			else
				sb.append(c);
		}
	
		return sb.toString();
	}

	public static String decodeStr(final byte[] source, final int var1, final int length) {
		final char[] result = new char[length];
		int count = 0;
	
		for (int i = 0; i < length; ++i) {
			int c = source[var1 + i] & 255;
			if (c != 0) {
				if ((c >= 128) && (c < 160)) {
					char proper = client.validChars[c - 128];
					if (proper == 0)
						proper = 63;
	
					c = proper;
				}
	
				result[count++] = (char) c;
			}
		}
	
		return new String(result, 0, count);
	}

	public static int typeFor(final int var0, final int var1, int var2, int var3, int var4, final int var5) {
		if ((var5 & 1) == 1) {
			final int var6 = var3;
			var3 = var4;
			var4 = var6;
		}
	
		var2 &= 3;
		return var2 == 0 ? var0 : (var2 == 1 ? var1 : (var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1)));
	}

	public static Class104_Sub18_Sub1 method150(final int var0) {
		Class104_Sub18_Sub1 var1 = (Class104_Sub18_Sub1) Class104_Sub18_Sub1.aClass56_1188.method236(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class104_Sub18_Sub1.aClass61_1191.decompress(1, var0);
			var1 = new Class104_Sub18_Sub1();
			if (null != var2)
				var1.method632(new RSBuf(var2), var0);
	
			var1.method631();
			Class104_Sub18_Sub1.aClass56_1188.method238(var1, var0);
			return var1;
		}
	}

	static final void method149() {
		for (Class104_Sub18_Sub16_Sub3 var0 = (Class104_Sub18_Sub16_Sub3) aClass59_1869
				.method251(); var0 != null; var0 = (Class104_Sub18_Sub16_Sub3) aClass59_1869.method252())
			if ((var0.anInt1516 == Class12.myplayerHeight) && !var0.aBool1517) {
				if (currentTime >= var0.anInt1515) {
					var0.method810(anInt1867);
					if (var0.aBool1517)
						var0.method470();
					else
						Class81.aClass17_643.method97(var0.anInt1516, var0.anInt1522, var0.anInt1518, var0.anInt1523,
								60, var0, 0, -1, false);
				}
			} else
				var0.method470();
	
	}

	static void showResponce(final int code) {
		if (code == -3)
			Class104_Sub18_Sub2.drawlogin("Connection timed out.", "Please try using a different world.", "");
		else if (code == -2)
			Class104_Sub18_Sub2.drawlogin("", "Error connecting to server.", "");
		else if (code == -1)
			Class104_Sub18_Sub2.drawlogin("No response from server.", "Please try using a different world.", "");
		else if (code == 3)
			Class104_Sub18_Sub2.drawlogin("", "Invalid username/email or password.", "");
		else if (code == 4)
			Class104_Sub18_Sub2.drawlogin("Your account has been disabled.",
					"Please check your message-centre for details.", "");
		else if (code == 5)
			Class104_Sub18_Sub2.drawlogin("Your account is already logged in.", "Try again in 60 secs...", "");
		else if (code == 6)
			Class104_Sub18_Sub2.drawlogin("RuneScape has been updated!", "Please reload this page.", "");
		else if (code == 7)
			Class104_Sub18_Sub2.drawlogin("This world is full.", "Please use a different world.", "");
		else if (code == 8)
			Class104_Sub18_Sub2.drawlogin("Unable to connect.", "Login server offline.", "");
		else if (code == 9)
			Class104_Sub18_Sub2.drawlogin("Login limit exceeded.", "Too many connections from your address.", "");
		else if (code == 10)
			Class104_Sub18_Sub2.drawlogin("Unable to connect.", "Bad session id.", "");
		else if (code == 11)
			Class104_Sub18_Sub2.drawlogin("We suspect someone knows your password.",
					"Press \'change your password\' on front page.", "");
		else if (code == 12)
			Class104_Sub18_Sub2.drawlogin("You need a members account to login to this world.",
					"Please subscribe, or use a different world.", "");
		else if (code == 13)
			Class104_Sub18_Sub2.drawlogin("Could not complete login.", "Please try using a different world.", "");
		else if (code == 14)
			Class104_Sub18_Sub2.drawlogin("The server is being updated.", "Please wait 1 minute and try again.", "");
		else if (code == 16)
			Class104_Sub18_Sub2.drawlogin("Too many incorrect logins from your address.",
					"Please wait 5 minutes before trying again.", "");
		else if (code == 17)
			Class104_Sub18_Sub2.drawlogin("You are standing in a members-only area.",
					"To play on this world move to a free area first", "");
		else if (code == 18)
			Class104_Sub18_Sub2.drawlogin("Account locked as we suspect it has been stolen.",
					"Press \'recover a locked account\' on front page.", "");
		else if (code == 19)
			Class104_Sub18_Sub2.drawlogin("This world is running a closed Beta.", "Sorry invited players only.",
					"Please use a different world.");
		else if (code == 20)
			Class104_Sub18_Sub2.drawlogin("Invalid loginserver requested.", "Please try using a different world.", "");
		else if (code == 22)
			Class104_Sub18_Sub2.drawlogin("Malformed login packet.", "Please try again.", "");
		else if (code == 23)
			Class104_Sub18_Sub2.drawlogin("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		else if (code == 24)
			Class104_Sub18_Sub2.drawlogin("Error loading your profile.", "Please contact customer support.", "");
		else if (code == 25)
			Class104_Sub18_Sub2.drawlogin("Unexpected loginserver response.", "Please try using a different world.",
					"");
		else if (code == 26)
			Class104_Sub18_Sub2.drawlogin("This computers address has been blocked",
					"as it was used to break our rules.", "");
		else if (code == 27)
			Class104_Sub18_Sub2.drawlogin("", "Service unavailable.", "");
		else if (code == 31)
			Class104_Sub18_Sub2.drawlogin("Your account must have a displayname set",
					"in order to play the game.  Please set it", "via the website, or the main game.");
		else if (code == 32)
			Class104_Sub18_Sub2.drawlogin("Your attempt to log into your account was",
					"unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
		else if (code == 37)
			Class104_Sub18_Sub2.drawlogin("Your account is currently inaccessible.",
					"Please try again in a few minutes.", "");
		else if (code == 38)
			Class104_Sub18_Sub2.drawlogin("You need to vote to play!", "Visit runescape.com and vote,",
					"and then come back here!");
		else if (code == 55)
			Class104_Sub18_Sub2.drawlogin("Sorry, but your account is not eligible to",
					"play this version of the game.  Please try", "playing the main game instead!");
		else
			Class104_Sub18_Sub2.drawlogin("Unexpected server response", "Please try using a different world.", "");
	
		Class10.method40(10);
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
		Class33.method159(FSManager.aClass57Array758, 0, FSManager.aClass57Array758.length - 1, Class66.anIntArray519,
				Class66.anIntArray545);
	}
}
