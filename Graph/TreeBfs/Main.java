package Graph.TreeBfs;

import com.sun.source.tree.BinaryTree;

public class Main {


  public static void main(String[] args) {


    BSTraversalLevelOrder tree = new BSTraversalLevelOrder();
    tree.root= new Node(1);
    tree.root.setLeftChild(new Node(2));
    tree.root.setRightChild(new Node(3));
    tree.root.getLeftChild().setLeftChild(new Node(4));
    tree.root.getLeftChild().setRightChild(new Node(5));
    tree.traverseLevelOrder(tree.root);

  }

}
