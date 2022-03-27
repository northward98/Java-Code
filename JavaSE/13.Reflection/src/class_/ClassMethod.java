package class_;

import java.lang.reflect.Field;

/**
 * 演示Class类常用方法
 */

public class ClassMethod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        String classAllPath = "class_.Car";
        //1.获取到Car类对应的对象
        Class<?> cls = Class.forName(classAllPath);
        System.out.println(cls);//显示cls对象  class_.Car
        System.out.println(cls.getClass());//输出cls运行类型 java.lang.Class
        //2.得到包名
        System.out.println(cls.getPackage().getName());
        //3.得到全类名
        System.out.println(cls.getName());
        //4.通过cls创建对象实例
        Object o = cls.newInstance();//可以创建的是Object对象
        Car car = (Car)cls.newInstance();//也可以创建Car对象
        System.out.println(car);//car.toString()
        //5.通过反射获取数据
        Field f = cls.getField("brand");
        System.out.println(f.get(car));//不能访问私有属性
        //6.通过反射给属性赋值
        f.set(car,"奔驰");
        System.out.println(f.get(car));
        //8.得到所有属性
        Field[] fields = cls.getFields();
        for (Field field : fields){
            System.out.println(field.getName());
        }
    }
}
