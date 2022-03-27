package list;

/**
 * 模拟双向链表
 */

public class LinkedList_ {
    public static void main(String[] args) {
        //模拟双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("hsp");

        //连接三个节点,形成双向链表
        jack.next = tom;
        tom.next = hsp;
        hsp.pre = tom;
        tom.pre =jack;

        Node first = jack;//表示头节点
        Node last = hsp;//表示尾结点

        //演示遍历
        while (true){
            if(first == null){
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

        //演示链表添加,在tom和hsp之间添加smith
        //1.创建一个Node节点，名字为smith
        Node smith = new Node("smith");
        //2.把smith添加进去
        smith.next = hsp;
        smith.pre = tom;
        hsp.pre = smith;
        tom.next = smith;

    }
}

//定义一个Node类，Node对象 表示双向链表的一个节点
class Node{
    public Object item;//真正存放数据的地方
    public Node next;//指向下一个节点
    public Node pre;//指向前一个节点

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node=" + item;
    }
}