import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>(10);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		int value = 0;
		
		for (int i = 0; i<nums.size(); i++){
		    nums.set(i, nums.get(i)*2);
		}
		System.out.print(nums);
	}
}
