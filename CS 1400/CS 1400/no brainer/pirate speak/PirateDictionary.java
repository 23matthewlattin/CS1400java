/**************************************8888
PirateDictionary.java: this files has logic to convert
an enlish sentence to a Pirate jargon. It reads
a pirate dictionary from a file

**************************************************/

import java.util.*;
import java.io.*;

class PirateDictionary{
   // parellel arrays for the english and pirate words
   private ArrayList<String> english = new ArrayList<>();
   private ArrayList<String> pirate = new ArrayList<>();
   //file name, file should be in the current directory
   private String filename = "pirate.txt";
   private Scanner fileIn;
   
   //constructor: opens the dictionary and populates the arrays
   public PirateDictionary(){
      //try opening the file
      try{
         //use the scanner and file reader to open the file
         fileIn = new Scanner(new FileReader(filename));
         //keep reading so long as there aremore items in the file
         while(fileIn.hasNext()){
            //read an enlish word then the pirate translation
            english.add(fileIn.nextLine());
            pirate.add(fileIn.nextLine());
         }
      }
      //if the file is not found, display the error message
      catch(FileNotFoundException e){
         System.out.println("Error: " + e.getMessage());
      }
      //if any other error occurs display the message
      catch(Exception e){
         System.out.println("Error: " + e.getMessage());
      }
      //close the file regardless if there was an error or not
      finally{
         fileIn.close();
      }
   }//end constructor
   
   //converts an english sentence into pirate jargon
   String getPirateSentence(String englishSentence){
      //use the scanner to parse the sentence into words
      Scanner sentenceParse = new Scanner(englishSentence);
      //the pirate sentence
      String pirateSentence = "";
      
      //So long as there are more words keep converting
      while(sentenceParse.hasNext()){
         //get the nest word
         String word = sentenceParse.next();
         //translate it to a pirate word and add a space
         pirateSentence += getPirateWord(word)+ " ";
      }
      //return sentence 
      return pirateSentence;
   }//end get piratesentence
   
   //converts english word into pirate word
   String getPirateWord(String englishWord){
      //iterate the english list looking for the word
      for(int i = 0; i < english.size(); i++){
         //if it exists, return the pirate word
         if(english.get(i).equalsIgnoreCase(englishWord)){
            return pirate.get(i);
         }
      }
       //otherwise return the enlish word
      return englishWord;
   } 
}//end getpirateword

