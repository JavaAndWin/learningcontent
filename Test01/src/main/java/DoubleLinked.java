public class DoubleLinked {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7,8,9};
        Node<Integer> head = createByIntArray(nums);
        head = pop(head,5);
        print(head);
    }

    static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;
        public Node(T data) {
            this.data = data;
        }
    }

    static <T> Node<T> createByIntArray(T[] data) {
        int n = data.length;
        if(data.length == 0){
            return null;
        }
        Node head = new Node(data[0]);
        Node tail = head;
        for(int i = 1; i < n; i++){
            tail.next = new Node(data[i]);
            tail.next.prev = tail;
            tail = tail.next;
        }
        return head;
    }
    static <T> Node<T> pop(Node<T> head,T data){
        while(head!=null){
            if(!head.data.equals(data)){
                break;
            }
            head = head.next;
            head.prev = null;
        }
        Node<T> cur = head;
        Node<T> prev = head;
        while(cur!=null){
            if(cur.data.equals(data)){
                prev.next = cur.next;
                cur = cur.next;
                if(cur != null){
                    cur.prev = prev;
                }
            }else{
                prev = cur;
                cur = cur.next;
            }

        }
        return head;
    }

    static void print(Node head){
        if(head == null){
            return;
        }
        while(head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println("null");
    }
}
