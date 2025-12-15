import java.util.Scanner;

public class TempConverter
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        int choice; 

        do {
            System.out.println("\nTemperature Converter");

            System.out.println("Choose conversion type:");

            System.out.println("1. Celsius to Fahrenheit");

            System.out.println("2. Celsius to Kelvin");

            System.out.println("3. Fahrenheit to Celsius");

            System.out.println("4. Fahrenheit to Kelvin");

            System.out.println("5. Kelvin to Celsius");

            System.out.println("6. Kelvin to Fahrenheit");

            System.out.println("7. Exit");

            System.out.print("Enter your choice (1-7): ");

            choice = sc.nextInt();

            if (choice == 7) 
		{
                System.out.println("Exiting program. Thank you!");
                break; // exit the loop
            }

            System.out.print("Enter temperature: ");

            double temp = sc.nextDouble();

            double result = 0;


            switch (choice) 
		{
                case 1: result = (temp * 9/5) + 32; System.out.println(temp + " °C = " + result + " °F"); break;

                case 2: result = temp + 273.15; System.out.println(temp + " °C = " + result + " K"); break;

                case 3: result = (temp - 32) * 5/9; System.out.println(temp + " °F = " + result + " °C"); break;

                case 4: result = (temp - 32) * 5/9 + 273.15; System.out.println(temp + " °F = " + result + " K"); break;

                case 5: result = temp - 273.15; System.out.println(temp + " K = " + result + " °C"); break;

                case 6: result = (temp - 273.15) * 9/5 + 32; System.out.println(temp + " K = " + result + " °F"); break;

                default: System.out.println("Invalid choice! Please select 1-7.");
            }

        } while (choice != 7);

        sc.close();
    }
}