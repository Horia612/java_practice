package java_practice;

public class user 
{
	public String firstName() { return mFirstName; }
	public void setFirstName(String name) { mFirstName = name; }
	public String lastname() { return mLastName; }
	public void setLastName(String name) { mLastName = name; }
	public String gender() { return mGender; }
	public void setGender(String gender) { mGender = gender; }
	public String pron() { return mPron; }
	public void setPron()
	{
		if (mGender == "female")
		{
			mPron = "She";
		}
		else
		{
			mPron = "He";
		}
	}
	public int age() { return mAge; }
	public void setAge(int age) { mAge = age; }
	public double score() { return mScore; }
	public void setScore(double score) { mScore = score; }
	public job job() { return mJob; }
	public void setJob(job job) { mJob = job; }
	
	private String mFirstName;
	private String mLastName;
	private String mGender;
	private String mPron;
	private int mAge;
	private double mScore;
	private job mJob;
}
