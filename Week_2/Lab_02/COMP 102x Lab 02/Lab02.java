import comp102x.IO;
import java.lang.Math;

public class Lab02
{
    
    public static void multiply()
    {
        // Please write your code after this line
        int x;
        int y;
        int result_calculated;
        
        IO.output("Enter an integer, x: ");
        x = IO.inputInteger();
        
        IO.output("Enter an integer, y: ");
        y = IO.inputInteger();
        
        result_calculated = x*y;
        
        IO.outputln("Answer = " + result_calculated);
       
        
        
        
        
    }
    
    public static void calculateTriangleArea()
    {
        // Please write your code after this line
           double width;
        double height;
        double result_area;
        
        IO.output("Enter the width of the triangle: ");
        width = IO.inputDouble();
        
        IO.output("Enter the height of the triangle: ");
        height = IO.inputDouble();
        
        result_area = (width*height)/2;
        
        IO.outputln("The triangle area = " + result_area);
        
        
        
        
    }
    
    public static void solveQuadraticEquation()
    {
        // Please write your code after this line
        double a;
        double b;
        double c;
        double first_solution;
        double second_solution;
        
        IO.output("Enter a: ");
        a = IO.inputDouble();
        
        IO.output("Enter b: ");
        b = IO.inputDouble();
        
        IO.output("Enter c: ");
        c = IO.inputDouble();
        
        first_solution = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        
        second_solution = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        
        IO.outputln("First solution for x = " + first_solution);
        IO.outputln("Second solution for x = " + second_solution);
        
       
        
        
    }
}
