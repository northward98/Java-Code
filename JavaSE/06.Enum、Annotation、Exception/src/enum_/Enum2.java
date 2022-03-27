package enum_;

import java.util.concurrent.Callable;

public class Enum2 {
    public static void main(String[] args) {
        Color.RED.show();
        Color.BLACK.show();
        Color.BLUE.show();
        Color.GREEN.show();
        Color.YELLOW.show();
    }
}

interface S {
    public void show();
}

enum Color implements S {
    RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);

    private int value1;
    private int value2;
    private int value3;

    Color(int value1, int value2, int value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    @Override
    public void show() {
        System.out.println(value1 + "\t" + value2 + "\t" + value3);
    }
}