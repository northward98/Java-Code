package innerclass;

/**
 * 匿名内部类实践：当做实参直接传递，简洁高效
 */

public class AnonymousInnerClass {
    public static void main(String[] args) {
        //当做实参直接传递，简洁高效
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("hello");
            }
        });

    }

    //静态方法
    public static void f1(IL il){
        il.show();
    }
}

interface IL{
    void show();
}

