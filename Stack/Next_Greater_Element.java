import java.util.*;
public class Next_Greater_Element {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--){
            // 1st while Loop
            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2nd if-else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }

            // 3rd push in Stack
            s.push(i);
        }
        for(int i = 0; i < nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}
