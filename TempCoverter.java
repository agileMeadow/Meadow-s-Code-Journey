package p_2022_07_12;

import java.util.Scanner;

public class TempCoverter {

	public static void main(String[] args) {
        
        int inNum = 0;
        String userIn = "";
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        
        while(!flag){
            System.out.println("Please input the Temperature in Fahrenheit.");
            try{
                userIn = sc.nextLine();
                inNum = Integer.parseInt(userIn);
                flag = true;
                // if we do get an int input and we don't error out on line 15
                // then we can safely terminate the loop and continue on (skip catch)
            } catch(NumberFormatException err){
                System.out.println(userIn + " is not a valid number.");
            }// end of try-catch
        }// end of loop
        System.out.println("The Result is: " + (((inNum - 32) * 5) / 9) + "*C"); 
    }// main
}// class
