package study.ch15.command;

public class PrintCommand implements Command {
  @Override
  public void execute() {
    System.out.println("=============");
    System.out.println("Print command");
    System.out.println("=============");
    System.out.println();
  }
}
