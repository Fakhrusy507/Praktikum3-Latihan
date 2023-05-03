public class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String value) {
        stackArray[++top] = value;
    }

    public String pop() {
        return stackArray[top--];
    }

    public String peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean empty() {
        return (top == -1);
    }

    public int search(String value) {
        for (int i = top; i >= 0; i--) {
            if (stackArray[i] == value) {
                return top - i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Stack st = new Stack(10);

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next : " + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());

    }
}