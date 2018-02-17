import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String hex;

        System.out.print("Enter a hexadecimal number: ");
        hex = scnr.next();

        if (!(hex.indexOf("0x") == -1)) {
            hex = hex.substring(2, hex.length());
        }

        hex = hex.toUpperCase();

        int i = hex.length() - 1;
        int power = 0;
        char current;
        double sum = 0;


        // while loop to go through each value in the hexadecimal

        while (i >= 0) {

            current = hex.charAt(i);

            if (current == 65) {
                sum += 10 * Math.pow(16, power);
            }
            else if (current == 66) {
                sum += 11 * Math.pow(16, power);
            }
            else if (current == 67) {
                sum += 12 * Math.pow(16, power);
            }
            else if (current == 68) {
                sum += 13 * Math.pow(16, power);
            }
            else if (current == 69) {
                sum += 14 * Math.pow(16, power);
            }
            else if (current == 70) {
                sum += 15 * Math.pow(16, power);
            }
            else if (current == 48) {
                sum += 0 * Math.pow(16, power);
            }
            else if (current == 49) {
                sum += 1 * Math.pow(16, power);
            }
            else if (current == 50) {
                sum += 2 * Math.pow(16, power);
            }
            else if (current == 51) {
                sum += 3 * Math.pow(16, power);
            }
            else if (current == 52) {
                sum += 4 * Math.pow(16, power);
            }
            else if (current == 53) {
                sum += 5 * Math.pow(16, power);
            }
            else if (current == 54) {
                sum += 6 * Math.pow(16, power);
            }
            else if (current == 55) {
                sum += 7 * Math.pow(16, power);
            }
            else if (current == 56) {
                sum += 8 * Math.pow(16, power);
            }
            else if (current == 57) {
                sum += 9 * Math.pow(16, power);
            }

            power++;
            i--;

        }

        System.out.println("Your number is " + Math.round(sum) + " in decimal");

    }
}
