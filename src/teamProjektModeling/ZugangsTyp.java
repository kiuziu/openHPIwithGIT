package teamProjektModeling;

public enum ZugangsTyp {
	DOOR("Tür"), 
	GATE("Tor"), 
	WINDOW("Fenster"), 
	TRAP("Klappe"), 
	LATTICE("Gitter");
	
	private final String zugang;
	
	ZugangsTyp(String zugang){
		this.zugang = zugang;
	}

	public String getZugang() {
		return zugang;
	}
}