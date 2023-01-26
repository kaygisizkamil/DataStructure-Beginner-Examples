public class BinaryTree {
    private Node root;

    public void addNode(int data){
            if(root==null){
                root=new Node(data);
            }
            else{
                add(root,data);
            }
    }
    //suppose we got the input as 8-6-4-7 (7 is not valid is not gonna be binary tree drawing is just for better unds.
    //first we assigned root to 8
    //control the 6 root of the tree is 8 and left child is null then assign it tree become   8
    /*                                                                                       /
                                                                                            6
                                                                                           / \
                                                                                          4   7
     //for 4 , root.left is not null recursive call add(6.left,4)=current become which is null andd 4 to left
     //for 7 after second recursion in third recursion 7>6 since current is 6 so place node the rigt of the  6

    //helper
*/
    private void add(Node current,int data){
            if(data<current.data){
                    if(current.left==null){
                        current.left=new Node(data);
                    }
                    else{
                        add(current.left,data);
                    }
            }
            else if(data>current.data){
                if(current.right==null){
                    current.right=new Node(data);
                }
                else{
                    add(current.right,data);
                }
            }
    }
}
