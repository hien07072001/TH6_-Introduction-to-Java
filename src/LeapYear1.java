import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a%4==0){
            if (a%400==0){
                if (a%100==0){
                    System.out.println("la nam nhuan");
                }else {
                    System.out.println("khong la nam nhuan");
                }
            } else{
                System.out.println("la nam nhuan");
            }
        }else{
            System.out.println("khong la nam nhuan");
        }

    }
}
