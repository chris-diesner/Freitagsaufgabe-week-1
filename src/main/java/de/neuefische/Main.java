package de.neuefische;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eingabe Password:");
        String pw = scanner.nextLine();

        if (Password.checkPasswordLength(pw) == false) {
            System.out.println("Dein Password ist zu kurz");
            
        } else if (Password.checkPasswordInt(pw) == false) {
            System.out.println("Dein Password hat keine Zahlen");
        } else if (Password.checkPasswordOnlyInt(pw) == false) {
            System.out.println("Dein Password hat keine Buchstaben");
        } else if (Password.checkPasswordCapital(pw) == false) {
            System.out.println("Dein Password hat keine Großbuchstaben");
        } else if (Password.checkBadPassword(pw) == true) {
            System.out.println("Das war zu simple");
        } else if (Password.checkPasswordSpecialChar(pw) == false) {
            System.out.println("Und nun noch mit Sonderzeichen");
        } else {
            System.out.println("Passt!");
        }
    }//,.;:_!§$%&/(/)=?)
}