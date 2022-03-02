package object_;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 演示OutInputStream，完成数据反序列化
 */

public class OutInputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取
        //读取反序列化的顺序需要和保存数据(序列化)的顺序一致，否则会抛异常
        ois.readInt();
        ois.readBoolean();
        ois.readChar();
        ois.readUTF();
        Object o = ois.readObject();
        System.out.println(o.getClass());

        //如果希望调用Dog方法，需要进行向下转型,需要将Dog类的定义拷贝到可以引用的位置
        //此例在同一包内，不需引用
        Dog dog = (Dog)o;
        dog.getName();

        //关闭流
        ois.close();
    }
}


