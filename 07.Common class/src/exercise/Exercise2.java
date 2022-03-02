package exercise;

/**
 * 录入用户名，密码，邮箱
 * 用户名长度为2或3或4
 * 密码长度为6，并要求全是数字
 * 邮箱中包含@，并且@在.前面
 */

public class Exercise2 {
    public static void main(String[] args) {
        String name = "jack";
        String pwd = "123456";
        String email = "jack@qq.com";
        try {
            userRegister(name, pwd, email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userRegister(String name, String pwd, String email) {

        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度错误");
        }

        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码格式错误");
        }

        int i = email.indexOf('@');//没找到返回-1
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮件格式错误");
        }
    }

    //判断是否全是数字
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {//0-9的ASCII值是数字
                return false;
            }
        }
        return true;
    }
}
