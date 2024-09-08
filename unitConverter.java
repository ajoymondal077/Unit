import java.util.*;
class unitConverter{
    public static double inchesToCentimeter(double inches)
    {
        return inches * 2.54;
    }
    public static double centimeterToInches(double centimeter)
    {
        return centimeter / 2.54;
    }
    public static double farhenhiteToCelsious(double farhenhite)
    {
        return (farhenhite - 32) * 5 / 9;
    }
    public static double celsiousToFarhenhite(double celsious)
    {
        return (celsious * 9 / 5) + 32;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unit Converter");
        System.out.println("1. Inches to Centimeter");
        System.out.println("2. Centimeter to Inches");
        System.out.println("3. Farhenhite to Celsious");
        System.out.println("4. Celsious to Farhenhite");
        System.out.print("Enter your choice:");
        int choice = sc.nextInt();
        System.out.println("Enter the value:");
        double value = sc.nextDouble();
        double result;
        switch(choice)
        {
            case 1:  
                result = inchesToCentimeter(value);
                System.out.printf("%.2f Inches = %.2f Centimeter",value,result);
                break;
            case 2:
                result = centimeterToInches(value);
                System.out.printf("%.2f Inches = %.2f Centimeter",value,result);
                break;
            case 3:
                result = farhenhiteToCelsious(value);
                System.out.printf("%.2f Farhenhite = %.2f Celsious",value,result);
                break;
            case 4:
                result = celsiousToFarhenhite(value);
                System.out.printf("%.2f Celsious = %.2f Farhenhite",value,result);
                break;
            default:
                System.out.println("Invalid option");
        }
        sc.close();
    }
}