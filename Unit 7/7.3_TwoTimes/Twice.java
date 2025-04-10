import java.util.ArrayList;

public class Twice {
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> arr) {
        ArrayList<Integer> doubles = new ArrayList<>();
        
        for (int i = 0; i < arr.size(); i++) {
            Integer num = arr.get(i);
            doubles.add(num);
            doubles.add(num);
        }
        
        return doubles;
    }

    
}
