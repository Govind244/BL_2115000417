import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int data) {
        stack1.push(data);
    }

    int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        // queue.enqueue(4);

        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue());
        queue.enqueue(6);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
    }
}