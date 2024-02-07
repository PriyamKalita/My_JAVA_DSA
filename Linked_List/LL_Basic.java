public class LL_Basic{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Add First
    public void addFirst(int data){
        // Step - 1     Create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step - 2     newNode next = head
        newNode.next = head;

        // Step - 3     Head = newNode
        head = newNode;    
    }

    // Add Last
    public void addLast(int data){
        // Create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // tail's next = new Node
        tail.next = newNode;
        // tail = new Node
        tail = newNode;
    }

    // Print Linked List
    public void print(){
        if (head == null) {
            System.out.println("Linked list is Empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // Add in the Middle
    public void add(int idx, int data){
         if(idx == 0){
            addFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx - 1){
            temp = temp.next;
            i++;
        }
        // i = idx - 1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove First
    public int removeFirst(){
        if(size == 0){
            System.out.println("Linkded List is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    // Remove Last
    public int removeLast(){
        if(size == 0){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        // prev : i = size - 2;
        Node prv = head;
        for(int i = 0; i < size - 2; i++){
            prv = prv.next;
        }

        int value = prv.next.data;
        prv.next = null;
        tail = prv;
        size--;
        return value;
    }

    // Search (Iterative)
    public int Search(int key){
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Search (Recursive)
    public int helper(Node head, int key){
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }
    public int Search_Recursive(int key){
        return helper(head, key);
    }

    // Reverse a Linked List
    public void reverse(){
        Node prev = null;
        Node curr =  tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;   
        }
        head = prev;
    }

    // Find and Reverse Nth Node from end
    public void deleteNthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;   // Remove First Element
            return;
        }
        // sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Check it Linked List is a Palindrome (Using Slow - Fast Concept)
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;    //    Slow is midNode
    }

    public boolean checkPlindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // Step1 - Find mid
        Node midNode = findMid(head);

        // Step2 - Reverse 2nd half  Linked List  ( // Step2 difficult to understand )

        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;   // Right Half head
        Node left = head;

        // Step3 - Check left half and Right Half
        if (left.data != right.data) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
       
        LL_Basic ll = new LL_Basic();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.addLast(4);
        ll.addLast(5);

        ll.add(2, 9);

        ll.print();

        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println(ll.size);

        System.out.println(ll.Search(2));
        System.out.println(ll.Search(10));

        System.out.println(ll.Search_Recursive(2));
        System.out.println(ll.Search_Recursive(10));

        ll.reverse();
        ll.print();

        ll.deleteNthFromEnd(3);
        ll.print();

        System.out.println(ll.checkPlindrome());
    }
}

