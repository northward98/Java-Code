package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射访问类中的方法
 */

public class ReflectAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1.得到Boss类对应的Class对象
        Class<?> bossCls = Class.forName("reflection.Boss");
        //2.创建对象
        Object o = bossCls.newInstance();
        //3.调用public方法
        Method hi = bossCls.getMethod("hi", String.class);
        //Method hi = bossCls.getDeclaredMethod("hi",String.class);也可以
        //4.调用
        hi.invoke(o, "jack");

        //调用私有方法
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);
        System.out.println(say.invoke(o, 5, "tom", 'A'));
        //同样因为say方法是static o也可以改成null

        //注意！！！    在反射中，如果方法有返回值，统一返回Object
    }
}

class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }

    public void hi(String s) {
        System.out.println("hi " + s);
    }
}