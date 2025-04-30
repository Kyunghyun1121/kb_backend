package study.ch15.todo.command;

import java.util.List;
import study.ch15.todo.service.Task;
import study.ch15.todo.service.TaskManager;

public class DeleteTaskCommand implements Command {

  private Task task;
  private TaskManager taskManager;

  public DeleteTaskCommand(TaskManager taskManager, int index) {
    this.taskManager = taskManager;

    List<Task> tasks = taskManager.getTasksAsList();

    if(index >= 0 && index < tasks.size()) {
      this.task = tasks.get(index);
    }else{
      throw new IndexOutOfBoundsException("유효하지 않은 할 일 번호입니다.");
    }
  }

  @Override
  public void execute() {
    taskManager.removeTask(task);
  }

  @Override
  public void undo() {
    taskManager.addTask(task);
    System.out.println("할 일 삭제가 취소 되었습니다.");
  }

}
