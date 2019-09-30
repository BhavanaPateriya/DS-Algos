package Heap;

public class Heap {

   public int[] heap ;
   public int size ;

   Heap(int capacity){
     heap = new int[capacity];
   }

   public boolean isFull(){
     return size == heap.length ;
   }

  public int getParent(int index){
     return ( index -1 ) / 2 ;
  }

  public void insert(int value){
     if(isFull()){
       throw new IndexOutOfBoundsException("Heap is full");
     }
     heap[size] = value ;
     heapifyAbove(size);
     size++ ;

  }

  public void heapifyAbove(int index){
    int newValue  = heap[index];

     while(index > 0 && heap[index] > heap[getParent(index)]){
          heap[index] = heap[getParent(index)];
          index = getParent(index);
     }

     heap[index] = newValue ;

  }

  public void printHeap(){


     for(int i=0;i<heap.length;i++){

       System.out.print(heap[i]+",");

     }



  }

}
