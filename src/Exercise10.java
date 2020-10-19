import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        String cardType;
        String cardnum;
        boolean valid = false;
        System.out.print("Enter a credit card number: ");
        cardnum = in.nextLine();
        for(int i = cardnum.length()-2; i >=0; i-=2){
            int val = 2 * Integer.parseInt(Character.toString(cardnum.charAt(i)));
            int firstdig = val / 10;
            int seconddig = val - firstdig * 10;
            int sumdigs = firstdig + seconddig;
            sum += sumdigs;
        }
        for(int i = cardnum.length() - 1; i >= 0; i -=2){
            sum += Integer.parseInt(Character.toString(cardnum.charAt(i)));
        }
        String sumStr = Integer.toString(sum);
        if(Character.toString(sumStr.charAt(sumStr.length()-1)).equals("0")){
            valid = true;
        }
        int cardNumLength = cardnum.length();
        int firstTwoNums = Integer.parseInt(cardnum.substring(0,2));
        int firstNum = Integer.parseInt(Character.toString(cardnum.charAt(0)));

        if((firstTwoNums == 34 || firstTwoNums == 37) && cardNumLength == 15){
            cardType = "American Express.";
        }
        else if (firstTwoNums >= 51 && firstTwoNums <= 55 && cardNumLength == 16){
            cardType = "Mastercard.";
        }
        else if(firstNum == 4 && (cardNumLength == 14 || cardNumLength == 16)){
            cardType = "Visa.";
        }
        else {
            cardType = "Invalid.";
        }
        if(cardType.equals("Invalid.") || !valid){
            System.out.println("\nInvalid.");
        }else{
            System.out.println("\n" + cardType);
        }
        in.close();
    }
}
