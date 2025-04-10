public class Violin{
    private String woodType;
    private int howOld;
    private String music;
    
    public Violin(){
        woodType = "spruce";
        howOld = 0;
        music = "";
    }
    
    public Violin(String w, int h, String m){
        woodType = w;
        howOld = h;
        music = m;
    }
    
    public void printWoodType(){
        System.out.println(woodType);
    }
    
    public void printAge(){
        System.out.println(howOld);
    }
    
    public void playMusic(){
        System.out.println("Music Music Music");
    }
    
    
}
