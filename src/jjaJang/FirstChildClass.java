package jjaJang;

public class FirstChildClass extends ParentClass {

    public FirstChildClass() {
        System.out.println("ChildClass constructor");
    }

    public void childFun() {
        System.out.println("childFun()");
    }
    @Override
    public void makeJJajang() {
        System.out.println("--more makeJJajang() --");
    }
}
