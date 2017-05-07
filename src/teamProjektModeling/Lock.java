package teamProjektModeling;


public class Lock {
	
	private String code;
	private LockTyp art;
	private LockStatus status;
	
	public Lock(LockTyp art, String code) {
		this.art = art;
		setCode(code);
		status = LockStatus.GESCHLOSSEN;
	}
	
	public Lock(LockTyp art){
		this(art, "0000");
	}
	
	public Lock(){
		this(LockTyp.NO_LOCK);
		status = LockStatus.OFFEN;
	}
	
	public String getArt() {
		return art.name();
	}
	
	protected String getCode() {
		return code;
	}
	
	protected void setCode(String code) {
		this.code = code;
	}

	public LockStatus getStatus() {
		return status;
	}
	
	public String toString(){
		switch(art){
		   case NO_LOCK : return "ohne Schloss";
		   case CODE_LOCK : return "Schloss ist " + (status == LockStatus.OFFEN ? "offen":"zu") + ". Code: " + code;
		   case KEY_LOCK : return "Schloss ist " + (status == LockStatus.OFFEN ? "offen":"zu");
		   default : return art.name();
		}
	}	
}