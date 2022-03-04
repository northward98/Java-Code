package interface_;

public class InterfaceMethod implements InterfaceNew,InterfaceNew1{
    public static void main(String[] args) {
        InterfaceMethod interfaceNew = new InterfaceMethod();
        interfaceNew.def();
    }

    @Override
    public void def() {
        InterfaceNew1.super.def();
    }

    @Override
    public void f() {
    }
}

interface InterfaceNew {
    static void sm() {
        System.out.println("interface提供的方式实现");
    }
    static void sm2() {
        System.out.println("interface提供的方式实现");
    }

    default void def() {
        System.out.println("interface default方法");
    }
    default void def2() {
        System.out.println("interface default2方法");
    }
    //须要实现类重写
    void f();
}

interface InterfaceNew1 {
    default void def() {
        System.out.println("InterfaceNew1 default方法");
    }
}