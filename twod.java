import java.util.Scanner;

public class twod {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and coloums");
        int row =sc.nextInt();
        int colm=sc.nextInt();

        int marks[][]=new int[row][colm];
        
        System.out.println("Enter the values");
        for(int i=0;i<row;i++){
            System.out.println("New Row");

            for(int j=0;j<colm;j++){
                marks[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Matrix");

        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                System.out.print(marks[i][j]+" ");
            }
         System.out.println();
        }

        System.out.println("Search for: ");
        byte search = sc.nextByte();
        sc.close();
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                if(marks[i][j]==search){
                    System.out.println(search+"is at Row number: "+(i+1)+" Coloum number: "+(j+1));
                }
            }
        }
     }    
}
