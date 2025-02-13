import java.util.Scanner;
public class Week {
    public static void main(String [] args){
        System.out.println("Enter any day");
        Scanner sc = new Scanner(System.in);
        int Day;
        Day=sc.nextInt();
        sc.close();
        switch(Day){
            case 1:
                 System.out.println("Monday");
                 break;
            case 2:
                 System.out.println("Tueday");
                 break;
            case 3:
                 System.out.println("Wenesday");
                 break;
            case 4:
                 System.out.println("Thrusday");
                 break;
            case 5:
                 System.out.println("Friday");
                 break;
            case 6:
                 System.out.println("Saturday");
                 break;
            case 7:
                 System.out.println("Sunday");
                 break;
        }
        if(Day <1 || Day>7){
            System.out.println("Bhkk burbk week me seven days hi homta hai na");
        }

        

    }
    
}
