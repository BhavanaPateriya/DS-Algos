package UHashTable.Chaining;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SimpleChaining {

  List<StoredEmployee>[] hashTable = new List[10];

  public SimpleChaining(){

    for(int i=0;i<hashTable.length;i++) {
      hashTable[i] = new LinkedList<>();
    }

  }


  public void put(String key,Employee employee){

    int hashedKey = hashKey(key);
    hashTable[hashedKey].add(new StoredEmployee(employee,key));

  }

  public Employee get(String key){

    int hashedKey = hashKey(key);
    StoredEmployee employee  ;
    ListIterator<StoredEmployee> listIterator =
        hashTable[hashedKey].listIterator();
    while(listIterator.hasNext()){
      employee = listIterator.next();
      if(employee.key.equals(key)){
        return employee.employee ;
      }
    }
    return null;
  }



  public Employee remove(String key){

    int hashedKey = hashKey(key);
    StoredEmployee employee  ;
    ListIterator<StoredEmployee> listIterator =
        hashTable[hashedKey].listIterator();
    while(listIterator.hasNext()){
      employee = listIterator.next();
      if(employee.key.equals(key)){
        hashTable[hashedKey].remove(employee);
        return employee.employee;
      }
    }

   return null ;

  }



//  public Employee remove(String key) {
//    int hashedKey = hashKey(key);
//    ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
//    StoredEmployee employee = null;
//    int index = -1;
//    while (iterator.hasNext()) {
//      employee = iterator.next();
//      index++;
//      if (employee.key.equals(key)) {
//        break;
//      }
//    }
//
//    if (employee == null) {
//      return null;
//    }
//    else {
//      hashTable[hashedKey].remove(index);
//      return employee.employee;
//    }
//  }

  public void printHashTable(){

    for(int i=0;i<hashTable.length;i++){
      if (hashTable[i].isEmpty()) {
        System.out.println("Position " + i + ": empty");
      } else {
        System.out.print("Position " + i + ": ");
        ListIterator<StoredEmployee> listIterator = hashTable[i].listIterator();
        while (listIterator.hasNext()) {

          System.out.print(listIterator.next().employee);
          System.out.print("->");
        }
        System.out.println("null");
      }
    }



  }


  public int hashKey(String key){

    return key.length() % hashTable.length ;


  }



}
