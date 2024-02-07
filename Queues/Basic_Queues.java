public class Basic_Queues {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // Add
        public static void Add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // Remove
        public static int Remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1; // Add a return statement to handle the case where the queue is empty
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);

        while (!q.isEmpty()) { // Change the while loop condition
            System.out.println(q.peek());
            q.Remove();
        }
    }
}
