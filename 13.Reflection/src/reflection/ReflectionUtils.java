package reflection;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 演示通过反射获取类的结构信息
 */

public class ReflectionUtils {
    public static void main(String[] args) {

    }

    @Test
    //第一组  java.lang.Class类
    public void api_01() throws ClassNotFoundException {
        Class<?> personCls = Class.forName("reflection.Person");
        //1.得到全类名
        System.out.println(personCls.getName());//reflection.Person
        //2.得到简单类名
        System.out.println(personCls.getSimpleName());//Person
        //3.获取所有public修饰的属性，包含本类以及父类的
        Field[] fields = personCls.getFields();
        for (Field field :fields) {
            System.out.println(field);
        }
        //4.获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field field :declaredFields) {
            System.out.println(field.getName());
        }
        //5.获取所有public修饰的方法，包含本类以及父类的
        Method[] methods = personCls.getMethods();
        for (Method method :methods) {
            System.out.println(method.getName());
        }
        //6.获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method method :declaredMethods) {
            System.out.println(method.getName());
        }
        //7.获取所有public修饰的构造器，本类的，不包括父类
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor constructor :constructors) {
            System.out.println(constructor.getName());
        }
        //8.获取本类所有构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor constructor :declaredConstructors) {
            System.out.println(constructor.getName());
        }
        //9.以Package形式返回包信息
        System.out.println(personCls.getPackage());
        //10.以Class形式返回父类信息
        System.out.println(personCls.getSuperclass());
        //11.以Class[]形式返回接口信息
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class aClass :interfaces) {
            System.out.println(aClass.getName());
        }
        //12.以Annotation[]形式返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation :annotations) {
            System.out.println(annotation);
        }
    }

    @Test
    //第二组  java.lang.reflect.Field类
    public void api_02() throws ClassNotFoundException {
        Class<?> personCls = Class.forName("reflection.Person");
        //获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field field :declaredFields) {
            //getName返回属性名
            //getModifiers以int形式返回修饰符
            //默认修饰符是0，public是1，private是2，protected是4，static是8，final是16
            //getType以Class形式返回类型
            System.out.println(field.getName() +
            " 该属性的修饰符值" + field.getModifiers()
            +" 该属性的类型"+field.getType());
        }

        //第三组 java.lang.reflect.Method类
        //获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method method :declaredMethods) {
            //getName返回属性名
            //getModifiers以int形式返回修饰符
            //默认修饰符是0，public是1，private是2，protected是4，static是8，final是16
            //getReturnType以Class形式返回类型
            System.out.println(method.getName() + "该方法修饰符" + method.getModifiers()
            +"该方法的类型"+method.getReturnType());

            //getParameterTypes 以Class[]形式 得到当前方法形参情况
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType);
            }
        }

        //第四组 java.lang.reflect.Constructor类
        //getName返回属性名
        //getModifiers以int形式返回修饰符
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor constructor :declaredConstructors) {
            System.out.println(constructor.getName());

            //getParameterTypes 以Class[]形式 得到当前方法形参情况
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println("构造器形参" + parameterType);
            }
        }
    }
}

class A{
    public String hobby;

    public A() { }

    public void hi(){ }
}

interface IA{}
interface IB{}

@Deprecated
class Person extends A implements IA ,IB{
    public String name;
    protected int age;
    String job;
    private double sal;

    public Person(){ }

    public Person(String s){ }

    private Person(String s,int i){ }

    public void m1(String name,int age){ }

    protected void m2(){ }

    void m3(){ }

    private void m4(){ }
}