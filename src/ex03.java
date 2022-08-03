public class ex03 {

    public static void main (String [] args) {

        int[] arr1 = new int[5]; // 배열 선언 단계! 자바의 배열은 한 번 선언되면 그 다음부터는 크기가 변경되지 않음
        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;
        arr1[3] = 400;
        arr1[4] = 500;

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr1[1] : " + arr1[1]);
        System.out.println("arr1[2] : " + arr1[2]);

        int[] arr2 = {10, 20, 30}; // int[] arr2 = new int [3]; arr2[0] = 10; ...
        System.out.println("arr2[0] : " + arr2[0]);
        System.out.println("arr2[1] : " + arr2[1]);
        System.out.println("arr2[2] : " + arr2[2]);
    }
}
