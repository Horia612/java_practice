package java_practice;

import java.util.Vector;

public class job 
{
	public String title() { return mTitle; }
	public void setTitle(String title) { mTitle = title; }
	public int salary() { return mSalary; }
	public void setSalary(int salary) { mSalary = salary; }
	public user manager() { return mManager; }
	public void setManager(user manager) { mManager = manager; }
	public Vector<user> subordinates() { return mSubordinates; }
	public void addSubordinate(user subordinate) { mSubordinates.add(subordinate); }
	
	private String mTitle;
	private int mSalary;
	private user mManager;
	private Vector<user> mSubordinates = new Vector<user>();
}
