import java.util.*;

public class rhombus{

    public static void rhombus(int rows){
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j <= (rows-i) ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter row:");
            int a = sc.nextInt();
            rhombus(a);
        }
    }   
}
