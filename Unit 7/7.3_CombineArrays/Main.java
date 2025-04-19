import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> array1 = new ArrayList<Integer>();
    ArrayList<Integer> array2 = new ArrayList<Integer>();
    //add some numbers to the array before you start
    array1.add(3);
    array1.add(6);
    array1.add(9);
    
    array2.add(2);
    array2.add(4);
    array2.add(6);

    Combo.combine(array1, array2); 
  }
}
