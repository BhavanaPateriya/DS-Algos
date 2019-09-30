package UHashTable.Chaining;


public class Employee {

  private String firstName ;
  private String lastName ;
  private int id ;

  Employee(String firstname,String lastName , int id){

    this.firstName = firstname ;
    this.lastName = lastName ;
    this.id = id ;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return  "firstName = " + firstName + " ,LastName = " + lastName +  " ,id = " + id;
  }
}
