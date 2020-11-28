
public class BasicClass {

	//class is basically a blur print /template that describes the state/behavior of the object of its type support
	
	/*
	 * This is a basic class with state age and name
	 * This class have a method called describeThePerson, which gives the information of the user */
	private int age ;
	private String Name;
	
	//how to create getters and setters??
	//It is very easy now, just right click on here select source and select getters and setters
	
	public void describeThePerson() {
		System.out.println("Hi my name is "+Name+" and iam "+age);
	}
	
	
	
	//Parameterized constructor 
	public BasicClass(int age, String name) {
		super();
		this.age = age;
		Name = name;
	}


	public String ageOddorEven() {
		
	return getAge()%2 == 0 ? "Even" : "Odd";
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//to string method, when we print an object created it will print hexacode, to avoid it, we need to override the toString method for not exposing the hexa code
	@Override
	public String toString() {
		return "BasicClass [age=" + age + ", Name=" + Name + "]";
	}




	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
