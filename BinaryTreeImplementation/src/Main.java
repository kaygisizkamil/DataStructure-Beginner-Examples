import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

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

        testFindSize(tree);
        testFindHeight(tree);
        testInOrderTraverse(tree);
        testPreOrderTraverse(tree);
        testPostOrderTraverse(tree);
    }

    public static void testFindSize(BinaryTree tree) {
        int expectedSize = 7;
        int actualSize = tree.findSize();
        assertTest("findSize()", expectedSize, actualSize);
    }

    public static void testFindHeight(BinaryTree tree) {
        int expectedHeight = 3;
        int actualHeight = tree.findHeight();
        assertTest("findHeight()", expectedHeight, actualHeight);
    }

    public static void testInOrderTraverse(BinaryTree tree) {
        int[] expectedOrder = new int[] {2, 3, 4, 5, 6, 7, 8};
        int[] actualOrder = tree.inOrderTraverse();
        assertArrayTest("inOrderTraverse()", expectedOrder, actualOrder);
    }

    public static void testPreOrderTraverse(BinaryTree tree) {
        int[] expected = new int[] {5, 3, 2, 4, 7, 6, 8};
        int[] actual = tree.preOrderTraverse();
        assertArrayTest("preOrderTraverse()", expected, actual);
    }

    public static void testPostOrderTraverse(BinaryTree tree) {
        int[] expectedPostOrder = {2, 4, 3, 6, 8, 7, 5};
        int[] resultPostOrder = tree.postOrderTraverse();
        assertArrayTest("postOrderTraverse()", expectedPostOrder, resultPostOrder);
    }

    public static void assertTest(String testName, int expected, int actual) {
        if (expected == actual) {
            System.out.println(testName + " test passed!");
        } else {
            System.out.println(testName + " test failed. Expected: " + expected + " but got: " + actual);
        }
    }

    public static void assertArrayTest(String testName, int[] expected, int[] actual) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " test passed!");
        } else {
            System.out.println(testName + " test failed. Expected: " + Arrays.toString(expected) + " but got: " + Arrays.toString(actual));
        }
    }
}