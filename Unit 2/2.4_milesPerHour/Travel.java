public class Travel{
    private double miles;
    private double time;
    
    public Travel (double m, double t){
        miles = m;
        time = t;
    }
    
    public double milesPerHour(){
        return miles / time;
    }
    
    public void stats(){
        System.out.println("You are traveling " + milesPerHour() + " miles per hour.");
    }
    
}
