public class ex05 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        // if 조건식
        if (num1 < num2) {
            System.out.println("num1은 num2보다 작다.");
        }

        System.out.println();

        // if else
        if(num1 < num2) {
            System.out.println("num1 is less than num2.");
        }

        else if (num1 > num2) {
            System.out.println("num1 is bigger than num2");
        }
        else {
            System.out.println("num1 is equal to num2");
        }
    }
}
