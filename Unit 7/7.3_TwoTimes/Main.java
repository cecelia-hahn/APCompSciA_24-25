import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(5);
        original.add(3);
        original.add(7);
        ArrayList<Integer> doubled = Twice.twoTimes(original);
        System.out.println(doubled);
	}
	
}
