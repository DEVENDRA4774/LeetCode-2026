import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        
        // Rotate the queue: Move the first (size-1) elements to the back
        int size = q.size();
        while (size > 1) {
            q.add(q.remove());
            size--;
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}