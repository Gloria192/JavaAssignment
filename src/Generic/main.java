package Generic;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        create pair1
        System.out.println("Enter the first key (String): ");
        String key1 = sc.nextLine();
        System.out.println("Enter the first value (Integer): ");
        int value1 = sc.nextInt();
        sc.nextLine();

        // Create Pair 2
        System.out.println("Enter the second key (string): ");
        String key2 = sc.nextLine();
        sc.nextLine(); // newline
        System.out.println("Enter the second value (integer): ");
        int value2 = sc.nextInt();

        // Initialize Pair objects
        Pair<String, Integer> pair1 = new Pair<>(key1, value1);
        Pair<String, Integer> pair2 = new Pair<>(key2, value2);

        // Print Pair objects
        System.out.println(pair1);
        System.out.println(pair2);

        sc.close(); // Close scanner
    }
        ;
    }
