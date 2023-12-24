package core.enums;

public enum Constellation {
	ASCENDANT_CROSSROADS("Ascendant Crossroads", new int[] {0,0,0,0,0}, new int[] {1,0,0,0,0}, 1, false),
	CHAOS_CROSSROADS("Chaos Crossroads", new int[] {0,0,0,0,0}, new int[] {0,1,0,0,0}, 1, false),
	ELDRITCH_CROSSROADS("Eldritch Crossroads", new int[] {0,0,0,0,0}, new int[] {0,0,1,0,0}, 1, false),
	ORDER_CROSSROADS("Order Crossroads", new int[] {0,0,0,0,0}, new int[] {0,0,0,1,0}, 1, false),
	PRIMORDIAL_CROSSROADS("Primordial Crossroads", new int[] {0,0,0,0,0}, new int[] {0,0,0,0,1}, 1, false),
	ANVIL("Anvil", new int[]{1, 0, 0, 0, 0}, new int[]{5, 0, 0, 0, 0}, 5, true),
	EMPTY_THRONE("Empty Throne", new int[]{1, 0, 0, 0, 0}, new int[]{5, 0, 0, 0, 0}, 4, false),
	FALCON("Falcon", new int[]{1, 0, 0, 0, 0}, new int[]{3, 0, 3, 0, 0}, 5, true),
	HAMMER("Hammer", new int[]{1, 0, 0, 0, 0}, new int[]{4, 0, 0, 0, 0}, 3, false),
	HARPY("Harpy", new int[]{1, 0, 0, 0, 0}, new int[]{5, 0, 0, 0, 0}, 4, false),
	NIGHTTALON("Nighttalon", new int[]{1, 0, 0, 0, 0}, new int[]{3, 2, 0, 0, 0}, 4, false),
	OWL("Owl", new int[]{1, 0, 0, 0, 0}, new int[]{5, 0, 0, 0, 0}, 4, false),
	SHEPHERDS_CROOK("Shepherd's Crook", new int[]{1, 0, 0, 0, 0}, new int[]{5, 0, 0, 0, 0}, 5, true),
	TOAD("Toad", new int[]{1, 0, 0, 0, 0}, new int[]{3, 0, 3, 0, 0}, 4, false),
	WOLVERINE("Wolverine", new int[]{1, 0, 0, 0, 0}, new int[]{6, 0, 0, 0, 0}, 5, false),
	FIEND("Fiend", new int[]{0, 1, 0, 0, 0}, new int[]{0, 2, 3, 0, 0}, 5, true),
	GHOUL("Ghoul", new int[]{0, 1, 0, 0, 0}, new int[]{0, 3, 0, 0, 0}, 5, true),
	JACKAL("Jackal", new int[]{0, 1, 0, 0, 0}, new int[]{0, 3, 0, 0, 0}, 3, false),
	MANTIS("Mantis", new int[]{0, 1, 0, 0, 0}, new int[]{3, 2, 0, 0, 0}, 4, false),
	RAT("Rat", new int[]{0, 1, 0, 0, 0}, new int[]{0, 2, 3, 0, 0}, 4, false),
	VIPER("Viper", new int[]{0, 1, 0, 0, 0}, new int[]{0, 2, 0, 0, 3}, 4, false),
	VULTURE("Vulture", new int[]{0, 1, 0, 0, 0}, new int[]{0, 5, 0, 0, 0}, 5, false),
	WRETCH("Wretch", new int[]{0, 1, 0, 0, 0}, new int[]{0, 2, 0, 0, 3}, 4, false),
	AKERONS_SCORPION("Akeron's Scorpion", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 5, 0, 0}, 5, true),
	BAT("Bat", new int[]{0, 0, 1, 0, 0}, new int[]{0, 2, 3, 0, 0}, 5, true),
	EYE_OF_THE_GUARDIAN("Eye of the Guardian", new int[]{0, 0, 1, 0, 0}, new int[]{3, 0, 3, 0, 0}, 5, true),
	FOX("Fox", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 5, 0, 0}, 4, false),
	HAWK("Hawk", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 3, 0, 0}, 3, false),
	QUILL("Quill", new int[]{0, 0, 1, 0, 0}, new int[]{3, 0, 3, 0, 0}, 4, false),
	RAVEN("Raven", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 5, 0, 0}, 4, false),
	SCHOLARS_LIGHT("Scholar's Light", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 4, 0, 0}, 3, false),
	SPIDER("Spider", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 6, 0, 0}, 5, false),
	ASSASSINS_BLADE("Assassin's Blade", new int[]{0, 0, 0, 1, 0}, new int[]{3, 0, 0, 2, 0}, 5, true),
	CRANE("Crane", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 0, 5, 0}, 5, false),
	DRYAD("Dryad", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 0, 3, 0}, 5, true),
	LION("Lion", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 0, 3, 0}, 3, false),
	LOTUS("Lotus", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 3, 2, 0}, 4, false),
	PANTHER("Panther", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 0, 2, 3}, 4, false),
	STAG("Stag", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 0, 2, 3}, 4, false),
	TORTOISE("Tortoise", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 0, 2, 3}, 5, true),
	BULL("Bull", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 2, 3}, 5, true),
	EEL("Eel", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 5}, 3, false),
	GALLOWS("Gallows", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 5}, 4, false),
	HOUND("Hound", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 4}, 3, false),
	IMP("Imp", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 3, 0, 3}, 5, true),
	LIZARD("Lizard", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 4}, 3, false),
	SAILORS_GUIDE("Sailor's Guide", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 5}, 4, false),
	SCARAB("Scarab", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 2, 3}, 4, false),
	TSUNAMI("Tsunami", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 5}, 5, true),
	WRAITH("Wraith", new int[]{0, 0, 0, 0, 1}, new int[]{3, 0, 0, 0, 3}, 4, false),
	AFFLICTION("Affliction", new int[]{4, 3, 4, 0, 0}, new int[]{1, 0, 1, 0, 0}, 7, true),
	ALLADRAHS_PHOENIX("Alladrah's Phoenix", new int[]{0, 0, 6, 3, 6}, new int[]{2, 0, 2, 0, 0}, 5, true),
	AMATOK_THE_SPIRIT_OF_WINTER("Amatok the Spirit of Winter", new int[]{0, 0, 4, 0, 6}, new int[]{0, 0, 1, 0, 1}, 7, true),
	ASSASSIN("Assassin", new int[]{6, 0, 0, 4, 0}, new int[]{1, 0, 0, 1, 0}, 7, true),
	AUTUMN_BOAR("Autumn Boar", new int[]{4, 0, 0, 3, 4}, new int[]{3, 0, 0, 0, 0}, 7, true),
	BARDS_HARP("Bard's Harp", new int[]{6, 0, 0, 3, 6}, new int[]{0, 0, 0, 2, 2}, 6, true),
	BEHEMOTH("Behemoth", new int[]{0, 3, 4, 0, 4}, new int[]{0, 2, 3, 0, 0}, 6, true),
	BERSERKER("Berserker", new int[]{5, 0, 5, 0, 0}, new int[]{0, 2, 3, 0, 0}, 6, false),
	BLADES_OF_NADAAN("Blades of Nadaan", new int[]{10, 0, 0, 0, 0}, new int[]{3, 0, 0, 2, 0}, 6, false),
	BYSMIELS_BONDS("Bysmiel's Bonds", new int[]{0, 4, 6, 0, 0}, new int[]{0, 0, 3, 0, 0}, 5, true),
	CHARIOT_OF_THE_DEAD("Chariot of the Dead", new int[]{5, 0, 5, 0, 0}, new int[]{0, 2, 3, 0, 0}, 7, true),
	CRAB("Crab", new int[]{6, 0, 0, 4, 0}, new int[]{3, 0, 0, 0, 0}, 5, true),
	DIRE_BEAR("Dire Bear", new int[]{5, 0, 0, 0, 5}, new int[]{1, 0, 0, 0, 1}, 6, true),
	HARVESTMANS_SCYTHE("Harvestman's Scythe", new int[]{3, 0, 0, 3, 5}, new int[]{3, 0, 0, 0, 3}, 6, false),
	HUNTRESS("Huntress", new int[]{4, 3, 4, 0, 0}, new int[]{1, 0, 1, 0, 0}, 7, true),
	HYDRA("Hydra", new int[]{3, 3, 5, 0, 0}, new int[]{0, 2, 3, 0, 0}, 6, false),
	HYRIAN_GUARDIAN_OF_THE_CELESTIAL_GATES("Hyrian, Guardian of the Celestial Gates", new int[]{6, 0, 8, 0, 0}, new int[]{2, 0, 0, 0, 2}, 6, true),
	KRAKEN("Kraken", new int[]{0, 0, 5, 0, 5}, new int[]{0, 2, 0, 0, 3}, 5, false),
	MAGI("Magi", new int[]{0, 0, 10, 0, 0}, new int[]{0, 0, 3, 0, 0}, 7, true),
	MANTICORE("Manticore", new int[]{0, 4, 6, 0, 0}, new int[]{1, 0, 1, 0, 0}, 6, true),
	MESSENGER_OF_WAR("Messenger of War", new int[]{3, 0, 0, 0, 7}, new int[]{0, 2, 0, 0, 3}, 6, true),
	MURMUR_MISTRESS_OF_RUMORS("Murmur, Mistress of Rumors", new int[]{0, 3, 6, 0, 6}, new int[]{0, 2, 2, 0, 0}, 6, true),
	OKLAINES_LANTERN("Oklaine's Lantern", new int[]{0, 0, 10, 0, 0}, new int[]{0, 0, 3, 2, 0}, 5, false),
	REVENANT("Revenant", new int[]{0, 8, 0, 0, 0}, new int[]{0, 1, 0, 0, 1}, 6, true),
	RHOWANS_CROWN("Rhowan's Crown", new int[]{4, 0, 6, 0, 0}, new int[]{1, 0, 1, 0, 0}, 5, true),
	RHOWANS_SCEPTER("Rhowan's Scepter", new int[]{6, 0, 0, 4, 0}, new int[]{3, 0, 0, 2, 0}, 6, false),
	SCALES_OF_ULCAMA("Scales of Ulcama", new int[]{0, 0, 0, 8, 0}, new int[]{0, 0, 0, 2, 0}, 6, true),
	SHIELDMAIDEN("Shieldmaiden", new int[]{0, 0, 0, 4, 6}, new int[]{0, 0, 0, 2, 3}, 6, false),
	SOLAELS_WITCHBLADE("Solael's Witchblade", new int[]{0, 4, 6, 0, 0}, new int[]{0, 1, 1, 0, 0}, 5, true),
	SOLEMN_WATCHER("Solemn Watcher", new int[]{0, 0, 0, 0, 10}, new int[]{0, 0, 0, 2, 3}, 5, false),
	STAFF_OF_RATTOSH("Staff of Rattosh", new int[]{0, 3, 0, 3, 6}, new int[]{0, 2, 0, 0, 3}, 6, false),
	TARGO_THE_BUILDER("Targo the Builder", new int[]{0, 0, 0, 4, 6}, new int[]{0, 0, 0, 1, 0}, 7, true),
	TEMPEST("Tempest", new int[]{5, 0, 0, 0, 5}, new int[]{0, 0, 1, 0, 1}, 7, true),
	TYPHOS_THE_JAILOR_OF_SOULS("Typhos, the Jailor of Souls", new int[]{6, 3, 0, 3, 0}, new int[]{3, 0, 0, 2, 0}, 6, false),
	ULO_THE_KEEPER_OF_THE_WATERS("Ulo the Keeper of the Waters", new int[]{0, 0, 0, 4, 6}, new int[]{0, 0, 0, 2, 3}, 5, true),
	WENDIGO("Wendigo", new int[]{0, 4, 0, 0, 6}, new int[]{0, 2, 0, 0, 0}, 6, true),
	WIDOW("Widow", new int[]{0, 0, 6, 0, 4}, new int[]{0, 0, 0, 0, 3}, 6, true),
	ULZAAD_HERALD_OF_KORVAAK("Ulzaad, Herald of Korvaak", new int[]{8, 0, 0, 0, 6}, new int[]{2, 0, 2, 0, 0}, 6, true),
	ABOMINATION("Abomination", new int[]{0, 8, 18, 0, 0}, new int[]{0, 0, 0, 0, 0}, 8, true),
	AEONS_HOURGLASS("Aeon's Hourglass", new int[]{0, 8, 0, 0, 18}, new int[]{0, 0, 0, 0, 0}, 6, true),
	ATTAK_SERU_THE_MIRAGE("Attak Seru, the Mirage", new int[]{16, 0, 14, 0, 0}, new int[]{0, 0, 0, 0, 0}, 6, true),
	BLIND_SAGE("Blind Sage", new int[]{10, 0, 18, 0, 0}, new int[]{0, 0, 0, 0, 0}, 7, true),
	DYING_GOD("Dying God", new int[]{0, 8, 0, 0, 15}, new int[]{0, 0, 0, 0, 0}, 7, true),
	ISHTAK_THE_SPRING_MAIDEN("Ishtak, the Spring Maiden", new int[]{0, 0, 0, 10, 15}, new int[]{0, 0, 0, 0, 0}, 6, true),
	LEVIATHAN("Leviathan", new int[]{13, 0, 13, 0, 0}, new int[]{0, 0, 0, 0, 0}, 7, true),
	LIGHT_OF_EMPYRION("Light of Empyrion", new int[]{0, 0, 0, 8, 18}, new int[]{0, 0, 0, 0, 0}, 7, true),
	MOGDROGEN_THE_WOLF("Mogdrogen the Wolf", new int[]{15, 0, 12, 0, 0}, new int[]{0, 0, 0, 0, 0}, 6, true),
	OBELISK_OF_MENHIR("Obelisk of Menhir", new int[]{0, 0, 0, 8, 15}, new int[]{0, 0, 0, 0, 0}, 7, true),
	OLERON("Oleron", new int[]{20, 0, 0, 7, 0}, new int[]{0, 0, 0, 0, 0}, 7, true),
	RATTOSH_THE_VEILWARDEN("Rattosh, the Veilwarden", new int[]{0, 6, 10, 6, 0}, new int[]{0, 0, 0, 0, 0}, 6, true),
	SPEAR_OF_THE_HEAVENS("Spear of the Heavens", new int[]{0, 7, 0, 0, 20}, new int[]{0, 0, 0, 0, 0}, 6, true),
	TREE_OF_LIFE("Tree of Life", new int[]{0, 0, 0, 7, 20}, new int[]{0, 0, 0, 0, 0}, 6, true),
	ULZUINS_TORCH("Ulzuin's Torch", new int[]{0, 8, 15, 0, 0}, new int[]{0, 0, 0, 0, 0}, 7, true),
	ULTOS_SHEPHERD_OF_STORMS("Ultos, Shepherd of Storms", new int[]{0, 6, 10, 0, 10}, new int[]{0, 0, 0, 0, 0}, 6, true),
	UNKNOWN_SOLDIER("Unknown Soldier", new int[]{15, 0, 0, 8, 0}, new int[]{0, 0, 0, 0, 0}, 7, true),
	VIRE_THE_STONE_MATRON("Vire, the Stone Matron", new int[]{12, 0, 0, 0, 18}, new int[]{0, 0, 0, 0, 0}, 6, true),
	YUGOL_THE_INSATIABLE_NIGHT("Yugol, the Insatiable Night", new int[]{0, 7, 20, 0, 0}, new int[]{0, 0, 0, 0, 0}, 6, true),
	KORVAAK_THE_ELDRITCH_SUN("Korvaak, the eldritch Sun", new int[]{0, 0, 10, 0, 18}, new int[]{0, 0, 0, 0, 0}, 6, true),
	AZRAKAA_THE_ETERNAL_SANDS("Azrakaa, the Eternal Sands", new int[]{12, 0, 0, 6, 8}, new int[]{0, 0, 0, 0, 0}, 6, true);
	
	private String properName;
	private int[] requiredAffinity;
	private int[] affinityBonus;
	private int pointsRequired;
	private boolean hasActive;
	
	private Constellation(String properName, int[] requiredAffinity, int[] affinityBonus, int pointsRequired, boolean hasActive) {
		this.properName = properName;
		this.requiredAffinity = requiredAffinity;
		this.affinityBonus = affinityBonus;
		this.pointsRequired = pointsRequired;
		this.hasActive = hasActive;
	}

	public int[] getRequiredAffinity() {
		return requiredAffinity;
	}

	public int[] getAffinityBonus() {
		return affinityBonus;
	}

	public int getPointsRequired() {
		return pointsRequired;
	}
	
	public boolean hasActive() {
		return hasActive;
	}
	
	public int getTier() {
		if (this.ordinal() <= Constellation.PRIMORDIAL_CROSSROADS.ordinal()) {
			return 0;
		}
		if (this.ordinal() <= Constellation.WRAITH.ordinal()) {
			return 1;
		}
		if (this.ordinal() <= Constellation.ULZAAD_HERALD_OF_KORVAAK.ordinal()) {
			return 2;
		}
		return 3;
	}
	
	@Override
	public String toString() {
		return properName;
	}
}
