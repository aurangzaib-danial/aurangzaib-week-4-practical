/**
 * author: Aurangzaib Danial Liaqat Khan
 * version: 13/02/21
 */

public class Ifs {
    public static void main(String[] args) {
       int userAge = 22;
       System.out.println("When the user's age is " + userAge);
       if (userAge < 16) {
           System.out.println("You are a child");
       } else if (userAge == 16) {
           System.out.println("You can get married and have children");
       } else if (userAge == 17) {
           System.out.println("You can get married and have children");
           System.out.println("You can drive a car");           
       } else if (userAge == 18) {
           System.out.println("You can get married and have children");
           System.out.println("You can drive a car");
           System.out.println("You can vote and drink alcohol");
       } else if (userAge > 21) {
           System.out.println("You are not legally inhibited by your age.");
       }
    }
}