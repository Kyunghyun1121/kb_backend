package study.ch15.todo.command;

public interface Command {
  void execute();
  void undo();
}
