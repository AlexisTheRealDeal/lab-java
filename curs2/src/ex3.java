import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pentru grade Celsius introduceti 1\nPentru grade Fahrenheit introduceti 2");
        int a = sc.nextInt();
        if (a == 2) {
            System.out.println("Introduceti temperatura in grade Fahrenheit: ");
            double t = sc.nextDouble();
            double temp = (t - 32) * 5 / 9;
            System.out.println("\nTemperatura in grade Celsius este: " + temp);
        }
        else  {
            System.out.println("Introduceti temperatura in grade Celsius: ");
            double t = sc.nextDouble();
            double temp = t * 1.8 + 32;
            System.out.println("\nTemperatura in grade Fahrenheit este: " + temp);
        }



    }}