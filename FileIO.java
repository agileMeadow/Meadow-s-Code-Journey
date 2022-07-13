import java.io.File;
import java.util.Scanner;
import java.io.FileWriter; 
import java.io.IOException;


public class FileIO {
	public static void main(String[] args) {

	String userIn = "";
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What would you like to write to the file?\nPress enter on a blank line to end.\n");
	
	try {
		//Create the file inside the try-catch but before the While loop
		FileWriter outFileObj = new FileWriter("output.txt");
		while (true) {
			userIn = sc.nextLine();

			if (userIn.equals("")){ //detecting an empty/blank line
				break;//if user presses enter on empty line, break out of While loop and continue onto closing the file
			}
			else{
				outFileObj.write(userIn + "\n");//We take the input and write it to the file and then add a "newline" character at the end
			}//so that the user's input is split into lines the way they did it in the terminal/commandline
			
		}//End of while loop
		
		outFileObj.close();	//VERY important, you have to close the files you create/open otherwise it will cause issues and corruption!!
		
	}catch (IOException e) {
		//Error catching because performing IO operations can fail very often lol
		System.out.println("An error occured!");
		
		}//try-catch
		
	}//main
	
}//class
