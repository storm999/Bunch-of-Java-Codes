import java.util.Scanner;
public class Mail {

	public static void main(String[] args) {
		 int m, n, q, sum = 0, c, d, k;
		 
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter the number of rows and columns of first matrix");
	      m = in.nextInt();
	      n = in.nextInt();
	      System.out.println("Enter the number of rows and columns of second matrix");
	      n = in.nextInt();
	      q = in.nextInt();
	     
	      int first[][] = new int[m][n];
	      int second[][] = new int[n][q];
	      int multiply[][] = new int[m][q];
	         
     
         for ( int i = 0 ; i < m ; i++ )
         {
            for ( int j = 0 ; j < q ; j++ )
            {   
               for ( k = 0 ; k < n ; k++ )
               {
                  sum = sum + first[i][k]*second[k][j];
               }
               multiply[i][j] = sum;
               sum = 0;
            }
         } 
	      
	  }
	}


