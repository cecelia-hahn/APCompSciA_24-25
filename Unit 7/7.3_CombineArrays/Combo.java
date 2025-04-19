import java.util.ArrayList;

class Combo {
  public static ArrayList<Integer> combine(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
    ArrayList<Integer> answer = new ArrayList<Integer>(); 
    //put your code here
  //print the new array list in this method
    
    for (int i = 0; i < arr1.size(); i++) {
      answer.add(arr1.get(i));
    }

    for (int i = 0; i < arr2.size(); i++) {
      answer.add(arr2.get(i));
    }

    System.out.println("Combined ArrayList: " + answer);

    return answer; 
  }
}
