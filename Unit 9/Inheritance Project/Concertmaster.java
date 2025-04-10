public class Concertmaster extends FirstSection{
    private boolean canTune;
    private int cues;
    
    public Concertmaster(){
        super();
        canTune = true;
        cues = 0;
    }
    
    public Concertmaster(boolean c, int cu){
        canTune = c;
        cues = cu;
    }
    
    public Concertmaster(String w, int h, String m, boolean n, boolean i, boolean c, int cu){
        super(w, h, m, n, i);
        canTune = c;
        cues = cu;
    }
    
    public void playWrongNote(){
        canTune = false;
        System.out.println("The concertmaster doesn't know how to tune...");
    }
    
    public void cueCorrectly(){
        cues+=1;
        System.out.println("Number of correct cues made: " +cues);
    }
    
    public void playMusic(){
        System.out.println("Solo solo solo");
    }
}
