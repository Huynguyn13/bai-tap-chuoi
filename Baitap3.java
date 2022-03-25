
package baitap.pkg3;

import java.util.Scanner;
public class Baitap3 {

    
    public static void main(String[] args) {
    System.out.print("");
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Nhap chuoi: ");
	    String input = sc.nextLine();
	    System.out.println("Chuoi ban dau: " + input);
	    input = input.replaceAll("", "");
		String output = input.replaceAll(" ", "");
		System.out.println("Chuoi sau khi xoa khoang trang: "+output);	
	  }
	  public static void cau2(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("Nhap chuoi: ");
    message = sc.nextLine();
    char[] charArray = message.toCharArray();
    boolean foundSpace = true;
    for(int i = 0; i < charArray.length; i++) {
      if(Character.isLetter(charArray[i])) {
        if(foundSpace) {
          charArray[i] = Character.toUpperCase(charArray[i]);
          foundSpace = false;
        }
      }
      else {
        foundSpace = true;
      }
    }
    message = String.valueOf(charArray);
    System.out.println("Chuỗi sau khi đổi:" + message);
  }
	  public static void cau3() {
		  char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
	        // cách 1
	        String str = new String(ch);
	        System.out.println(str);
	       
	    }
	  }