//declare class

public class Plural{
    private String ending;


    public Plural (String e){
        ending = e;
    }
    
    public void melanie (String e){
        int length = e.length();
        if (e.substring((length-3)).equals("ife")){
            System.out.println("-ives");
        }
        else if (e.substring((length-2)).equals("ey")){
            System.out.println("-eys");
        }
           
        else if (e.substring((length-1)).equals("y")){
            System.out.println("-ies");
        }    
            
        else
            System.out.println("-s");
    }
        
}
