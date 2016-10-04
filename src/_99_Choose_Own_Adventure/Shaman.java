package _99_Choose_Own_Adventure;

//AdventureGame 1.0, Java Version, derived Shaman class, C. Germany, July 01, 2006
//File 5 of 7. Save as "Shaman.java".

import java.util.Random;

public class Shaman extends Character
{
    public Shaman() { System.out.print("\tCreating a Shaman.\n"); }

    Random BanannaSplit = new Random();
    
    public void Talk() 
    {
           int SayWhat = (BanannaSplit.nextInt(10) + 1);             

           System.out.print("\n\tThe Shaman looks at you from beneath her priestly\n"
                            + "\tgarments and says,\n\n\t\""); 

           switch(SayWhat) 
           {
               case 1 : System.out.print(
                        "I like wild flowers. They are very beautiful, and\n"
                        + "\ttheir restorative powers are merely a fringe benefit");
		          break;
               case 2 : System.out.print(
                        "Do not look at the outward appearance of things,\n"
                        + "\tcharacter should be judged by what is on the inside.");
		          break;
	         case 3 : System.out.print(
                         "Good karma, bad karma, it's all the same..");
                        break;
	         case 4 : System.out.print("I have a secret to tell...");
                        break;
	         case 5 : System.out.print(
                        "To unlock the gate between worlds one needs a key");
                        break;
	         case 6 : System.out.print(
                        "You are not from this world, I see that now");
                        break;
	         case 7 : System.out.print(
                        "You did not yet know it traveler, but you must "
                        + "seek\nthe key of the fish god!"); break;
               case 8 : System.out.print(
                        "Sometimes I wish I'd never taken that vow of chastity");
                        break;
               case 9 : System.out.print(
                        "Do you think I'm pretty? Don't judge a book by its cover!");
                        break;
               case 10 : System.out.print(
                         "Beware the edge of the forest. Giants are afoot");
                         break;              
	         default : System.out.print("Uh oh, this should never happen.."); 
                         break;
          } //closes switch
	        
          System.out.print("\".\n\n");
	
  } //close talk function
    
     //Public Accesor Methods
       public void setStaff(boolean x) { staff = x; }
       public boolean getStaff() { return staff; }
       public void setMedicine(boolean x) { medicinebag = x; }
       public boolean getMedicine() { return medicinebag; }
  
    //Private Data Members
      private boolean staff;
      private boolean medicinebag;
};

//-----------------------------------------------------------------
