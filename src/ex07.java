import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        // for문
        System.out.print("Input Number : ");
        Scanner scanner = new Scanner (System.in);
        int inputNum = scanner.nextInt();

        for (int i = 1; i<10; i++) {
            System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
        }
    }
}
