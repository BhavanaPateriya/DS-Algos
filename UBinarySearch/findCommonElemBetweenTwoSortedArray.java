package UBinarySearch;

import java.util.LinkedList;

public class findCommonElemBetweenTwoSortedArray {


  public static void main(String[] args) {

    int[] array1 ={10,12,34,55,76,89,121};
    int[] array2 = {12,34,44,68,71,76,84,87,89,121};
   LinkedList<Integer> commonElem = new LinkedList<>();
    for(int i=0;i<array1.length;i++){
      if(getCommonElement(array1[i],array2) != -1)
      commonElem.add(getCommonElement(array1[i],array2));

    }
    System.out.println(commonElem.toString());
  }

  private static int getCommonElement(int value,int[] array2){

        int start = 0;
        int end = array2.length;
        while (start < end) {
          int mid = (start + end) / 2;
          if (array2[mid] == value) {
            return array2[mid];
          } else if (value > array2[mid]) {

            start = mid + 1;
          } else {
            end = mid;
          }
        }
return -1;
      }

}
