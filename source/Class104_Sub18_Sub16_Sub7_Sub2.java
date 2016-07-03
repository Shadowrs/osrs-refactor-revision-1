public final class Class104_Sub18_Sub16_Sub7_Sub2 extends Class104_Sub18_Sub16_Sub7 {
	Class104_Sub18_Sub2 aClass104_Sub18_Sub2_1788;

	@Override
	final boolean method936(final int var1) {
		return aClass104_Sub18_Sub2_1788 != null;
	}

	@Override
	final Class104_Sub18_Sub16_Sub4 method788(final int var1) {
		if (aClass104_Sub18_Sub2_1788 == null)
			return null;
		else {
			final Class104_Sub18_Sub3 var2 = (anInt1722 != -1) && (anInt1707 == 0) ? Class70.method327(anInt1722)
					: null;
			final Class104_Sub18_Sub3 var3 = (anInt1719 == -1) || ((anInt1702 == anInt1719) && (var2 != null)) ? null
					: Class70.method327(anInt1719);
			Class104_Sub18_Sub16_Sub4 var4 = aClass104_Sub18_Sub2_1788.method675(var2, anInt1732, var3, anInt1720);
			if (null == var4)
				return null;
			else {
				var4.method812();
				anInt1706 = var4.anInt1467;
				if ((anInt1727 != -1) && (anInt1728 != -1)) {
					final Class104_Sub18_Sub16_Sub4 var5 = Class71.method330(anInt1727).method732(anInt1728);
					if (null != var5) {
						var5.method822(0, -anInt1709, 0);
						final Class104_Sub18_Sub16_Sub4[] var6 = new Class104_Sub18_Sub16_Sub4[] { var4, var5 };
						var4 = new Class104_Sub18_Sub16_Sub4(var6, 2);
					}
				}

				if (aClass104_Sub18_Sub2_1788.anInt1240 == 1)
					var4.aBool1551 = true;

				return var4;
			}
		}
	}
}
