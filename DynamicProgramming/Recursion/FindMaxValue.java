package DynamicProgramming.Recursion;

public class FindMaxValue {


  public static void main(String[] args) {
     int[] array = {2,4,6,8,44,1};
    System.out.println(getMax(array,array.length-1));

  }



  public static int getMax(int[] array,int i){

    if(i == 0){

      return array[0];
    }
    return Math.max(getMax(array,i-1),array[i]);
  }
}
