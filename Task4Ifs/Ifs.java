/**
 * author: Aurangzaib Danial Liaqat Khan
 * version: 16/02/21
 */

public class Ifs {
    public static void main(String[] args) {
       int userAge = 21;
       String child = "You are a child";
       String getMarried = "You can get married and have children";
       String driveCar = "You can drive a car";
       String vote = "You can vote and drink alcohol";

       System.out.println("When the user's age is " + userAge);

       if (userAge < 16) {
           System.out.println(child);
       } else if (userAge == 16) {
           System.out.println(getMarried);
       } else if (userAge == 17) {
           System.out.println(getMarried);
           System.out.println(driveCar);           
       } else if (userAge >= 18 && userAge <= 21) {
           System.out.println(getMarried);
           System.out.println(driveCar);
           System.out.println(vote);
       } else if (userAge > 21) {
           System.out.println("You are not legally inhibited by your age.");
       }
    }
}
