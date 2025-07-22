package java_practice;

public class UserNode 
{
	//setters
	public void setUser(user user) { mUser = user; }
	public void setNextNode(UserNode next) { mNextNode = next; }
	
	//getters
	public user user() { return mUser; }
	public UserNode next() { return mNextNode; }
	
	private user mUser;
	private UserNode mNextNode;
}
