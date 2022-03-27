package set;

/**
 * HashSet底层结构
 */

public class HashSetStructure {
    public static void main(String[] args) {
        //模拟一个HashSet的底层
        //1.创建一个数组,数组类型是Node[]
        Node[] table = new Node[16];
        //2.创建节点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;//将jack节点挂载到john
        Node rose = new Node("rose", null);
        jack.next = rose;
        Node lucy = new Node("lucy", null);
        table[3] = lucy;
    }
}

class Node{
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}

