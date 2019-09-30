package UBinarySearch;

public class Main {

  public static void main(String[] args) {

    int[] intarray = {10,15,21,45,98,444,2000};
    System.out.println(iterativeBinarySearch(intarray,21));


  }

  //10 , 20 ,30 40,50,60,70
  // 0+7 =3
  //40 == mid
  //

  public static int iterativeBinarySearch(int[] intarray,int value){

       int start =0 ;
       int end = intarray.length  ;
       while(start < end){
         int mid = (start + end ) /2 ;
         System.out.println("Midpoint = " +mid);
         if(intarray[mid] == value){
           return mid ;
         } else if(intarray[mid] < value){
           start = mid+1 ;
         } else {
           end = mid ;
         }
       }
      return -1 ;
  }

  public static int resursiveBinarySearch(int[] intarray ,int value){

    return resursiveBinarySearch(intarray,0 ,intarray.length,value) ;
  }


public static int resursiveBinarySearch(int[] intarray,int start,int end,int value){
    if(start >= end){

      return -1 ;
    }

    int mid = (start + end) /2 ;
    if(intarray[mid] == value){

      return mid ;
      }
      else if(intarray[mid]<value){

      return  resursiveBinarySearch(intarray,mid+1,intarray.length,value);

      } else {

     return resursiveBinarySearch(intarray,0,mid,value);

     }


}

}
