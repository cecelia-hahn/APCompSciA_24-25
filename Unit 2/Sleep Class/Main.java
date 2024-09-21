public class Main
{
	public static void main(String[] args) {
		Sleep fred = new Sleep(true, 2, 4);
		Sleep joe = new Sleep(false, 0, 1);
		//fred.stats();
		joe.stats();
		joe.getNewBed();
		System.out.println();
		joe.takeANap(2);
		joe.stats();
	}
}
