package java_practice;

public class MainClass 
{
	public static void main(String[] args) 
	{
		user testEmployee = new user();
		testEmployee.setFirstName("Jeff");
		testEmployee.setLastName("Woods");
		testEmployee.setAge(23);
		testEmployee.setScore(9.8);
		String message = String.format("Employee %s %s of age %d was hired with admission score of %.2f ! ", testEmployee.lastname(), testEmployee.firstName(), testEmployee.age(), testEmployee.score());
		System.out.print(message);
	}

}