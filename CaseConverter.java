//input 
//gitHUB
//CASECONVerter
//output
//github
//CASECONVERTER
//given a string, first we need to count how many upper case and how many lower case letters are there.
//if number of uppercase letter are more, convert the string to uppercase
//if number of lowercae letters are more, convert the string to lowercase
//if both upper and lowercase letters are equal, convert the string to lowercase
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s = new String("CODErspowerplAY");
		int lower_case_count=0;
		int upper_case_count=0;
		for(int i=0;i<s.length();i++){
		    if(Character.isLowerCase(s.charAt(i))){
		        lower_case_count++;
		    }
		    else
		    upper_case_count++;
		}
		if(lower_case_count>=upper_case_count){
		    
		    	System.out.print(s.toLowerCase());
		}
		else{
	
			System.out.print(s.toUpperCase());
		}
	
	}
	
}
