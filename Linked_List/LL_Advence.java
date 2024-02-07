// public class LL_Advence {

//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     // Detect Cycle in a Linked list
//     public static boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next;
//             if (slow == fast) {
//                 return true; // Cycle Exists
//             }
//         }
//         return false; // Cycle not Exists
//     }

//     // Remove a Loop / Cycle in a Linked List
//     public static void removeCycle() {
//         // Deted Cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (fast == slow) {
//                 cycle = true;
//                 break;
//             }
//         }
//         if (cycle == false) {
//             return;
//         }
//         // Find meeting point
//         slow = head;
//         Node prev = null;
//         while (slow != fast) {
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }
//         // Rmeove Cycle -> last.next = null
//         prev.next = null;
//     }

//     public static void main(String[] args) {
//         head = new Node(1);
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp;

//         // 1->2->1
//         // ^     |
//         // |_____|

//         System.out.println(isCycle());
//         removeCycle();
//         System.out.println(isCycle());
 
//     }
// }
public class LL_Advence {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Detect Cycle in a Linked list
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;  // Move slow pointer one step at a time
            fast = fast.next.next;  // Move fast pointer two steps at a time
            if (slow == fast) {  // If they meet, there's a cycle
                return true;
            }
        }
        return false;  // No cycle found
    }

    // Remove a Loop / Cycle in a Linked List
    public static void removeCycle() {
        // Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {  // No cycle to remove
            return;
        }

        // Find the start of the loop
        slow = head;
        Node prev = null;  // Keep track of the previous node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Break the loop by setting the last node's next pointer to null
        prev.next = null;
    }

    public static void main(String[] args) {
        // ... (Rest of your code)
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        // 1->2->1
        // ^     |
        // |_____|

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
