public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack(3);

        stack.push(5);
        System.out.println(stack.peek());
        stack.push(7);
        System.out.println(stack.peek());
        stack.push(8);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.getSize());

    }
}