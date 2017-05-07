package teamProjektModeling;

public class Inventar {

	private final Object object;
	private Raum ort;

	public Inventar(Object object, Raum ort) {
		this.object = object;
		this.setOrt(ort);
	}

	public Object getArt() {
		return object;
	}

	public Raum getOrt() {
		return ort;
	}

	public void setOrt(Raum ort) {
		this.ort = ort;
	}
	
	@Override
	public String toString(){
		String result = "" + object;
		return result;
	}
}