public class Main {
    public static void main(String[] args) {
            LinkedList linkedList=new LinkedList();
            linkedList.prepend(31);
            linkedList.append(6);
            linkedList.append(7);
            linkedList.append(8);
            linkedList.append(9);
            linkedList.append(10);
            linkedList.append(31);

        System.out.println(linkedList.getNthNode(5));
        System.out.println(linkedList.getSize(linkedList));
     //   linkedList.invert(linkedList);
        linkedList.invert();
        linkedList.traverse();
     /*   System.out.println("before deleted----------------------------->");
        linkedList.traverse();
        System.out.println("lets pop back->>>>>>>>>>>>>>>>>>>>>>>>>");
        linkedList.popBack();
        linkedList.traverse();
        System.out.println("Lets pop front->>>>>>>>>>>>>>>>>>");
        linkedList.popFront();
        linkedList.traverse();
        System.out.println("Lets delete all the 31's");
        linkedList.deleteAllOccurenceWithValue(31);
        linkedList.traverse();
        System.out.println("Lets delete only one 10 from the list(first occurence)");
        linkedList.deleteOnceWithValue(10);
        linkedList.traverse();*/
    }
    // lets say we got head->7->10->4
// poush front for the element that is gonna be pushed,point this to first
// 24->7->10->4
// then point head to the first o(1)
// head->24->7...

// for pop front update the head pointer point it to old first (7) than deletw
// 24 o(1)

// for push back and pop back start from head iterate through last and add
// or delete it o(n)

// push back with tail allocate the node ,point end of the linked list
// to new added node and then point tail to last node o(1)

// for pop back start from beginning come to last-1 ,update tail for
// pointing tail to last and delete the before last o (n)

}