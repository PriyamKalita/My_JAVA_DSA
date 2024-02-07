public class Double_LL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int removeFirst(){
        if(head == null) {
            System.out.println("Double Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){   // For single linked list
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        int value = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    // Reverse Double Linked List
    public void reverseDLL(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println(" NULL ");
    }
    public static void main(String[] args) {
        Double_LL dll = new Double_LL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);

        dll.print();
        System.out.println(dll.size);

        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);

        dll.print();
        dll.reverseDLL();
        dll.print();
    }
}
