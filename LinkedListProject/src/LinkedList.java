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
        Node iterator=head;
        while(iterator!=null){
            System.out.println(iterator.getData());
            iterator=iterator.getNext();
        }
    }
}
