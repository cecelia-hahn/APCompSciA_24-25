import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("yippee");
		words.add("wahoo");
		words.add("excitement");
		words.add("happy");
		words.add("ecstatic");
		words.add("joyful");
		words.add("elated");
		words.add("eager");
		words.add("delirious");
		words.add("enthusiastic");
		System.out.println("Original list: " + words);
		for (int i = words.size()-1; i>=0; i--){
		    String element = words.get(i);
		    int length = element.length();
		    //System.out.println(length);
		    for (int n = 0; n < length; n++){
		        if (element.substring(n, n+1).equals("a")){
		            words.remove(i);
		        }
		    }
		}
		System.out.println("No more A words: " + words);
	}
}
