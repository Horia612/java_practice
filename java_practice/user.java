package java_practice;

public class user 
{
	public String firstName() { return mFirstName; }
	public void setFirstName(String name) { mFirstName = name; }
	public String lastname() { return mLastName; }
	public void setLastName(String name) { mLastName = name; }
	public int age() { return mAge; }
	public void setAge(int age) { mAge = age; }
	public double score() { return mScore; }
	public void setScore(double score) { mScore = score; }
	
	private String mFirstName;
	private String mLastName;
	private int mAge;
	private double mScore;
}
