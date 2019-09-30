package DivideAndConquer;

public class NumberFactor {

  public static void main(String[] args) {

    System.out.println(waysToGetIn(5));

  }


  public static int waysToGetIn(int n){


    if(n==0 || n==1 || n== 2){

      return 1;
    } else if(n == 3){

      return 2;
    }
    System.out.println("n is " +n);
    int subtract1 = waysToGetIn(n-1);
    int subtract2 = waysToGetIn(n-3);
    int subtract3 = waysToGetIn(n-4);

    return subtract1 + subtract2 + subtract3 ;


  }



}
