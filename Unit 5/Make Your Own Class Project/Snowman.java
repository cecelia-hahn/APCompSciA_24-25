public class Snowman{
    private int segments;
    private String accessory;
    private int inchesMelted;
    
    public Snowman (int s, String a){
        segments = s;
        accessory = a;
        inchesMelted = 0;
    }
    
    public int getSegments(){
        return segments;
    }
    
    public String getAccessory(){
        return accessory;
    }
    
    public void setSegments(int s){
        segments = s;
    }
    
    public void setAccessory(String a){
        accessory = a;
    }
    
    public void melt(){
        inchesMelted++;
    }
    
    public int getInchesMelted(){
        return inchesMelted;
    }
    
    public void printSegmentsWithThis(){
        Print printer = new Print();
        printer.print(this);
    }
    
    
}
