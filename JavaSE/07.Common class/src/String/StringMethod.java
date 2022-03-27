package String;

/**
 * 演示String常用方法
 */

public class StringMethod {
    public static void main(String[] args) {
        String s1 = "Jack";
        System.out.println("jack".equalsIgnoreCase(s1));//true
        System.out.println("smith".length());//5

        String s2 = "234151";
        System.out.println(s2.indexOf("1"));//3
        System.out.println(s2.indexOf("15"));//3
        System.out.println(s2.lastIndexOf("1"));//5

        System.out.println(s2.substring(3));//151
        System.out.println(s2.substring(3, 5));//15

        String s3 = "Hello";
        System.out.println(s3.charAt(3));//l
        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());

        System.out.println(s3.concat("ha"));//Helloha
        System.out.println(s3);//Hello
        System.out.println(s3.replace("lo", "loo"));//Helloo
        System.out.println(s3);//Hello

        String s4 = "大漠孤烟直,长河落日圆";
        String[] arr1 = s4.split(",");//分割成几个部分，组成数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        String s5 = "  123 ";
        System.out.println(s5.trim());//去前后空格  -》123
        System.out.println(s5);//  123

        String s6 = "java";
        char[] arr2 = s6.toCharArray();//转成字符数组
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();

        String s7 = "jack";
        String s8 = "john";
        System.out.println(s7.compareTo(s8));//比较字符串大小，此例返回的是 a-o 的值
        String s9 = "jac";
        System.out.println(s9.compareTo(s7));//返回的是s9的长度-s7的长度 = -1

        String name = "mike";
        int age = 18;
        double grade = 88.4;
        char gender = '男';
        //格式化
        String show = String.format("姓名%s\t性别%c\t年龄%d\t成绩%.2f", name, gender, age, grade);
        System.out.println(show);
    }
}
