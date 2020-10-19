import java.util.Scanner;

public class Exercise6 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter an integer: ");
            number = in.nextInt();
        } while (number <= 0 || number >= 93);
        int[] arr = new int[number];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < number; i ++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("\n" + arr[number-1] + ".");
        in.close();
    }
}
