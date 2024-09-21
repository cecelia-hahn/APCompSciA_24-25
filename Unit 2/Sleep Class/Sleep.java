public class Sleep{
    private boolean isComfy;
    private double hoursSlept;
    private int sleepQuality;
    
    public Sleep (boolean c, double h, int q){
        isComfy = c;
        hoursSlept = h;
        sleepQuality = q;
    }
    
    
    public void getNewBed(){
        isComfy = true;
        sleepQuality += 1;
    }
    
    
    public double sleepScore (){
        return hoursSlept + sleepQuality;
    }
    
    
    public void takeANap(double hours){
        hoursSlept += hours;
    }
    
    
    public void stats(){
        System.out.println("Your bed is comfy: " + isComfy);
        System.out.println("You slept " + hoursSlept + " hours.");
        System.out.println("Your sleep quality is " + sleepQuality);
        System.out.println("Your sleep score is " + sleepScore());
    }
    
}
