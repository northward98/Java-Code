package object_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 演示ObjectOutputStream,完成数据的序列化
 */

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        //序列化数据到文件
        oos.write(100);//int -> Integer(实现了Serializable)
        oos.writeBoolean(true);//boolean -> Boolean(实现了Serializable)
        oos.writeChar('t');//char -> Character(实现了Serializable)
        oos.writeUTF("tom");//String(实现了Serializable)

        oos.writeObject(new Dog("jack" ,10));

        oos.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
