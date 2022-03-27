package set;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet方法
 */

public class HashSet1 {
    public static void main(String[] args) {
        Set set = new HashSet();
        System.out.println(set);

        set.add("jack");//t
        set.add("jack");//f
        set.add(new Dog("tom"));//t
        set.add(new Dog("tom"));//t
        set.add(new String("james"));//t
        set.add(new String("james"));//f
        System.out.println(set);
    }
}

class Dog{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}