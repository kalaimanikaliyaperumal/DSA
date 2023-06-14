import java.io.*;
class CFG {
 
  public static int R = 5;
  public static int C = 4;
 
  // Function to print wave
  // Form for a given matrix
  public static void WavePrint(int m, int n, int[][] arr)
  {
     
    // Loop to traverse matrix
    for (int j = 0; j < n; j++) {
 
      // If the current column
      // is even indexed, print
      // it in forward order
      if (j % 2 == 0) {
        for (int i = 0; i < m; i++) {
          System.out.print(arr[i][j] + " ");
        }
      }
 
      // If the current column
      // is odd indexed, print
      // it in reverse order
      else {
        for (int i = m - 1; i >= 0; i--) {
          System.out.print(arr[i][j] + " ");
        }
      }
    }
  }
 

  public static void main (String[] args)
  {
    int[][] arr = { { 1, 2, 3, 4 },
                   { 5, 6, 7, 8 },
                   { 9, 10, 11, 12 },
                   { 13, 14, 15, 16 },
                   { 17, 18, 19, 20 } };
 
    WavePrint(R, C, arr);
  }
}
