package exercise;

/**
 * 编写一个类，定义方法find
 * 实现查找字符串数组中的元素查找，并返回索引
 * 如果找不到，返回-1
 */

public class Exercise2 {
    public static void main(String[] args) {
        A2 a2 = new A2();
        String[] s = {"jack", "mike", "mary", "tom"};
        System.out.println("索引是" + a2.find("tom",s));

    }
}

class A2 {
    public int find(String f,String[] s) {
        for (int i = 0; i < s.length; i++) {
            if (f.equals(s[i])) {
                System.out.println("找到了");
                return i;
            }
        }
        System.out.println("没找到");
        return -1;
    }
}
