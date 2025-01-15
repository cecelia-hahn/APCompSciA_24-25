public class Main
{
	public static void main(String[] args) {
		double[] array = {2.2, 4.2, 5.4, 2.4, 1.8};
		double sum = 0;
		
		for (int i = 0; i<array.length; i++){
		    sum += array[i];
		}
		
		System.out.println(sum);
	}
}
