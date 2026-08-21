  import java.util.Scanner;
  
  public class Array{
        public static void main(String args[]){
        //     Scanner sc = new  Scanner(System.in);
        //     int row  = sc.nextInt();
        //     int cols = sc.nextInt();
        //     int[][] numbers = new int[row][cols];
        //     // input row 
        // for(int i = 0; i<row; i++){
        //     //cols
        //     for(int j = 0; j<cols; j++){
        //         numbers[i][j] = sc.nextInt();
                
        //     }
        // }
        // //output 
        // for(int i = 0; i<row; i++){
        //     for(int j =0; j<cols; j++){
        //         System.out.print(numbers[i][j] +" ");

        //     }
        // System.out.println();
        // }
       Scanner sc = new Scanner(System.in);
       int row = sc.nextInt();
       int cols = sc.nextInt();
       int[][] numbers = new int[3][3];
         for(int i =0 ; i<3; i++){
            for(int j = 0; j<3; j++){
                numbers[i][j]= sc.nextInt();
            }
         }
         for( int i = 0 ; i<3; i++){
                for(int j = 0; j<3; j++){
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();   
    
         }














    }






}