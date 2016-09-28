package _13_Friends;

public class Friends {

	
	//Properties
	String name;
	String city;
	String network;
	String occupation;
	String education;
	String response;
	String currCity;
	String hometown;
	String school;
	int age;
	int friendsFor;
	boolean isOnline;
	boolean isMarried;
	boolean female;
	
	
	
	//Methods
	public void getFriendName() {
		System.out.println("My friend\'s name is " + name);
	}
	
	public void getFriendAge() {
		System.out.println("My friend is " + age + " years old.");
	}
	
	public void getFriendCity() {
		System.out.println("My friend lives in " + city);
	}
	
	public void getFriendOccupation() {
		System.out.println("My friend is a " + occupation);
	}
	
	public void printYearsFriends(){
		switch(friendsFor){
			case 0:
				response = "You have been friends with " + name + " for " + friendsFor + " years.";
				break;
			case 5:
				response = "You have been friends with " + name + " for " + friendsFor + " years.";
				break;
			case 10:
				response = "You have been friends with " + name + " for " + friendsFor + " years.";
				break;
			default:
				response = "Cool...";
		}
		System.out.println(response);
	}
	
	
		
	public void onlineCheck() {
		if(isOnline){
			System.out.println(name + " is online.");
		} else {
			System.out.println(name + " is not online.");
		}
	}	
	
	public void cityCheck() {
		if(currCity != hometown){
			System.out.println(name + " has moved away from home.");
		} else {
			if(female == true) {
				System.out.println(name + " is living in her hometown.");
			} else {
				System.out.println(name + " is living in his hometown.");
			}
		}

	

		
		
	}
	
}
