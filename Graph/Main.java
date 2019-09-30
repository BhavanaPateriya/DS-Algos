package Graph;

public class Main {


  public static void main(String[] args) {


    GraphNode node40 =new GraphNode(40);
    GraphNode node10 =new GraphNode(10);
    GraphNode node20 =new GraphNode(20);
    GraphNode node30 =new GraphNode(30);
    GraphNode node60 =new GraphNode(60);
    GraphNode node50 =new GraphNode(50);
    GraphNode node70 =new GraphNode(70);

    node40.addneighbours(node10);
    node40.addneighbours(node20);
    node10.addneighbours(node30);
    node20.addneighbours(node10);
    node20.addneighbours(node30);
    node20.addneighbours(node60);
    node20.addneighbours(node50);
    node30.addneighbours(node60);
    node60.addneighbours(node70);
    node50.addneighbours(node70);

BFSTraversal traversal = new BFSTraversal();
traversal.traverse(node40);
//40 10 20 30 60 50 70

  }

}
