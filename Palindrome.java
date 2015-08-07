//Check if a word is a palindrome or not. Continue running until you even -1.

import java.util.*;

public class Palindrome{
	public static void main(String [] args){
		String user_input = "";
		do{
			System.out.print("Enter a word or -1 to exit: ");
			Scanner input = new Scanner(System.in);
			user_input = input.nextLine();
			int beginning = 0, leave = 0;
			int end = user_input.length();
			String first_letter, last_letter = "";
			while(!isExit(user_input) && !user_input.isEmpty() && user_input!=null && leave == 0){
				first_letter = user_input.substring(beginning, beginning + 1);
				last_letter = user_input.substring(end - 1, end);
				if(!(first_letter.matches(last_letter))){
					System.out.println("This is not a Palindrome");		
					leave = 1;	
				}else if(first_letter.matches(last_letter) && (beginning == (end - 1) || (beginning - end) == 0)){
					System.out.println("This is a Palindrome");
					leave = 1;
				}
				beginning++;
				end--;
			}		
		}while(!isExit(user_input));
	}

//method to check if the user enter -1 to exit the program.	
	public static boolean isExit(String input){
		int exit; 
		try{
			exit = Integer.parseInt(input);
			if(exit == -1){
				return true;
			}else{
				return false;
			}
		}catch(NumberFormatException e){
			return false;
		}
	}
}
