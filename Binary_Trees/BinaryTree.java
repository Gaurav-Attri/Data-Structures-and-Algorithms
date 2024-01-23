import java.util.Scanner;

public class BinaryTree {
    Node root;

    BinaryTree(){
        this.root = null;
    }
    
    private class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the root value: ");
        int value = input.nextInt();
        root = new Node(value);
        populateTree(this.root, input);
    }

    private void populateTree(Node root, Scanner input){
        System.out.println("Do you want to insert in the left of " + root.value + ": ");
        boolean response = input.nextBoolean();
        if(response){
            System.out.println("Please enter the left value: ");
            int value = input.nextInt();
            root.left = new Node(value);
            populateTree(root.left, input);
        }

        System.out.println("Do you want to insert in the right of " + root.value + ": ");
        response = input.nextBoolean();
        if(response){
            System.out.println("Please enter the right value: ");
            int value = input.nextInt();
            root.right = new Node(value);
            populateTree(root.right, input);
        }
    }

    public void display() throws Exception{
        if(root == null) throw new Exception("Tree is empty");
        displayHelper(root, "");
    }

    private void displayHelper(Node node, String indent){
        System.out.println(indent + node.value);
        if(node.left != null) displayHelper(node.left, indent.concat("\t"));
        if(node.right != null) displayHelper(node.right, indent.concat("\t"));
    }
}
