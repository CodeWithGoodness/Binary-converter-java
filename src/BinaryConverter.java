 import java.util.Scanner;
public class BinaryConverter {
    public static void main(String[]args){
        //converts decimals to binary
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in base 10: ");
        int number = input.nextInt();
        String binary = "";
        for (int i = number; i > 0 ; i /= 2) {
            binary = i % 2 + binary;


        }System.out.println(number + " is " + binary + " in binary");
    }
}
