package datastructure.stack;

public class ArrayStack {
    private Object[] stack;
    private int top;

    public ArrayStack(int length) {
        this.top = -1;
        this.stack = new Object[length];
    }

    /**
     * 데이터 삽입
     * @param data
     */
    public void push(Object data) {
        if (top >= stack.length - 1) {
            throw new StackOverflowError();
        }

        this.stack[++top] = data;
    }

    /**
     * 마지막 데이터 가져오고 삭제
     * @return
     */
    public Object pop() {
        if (top < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object data = peek();
        this.stack[top--] = null;
        return data;
    }

    /**
     * 마지막 데이터 조회
     * @return
     */
    public Object peek() {
        return this.stack[top];
    }

    /**
     * 스택이 비었는지 확인
     * @return
     */
    public boolean empty() {
        return top == -1;
    }
}
