
import java.util.Scanner;
public class Rectangle
{
    public static void main(String[] args)
    
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?: ");
        double length = s.nextDouble();
        System.out.println("What is the width of the rectangle?: ");
        double width = s.nextDouble();
        double area = length*width;
        double parimeter = (2*length) + (2*width);
        double diag = Math.pow(length,2)+Math.pow(width,2);
        diag = Math.sqrt(diag);
        System.out.println("The Area of the rectangle is: " + area);
        System.out.println("The perimiter of the rectangle is: " +parimeter);
        System.out.println("The length of the diagonal is: "+diag);
    }
}
        