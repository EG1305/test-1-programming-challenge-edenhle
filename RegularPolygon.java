import java.util.Scanner;

public class RegularPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user enters sides and length
        System.out.println("Please enter number of sides");
        int sides = scanner.nextInt();
        System.out.println("Please enter length of each side");
        int length = scanner.nextInt();

        //program displays sides and length user entered
        System.out.println("There are " + sides + " sides");
        System.out.println("The length of each side is " + length);

        scanner.close();

        String polygon = identifyPolygon(sides);
        double perimeter = calculatePerimeter(sides, length);
        double area = calculateArea(area);
        //double calculateArea;

    }

    //identifies the polygon depending on the number of sides user enters
    public static String identifyPolygon(int sides)   {
        if (sides == 3)  {
            //System.out.println("Triangle");
            return "triangle";
        }

        else if (sides == 4)  {
            return "Square";
            //System.out.println("Square");
        }

        else if (sides == 5)  {
            return "Pentagon";
            //System.out.println("Pentagon");
        }
                return null;

    }

    //calculates perimeter
    public double calculatePerimeter(int sides, double length)  {
       double perimeter;
        perimeter = sides * length;
        return perimeter;
       // System.out.println("The perimeter of the polygon is " + perimeter);
    }

    //calculates area
    public double calculateArea(int sides, double length)  {
       double area;
        area = (sides * length * length)/(4 * Math.tan(Math.PI/sides));
        //System.out.println("The area of the polygon is " + area);
        return area;
    }
}