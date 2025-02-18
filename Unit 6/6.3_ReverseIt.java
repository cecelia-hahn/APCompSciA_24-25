//this took way too long to figure out
public class Main {

	public static void main(String[] args) {
		int nums[]= {1,6,3,2,5,4};
		
		//even odd
		int evenOdd[] = new int [6];
		int hold =0;
		for (int i = 0; i<6; i++) {
			evenOdd[i]=nums[i];
		}


		for (int j=0; j<evenOdd.length; j++) {
			for (int i=j; i<evenOdd.length-1; i++) {
				hold = evenOdd[i];
				if (evenOdd[i]%2 != 0) {
					evenOdd[i]=evenOdd[i+1];
					evenOdd[i+1]=hold;
				}

			}
		}


		System.out.println("Even then odd: " + evenOdd[0] + ","+ evenOdd[1] + ","+ evenOdd[2] + ","+ evenOdd[3] + ","+ evenOdd[4] + ","+ evenOdd[5]);
		
		//least to greatest
		int nums2[] = new int [6];
		int temp =0;
		for (int i = 0; i<6; i++) {
			nums2[i]=nums[i];
		}


		for (int j=0; j<nums2.length; j++) {
			for (int i=j; i<nums2.length-1; i++) {
				temp = nums2[i];
				if (nums2[i]>nums2[i+1]) {
					nums2[i]=nums2[i+1];
					nums2[i+1]=temp;
				}

			}
		}


		System.out.println("Least to greatest: " + nums2[0] + ","+ nums2[1] + ","+ nums2[2] + ","+ nums2[3] + ","+ nums2[4] + ","+ nums2[5]);
		
        //reversed
		int reverse[] = new int[6];
		for (int i=0; i<nums.length; i++) {
			int holding = nums[i];
			reverse[i] = nums[nums.length-1-i];
			nums[nums.length-1-i] = holding;
		}
		
		System.out.println("Reversed: " + reverse[0] + ","+ reverse[1] + ","+ reverse[2] + ","+ reverse[3] + ","+ reverse[4] + ","+ reverse[5]);

	}
}
