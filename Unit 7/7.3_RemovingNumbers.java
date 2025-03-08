import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>(10);
		for (int i = 0; i<10; i++){
		    nums.add(i, i+1);
		}
		System.out.println(nums);
		
		for (int i = nums.size()-1; i>= 0; i--){
		    if (nums.get(i)%2 == 0)
		    nums.remove(i);
		}
		System.out.println(nums);
	}
}
