package teamProjektModeling;

import java.util.ArrayList;

public class Headquarter {
	
	private static Headquarter hq = new Headquarter();
	
	private Headquarter() {}

	public static Headquarter instanceOfHQ(){
		return hq;
	}
	
	public ArrayList<Room> getHQ() {
		ArrayList<Room> hauptquartier = new ArrayList<>();
		ArrayList<Inventar> inventar = new ArrayList<>();

		Room aufzug = new Room("Aufzug", 
			new Zugang("UG", ZugangsTyp.DOOR, new Lock()),
			new Zugang("EG", ZugangsTyp.DOOR, new Lock()), new Zugang("1.OG", ZugangsTyp.DOOR, new Lock()),
			new Zugang("2.OG", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(aufzug);

		Room uFlur = new Room("U-Flur", 
			new Zugang("Garage", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Werkstatt", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Gef�ngnis", ZugangsTyp.DOOR, new Lock(LockKind.CODE_LOCK, "e.Vil")),
			new Zugang("Vorratskammer", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Aufzug", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(uFlur);

		Room garage = new Room("Garage", 
			new Zugang("T�r zum Flur", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Tor", ZugangsTyp.GATE, new Lock()));
		hauptquartier.add(garage);

		Room werkstatt = new Room("Werkstatt", 
			new Zugang("T�r zum Flur", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(werkstatt);

		Room gefaengnis = new Room("Gef�ngnis",
			new Zugang("T�r zum Flur", ZugangsTyp.DOOR, new Lock(LockKind.CODE_LOCK, "e.Vel")));
		
			Room kaefig = new Room("Pacos K�fig", 
				new Zugang("K�figt�r", ZugangsTyp.LATTICE, new Lock(LockKind.KEY_LOCK)));
				inventar.add(new Inventar("Paco", kaefig));
				kaefig.setInventar(inventar);
				inventar.clear();
			
			inventar.add(new Inventar(kaefig, gefaengnis));
			inventar.add(new Inventar("Tisch", gefaengnis));
			inventar.add(new Inventar("Selter", gefaengnis));
			gefaengnis.setInventar(inventar);
			inventar.clear();
		hauptquartier.add(gefaengnis);

		Room vorrartskammer = new Room("Vorratskammer", 
			new Zugang("T�r zum Flur", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(vorrartskammer);

		Room eFlur = new Room("E-Flur",
			new Zugang("Haupteingang", ZugangsTyp.DOOR, new Lock(LockKind.CODE_LOCK, "e.Vil")),
			new Zugang("Aufzug", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(eFlur);

		Room ogOneFlur = new Room("1.OG-Flur", 
			new Zugang("B�ro", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Wohnzimmer", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Aufzug", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(ogOneFlur);

		Room buero = new Room("B�ro",
			new Zugang("T�r zum Flur", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Fenster", ZugangsTyp.WINDOW, new Lock()));
		hauptquartier.add(buero);

		Room wohnzimmer = new Room("Wohnzimmer", 
			new Zugang("T�r zum Flur", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Fenster", ZugangsTyp.WINDOW, new Lock()));
		hauptquartier.add(wohnzimmer);

		Room ogTwoFlur = new Room("2.OG-Flur", 
			new Zugang("K�ch", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Schlafzimmer", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(ogTwoFlur);

		Room kueche = new Room("K�che", 
			new Zugang("T�r zum Flur", ZugangsTyp.DOOR, new Lock()),
			new Zugang("West-Fenster", ZugangsTyp.WINDOW, new Lock()),
			new Zugang("Ost-Fenster", ZugangsTyp.WINDOW, new Lock()));
		hauptquartier.add(kueche);

		Room schlafzimmer = new Room("Schlafzimmer", 
			new Zugang("T�r zum Flur", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Fenster", ZugangsTyp.WINDOW, new Lock()));
		hauptquartier.add(schlafzimmer);

		return hauptquartier;
	}

}