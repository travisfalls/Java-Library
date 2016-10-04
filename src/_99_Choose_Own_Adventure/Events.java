package _99_Choose_Own_Adventure;

//AdventureGame 1.0, Java Version, base Events class, C. Germany, July 01, 2006
//File 6 of 7. Save as "Events.java".
import javax.swing.*;
import java.io.*;
import java.util.Random;

public class Events
{  
//-----------------------------------------------------------------------------------------

     //Globals
     static LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
     static Random RAND = new Random();
     
     public static boolean W1GiantAlive;
     public static boolean E1DragonAlive;
     public static boolean S2MotleyCrewAlive;
     public static boolean FirstTimeInShamanHut;
     public static boolean CENTERFirstTime;
     public static boolean UNDERDragonPairAlive;
     public static boolean FoundHP_West2;
     public static boolean FoundHP_Shaman;   
     
//-----------------------------------------------------------------------------------------
     //No method to convert String to boolean in Java as in C++, so let's make our own!     
     public boolean TrueOrFalse(String x)
     {
            if(x.equals("true"))  { return true; }
            else { return false; }
     }
     
//-----------------------------------------------------------------------------------------
     //No method for "PAUSE" in Java as in C++, so let's make our own!
     public static void PAUSE()
     {
            //Since Java doesn't have a PAUSE command lie C++, let's make our own!
            String CONTINUE = "";
            while(CONTINUE == "")
            {    
                 System.out.print("\n\n\tPaused. Press ENTER to continue.   ");
                 ClearScreen(5);
                 try { CONTINUE = cin.readLine(); }
                 catch (IOException e) { System.err.println("Error."); }
            }
     }
//-----------------------------------------------------------------------------------------

     //No concise CIN method in Java for "char" as in C++, so let's make our own!
     public char CIN()
     {
            String choice = "";
            char WhatToDo = '#';
            try { choice = cin.readLine(); }               
            catch (IOException e) { System.err.println("Error."); }
            choice.toLowerCase();
            if(choice.equals("")) { WhatToDo = '#'; }
            else { WhatToDo = choice.charAt(0); }
            return WhatToDo;
     }

//-----------------------------------------------------------------------------------------
     //No method for "CLS" in Java as in C++,
     //so let's make our own to approximate it with "\n"
     public static void ClearScreen(int x)   
     { 
           for(int z = 0; z < x; z++)
           {
                 System.out.println("\n");
           }
     }       
   
//-----------------------------------------------------------------------------------------       
     //Uses new Random object declared up top in Globals
     public static int GenerateRandomNumber(int x)  { return RAND.nextInt(x) + 1; }
             
//-----------------------------------------------------------------------------------------  
     void InitializeGlobals()
     {
          System.out.print(
          "\t*********  Hills of Darkness for Java 2.0 - 2006 C. Germany *********\n\n");
          W1GiantAlive = true;
          E1DragonAlive = true;
          S2MotleyCrewAlive = true;
          FirstTimeInShamanHut = true;
          CENTERFirstTime = true;
          UNDERDragonPairAlive = true;
	    FoundHP_West2 = false;
          FoundHP_Shaman = false;
     }
     
//-----------------------------------------------------------------------------------------------

     void Introduction()
     {
          ClearScreen(5); 
          System.out.print("\n\n\t\t\t   Hills of Darkness for Java 2.0\n\n\n");
   
          System.out.print(
          "\tYou awake from what appears to be a disturbing dream, knowing\n"
          + "\tneither where you've been nor how you got where you are now.\n"
          + "\tYou slowly rise to your feet, bewildered and almost oblivious\n"
          + "\tto the throbbing ache pulsating between your ringing ears.\n\n"
          + "\tYou find  yourself standing on a flowing grassy knoll amidst\n"
          + "\tthe dark green hills of medieval Scotland. In the skies above,\n"
          + "\tdark gray clouds are passing in billowing random patterns. It\n"
          + "\tappears a storm is approaching from the east. A few black ravens\n"
          + "\tfly over your head towards some unknown destination, a familiar\n"
          + "\tcaw, their cries echoing softly against the creeping shadows.");
        
          System.out.print("\n\n\n\n\n\n\t");
        
          PAUSE();
          ClearScreen(5);           
     }
     
//-----------------------------------------------------------------------------------------------

     int CENTER(Character CurrentPlayer)
     {
         int location = TheGame.CENTER1;
         char WhatToDo = '#';
   
         if(CENTERFirstTime)
         {    
             System.out.print("\n\n\n"
             + "\t" + CurrentPlayer.getName() 
             + ", confused, you try to get your bearings.\n\n"
             + "\tYou see nothing but large stone tablets and columns with\n"
             + "\twhat appear to be odd and archaic symbols engraved upon them.\n\n");
            
             CENTERFirstTime = false;         
         }  
         else
         {
             System.out.print("\n\n\n"
             + "\tYou return to the location where you first mysteriously appeared\n"
             + "\tin this strange medieval world. You notice that the large stone\n"
             + "\ttablets and columns have arranged themselves into arch and hinged\n"
             + "\tgates. The symbols are constantly changing, disappearing and re-\n"
             + "\tappearing at random intervals across the surface of the tablets.\n\n");
         }       
             System.out.print("\tYou see that you can move to the north, south, east or "
             + "west.\n\tTo the north, you see the ruins of an ancient castle spread\n"
             + "\tout across the horizon. To the east, you see the lapping waves\n"
             + "\tof the ocean against a sandy shore. To the south, you see a\n"
             + "\tsmall village with gray cobblestone houses and smoldering\n"
             + "\tchimneys. To the west, you see an abandoned farm house.\n");
            
         while( WhatToDo != 'n' && 
                WhatToDo != 's' && 
                WhatToDo != 'e' && 
                WhatToDo != 'w' &&
                WhatToDo != 'o' )
         {
                System.out.print(
                "\n\n\tWhere will you go (n, s, e, w)?  Or will you (t)ry the gates?\n"
                + "\tOther: (o)ptions  (i)nventory  (d)isplay stats  (h)ealing potion  ");
           
                WhatToDo = CIN(); 
           
                switch(WhatToDo)
                {
                  case 'n' : location = TheGame.N1; break;
                  case 's' : location = TheGame.S1; break;
                  case 'e' : location = TheGame.E1; break;
                  case 'w' : location = TheGame.W1; break;
                  case 'o' : location = Options(CurrentPlayer, TheGame.CENTER1); break;
                  case 't' : if(!CENTERFirstTime)
                        { location = TheGame.GATE; WhatToDo = 'o'; break; }
                        else { System.out.print("\tThat was an invalid choice."); 
                               break; }
                  case 'i' : CurrentPlayer.Inventory(); break;
                  case '~' : CurrentPlayer.Cheat(); break;
                  case '!' : CurrentPlayer.InitializeInventory(); break;
                  case 'd' : CurrentPlayer.DisplayStats(); break;
                  case 'h' : CurrentPlayer.UseHealingPotion(); break;
                  default : System.out.print("\tThat was an invalid choice."); 
                            break;              
           }
        }
             
        ClearScreen(5);
        return location;     
     }

//-----------------------------------------------------------------
     
     int NORTH1(Character CurrentPlayer)
     {
         int location = TheGame.N1;
         char WhatToDo = '#';

         System.out.print(
         "\n\n\tYou find yourself amidst the ruins of an ancient castle...\n\n\n");

         System.out.print(
         "\tFurther to the north, you see the delapidated entrance to the\n"
         + "\tabandoned castle. It is adjoined by crumbling towers, one at\n"
         + "\teach corner of the foundation. The entrance to the castle is a\n"
         + "\tfrail wooden door, looking as though it had been abandoned for\n"
         + "\tover a hundred years. It probably would not be too difficult to\n"
         + "\tforce the door open...\n\n\n"
         + "\tAt this point, you may explore the castle ruins, or go back to\n"
         + "\tthe SOUTH. You are surrounded by impassible castle walls to\n"
         + "\tthe east and the west.\n\n");
     
         while(WhatToDo != 's' && WhatToDo != 'o' && WhatToDo !='n')
         {                
               System.out.print(
               "\n\n\tWhere will you go (n,s,e,w)?\n\tOther: (o)ptions  "
                + "(i)nventory  (d)isplay stats  (h)ealing potion   ");
           
               WhatToDo = CIN(); 
                        
               switch(WhatToDo)
               {
                   case 's' : location = TheGame.CENTER1; break;
                   case 'o' : location = Options(CurrentPlayer, TheGame.N1); 
                              break;
                   case 'n' : location = TheGame.N2; break;
                   case 'e' : System.out.print(
                              "\tYou fail to scale the east wall.\n"); 
                              break;
                   case 'w' : System.out.print(
                              "\tYou press against hard, cold stone.\n");
                              if(!CurrentPlayer.getChainMail())
                              {
                                 System.out.print(
                                 "\tYou find a suit of chain mail!\n");
                                 CurrentPlayer.setChainMail(true);
                                 CurrentPlayer.Inventory();                     
                              }
                              else 
                              { 
                                 System.out.print(
                                 "\tYou already have the chain mail!\n"); 
                              } 
                              break;
                   case 'i' : CurrentPlayer.Inventory(); break;
                   case 'd' : CurrentPlayer.DisplayStats(); break;
                   case 'h' : CurrentPlayer.UseHealingPotion(); break;           
                   default : System.out.print("\tThat was an invalid choice.\n"); 
                             break;              
               }//close switch
         }//close while loop
   
         ClearScreen(5); 
         return location;      
     }//close NORTH1 functions

//-----------------------------------------------------------------

     int SOUTH1(Character CurrentPlayer)
     {
         int location = TheGame.S1;
         char WhatToDo = '#';

         System.out.print(
         "\n\n\tYou stumble into the gates of a rustic village. You see what\n"
         + "\tappears to be a tavern to the north. Further south, you see a winding\n"
         + "\tdirt road that meanders towards the horizon. All around you are\n"
         + "\tpeasants buying and selling wares in an open market place. Near\n"
         + "\tthe center of the village several children are playing, and in the\n\t"
         + "midst of them sits an elderly woman, looking very wise and thoughtful.\n\n");

         System.out.print(
         "\tAt this point, you may only go back to the NORTH or further SOUTH.\n"
         + "\tif you so desire. You are surrounded by what seems impassible\n"
         + "\tterrain to the east and the west and several cottages. Towards the\n"
         + "\tcenter of the villiage, you notice a small though nicely maintained\n"
         + "\tShaman's lodge with smoke billowing from its roof.");
     
        while(WhatToDo != 'n' && WhatToDo != 's' && WhatToDo != 'o')
        {                
            System.out.print("\n\n\tChoices: (n,e,s,w)  (g)o into the Shaman's Hut\n"
            + "\tOther: (o)ptions  (i)nventory  (d)isplay stats  (h)ealing potion   ");
           
            WhatToDo = CIN(); 
           
            switch(WhatToDo)
            {
               case 'n' : location = TheGame.CENTER1; break;
               case 'o' : location = Options(CurrentPlayer, TheGame.S1); break;
               case 's' : location = TheGame.S2; break;
               case 'e' : System.out.print(
                          "\tYou have no right to enter someone else's dwelling!\n"); 
                          break;
               case 'w' : if(CurrentPlayer.getSword() == false)
                          {  System.out.print("\nBonus!!!\n\n");
                             System.out.print(
                             "\tYou can not manage to ascend the gate in front of you.\n"
                             + "\tbut you do find a broad sword at the base of the wall!");
                             CurrentPlayer.setSword(true);
                              CurrentPlayer.Inventory();
                          }
                        else {System.out.print("\tYou already took the sword!"); }       
                        break;
               case 'g' : location = TheGame.SHAMAN; WhatToDo = 'o'; break;           
               case 'i' : CurrentPlayer.Inventory(); break;
               case 'd' : CurrentPlayer.DisplayStats(); break;                            
               case 'h' : CurrentPlayer.UseHealingPotion(); break;
               default : System.out.print("\tThat was an invalid choice.\n"); break;  
            }//close switch
        }//close while loop
        
        ClearScreen(5); 
        return location;
        
     }//close SOUTH1() function

//-----------------------------------------------------------------

     int EAST1(Character CurrentPlayer)
     {
         int location = TheGame.E1;
         char WhatToDo = '#';

         System.out.print(
         "\n\n\tYou arrive at a sandy shore where green-blue translucent.\n"
         + "\twaves are crashing against rocky outcroppings. To the north,\n");
     
         if(E1DragonAlive)
         {     
            System.out.print(
            "\ta magnificent red dragon folds its wings, smoke billowing\n"
            + "\tfrom its nostrils.");
         }
  
         else
         {
           System.out.print(
           "\ta slain dragon is being devoured by ravens..."); }       
     
           System.out.print(
           "\n\n\n\tAt this point, you may only go back to the WEST. You are\n"
           + "\tsurrounded by turbulent water and razor sharp rocks to the\n"
           + "\teast and the south.\n\n");
     
           while(WhatToDo != 'w' && WhatToDo != 'e' && WhatToDo != 'o')
           {                
             System.out.print("\n\n\tWhere will you go (n,s,e,w)?\n"
             + "\tOther: (o)ptions  (i)nventory  (d)isplay stats  (h)ealing potion   ");
           
           WhatToDo = CIN(); 
           
             switch(WhatToDo)
             {
                 case 'w' : location = TheGame.CENTER1; break;
                 case 'o' : location = Options(CurrentPlayer, TheGame.E1); break;
                 case 'n' : if(E1DragonAlive)
                            {  System.out.print(
                               "\n\n\tYou creep towards the Dragon. Startled," 
                               + " it climbs into the sky\n\tto defend itself!\n");
                            Dragon Prometheus = new Dragon(); 
                            location = Combat(CurrentPlayer, Prometheus, TheGame.E1);
                            E1DragonAlive = false;
                            //break out of while true, re-invoke EAST1 to display text
                            WhatToDo = 'o'; 
                            break;
                            }
                            else  
                            { 
                               System.out.print(
                               "\tYou see a noble red dragon, tragically and"
                               + " yet recently slain...\n"); 
                               break;   
                            }
                 case 'e' : System.out.print(
                            "\tYou jump into the water. It's freezing. You catch a cold.\n"); 
                            location = TheGame.E2; break;
                 case 's' : System.out.print(
                            "\n\tYou step on a jellyfish and it stings you with"
                             + " its tentacles!\n");
                            if(CurrentPlayer.getHit() > 1)
                            { 
                               CurrentPlayer.setHit((CurrentPlayer.getHit() - 1));
                               CurrentPlayer.DisplayStats();
                            }
                            else 
                            {     
                               CurrentPlayer.setHit(0);
                               System.out.print("\tHow pathetic! Slain by a jellyfish!");
                               TheGame.Continue = false;
                               location = TheGame.QUIT;
                               System.out.print("\n\n\t"); 
                               PAUSE();
                            }    
                            break;
                 case 'i' : CurrentPlayer.Inventory(); break;
                 case 'd' : CurrentPlayer.DisplayStats(); break;               
                 case 'h' : CurrentPlayer.UseHealingPotion(); break;
                 default : System.out.print("\tThat was an invalid choice.\n"); break; 
           }//close switch
        }//close while loop
         
        ClearScreen(5); 
        return location;
        
     }//close EAST1() function

//-----------------------------------------------------------------

     int WEST1(Character CurrentPlayer)
     { 
         int location = TheGame.W1;
         char WhatToDo = '#'; 

         System.out.print(
         "\n\n\tYou arrive at an abandoned farm house. You see a picket fence,\n"
         + "\ta rustic delapidated barn, and a decaying hovel that used to be \n"
         + "\tsomeone's residence. There are chickens walking around the.\n"
         + "\tpremesis. To the south, you see ");
       
         if(W1GiantAlive)
         {     
              System.out.print("a Giant wearing old, brown\n"
              + "\tsackcloth. He is taunting you with offensive "
              + "gestures and lewd \n\tcomments. You really don't want to "
              + "tangle with a giant, do you?");
         }
         else
         {    System.out.print("barbed wire, blood, sackcloth\n\tand carnage..."); }
       
              System.out.print("\n\n\n");                   
              System.out.print("\tAt this point, you may go NORTH or back EAST.\n"
              + "\tYou see only thick undergrowth and brush\n"
              + "\tto the west. To the south is that brutish giant.\n"
              + "\twith a foul mouth and a nasty disposition.\n\n\n");
     
              while(WhatToDo != 'e' && WhatToDo != 'w' && WhatToDo != 'o')
              {                
                System.out.print("\n\n\tWhere will you go (n,s,e,w)?\n\tOther:"
                + " (o)ptions  (i)nventory  (d)isplay stats  (h)ealing potion   ");
           
                WhatToDo = CIN(); 
           
                switch(WhatToDo)
                {
                    case 'e' : location = TheGame.CENTER1; break;
                    case 'o' : location = Options(CurrentPlayer, TheGame.W1); break;
                    case 'n' : System.out.print(
                               "\tYou are attacked by a vicious chicken! You can not pass.\n");
                               if(!CurrentPlayer.getDagger())
                               {
                                   System.out.print(
                                   "\tBut lieing on the ground, you find a bronze dagger!");
                                   CurrentPlayer.setDagger(true);
                                   CurrentPlayer.Inventory();
                                }
                               else { System.out.print("\tYou already found the dagger!\n"); } 
                               break;
                    case 's' : if(W1GiantAlive)
                               {  System.out.print(
                                  "\n\n\tYou walk towards the Giant and he charges you!");
                                  Giant Bubba = new Giant(); 
                                  location = Combat(CurrentPlayer, Bubba, TheGame.W1);
                                  //If player survives, make sure they don't fight giant
                                  //again by setting the global boolean to false
                                  W1GiantAlive = false; 
                                  //break out of while true, re-invoke WEST1 to display text
                                  WhatToDo = 'o'; 
                               }
                               else  
                               { 
                                  System.out.print(
                                  "\tYou stumble over the corpse of a dead giant!\n");   
                               }
                               break; 
                    case 'w' : location = TheGame.W2; break;
                    case 'i' : CurrentPlayer.Inventory(); break;
                    case 'd' : CurrentPlayer.DisplayStats(); break;       
                    case 'h' : CurrentPlayer.UseHealingPotion(); break;
                    default :  System.out.print("\tInvalid choice.\n"); break;              
                }//close switch
            }//close while loop
   
            ClearScreen(5); 
            return location;             
     }//close WEST1() function

//-----------------------------------------------------------------

     int NORTH2(Character CurrentPlayer)
     {
         int location = TheGame.N2;
         char WhatToDo = '#'; 
         ClearScreen(5);

         System.out.print(
         "\n\n\n\n\tYou walk inside the castle. It is dark and musty, but\n");

         System.out.print(
         "\tenough daylight is leaking through the cracks in between\n"
         + "\tstones and mortar that you can ascertain your surroundings\n"
         + "\tin a dim, colorless twilight. Against the wall to the east\n"
         + "\tyou see a long wooden box, about the size of a coffin. You\n"
         + "\tcan see a table, chairs and several candle stands to the west\n"
         + "\tof the room. To the north and the south the walls are adorned\n"
         + "\twith dusty, thread-bare tapestries. You notice stairs descending\n"
         + "\tdeep underground to some unknown passage to your right. ");
     
         while(WhatToDo != 's' && WhatToDo != 'o')
         {                
              System.out.print("\n\n\tChoices: (n,s,e,w)   (u)nderground passage\n\tOther:"
              + " (o)ptions  (i)nventory  (d)isplay stats  (h)ealing potion   ");
           
              WhatToDo = CIN();
                        
              switch(WhatToDo)
              {
                  case 's' : location = TheGame.N1; break;
                  case 'o' : location = Options(CurrentPlayer, TheGame.N2); break;
                  case 'n' : System.out.print(
                             "\tThe tapestries look very dry and dusty.\n"); break;
                  case 'e' : System.out.print(
                             "\tYou approach the box and cautiously open it...\n"); 
                             if(!CurrentPlayer.getFullBodyArmor())
                             {
                                System.out.print(
                             "\tYou find a well preserved suit of full body armor!\n");
                                CurrentPlayer.setFullBodyArmor(true);
                                CurrentPlayer.Inventory();                              
                             }
                             else { System.out.print(
                             "\tThe box is empty - you already took the armor.\n"); } 
                             break;
                  case 'w' : System.out.print(
                             "\tYou press against the wall but find nothing.\n"); break;
                  case 'u' : location = TheGame.UNDERGRND; WhatToDo = 'o'; break;
                  case 'i' : CurrentPlayer.Inventory(); break;
                  case 'd' : CurrentPlayer.DisplayStats(); break;
                  case 'h' : CurrentPlayer.UseHealingPotion(); break;           
                  default : System.out.print("\tThat was an invalid choice.\n"); break;
           }//close switch
        }//close while loop
         
        ClearScreen(5); 
        return location;      
}//close NORTH2() function

//-----------------------------------------------------------------

     int SOUTH2(Character CurrentPlayer)
     {
         int location = TheGame.S2;
         char WhatToDo = '#';
         char crazy;

         System.out.print(
         "\n\n\tYou wander through the village further to the south.\n");

         System.out.print(
         "\tYou notice several of the villagers are staring at you\n"
         + "\tstrangely as you walk by. You come to the southern gate\n"
         + "\tthat guards the entrance to the village and pass through its\n"
         + "\topen doors. You follow a meandering dirt path towards the\n"
         + "\tedge of a dense hardwood forest. As you walk along the road,\n"
         + "\tyou pass several merchants hauling their wares by horse and\n"
         + "\tcart. Continuing south, you see a group of three giants \n"
         + "\tresting with their backs against the trees.\n\n");
     
         while(WhatToDo != 'n' && WhatToDo != 'o')
         {                
                System.out.print("\n\n\tWhere will you go (n,s,e,w)?\n"
                + "\tOther: (o)ptions  (i)nventory  (d)isplay stats  (h)ealing potion   ");
           
                WhatToDo = CIN(); 
                        
                switch(WhatToDo)
                {
                    case 's' : if(S2MotleyCrewAlive)
                               { System.out.print(
                                 "\tYou're either really brave or really stupid.\n");
                                 System.out.print(
                                 "\tAre you sure you want to fight 3 giants "
                                 + "at the same time? ");
                               
                               crazy = CIN(); 
                               
                               if(crazy == 'y')
                               {
                                  Giant[] MotleyCrew = new Giant[3]; 
                                  System.out.print(
                                  "\tAll three giants charge you at once!\n");
                                  for(int x = 0; x < 3; x++)
                                  {
                                     MotleyCrew[x] = new Giant();
                                     location = Combat(
                                     CurrentPlayer, MotleyCrew[x], TheGame.S2);     
                                  }
                                  
                               S2MotleyCrewAlive = false;
                          }   
                          else { System.out.print(
                                 "\tIntelligently, you decide to walk away...\n"); }   
                        }
                        else { System.out.print("\tYou see three dead giants.\n"); }
                        break;
             case 'o' : location = Options(CurrentPlayer, TheGame.S2); break;
             case 'n' : location = TheGame.S1; break;
             case 'e' : System.out.print(
                        "\tYou see a lake, covered with lily pads and algae.\n"); break;
             case 'w' : System.out.print(
                        "\tYou see cat tails and dragon flies skimming across"
                        + " the water.\n"); break;
             case 'i' : CurrentPlayer.Inventory(); break;
             case 'd' : CurrentPlayer.DisplayStats(); break;
             case 'h' : CurrentPlayer.UseHealingPotion(); break;           
             default : System.out.print("\tThat was an invalid choice.\n"); break; 
           }//close switch
        }//close while loop
   ClearScreen(5); 
   return location;     
}//close SOUTH2() function

//-----------------------------------------------------------------

     int EAST2(Character CurrentPlayer)
     {
         int location = TheGame.E2;
         char WhatToDo = '#';

         System.out.print(
         "\n\n\tYou swim out to the sand bars hundreds of feet beyond the shore.\n"
         + "\tIn every direction, you see dolphins and sharks swimming around you.\n\n");
     
         while(WhatToDo != 'w' && WhatToDo != 'o')
         {                
              System.out.print("\n\n\tWhere will you go (n,s,e,w)?\n"
              + "\tOther: (o)ptions  (i)nventory  (d)isplay stats  (h)ealing potion   ");
           
              WhatToDo = CIN();
                        
              switch(WhatToDo)
              {
                    case 's' : System.out.print("\n\tYou see dolphins and sharks.\n");
                               if(!CurrentPlayer.getFishKey())
                               {
                                  System.out.print(
                                  "\n\tYou notice something metalic shining in the sand\n"
                                  + "\tbeneath your feet. You dig into the sand and find\n"
                                  + "\ta bronze key with a Fish engraved upon it.");
                                  
                                  CurrentPlayer.setFishKey(true);       
                               }
                               else
                               { System.out.print(
                                 "\n\tHey, this is the same place you found that Fish key!");} 
                               break;
                    case 'o' : location = Options(CurrentPlayer, TheGame.E2); break;
                    case 'n' : System.out.print("\n\tYou see dolphins and sharks.\n"); break;
                    case 'e' : System.out.print("\n\tYou see dolphins and sharks.\n"); break;
                    case 'w' : location = TheGame.E1; break;
                    case 'i' : CurrentPlayer.Inventory(); break;
                    case 'd' : CurrentPlayer.DisplayStats(); break;
                    case 'h' : CurrentPlayer.UseHealingPotion(); break;           
                    default : System.out.print("\n\tThat was an invalid choice.\n"); break;
              }//close switch
        }//close while loop
   
         ClearScreen(5); 
         return location;             
}//close EAST2() function

//-----------------------------------------------------------------

     int WEST2(Character CurrentPlayer)
     {
         int location = TheGame.W2;
         char WhatToDo = '#';

         System.out.print(
         "\n\n\tYou find yourself walking in golden fields of wheat.\n\n");
     
         while(WhatToDo != 'e' && WhatToDo != 'o')
         {                
              System.out.print("\n\n\tWhere will you go (n,s,e,w)?\n"
              + "\tOther: (o)ptions  (i)nventory  (d)isplay stats  (h)ealing potion   ");
           
              WhatToDo = CIN(); 
                        
              switch(WhatToDo)
              {
                  case 's' : System.out.print("\tYou see... WHEAT!\n"); 
                             if(!FoundHP_West2)
                             {
                                 System.out.print(
                                 "\tBuried under a mound among the wheat, you\n"
                                 + "\tfind a healing potion!\n");
                                 CurrentPlayer.setHealingPotion(1);
                                 FoundHP_West2 = true;
                                 CurrentPlayer.Inventory();
                             }
                             else { System.out.print(
                                    "\tYou already found the healing potion!\n"); }
                             break;      
                  case 'o' : location = Options(CurrentPlayer, TheGame.W2); break;
                  case 'n' : if(!CurrentPlayer.getLongBow())
                             {
                                 System.out.print(
                                 "\tYou find a well-stringed long bow and arrows!\n");
                                 CurrentPlayer.setLongBow(true);
                                 CurrentPlayer.Inventory();                              
                             }
                             else { System.out.print(
                                    "\tYou already found the long bow.\n"); } 
                             break;
                  case 'e' : location = TheGame.W1; break;
                  case 'w' : System.out.print(
                             "\tYou see various feed crops planted in rows.\n"); break;
                  case 'i' : CurrentPlayer.Inventory(); break;
                  case 'd' : CurrentPlayer.DisplayStats(); break;
                  case 'h' : CurrentPlayer.UseHealingPotion(); break;           
                  default : System.out.print("\tThat was an invalid choice.\n"); break;
             }//close switch
         }//close while loop
   
             ClearScreen(5); 
             return location;         
     }//close WEST2() function
//-----------------------------------------------------------------

     int SHAMANHUT(Character CurrentPlayer, Shaman WiseWoman)
     {
         int location = TheGame.SHAMAN;
         char WhatToDo = '#';

         if(FirstTimeInShamanHut)
         { 
             System.out.print(
             "\n\n\tYou duck down and enter into the Shaman's hut. Towards the center\n"
             + "\tof the mud dwelling, beneath an overhanging shelf descending from the\n"
             + "\tthatched roof, sits an elderly priestess. Unphased by your presence,\n"
             + "\tshe continues to stare into the flames of a small fire burning within\n"
             + "\ta set of blackened stone rings in the center of the hut. Directly over\n"
             + "\ther head, an opening in the ceiling allows the smoke to escape. She\n" 
             + "\tgazes at you and cackles. \"Not expecting an old temple preistess, \n"
             + "\twere you? Well, in this village, I'm the \"Shaman\".\n\n");
         
             FirstTimeInShamanHut = false;
         }
         else
         { 
              System.out.print(
              "\n\n\n\tYou re-enter the Shaman's hut. She turns her head in a peculiar\n"
              + "\tfashion and remarks, \"Back so soon, traveler?\" She offers you a cup\n"
              + "\tof freshly brewed tea, which you gladly accept to quench your thirst.\n\n");
         
             if(!FoundHP_Shaman)
             {
                  System.out.print(
                  "\tShe opens her medicine bag and begins creating an acrid mixture of\n"
                  + "\therbs. She pours it into a vial and places it in your hand, saying\n"
                  + "\t\"Drink this if you become wounded, my friend. It may restore\n"
                  + "\tyou to a measure of your former health and constitution.\"\n\n\n\n\n");
                           
                  CurrentPlayer.setHealingPotion(1);
	            FoundHP_Shaman = true;
                  System.out.print("\t\t\t"); 
                  PAUSE(); 
	            CurrentPlayer.Inventory();
                  System.out.print("\t\t\t"); 
                  PAUSE(); ClearScreen(5); 
             }
             else 
             { 
                  System.out.print("\tYou feel a sense of debt and gratitiude towards this\n" 
                  + "\tkind old woman, remembering the healing elixir she gave\n"
                  + "\tyou on your last visit.\n\n");
             }     
         }         

         System.out.print("\tAt this point, you may (l)eave the Shaman's hut,\n"
         + "\t(t)alk with her if you so desire, or try to (s)teal\n"
         + "\ther medicine bag and staff for what wonders they may\n"
         + "\tcontain.\n\n");

         while(WhatToDo != 'l' && WhatToDo != 's' && WhatToDo != 'o')
         {                
             System.out.print("\n\n\tYou may: (l)eave  (t)alk  or (s)teal things\n"
             + "\tOther: (o)ptions  (i)nventory  (d)isplay stats  (h)ealing potion   ");
           
             WhatToDo = CIN(); 
           
             switch(WhatToDo)
             {
                 case 'n' : System.out.print("\tYou run into a straw-mud wall.\n"); break;
                 case 'o' : location = Options(CurrentPlayer, TheGame.SHAMAN); break;
                 case 'l' : location = TheGame.S1; break;
                 case 's' : ClearScreen(5);
                            System.out.print(
                            "\n\n\n\n\tYou get the uneasy feeling that you are going\n"
                            + "\tto reap serious bad karma for this unwise action.\n\n"); 
                            
                            try { Thread.sleep(3000); }
                            catch(Exception e) {  }  
                            
                            System.out.print(
                            "\tBellowing thunder cracks and the clouds darken as the deity\n"
                            + "\tof the temple preistess fills with indignation and anger!\n\n");
                            
                            try { Thread.sleep(3000); }
                            catch(Exception e) {  }  
                            
                            System.out.print(
                            "\tIn an instant, lighting from the heavens strikes you\n"
                            + "\tdown!\n\n");
                            
                            try { Thread.sleep(3000); }
                            catch(Exception e) {  } 
                            
                            System.out.print("\tYou go into the afterlife a loser, ashamed\n"
                            + "\tfor the despicable deeds you have done. The warriors\n"
                            + "\twho have gone on before you, the great warriors of\n"
                            + "\treknown and the kings of the past will ridicule you\n"
                            + "\tfor all of eternity for dieing without honor.\n\n");
                            
                            try { Thread.sleep(5000); }
                            catch(Exception e) {  }  
                            
                            System.out.print("\n\n\n\t\t\t"); PAUSE();
                            CurrentPlayer.setHit(0); CurrentPlayer.DisplayStats();
                            location = TheGame.QUIT; WhatToDo = 'o';
                            break;
                 case 't' : System.out.print("\tYou seek audience with the preistess.\n"); 
                            WiseWoman.Talk(); break;
                 case 'i' : CurrentPlayer.Inventory(); break;
                 case 'd' : CurrentPlayer.DisplayStats(); break;                            
                 case 'h' : CurrentPlayer.UseHealingPotion(); break;
                 default : System.out.print("\tThat was an invalid choice.\n"); break;              
           }//close switch
        }//close while loop
        
        ClearScreen(5); 
        return location;            
     }//close SHAMAN() function

//-----------------------------------------------------------------

     int GateWay(Character CurrentPlayer)
     {
         int location = TheGame.GATE;
     
         if(CurrentPlayer.getFishKey())
         {
             System.out.print(
             "\n\n\tFumbling around the gate, you find a slot to insert the\n\tFish "
             + "key. The tablets and columns begin to rumble and shake.\n\tLarge"
             + " stones rise, levitating off the ground, rearranging themselves.");
         }
         else
         {
             System.out.print(
             "\n\n\tYou look around, trying every nook and crevice, but can not\n\t"
             + "seem to find the means to open the gate, nor alter anything else\n\n"
             + "\taround it. You see what appears to be a key hole to one side.\n\n");
           
             location = TheGame.CENTER1;       
         }
  
         if(CurrentPlayer.getFishKey() && CurrentPlayer.getScore() < 50)
         {
             System.out.print(
             "\n\n\tIt appears that, although you have the key, you lack enough\n"
             + "\texperience with the ways of this world to cause the gate to"
             + "\n\tfunction in any useful manner.\n\n\n");
           
             location = TheGame.CENTER1;                                  
         }
  
         if(CurrentPlayer.getFishKey() && CurrentPlayer.getScore() >= 50)
         {
             System.out.print(
             "\n\n\tWith the experience you have gained since entering this\n"
             + "\tstrange world, you manage to figure out the correct sequence of\n"
             + "\tactions to perform while turning the Fish key within the gate.\n"
             + "\tYou hear a loud hiss followed by a dull hum as cascading beams of\n"
             + "\tlight blind you from the opening dimensional portal.\n\n");
           
             System.out.print(
             "\tYou feel as though you have won a series of battles in a\n"
             + "\tlong campaign, but that the war is far from being over.\n\n"
             + "\tHaving made several new friends and vanquished many foes as\n"
             + "\ta soujourner in a strange land, you step through the gates,\n"
             + "\tuncertain yet hopeful that this may bring you one step closer\n"
             + "\tto home...");
      
             System.out.print("\n\t"); PAUSE();  
             System.out.print("\tYou win this campaign and end the game with:\n\n");     
             CurrentPlayer.DisplayStats(); CurrentPlayer.Inventory();
             System.out.print("\n\tCombat Experience Score: " + 
             CurrentPlayer.getScore() + ".\n\n\n");
             location = TheGame.QUIT;                                  
         }//close if
         
         System.out.print("\n\t"); 
         PAUSE(); 
         ClearScreen(5);
         return location;
     }//close GateWay() fucntion

//-----------------------------------------------------------------

     int UnderGroundPassage(Character CurrentPlayer)
     {
         int location = TheGame.UNDERGRND;
         String choice = "";
         char nutz = '#';
  
         System.out.print("\n\n\n\n\n\n\tYou descend into the darkness underground...\n");
  
         if(UNDERDragonPairAlive)
         {
             System.out.print(
             "\tPeeking around a corner, you see a family of red dragons\n"
             + "\tbreathing fire! Think about whether you want to fight or flee.\n"
             + "\tAre you sure you want to fight 5 dragons at the same time? (y,n)");
    
             nutz = CIN(); 
    
             if(nutz == 'y')
             {
                 Dragon[] DragonFamily = new Dragon[5];
                 for(int x = 0; x < 5; x++)
                 {
                     DragonFamily[x] = new Dragon();
                     location = Combat(CurrentPlayer, DragonFamily[x], TheGame.UNDERGRND);
                 }
                 UNDERDragonPairAlive = false;
             }   
             else 
             { 
                 System.out.print(
                 "\tIntelligently, you decide to run back up the stairs...\n");
                 location = TheGame.N2; 
             }   
         }
         else 
         { 
               System.out.print(
               "\tYou see a family of dead red dragons and the carnal aftermath.\n"
               + "\tof your last great battle with these fierce and worthy opponents.\n");
               location = TheGame.N2; 
         }
         
         System.out.print("\n\n\n\t"); PAUSE(); ClearScreen(5);
         return location;
}


//----------------------------------------------------------------------

     int Combat(Character p, Dragon m, int CurrentLocation)
     {
         String choice = ""; char WhatToDo = '#';
         
         p.setUseDagger(false); p.setUseSword(false); p.setUseLongBow(false);    
         System.out.print("\n\tMortal Combat!!!\n");
  
         while(WhatToDo != 'd' && WhatToDo != 's' && WhatToDo != 'l' && WhatToDo != 'h')
         {
               System.out.print("\tYou currently have:\n");
               p.Inventory();
               System.out.print("\tWhat weapon will you choose to wage this battle with?\n"
               + "\t(d)agger   (s)word   (l)ongbow   (h)and to hand combat   ");
      
               WhatToDo = CIN(); 
  
               switch(WhatToDo)
               {
                     case 'd' : if(p.getDagger()) { p.setUseDagger(true); }
                                else 
                                {
                                  System.out.print(
                                  "\n\tYou don't have the dagger!\n\n"); 
                                  WhatToDo = 'z';
                                } 
                                break;
                     case 's' : if(p.getSword()) { p.setUseSword(true); }
                                else 
                                { 
                                       System.out.print(
                                       "\n\tYou don't have the sword!\n\n"); 
                                       WhatToDo = 'z';
                                } 
                                break;
                     case 'l' : if(p.getLongBow()) { p.setUseLongBow(true); }
                                else 
                                { 
                                   System.out.print(
                                   "\n\tYou don't have the long bow!\n\n"); 
                                   WhatToDo = 'z';
                                } 
                                break;
                     case 'h' : System.out.print("\n\tHand to hand it is...\n\n");
                                p.setUseDagger(false); p.setUseSword(false); 
                                p.setUseLongBow(false); break;
                     default : System.out.print("\tThat was an invalid response.\n"); 
                               break;
               } //close switch
         } //close while true loop
  
  
         while(p.getHit() > 0 && m.getHit() > 0)
         {
            if(p.getHit() > 0) { p.Attack(m); }
            if(m.getHit() > 0) { m.Attack(p); }  
         }  
  
         if(p.getHit() <= 0)
         { 
               System.out.print("\tYou die, most tragically!\n\n");
               System.out.print("\tThe Dragon wins the battle, having " + m.getHit() 
               + " hitpoints left.\n");
               TheGame.Continue = false;
               System.out.print("\t"); PAUSE();
               return TheGame.QUIT;    
         }
         else
         { 
                System.out.print("\n\n\tYou vanquish your foe most valiantly!\n");

                System.out.print(
                "\tThe Dragon died, now having " + m.getHit() + " hitpoints.\n");

                System.out.print(
                "\t" + p.getName() + " has " + p.getHit() + " hitpoints left.\n\n");

                System.out.print(
                "\tAdd 1 to your attack and 1 to your defense as a result of\n"
                + "\tcombat experience acquired defeating this foe.\n");

                p.setScore((p.getScore() + 10)); 
                System.out.print(
                "\n\t" + p.getName() + "'s Current Score: " + p.getScore() + ".\n");
                p.setAttack((p.getAttack() + 1)); p.setDefense((p.getDefense() + 1)); 
                p.DisplayStats();             
                System.out.print("\n\n\t"); PAUSE(); ClearScreen(5);

                return CurrentLocation;
         }
     }//close Overloaded Combat() function for Dragons

//-----------------------------------------------------------------
     int Combat(Character p, Giant m, int CurrentLocation)
     {
         String choice = ""; char WhatToDo = '#';
         
         p.setUseDagger(false); p.setUseSword(false); p.setUseLongBow(false);    
         System.out.print("\n\tMortal Combat!!!\n");
  
         while(WhatToDo != 'd' && WhatToDo != 's' && WhatToDo != 'l' && WhatToDo != 'h')
         {
               System.out.print("\tYou currently have:\n");
               p.Inventory();
               System.out.print(
               "\tWhat weapon will you choose to wage this battle with?\n"
               + "\t(d)agger   (s)word   (l)ongbow   (h)and to hand combat   ");
      
               WhatToDo = CIN(); 
  
               switch(WhatToDo)
               {
                     case 'd' : if(p.getDagger()) { p.setUseDagger(true); }
                                else 
                                { 
                                System.out.print("\n\tYou don't have the dagger!\n\n"); 
                                WhatToDo = 'z';
                                } 
                                break;
                     case 's' : if(p.getSword()) { p.setUseSword(true); }
                                else 
                                { 
                                System.out.print("\n\tYou don't have the sword!\n\n"); 
                                WhatToDo = 'z';
                                } 
                                break;
                     case 'l' : if(p.getLongBow()) { p.setUseLongBow(true); }
                     else 
                                { 
                                System.out.print("\n\tYou don't have the long bow!\n\n"); 
                                WhatToDo = 'z';
                                } 
                     break;
                     case 'h' : System.out.print("\n\tHand to hand it is...\n\n");
                                p.setUseDagger(false); p.setUseSword(false); 
                                p.setUseLongBow(false); break;
                     default : System.out.print("\tThat was an invalid response.\n"); break;
               } //close switch
         } //close while true loop
  
  
         while(p.getHit() > 0 && m.getHit() > 0)
         {
            if(p.getHit() > 0) { p.Attack(m); }
            if(m.getHit() > 0) { m.Attack(p); }  
         }  
  
         if(p.getHit() <= 0)
         { 
               System.out.print("\tYou die, most tragically!\n\n");
               System.out.print("\tThe Giant wins the battle, having " + m.getHit() 
               + " hitpoints left.\n");
               TheGame.Continue = false;
               System.out.print("\t"); PAUSE();
               return TheGame.QUIT;    
         }
         else
         { 
                System.out.print("\n\n\tYou vanquish your foe most valiantly!\n");
                System.out.print(
                "\tThe Giant died, now having " + m.getHit() + " hitpoints.\n");

                System.out.print(
                "\t" + p.getName() + " has " + p.getHit() + " hitpoints left.\n\n");

                System.out.print(
                "\tAdd 1 to your attack and 1 to your defense as a result of\n"
                + "\tcombat experience acquired defeating this foe.\n");

                p.setScore((p.getScore() + 10)); 
                System.out.print(
                "\n\t" + p.getName() + "'s Current Score: " + p.getScore() + ".\n");

                p.setAttack((p.getAttack() + 1)); p.setDefense((p.getDefense() + 1)); 
                p.DisplayStats();             
                System.out.print("\n\n\t"); PAUSE(); ClearScreen(5);

                return CurrentLocation;
         }
     }//close Overloaded Combat() function for Giants
//-----------------------------------------------------------------

public int Options(Character CurrentPlayer, int location)
{
  String choice = ""; char WhatToDo = '#'; boolean successful = false; 
  ClearScreen(5); System.out.print("\n\n\n\n");

  while(WhatToDo != 's' && WhatToDo != 'l' && WhatToDo != 'h' && WhatToDo != 'q')
  {  
      System.out.print("\n\n\t\t\t********* OPTIONS *********\n"
            + "\t\t\t*                         *\n"
            + "\t\t\t*      (s)ave game        *\n"
            + "\t\t\t*      (l)oad game        *\n"
            + "\t\t\t*      (h)igh scores      *\n"
            + "\t\t\t*      (q)uit             *\n"
            + "\t\t\t*                         *\n"
            + "\t\t\t***************************\n\n\t\t\t");
        
      WhatToDo = CIN(); 
  
      switch(WhatToDo)
      {

         case 'l' : successful = LoadCharacter(CurrentPlayer);
                    if(successful)
                    { 
                       location = CurrentPlayer.getLocation(); 
                       System.out.print("\n\tYour character was loaded!\n\n\t");
                    }
                    else 
                    { 
                        System.out.print("\n\tYou character could not be loaded!\n\n\t"); 
                    }
                    PAUSE(); break;

         case 's' : CurrentPlayer.setLocation(location);
                    successful = SaveCharacter(CurrentPlayer);
                    if(successful)
                    {  
                        System.out.print("\n\tYour character was saved!\n\n\t");
                    }
                    else 
                    { 
                       System.out.print("\n\tYou character could not be saved!\n\n\t"); 
                    }
                    PAUSE(); break; 
         case 'h' : successful = DisplayHighScores();
                    if(successful) { break; }
                    else { System.out.print("\n\tThere are no high scores to load!\n\n\t"); }
                    PAUSE();                     
                    break;
         case 'q' : location = TheGame.QUIT; break;
         default : System.out.print("\n\t\t\tInvalid choice.\n"); break;
      } //close switch
  } //close while loop

 return location;   
}//close Options functions
//-------------------------------------------------------------------------

     // Function - SaveHighScores
     boolean SaveHighScores(Character CurrentPlayer) 
     {
          boolean successful = false;
          
          try 
          {
              File scores = new File("highscores.txt");
              FileOutputStream highscores;
              
              if (scores.exists())
		{
		    System.out.println(
                  "\thighscores.txt already exists -- appending new score to it.");
                  //"true" = append, 2 arguments
		    highscores = new FileOutputStream(scores, true); 
		}	         
		else
		{
		    System.out.println(
                  "\thighscores.txt does not exist -- I'll create it!");
		    highscores = new FileOutputStream(scores); //no append, 1 argument
		}                
              
              PrintStream hiscores = new PrintStream(highscores);
              hiscores.println(CurrentPlayer.getName());
              hiscores.println(CurrentPlayer.getScore());  
              hiscores.close(); highscores.close();
              successful = true;  
          }
          catch (IOException e) 
          { 
              System.out.print("ERROR saving scores."); 
              successful = false; 
          }
   
          return successful;
     }  //close SaveHighScores() function

//-------------------------------------------------------------------------
  
     // Function - DisplayHighScores
     boolean DisplayHighScores() 
     {
           ClearScreen(5); 
             System.out.print("\n\n\n"); 
             boolean successful = false; 
        
             String HoldMeStringName = ""; 
             String HoldMeStringInteger = "";
             int HoldMeInteger = 0;
             int z = 0; 
             int x = 0;

             try 
             {        
                 File scores = new File("highscores.txt");
                 FileInputStream highscores = new FileInputStream(scores);
                 InputStreamReader hiscores = new InputStreamReader(highscores);
                 BufferedReader SCORES = new BufferedReader(hiscores);

                 while(HoldMeStringName != null)
                 {
                     HoldMeStringName = SCORES.readLine();
                     HoldMeStringInteger = SCORES.readLine();
                     x++;  //add one for every 2 lines (name and score pair) 
                 }
                   
                 x = x - 1; //Subtract 1 for the offset (one too many)
                   
                 String[] NAMES = new String[x];
                 int[] TheSCORES = new int[x];
                   
                 //Reset all the stream and file objects, move pointer back to beginning 
                 scores = new File("highscores.txt");
                 highscores = new FileInputStream(scores);
                 hiscores = new InputStreamReader(highscores);
                 SCORES = new BufferedReader(hiscores);
                   
                 //Put each line into 
                 for(z = 0; z < x; z++)
                 {
                     NAMES[z] = SCORES.readLine();
                     HoldMeStringInteger = SCORES.readLine();
                     TheSCORES[z] = Integer.parseInt(HoldMeStringInteger);
                   
                 }
                   
                   highscores.close();
                   
                   System.out.println("\t\tTotal of " + x + 
                   " score records present in file.\n");
      
                   for(int q = 0; q < x; q++)
                   {
                       for(int r = 1; r < x; r++)
                       {
                           if(TheSCORES[r] > TheSCORES[r - 1])
                           {
                              HoldMeInteger = TheSCORES[r]; 
                              HoldMeStringName = NAMES[r];
                              TheSCORES[r] = TheSCORES[r - 1]; 
                              NAMES[r] = NAMES[r - 1];
                              TheSCORES[r - 1] = HoldMeInteger; 
                              NAMES[r - 1] = HoldMeStringName;           
                           }
                       }
                   } 
      
                   System.out.print(
                   "\t\t***************** High Scores *****************\n\n");
                   System.out.print(
                   "\t\t-----------------------------------------------\n"); 

	             for(z = 0; z < x; z++)
                   {
                      System.out.print("\t\t" + (z+1) + ". Name: " + NAMES[z] + 
                                       "  Score: " + TheSCORES[z] + "\n");
                      System.out.print(
                   "\t\t-----------------------------------------------\n");    
                   }

	             System.out.print(
                   "\n\t\t***********************************************\n");
                   System.out.print("\n\n\t\t\t"); 
                   PAUSE();
                   successful = true;
             }
             
             catch(IOException e)
             {
                 System.out.print(
                 "\tUnable to find \"highscores.txt\" or read scores.\n");
                 successful = false;
             }
       
             //Declared 2 Parallel Arrays where # elements = # lines.
             //Above is a Bubble Sort for High Scores. Go through each Name
             //and Score set and swap to arrange in descending order
             return successful;
      
     }//close DisplayHighScores() Function

//-------------------------------------------------------------------------
     
     boolean SaveCharacter(Character CurrentPlayer) 
     {                     
             boolean successful;
             String CharacterName = "";
             String passwd = "";
   
             System.out.print("\n\tEnter the file name to save as: ");
             
             try { CharacterName = cin.readLine(); }               
             catch (IOException e) { System.err.println("Error."); }
             
             CharacterName = CharacterName + ".gam";
 
             System.out.print("\n\tEnter a password:   ");
             
             try { passwd = cin.readLine(); }               
             catch (IOException e) { System.err.println("Error."); }
   
             try 
             {
                 File PlayerFile = new File(CharacterName);
                 FileOutputStream PlayerObject;
                 PlayerObject = new FileOutputStream(PlayerFile);   
                 PrintStream WritePlayer = new PrintStream(PlayerObject);
                 
                 //Simple serialization of Character class in plain ASCII 
                 WritePlayer.println(passwd);                        
                 WritePlayer.println(CurrentPlayer.getName());
                 WritePlayer.println(CurrentPlayer.getHit());
                 WritePlayer.println(CurrentPlayer.getAttack()); 
                 WritePlayer.println(CurrentPlayer.getDefense());                        
                 WritePlayer.println(CurrentPlayer.getLevel());
                 WritePlayer.println(CurrentPlayer.getScore());
                 WritePlayer.println(CurrentPlayer.getLocation());         

                 WritePlayer.println(CurrentPlayer.getDagger());
                 WritePlayer.println(CurrentPlayer.getSword());
                 WritePlayer.println(CurrentPlayer.getLongBow()); 
                 WritePlayer.println(CurrentPlayer.getChainMail());               
                 WritePlayer.println(CurrentPlayer.getFullBodyArmor());
                 WritePlayer.println(CurrentPlayer.getHealingPotion());
                 WritePlayer.println(CurrentPlayer.getFishKey());
        
                 WritePlayer.println(W1GiantAlive);
                 WritePlayer.println(E1DragonAlive); 
                 WritePlayer.println(S2MotleyCrewAlive);               
                 WritePlayer.println(FirstTimeInShamanHut);
                 WritePlayer.println(CENTERFirstTime);
                 WritePlayer.println(UNDERDragonPairAlive);
                 WritePlayer.println(FoundHP_West2);
                 WritePlayer.println(FoundHP_Shaman);
                 
                 WritePlayer.close(); PlayerObject.close();
                 successful = true;  
          }
          
          catch (IOException e) 
          { 
              System.out.print("ERROR saving character file."); 
              successful = false; 
          }
                
          return successful;
     } 

//-------------------------------------------------------------------------

     boolean LoadCharacter(Character CurrentPlayer) 
     {
          boolean successful; 
          
          String CharacterName = "";
          String nm = "";
          String passwd = ""; 
          String pass = "";
          
          String hp = ""; 
          String atk = ""; 
          String def = ""; 
          String lvl = ""; 
          String scr = ""; 
          String loc = "";
          
          String dagger = ""; 
          String sword = ""; 
          String bow = ""; 
          String mail = ""; 
          String armor = ""; 
          String healing = ""; 
          String fkey = "";
          
          String giant = ""; 
          String dragon = ""; 
          String motley = ""; 
          String shaman = ""; 
          String center = ""; 
          String under = ""; 
          String HPwest2 = ""; 
          String HPshaman = "";
         
          System.out.print("\n\tEnter the name of the Character to load: "); 
          try { CharacterName = cin.readLine(); }               
          catch (IOException e) { System.err.println("Error."); }
             
          CharacterName = CharacterName + ".gam";
 
          System.out.print("\n\tEnter the password:   ");
          try { passwd = cin.readLine(); }               
          catch (IOException e) { System.err.println("Error."); }
	          
          try 
          {        
              File PlayerFile = new File(CharacterName);
              FileInputStream PlayerObject = new FileInputStream(PlayerFile);
              InputStreamReader ReadPlayer = new InputStreamReader(PlayerObject);
              BufferedReader StreamPlayer = new BufferedReader(ReadPlayer);

              pass = StreamPlayer.readLine();
            
              if(pass.equals(passwd))
              { 
                 //Careful! serialization = you must read in exactly 
                 //the same order as you wrote!
                 nm = StreamPlayer.readLine(); 
                 hp = StreamPlayer.readLine();
                 atk = StreamPlayer.readLine(); 
                 def = StreamPlayer.readLine();              
                 lvl = StreamPlayer.readLine(); 
                 scr = StreamPlayer.readLine();
                 loc = StreamPlayer.readLine(); 

                 dagger = StreamPlayer.readLine();
                 sword = StreamPlayer.readLine(); 
                 bow = StreamPlayer.readLine();              
                 mail = StreamPlayer.readLine(); 
                 armor = StreamPlayer.readLine();
                 healing = StreamPlayer.readLine(); 
                 fkey = StreamPlayer.readLine();

                 giant = StreamPlayer.readLine();    
                 dragon = StreamPlayer.readLine();    
                 motley = StreamPlayer.readLine();                  
                 shaman = StreamPlayer.readLine();   
                 center = StreamPlayer.readLine();   
                 under = StreamPlayer.readLine();    
                 HPwest2 = StreamPlayer.readLine();  
                 HPshaman = StreamPlayer.readLine();              
              
                 CurrentPlayer.setName(nm);  
                 CurrentPlayer.setHit(Integer.parseInt(hp));
                 CurrentPlayer.setAttack(Integer.parseInt(atk)); 
                 CurrentPlayer.setDefense(Integer.parseInt(def));        
                 CurrentPlayer.setLevel(Integer.parseInt(lvl)); 
                 CurrentPlayer.setScore(Integer.parseInt(scr));
                 CurrentPlayer.setLocation(Integer.parseInt(loc));  
                 
                 
                 CurrentPlayer.setDagger(TrueOrFalse(dagger));
                 CurrentPlayer.setSword(TrueOrFalse(sword)); 
                 CurrentPlayer.setLongBow(TrueOrFalse(bow)); 
                 CurrentPlayer.setChainMail(TrueOrFalse(mail)); 
                 CurrentPlayer.setFullBodyArmor(TrueOrFalse(armor));
                 CurrentPlayer.setHealingPotion(Integer.parseInt(healing)); 
                 CurrentPlayer.setFishKey(TrueOrFalse(fkey)); 
                
                 W1GiantAlive = TrueOrFalse(giant);
                 E1DragonAlive = TrueOrFalse(dragon);
                 S2MotleyCrewAlive = TrueOrFalse(motley);
                 FirstTimeInShamanHut = TrueOrFalse(shaman);
                 CENTERFirstTime = TrueOrFalse(center);
                 UNDERDragonPairAlive = TrueOrFalse(under);
                 FoundHP_West2 = TrueOrFalse(HPwest2);
                 FoundHP_Shaman = TrueOrFalse(HPshaman); 

                 ReadPlayer.close(); PlayerObject.close(); 
                 successful = true;
             }
             
             else 
             { 
                  System.out.print("\n\tThat was not the correct password!!!"); 
                  successful = false; 
             }            
          }
          
          catch(IOException e)
          {
              System.out.print("\tUnable to create charactrer file.\n");
              successful = false;
          }

          return successful;
         
     }//close LoadCharacter() function 

//-------------------------------------------------------------------------
     
}//close Events class
