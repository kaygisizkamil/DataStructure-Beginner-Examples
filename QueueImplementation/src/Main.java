public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue(6);
        queue.enqueue(-1);
        queue.peek();
        queue.dequeue();
        queue.enqueue(-2);
        queue.peek();
        queue.dequeue();
        queue.enqueue(-3);
        queue.peek();
        queue.enqueue(-4);
        queue.peek();
        queue.enqueue(-5);
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue(); queue.dequeue(); queue.dequeue();queue.peek();//supposed to throw error




    }
}