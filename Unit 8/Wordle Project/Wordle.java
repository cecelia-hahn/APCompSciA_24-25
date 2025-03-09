import java.util.Scanner;
public class Wordle{
    private String display [][]=new String [12][5];
    private String answer []=new String[5];
    private int rownum; 
    private boolean correct = false; 
    private boolean end = false;

    public Wordle (String ans0, String ans1, String ans2, String ans3, String ans4){
        answer[0]= ans0;
        answer[1]= ans1;
        answer[2]= ans2;
        answer[3]= ans3;
        answer[4]= ans4;
        for (int i = 0; i < display.length; i++) {
            for (int j = 0; j < display[i].length; j++) {
                display[i][j] = "x";  
            }
        }
  }
  
  public void printArray() {
    if (rownum > 1) {
        for (int col = 0; col < display[0].length; col++) {
            System.out.print(display[rownum - 2][col] + " ");
        }
        System.out.println();
    }
    if (rownum > 0) {
        for (int col = 0; col < display[0].length; col++) {
            System.out.print(display[rownum - 1][col] + " ");
        }
        System.out.println();
    }
}

  
  public void input(){
    Scanner scan = new Scanner (System.in); 
    int count = 0;
    System.out.println("Tell me your word, one letter at a time, ALL CAPS please");
    String letter1 = scan.nextLine();
    String letter2 = scan.nextLine();
    String letter3 = scan.nextLine();
    String letter4 = scan.nextLine();
    String letter5 = scan.nextLine();
    
    display [rownum][0] = letter1;
    display [rownum][1] = letter2;
    display [rownum][2] = letter3;
    display [rownum][3] = letter4;
    display [rownum][4] = letter5;
    
    count++;
    
  }
  public void inputTest(){
    boolean first = false;
    boolean second = false;
    boolean third = false;
    boolean fourth = false;
    boolean fifth = false;
    boolean onceC = false;
    boolean onceE = false;
    boolean onceL = false;
    boolean onceO = false;
    boolean twice = false;
    for (int y = 0; y<5; y++){
    if (display[rownum][y].equals("C") && first != true && onceC != true){
        if (y==0){
        display[rownum+1][y] = "*";
        first = true;
        onceC = true;
        }
        else{
        display[rownum+1][y] = "@";
        onceC = true;
        }
    }
    if (display[rownum][y].equals("E") && second != true && onceE != true){
        if (y==1){
        display[rownum+1][y] = "*";
        second = true;
        onceE = true;
        }
        else{
        display[rownum+1][y] = "@";
        onceE = true;
        }
    }
    if (display[rownum][y].equals("L") && third != true && onceL != true){
        if (y==2){
        display[rownum+1][y] = "*";
        third = true;
        onceL = true;

        }
        else{
        display[rownum+1][y] = "@";
        onceL = true;

        }
    }
    if (display[rownum][y].equals("L") && fourth != true){
        if (y==3){
        display[rownum+1][y] = "*";
        fourth = true;
        twice = true;
        }
        else{
            if(y!=2){
        display[rownum+1][y] = "@";
        twice = true;
                
            }
            display[rownum+1][y] = "*";

        }
    }
    if (display[rownum][y].equals("O") && fifth != true && onceO != true){
        if (y==4){
        display[rownum+1][y] = "*";
        fifth = true;
        onceO = true;
        }
        else{
        display[rownum+1][y] = "@";
        onceO = true;
        }
    }
    
    
        }
    printArray();
    rownum+=2;
    }
    public void runWordle(){
    Scanner scan = new Scanner(System.in);
    
    while (!correct && rownum < 12) {
        input();
        inputTest();
        printArray();
        correct = true;
        for (int i = 0; i < 5; i++) {
            if (!display[rownum - 1][i].equals("*")) {
                correct = false;
                break;
            }
        }
        
        if (correct) {
            System.out.println("Great job, you're correct!");
            break;
        }

        if (rownum == 12) {
            System.out.println("You lost...");
            break;
        }
    }
}
  }
