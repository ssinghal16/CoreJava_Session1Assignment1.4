//Write a program to print the characters corresponding to ASCII codes from 65 to 90.
public class Assignment4 {

	public static void main(String[] args) {
		char a; 
		//For loop
		for (int i = 65; i <=90; i++){
			a = (char)i; //type casting 
			System.out.println(i + "- " + a);
		}

	}

}
