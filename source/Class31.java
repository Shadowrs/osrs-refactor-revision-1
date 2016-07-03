import java.util.zip.Inflater;

public class Class31 {
	public static Class104_Sub18_Sub17_Sub2_Sub1 aClass104_Sub18_Sub17_Sub2_Sub1_290;
	static Class104_Sub18_Sub17_Sub1[] aClass104_Sub18_Sub17_Sub1Array291;
	Inflater anInflater289;

	Class31(final int var1, final int var2, final int var3) {
	}

	public void method146(final Class104_Sub21 var1, final byte[] var2) {
		if ((var1.aByteArray1174[var1.anInt1172] == 31) && (var1.aByteArray1174[1 + var1.anInt1172] == -117)) {
			if (null == anInflater289)
				anInflater289 = new Inflater(true);

			try {
				anInflater289.setInput(var1.aByteArray1174, var1.anInt1172 + 10,
						var1.aByteArray1174.length - (8 + var1.anInt1172 + 10));
				anInflater289.inflate(var2);
			} catch (final Exception var4) {
				anInflater289.reset();
				throw new RuntimeException("");
			}

			anInflater289.reset();
		} else
			throw new RuntimeException("");
	}

	public Class31() {
		this(-1, 1000000, 1000000);
	}

	public static int method147(final int var0, final int var1, int var2, int var3, int var4, final int var5) {
		if ((var5 & 1) == 1) {
			final int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		return var2 == 0 ? var0 : (var2 == 1 ? var1 : (var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1)));
	}

	static void method148(final int var0) {
		if (var0 == -3)
			Class104_Sub18_Sub2.method680("Connection timed out.", "Please try using a different world.", "");
		else if (var0 == -2)
			Class104_Sub18_Sub2.method680("", "Error connecting to server.", "");
		else if (var0 == -1)
			Class104_Sub18_Sub2.method680("No response from server.", "Please try using a different world.", "");
		else if (var0 == 3)
			Class104_Sub18_Sub2.method680("", "Invalid username/email or password.", "");
		else if (var0 == 4)
			Class104_Sub18_Sub2.method680("Your account has been disabled.",
					"Please check your message-centre for details.", "");
		else if (var0 == 5)
			Class104_Sub18_Sub2.method680("Your account is already logged in.", "Try again in 60 secs...", "");
		else if (var0 == 6)
			Class104_Sub18_Sub2.method680("RuneScape has been updated!", "Please reload this page.", "");
		else if (var0 == 7)
			Class104_Sub18_Sub2.method680("This world is full.", "Please use a different world.", "");
		else if (var0 == 8)
			Class104_Sub18_Sub2.method680("Unable to connect.", "Login server offline.", "");
		else if (var0 == 9)
			Class104_Sub18_Sub2.method680("Login limit exceeded.", "Too many connections from your address.", "");
		else if (var0 == 10)
			Class104_Sub18_Sub2.method680("Unable to connect.", "Bad session id.", "");
		else if (var0 == 11)
			Class104_Sub18_Sub2.method680("We suspect someone knows your password.",
					"Press \'change your password\' on front page.", "");
		else if (var0 == 12)
			Class104_Sub18_Sub2.method680("You need a members account to login to this world.",
					"Please subscribe, or use a different world.", "");
		else if (var0 == 13)
			Class104_Sub18_Sub2.method680("Could not complete login.", "Please try using a different world.", "");
		else if (var0 == 14)
			Class104_Sub18_Sub2.method680("The server is being updated.", "Please wait 1 minute and try again.", "");
		else if (var0 == 16)
			Class104_Sub18_Sub2.method680("Too many incorrect logins from your address.",
					"Please wait 5 minutes before trying again.", "");
		else if (var0 == 17)
			Class104_Sub18_Sub2.method680("You are standing in a members-only area.",
					"To play on this world move to a free area first", "");
		else if (var0 == 18)
			Class104_Sub18_Sub2.method680("Account locked as we suspect it has been stolen.",
					"Press \'recover a locked account\' on front page.", "");
		else if (var0 == 19)
			Class104_Sub18_Sub2.method680("This world is running a closed Beta.", "Sorry invited players only.",
					"Please use a different world.");
		else if (var0 == 20)
			Class104_Sub18_Sub2.method680("Invalid loginserver requested.", "Please try using a different world.", "");
		else if (var0 == 22)
			Class104_Sub18_Sub2.method680("Malformed login packet.", "Please try again.", "");
		else if (var0 == 23)
			Class104_Sub18_Sub2.method680("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		else if (var0 == 24)
			Class104_Sub18_Sub2.method680("Error loading your profile.", "Please contact customer support.", "");
		else if (var0 == 25)
			Class104_Sub18_Sub2.method680("Unexpected loginserver response.", "Please try using a different world.",
					"");
		else if (var0 == 26)
			Class104_Sub18_Sub2.method680("This computers address has been blocked",
					"as it was used to break our rules.", "");
		else if (var0 == 27)
			Class104_Sub18_Sub2.method680("", "Service unavailable.", "");
		else if (var0 == 31)
			Class104_Sub18_Sub2.method680("Your account must have a displayname set",
					"in order to play the game.  Please set it", "via the website, or the main game.");
		else if (var0 == 32)
			Class104_Sub18_Sub2.method680("Your attempt to log into your account was",
					"unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
		else if (var0 == 37)
			Class104_Sub18_Sub2.method680("Your account is currently inaccessible.",
					"Please try again in a few minutes.", "");
		else if (var0 == 38)
			Class104_Sub18_Sub2.method680("You need to vote to play!", "Visit runescape.com and vote,",
					"and then come back here!");
		else if (var0 == 55)
			Class104_Sub18_Sub2.method680("Sorry, but your account is not eligible to",
					"play this version of the game.  Please try", "playing the main game instead!");
		else
			Class104_Sub18_Sub2.method680("Unexpected server response", "Please try using a different world.", "");

		Class10.method40(10);
	}

	static final void method149() {
		for (Class104_Sub18_Sub16_Sub3 var0 = (Class104_Sub18_Sub16_Sub3) client.aClass59_1869
				.method251(); var0 != null; var0 = (Class104_Sub18_Sub16_Sub3) client.aClass59_1869.method252())
			if ((var0.anInt1516 == Class12.anInt73) && !var0.aBool1517) {
				if (client.anInt1799 >= var0.anInt1515) {
					var0.method810(client.anInt1867);
					if (var0.aBool1517)
						var0.method470();
					else
						Class81.aClass17_643.method97(var0.anInt1516, var0.anInt1522, var0.anInt1518, var0.anInt1523,
								60, var0, 0, -1, false);
				}
			} else
				var0.method470();

	}

	public static Class104_Sub18_Sub1 method150(final int var0) {
		Class104_Sub18_Sub1 var1 = (Class104_Sub18_Sub1) Class104_Sub18_Sub1.aClass56_1188.method236(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class104_Sub18_Sub1.aClass61_1191.method259(1, var0);
			var1 = new Class104_Sub18_Sub1();
			if (null != var2)
				var1.method632(new Class104_Sub21(var2), var0);

			var1.method631();
			Class104_Sub18_Sub1.aClass56_1188.method238(var1, var0);
			return var1;
		}
	}
}
