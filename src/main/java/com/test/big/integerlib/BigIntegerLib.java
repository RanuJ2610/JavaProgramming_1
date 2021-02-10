package com.test.big.integerlib;

public class BigIntegerLib {

    public enum Operation {
        ADD,SUB
    }
    public static void main(String[] args){
      if(args.length>0){
          if(args.length != 3) {
              System.out.println("Please provide the valid input (ADD/SUB 4 5)");
          } else {
              try {
                  switch (Operation.valueOf(args[0])) {
                      case ADD:
                          sum(args[1], args[2]);
                          break;
                      case SUB:
                          sub(args[1], args[2]);
                          break;
                      default:
                          break;
                  }
              } catch (IllegalArgumentException ie){
                  System.out.println("Please provide the valid operation (ADD/SUB)");
              }
         }
      } else {
          System.out.println("Please provide the input");
      }
    }

    private static void sum(String a, String b){
        try {
            System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
        } catch (NumberFormatException ne){
            System.out.println("Please provide the valid input. Only Integer Value is allowed.");
        }

    }

    private static void sub(String a, String b){
        try {
            System.out.println(Integer.parseInt(a) - Integer.parseInt(b));
        } catch (NumberFormatException ne){
            System.out.println("Please provide the valid input. Only Integer Value is allowed.");
        }
    }
}
