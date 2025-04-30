package study.ch15.todo.command;

import java.util.Stack;

public class CommandInvoker {
  private Stack<Command>history = new Stack<>();

  public void executeCommand(Command command) {
    command.execute();
    history.push(command);
  }

  public void undoLastCommand() {
    if(history.isEmpty()) {
      System.out.println("취소할 명령어가 없습니다.");
      return;
    }
    Command command = history.pop();
    command.undo();
  }

}
