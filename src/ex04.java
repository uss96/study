public class ex04 {

    public static void main(String[] args) {

        // 배열 기본속성
        int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
        int[] arrAtt2 = null;
        int[] arrAtt3 = null;

        // 배열 길이
        System.out.println("arrAtt1.length : " + arrAtt1.length);

        // 배열 요소 출력
        System.out.println("arrAtt1 : " + java.util.Arrays.toString(arrAtt1));

        // 배열 요소 복사
        arrAtt3 = java.util.Arrays.copyOf(arrAtt1, arrAtt1.length);
        System.out.println("arrAtt3 : " + java.util.Arrays.toString(arrAtt3));

        // 배열 레퍼런스
        arrAtt2 = arrAtt1;
        System.out.println("arrAtt1 : " + arrAtt1);
        System.out.println("arrAtt2 : " + arrAtt2);
        System.out.println("arrAtt3 : " + arrAtt3);
    }
}
