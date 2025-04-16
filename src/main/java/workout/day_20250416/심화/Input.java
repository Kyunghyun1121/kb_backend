package workout.day_20250416.심화;

import java.util.Scanner;

public class Input {
  static Scanner scanner = new Scanner(System.in);

  static public String read(String title){
    System.out.print(title);
    return scanner.nextLine();
  }
  static public String read(String title, String defaultValue){
    System.out.print(title);

    String t = scanner.nextLine();
    //System.out.println(t.length());
    if(t.length() == 0) return defaultValue;
    else return t;
  }
  static public int readInt(String title){
    System.out.print(title);
    return Integer.parseInt(scanner.nextLine());
  }
  static public boolean confirm(String title, boolean defaultValue){
    System.out.print(title);
    if(defaultValue){
      System.out.print("(Y/n): ");
    }else{
      System.out.print("(y/N): ");
    }

    String t = scanner.nextLine();
    if(t.length() == 0) {
      return defaultValue;
    }else if(t.equals("n") || t.equals("N")) {
      return false;
    }else{
      return true;
    }
  }

  static public boolean confirm(String title){
    System.out.print(title);
    return confirm(title, true);
  }

}
