

import java.util.ArrayList;

public class ArraylistDEMo {
    public static void main (String args[]){
        ArrayList <String> names = new ArrayList<>();
        names.add("Neziel");
        names.add("Jade");
        names.add("Carcueva");
        
        System.out.println(names);
        
        for(int i=0; i< names.size(); i++){
            System.out.println(names.get(i) + " ");
        }
    }

    
}
