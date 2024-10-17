package PersonStudentTeacher.ShapeCircleRectangleCube;

import java.util.Scanner;

public class SCRCTester {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Pilih\n 1. Rectangle\n 2. Circle\n 3. Cube");
        String pilihan = s.nextLine();

        if (pilihan.equalsIgnoreCase("1")) {
            System.out.println("--Rectangle--");
            System.out.println("Name: ");
            String name = s.nextLine();
            System.out.println("Color: ");
            String color = s.nextLine();
            System.out.println("Length: ");
            int length = s.nextInt();
            System.out.println("Width: ");
            int width = s.nextInt();
            Rectangle r1 = new Rectangle(name, color, length, width);
            r1.print();
            r1.luas();
        }else if (pilihan.equalsIgnoreCase("2")) {
            System.out.println("--Circle--");
            System.out.println("Name: ");
            String name = s.nextLine();
            System.out.println("Color: ");
            String color = s.nextLine();
            System.out.println("Radius: ");
            int radius = s.nextInt();
            Circle c1 = new Circle(name, color, radius);
            c1.print();
            c1.luas();
        }else if (pilihan.equalsIgnoreCase("3")) {
            System.out.println("--Cube--");
            System.out.println("Name: ");
            String name = s.nextLine();
            System.out.println("Color: ");
            String color = s.nextLine();
            System.out.println("Length: ");
            int length = s.nextInt();
            System.out.println("Width: ");
            int width = s.nextInt();
            System.out.println("height: ");
            int height = s.nextInt();
            Cube r2 = new Cube(name, color, length, width, height);
            r2.print();
            int luas = (length*width*height);
            System.out.println("luas dari kubik =" + luas);
        }
    }
    
}
