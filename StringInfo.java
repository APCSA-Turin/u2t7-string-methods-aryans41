import java.util.Scanner; 
public class StringInfo {
    public static void main(String[] args) { 
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter first string: ");
      String str1 = scan.nextLine();
      System.out.print("Enter second string: ");
      String str2 = scan.nextLine();

      int lengthStr1 = str1.length(); 
      int lengthStr2 = str2.length(); 
      if (lengthStr1 > lengthStr2) {
        System.out.println(str1 + " is longer");
      } else if (lengthStr2 > lengthStr1) {
        System.out.println(str2 + " is longer");
      } else {
        System.out.println("Both strings have the same length");
      }
      
      String firstHalfStr1 = str1.substring(0, (lengthStr1/2)); 
      String secondHalfStr1 = str1.substring((lengthStr1/2));
      String firstHalfStr2 = str2.substring(0, (lengthStr2/2)); 
      String secondHalfStr2 = str2.substring((lengthStr2/2));
      System.out.println("First half of first string: " + firstHalfStr1);
      System.out.println("Second half of first string: " + secondHalfStr1);
      System.out.println("First half of second string: " + firstHalfStr2);
      System.out.println("Second half of second string: " + secondHalfStr2);

      int index = str1.indexOf(str2); 
      if (index == -1) {
        System.out.println(str2 + " is NOT found in " + str1);
      } else {
        System.out.println(str2 + " is found in " + str1 + " at index " + index);
      }
      
      scan.close();
    } 
  } 

      
