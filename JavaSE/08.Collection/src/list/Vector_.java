package list;

import java.util.Vector;

public class Vector_ {
    public static void main(String[] args) {
//      (1)Vector底层也是一个对象数组
//      (2)Vector是线程同步的(效率不高)，即线程安全，在开发中要求线程同步安全时，考虑使用Vector
//      (3)扩容时如果使用的是无参构造器，则初始elementData容量为0，
//         第1次添加，则扩容elementData为10，如需要再次扩容，则扩容elementData为2倍
//      (4)如果使用的是指定大小的构造器，则初始elementData容量为指定大小，
//         如果需要扩容，则直接扩容elementData为2倍
        Vector vector= new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
    }
}
