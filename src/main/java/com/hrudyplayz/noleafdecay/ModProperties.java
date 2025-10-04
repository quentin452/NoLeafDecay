package com.hrudyplayz.noleafdecay;

import java.io.File;
import net.minecraft.util.EnumChatFormatting;



public class ModProperties {
	// This class will be used to define mod properties in order to access them from anywhere.

	// General values
	public static final String MODID = "noleafdecay";
	public static final String NAME = "No Leaf Decay";
	public static final String VERSION = "1.0fork1";
	public static final String MC_VERSION = "1.7.10";
	public static final String URL = "";
	public static final String VERSION_CHECKER_URL = "";


	// Mod info page
	public static final String COLORED_NAME = EnumChatFormatting.RED + "No " + EnumChatFormatting.GREEN + "Leaf " + EnumChatFormatting.DARK_GREEN + "Decay";

	public static final String COLORED_VERSION = EnumChatFormatting.GRAY + VERSION;
	public static final String COLORED_URL = EnumChatFormatting.GRAY + URL;

	public static final String CREDITS = EnumChatFormatting.GREEN + "Paxjah (Society6)" + EnumChatFormatting.WHITE + " for the leaf pixel art in the logo.";

	public static final String[] AUTHORS = new String[] {
			EnumChatFormatting.RED + "HRudyPlayZ",
	};

	public static final String DESCRIPTION = EnumChatFormatting.GRAY + "A small mod to remove leaves decay from the game. It can sometimes have a huge effect on performance. \nLearn more on the mod's page.";

	public static final String[] SPLASH_OF_THE_DAY = new String[] {
			"Darling, this is good!",
			"Finally, i've been waiting for a mod like that for years!",
			"Why where the leaves so buggy anyways?",
			"Who thought it was a good idea to make building with leaves harder anyways?",
			"Simple yet very effective!",
			"I love it.",
			"Can i still say i'm learning Java so people don't hate me for bugs or that's too late now?",
			"Mitochondria is the powerhouse of the cell.",
			"And it's not made in MCreator!",
			"Creeper? Awww man.",
			"Works well with Big Trees!",
			"Works well with ExtraBiomesXL!",
			"Works well with BiomesOPlenty!",
			"Should work with any mod that adds leaves too!",
			"Also try MCInstance Loader.",
			"Also try RPGStamina.",
			"Also try my other mods.",
			"Finally released!",
			"1.0.0.0.0.0, also known as the first version.",
			"Since you're here, i'd be really happy if you could support me on ko-fi :)",
			"Why were the dwarves digging a hole? To get to this sooner!",
			"if thisModWorks() then thatsAwesome() else pleaseReportIssue() end",
			"Why did the chicken cross the road? Because this mod was waiting on the other side.",
			"I would like to first of all thank my two parents, without whom i wouldn't be here.",
	};

	// Should be equal to null to disable it, otherwise it should just be the file name (ex: "logo.png").
	public static String LOGO = "assets/" + ModProperties.MODID + "/logo.png";
}
