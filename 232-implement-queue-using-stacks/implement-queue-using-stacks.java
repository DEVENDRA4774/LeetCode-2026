import java.util.Stack;

class MyQueue {
    
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    // Push element to back of queue
    public void push(int x) {
        stack1.push(x);
    }
    
    // Remove element from front
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    
    // Get front element
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    
    // Check if queue is empty
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}