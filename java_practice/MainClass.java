package java_practice;

public class MainClass 
{
	public static void main(String[] args) 
	{
		//create the manager
		user testManager = new user();
		testManager.setFirstName("John");
		testManager.setLastName("Salaryman");
		testManager.setAge(46);
		testManager.setScore(10.0);
		testManager.setGender("male");
		testManager.setPron();
		
		//create jobs
		job swLead = new job();
		swLead.setTitle("Software Team Lead");
		swLead.setSalary(25000);
		
		testManager.setJob(swLead);
		
		job swEng = new job();
		swEng.setTitle("Software Developer");
		swEng.setSalary(7000);
		swEng.setManager(testManager);
		
		job qaEng = new job();
		qaEng.setTitle("QA Automation Engineer");
		qaEng.setSalary(4000);
		qaEng.setManager(testManager);
		
		job intern = new job();
		intern.setTitle("Internship in IT");
		intern.setSalary(2500);
		intern.setManager(testManager);
		
		//create employees
		//devs
		user testEmployee1 = new user();
		testEmployee1.setFirstName("Jeff");
		testEmployee1.setLastName("Woods");
		testEmployee1.setAge(23);
		testEmployee1.setScore(9.8);
		testEmployee1.setGender("male");
		testEmployee1.setPron();
		testEmployee1.setJob(swEng);
		testManager.job().addSubordinate(testEmployee1);
		
		user testEmployee2 = new user();
		testEmployee2.setFirstName("Lucy");
		testEmployee2.setLastName("Woods");
		testEmployee2.setAge(20);
		testEmployee2.setScore(7.8);
		testEmployee2.setGender("female");
		testEmployee2.setPron();
		testEmployee2.setJob(swEng);
		testManager.job().addSubordinate(testEmployee2);
		
		user testEmployee3 = new user();
		testEmployee3.setFirstName("Luke");
		testEmployee3.setLastName("Backrest");
		testEmployee3.setAge(21);
		testEmployee3.setScore(9.9);
		testEmployee3.setGender("male");
		testEmployee3.setPron();
		testEmployee3.setJob(swEng);
		testManager.job().addSubordinate(testEmployee3);

		//qa
		user testEmployee4 = new user();
		testEmployee4.setFirstName("Ann");
		testEmployee4.setLastName("Backrest");
		testEmployee4.setAge(24);
		testEmployee4.setScore(8.8);
		testEmployee4.setGender("female");
		testEmployee4.setPron();
		testEmployee4.setJob(qaEng);
		testManager.job().addSubordinate(testEmployee4);
		
		user testEmployee5 = new user();
		testEmployee5.setFirstName("Jane");
		testEmployee5.setLastName("Doe");
		testEmployee5.setAge(22);
		testEmployee5.setScore(6.8);
		testEmployee5.setGender("female");
		testEmployee5.setPron();
		testEmployee5.setJob(qaEng);
		testManager.job().addSubordinate(testEmployee5);
		
		//intern
		user testEmployee6 = new user();
		testEmployee6.setFirstName("John");
		testEmployee6.setLastName("Doe");
		testEmployee6.setAge(19);
		testEmployee6.setScore(5.4);
		testEmployee6.setGender("male");
		testEmployee6.setPron();
		testEmployee6.setJob(intern);
		testManager.job().addSubordinate(testEmployee6);
		
		//messages
		String message = String.format("Employee %s %s of age %d was hired. %s had an admission score of %.2f !\n", testManager.lastname(), testManager.firstName(), testManager.age(), testManager.pron(), testManager.score());
		String jobDescription = String.format("%s works as a %s, making %d$ NET per month!\n", testManager.pron(), testManager.job().title(), testManager.job().salary());
		System.out.print(message);
		System.out.print(jobDescription);
		System.out.print("Team also consists in:\n");
		for (user employee : testManager.job().subordinates())
		{
			String presentation = String.format("Employee %s %s of age %d. %s is a %s making %d$ NET per month!\n", employee.lastname(), 
																												  employee.firstName(),
																												  employee.age(),
																												  employee.pron(),
																												  employee.job().title(),
																												  employee.job().salary());
			System.out.print(presentation);
		}
	}

}