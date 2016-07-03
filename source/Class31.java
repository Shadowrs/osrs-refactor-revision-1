import java.util.zip.Inflater;

public class Class31 {
	public static Class104_Sub18_Sub17_Sub2_Sub1 aClass104_Sub18_Sub17_Sub2_Sub1_290;
	static Class104_Sub18_Sub17_Sub1[] aClass104_Sub18_Sub17_Sub1Array291;
	Inflater anInflater289;

	Class31(final int var1, final int var2, final int var3) {
	}

	public void method146(final RSBuf var1, final byte[] var2) {
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
				var1.method632(new RSBuf(var2), var0);

			var1.method631();
			Class104_Sub18_Sub1.aClass56_1188.method238(var1, var0);
			return var1;
		}
	}
}
