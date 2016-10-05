package _19_NewFriends;

public class Main {

	public static void main(String[] args) {
		

		Friend alex = new Friend("Alex", 36, "Avon", false);
		Friend ben = new Friend("Ben", 29, "Brownsburg", false);
		
		alex.getName();
		alex.getAge();
		alex.getCity();
		
		ben.getName();
		ben.getAge();
		ben.getCity();
		
		if(alex.getName().equals(ben.getName())){
			System.out.println("They have the same name!");
		} else {
			System.out.println("They do not have the same name.");
		}
		
		if(alex.getGender() == true){
			System.out.println(alex.getName() + " is a woman.");
		} else {
			System.out.println(alex.getName() + " is a man.");
		}
		
		alex.setOnlineStatus(false);
		
		System.out.println("Alex is online: " + alex.getOnlineStatus());

	}

}
