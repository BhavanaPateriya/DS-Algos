package LeetCode.Hastable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


  public static void main(String[] args) {

    int[] arr ={2,7,9,11};
    System.out.println(Arrays.toString(twoSum(arr,9)));

  }


  public static int[] twoSum(int[] nums, int target) {

    Map<Integer,Integer> indexMap = new HashMap<>();
    int[] result = new int[2] ;
    for(int i=0;i<nums.length;i++){

      if(indexMap.containsKey(target - nums[i])){

        result[0] = indexMap.get(target - nums[i]);
        result[1] = i ;
        return result ;


      } else {

        indexMap.put(nums[i],i);

      }
    }
    return null ;

  }
// brute force
//  public int[] twoSum(int[] nums, int target) {
//
//    int[] resultArr = new int[2];
//    for(int i=0;i<nums.length;i++){
//      for(int j =i+1;j<nums.length;j++)
//      {
//
//
//        if(nums[i] + nums[j] == target){
//          resultArr[0] = i;
//          resultArr[1] = j ;
//
//          return resultArr ;
//        }
//
//
//      }
//
//
//    }
//
//    return null ;
//  }


}
