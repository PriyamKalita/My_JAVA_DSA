import java.util.LinkedList;
public class LL_Colletions_FrameWork {
    public static void main(String[] args) {
        // Create
        LinkedList<Integer> ll = new LinkedList<>();
        // Add Last
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        // Add First
        ll.addFirst(0);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);


    }
}
