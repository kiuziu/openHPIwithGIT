package teamProjektModeling;

import java.util.ArrayList;

public class Hauptquartier {
	
	private static Hauptquartier hq = new Hauptquartier();
	
	private Hauptquartier() {}

	public static Hauptquartier instanceOfHQ(){
		return hq;
	}
	
	public ArrayList<Raum> getHQ() {
		ArrayList<Raum> hauptquartier = new ArrayList<>();
		ArrayList<Inventar> inventar = new ArrayList<>();

		Raum aufzug = new Raum("Aufzug", 
			new Zugang("UG", ZugangsTyp.DOOR, new Lock()),
			new Zugang("EG", ZugangsTyp.DOOR, new Lock()), new Zugang("1.OG", ZugangsTyp.DOOR, new Lock()),
			new Zugang("2.OG", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(aufzug);

		Raum uFlur = new Raum("U-Flur", 
			new Zugang("Garage", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Werkstatt", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Gefängnis", ZugangsTyp.DOOR, new Lock(LockTyp.CODE_LOCK, "e.Vil")),
			new Zugang("Vorratskammer", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Aufzug", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(uFlur);

		Raum garage = new Raum("Garage", 
			new Zugang("Tür zum Flur", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Tor", ZugangsTyp.GATE, new Lock()));
		hauptquartier.add(garage);

		Raum werkstatt = new Raum("Werkstatt", 
			new Zugang("Tür zum Flur", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(werkstatt);

		Raum gefaengnis = new Raum("Gefängnis",
			new Zugang("Tür zum Flur", ZugangsTyp.DOOR, new Lock(LockTyp.CODE_LOCK, "e.Vel")));
		
			Raum kaefig = new Raum("Pacos Käfig", 
				new Zugang("Käfigtür", ZugangsTyp.LATTICE, new Lock(LockTyp.KEY_LOCK)));
				inventar.add(new Inventar("Paco", kaefig));
				kaefig.setInventar(inventar);
				inventar.clear();
			
			inventar.add(new Inventar(kaefig, gefaengnis));
			inventar.add(new Inventar("Tisch", gefaengnis));
			inventar.add(new Inventar("Selter", gefaengnis));
			gefaengnis.setInventar(inventar);
			inventar.clear();
		hauptquartier.add(gefaengnis);

		Raum vorrartskammer = new Raum("Vorratskammer", 
			new Zugang("Tür zum Flur", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(vorrartskammer);

		Raum eFlur = new Raum("E-Flur",
			new Zugang("Haupteingang", ZugangsTyp.DOOR, new Lock(LockTyp.CODE_LOCK, "e.Vil")),
			new Zugang("Aufzug", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(eFlur);

		Raum ogOneFlur = new Raum("1.OG-Flur", 
			new Zugang("Büro", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Wohnzimmer", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Aufzug", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(ogOneFlur);

		Raum buero = new Raum("Büro",
			new Zugang("Tür zum Flur", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Fenster", ZugangsTyp.WINDOW, new Lock()));
		hauptquartier.add(buero);

		Raum wohnzimmer = new Raum("Wohnzimmer", 
			new Zugang("Tür zum Flur", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Fenster", ZugangsTyp.WINDOW, new Lock()));
		hauptquartier.add(wohnzimmer);

		Raum ogTwoFlur = new Raum("2.OG-Flur", 
			new Zugang("Küch", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Schlafzimmer", ZugangsTyp.DOOR, new Lock()));
		hauptquartier.add(ogTwoFlur);

		Raum kueche = new Raum("Küche", 
			new Zugang("Tür zum Flur", ZugangsTyp.DOOR, new Lock()),
			new Zugang("West-Fenster", ZugangsTyp.WINDOW, new Lock()),
			new Zugang("Ost-Fenster", ZugangsTyp.WINDOW, new Lock()));
		hauptquartier.add(kueche);

		Raum schlafzimmer = new Raum("Schlafzimmer", 
			new Zugang("Tür zum Flur", ZugangsTyp.DOOR, new Lock()),
			new Zugang("Fenster", ZugangsTyp.WINDOW, new Lock()));
		hauptquartier.add(schlafzimmer);

		return hauptquartier;
	}

}