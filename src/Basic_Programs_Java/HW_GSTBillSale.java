package Basic_Programs_Java;

import java.util.*;
import java.util.Scanner;

public class HW_GSTBillSale {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Price Of Pencil : ");
        int Pencil = sc.nextInt();

        System.out.println("Enter The Price Of Pen    : ");
        int Pen = sc.nextInt();

        System.out.println("Enter The Price Of Eraser : ");
        int Eraser = sc.nextInt();

        float TotalCost = Pencil + Pen + Eraser;
        System.out.println("Total Cost Of Sale Bill Product Is : " +TotalCost);

        float GST_Tax = (0.18f * TotalCost);
        System.out.println("GST Tax 18% Add : "+GST_Tax);

        float GST_18 = TotalCost + (0.18f * TotalCost);

        System.out.println("GST Of Final Products Tax 18% Allowed : "+GST_18);
    }
}
