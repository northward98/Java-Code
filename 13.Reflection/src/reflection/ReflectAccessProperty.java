package reflection;

import java.lang.reflect.Field;

/**
 * 通过反射访问类中的成员
 */

public class ReflectAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        //1.得到Student类对应的Class对象
        Class<?> stuClass = Class.forName("reflection.Student");
        //2.创建对象
        Object o = stuClass.newInstance();
        //3.使用反射得到age属性对象
        Field age = stuClass.getField("age");
        age.set(o,88);//通过反射操作反射
        System.out.println(o);
        System.out.println(age.get(o));
        //4.操作name属性
        Field name = stuClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"tom");
        //也可以 name.set(null,"tom");  因为name是static的
        System.out.println(name.get(o));
    }
}

class Student{
    public int age;
    private static String name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age + " name=" + name+
                '}';
    }
}
