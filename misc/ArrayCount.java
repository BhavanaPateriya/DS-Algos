package misc;

import java.util.LinkedList;
import java.util.List;

public class ArrayCount {


  public static void main(String[] args) {

    Integer[] arr = {1,1,2,3,4,4,1,3} ;

    int[] visited = new int[arr.length];
    int i ;
    int j ;
    for(i =0 ;i<arr.length;i++){
      int sum = 0 ;
      for(int k =0;k<arr.length;k++){

        if(arr[i] != visited[k] && i < arr.length -1){
          System.out.println("visited "+arr[i]);
         continue;
        }
      }
      for(j=0;j<arr.length;j++){

        if(arr[i] == arr[j] ) {
          sum = sum + 1;
        }
      }
      visited[i] = arr[i];
      System.out.println("The frequency of number "+arr[i]+ " = " + sum );


    }

  }


}
