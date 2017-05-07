package teamProjektModeling;

public class Inventar {

	private final Object object;
	private Room location;

	public Inventar(Object object, Room location) {
		this.object = object;
		this.setLocation(location);
	}

	public Object getItem() {
		return object;
	}

	public Room getLocation() {
		return location;
	}

	public void setLocation(Room location) {
		this.location = location;
	}
	
	@Override
	public String toString(){
		String result = "" + object;
		return result;
	}
}