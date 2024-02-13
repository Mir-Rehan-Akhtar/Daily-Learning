import java.util.Scanner;

public class Rctangle_Area_and_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  leanth of the rectangle :");
        double l = sc.nextDouble();
        System.out.println("Enter the breagth of the rectangle ");
        double b = sc.nextDouble();
        double a = l*b;
        double p = 2*(l+b);
        if(a<p)
            System.out.println("Area is less than Perimeter" );
        if(a>p)
            System.out.println("Area is greater than Perimter");
        if(a==p)
            System.out.println("Area is equal to Primeter");
    }
}
