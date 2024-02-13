import javax.swing.*;
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price : ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price :");
        int sp = sc.nextInt();
        if (sp>cp)  {
            System.out.println("Profit is");
            System.out.println(sp-cp);}
        if (sp<cp) {System.out.println("Loss is "+(cp-sp));
        System.out.println(cp-sp);}
            else System.out.println("No Prifit No Loss");

        }
}
