package teamProjektModeling;

import java.util.ArrayList;

public class Room {
	
	private final String name;
	private final Zugang[] zugaenge;
	private ArrayList<Inventar> inventar;
	
	public Room(String name, Zugang... zugaenge) {
		this.name = name;
		this.zugaenge = zugaenge;
		inventar = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public Zugang[] getZugaenge() {
		return zugaenge;
	}

	public ArrayList<Inventar> getInventar() {
		return inventar;
	}

	public void setInventar(ArrayList<Inventar> inventar) {
		this.inventar.addAll(inventar);
	}

	public String toString(){
		String result = " " + name;
		for(Zugang z : zugaenge){
			result += ": " + z.toString();
		}
		if(!inventar.isEmpty()){
			result += " |";
			for(Inventar i : inventar){
				result += i.toString() + " |";
			}
		}
		return result;
	}
}