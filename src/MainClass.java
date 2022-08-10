public class MainClass {

    public static void main(String[] args) { // 프로그램이 시작될 때 가장 먼저 시작되는 method (main)

        int i = 10;
        int j;
        j = 100;
        System.out.println("i + j = " + (i+j));

        i = 100;
        System.out.println("i = " + i);

        i = 300;
        System.out.println("i = " + i);

        char c = 'a';
        System.out.println("c = " + c);

        i = 10;
        System.out.println("i = " +i);

        double d = 10.123;
        System.out.println("d = " + d);

        boolean b = false;
        System.out.println("b = " + b);

        String s = "Hello Java World!!";
        System.out.println("s = "+ s);

        s = "Good";
        System.out.println("s = " + s);

        ChildClass child1 = new ChildClass();
        child1.setInfo("hong gil dong", "M", 20);
        child1.getInfo();

        //child1.mySecret();

        ObjectClass obj1 = new ObjectClass();
        ObjectClass obj2 = new ObjectClass();
        ObjectClass obj3 = new ObjectClass();

        obj1.getInfo();
        obj1 = null; // 레퍼런스 x
        //obj1.getInfo();

        obj2.getInfo();
        //System.out.println("obj1 : " + obj1);
        //System.out.println("obj2 : " + obj2);
        //System.out.println("obj3 : " + obj3);


        int[] iArr = {10, 20, 30};
        ObjectClass2 obj21 = new ObjectClass2("Hello", iArr);
        }

        //디폴트 생성자
        ObjectEx obj31 = new ObjectEx();

        // 사용자 정의 생성자
        ObjectEx obj32 = new ObjectEx(10);
        int arr[] = {10, 20, 30};

        ObjectEx obj33 = new ObjectEx("Java", arr);

        // 소멸자
        ObjectEx obj34;



        // this 키워드
        int ints[] = {10, 20, 30};
        ObjectEx obj35 = new ObjectEx(10, "Java", ints);

        ObjectClass2 obj41 = new ObjectClass2(10, 20);

    }

