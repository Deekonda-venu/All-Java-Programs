package Conversion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConversionMenu {

    private static int binaryToDecimal(String binary) {
        int sum = 0;
        int pow = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char c = binary.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Invalid binary: " + binary);
            }
            int bit = c - '0';
            sum += bit * pow;
            pow *= 2;
        }
        return sum;
    }

    private static String decimalToBinary(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int x = n;
        while (x > 0) {
            sb.append(x % 2);
            x /= 2;
        }
        return sb.reverse().toString();
    }

    private static String decimalToOctal(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int x = n;
        while (x > 0) {
            sb.append(x % 8);
            x /= 8;
        }
        return sb.reverse().toString();
    }

    private static int octalToDecimal(String octal) {
        int sum = 0;
        int pow = 1;
        for (int i = octal.length() - 1; i >= 0; i--) {
            char c = octal.charAt(i);
            if (c < '0' || c > '7') {
                throw new IllegalArgumentException("Invalid octal: " + octal);
            }
            int digit = c - '0';
            sum += digit * pow;
            pow *= 8;
        }
        return sum;
    }

    private static String octalToBinary(String octal) {
        int dec = octalToDecimal(octal);
        return decimalToBinary(dec);
    }

    private static String binaryToOctal(String binary) {
        int dec = binaryToDecimal(binary);
        return decimalToOctal(dec);
    }

    private static double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32.0;
    }

    private static double fahrenheitToCelsius(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }

    private static void printMenu() {
        System.out.println("\n=== Java Conversion Programs ===");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Binary to Octal");
        System.out.println("3. Decimal to Binary");
        System.out.println("4. Decimal to Octal");
        System.out.println("5. Octal to Binary");
        System.out.println("6. Octal to Decimal");
        System.out.println("7. Celsius to Fahrenheit");
        System.out.println("8. Fahrenheit to Celsius");
        System.out.println("9. Centimeters to Meters and Kilometers");
        System.out.println("10. Kilometers to Miles");
        System.out.println("11. Miles to Kilometers");
        System.out.println("12. Kilometers to Meters/Centimeters/Millimeters");
        System.out.println("13. Character to Int");
        System.out.println("14. Character to String");
        System.out.println("15. Character Array to String");
        System.out.println("16. Int to Char");
        System.out.println("17. Int to Double");
        System.out.println("18. Int to Long");
        System.out.println("19. Int to String");
        System.out.println("20. Long to Int");
        System.out.println("21. Long to String");
        System.out.println("22. Double to String");
        System.out.println("23. Float to String");
        System.out.println("24. String to Character");
        System.out.println("25. String to Int");
        System.out.println("26. String to Long");
        System.out.println("27. String to Float");
        System.out.println("28. String to Double");
        System.out.println("29. Convert String to Date (yyyy-MM-dd)");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printMenu();
            String choiceStr = sc.nextLine().trim();
            int choice;
            try {
                choice = Integer.parseInt(choiceStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice.");
                continue;
            }

            if (choice == 0) {
                break;
            }

            try {
                switch (choice) {
                    case 1: {
                        System.out.print("Enter binary: ");
                        String bin = sc.nextLine().trim();
                        System.out.println("Decimal: " + binaryToDecimal(bin));
                        break;
                    }
                    case 2: {
                        System.out.print("Enter binary: ");
                        String bin = sc.nextLine().trim();
                        System.out.println("Octal: " + binaryToOctal(bin));
                        break;
                    }
                    case 3: {
                        System.out.print("Enter decimal (int): ");
                        int n = Integer.parseInt(sc.nextLine().trim());
                        System.out.println("Binary: " + decimalToBinary(n));
                        break;
                    }
                    case 4: {
                        System.out.print("Enter decimal (int): ");
                        int n = Integer.parseInt(sc.nextLine().trim());
                        System.out.println("Octal: " + decimalToOctal(n));
                        break;
                    }
                    case 5: {
                        System.out.print("Enter octal: ");
                        String oct = sc.nextLine().trim();
                        System.out.println("Binary: " + octalToBinary(oct));
                        break;
                    }
                    case 6: {
                        System.out.print("Enter octal: ");
                        String oct = sc.nextLine().trim();
                        System.out.println("Decimal: " + octalToDecimal(oct));
                        break;
                    }
                    case 7: {
                        System.out.print("Enter Celsius: ");
                        double c = Double.parseDouble(sc.nextLine().trim());
                        System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
                        break;
                    }
                    case 8: {
                        System.out.print("Enter Fahrenheit: ");
                        double f = Double.parseDouble(sc.nextLine().trim());
                        System.out.println("Celsius: " + fahrenheitToCelsius(f));
                        break;
                    }
                    case 9: {
                        System.out.print("Enter centimeters: ");
                        double cm = Double.parseDouble(sc.nextLine().trim());
                        double meters = cm / 100.0;
                        double km = cm / 100000.0;
                        System.out.println("Meters: " + meters);
                        System.out.println("Kilometers: " + km);
                        break;
                    }
                    case 10: {
                        System.out.print("Enter kilometers: ");
                        double km = Double.parseDouble(sc.nextLine().trim());
                        double miles = km * 0.621371;
                        System.out.println("Miles: " + miles);
                        break;
                    }
                    case 11: {
                        System.out.print("Enter miles: ");
                        double miles = Double.parseDouble(sc.nextLine().trim());
                        double km = miles / 0.621371;
                        System.out.println("Kilometers: " + km);
                        break;
                    }
                    case 12: {
                        System.out.print("Enter kilometers: ");
                        double km = Double.parseDouble(sc.nextLine().trim());
                        double meters = km * 1000.0;
                        double cm = km * 100000.0;
                        double mm = km * 1000000.0;
                        System.out.println("Meters: " + meters);
                        System.out.println("Centimeters: " + cm);
                        System.out.println("Millimeters: " + mm);
                        break;
                    }
                    case 13: {
                        System.out.print("Enter character: ");
                        String s = sc.nextLine();
                        char ch = s.isEmpty() ? '\n' : s.charAt(0);
                        System.out.println("Int (ASCII/Unicode): " + (int) ch);
                        break;
                    }
                    case 14: {
                        System.out.print("Enter character: ");
                        String s = sc.nextLine();
                        char ch = s.isEmpty() ? '\n' : s.charAt(0);
                        System.out.println("String: " + String.valueOf(ch));
                        break;
                    }
                    case 15: {
                        System.out.print("Enter characters (no spaces): ");
                        String s = sc.nextLine();
                        char[] arr = s.toCharArray();
                        System.out.println("String: " + new String(arr));
                        break;
                    }
                    case 16: {
                        System.out.print("Enter int: ");
                        int n = Integer.parseInt(sc.nextLine().trim());
                        System.out.println("Char: " + (char) n);
                        break;
                    }
                    case 17: {
                        System.out.print("Enter int: ");
                        int n = Integer.parseInt(sc.nextLine().trim());
                        double d = (double) n;
                        System.out.println("Double: " + d);
                        break;
                    }
                    case 18: {
                        System.out.print("Enter int: ");
                        int n = Integer.parseInt(sc.nextLine().trim());
                        long l = (long) n;
                        System.out.println("Long: " + l);
                        break;
                    }
                    case 19: {
                        System.out.print("Enter int: ");
                        int n = Integer.parseInt(sc.nextLine().trim());
                        System.out.println("String: " + String.valueOf(n));
                        break;
                    }
                    case 20: {
                        System.out.print("Enter long: ");
                        long l = Long.parseLong(sc.nextLine().trim());
                        int n = (int) l;
                        System.out.println("Int: " + n);
                        break;
                    }
                    case 21: {
                        System.out.print("Enter long: ");
                        long l = Long.parseLong(sc.nextLine().trim());
                        System.out.println("String: " + String.valueOf(l));
                        break;
                    }
                    case 22: {
                        System.out.print("Enter double: ");
                        double d = Double.parseDouble(sc.nextLine().trim());
                        System.out.println("String: " + String.valueOf(d));
                        break;
                    }
                    case 23: {
                        System.out.print("Enter float: ");
                        float f = Float.parseFloat(sc.nextLine().trim());
                        System.out.println("String: " + String.valueOf(f));
                        break;
                    }
                    case 24: {
                        System.out.print("Enter string: ");
                        String s = sc.nextLine();
                        if (s.isEmpty()) {
                            System.out.println("String is empty.");
                        } else {
                            System.out.println("Character: " + s.charAt(0));
                        }
                        break;
                    }
                    case 25: {
                        System.out.print("Enter string (int): ");
                        String s = sc.nextLine().trim();
                        System.out.println("Int: " + Integer.parseInt(s));
                        break;
                    }
                    case 26: {
                        System.out.print("Enter string (long): ");
                        String s = sc.nextLine().trim();
                        System.out.println("Long: " + Long.parseLong(s));
                        break;
                    }
                    case 27: {
                        System.out.print("Enter string (float): ");
                        String s = sc.nextLine().trim();
                        System.out.println("Float: " + Float.parseFloat(s));
                        break;
                    }
                    case 28: {
                        System.out.print("Enter string (double): ");
                        String s = sc.nextLine().trim();
                        System.out.println("Double: " + Double.parseDouble(s));
                        break;
                    }
                    case 29: {
                        System.out.print("Enter date string (yyyy-MM-dd): ");
                        String s = sc.nextLine().trim();
                        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        try {
                            LocalDate date = LocalDate.parse(s, fmt);
                            System.out.println("Date: " + date);
                        } catch (DateTimeParseException e) {
                            System.out.println("Invalid date format. Use yyyy-MM-dd");
                        }
                        break;
                    }
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
