public class FirstSection extends Violin{
    private boolean highNotes;
    private boolean isSnobby;
    
    public FirstSection(){
        super();
        highNotes = true;
        isSnobby = true;
    }
    
    public FirstSection(boolean n, boolean i){
        highNotes = n;
        isSnobby = i;
    }
    
    public FirstSection(String w, int h, String m, boolean n, boolean i){
        super(w, h, m);
        highNotes = n;
        isSnobby = i;
    }
    
    public void gainSelfAwareness(){
        isSnobby = false;
        System.out.println("isSnobby is now " + isSnobby);
    }
    
    public void getConfused(){
        highNotes = false;
        System.out.println("Looks like someone can't read high notes");
    }
    
    public void playMusic(){
        System.out.println("Melody melody melody");
    }
}
