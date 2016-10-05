package _18_Encapsulation_Proper;

public class Player {
	
	private String name;
	private String status;
	private int highScore;
	private int hp;
	
	
	//Constructor
	public Player(String name, String status, int highScore, int hp){
		this.name = name;
		this.status = status;
		this.highScore = highScore;
		this.hp = hp;
	}
	
	//Getters
	public int getHighScore(){
		return highScore;
	}
	
	public String getName(){
		return name;
	}
	
	public String getStatus(){
		return status;
	}
	
	public int getHp(){
		return hp;
	}
	
	//Setters
	public void setNewPlayerName(String newName){
		name = newName;
	}
	
	public void setNewStatus(String newStatus){
		status = newStatus;
	}
	
	

}
