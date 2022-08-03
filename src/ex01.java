public class ex01 {

    public static void main(String[] args) {

        // 특수문자

        /*
        여러 개를 주석 처리할 때
         */

        System.out.println("Good \t\t\tMorning~");
        System.out.println("Good \n\nMorning~");
        System.out.println("\'Good Morning~\'");
        System.out.println("\"Good Morning~\"");

        System.out.println("오늘의 날씨는 10도 입니다.");
        System.out.printf("오늘의 날씨는 %d도 입니다.\n", 8);

        char c1 = 'a';
        char c2 = 'A';
        System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", c1, c2);

        double d = 1.123456;
        System.out.printf("d = %f\n", d);
    }

}
