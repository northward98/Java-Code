package branch;

import java.util.Scanner;

/**
 * 输入a-e，输出A-E。其它字符输出other
 */

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入：");
        char c = input.next().charAt(0);
        switch (c) {
            case 'a':
                System.out.println((char) (c - 32));
                break;
            case 'b':
                System.out.println((char) (c - 32));
                break;
            case 'c':
                System.out.println((char) (c - 32));
                break;
            case 'd':
                System.out.println((char) (c - 32));
                break;
            case 'e':
                System.out.println((char) (c - 32));
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}