public class Widget extends Class104 {
	static Class61 aClass61_971;
	public Object[] anObjectArray972;
	static Class61 aClass61_995;
	public static Class61 requester;
	public Object[] anObjectArray1014;
	public Widget[] aClass104_Sub12Array1020;
	public Object[] anObjectArray1067;
	public Object[] anObjectArray1068;
	public Object[] anObjectArray1070;
	public Object[] anObjectArray1072;
	public Object[] anObjectArray1073;
	public boolean isHeaderless = false;
	public int anInt980;
	public int anInt981 = 0;
	public int anInt982 = 0;
	public int anInt983 = 0;
	public int anInt985 = 0;
	public int anInt1005 = 0;
	public int anInt975 = 0;
	public int anInt987 = 0;
	public int anInt988 = 0;
	public int anInt1000 = 0;
	public int anInt1091 = -1;
	public int anInt1077 = -1;
	public int[] anIntArray984;
	public int[] anIntArray1076;
	public int[][] anIntArrayArray1069;
	public int anInt994 = 0;
	public boolean aBool1075 = false;
	public int[] anIntArray1080;
	public int[] anIntArray1081;
	public int anInt1037 = 0;
	public int anInt1059 = 0;
	public int anInt1029 = 0;
	public int anInt1027 = 0;
	public int anInt1024 = -1;
	public boolean aBool1088 = false;
	public int anInt1038 = 0;
	public int anInt1032 = 0;
	public int[] anIntArray1049;
	public int[] anIntArray1057;
	public int[] anIntArray1035;
	public String aString1025 = "";
	public String aString1004 = "";
	public int anInt1017 = 0;
	public boolean aBool1030 = false;
	public String[] aStringArray1028;
	public int anInt996 = 0;
	public int anInt997 = 0;
	public int anInt998 = 0;
	public int anInt1002 = -1;
	public int anInt1003 = -1;
	public int anInt1010 = 1;
	public int anInt1011 = -1;
	int anInt1071 = 1;
	int anInt1013 = -1;
	public int anInt1058 = -1;
	public int anInt1015 = -1;
	public String aString1036 = "";
	public String aString1078 = "";
	public int anInt1021 = 100;
	public int anInt1043 = 0;
	public int anInt1019 = 0;
	public String aString1054 = "Ok";
	public int anInt1079 = 0;
	public int anInt979 = 0;
	public boolean aBool989 = false;
	public int anInt1006 = 0;
	public int anInt1007 = 0;
	public int anInt1016 = 0;
	public int anInt993 = 0;
	public int anInt1012 = 0;
	public boolean aBool1044;
	public int anInt999 = 1;
	public String aString990 = "";
	public boolean aBool1023 = false;
	public String[] aStringArray1039;
	public int anInt1041 = 0;
	public int anInt1082 = 0;
	public boolean aBool1009;
	public boolean aBool1053 = false;
	public Object[] opcodeKeys;
	public Object[] anObjectArray1051;
	public Object[] anObjectArray1033;
	public Object[] anObjectArray1031;
	public Object[] anObjectArray1056;
	public Object[] anObjectArray1034;
	public Object[] anObjectArray1060;
	public Object[] anObjectArray1062;
	public Object[] anObjectArray1064;
	public Object[] anObjectArray1042;
	public Object[] anObjectArray1052;
	public Object[] anObjectArray1047;
	public Object[] anObjectArray1048;
	public Object[] anObjectArray1046;
	public Object[] anObjectArray1050;
	public Object[] anObjectArray976;
	public Object[] anObjectArray1055;
	public Object[] anObjectArray1026;
	public int[] anIntArray1084;
	public int[] anIntArray1061;
	public int[] anIntArray1063;
	public static boolean aBool1065 = false;
	static Class56 aClass56_973 = new Class56(200);
	static Class56 aClass56_1045 = new Class56(50);
	static Class56 aClass56_1086 = new Class56(20);
	public int anInt978 = -1;
	public int anInt1018 = -1;
	public int anInt991 = 0;
	public int anInt992 = 0;
	public int anInt1022 = 0;
	public Widget aClass104_Sub12_1040 = null;
	public boolean aBool1008 = false;
	public int anInt986 = -1;
	public int anInt1083 = 0;
	public int anInt974 = 0;
	public int anInt1085 = 0;
	public boolean aBool1087 = false;
	public boolean aBool1066 = false;
	public int anInt1089 = -1;
	public int anInt1090 = 0;
	public int anInt1074 = 0;
	public int anInt1092 = 0;
	public int anInt1093 = -1;
	public int anInt1094 = -1;

	void decode2(final RSBuf var1) {
		isHeaderless = false;
		anInt980 = var1.readUByte();
		anInt981 = var1.readUByte();
		anInt982 = var1.readLEShort();
		anInt985 = anInt983 = var1.method572();
		anInt975 = anInt1005 = var1.method572();
		anInt987 = var1.readLEShort();
		anInt988 = var1.readLEShort();
		anInt1000 = var1.readUByte();
		anInt1091 = var1.readLEShort();
		if (anInt1091 == '\uffff')
			anInt1091 = -1;
		else
			anInt1091 += anInt978 & -65536;

		anInt1077 = var1.readLEShort();
		if (anInt1077 == '\uffff')
			anInt1077 = -1;

		final int var2 = var1.readUByte();
		int var3;
		if (var2 > 0) {
			anIntArray984 = new int[var2];
			anIntArray1076 = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				anIntArray984[var3] = var1.readUByte();
				anIntArray1076[var3] = var1.readLEShort();
			}
		}

		var3 = var1.readUByte();
		int var4;
		int var5;
		int var6;
		if (var3 > 0) {
			anIntArrayArray1069 = new int[var3][];

			for (var4 = 0; var4 < var3; ++var4) {
				var5 = var1.readLEShort();
				anIntArrayArray1069[var4] = new int[var5];

				for (var6 = 0; var6 < var5; ++var6) {
					anIntArrayArray1069[var4][var6] = var1.readLEShort();
					if (anIntArrayArray1069[var4][var6] == '\uffff')
						anIntArrayArray1069[var4][var6] = -1;
				}
			}
		}

		if (anInt980 == 0) {
			anInt994 = var1.readLEShort();
			aBool1075 = var1.readUByte() == 1;
		}

		if (anInt980 == 1) {
			var1.readLEShort();
			var1.readUByte();
		}

		if (anInt980 == 2) {
			anIntArray1080 = new int[anInt987 * anInt988];
			anIntArray1081 = new int[anInt988 * anInt987];
			var4 = var1.readUByte();
			if (var4 == 1)
				anInt1037 |= 268435456;

			var5 = var1.readUByte();
			if (var5 == 1)
				anInt1037 |= 1073741824;

			var6 = var1.readUByte();
			if (var6 == 1)
				anInt1037 |= Integer.MIN_VALUE;

			final int var7 = var1.readUByte();
			if (var7 == 1)
				anInt1037 |= 536870912;

			anInt1038 = var1.readUByte();
			anInt1032 = var1.readUByte();
			anIntArray1049 = new int[20];
			anIntArray1057 = new int[20];
			anIntArray1035 = new int[20];

			int var8;
			for (var8 = 0; var8 < 20; ++var8) {
				final int var9 = var1.readUByte();
				if (var9 == 1) {
					anIntArray1049[var8] = var1.method572();
					anIntArray1057[var8] = var1.method572();
					anIntArray1035[var8] = var1.readLEInt();
				} else
					anIntArray1035[var8] = -1;
			}

			aStringArray1028 = new String[5];

			for (var8 = 0; var8 < 5; ++var8) {
				final String var10 = var1.readString();
				if (var10.length() > 0) {
					aStringArray1028[var8] = var10;
					anInt1037 |= 1 << (23 + var8);
				}
			}
		}

		if (anInt980 == 3)
			aBool1088 = var1.readUByte() == 1;

		if ((anInt980 == 4) || (anInt980 == 1)) {
			anInt1059 = var1.readUByte();
			anInt1029 = var1.readUByte();
			anInt1027 = var1.readUByte();
			anInt1024 = var1.readLEShort();
			if (anInt1024 == '\uffff')
				anInt1024 = -1;

			aBool1030 = var1.readUByte() == 1;
		}

		if (anInt980 == 4) {
			aString1025 = var1.readString();
			aString1004 = var1.readString();
		}

		if ((anInt980 == 1) || (anInt980 == 3) || (anInt980 == 4))
			anInt1017 = var1.readLEInt();

		if ((anInt980 == 3) || (anInt980 == 4)) {
			anInt996 = var1.readLEInt();
			anInt997 = var1.readLEInt();
			anInt998 = var1.readLEInt();
		}

		if (anInt980 == 5) {
			anInt1002 = var1.readLEInt();
			anInt1003 = var1.readLEInt();
		}

		if (anInt980 == 6) {
			anInt1010 = 1;
			anInt1011 = var1.readLEShort();
			if (anInt1011 == '\uffff')
				anInt1011 = -1;

			anInt1071 = 1;
			anInt1013 = var1.readLEShort();
			if (anInt1013 == '\uffff')
				anInt1013 = -1;

			anInt1058 = var1.readLEShort();
			if (anInt1058 == '\uffff')
				anInt1058 = -1;

			anInt1015 = var1.readLEShort();
			if (anInt1015 == '\uffff')
				anInt1015 = -1;

			anInt1021 = var1.readLEShort();
			anInt1043 = var1.readLEShort();
			anInt1019 = var1.readLEShort();
		}

		if (anInt980 == 7) {
			anIntArray1080 = new int[anInt988 * anInt987];
			anIntArray1081 = new int[anInt987 * anInt988];
			anInt1059 = var1.readUByte();
			anInt1024 = var1.readLEShort();
			if (anInt1024 == '\uffff')
				anInt1024 = -1;

			aBool1030 = var1.readUByte() == 1;
			anInt1017 = var1.readLEInt();
			anInt1038 = var1.method572();
			anInt1032 = var1.method572();
			var4 = var1.readUByte();
			if (var4 == 1)
				anInt1037 |= 1073741824;

			aStringArray1028 = new String[5];

			for (var5 = 0; var5 < 5; ++var5) {
				final String var11 = var1.readString();
				if (var11.length() > 0) {
					aStringArray1028[var5] = var11;
					anInt1037 |= 1 << (var5 + 23);
				}
			}
		}

		if (anInt980 == 8)
			aString1025 = var1.readString();

		if ((anInt981 == 2) || (anInt980 == 2)) {
			aString1036 = var1.readString();
			aString1078 = var1.readString();
			var4 = var1.readLEShort() & 63;
			anInt1037 |= var4 << 11;
		}

		if ((anInt981 == 1) || (anInt981 == 4) || (anInt981 == 5) || (anInt981 == 6)) {
			aString1054 = var1.readString();
			if (aString1054.length() == 0) {
				if (anInt981 == 1)
					aString1054 = "Ok";

				if (anInt981 == 4)
					aString1054 = "Select";

				if (anInt981 == 5)
					aString1054 = "Select";

				if (anInt981 == 6)
					aString1054 = "Continue";
			}
		}

		if ((anInt981 == 1) || (anInt981 == 4) || (anInt981 == 5))
			anInt1037 |= 4194304;

		if (anInt981 == 6)
			anInt1037 |= 1;

	}

	void decode1(final RSBuf var1) {
		var1.readUByte();
		isHeaderless = true;
		anInt980 = var1.readUByte();
		anInt982 = var1.readLEShort();
		anInt985 = anInt983 = var1.method572();
		anInt975 = anInt1005 = var1.method572();
		anInt987 = var1.readLEShort();
		if (anInt980 == 9)
			anInt988 = var1.method572();
		else
			anInt988 = var1.readLEShort();

		anInt1091 = var1.readLEShort();
		if (anInt1091 == '\uffff')
			anInt1091 = -1;
		else
			anInt1091 += anInt978 & -65536;

		aBool1075 = var1.readUByte() == 1;
		if (anInt980 == 0) {
			anInt1079 = var1.readLEShort();
			anInt994 = var1.readLEShort();
		}

		if (anInt980 == 5) {
			anInt1002 = var1.readLEInt();
			anInt979 = var1.readLEShort();
			aBool989 = var1.readUByte() == 1;
			anInt1000 = var1.readUByte();
			anInt1006 = var1.readUByte();
			anInt1007 = var1.readLEInt();
			aBool1044 = var1.readUByte() == 1;
			aBool1009 = var1.readUByte() == 1;
		}

		if (anInt980 == 6) {
			anInt1010 = 1;
			anInt1011 = var1.readLEShort();
			if (anInt1011 == '\uffff')
				anInt1011 = -1;

			anInt1016 = var1.method572();
			anInt993 = var1.method572();
			anInt1043 = var1.readLEShort();
			anInt1019 = var1.readLEShort();
			anInt1012 = var1.readLEShort();
			anInt1021 = var1.readLEShort();
			anInt1058 = var1.readLEShort();
			if (anInt1058 == '\uffff')
				anInt1058 = -1;

			aBool1023 = var1.readUByte() == 1;
		}

		if (anInt980 == 4) {
			anInt1024 = var1.readLEShort();
			if (anInt1024 == '\uffff')
				anInt1024 = -1;

			aString1025 = var1.readString();
			anInt1027 = var1.readUByte();
			anInt1059 = var1.readUByte();
			anInt1029 = var1.readUByte();
			aBool1030 = var1.readUByte() == 1;
			anInt1017 = var1.readLEInt();
		}

		if (anInt980 == 3) {
			anInt1017 = var1.readLEInt();
			aBool1088 = var1.readUByte() == 1;
			anInt1000 = var1.readUByte();
		}

		if (anInt980 == 9) {
			anInt999 = var1.readUByte();
			anInt1017 = var1.readLEInt();
		}

		anInt1037 = var1.method614();
		aString990 = var1.readString();
		final int var2 = var1.readUByte();
		if (var2 > 0) {
			aStringArray1039 = new String[var2];

			for (int var3 = 0; var3 < var2; ++var3)
				aStringArray1039[var3] = var1.readString();
		}

		anInt1041 = var1.readUByte();
		anInt1082 = var1.readUByte();
		aBool1053 = var1.readUByte() == 1;
		aString1036 = var1.readString();
		opcodeKeys = method534(var1);
		anObjectArray1051 = method534(var1);
		anObjectArray1033 = method534(var1);
		anObjectArray1031 = method534(var1);
		anObjectArray1056 = method534(var1);
		anObjectArray1034 = method534(var1);
		anObjectArray1060 = method534(var1);
		anObjectArray1062 = method534(var1);
		anObjectArray1064 = method534(var1);
		anObjectArray1042 = method534(var1);
		anObjectArray1052 = method534(var1);
		anObjectArray1047 = method534(var1);
		anObjectArray1048 = method534(var1);
		anObjectArray1046 = method534(var1);
		anObjectArray1050 = method534(var1);
		anObjectArray976 = method534(var1);
		anObjectArray1055 = method534(var1);
		anObjectArray1026 = method534(var1);
		anIntArray1084 = method529(var1);
		anIntArray1061 = method529(var1);
		anIntArray1063 = method529(var1);
	}

	int[] method529(final RSBuf var1) {
		final int var2 = var1.readUByte();
		if (var2 == 0)
			return null;
		else {
			final int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; ++var4)
				var3[var4] = var1.readLEInt();

			return var3;
		}
	}

	public void method530(final int var1, final int var2) {
		int var3 = anIntArray1080[var2];
		anIntArray1080[var2] = anIntArray1080[var1];
		anIntArray1080[var1] = var3;
		var3 = anIntArray1081[var2];
		anIntArray1081[var2] = anIntArray1081[var1];
		anIntArray1081[var1] = var3;
	}

	public Class104_Sub18_Sub17_Sub2_Sub1 method531() {
		aBool1065 = false;
		if (anInt1024 == -1)
			return null;
		else {
			final Class104_Sub18_Sub17_Sub2_Sub1 var1 = (Class104_Sub18_Sub17_Sub2_Sub1) aClass56_1086
					.method236(anInt1024);
			if (null != var1)
				return var1;
			else {
				final Class61 var2 = Class1_Sub1.aClass61_837;
				final Class61 var3 = aClass61_995;
				final int var4 = anInt1024;
				Class104_Sub18_Sub17_Sub2_Sub1 var5;
				if (!Class39.method181(var2, var4, 0))
					var5 = null;
				else
					var5 = Class99.method461(var3.decompress(var4, 0));

				aBool1065 = true;
				return var5;
			}
		}
	}

	public Class104_Sub18_Sub16_Sub4 method532(final Class104_Sub18_Sub3 var1, final int var2, final boolean var3,
			final Class85 var4) {
		aBool1065 = false;
		int var5;
		int var6;
		if (var3) {
			var5 = anInt1071;
			var6 = anInt1013;
		} else {
			var5 = anInt1010;
			var6 = anInt1011;
		}

		if (var5 == 0)
			return null;
		else if ((var5 == 1) && (var6 == -1))
			return null;
		else {
			Class104_Sub18_Sub16_Sub4 var7 = (Class104_Sub18_Sub16_Sub4) aClass56_1045.method236(var6 + (var5 << 16));
			if (var7 == null) {
				Class104_Sub18_Sub16_Sub5 var8;
				if (var5 == 1) {
					var8 = Class104_Sub18_Sub16_Sub5.method913(aClass61_971, var6, 0);
					if (var8 == null) {
						aBool1065 = true;
						return null;
					}

					var7 = var8.method904(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = Class64.method296(var6).method676();
					if (null == var8) {
						aBool1065 = true;
						return null;
					}

					var7 = var8.method904(64, 768, -50, -10, -50);
				}

				if (var5 == 3) {
					if (var4 == null)
						return null;

					var8 = var4.method391();
					if (null == var8) {
						aBool1065 = true;
						return null;
					}

					var7 = var8.method904(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					final ItemDef var9 = Class27.forId(var6);
					var8 = var9.method775(10);
					if (null == var8) {
						aBool1065 = true;
						return null;
					}

					var7 = var8.method904(64 + var9.anInt1455, 768 + var9.anInt1456, -50, -10, -50);
				}

				aClass56_1045.method238(var7, (var5 << 16) + var6);
			}

			if (null != var1)
				var7 = var1.method686(var7, var2);

			return var7;
		}
	}

	public Class104_Sub18_Sub17_Sub1 method533(final int var1, final int var2) {
		aBool1065 = false;
		if ((var1 >= 0) && (var1 < anIntArray1035.length)) {
			final int var3 = anIntArray1035[var1];
			if (var3 == -1)
				return null;
			else {
				final Class104_Sub18_Sub17_Sub1 var4 = (Class104_Sub18_Sub17_Sub1) aClass56_973.method236(var3);
				if (var4 != null)
					return var4;
				else {
					final Class61 var5 = Class1_Sub1.aClass61_837;
					Class104_Sub18_Sub17_Sub1 var6;
					if (!Class39.method181(var5, var3, 0))
						var6 = null;
					else
						var6 = Class34.method164();

					aBool1065 = true;
					return var6;
				}
			}
		} else
			return null;
	}

	Object[] method534(final RSBuf var1) {
		final int var2 = var1.readUByte();
		if (var2 == 0)
			return null;
		else {
			final Object[] var3 = new Object[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				final int var5 = var1.readUByte();
				if (var5 == 0)
					var3[var4] = new Integer(var1.readLEInt());
				else if (var5 == 1)
					var3[var4] = var1.readString();
			}

			aBool1008 = true;
			return var3;
		}
	}

	public Class104_Sub18_Sub17_Sub1 method535(final boolean var1) {
		aBool1065 = false;
		int var2;
		if (var1)
			var2 = anInt1003;
		else
			var2 = anInt1002;

		if (var2 == -1)
			return null;
		else {
			final long var3 = ((long) anInt1007 << 40) + ((aBool1009 ? 1L : 0L) << 39) + ((aBool1044 ? 1L : 0L) << 38)
					+ var2 + ((long) anInt1006 << 36);
			final Class104_Sub18_Sub17_Sub1 var5 = (Class104_Sub18_Sub17_Sub1) aClass56_973.method236(var3);
			if (var5 != null)
				return var5;
			else {
				final Class61 var6 = Class1_Sub1.aClass61_837;
				Class104_Sub18_Sub17_Sub1 var7;
				if (!Class39.method181(var6, var2, 0))
					var7 = null;
				else
					var7 = Class34.method164();

				if (null == var7) {
					aBool1065 = true;
					return null;
				} else {
					if (aBool1044)
						var7.method854();

					if (aBool1009)
						var7.method837();

					if (anInt1006 > 0)
						var7.method857(anInt1006);

					if (anInt1006 >= 1)
						var7.method855(1);

					if (anInt1006 >= 2)
						var7.method855(16777215);

					if (anInt1007 != 0)
						var7.method839(anInt1007);

					aClass56_973.method238(var7, var3);
					return var7;
				}
			}
		}
	}

	public void method536(final int var1, final String var2) {
		if ((aStringArray1039 == null) || (aStringArray1039.length <= var1)) {
			final String[] var3 = new String[1 + var1];
			if (aStringArray1039 != null)
				for (int var4 = 0; var4 < aStringArray1039.length; ++var4)
					var3[var4] = aStringArray1039[var4];

			aStringArray1039 = var3;
		}

		aStringArray1039[var1] = var2;
	}

	static final void method537() {
		for (int var0 = -1; var0 < client.toUpdate; ++var0) {
			int var1;
			if (var0 == -1)
				var1 = 2047;
			else
				var1 = client.localPlayerIndexs[var0];

			final Player var2 = client.localNpcs[var1];
			if (var2 != null)
				Class30.method144(var2);
		}

	}

	static final void method538(final Widget[] var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6, final int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			final Widget var9 = var0[var8];
			if ((var9 != null)
					&& (!var9.isHeaderless || (var9.anInt980 == 0) || var9.aBool1008 || (Class104_Sub3.method485(var9) != 0)
							|| (var9 == client.aClass104_Sub12_2019))
					&& (var1 == var9.anInt1091) && (!var9.isHeaderless || !Class40.method182(var9))) {
				final int var10 = var9.anInt983 + var6;
				final int var11 = var9.anInt1005 + var7;
				int var12;
				int var13;
				int var14;
				int var15;
				int var19;
				if (var9.anInt980 == 2) {
					var12 = var2;
					var13 = var3;
					var14 = var4;
					var15 = var5;
				} else {
					int var16;
					int var17;
					if (var9.anInt980 == 9) {
						var16 = var10;
						var17 = var11;
						int var18 = var10 + var9.anInt987;
						var19 = var11 + var9.anInt988;
						if (var18 < var10) {
							var16 = var18;
							var18 = var10;
						}

						if (var19 < var11) {
							var17 = var19;
							var19 = var11;
						}

						++var18;
						++var19;
						var12 = var16 > var2 ? var16 : var2;
						var13 = var17 > var3 ? var17 : var3;
						var14 = var18 < var4 ? var18 : var4;
						var15 = var19 < var5 ? var19 : var5;
					} else {
						var16 = var10 + var9.anInt987;
						var17 = var9.anInt988 + var11;
						var12 = var10 > var2 ? var10 : var2;
						var13 = var11 > var3 ? var11 : var3;
						var14 = var16 < var4 ? var16 : var4;
						var15 = var17 < var5 ? var17 : var5;
					}
				}

				if (var9 == client.aClass104_Sub12_1958) {
					client.aBool1965 = true;
					client.anInt1966 = var10;
					client.anInt1967 = var11;
				}

				if (!var9.isHeaderless || ((var12 < var14) && (var13 < var15)))
					if (var9.anInt982 == 1337)
						Class79.setflags(var9);
					else if (var9.anInt982 == 1338)
						Class84.method380(var10, var11);
					else {
						if (var9.anInt980 == 0) {
							if (!var9.isHeaderless && Class40.method182(var9) && (Class76.aClass104_Sub12_619 != var9))
								continue;

							method538(var0, var9.anInt978, var12, var13, var14, var15, var10 - var9.anInt991,
									var11 - var9.anInt992);
							if (null != var9.aClass104_Sub12Array1020)
								method538(var9.aClass104_Sub12Array1020, var9.anInt978, var12, var13, var14, var15,
										var10 - var9.anInt991, var11 - var9.anInt992);

							final Nodee var21 = (Nodee) client.aClass58_1795.method241(var9.anInt978);
							if (var21 != null)
								Class97.method438(var21.rsfaceID, var12, var13, var14, var15, var10, var11);
						}

						if (var9.isHeaderless) {
							boolean var26;
							if ((Class14.anInt91 >= var12) && (Class14.anInt95 >= var13) && (Class14.anInt91 < var14)
									&& (Class14.anInt95 < var15))
								var26 = true;
							else
								var26 = false;

							boolean var27 = false;
							if ((Class14.anInt93 == 1) && var26)
								var27 = true;

							boolean var28 = false;
							if ((Class14.anInt100 == 1) && (Class14.anInt101 >= var12) && (Class14.anInt102 >= var13)
									&& (Class14.anInt101 < var14) && (Class14.anInt102 < var15))
								var28 = true;

							if (var28)
								Class61.method279(var9, Class14.anInt101 - var10, Class14.anInt102 - var11);

							int var20;
							if ((client.aClass104_Sub12_1958 != null) && (var9 != client.aClass104_Sub12_1958)
									&& var26) {
								var20 = Class104_Sub3.method485(var9);
								final boolean var29 = ((var20 >> 20) & 1) != 0;
								if (var29)
									client.aClass104_Sub12_1961 = var9;
							}

							if (client.aClass104_Sub12_2019 == var9) {
								client.aBool1987 = true;
								client.anInt2035 = var10;
								client.anInt1964 = var11;
							}

							if (var9.aBool1008) {
								CS var22;
								if (var26 && (client.anInt1983 != 0) && (null != var9.anObjectArray1026)) {
									var22 = new CS();
									var22.ownerRSFaceHash = var9;
									var22.anInt935 = client.anInt1983;
									var22.params = var9.anObjectArray1026;
									client.aClass59_1984.method248(var22);
								}

								if ((client.aClass104_Sub12_1958 != null) || (null != Class67.aClass104_Sub12_556)
										|| client.aBool1930) {
									var28 = false;
									var27 = false;
									var26 = false;
								}

								if (!var9.aBool1066 && var28) {
									var9.aBool1066 = true;
									if (null != var9.anObjectArray1047) {
										var22 = new CS();
										var22.ownerRSFaceHash = var9;
										var22.anInt937 = Class14.anInt101 - var10;
										var22.anInt935 = Class14.anInt102 - var11;
										var22.params = var9.anObjectArray1047;
										client.aClass59_1984.method248(var22);
									}
								}

								if (var9.aBool1066 && var27 && (null != var9.anObjectArray1048)) {
									var22 = new CS();
									var22.ownerRSFaceHash = var9;
									var22.anInt937 = Class14.anInt91 - var10;
									var22.anInt935 = Class14.anInt95 - var11;
									var22.params = var9.anObjectArray1048;
									client.aClass59_1984.method248(var22);
								}

								if (var9.aBool1066 && !var27) {
									var9.aBool1066 = false;
									if (null != var9.anObjectArray1046) {
										var22 = new CS();
										var22.ownerRSFaceHash = var9;
										var22.anInt937 = Class14.anInt91 - var10;
										var22.anInt935 = Class14.anInt95 - var11;
										var22.params = var9.anObjectArray1046;
										client.aClass59_1957.method248(var22);
									}
								}

								if (var27 && (null != var9.anObjectArray1050)) {
									var22 = new CS();
									var22.ownerRSFaceHash = var9;
									var22.anInt937 = Class14.anInt91 - var10;
									var22.anInt935 = Class14.anInt95 - var11;
									var22.params = var9.anObjectArray1050;
									client.aClass59_1984.method248(var22);
								}

								if (!var9.aBool1087 && var26) {
									var9.aBool1087 = true;
									if (null != var9.anObjectArray1051) {
										var22 = new CS();
										var22.ownerRSFaceHash = var9;
										var22.anInt937 = Class14.anInt91 - var10;
										var22.anInt935 = Class14.anInt95 - var11;
										var22.params = var9.anObjectArray1051;
										client.aClass59_1984.method248(var22);
									}
								}

								if (var9.aBool1087 && var26 && (var9.anObjectArray1052 != null)) {
									var22 = new CS();
									var22.ownerRSFaceHash = var9;
									var22.anInt937 = Class14.anInt91 - var10;
									var22.anInt935 = Class14.anInt95 - var11;
									var22.params = var9.anObjectArray1052;
									client.aClass59_1984.method248(var22);
								}

								if (var9.aBool1087 && !var26) {
									var9.aBool1087 = false;
									if (null != var9.anObjectArray1033) {
										var22 = new CS();
										var22.ownerRSFaceHash = var9;
										var22.anInt937 = Class14.anInt91 - var10;
										var22.anInt935 = Class14.anInt95 - var11;
										var22.params = var9.anObjectArray1033;
										client.aClass59_1957.method248(var22);
									}
								}

								if (null != var9.anObjectArray1064) {
									var22 = new CS();
									var22.ownerRSFaceHash = var9;
									var22.params = var9.anObjectArray1064;
									client.aClass59_1985.method248(var22);
								}

								int var23;
								CS var24;
								if ((null != var9.anObjectArray1034) && (client.anInt1948 > var9.anInt1090)) {
									if ((null != var9.anIntArray1084) && ((client.anInt1948 - var9.anInt1090) <= 32))
										label373: for (var19 = var9.anInt1090; var19 < client.anInt1948; ++var19) {
											var20 = client.anIntArray1971[var19 & 31];

											for (var23 = 0; var23 < var9.anIntArray1084.length; ++var23)
												if (var9.anIntArray1084[var23] == var20) {
													var24 = new CS();
													var24.ownerRSFaceHash = var9;
													var24.params = var9.anObjectArray1034;
													client.aClass59_1984.method248(var24);
													break label373;
												}
										}
									else {
										var22 = new CS();
										var22.ownerRSFaceHash = var9;
										var22.params = var9.anObjectArray1034;
										client.aClass59_1984.method248(var22);
									}

									var9.anInt1090 = client.anInt1948;
								}

								if ((var9.anObjectArray1060 != null) && (client.anInt1916 > var9.anInt1074)) {
									if ((null != var9.anIntArray1061) && ((client.anInt1916 - var9.anInt1074) <= 32))
										label353: for (var19 = var9.anInt1074; var19 < client.anInt1916; ++var19) {
											var20 = client.anIntArray1973[var19 & 31];

											for (var23 = 0; var23 < var9.anIntArray1061.length; ++var23)
												if (var20 == var9.anIntArray1061[var23]) {
													var24 = new CS();
													var24.ownerRSFaceHash = var9;
													var24.params = var9.anObjectArray1060;
													client.aClass59_1984.method248(var24);
													break label353;
												}
										}
									else {
										var22 = new CS();
										var22.ownerRSFaceHash = var9;
										var22.params = var9.anObjectArray1060;
										client.aClass59_1984.method248(var22);
									}

									var9.anInt1074 = client.anInt1916;
								}

								if ((var9.anObjectArray1062 != null) && (client.anInt1851 > var9.anInt1092)) {
									if ((null != var9.anIntArray1063) && ((client.anInt1851 - var9.anInt1092) <= 32))
										label333: for (var19 = var9.anInt1092; var19 < client.anInt1851; ++var19) {
											var20 = client.anIntArray1868[var19 & 31];

											for (var23 = 0; var23 < var9.anIntArray1063.length; ++var23)
												if (var9.anIntArray1063[var23] == var20) {
													var24 = new CS();
													var24.ownerRSFaceHash = var9;
													var24.params = var9.anObjectArray1062;
													client.aClass59_1984.method248(var24);
													break label333;
												}
										}
									else {
										var22 = new CS();
										var22.ownerRSFaceHash = var9;
										var22.params = var9.anObjectArray1062;
										client.aClass59_1984.method248(var22);
									}

									var9.anInt1092 = client.anInt1851;
								}

								if ((client.anInt1977 > var9.anInt1089) && (null != var9.anObjectArray1067)) {
									var22 = new CS();
									var22.ownerRSFaceHash = var9;
									var22.params = var9.anObjectArray1067;
									client.aClass59_1984.method248(var22);
								}

								if ((client.anInt1846 > var9.anInt1089) && (null != var9.anObjectArray1072)) {
									var22 = new CS();
									var22.ownerRSFaceHash = var9;
									var22.params = var9.anObjectArray1072;
									client.aClass59_1984.method248(var22);
								}

								if ((client.anInt2037 > var9.anInt1089) && (var9.anObjectArray1070 != null)) {
									var22 = new CS();
									var22.ownerRSFaceHash = var9;
									var22.params = var9.anObjectArray1070;
									client.aClass59_1984.method248(var22);
								}

								if ((client.anInt1980 > var9.anInt1089) && (null != var9.anObjectArray972)) {
									var22 = new CS();
									var22.ownerRSFaceHash = var9;
									var22.params = var9.anObjectArray972;
									client.aClass59_1984.method248(var22);
								}

								var9.anInt1089 = client.anInt1978;
								if (null != var9.anObjectArray1068)
									for (var19 = 0; var19 < client.anInt2008; ++var19) {
										final CS var25 = new CS();
										var25.ownerRSFaceHash = var9;
										var25.anInt941 = client.anIntArray2010[var19];
										var25.anInt942 = client.anIntArray2009[var19];
										var25.params = var9.anObjectArray1068;
										client.aClass59_1984.method248(var25);
									}
							}
						}

						if (!var9.isHeaderless) {
							if ((null != client.aClass104_Sub12_1958) || (null != Class67.aClass104_Sub12_556)
									|| client.aBool1930)
								return;

							if (((var9.anInt1077 >= 0) || (var9.anInt997 != 0)) && (Class14.anInt91 >= var12)
									&& (Class14.anInt95 >= var13) && (Class14.anInt91 < var14)
									&& (Class14.anInt95 < var15))
								if (var9.anInt1077 >= 0)
									Class76.aClass104_Sub12_619 = var0[var9.anInt1077];
								else
									Class76.aClass104_Sub12_619 = var9;

							if ((var9.anInt980 == 8) && (Class14.anInt91 >= var12) && (Class14.anInt95 >= var13)
									&& (Class14.anInt91 < var14) && (Class14.anInt95 < var15))
								Class20.aClass104_Sub12_207 = var9;

							if (var9.anInt994 > var9.anInt988)
								Class86.method395(var9, var10 + var9.anInt987, var11, var9.anInt988, var9.anInt994,
										Class14.anInt91, Class14.anInt95);
						}
					}
			}
		}

	}

	public static final Class104_Sub18_Sub17_Sub1 method539(final int var0, final int var1, final int var2,
			final int var3, final boolean var4) {
		final long var5 = ((long) var2 << 38) + var0 + ((long) var1 << 16) + ((long) var3 << 40);
		Class104_Sub18_Sub17_Sub1 var7;
		if (!var4) {
			var7 = (Class104_Sub18_Sub17_Sub1) ItemDef.aClass56_1417.method236(var5);
			if (null != var7)
				return var7;
		}

		ItemDef var8 = Class27.forId(var0);
		if ((var1 > 1) && (null != var8.anIntArray1450)) {
			int var9 = -1;

			for (int var10 = 0; var10 < 10; ++var10)
				if ((var1 >= var8.anIntArray1449[var10]) && (var8.anIntArray1449[var10] != 0))
					var9 = var8.anIntArray1450[var10];

			if (var9 != -1)
				var8 = Class27.forId(var9);
		}

		final Class104_Sub18_Sub16_Sub4 var11 = var8.method779(1);
		if (null == var11)
			return null;
		else {
			Class104_Sub18_Sub17_Sub1 var12 = null;
			if (var8.anInt1433 != -1) {
				var12 = method539(var8.anInt1442, 10, 1, 0, true);
				if (var12 == null)
					return null;
			}

			final int[] var13 = Class104_Sub18_Sub17.anIntArray1474;
			final int var14 = Class104_Sub18_Sub17.anInt1469;
			final int var15 = Class104_Sub18_Sub17.anInt1468;
			final int[] var16 = new int[4];
			Class104_Sub18_Sub17.method793(var16);
			var7 = new Class104_Sub18_Sub17_Sub1(36, 32);
			Class104_Sub18_Sub17.method790(var7.anIntArray1592, 36, 32);
			Class104_Sub18_Sub17.method794();
			Class104_Sub18_Sub17_Sub4.method931();
			Class104_Sub18_Sub17_Sub4.method928(16, 16);
			Class104_Sub18_Sub17_Sub4.aBool1673 = false;
			int var17 = var8.anInt1425;
			if (var4)
				var17 = (int) (var17 * 1.5D);
			else if (var2 == 2)
				var17 = (int) (1.04D * var17);

			final int var18 = (var17 * Class104_Sub18_Sub17_Sub4.anIntArray1680[var8.anInt1426]) >> 16;
			final int var19 = (var17 * Class104_Sub18_Sub17_Sub4.anIntArray1678[var8.anInt1426]) >> 16;
			var11.method812();
			var11.method824(0, var8.anInt1427, var8.anInt1446, var8.anInt1426, var8.anInt1454,
					var8.anInt1430 + var18 + (var11.anInt1467 / 2), var8.anInt1430 + var19);
			if (var2 >= 1)
				var7.method855(1);

			if (var2 >= 2)
				var7.method855(16777215);

			if (var3 != 0)
				var7.method839(var3);

			Class104_Sub18_Sub17.method790(var7.anIntArray1592, 36, 32);
			if (var8.anInt1433 != -1)
				var12.method841(0, 0);

			if (!var4 && ((var8.anInt1431 == 1) || (var1 != 1)) && (var1 != -1))
				client.aClass104_Sub18_Sub17_Sub2_Sub1_290.drawstr(Class27.method136(var1), 0, 9, 16776960, 1);

			if (!var4)
				ItemDef.aClass56_1417.method238(var7, var5);

			Class104_Sub18_Sub17.method790(var13, var14, var15);
			Class104_Sub18_Sub17.method801(var16);
			Class104_Sub18_Sub17_Sub4.method931();
			Class104_Sub18_Sub17_Sub4.aBool1673 = true;
			return var7;
		}
	}

	public static int method540(int var0) {
		var0 = ((var0 >>> 1) & 1431655765) + (var0 & 1431655765);
		var0 = (var0 & 858993459) + ((var0 >>> 2) & 858993459);
		var0 = (var0 + (var0 >>> 4)) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	static final int method541(final int var0, int var1, final int var2) {
		if (var0 == -2)
			return 12345678;
		else if (var0 == -1) {
			if (var1 < 2)
				var1 = 2;
			else if (var1 > 126)
				var1 = 126;

			return var1;
		} else {
			var1 = ((var0 & 127) * var1) / 128;
			if (var1 < 2)
				var1 = 2;
			else if (var1 > 126)
				var1 = 126;

			return var1 + (var0 & '\uff80');
		}
	}
}
