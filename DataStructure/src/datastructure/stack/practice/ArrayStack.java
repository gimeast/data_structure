package datastructure.stack.practice;

public class ArrayStack {
    private Object[] stack;
    private int top;

    public ArrayStack(int length) {
        this.stack = new Object[length];
        this.top = -1;
    }

    public void push(Object data) {
        if (top >= stack.length-1) {
            throw new StackOverflowError();
        }

        this.stack[++top] = data;
    }

    public Object pop() {
        return this.stack[top--];
    }

    public boolean contains(Object value) {
        for (Object data : stack) {
            if(data.equals(value))
                return true;
        }
        return false;
    }

    public int size() {
        return this.stack.length;
    }
}
