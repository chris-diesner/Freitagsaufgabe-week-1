package de.neuefische;

public class Password {
    public static boolean checkPasswordLength(String input) {
        if (input.length() > 12) {
            return true;
        }
        return false;

    }

    public static boolean checkPasswordInt(String input) {
        if (input.matches("(.*)[1-9](.*)")) {
            return true;
        }
        return false;
    }

    public static boolean checkPasswordUpperCase(String input) {
        return ! input.equals(input.toLowerCase());
    }

    public static boolean checkPasswordLowerCase(String input) {
        return input.equals(input.toUpperCase());
    }

    public static boolean checkPasswordOnlyInt(String input) {
        if (input.matches("[0-9]*")) {
            return false;
        }
        return true;
    }

    public static boolean checkBadPassword(String input) {
        String badString[] = {"Password", "123456", "654321", "password"};
        for (int i = 0; i < badString.length; i++) {
            if (input.contains(badString[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPasswordSpecialChar(String input) {
        if (input.matches("\\w*")) {
            return false;
        }
        return true;
    }
}
