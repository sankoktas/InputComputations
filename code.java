/** This program makes computations 
 * @author (Fikri San Koktas)
 * @version (13 January 2021)*/
import java.util.Scanner;
public class KFS_InputComputations_Main
{
    public static void main(String[] args)
    {
        System.out.println("When've entered all your numbers, you should enter a letter so that program can start computing.");
        System.out.println("If you enter a letter prior to entering a number the program crashes");
        //objective a 
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        double num = input.nextDouble();
        double minimum = num;
        double maximum = num;
        System.out.print("Number: ");
        while (input.hasNextDouble()) 
        {
            System.out.print("Number: ");
            num = input.nextDouble();
            if (num < minimum) 
            {
                minimum = num;
            }
            else if (num > maximum) 
            {
                maximum = num;
            }
        }
        System.out.println("Smallest number: " + minimum);
        System.out.println("Largest number: " + maximum);

        //objective b 
        Scanner Alex = new Scanner(System.in);
        int num_odd = 0;
        int num_even = 0;
        System.out.print("Number: ");
        while (Alex.hasNextDouble()) 
        {
            double Alex_number = Alex.nextDouble();
            if (Alex_number % 2 == 0) 
            {
                num_even += 1;
            }
            else 
            {
                num_odd += 1;
            }
            System.out.print("Number: ");
        }
        System.out.println("Odd numbers: " + num_odd);
        System.out.println("Even numbers: " + num_even);

        //objective c
        Scanner Carlos = new Scanner(System.in);
        double sum = 0;
        String sum_out = "";
        System.out.print("Numbers: ");
        while (Carlos.hasNextDouble()) {
            double Carlos_number = Carlos.nextDouble();
            sum += Carlos_number;
            sum_out += String.format("%s ", String.valueOf(sum));
        }
        System.out.println(sum_out);

        //objective d 
        Scanner Persie = new Scanner(System.in);
        String check_duplicates = "";
        System.out.print("Number: ");
        double Persie_number = Persie.nextDouble();
        double prev_num = Persie_number;
        boolean first_num = true;
        while (Persie.hasNextDouble()) 
        {
            System.out.print("Number: ");
            Persie_number = Persie.nextDouble();
            if (first_num != true && Persie_number == prev_num) 
            {
                check_duplicates += String.format("%s ", Persie_number);
            }
            first_num = false;
            prev_num = Persie_number;
        }
        System.out.println(check_duplicates);
    }
}
