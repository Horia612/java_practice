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
		testEmployee.setGender("male");
		String pron;
		if (testEmployee.gender() == "female")
		{
			pron = "She";
		}
		else
		{
			pron = "He";
		}
		job swEng = new job();
		swEng.setTitle("Software Developer");
		swEng.setSalary(5000);
		testEmployee.setJob(swEng);
		String message = String.format("Employee %s %s of age %d was hired. %s had an admission score of %.2f ! ", testEmployee.lastname(), testEmployee.firstName(), testEmployee.age(), pron, testEmployee.score());
		String jobDescription = String.format("%s works as a %s, making %d $ NET per month!", pron, testEmployee.job().title(), testEmployee.job().salary());
		System.out.print(message);
		System.out.print("\n");
		System.out.print(jobDescription);
	}

}