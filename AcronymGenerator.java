//inputs
//input are given in lower case, if it is in uppercase, convert it to lowercase using lowercase() method
//indian premier league
//hello from earth
//Central Processing Units
//Future 4D Design Innovations

//output
//ipl
//hfe
//cpu
//f4di

// public class Main
// {
// 	public static void main(String[] args) {
// 		String s = new String("central processing unit");
// 		String modern_name =""+ s.charAt(0);
// 		for(int i=1;i<s.length()-1;i++){
// 		    if(s.charAt(i)==' '){
// 		        modern_name = modern_name+s.charAt(i+1);
// 		    }
// 		}
// 		System.out.print(modern_name);
// 	}
// }
//the above code works, but it may get fail when the string contains space at last and if there are more than one space between two words in a string

//the below code works for allhte test cases
//first it splits the string , each words in a string become array elements ["central" , "processing", "unit"]
//iterate the array, if the word is empty it will not print anything, if the world is not empty it prints the first character of the world
public class Main
{
	public static void main(String[] args) {
		String s = new String("central processing unit");
		String[] words_array= s.split(" ");//splits all the words, and makes it as array elements
		for(String wa:words_array){
		    if(!wa.isEmpty()){
		        System.out.print(wa.charAt(0));
		    }
		}
	}
}

