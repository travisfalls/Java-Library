package _13_Friends;

public class BasicObjects {

	public static void main(String[] args) {
		

		Friends alex = new Friends();
		
		alex.name = "Alex";
		alex.age = 36;
		alex.city = "Avon";
		alex.occupation = "Pastor";
		alex.friendsFor = 5;
		alex.isOnline = false;
		alex.currCity = "Avon";
		alex.hometown = "Avon";
		alex.school = "IWU";
		alex.female = false;
		
		
		alex.getFriendName();
		alex.getFriendAge();
		alex.getFriendCity();
		alex.getFriendOccupation();
		
		
		alex.printYearsFriends();
		
		alex.onlineCheck();
		
		alex.cityCheck();
		
		
	}

}
