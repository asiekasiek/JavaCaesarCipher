// This is a Java program code that encrypts text using the Caesar cipher
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text to encrypt in one line: ");
        String test = scanner.nextLine();
        System.out.println("Enter the shift value: ");
        int move = scanner.nextInt();
        System.out.println("Encrypted text: ");

        for (int i = 0; i <= (test.length()-1); i++){
            char ch = test.charAt(i); // Retrieves successive characters from the entered text
            ch += move; // Encrypts each character by the shift value
            System.out.print(ch);
        }
    }
}