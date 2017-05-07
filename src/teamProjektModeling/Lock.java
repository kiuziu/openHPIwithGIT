package teamProjektModeling;


public class Lock {
	
	private String code;
	private LockKind kind;
	private LockStatus status;
	
	public Lock(LockKind kind, String code) {
		this.kind = kind;
		setCode(code);
		status = LockStatus.GESCHLOSSEN;
	}
	
	public Lock(LockKind kind){
		this(kind, "0000");
	}
	
	public Lock(){
		this(LockKind.NO_LOCK);
		status = LockStatus.OFFEN;
	}
	
	public String getLockKind() {
		return kind.name();
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
		switch(kind){
		   case NO_LOCK : return "ohne Schloss";
		   case CODE_LOCK : return "Schloss ist " + (status == LockStatus.OFFEN ? "offen":"zu") + ". Code: " + code;
		   case KEY_LOCK : return "Schloss ist " + (status == LockStatus.OFFEN ? "offen":"zu");
		   default : return kind.name();
		}
	}	
}