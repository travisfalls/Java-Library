package _99_Choose_Own_Adventure;

//AdventureGame 1.0, Java Version, TheGame class - main(), C. Germany, July 01, 2006
//File 7 of 7. Save as "TheGame.java".
import java.util.*;
import javax.swing.*;
import java.io.*;

public class TheGame
{ 
     //Globals to track various game events
     //This replicates the C++ enumerated constant--
     public static final int QUIT = 0; 
     public static final int SHAMAN = 1; 
     public static final int GATE = 2; 
     public static final int UNDERGRND = 3; 
     public static final int CENTER1 = 4; 
     public static final int N1 = 5; 
     public static final int S1 = 6; 
     public static final int E1 = 7; 
     public static final int W1 = 8; 
     public static final int N2 = 9; 
     public static final int S2 = 10; 
     public static final int E2 = 11; 
     public static final int W2 = 12;
  //---------------------------------------------  
     public static int location;    
     public static boolean Continue;
     public static boolean successful;    
  
     
     public static void main(String[] args)
     {
            Events Game = new Events();
            Continue = true; 
            Game.InitializeGlobals();

            //Create a new Player object on the heap
            Character CurrentPlayer = new Character();
            CurrentPlayer.AskName();
  
            //Create a Shaman on the heap
            Shaman WiseWoman = new Shaman();
  
            Game.Introduction();
            location = Game.CENTER(CurrentPlayer);
  
            while(Continue)
            {          
                 switch(location)
                 {
                      case N1 : location = Game.NORTH1(CurrentPlayer); 
                                break;
                      case S1 : location = Game.SOUTH1(CurrentPlayer); 
                                break;
                      case E1 : location = Game.EAST1(CurrentPlayer); break;
                      case W1 : location = Game.WEST1(CurrentPlayer); 
                                break;
                      case CENTER1 : location = Game.CENTER(CurrentPlayer); 
                                break;
                      case N2 : location = Game.NORTH2(CurrentPlayer); break;
                      case S2 : location = Game.SOUTH2(CurrentPlayer); 
                                break;
                      case E2 : location = Game.EAST2(CurrentPlayer); 
                                break;
                      case W2 : location = Game.WEST2(CurrentPlayer); 
                                break;
                      case UNDERGRND : location = 
                                       Game.UnderGroundPassage(CurrentPlayer); 
                                       break;
                      case GATE : location = Game.GateWay(CurrentPlayer); 
                                  break;             
                      case SHAMAN : location = 
                                    Game.SHAMANHUT(CurrentPlayer, WiseWoman); 
                                    break;
                      case QUIT : Continue = false; break;
                      //REMEMBER to remove the "QUIT" when finshed translating!
                      default : System.out.print("Not an option."); 
                                location = QUIT; 
                                break;  
                }//close switch   
           }//close while loop  
  
           //Save HighScore
           successful = Game.SaveHighScores(CurrentPlayer);
           if(successful)
           { System.out.print("\n\tScore saved to \"highscores.txt\".\n\n"); }
           else { System.out.print("\n\tError. Score could not be saved!\n\n"); }
  
           System.out.print("\n\tExiting Hills of Darkness for Java 2.0\n\n\n");    
           System.exit(0);
    
     }// close main() function

}//close TheGame class specification
