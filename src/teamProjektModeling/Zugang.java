package teamProjektModeling;


public class Zugang {

	private String name;
	private ZugangsTyp type;
	private Lock lock;

	public Zugang(String name, ZugangsTyp type, Lock lock) {
		this.name = name;
		this.type = type;
		this.lock = lock;
	}

	public String getName() {
		return name;
	}

	public ZugangsTyp getType() {
		return type;
	}

	public Lock getLock() {
		return lock;
	}
	
	public String toString(){
		return name + "/" + "(" + lock + ")"; 
	}
	
}