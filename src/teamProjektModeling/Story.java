package teamProjektModeling;

public class Story {

	public static void main(String... args) {
						
		Hauptquartier hq = Hauptquartier.instanceOfHQ();
		
		System.out.println("Eikes Hauptquartier 1.0 (vom Team #119)");		
		hq.getHQ().forEach(x -> System.out.println(x));
	
	}

}