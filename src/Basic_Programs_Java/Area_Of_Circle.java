package Basic_Programs_Java;

import java.util.*;
public class Area_Of_Circle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius Of Circle : ");
        int radius = sc.nextInt();
        float area = 3.14f;

        float AreaOfCircle = area * radius * radius;
        System.out.println("Area Of Circle Is : "+AreaOfCircle);


    }

}
