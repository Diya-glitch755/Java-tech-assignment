import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

       
        double bmi = weight / (height * height);

       
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        
        System.out.printf("BMI = %.2f (%s)%n", bmi, category);

        sc.close();
    }
}