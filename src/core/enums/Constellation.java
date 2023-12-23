package core.enums;

public enum Constellation {
	ASCENDANT_CROSSROADS("Ascendant Crossroads", new int[] {0,0,0,0,0}, new int[] {1,0,0,0,0}, 1),
	CHAOS_CROSSROADS("Chaos Crossroads", new int[] {0,0,0,0,0}, new int[] {0,1,0,0,0}, 1),
	ELDRITCH_CROSSROADS("Eldritch Crossroads", new int[] {0,0,0,0,0}, new int[] {0,0,1,0,0}, 1),
	ORDER_CROSSROADS("Order Crossroads", new int[] {0,0,0,0,0}, new int[] {0,0,0,1,0}, 1),
	PRIMORDIAL_CROSSROADS("Primordial Crossroads", new int[] {0,0,0,0,0}, new int[] {0,0,0,0,1}, 1),
	ANVIL("Anvil", new int[]{1, 0, 0, 0, 0}, new int[]{5, 0, 0, 0, 0}, 5),
	EMPTY_THRONE("Empty Throne", new int[]{1, 0, 0, 0, 0}, new int[]{5, 0, 0, 0, 0}, 4),
	FALCON("Falcon", new int[]{1, 0, 0, 0, 0}, new int[]{3, 0, 3, 0, 0}, 5),
	HAMMER("Hammer", new int[]{1, 0, 0, 0, 0}, new int[]{4, 0, 0, 0, 0}, 3),
	HARPY("Harpy", new int[]{1, 0, 0, 0, 0}, new int[]{5, 0, 0, 0, 0}, 4),
	NIGHTTALON("Nighttalon", new int[]{1, 0, 0, 0, 0}, new int[]{3, 2, 0, 0, 0}, 4),
	OWL("Owl", new int[]{1, 0, 0, 0, 0}, new int[]{5, 0, 0, 0, 0}, 4),
	SHEPHERDS_CROOK("Shepherd's Crook", new int[]{1, 0, 0, 0, 0}, new int[]{5, 0, 0, 0, 0}, 5),
	TOAD("Toad", new int[]{1, 0, 0, 0, 0}, new int[]{3, 0, 3, 0, 0}, 4),
	WOLVERINE("Wolverine", new int[]{1, 0, 0, 0, 0}, new int[]{6, 0, 0, 0, 0}, 5),
	FIEND("Fiend", new int[]{0, 1, 0, 0, 0}, new int[]{0, 2, 3, 0, 0}, 5),
	GHOUL("Ghoul", new int[]{0, 1, 0, 0, 0}, new int[]{0, 3, 0, 0, 0}, 5),
	JACKAL("Jackal", new int[]{0, 1, 0, 0, 0}, new int[]{0, 3, 0, 0, 0}, 3),
	MANTIS("Mantis", new int[]{0, 1, 0, 0, 0}, new int[]{3, 2, 0, 0, 0}, 4),
	RAT("Rat", new int[]{0, 1, 0, 0, 0}, new int[]{0, 2, 3, 0, 0}, 4),
	VIPER("Viper", new int[]{0, 1, 0, 0, 0}, new int[]{0, 2, 0, 0, 3}, 4),
	VULTURE("Vulture", new int[]{0, 1, 0, 0, 0}, new int[]{0, 5, 0, 0, 0}, 5),
	WRETCH("Wretch", new int[]{0, 1, 0, 0, 0}, new int[]{0, 2, 0, 0, 3}, 4),
	AKERONS_SCORPION("Akeron's Scorpion", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 5, 0, 0}, 5),
	BAT("Bat", new int[]{0, 0, 1, 0, 0}, new int[]{0, 2, 3, 0, 0}, 5),
	EYE_OF_THE_GUARDIAN("Eye of the Guardian", new int[]{0, 0, 1, 0, 0}, new int[]{3, 0, 3, 0, 0}, 5),
	FOX("Fox", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 5, 0, 0}, 4),
	HAWK("Hawk", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 3, 0, 0}, 3),
	QUILL("Quill", new int[]{0, 0, 1, 0, 0}, new int[]{3, 0, 3, 0, 0}, 4),
	RAVEN("Raven", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 5, 0, 0}, 4),
	SCHOLARS_LIGHT("Scholar's Light", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 4, 0, 0}, 3),
	SPIDER("Spider", new int[]{0, 0, 1, 0, 0}, new int[]{0, 0, 6, 0, 0}, 5),
	ASSASSINS_BLADE("Assassin's Blade", new int[]{0, 0, 0, 1, 0}, new int[]{3, 0, 0, 2, 0}, 5),
	CRANE("Crane", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 0, 5, 0}, 5),
	DRYAD("Dryad", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 0, 3, 0}, 5),
	LION("Lion", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 0, 3, 0}, 3),
	LOTUS("Lotus", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 3, 2, 0}, 4),
	PANTHER("Panther", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 0, 2, 3}, 4),
	STAG("Stag", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 0, 2, 3}, 4),
	TORTOISE("Tortoise", new int[]{0, 0, 0, 1, 0}, new int[]{0, 0, 0, 2, 3}, 5),
	BULL("Bull", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 2, 3}, 5),
	EEL("Eel", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 5}, 3),
	GALLOWS("Gallows", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 5}, 4),
	HOUND("Hound", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 4}, 3),
	IMP("Imp", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 3, 0, 3}, 5),
	LIZARD("Lizard", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 4}, 3),
	SAILORS_GUIDE("Sailor's Guide", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 5}, 4),
	SCARAB("Scarab", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 2, 3}, 4),
	TSUNAMI("Tsunami", new int[]{0, 0, 0, 0, 1}, new int[]{0, 0, 0, 0, 5}, 5),
	WRAITH("Wraith", new int[]{0, 0, 0, 0, 1}, new int[]{3, 0, 0, 0, 3}, 4),
	AFFLICTION("Affliction", new int[]{4, 3, 4, 0, 0}, new int[]{1, 0, 1, 0, 0}, 7),
	ALLADRAHS_PHOENIX("Alladrah's Phoenix", new int[]{0, 0, 6, 3, 6}, new int[]{2, 0, 2, 0, 0}, 5),
	AMATOK_THE_SPIRIT_OF_WINTER("Amatok the Spirit of Winter", new int[]{0, 0, 4, 0, 6}, new int[]{0, 0, 1, 0, 1}, 7),
	ASSASSIN("Assassin", new int[]{6, 0, 0, 4, 0}, new int[]{1, 0, 0, 1, 0}, 7),
	AUTUMN_BOAR("Autumn Boar", new int[]{4, 0, 0, 3, 4}, new int[]{3, 0, 0, 0, 0}, 7),
	BARDS_HARP("Bard's Harp", new int[]{6, 0, 0, 3, 6}, new int[]{0, 0, 0, 2, 2}, 6),
	BEHEMOTH("Behemoth", new int[]{0, 3, 4, 0, 4}, new int[]{0, 2, 3, 0, 0}, 6),
	BERSERKER("Berserker", new int[]{5, 0, 5, 0, 0}, new int[]{0, 2, 3, 0, 0}, 6),
	BLADES_OF_NADAAN("Blades of Nadaan", new int[]{10, 0, 0, 0, 0}, new int[]{3, 0, 0, 2, 0}, 6),
	BYSMIELS_BONDS("Bysmiel's Bonds", new int[]{0, 4, 6, 0, 0}, new int[]{0, 0, 3, 0, 0}, 5),
	CHARIOT_OF_THE_DEAD("Chariot of the Dead", new int[]{5, 0, 5, 0, 0}, new int[]{0, 2, 3, 0, 0}, 7),
	CRAB("Crab", new int[]{6, 0, 0, 4, 0}, new int[]{3, 0, 0, 0, 0}, 5),
	DIRE_BEAR("Dire Bear", new int[]{5, 0, 0, 0, 5}, new int[]{1, 0, 0, 0, 1}, 6),
	HARVESTMANS_SCYTHE("Harvestman's Scythe", new int[]{3, 0, 0, 3, 5}, new int[]{3, 0, 0, 0, 3}, 6),
	HUNTRESS("Huntress", new int[]{4, 3, 4, 0, 0}, new int[]{1, 0, 1, 0, 0}, 7),
	HYDRA("Hydra", new int[]{3, 3, 5, 0, 0}, new int[]{0, 2, 3, 0, 0}, 6),
	HYRIAN_GUARDIAN_OF_THE_CELESTIAL_GATES("Hyrian, Guardian of the Celestial Gates", new int[]{6, 0, 8, 0, 0}, new int[]{2, 0, 0, 0, 2}, 6),
	KRAKEN("Kraken", new int[]{0, 0, 5, 0, 5}, new int[]{0, 2, 0, 0, 3}, 5),
	MAGI("Magi", new int[]{0, 0, 10, 0, 0}, new int[]{0, 0, 3, 0, 0}, 7),
	MANTICORE("Manticore", new int[]{0, 4, 6, 0, 0}, new int[]{1, 0, 1, 0, 0}, 6),
	MESSENGER_OF_WAR("Messenger of War", new int[]{3, 0, 0, 0, 7}, new int[]{0, 2, 0, 0, 3}, 6),
	MURMUR_MISTRESS_OF_RUMORS("Murmur, Mistress of Rumors", new int[]{0, 3, 6, 0, 6}, new int[]{0, 2, 2, 0, 0}, 6),
	OKLAINES_LANTERN("Oklaine's Lantern", new int[]{0, 0, 10, 0, 0}, new int[]{0, 0, 3, 2, 0}, 5),
	REVENANT("Revenant", new int[]{0, 8, 0, 0, 0}, new int[]{0, 1, 0, 0, 1}, 6),
	RHOWANS_CROWN("Rhowan's Crown", new int[]{4, 0, 6, 0, 0}, new int[]{1, 0, 1, 0, 0}, 5),
	RHOWANS_SCEPTER("Rhowan's Scepter", new int[]{6, 0, 0, 4, 0}, new int[]{3, 0, 0, 2, 0}, 6),
	SCALES_OF_ULCAMA("Scales of Ulcama", new int[]{0, 0, 0, 8, 0}, new int[]{0, 0, 0, 2, 0}, 6),
	SHIELDMAIDEN("Shieldmaiden", new int[]{0, 0, 0, 4, 6}, new int[]{0, 0, 0, 2, 3}, 6),
	SOLAELS_WITCHBLADE("Solael's Witchblade", new int[]{0, 4, 6, 0, 0}, new int[]{0, 1, 1, 0, 0}, 5),
	SOLEMN_WATCHER("Solemn Watcher", new int[]{0, 0, 0, 0, 10}, new int[]{0, 0, 0, 2, 3}, 5),
	STAFF_OF_RATTOSH("Staff of Rattosh", new int[]{0, 3, 0, 3, 6}, new int[]{0, 2, 0, 0, 3}, 6),
	TARGO_THE_BUILDER("Targo the Builder", new int[]{0, 0, 0, 4, 6}, new int[]{0, 0, 0, 1, 0}, 7),
	TEMPEST("Tempest", new int[]{5, 0, 0, 0, 5}, new int[]{0, 0, 1, 0, 1}, 7),
	TYPHOS_THE_JAILOR_OF_SOULS("Typhos, the Jailor of Souls", new int[]{6, 3, 0, 3, 0}, new int[]{3, 0, 0, 2, 0}, 6),
	ULO_THE_KEEPER_OF_THE_WATERS("Ulo the Keeper of the Waters", new int[]{0, 0, 0, 4, 6}, new int[]{0, 0, 0, 2, 3}, 5),
	WENDIGO("Wendigo", new int[]{0, 4, 0, 0, 6}, new int[]{0, 2, 0, 0, 0}, 6),
	WIDOW("Widow", new int[]{0, 0, 6, 0, 4}, new int[]{0, 0, 0, 0, 3}, 6),
	ULZAAD_HERALD_OF_KORVAAK("Ulzaad, Herald of Korvaak", new int[]{8, 0, 0, 0, 6}, new int[]{2, 0, 2, 0, 0}, 6),
	ABOMINATION("Abomination", new int[]{0, 8, 18, 0, 0}, new int[]{0, 0, 0, 0, 0}, 8),
	AEONS_HOURGLASS("Aeon's Hourglass", new int[]{0, 8, 0, 0, 18}, new int[]{0, 0, 0, 0, 0}, 6),
	ATTAK_SERU_THE_MIRAGE("Attak Seru, the Mirage", new int[]{16, 0, 14, 0, 0}, new int[]{0, 0, 0, 0, 0}, 6),
	BLIND_SAGE("Blind Sage", new int[]{10, 0, 18, 0, 0}, new int[]{0, 0, 0, 0, 0}, 7),
	DYING_GOD("Dying God", new int[]{0, 8, 0, 0, 15}, new int[]{0, 0, 0, 0, 0}, 7),
	ISHTAK_THE_SPRING_MAIDEN("Ishtak, the Spring Maiden", new int[]{0, 0, 0, 10, 15}, new int[]{0, 0, 0, 0, 0}, 6),
	LEVIATHAN("Leviathan", new int[]{13, 0, 13, 0, 0}, new int[]{0, 0, 0, 0, 0}, 7),
	LIGHT_OF_EMPYRION("Light of Empyrion", new int[]{0, 0, 0, 8, 18}, new int[]{0, 0, 0, 0, 0}, 7),
	MOGDROGEN_THE_WOLF("Mogdrogen the Wolf", new int[]{15, 0, 12, 0, 0}, new int[]{0, 0, 0, 0, 0}, 6),
	OBELISK_OF_MENHIR("Obelisk of Menhir", new int[]{0, 0, 0, 8, 15}, new int[]{0, 0, 0, 0, 0}, 7),
	OLERON("Oleron", new int[]{20, 0, 0, 7, 0}, new int[]{0, 0, 0, 0, 0}, 7),
	RATTOSH_THE_VEILWARDEN("Rattosh, the Veilwarden", new int[]{0, 6, 10, 6, 0}, new int[]{0, 0, 0, 0, 0}, 6),
	SPEAR_OF_THE_HEAVENS("Spear of the Heavens", new int[]{0, 7, 0, 0, 20}, new int[]{0, 0, 0, 0, 0}, 6),
	TREE_OF_LIFE("Tree of Life", new int[]{0, 0, 0, 7, 20}, new int[]{0, 0, 0, 0, 0}, 6),
	ULZUINS_TORCH("Ulzuin's Torch", new int[]{0, 8, 15, 0, 0}, new int[]{0, 0, 0, 0, 0}, 7),
	ULTOS_SHEPHERD_OF_STORMS("Ultos, Shepherd of Storms", new int[]{0, 6, 10, 0, 10}, new int[]{0, 0, 0, 0, 0}, 6),
	UNKNOWN_SOLDIER("Unknown Soldier", new int[]{15, 0, 0, 8, 0}, new int[]{0, 0, 0, 0, 0}, 7),
	VIRE_THE_STONE_MATRON("Vire, the Stone Matron", new int[]{12, 0, 0, 0, 18}, new int[]{0, 0, 0, 0, 0}, 6),
	YUGOL_THE_INSATIABLE_NIGHT("Yugol, the Insatiable Night", new int[]{0, 7, 20, 0, 0}, new int[]{0, 0, 0, 0, 0}, 6),
	KORVAAK_THE_ELDRITCH_SUN("Korvaak, the eldritch Sun", new int[]{0, 0, 10, 0, 18}, new int[]{0, 0, 0, 0, 0}, 6),
	AZRAKAA_THE_ETERNAL_SANDS("Azrakaa, the Eternal Sands", new int[]{12, 0, 0, 6, 8}, new int[]{0, 0, 0, 0, 0}, 6);
	
	private String properName;
	private int[] requiredAffinity;
	private int[] affinityBonus;
	private int pointsRequired;

	private Constellation(String properName, int[] requiredAffinity, int[] affinityBonus, int pointsRequired) {
		this.properName = properName;
		this.requiredAffinity = requiredAffinity;
		this.affinityBonus = affinityBonus;
		this.pointsRequired = pointsRequired;
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
