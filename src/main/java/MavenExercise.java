import org.apache.commons.lang3.StringUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MavenExercise {

    public static void main(String[] args) {
        //add scanner
        //ask user for input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number or word: ");
        String userInput = sc.nextLine();
        if  (StringUtils.isNumeric(userInput)){
            System.out.println("The number is " + userInput);
        } else {
            System.out.println("The input is not a number");
        }

        //Flip the case of the String
        System.out.println("Enter words");
        userInput = sc.nextLine();
        System.out.println(StringUtils.swapCase(userInput));
        //Reverse the String
        System.out.println("Enter a word and lets reverse it");
        userInput = sc.nextLine();
        System.out.println(StringUtils.reverse(userInput));



        //if input is a number, tell user it is a number
        //if input is not a number, tell user it is not a number

        //if input is a number, tell user the number is even or odd


    }
}
