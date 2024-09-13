public class Pet{
    private String type;
    private String color;
    private int age;
    private boolean isLoud;
    
    public Pet (String t, String c, int a, boolean l){
        type = t;
        color = c;
        age = a;
        isLoud = l;
        
    }
    
    public void play(){
        System.out.println("Your pet is happy!");
    }
    
    public void sleep(){
        System.out.println("Your pet is sleeping. Zzzzzzzz");
    }
    
    public void eat(){
        System.out.println("Your pet is eating. Nom nom nom");
    }
    
    public void destroy(){
        System.out.println("Uh oh... your pet is destroying your furniture!!");
    }
}
