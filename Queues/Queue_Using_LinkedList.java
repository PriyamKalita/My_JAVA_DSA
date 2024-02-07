public class Queue_Using_LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {

        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add
        public static void Add(int data) {
           Node newNode = new Node(data);
           if(head == null){
            head = tail = newNode;
            return;
           }
           tail.next = newNode;
           tail = newNode;
        }

        // Remove
        public static int Remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1; // Add a return statement to handle the case where the queue is empty
            }
            int front = head.data;
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.Add(1);
        q.Add(2);
        q.Add(3);

        while (!q.isEmpty()) { // Change the while loop condition
            System.out.println(q.peek());
            q.Remove();
        }
    }
}
