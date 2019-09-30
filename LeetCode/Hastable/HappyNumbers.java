package LeetCode.Hastable;

public class HappyNumbers {


  public static void main(String[] args) {
    System.out.println(isHappy(20));

  }


  public static boolean isHappy(int n){


    int sum =0 ;
    System.out.println(n);
    if(n == 1){

      return true ;
    }
    if(n == 4 || n == 16 || n == 37 || n == 58 || n == 145 || n == 42 || n== 20)
      return false;

      String value = String.valueOf(n);
      String[] stringarr = value.split("");
      for(int i=0;i<stringarr.length;i++){
        int squarenum = Integer.parseInt(stringarr[i]) * Integer.parseInt(stringarr[i]) ;
        sum = squarenum + sum ;
      }



      return isHappy(sum);
  }


}
