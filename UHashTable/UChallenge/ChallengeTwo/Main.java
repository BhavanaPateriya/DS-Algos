package UHashTable.UChallenge.ChallengeTwo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    LinkedList<Employee> employees = new LinkedList<>();
    employees.add(new Employee("Jane", "Jones", 123));
    employees.add(new Employee("John", "Doe", 5678));
    employees.add(new Employee("Mike", "Wilson", 45));
    employees.add(new Employee("Mary", "Smith", 5555));
    employees.add(new Employee("John", "Doe", 5678));
    employees.add(new Employee("Bill", "End", 3948));
    employees.add(new Employee("Jane", "Jones", 123));

    //2employees.forEach(e -> System.out.println(e));

    checkDuplicates(employees);

//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
  }

  public static void checkDuplicates(LinkedList<Employee> list){


    Map<Integer,Employee> checkDuplicates = new HashMap<>();
    for(Employee employee:list){
        checkDuplicates.put(employee.getId(),employee);
    }

    System.out.println("Looping through map :");

    for(Map.Entry employee :checkDuplicates.entrySet()){

      System.out.println("For id : "+employee.getKey() + "And the value is "
          +employee.getValue());

    }

  }

  public static int hash(int value) {
    return Math.abs(value % 10);
  }
}
