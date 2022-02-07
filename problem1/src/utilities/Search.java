package utilities;

public class Search {
  public static long time;

  public static boolean sequencialSearch(int[][] arrayToSearch){
    return true;
  }

  public static boolean binarySearch(int[][] arrayToSearch){
    return true;
  }

  // delete this, just example
  
  public static boolean normalBinarySearch(int[] arrayToSearch){

    
    int start = 0;
    int end = arrayToSearch.length;
    
    // supose a goal
    int goal = 8;
    
    while(start <= end){
      //updating the middle
      int middle = (start+end)/2;

      if(arrayToSearch[middle] == goal ){
        System.out.println("Time to find: " + time + " nanoseconds");
        return true;
      }else if( arrayToSearch[middle] > goal ){
        // end has to be less than middle
        end = middle - 1;
      }else if(arrayToSearch[middle] < goal ) {
         // start has to be more than middle
         start = middle + 1;
      }

    }

    return false;
  }

}
