public class ObjectClass2 {
    public int x;
    public int y;

    //public ObjectClass2(int x) {

    //} 디폴트 생성자가 없을 경우, 컴파일러가 자동 생성한다!

    public ObjectClass2(String s, int[] iArr) {
        System.out.println(" -- ObjectClass() --");

        System.out.println("s --> " +s);
        System.out.println("iArr --> " + iArr);
    }

    public ObjectClass2(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void getInfo() {
        System.out.println(" x --> : " + x);
        System.out.println(" y --> : " + y);
    }

}
