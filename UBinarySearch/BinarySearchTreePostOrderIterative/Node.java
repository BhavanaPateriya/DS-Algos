package UBinarySearch.BinarySearchTreePostOrderIterative;

import java.util.Stack;

class Node {

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
  Stack<Node> s1 = new Stack();
  Stack<Node> s2 = new Stack<>();


  public void postOrder(Node root){
    s1.push(root);
    if (root == null)
    {
      return;
    }
    while(!s1.isEmpty()){
      Node temp = s1.pop();
      s2.push(temp);
     if(temp.left != null){
       s1.push(temp.left);
     }
     if(temp.right != null){
       s1.push(temp.right);
     }


    }

   while(!s2.empty()){
    // GraphNode temp = s2.pop() ;
     System.out.println(s2.pop().data+ " ");

   }



  }



}

class main{

  public static void main(String[] args) {

    Node root = null;
    root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
     TreeNode tree = new TreeNode();
     tree.postOrder(root);

  }

}