public class Beverage{
    private String type;
    private boolean hasIce;
    private int oz;
   
    public Beverage (String t, boolean i, int o){
        type = t;
        hasIce = i;
        oz = o;
    }
   
    public void drink(){
        System.out.println("gulp");
    }
}
