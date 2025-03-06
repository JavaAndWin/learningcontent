import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Test01 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node newHead = null;
        while(head!=null) {
            Node temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }

        while(newHead!=null) {
            System.out.print(newHead.value+"->");
            newHead = newHead.next;
        }
        System.out.println("null");
    }


}

class Node{
    Integer value;
    Node next;
    public Node(int value){
        this.value = value;
        next = null;
    }

    public Node(){
        value = null;
        next = null;
    }
}