//Name: Abrio, Katrina Nicole
//Task#: 5
//---------------------------

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers separated by spaces: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        input.close();

        String result = (a==b && b==c) ?
            "All numbers are equal" : (a>b && a>c) ?
            "The largest number is " + a : (b>a && b>c) ?
            "The largest number is " + b : "The largest number is " + c;
        System.out.println(result);
    }
}
