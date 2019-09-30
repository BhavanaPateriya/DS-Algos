package Graph.TreeBfs;

import java.util.LinkedList;
import java.util.Queue;

public class BSTraversalLevelOrder {

  public Node root ;

   public void traverseLevelOrder(Node root){

     Queue<Node> queue = new LinkedList<>();
     queue.add(root);
     while(!queue.isEmpty()){
       Node poppedNode = queue.remove();
       System.out.print(poppedNode.getData() + ",");
       queue.add(poppedNode.getLeftChild());
       queue.add(poppedNode.getRightChild());
     }


   }


   }





