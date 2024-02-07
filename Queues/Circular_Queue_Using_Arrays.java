public class Circular_Queue_Using_Arrays {
        static class Queue {
            static int arr[];
            static int size;
            static int rear;
            static int front;
    
            Queue(int n) {
                arr = new int[n];
                size = n;
                rear = -1;
                front = -1;
            }
    
            public static boolean isEmpty() {
                return rear == -1 && front == -1;
            }

            public static boolean isFull(){
                return (rear + 1) % size == front;
            }
    
            // Add
            public static void Add(int data) {
                if (isFull()) {
                    System.out.println("Queue is Full");
                }
                if (front == -1) {
                    front = 0;
                }
                rear = (rear + 1) % size;
                arr[rear] = data;
            }
    
            // Remove
            public static int Remove() {
                if (isEmpty()) {
                    System.out.println("Empty Queue");
                    return -1; // Add a return statement to handle the case where the queue is empty
                }
    
               int result = arr[front];
               
               if(rear == front){
                rear = front = -1;
               }else{
                front = (front + 1) % size;
               }
               return result;
            }
    
            // Peek
            public static int peek() {
                if (isEmpty()) {
                    System.out.println("Empty Queue");
                    return -1;
                }
                return arr[front];
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
    

