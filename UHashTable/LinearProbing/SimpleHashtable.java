package UHashTable.LinearProbing;

public class SimpleHashtable {

  private StoredEmployee[] hashtable;

  SimpleHashtable(int capacity) {

    this.hashtable = new StoredEmployee[capacity];

  }

  public void put(String name, Employee employee) {

    int hashedKey = generateHashKey(name);
    // linear prob starts here
    //  will check if the place is occupied or not
    if (occupied(hashedKey)) {

      int stopIndex = hashedKey;
      if (hashedKey == hashtable.length - 1) {

        hashedKey = 0;
      } else {

        hashedKey++;
      }

      while (occupied(hashedKey) && hashedKey != stopIndex) {

        hashedKey = (hashedKey + 1) % hashtable.length;

      }

    }

    if (hashtable[hashedKey] != null) {
      System.out.println("Sorry the place is occupied ");
    } else {
      hashtable[hashedKey] = new StoredEmployee(employee, name);
    }

  }


  public int generateHashKey(String name) {
    return name.length() % hashtable.length;
  }


  public Employee get(String name) {
    int hashkey = findKey(name);
    if(hashkey == 1){

      return null ;
    } else {

      return hashtable[hashkey].employee ;

    }

  }

  public boolean occupied(int index) {

    return hashtable[index] != null;

  }

  public int findKey(String name) {

    int hashedKey = generateHashKey(name);
    if (hashtable[hashedKey].key.equals(name)) {

      return hashedKey;
    }

    int stopIndex = hashedKey;
    if (hashedKey == hashtable.length - 1) {

      hashedKey = 0;
    } else {

      hashedKey++;
    }

    while (hashedKey != stopIndex && hashtable[hashedKey] != null
        && !hashtable[hashedKey].key.equals(name)) {

      hashedKey = (hashedKey + 1) % hashtable.length;

    }

    if(stopIndex == hashedKey ){

      return -1 ;
    } else {

      return hashedKey ;

    }
  }




  public void printHashTable() {

    for (int i = 0; i < hashtable.length; i++) {
      if (hashtable[i] == null) {
        System.out.println("empty");
      } else {
        System.out.println("Retrive at position "+i +": "+ hashtable[i].employee);
      }
    }
  }


}
