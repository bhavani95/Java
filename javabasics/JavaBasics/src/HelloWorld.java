/**
 * 
 */

/**
 * @author bhavanikuppagiri
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
      System.out.println("Hi this is Bhavani and iam starting my java practice");
      //create an object to the BasicClass.java
      /*what is an object?
       * An object is an instance of a class
       * how to create an object??
       * Object can be created using the key word new
       * example: BasicClass bhavani = new BasicClass(); 
       * If we create an objcet we can access all the variables and methods declared as public
       * */
      
      BasicClass bhavani = new BasicClass(); 
      
    
      
      //how to set dynamic values to the private variables existed in basicClass
      //by creating the getters and setters we can get and set dynamic values 
      bhavani.setAge(15);
      bhavani.setName("Bhavani Kuppagiri");
      
      //now bhavani the object have access to the method describeThePerson() method
      bhavani.describeThePerson();
      
      //getters usage
      System.out.println("bhavani age retrived using getAge is "+bhavani.getAge()+" bhavani name retrived from getName is "+bhavani.getName());
      
      //utilize the ageEvenOrOdd function
      String typeOfAge = bhavani.ageOddorEven();
      System.out.println("age type is "+typeOfAge);
	}

}
