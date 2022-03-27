package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射机制创建对象实例
 */

public class ReflectionCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //String classPath = "reflection.User";
        //1.先获取到User类的Class对象
        Class<?> userClass = Class.forName("reflection.User");
        //2.通过public的无参构造器创建实例
        Object o1 = userClass.newInstance();
        System.out.println(o1);
        //3.通过public的有参构造器创建实例
        Constructor<?> constructor = userClass.getConstructor(String.class);
        Object o2 = constructor.newInstance("tom");
        System.out.println(o2);
        //4.通过非public的有参构造器创建实例
        Constructor<?> declaredConstructor = userClass.getDeclaredConstructor(int.class, String.class);
        declaredConstructor.setAccessible(true);//爆破， 使用反射可以访问private构造器
        Object o3 = declaredConstructor.newInstance(20, "mike");
        System.out.println(o3);
    }
}

class User {
    private int age = 10;
    private String name = "jack";

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}