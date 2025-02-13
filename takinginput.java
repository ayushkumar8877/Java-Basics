import java.util.Scanner;
public class takinginput {
    public static void main(String[] args){
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter 2nd number");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a+b;
        sc.close();
        System.out.println("the sum of these number");
        System.out.println(sum);
        
    }
    
}
