package encapsulation;

/**
 * 封装
 */

public class Encapsulation {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setBalance(25);
        account.setPassword("123456");
        //也可Account account = new Account("jack",25,"123456");
        System.out.println(account.show());
    }
}

class Account {
    private String name;
    private double balance;
    private String password;

    public Account() {
    }

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字长度不符，给默认名字为无名");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20,给默认值为20");
            this.balance = 20;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码长度必须为6，给默认密码为000000");
            this.password = "0000000";
        }
    }

    //显示信息
    public String show() {
        return name + "\t" + balance + "\t" + password;
    }
}