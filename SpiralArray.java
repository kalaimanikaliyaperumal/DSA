


import java.util.*;
public class SpiralArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        // input a matrix
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        printSpiralMatrix(matrix);
    }

    public static void printSpiralMatrix(int[][] arr)
    {
        // declare a 4 variable for starting and ending 
        int minR = 0;
        int maxR = arr.length-1;
        int minC = 0;
        int maxC = arr[0].length-1;

        //just declare while loop to iterate whole matrix one by one
        while( minR <= maxR && minC <= maxC  )
        {
            // for loop for top row 
            for(int i=minC; i<=maxC; i++)
            {
                System.out.print(arr[minR][i]+" ");
            }
            // After printing all the elements of the first row then increase the pointer of the minR
            minR++;
            System.out.println();

            // for loop for end col
            for(int i=minR; i<=maxR; i++)
            {
                System.out.print(arr[i][maxC]+" ");
            }
            maxC--;
            System.out.println();

            //This condition occur when you do not need to interate further
            if(minR>=maxR  || minC>=maxC)
                break;

            //  for loop for bottom row
            for(int i=maxC; i>=minC; i--)
            {
                System.out.print(arr[maxR][i]+" ");
            }
            maxR--;
            System.out.println();
            
            //  for loop for first col
            for(int i=maxR; i>=minR; i--)
            {
                System.out.print(arr[i][minC]+" ");
            }
            minC++;
            System.out.println();
        }


    }
}

//1 2 3
//4 5 6
//7 8 9