package class_and_object;

/**
 * 可变参数
 */

public class VarParameter {
    public static void main(String[] args) {
        Tool tool = new Tool();
        tool.show("jack",50,20);
        tool.show("mike",50,20,70);
        tool.show("smith",50,20,80,90,75);
    }
}

class Tool {
    public void show(String name, double... grade) {
        double sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        System.out.println(name + "的" + grade.length + "门成绩的总分为" + sum);
    }
}
