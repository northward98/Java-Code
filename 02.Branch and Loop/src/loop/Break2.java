package loop;

import java.util.Scanner;

/**
 * 实现登录验证，有3次机会
 * 若用户名为l，密码为666，提示登录正确
 * 否则提示还有几次机会
 */

public class Break2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chance = 3;
        for (int i = 1; i <= chance  ; i++) {
            System.out.println("请输入用户名");
            String userName = input.next();
            System.out.println("请输入用密码");
            String password = input.next();
            if(userName.equals("l")&&password.equals("666")){
                System.out.println("登录成功");
                break;
            }
            chance--;
            System.out.println("登陆失败，还有" + chance + "次机会");
        }
    }
}
