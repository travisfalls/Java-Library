package _99_Choose_Own_Adventure;

//AdventureGame 1.0, Java Version, derived Dragon class, C. Germany, July 01, 2006
//File 2 of 7. Save as "Dragon.java".
import java.util.Random;

public class Dragon extends Monster
{ 
    public Dragon() { System.out.print("\n\tCreating a DERIVED class Dragon."); }

    public void Attack(Character Opponent)
    {  
        Random BanannaSplit = new Random();       
        
        //Since we are calling members of the base class, we use the "this" pointer.   
        int damage = 0;           
     
        System.out.print("\n\n\t***************** Dragon Attacks! *****************\n"
                         + "\tBefore Attack:    Dragon Hit = " + getHit() + "      " 
                         + Opponent.getName() +  " Hit = "  + Opponent.getHit()
                         + "\n");             
     
    damage = (BanannaSplit.nextInt(10) + 1) + getAttack();
    
    if(damage > Opponent.getDefense())
       { damage = damage - Opponent.getDefense(); }
    else { damage = 0; }   
    if(Opponent.getFullBodyArmor()) 
    { if(damage > 4) { damage = damage - 4; } }
    if(Opponent.getChainMail()) 
    { if(damage > 2) { damage = damage - 2; }  }
    
    //Prevent negative values. Check that oponent is still alive.      
    if((Opponent.getHit() - damage) > 0) 
      { Opponent.setHit((Opponent.getHit() - damage)); }
    else 
      { Opponent.setHit(0); }  

    System.out.print("\tAfter Attack:     Dragon Hit = " + getHit() + "      "   
         + Opponent.getName() + " Hit = " + Opponent.getHit() 
         + "\n\n");   
       
    try { Thread.sleep(3000); }
    catch(Exception e) {  }
} 
        
 public void BreatheFire()
 { System.out.print("Breathing fire."); }
 
 //Accesor Methods
 public void setCanFly(boolean fly) { CanFly = fly; }
 public boolean getCanFly() { return CanFly; } 
       
 //Private Data Members
 private boolean CanFly;                  
        
}