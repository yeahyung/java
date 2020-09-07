import java.util.PriorityQueue;
import java.util.Stack;

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {

    }

    // minStack을 따로 둔다. pop은 뒤에서부터 빠지니까.. 현재까지 스택쌓인것의 min값만 저장해서 minStack에 저장한다.
    // 1 2 3 4 하면 minStack는 1만 저장되면 됨, pop아무리해도 min값은 1이니까.. 
    public void push(int x) {
        stack.push(x);
        if (minStack.empty())
            minStack.push(x);
        else {
            int min = minStack.peek();
            if(x<=min)
                minStack.push(x);
        }

    }

    public void pop() {
        int minValue = stack.pop();
        if (!minStack.empty() && minStack.peek() == minValue)
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}