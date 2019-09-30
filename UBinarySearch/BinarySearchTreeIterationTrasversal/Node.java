package UBinarySearch.BinarySearchTreeIterationTrasversal;

import java.util.Stack;

public class Node {

  public int data ;
  public Node left ;
  public Node right ;
  Node(int data){

    this.data = data ;
    left =null ;
    right = null;
  }


}

class TreeNode{

  public Node root ;

  public void inOrder(){

    // we will use stack
    Stack<Node> stack = new Stack<>();
    Node current = root ;
    while(current!=null || stack.size() >0 ){

      while(current !=null){

        stack.push(current);
        current = current.left ;

      }
      current = stack.pop();
      System.out.print(current.data + " ");
      current = current.right;


    }





  }

}

class main{

  public static void main(String[] args) {
    TreeNode tree = new TreeNode();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.inOrder();


  }

}