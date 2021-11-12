import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class JavaString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something here:");
        String userInput = scanner.nextLine();

        if (StringUtils.isNumeric(userInput)){
            System.out.println("This is a number: \n" + userInput);
        } else  {
            System.out.println("This is a string: \n" + userInput);
            System.out.println("This is your input flipped: \n" + StringUtils.swapCase(userInput));
            System.out.println("This is your input reversed: \n" + StringUtils.reverse(userInput));
        }
    }
}
