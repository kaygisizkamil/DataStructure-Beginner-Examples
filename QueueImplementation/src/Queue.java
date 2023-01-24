public class Queue {
    //push back ,pop front
    private int size;
    private int front;
    private int rear;
    private int arr[];

    public Queue(int size) {
        arr=new int[size];
        front=-1;
        rear=-1;
        size=0;
    }
    public  void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        if(rear==arr.length){
            rear=0;
        }
        arr[rear]=data;
        size++;
        if(front==-1){
            front=0;//after first element has added to list
        }
    }
    public int dequeue(){
        if(isFull()||isEmpty())return Integer.MIN_VALUE;//optionall throw an error
        int data=arr[front];
        if(front==arr.length){
            front=0;
        }
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
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
