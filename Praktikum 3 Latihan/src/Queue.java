import java.util.LinkedList;


public class Queue {
    public void queueExample(){
        java.util.Queue queue = new LinkedList() ;

        queue.add("Java");
        queue.add("DotNet");
        queue.add("PHP");
        queue.add("HTML");

        System.out.println("remove : "+ queue.remove());
        System.out.println("element : "+ queue.element());
        System.out.println("poll : "+ queue.poll());
        System.out.println("peek : "+ queue.peek());
    }

    public static void main(String[] args) {
        new Queue().queueExample();
    }
}