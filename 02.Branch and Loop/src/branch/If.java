package branch;

import java.util.Scanner;

/**
 * 4-10月为旺季，其他月份为淡季
 * 旺季时，18岁至60岁票价为60，小于18岁半价，大于60岁票价为1/3
 * 淡季时，18岁至60岁票价为40，其它年龄票价-20
 */

public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入月份");
        int season = input.nextInt();
        System.out.println("请输入你的年龄");
        int age = input.nextInt();
        if(season >= 4 && season <= 10){
            double price = 60;
            if (age >= 18 && age <= 60){
                System.out.println("票价为" + price);
            }else if (age < 18){
                System.out.println("票价为" + price * 0.5);
            }else if (age > 60){
                System.out.println("票价为" + (price * 1.0 / 3));
            }else {
                System.out.println("输入姓名有误");
            }
        }else if((season <= 3 && season >= 1) || (season >= 11 && season <=12)){
            double price = 40;
            if (age >= 18 && age <= 60) {
                System.out.println("票价为" + price);
            }else {
                System.out.println("票价为" + (price - 20));
            }
        }else {
            System.out.println("输入月份有误");
        }
    }
}