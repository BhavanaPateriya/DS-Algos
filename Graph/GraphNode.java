package Graph;

import java.util.ArrayList;

public class GraphNode {

    private boolean visited ;
    private int data ;
    private ArrayList<GraphNode> neighbours ;

    GraphNode(int data){
      neighbours = new ArrayList<>();
      this.data = data ;
    }

  public boolean isVisited() {
    return visited;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public void addneighbours(GraphNode node){

      this.neighbours.add(node);

  }

  public ArrayList<GraphNode> getNeighbours() {
    return neighbours;
  }

  public void setNeighbours(ArrayList<GraphNode> neighbours) {
    this.neighbours = neighbours;
  }
}
