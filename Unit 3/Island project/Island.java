import java.util.Scanner;
import java.lang.Math;
public class Island{
    
    //random job
    public String getRandJob(){
        //random variable
        int rand = (int)(4*Math.random());
        //assign job to number
        String job = "";
        if (rand == 1)
            job = "mechanic"; 
        else if (rand == 2)
            job = "chef"; 
        else if (rand == 3)
            job = "carpenter";
        else
            job = "farmer";
        
        System.out.println("You are a " + job + ".");
        //System.out.println(rand);
        return job;
    }
    
     public boolean survive(String job1,String job2,String job3){
        boolean isFarmer = false;
        boolean isCarpenter = false;
        if (job1.equals("farmer")||job2.equals("farmer")||job3.equals("farmer")){
            System.out.println("Because one of you is a farmer, you have food to eat!");
            isFarmer = true;
        }
        
        else
            System.out.println("You will starve to death because you do not have a farmer.");
        
        if (job1.equals("carpenter")||job2.equals("carpenter")||job3.equals("carpenter")){
            System.out.println("Because one of you is a carpenter, you will have shelter!");
            isCarpenter = true;
            
        }
        
        else
            System.out.println("You will die from exposure to the elements because you do not have a carpenter.");
            
        
        if (isFarmer && isCarpenter){
            System.out.println("You will move on to part 2 because you have a carpenter and farmer!");
        }
        
        else{
            System.out.println("You will not survive because you lack a carpenter or farmer");
            System.exit(0);
        }
        return true;
    }
    
    public String puzzle1(String name1){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word that starts and ends with the first letter of your name (first person): ");
        String word = input.nextLine();
        
        String firstLetter = word.substring(0,1);
        String lastLetter = word.substring(word.length()-1);
        
        //first letter name
        String nameLetter1 = name1.substring(0,1);
        
        if (firstLetter.toLowerCase().equals(nameLetter1.toLowerCase()) && lastLetter.toLowerCase().equals(nameLetter1.toLowerCase())){
            System.out.println("Good job! You passed!");
             return "pass";
        }
        
        else
            System.out.println("You did not pass the puzzle...");
            System.exit(0);
            return "fail";
        
           
    }
    
    public String puzzle2(String name2){
        Scanner puzzle2 = new Scanner(System.in);
        System.out.print("Square the length of your name (second person) and enter the digit in the ones place of that number: ");
        String number = puzzle2.nextLine();
        String onesInput = number.substring(number.length() - 1);
        
        int square = name2.length()*name2.length();
        String convert = Integer.toString(square);
        String ans = convert.substring(convert.length() - 1);
        if (ans.equals(onesInput)){
            System.out.println("You passed again! One last puzzle left!");
            return "pass";
        }
        
        else
            System.out.println("Oh no, you didn't pass...");
            System.exit(0);
            return "fail";
       
    }
    
    public String puzzle3(String name3){
        int correct = (name3.length() + 10) / 3;
        Scanner puzzle = new Scanner(System.in);
        System.out.print("Enter a number (third person): ");
        String input = puzzle.nextLine();
        int number = Integer.parseInt(input);
        
        if (number != correct){
            if (number < correct){
                System.out.print("Guess higher: ");
                input = puzzle.nextLine();
                number= Integer.parseInt(input);
                
                if (number < correct){
                    System.out.print("Guess higher: ");
                    input = puzzle.nextLine();
                    number= Integer.parseInt(input);
                    if (number != correct){
                        System.out.println("You failed...");
                        System.exit(0);
                    }
                    if (number == correct){
                        System.out.println("Congrats! You escaped!");
                    }
                }
                if (number > correct){
                    System.out.print("Guess lower: ");
                    input = puzzle.nextLine();
                    number= Integer.parseInt(input);
                    if (number != correct){
                        System.out.println("You failed...");
                        System.exit(0);
                    }
                    if (number == correct){
                        System.out.println("Congrats! You escaped!");
                        System.exit(0);
                    }
                }
                
            }
            if (number > correct){
                System.out.print("Guess lower: ");
                input = puzzle.nextLine();
                number= Integer.parseInt(input);
                
                if (number > correct){
                    System.out.print("Guess lower: ");
                    input = puzzle.nextLine();
                    number= Integer.parseInt(input);
                    if (number != correct){
                        System.out.println("You failed...");
                        System.exit(0);
                    }
                    if (number == correct){
                        System.out.println("Congrats! You escaped!");
                    }
                }
                
                if (number < correct){
                    System.out.print("Guess higher: ");
                    input = puzzle.nextLine();
                    number= Integer.parseInt(input);
                    if (number != correct){
                        System.out.println("You failed...");
                    }
                    if (number == correct){
                        System.out.println("Congrats! You escaped!");
                    }
                }
                
            }
        }
        
        else
        System.out.println("Congrats! You escaped the island!");
        
        return "pass";
    }
}
