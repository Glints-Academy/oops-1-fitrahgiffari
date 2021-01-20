package Task1;

public class Person {
   // declare variables
   private String name, address;
   
   /** Constructs a Person instance with the given name and address */
   public Person(String name, String address) {
      this.name = name;
      this.address = address;
   }
   
   /** Get the name */
   public String getName() {
      return name;
   }
   /** Get the address */
   public String getAddress() {
      return address;
   }
   /** Set new address */
   public void setAddress(String address) {
      this.address = address;
   }
   
   /** Returns a self-descriptive string */
   public String toString() {
      return name + "\nAddress: "+ address;
   }
}