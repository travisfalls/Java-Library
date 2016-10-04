package _99_Choose_Own_Adventure;


//AdventureGame 1.0, Java Version, Monster base class, C. Germany, July 01, 2006
//File 1 of 7. Save as "Monster.java". 

public class Monster
{
    public Monster()
    { 
         System.out.println("\n\tCreating a BASE class monster.");
         hitpoints = 25; atak = 1; defense = 1; name = "Monster";
    }

    //Public Accessor Methods

      public void setHit(int hp) { hitpoints = hp; }
      public void setAttack(int atk)  { atak = atk; }
      public void setDefense(int def) { defense = def; }
      public void setName(String nm) { name = nm; }

      public int getHit() { return hitpoints; }
      public int getAttack()  { return atak; }
      public int getDefense() { return defense; } 
      public String getName() { return name; } 
        

    //Private Data Members

      private int hitpoints; 
      private int atak; 
      private int defense; 
      private String name;               
    
}
