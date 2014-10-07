import java.util.Scanner;
public class StringParsing
{
    public static void main(String[] args)
    
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a number between 1,000 and 999,999 including the comma: ");
        String number = s.next();
        int commaLoc = number.indexOf(",");
        number = number.substring(0,commaLoc)+number.substring(commaLoc+1,number.length());
        System.out.println("The number without a comma is: "+number);
    }
}