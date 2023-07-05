import java.util.Scanner;
//I have named my file 'twod'||you can name anything:)
public class twod {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //taking input of row and columns 
        System.out.println("Enter row and coloums");
        int row =sc.nextInt();
        int colm=sc.nextInt();

        /*this is called two dimestion array,
        this is like a matrix
            1 2 3
            3 2 1 
            this was a example of 2x3 matrix */
        int marks[][]=new int[row][colm];

        //taking all values
        System.out.println("Enter the values");
        for(int i=0;i<row;i++){
            System.out.println("New Row");

            for(int j=0;j<colm;j++){
                marks[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Matrix");
    //printing all values in order
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                System.out.print(marks[i][j]+" ");
            }
         System.out.println();
        }

    //searching a specific value given by user, and showing its row and column number.
        System.out.println("Search for: ");
        byte search = sc.nextByte();
        sc.close();
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                if(marks[i][j]==search){
    //in java count start from zero, and we also took took i and j from 1, if a number we are searching is in row 1 it will show 0 so we added +1 in row number and coloum number
                    System.out.println(search+"is at Row number: "+(i+1)+" Coloum number: "+(j+1));
                }
            }
        }
     }    
}
