public class Main
{
	public static void main(String[] args) {
		Pet cat = new Pet("cat", "black", 3, false);
		cat.eat();
		cat.sleep();
		
		System.out.println(" ");
		Pet shark = new Pet("shark","orange", 25, false);
		shark.play();
		shark.destroy();
	}
}
