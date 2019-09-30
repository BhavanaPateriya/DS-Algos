package LeetCode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayPartitionI {

  Map<Integer,Integer> map = new HashMap<>();
  public static void main(String[] args) {
    int[] arr = {1,2,3,2};
    System.out.println(arrayPairSum(arr));

  }


  //find the second highest number
  public static int arrayPairSum(int[] nums){

    Arrays.sort(nums);
    int firstHighest = nums[nums.length - 1];
    System.out.println(firstHighest + ":f");
    int secondHighest = nums[nums.length - 2] ;
    System.out.println(secondHighest + ": sec");
    int sum = Math.min(firstHighest,secondHighest);
    if(nums.length == 2 ){
      return Math.min(nums[0],nums[1]);
    } else if(nums.length < 2) {
      return nums[0];
    } else {

      for(int i =0;i<nums.length;i++){
        for(int j = i+1 ;j<nums.length;j++){
          if(nums[i] != firstHighest
              && nums[i] != secondHighest
              && nums[j] != firstHighest
              && nums[j] != secondHighest){
            System.out.println(nums[i]+ " "+ nums[j]);
            int minValue = Math.min(nums[i],nums[j]);
            sum = sum+minValue;

          }


        }


      }
      return sum ;
    }
  }

   //find the other pair







}
