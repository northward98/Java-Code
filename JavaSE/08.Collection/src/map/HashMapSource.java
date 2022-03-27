package map;

import java.util.HashMap;

/**
 * HashMap扩容机制
 */

public class HashMapSource {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12 ; i++) {
            hashMap.put(new A(i),"hello");
        }

        System.out.println(hashMap);
    }
}

class A{
    private int num;

    public A(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }



    @Override
    public int hashCode() {
        return 100;
    }
}