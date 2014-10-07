import java.util.Scanner;

public class PhoneNumbers
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your phone number");
        String number = s.next();
        String beginning = "("+number.substring(0,3)+") ";
        String threeDigits = number.substring(3,6)+"-";
        String fourDigits = number.substring(6,10);
        number = beginning+threeDigits+fourDigits;
        System.out.println(number);
    }
}