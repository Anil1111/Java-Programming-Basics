import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//      Scanner input = new Scanner(System.in);
//       int n = Integer.parseInt(input.nextLine());

        for (int i = 300 ; i >= 0 ; i--) {
            System.out.printf("%02d:%02d%n", i / 60, i % 60);
            System.out.println();
            Thread.sleep(1000);
        }
    }
}