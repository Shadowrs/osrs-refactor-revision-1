public class Class51 {
	Class102 aClass102_425;
	Class102 aClass102_424 = new Class102();

	public void method225(final Class102 var1) {
		if (var1.aClass102_815 != null)
			var1.method467();

		var1.aClass102_815 = aClass102_424.aClass102_815;
		var1.aClass102_814 = aClass102_424;
		var1.aClass102_815.aClass102_814 = var1;
		var1.aClass102_814.aClass102_815 = var1;
	}

	public Class102 method226() {
		final Class102 var1 = aClass102_424.aClass102_814;
		if (var1 == aClass102_424) {
			aClass102_425 = null;
			return null;
		} else {
			aClass102_425 = var1.aClass102_814;
			return var1;
		}
	}

	public Class102 method227() {
		final Class102 var1 = aClass102_425;
		if (var1 == aClass102_424) {
			aClass102_425 = null;
			return null;
		} else {
			aClass102_425 = var1.aClass102_814;
			return var1;
		}
	}

	public Class51() {
		aClass102_424.aClass102_814 = aClass102_424;
		aClass102_424.aClass102_815 = aClass102_424;
	}
}
