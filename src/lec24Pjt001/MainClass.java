package lec24Pjt001;

public class MainClass {

    public static void main(String[] arg){
        // String str = "JAVA";
        String str = new String("JAVA");
        System.out.println("str : "+str);

        str = str + "_8";
        System.out.println("str : " +str);

        //StringBuffer
        StringBuffer sf = new StringBuffer("JAVA");
        System.out.println("sf : " +sf);
        sf.append(" World");
        System.out.println("sf : " +sf);
        System.out.println("sf.length() : " +sf.length());
        sf.insert(sf.length(), "~~~~");
        System.out.println("sf : " +sf);

        sf.delete(4, 8);
        System.out.println("sf : " + sf);

        StringBuilder sb = new StringBuilder("JAVA World!!");
        System.out.println("sb : " +sb);

    }
}

