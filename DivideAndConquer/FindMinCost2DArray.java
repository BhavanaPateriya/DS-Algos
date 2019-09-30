package DivideAndConquer;

public class FindMinCost2DArray {


  public static void main(String[] args) {

 int[][] arr = {{1,2},{4,5}};

    System.out.println(findMinCost(arr,1,1));

  }




  public static int findMinCost(int[][] array2d,int row , int col){

  if(row == 0 && col == 0)  {

    return array2d[0][0];

  }
  if(row == -1 || col == -1){

    return Integer.MAX_VALUE;
  }

  int c1 = findMinCost(array2d,row-1,col);
  int c2 = findMinCost(array2d,row,col-1);
  int c4 = Integer.min(c1,c2);
  int cellscost = array2d[row][col];
    System.out.println("cells cost : "+cellscost);
  return c4+cellscost;


  }

}
