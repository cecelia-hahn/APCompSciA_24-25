public class Mystery{
    
public void mystery(int[] array){
    
    for (int i = 0; i<array.length; i++){
        if (array[i]%2 == 0){
            array[i]/=2;
            System.out.println(array[i]);
        }
        
        else{
        array[i]*=10;
        System.out.println(array[i]);
            
        }
    }
    
    }
}
