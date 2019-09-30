package LeetCode.Arrays;

import com.sun.tools.javac.util.ArrayUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

  public static void main(String[] args) {

    int[] nums = {1,1,2};
    System.out.println(removeDuplicates(nums));

  }


  public static int removeDuplicates(int[] nums){


      if (nums.length == 0)
      {
        return 0;
      }
      int i = 0;
      for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
          i++;
          nums[i] = nums[j];
        }
      }
      return i + 1;

    }


}
