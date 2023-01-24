public class Queue {
    //push back ,pop front
    private int size;
    private int rear;
    private int front;
    private int arr[];
    public Queue(int size){
        arr=new int[size];
        rear=-1;// to indicate queue is empty assign r and f to -1
        front=-1;
        size=0;
    }
    public void enqueue(int element){
        //add the back using rear;
        if(isFull()){
            System.out.println("Queue is full");return;
        }
        ++rear;
        if(rear==arr.length){
            rear=0;
        }
        arr[rear]=element;
        ++size;
        if(front==-1)++front;//if first element has added  to indicate increment front

    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Nothing to return queue is empty");
            return Integer.MIN_VALUE;
        }
        int data=arr[front];
        if(front==arr.length){
            front=-1;//to indicate queue is empty again
            rear=-1;
        }
        else if(front==arr.length-1){
                front=0;
        }
        else  front++;
        size--;
        return data;
    }
    public int peek(){
        int data;
        if(isEmpty() || isFull()) throw new RuntimeException("Do a null control");
        else {data=arr[front];}
        System.out.println(data);
        return data;
    }
    public boolean isFull(){
        return size==arr.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
}
