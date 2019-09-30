package UHashTable.BucketSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


  public static void main(String[] args) {

    //int[] input = {10, 12, 33, 7, 32, 54, 21, 96};
    int[] input = {54, 46, 83, 66, 95, 92, 43};

    sort(input);
    for (int i = 0; i < input.length; i++) {

      System.out.println(input[i]);
    }


  }

  public static void sort(int[] input) {
    List<Integer>[] bucket = new List[10];
    //initialize the arraylist
    for (int i = 0; i < bucket.length; i++) {
      bucket[i] = new ArrayList<>();
    }

    for (int i = 0; i < input.length; i++) {
      bucket[hashFunc(input[i])].add(input[i]);
    }
    for (int i = 0; i < bucket.length; i++) {

      Collections.sort(bucket[i]);
    }
    int j = 0;
    for (int i = 0; i < bucket.length; i++) {
      for (Integer list : bucket[i]) {
        input[j++] = list;
      }
    }

    Map<Integer,Integer> indexMap = new HashMap<>();
    for(Map.Entry values:indexMap.entrySet()){

      values.getKey();
    }
  }

  public static int hashFunc(int value) {

    return value / 10;

  }

}
