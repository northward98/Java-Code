package lambda;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Lambda表达式的使用
 * 举例：(o1,o2) -> Integer.compare(o1,o2)
 * 左边形参列表，即接口中的抽象方法的形参列表
 * 右边lambda体，即重写的抽象方法的方法体
 */
public class LambdaTest {
    //语法格式一：无参，无返回值
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        r1.run();
        System.out.println("----------------");
        Runnable r2 = () -> System.out.println("hi");
        r2.run();
    }

    //语法格式二：Lambda需要一个参数，但无返回值
    @Test
    public void test2(){
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con1.accept("hello");
        System.out.println("--------------");
        Consumer<String> con2 = (String s) -> System.out.println(s);
        con2.accept("hi");
    }

    //语法格式三：数据类型可以省略，因为可有编译器推断得出，称为 类型推断
    @Test
    public void test3(){
        Consumer<String> con1 = (String s) -> System.out.println(s);
        con1.accept("hello");
        System.out.println("----------");
        Consumer<String> con2 = (s) -> System.out.println(s);
        con2.accept("hi");
    }

    //语法格式四：Lambda若只需要一个参数时，参数的小括号可以胜率
    @Test
    public void test4(){
        Consumer<String> con1 = (s) -> System.out.println(s);
        con1.accept("hello");
        System.out.println("----------");
        Consumer<String> con2 = s -> System.out.println(s);
        con2.accept("hi");
    }

    //语法格式五：Lambda需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test5(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(12,21));
        System.out.println("------------");
        Comparator<Integer> com2 = (o1, o2) -> {return o1.compareTo(o2);};
        System.out.println(com2.compare(21,12));
    }

    //语法格式六：当lambda体只有一条语句时，return与大括号若有可以省略
    @Test
    public void test6(){
        Comparator<Integer> com1 = (o1, o2) -> {return o1.compareTo(o2);};
        System.out.println(com1.compare(12,21));
        System.out.println("------------");
        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(21,12));
    }
}
