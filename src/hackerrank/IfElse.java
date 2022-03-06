package hackerrank;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        if(input%2 != 0 || (6 <= input && input <=20) ) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
