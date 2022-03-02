package list;

import java.util.ArrayList;

/**
 * ArrayList底层结构和源码分析
 */

@SuppressWarnings({"all"})
public class ArrayListSource {
    public static void main(String[] args) {

//     (1)ArrayList种维护了一个Object类型的数组elementData
//     (2)当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0，
//        第1次添加，则扩容elementData为10，如需要再次扩容，则扩容elementData为1.5倍
//     (3)如果使用的是指定大小的构造器，则初始elementData容量为指定大小，
//        如果需要扩容，则直接扩容elementData为1.5倍

        //ArrayList list = new ArrayList();//使用无参构造器
        ArrayList list = new ArrayList(8);//使用有参构造器
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
