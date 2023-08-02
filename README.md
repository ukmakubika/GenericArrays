# Production

 An example done to demonstrate the use pf Generic Arrays in Java.

Description of Program:
 This project was the introduction to generic arrays. This was the next step up after learning about static arrays. This changed my persepctive on programming as this was the first big step creating static projects with limited function and a limited set of data to work with in an array, to learning how versatile code can be and how it can be made to be utilized for different functions.

 This example replicates the game "Wordle", whereby we will have a word that a user needs to guess. The program will have 3 responses to input, namely, a confirmation that the guessed letter is correct and in its correct position, the letter is correct and is in the incorrect position, and the letter is incorrect. The user's input is stored in an array and if the word is incorrect, the array is emptied. 

Approach:
1. Plan:
Input: The user will enter a 5-letter word 

Processing: The user’s word will be stored in an array which will be compared to an array containing the word that must be guessed. The program will assess whether the guessed characters are contained by the array that contains the default word. The guessed characters will be compared to the characters in the default word array and assessed whether they match the letters in the default array.

Output: If the guessed word is correct, the program should return a result of [A, A, A, A, A], otherwise B for every correct letter that is not in the correct position, and C for all letters that are not contained within the word.

2. Steps
2.1. 	Identify data structures:
defaultArray: the array containing the mystery word that should be guessed by the user
userWord: the array containing the word which will be guessed by the user
defaultArray and userWord are parameters of type MyArrayList

2.2.	Write down the call to the method and the heading of the method
    defaultArray.checkChar(defaultArray, userWord);
    public MyArrayList checkChar(MyArrayList defaultWord, MyArrayList userWord)

    userWord.checkWin(defaultArray.checkChar(defaultArray, userWord))
    public boolean checkWin(MyArrayList checkChar)

2.3. 	Write down programming steps:
	Create a new array list with default word
	Create a new array list to store returned list
	Check if word entered is a 5 letter word

Open the file to read the words in the list

check if the word entered is in the list

Call checkChar to check the validity of the chars and store the info

Traverse defaultArray until the end of the array and check whether the array contains the characters input by the user which are stored in the userWord array
The characters in the userWord array will be compared to the characters in the defaultArray and if the letters match, A will be returned for every single character in the correct position, B if the character is contained in the word but not in the correct position, and c if the character is not contained in the deafultArray

for (int i=0; i<5; i++)
	{
		if (defaultWord.contains(userWord.get(i)))
		{
			if ((defaultWord.get(i)).equals(userWord.get(i)))
			{
				checkChar.add(i, 'A');	
			}
			else
			{						
				checkChar.add(i, 'B');
			}	
		}
		else
		{
			checkChar.add(i, 'C');			
		}
	}
	
	return checkChar;

The program will then try to confirm whether the user has been successful of not by comparing all the returned results from the guess. If all the characters returned an ‘A’, the program will congratulate the user. The loop will traverse this using a counter until the counter has reached 5.

int counter = 0;
	
	for(int j = 0; j < 5; j++)
	{
		if (checkChar.get(j).equals('A'))
		{
			counter++;			
		} 
	}
	if (counter == 5)
		{
			return true;
		}
		else 
		{
			return false;
		}


3.What could've gone wrong:
	The user may not enter a value
	The user may enter a word to short
	The user may enter a word too long 

Solutions:
	The user may not enter a value
	The user may enter a word to short
	The user may enter a word too long 
