package DivideAndConquer;

public class NumberOfPathsForGivenCost {

  public static void main(String[] args) {

    int[][] array = {{1,3,4},{2,5,6}};
    System.out.println(calculatePath(array,1,2,30));

  }


  public static int calculatePath(int[][] array,int row , int col,int cost){


    //base case
    if(cost<0){

      return 0;
    }

    if(col==0 && row==0){

      return cost - array[row][col] == 0 ?1:0 ;

    }

    if(row==0){

      return calculatePath(array,0,col-1,cost-array[0][col]);
    }
    if(col==0){

      return calculatePath(array,row-1,col,cost-array[row][0]);
    }



    int c1 = calculatePath(array,row-1,col,cost - array[row][col]);
    int c2 = calculatePath(array,row,col-1,cost - array[row][col]);
    return c1+c2 ;



  }

}
