import java.util.Scanner; 

public class W05E02 {
    public static void main(String[] args) {

      
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input; 

        do {
            System.out.println("Enter a number (0 to stop ):");
            input = scanner.nextInt();

            
            if (input != 0) {
                sum += input;
            }

        } while (input != 0);

        System.out.println("The total sum is: " + sum);
    }
}
