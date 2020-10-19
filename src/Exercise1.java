import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int lowerBound;
        int upperBound;
        int sum = 0;
        do {
            System.out.print("Lower Bound: ");
            lowerBound = (int) in.nextDouble();
            System.out.print("Upper Bound: ");
            upperBound = (int) in.nextDouble();
        } while (lowerBound >= upperBound);
        if(lowerBound % 2 == 1){
            lowerBound ++;
        }
        for(int i = lowerBound; i <= upperBound; i+=2){
            sum += i;
        }
        System.out.println();
        System.out.printf("%,d", sum);
        System.out.println(".");
        in.close();
    }

}
