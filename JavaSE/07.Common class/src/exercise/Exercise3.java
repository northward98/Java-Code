package exercise;

/**
 * 将L m N输出为 N,L.M
 */

public class Exercise3 {
    public static void main(String[] args) {
        String name = "L m N";
        printName(name);

    }

    public static void printName(String str){
        if(str == null){
            System.out.println("str 不能为空");
            return;
        }

        String[] names = str.split(" ");//分割
        if(names.length != 3){
            System.out.println("name格式不正确");
        }

        String format = String.format("%s,%s.%c",names[2],names[0],names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
