import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class ExtendedList{

	public static void main(String a[]){

	Scanner reader = new Scanner(System.in);
	List<String> wordlister = new ArrayList<String>();
	String word = "";

	do{
		System.out.print("Type a word: ");
		word = reader.next();
		if(word.equals("exit")){
			break;
		}
		wordlister.add(word);
	/*	if(word.equals("exit")){
			wordlister.remove(word);
		} */
	
	} while(! (word.equals("exit")));
	
	System.out.print("Type a letter: ");	
	char c = reader.next().charAt(0);

	for(String str : wordlister){

		if(c==str.charAt(0)){
			System.out.println(str);
		}
	}		
		
		
}		


}