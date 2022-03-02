package class_;

/**
 * 演示得到Class对象的方式
 */

public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.已知一个类的全类名，且该类在类路径下，可通过Class类的静态方法forName()获取
        //应用场景：多用于配置文件，读取类全路径，加载类
        String classAllPath = "class_.Car";
        Class cls1 = Class.forName(classAllPath);
        System.out.println(cls1);

        //2.若已知具体的类，通过类的class获取，该方式最为安全可靠，程序性能最高
        //应用场景：多用于参数传递，比如通过反射得到对应构造器对象
        Class cls2 = Car.class;
        System.out.println(cls2);

        //3.已知某个类的实例，调用该实例的getClass()方法获取Class对象
        //应用场景：通过创建好的对象，获取Class对象
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);

        //4.类加载器(4种)得到Class对象
        //(1)得到类加载器
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        //cls1,cls2,cls3,cls4 其实是同一个对象
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

        //其它方式
        //5.基本数据类型得到Class类对象
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        System.out.println(integerClass);//输出int  底层有自动装箱和拆箱过程

        //6.基本数据类型对应的包装类，可以通过.TYPE得到Class对象
        Class<Double> type = Double.TYPE;
        System.out.println(type);//输出double

        Class<Integer> type1 = Integer.TYPE;

        //下面输出的hashCode是同一个
        System.out.println(integerClass.hashCode());
        System.out.println(type1.hashCode());
    }
}
