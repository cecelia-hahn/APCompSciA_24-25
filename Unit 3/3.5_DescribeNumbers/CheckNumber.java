import java.lang.Math;
public class CheckNumber{
    String posNegZero = "";
    String evenOdd = "";
    
    public String findPosNegZero(int number){
        if (number > 0)
            posNegZero = "The number is positive.";
        if (number < 0)
            posNegZero = "The number is negative.";
        if (number == 0)
            posNegZero = "The number is zero.";
        
        return "answer";
    }
    
    public String findEvenOddZero(int num){
        if (num == 0)
            evenOdd = "The number is zero.";
        else if (num%2 == 0)
            evenOdd = "The number is even.";
        else if (num%2 != 0)
            evenOdd = "The number is odd.";
            
        return "ans";
    }
    
    public void print(){
        System.out.println(posNegZero);
        System.out.println(evenOdd);
    }
}
