package UHashTable.LinearProbing;

public class Main {

  public static void main(String[] args) {



    Employee janeJones = new Employee("Jane","Jones",1234);
    Employee johnDoe = new Employee("John","Doe",4567);
    Employee marySmith = new Employee("mary","Smith",22);
    Employee mikeWilson = new Employee("Mike","Wilson",3245);
    Employee billEnd = new Employee("Bill","End",78);



    SimpleHashtable simpleHashtable = new SimpleHashtable(10);
    simpleHashtable.put("Jones",janeJones);
    simpleHashtable.put("Doe",johnDoe);
    simpleHashtable.put("Wilson",mikeWilson);
    simpleHashtable.put("Smith",marySmith);

    simpleHashtable.printHashTable();
    System.out.println( simpleHashtable.get("Doe"));
    System.out.println(simpleHashtable.get("Smith"));


  }

}
