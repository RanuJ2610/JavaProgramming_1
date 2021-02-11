package com.test.big.integerlib;

public class BigIntegerLib {

    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length != 3) {
                System.out.println("Please provide the valid input (ADD/SUB 4 5)");
            } else {
                switch (args[0].toLowerCase()) {
                    case "add":
                        add(args[1], args[2]);
                        break;
                    case "sub":
                        sub(args[1], args[2]);
                        break;
                    default:
                        System.out.println("Please provide the valid operation (ADD/SUB)");
                        break;
                }
            }
        } else {
            System.out.println("Please provide the input");
        }
    }

    private static void add(String a, String b) {
        try {
            System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
        } catch (NumberFormatException ne) {
            System.out.println("Please provide the valid input. Only Integer Value is allowed.");
        }

    }

    private static void sub(String a, String b) {
        try {
            System.out.println(Integer.parseInt(a) - Integer.parseInt(b));
        } catch (NumberFormatException ne) {
            System.out.println("Please provide the valid input. Only Integer Value is allowed.");
        }
    }
}
