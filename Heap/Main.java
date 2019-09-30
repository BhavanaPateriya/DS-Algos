package Heap;

public class Main {


  public static void main(String[] args) {

    Heap heap = new Heap(10);
    heap.insert(10);
    heap.insert(23);
    heap.insert(21);
    heap.insert(5);
    heap.printHeap();

  }

}
