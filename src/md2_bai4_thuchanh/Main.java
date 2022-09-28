package md2_bai4_thuchanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the width");
        double width = scanner.nextDouble();
        System.out.println("enter the height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("your Rectangle \n"+rectangle.display());
        System.out.println("perimeter of the Rectangle :"+rectangle.getPerimeter());
        System.out.println("area of the Rectangle :"+rectangle.getarea());
    }
}
