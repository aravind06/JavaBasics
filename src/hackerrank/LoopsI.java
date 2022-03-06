package hackerrank;

import java.util.Scanner;

public class LoopsI {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int in = scan.nextInt();
      scan.close();

      for(int i=1;i<=10;i++) {
          System.out.printf("%d x %d = %d%n",in, i, (in*i));
      }

    }
}
