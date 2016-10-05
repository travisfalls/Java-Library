package _19_NewFriends;

public class Friend {
	
	private String name;
	private int age;
	private String city;
	private boolean female;
	private boolean isOnline;
	
	
	//Constructor
	public Friend(String name, int age, String city, boolean female){
		this.name= name;
		this.age = age;
		this.city = city;
		this.female = female;
	}
	
	//Getter
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getCity(){
		return city;
	}
	
	public boolean getGender(){
		return female;
	}
	
	public boolean getOnlineStatus(){
		return isOnline;
	}
	
	//Setter
	public void setName(String newName){
		newName = name;
	}
	
	public void setOnlineStatus(boolean onlineStatus){
		onlineStatus = isOnline;
	}

}
