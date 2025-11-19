//NAME: Abrio, Katrina Nicole
//TASK#: 4
//---------------------------
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        scan.close();

        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
       
        String checker = input.equals(reversed) ? 
        "The input string is a palindrome" :
        "The input string is not a palindrome";
        System.out.println(checker);

    }

}
