package misc;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Findmaxchar {


  public static void main(String[] args) {

    String test = "aaaababccbbbiiieeaaaaggg" ;
    Map<String,Integer> count = new HashMap<>();
    int counter = 0 ;
    String[] stringarr = test.split("");
    for(int i=0;i<stringarr.length;i++){
      for(int j =1 ;j<stringarr.length;j++){

        if(stringarr[i].equals(stringarr[j])){

          counter = counter + 1 ;
        }

      }
      count.put(stringarr[i],counter);
      counter= 0 ;
    }
    int MaxValueinMap = Collections.max(count.values());
    for(Entry<String,Integer> kv : count.entrySet()){
       if(kv.getValue() == MaxValueinMap){
         System.out.println("Highest number of characters is  " + kv.getKey()+
          " with values =  "+MaxValueinMap);


       }

    }




  }

}
