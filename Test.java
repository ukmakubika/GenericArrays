import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Test
{
    
   public static void main(String arg[])
    {
     Scanner in = new Scanner(System.in);   
     //Creat a new array list with default word.
	 MyArrayList<Character> defaultArray = new MyArrayList<>();
	 
	 defaultArray.add(0, 'p');
	 defaultArray.add(1, 'e');
	 defaultArray.add(2, 'a');
	 defaultArray.add(3, 'c');
	 defaultArray.add(4, 'h');
	 
	 System.out.println("**********************************");
	 System.out.println("WORDLE WORDLE WORDLE WORDLE WORDLE");
	 System.out.println("**********************************");
	 System.out.println("Key\nA: Valid characters and in its correct position\nB: Valid characters but not in its correct position\nC: Not a valid character");
	 System.out.println("**********************************");
	 
	 
  
     String wordE, wordFF; //Verables to store the word entered and the word from the list.
     File f1=new File("input.txt");   
     Boolean valid = false;
     for(int x=0;x<5;x++)//run 5 time user get 5 guesses.
       {
		   //Create a new array list to store returned list.
		   
		   MyArrayList<Character> userWord = new MyArrayList<>();
           
           System.out.println("Guess the five-letter word.");		   
           wordE = in.nextLine();
		   
		   userWord.add(0, new Character(wordE.charAt(0)));
		   userWord.add(1, new Character(wordE.charAt(1)));
		   userWord.add(2, new Character(wordE.charAt(2)));
		   userWord.add(3, new Character(wordE.charAt(3)));
		   userWord.add(4, new Character(wordE.charAt(4)));	   
		   
          if(wordE.length()==5) //Check if word entered is a 5 letter word.
          {
           try{ //Open the file to read the words in the list.
               FileReader fr = new FileReader(f1);
               BufferedReader br = new BufferedReader(fr);
               while((wordFF=br.readLine())!=null)
                {
                 if(wordFF.equals(wordE))//check if the word entered is in the list
                  {
                   valid = true;
                  }
                }

              if(valid) //Call checkChar to check the validity of the chars and store the info.
               {
					defaultArray.checkChar(defaultArray, userWord);
               }
           
           fr.close();
          }catch (IOException e) {
           System.out.println("File Read Error");} 
         }else valid = false; 
         
         System.out.println("The entered word is a valid 5 letter word: " + valid); 
         
         if(valid)
          {
			//display the feedback of the entered word
			System.out.println(defaultArray.checkChar(defaultArray, userWord));  
			//display the result of the feedback (Winner, Try again, Looser)
			
			if (userWord.checkWin(defaultArray.checkChar(defaultArray, userWord)))
			{
				System.out.println("YOU WIN!");
				break;
			}
			else
			{
				System.out.println("YOU LOSE! TRY AGAIN");
			}	

          }
		  
         valid = false;
         userWord.clear();
       }
    }     
}