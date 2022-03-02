package exercise;

/**
 * 编写一个类，定义方法max
 * 求某个double数组的最大值，并返回
 */

public class Exercise1 {
    public static void main(String[] args) {
        double[] d = {1, 2, 5, 7, 9, 2.3, 4.5};
        A1 a1 = new A1();
        System.out.println(a1.max(d));
    }
}

class A1 {
    public double max(double[] d) {
        if (d.length > 0) {
            double max = d[0];
            for (int i = 1; i < d.length; i++) {
                if (d[i] > max) {
                    max = d[i];
                }
            }
            return max;
        }
        return d[0];
    }
}

