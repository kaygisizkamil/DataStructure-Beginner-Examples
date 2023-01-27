public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);

        // Test findSize() method
        int expectedSize = 7;
        int actualSize = tree.findSize();
        if (expectedSize == actualSize) {
            System.out.println("findSize() test passed!");
        } else {
            System.out.println("findSize() test failed. Expected: " + expectedSize + " but got: " + actualSize);
        }
        // Test findHeight() method
        int expectedHeight = 3;
        int actualHeight = tree.findHeight();
        if (expectedHeight == actualHeight) {
            System.out.println("findHeight() test passed!");
        } else {
            System.out.println("findHeight() test failed. Expected: " + expectedHeight + " but got: " + actualHeight);
        }
    }
}