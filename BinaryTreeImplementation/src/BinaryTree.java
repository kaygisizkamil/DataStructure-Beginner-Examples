import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private Node root;

    public void add(int data){
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
    public int findSize(){
        if(root==null){
            return 0;
        }
        return findSize(root);
    }
    public int findSize(Node current){
        if(current==null){
            return 0;
        }
        int leftSize=findSize(current.left);
        int rightSize=findSize(current.right);
        return leftSize+rightSize+1;
    }
    public int findHeight(){
        if(root==null){
            return 0;
        }
        return findHeight(root);
    }
    public int findHeight(Node current){
        if(current==null)return 0;
        int leftHeight=findHeight(current.left);
        int rightHeight=findHeight(current.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public int[] inOrderTraverse() {
        ArrayList<Integer> result = new ArrayList<>();
        inOrderTraverse(root, result);
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
    private void inOrderTraverse(Node current, ArrayList<Integer> result) {
        if (current == null) return;
        inOrderTraverse(current.left, result);
        result.add(current.data);
        inOrderTraverse(current.right, result);
    }
}
