public class LinkedList {
    Node head;

    public void append(int data) {
        Node addNode = new Node(data);
        if (head == null) {
            head = addNode;
            return;
        }
        Node iterator = head;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        iterator.setNext(addNode);
    }

    public void prepend(int data) {
        Node addNode = new Node(data);
        if (head == null) {
            head = addNode;
            return;
        } else {
            head.setNext(addNode);
            head = addNode;
        }
    }

    public void deleteOnceWithValue(int data) {
        if (head == null) return;
        if (head.getData() == data) {
            head = head.getNext();
            return;
        }
        Node iterateNode = head;
        while (iterateNode != null) {
            if (iterateNode.getNext() != null) {
                if (iterateNode.getNext().getData() == data) {
                    if (iterateNode.getNext().getNext() != null) {
                        iterateNode.setNext(iterateNode.getNext().getNext());
                        break;//we wanna delete only first occurence
                    } else {
                        iterateNode.setNext(null);
                        return;
                        // return ;//no need to set the index to null ,by default it already is
                    }
                }

            }
            iterateNode = iterateNode.getNext();
        }
    }

    public void popBack() {
        if (head == null) return;
        Node iterator = head;
        while (iterator.getNext() != null) {
            if (iterator.getNext().getNext() == null) {
                iterator.setNext(null);
                return;
            }
            iterator = iterator.getNext();
        }
    }

    public void popFront() {
        if (head == null) return;
        Node tmp = head.getNext();
        head = tmp;

    }

    public void deleteAllOccurenceWithValue(int data) {
        if (head == null) return;
        if (head.getData() == data) {//if head is the node that has the data
            head = head.getNext();
        }
        Node tmp = head;
        while (tmp != null && tmp.getNext() != null) {
            while (tmp.getNext() != null && tmp.getNext().data == data) {
                tmp.setNext(tmp.getNext().getNext());
            }
            tmp = tmp.getNext();
        }
    }
    public void traverse(){
        if(head==null) {
            System.out.println("Empty linked list alert!!!!!!");
            return;
        }
        Node iterate=head;
        while(iterate!=null){
            System.out.println(iterate.getData());
            iterate=iterate.getNext();
        }
    }
    //5->3->22->1->null   becomes 3->5->22->1->null
    public void invertRecursive(Node head){
               Node previous=null;
               head=invertHelper(head,previous);

    }
    public Node invertHelper(Node current,Node previous){
                if(current==null)return previous;
                Node next=current.getNext();
                current.setNext(previous);
                return invertHelper(next,current);


    }
    public  void invert(){
        Node next;
        Node current=head;
        Node previous=null;
            // suppose we got  7 6 14 3**    next=6 next->previous(null)  previous ->7 current points next ->7
            while(current!=null){
                next=current.getNext();
                current.setNext(previous);
                previous=current;
                current=next;
            }
            head=previous;
        traverse();


    }
    public int getNthValue(int n){//supposedly given linkedlist is non empty
        Node tmp=head;
        int toBeReturnedNode=0;
        int counter=0;
        while(tmp!=null){
            if(counter==n) {
               return tmp.getData();
            }
            toBeReturnedNode = tmp.getData();
            tmp = tmp.getNext();
            counter++;
        }
        throw new IndexOutOfBoundsException("Invalid index");

    }
    public Node getNthNode(int n){//supposedly given linkedlist is non empty
        Node tmp=head;
        int toBeReturnedNode=0;
        int counter=0;
        while(tmp!=null){
            if(counter==n)return tmp;
            toBeReturnedNode = tmp.getData();
            tmp = tmp.getNext();
            counter++;
        }
        throw new IndexOutOfBoundsException("Invalid index");

    }
    public  int getSize(LinkedList l){
            int size=0;
            Node tmp=head;
            while(tmp!=null){
                    tmp=tmp.getNext();
                    size++;
            }
            return size;
    }
    public void traverseRecursive(Node head){
        if(head==null){
            return;
        }
        traverseRecursive(head.getNext());
    }
}
