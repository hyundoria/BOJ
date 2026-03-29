import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

class Node {

    String str;
    Node right;
    Node left;

    Node(String str) {
        this.str = str;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
       this.right = right;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}

class tree {

    int size;
    Node root;

    public tree() {

        size = 0;
        root = null;

    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void put(Node node, String str, int i) {

        Stack<Node> stack = new Stack<>();
        ArrayList<String> list = new ArrayList<>();

        stack.add(root);
        list.add(root.str);


        while (!stack.isEmpty()) {

            Node temp = stack.peek();

            if (Objects.equals(temp.getStr(), str)) {

                if (i == 1) {
                    temp.left = node;
                }
                else {
                    temp.right = node;
                }
                break;
            }
            else {
                if (temp.left != null && !list.contains(temp.left.str)) {
                    stack.push(temp.left);
                    list.add(temp.left.str);
                }
                else if(temp.right != null && !list.contains(temp.right.str)) {
                    stack.push(temp.right);
                    list.add(temp.right.str);
                }
                else {
                    stack.pop();
                }
            }

        }
        size++;
    }


    public void inorder(Node node) {

        if (node != null) {

            inorder(node.getLeft());
            System.out.print(node.getStr());
            inorder(node.getRight());

        }
    }

    public void preorder(Node node) {

        if (node != null) {
            System.out.print(node.getStr());
            preorder(node.getLeft());
            preorder(node.getRight());

        }
    }

    public void postorder(Node node) {

        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getStr());
        }
    }


}

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");


        tree tree = new tree();

        tree.setRoot(new Node(arr[0]));

        if (!arr[1].equals(".")) {
            tree.getRoot().setLeft(new Node(arr[1]));
        }
        if (!arr[2].equals(".")) {
            tree.getRoot().setRight(new Node(arr[2]));
        }

        for (int i = 0; i < n-1; i++) {

            arr = br.readLine().split(" ");

            for (int j = 1; j < 3; j++) {

                if (!arr[j].equals(".")) {

                    if (j == 1) {
                        tree.put(new Node(arr[1]), arr[0], j);
                    } else {
                        tree.put(new Node(arr[2]), arr[0], j);
                    }
                }

            }

        }

        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);

        





    }
}
