package _99_Choose_Own_Adventure;

//AdventureGame 1.0, Java Version, Character base class, C. Germany, July 01, 2006
//File 4 of 7. Save as "Character.java".
import java.io.*;
import java.util.Random;


public class Character
{    
 public Character()
 { 
   System.out.print("\tCreating a Character.\n");
   hitpoints = 40; atak = 1; defense = 1;  
   level = 0; score = 0;
   InitializeInventory();
 }
 
 public static void DisplayStats()
 {
        System.out.print(
        "\n\t*********************** Stats ***********************\n"
        + "\t" + CharName + ":    " + "Hit: " + hitpoints 
        + "    " + "Attack: " + atak + "    "
        + "Defense: " + defense + "\n"
        + "\t*****************************************************");         
 }
 
 public static void InitializeInventory()
 {   
      dagger = false;
      sword = false;
      longbow = false;
      chainmail= false;
      fullbodyarmor= false;               
      healingpotion = 0;
      FishKey = false;      
 }
 
 public static void Inventory()
 {
    System.out.print("\n\n\t\t\t***********************************\n"
         + "\t\t\t*        Current Inventory:       *\n"
         + "\t\t\t***********************************\n");
    System.out.print("\t\t\t*                                 *\n");

    if(dagger) 
    { System.out.print("\t\t\t*  Dagger (+ 2 Attack)            *\n"); }

    if(sword) 
    { System.out.print("\t\t\t*  Sword (+ 4 Attack)             *\n"); }

    if(longbow) 
    { System.out.print("\t\t\t*  Long Bow (+2 over Distance)    *\n"); }

    if(chainmail) 
    { System.out.print("\t\t\t*  Chain Mail (+ 2 Defense)       *\n"); }

    if(fullbodyarmor) 
    { System.out.print("\t\t\t*  Full Body Armor (+4 Defense)   *\n"); }

    if(healingpotion > 0) 
	  { 
		  System.out.print("\t\t\t*  Healing Potion (+20HP)  Amt: " 
	                           + healingpotion + " *\n"); 
	  }

    if(FishKey) 
    { System.out.print("\t\t\t*  Fish Key (Access to Objects)   *\n"); }

    if(dagger == false && sword == false && longbow == false 
       && chainmail == false && fullbodyarmor == false && 
       healingpotion == 0 && FishKey == false)
    { System.out.print("\t\t\t*   How sad, absolute nothing!    *\n"); }
    
    System.out.print("\t\t\t*                                 *\n"); 
    System.out.print("\t\t\t***********************************\n"); 
    System.out.print("\n");    
 }   

 public static void Attack(Monster Opponent)
 {
    int damage = 0; 
    
    Random BanannaSplit = new Random();       
    damage = (BanannaSplit.nextInt(10) + 1) + atak;
    
    if(dagger == true && UseDagger == true) 
    { System.out.print("\n\t" + CharName + " stabs with the dagger!\n"); 
      damage = damage + 2; 
    }
    else if(sword == true && UseSword == true) 
    { System.out.print("\n\t" + CharName + " swings the sword!\n"); 
      damage = damage + 4; 
    }
    else if(longbow == true && UseLongBow == true) 
    { System.out.print("\n\t" + CharName + " releases the String of the longbow!"); 
      damage = damage + 2; 
    }
    else { System.out.print("\n\t" + CharName + 
           " engages the oponent in brutal hand to hand combat!\n"); }
         
    System.out.print("\n\n\t***************** " + CharName 
         + " Attacks! *****************\n"
         + "\tBefore Attack:    " + CharName + " Hit = " + hitpoints  + "   "  
         + "    Opponent Hit = " + Opponent.getHit() 
         + "\n");             
    
    if(damage - (Opponent.getDefense()) > 0)
    { damage = damage - (Opponent.getDefense()); }
    else { damage = 0; }
   
    //Prevent negative values. Check that oponent is still alive.      
    if((Opponent.getHit() - damage) > 0) 
      { Opponent.setHit((Opponent.getHit() - damage)); }
    else 
      { Opponent.setHit(0); }  

    System.out.print("\tAfter Attack:     " + CharName + " Hit = " + hitpoints  + 
                     "   " + "    Opponent Hit = " + Opponent.getHit() + "\n");   
    
    try { Thread.sleep(3000); }
    catch(Exception e) {  } 
 }

 public static void AskName()
 {
    LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
    
    System.out.print("\n\n\n\n\n\n\tWhat will be your true name, player?\t");

    try { CharName = cin.readLine(); }
    catch (IOException e) { System.err.println("Error."); } 
    
    System.out.print("\n\tFrom henceforth, you shall be called: " 
         + CharName + " !!!\n\n\n\n\n\n\t"); 
         
    PAUSE();
 }
 
 public static void Cheat()
 {
      setDagger(true); setSword(true);
      setLongBow(true); setChainMail(true);
      setFullBodyArmor(true); setHealingPotion(7);
      setFishKey(true);          
 }    

 public static void UseHealingPotion()
 {
       if(healingpotion > 0)
       { hitpoints = hitpoints + 20; DisplayStats(); healingpotion--; }
       else 
       { 
          System.out.print(
          "\n\tWishful thinking. You don't have any healing potions.\n"); 
       }     
 }       

 public static void PAUSE()
 {
        //Since Java doesn't have a PAUSE command lie C++, make your own
        String CONTINUE = "";
        LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
        while(CONTINUE == "")
        {    
              System.out.print("\n\n\tPaused. Press ENTER to continue.   ");
              System.out.println("\n\n\n\n\n");
              try { CONTINUE = cin.readLine(); }
              catch (IOException e) { System.err.println("Error."); }
        }
  }   
 
 //Inventory Accessor Methods
 public static boolean getDagger() { return dagger; }
 public static boolean getSword() { return sword; }
 public static boolean getLongBow() { return longbow; }
 public static boolean getChainMail() { return chainmail; }
 public static boolean getFullBodyArmor() { return fullbodyarmor; }
 public static int getHealingPotion() { return healingpotion; }
 public static boolean getFishKey() { return FishKey; }
 public static void setDagger(boolean x) { dagger = x; }
 public static void setSword(boolean x) { sword = x; }
 public static void setLongBow(boolean x) { longbow = x; }
 public static void setChainMail(boolean x) { chainmail = x; }
 public static void setFullBodyArmor(boolean x) { fullbodyarmor = x; }
 public static void setHealingPotion(int x) { healingpotion = healingpotion + x; }
 public static void setFishKey(boolean x) { FishKey = x; } 
 public static void setUseDagger(boolean x) { UseDagger = x; }
 public static void setUseSword(boolean x) { UseSword = x; }
 public static void setUseLongBow(boolean x) { UseLongBow = x; }   


 //Character Attribute Accessor Methods
 public static void setHit(int hp) { hitpoints = hp; }
 public static void setAttack(int atk)  { atak = atk; }
 public static void setDefense(int def) { defense = def; }
 public static void setLevel(int lvl) { level = lvl; }
 public static void setLocation(int loki) { location = loki; }   
 public static void setName(String nm) { CharName = nm; }
 public static void setScore(int sc)  { score = sc; }    
 public static int getHit() { return hitpoints; }
 public static int getAttack()  { return atak; }
 public static int getDefense() { return defense; }
 public static int getLevel() { return level; }
 public static int getLocation() { return location; }
 public static int getScore() { return score; }       
 public static String getName() { return CharName; } 
 
 //Character Attribute Items
 private static int hitpoints;
 private static int atak;
 private static int defense;
 private static int level;
 private static int location;
 private static String CharName; 
 private static int score;
 
 //Character Inventory Items
 private static  boolean dagger;
 private static  boolean sword;
 private static  boolean longbow;
 private static  boolean UseDagger;
 private static  boolean UseSword;
 private static  boolean UseLongBow;
 private static  boolean chainmail;
 private static  boolean fullbodyarmor;              
 private static  int healingpotion;
 private static  boolean FishKey;          
        
}
