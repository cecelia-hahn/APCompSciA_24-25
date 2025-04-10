public class Main
{
	public static void main(String[] args) {
		Violin vi1 = new Violin("mahogany", 100, "");
		vi1.printWoodType();
		vi1.printAge();
		vi1.playMusic();
		System.out.println("");
		
		FirstSection vi2 = new FirstSection();
		vi2.getConfused();
		vi2.gainSelfAwareness();
		vi2.playMusic();
		System.out.println("");
		
		Concertmaster vi3 = new Concertmaster();
		vi3.playWrongNote();
		vi3.cueCorrectly();
		vi3.cueCorrectly();
		vi3.playMusic();
		
	}
}
