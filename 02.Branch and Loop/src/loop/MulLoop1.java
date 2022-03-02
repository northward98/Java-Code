package loop;

import java.util.Scanner;

/**
 * 统计3个班成绩情况
 * 每个班5名同学
 * 求各个班的平均分和所有班级的平均分
 * 以及及格人数
 */

public class MulLoop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalsum = 0;
        double avg = 0;
        double totalavg = 0;
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            double sum = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第" + i + "班第" + j + "个同学的成绩");
                double grade = input.nextDouble();
                sum += grade;
                if(grade >= 60){
                    count++;
                }
            }
            avg = sum / 5.0;
            System.out.println("第" + i + "班平均成绩=" + avg);
            totalsum += sum;
        }
        totalavg = totalsum / 15.0;
        System.out.println("总平均成绩=" + totalavg);
        System.out.println("及格人数" + count);
    }
}
