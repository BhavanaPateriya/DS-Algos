package DivideAndConquer;

public class FibonacciSeries {


  public static void main(String[] args) {

    System.out.println(findFibo(6));
  }

  public static int findFibo(int n){

    if(n<=0){
      return -1;
    }else if(n==1){
      return 0;
    }else if(n==2){
      return 1;
    }else {
      return findFibo(n-1) + findFibo(n-2);
    }
  }





}
