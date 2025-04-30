package study.ch15.command;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Command[] commands = {
        new AddCommand(),
        new OpenCommand(),
        new PrintCommand(),
        new ExitCommand()
    };

    while(true) {
      Scanner scanner = new Scanner(System.in);

    }
  }

}
