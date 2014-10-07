
import java.util.Scanner;

public class GiveChange

{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the amount due in pennys: ");
        int due = s.nextInt();
        System.out.println("How much did they pay you? in pennys: ");
        int payment = s.nextInt();
        int change = payment-due;
        int subtract = 0;
        int quarters = change/25;
        if (quarters >= 1){
            subtract = quarters*25;
            change = change-subtract;
        }
        int dimes = change/10;
        if (dimes >= 1){ 
            subtract = dimes*10;
            change = change-subtract;
        }
        int nickels = change/5;
        if (nickels >= 1){
            subtract = nickels*5;
            change = change-subtract;
        }
        int pennys = change/1;
        System.out.println(quarters+" quarters "+dimes+ " dimes "+nickels+" nickels "+pennys+" pennys ");
    }
}
    