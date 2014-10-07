import java.util.Scanner;
public class Annuity
{
    public static void main(String[] args)
    
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the intrest rate?: ");
        double i = s.nextDouble();
        System.out.println("What is the amount of years?: ");
        double n = s.nextDouble();
        System.out.println("What is the amount of starting money?: ");
        int PMT = s.nextInt();
        double powers = Math.pow((1+i),(n-1));
        double top = powers -1;
        double bottom = powers;
        double pV = PMT*((((powers-1)/i)/(powers))+1);
        System.out.println(pV);
    }
}