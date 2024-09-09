import java.util.Scanner;

public class oddpattern {
    public static void main( String args[]){
        System.out.println("Enter any number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++){
                System.out.print(" ");

            }
            for(int k=0;k<2*i-1;k++)
            {
                System.out.print("$");
                
            }
            System.out.println(" ");
        
    }

}
}
