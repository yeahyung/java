import java.util.ArrayList;
import java.util.List;

public class StackLeetCode {

    public static void main(String[] args) {
       MinStack minStack = new MinStack();
       minStack.push(-2);
        minStack.push(0);
       System.out.println(minStack.getMin());
       minStack.push(-3);
       minStack.pop();
       minStack.top();
       System.out.println(minStack.getMin());
    }
}