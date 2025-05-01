//inputs
//001100110000
//0000111001
//00111110011
//output
//not dangerous
//not dangerous
//dangerous
// if in the given input there are equal or more than 5 1's or 0's in a sequence then it is dangerous sequence
// if not, the sequence is not dangerous

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s = new String("1111111");
		int zero_count=0;
		int one_count=0;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='0'){
		        zero_count++;
		        one_count=0;
		        if(zero_count==7)
		        {
		            System.out.print("Dangerous");
		            break;
		        }
		      
		    }
		    else{
		        one_count++;
		        zero_count=0;
		       if(one_count==7){
		           System.out.print("Dangerous");
		           break;
		       }
		    }
		   
		}
		if(zero_count!=5 && one_count!=5){
		    System.out.print("Not Dangerous");
		}
	
	
	}
	
}
