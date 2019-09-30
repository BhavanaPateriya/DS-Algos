package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

  Queue<GraphNode> queue ;

  BFSTraversal(){

    queue = new LinkedList<>();
  }


  public void traverse(GraphNode node){
   node.setVisited(true);
   queue.add(node);
   while(!queue.isEmpty()){
     GraphNode poppedNode = queue.remove();
     ArrayList<GraphNode> neighbours = poppedNode.getNeighbours();
     System.out.print(poppedNode.getData() + ",");
     for(GraphNode  neighboursNode : neighbours){
       if(neighboursNode!=null && !neighboursNode.isVisited()){
         queue.add(neighboursNode);
         neighboursNode.setVisited(true);
       }

     }
   }

  }

}
