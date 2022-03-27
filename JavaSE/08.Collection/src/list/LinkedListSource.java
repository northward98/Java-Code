package list;

import java.util.LinkedList;

/**
 * LinkedList的底层操作机制
 */

public class LinkedListSource {
    public static void main(String[] args) {
//        (1)LinkedList底层维护了一个双向链表
//        (2)LinkedList中维护了两个属性first和last分别指向首节点和尾节点
//        (3)每个节点(Node对象)，里面又维护了prev、next、item三个属性，
//           其中通过prev指向前一个，通过next指向后一个节点，最终实现双向链表
//        (4)所以LinkedList的元素删除和添加，不是通过数组完成的，相对来说效率较高
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.remove();
    }
}
