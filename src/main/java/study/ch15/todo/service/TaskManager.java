package study.ch15.todo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TaskManager {
  private TreeSet<Task> tasks = new TreeSet<>();

  public void addTask(Task task) {
    tasks.add(task);
    System.out.println("할 일이 추가 되었습니다 : " + task.toString());
  }

  public void removeTask(Task task) {
    tasks.remove(task);
    System.out.println("할 일이 삭제 되었습니다 : " + task);
  }

  public void listTasks() {
    System.out.println("\n====== 할 일 목록 =======\n");

    if(tasks.isEmpty()) {
      System.out.println("등록된 할 일이 없습니다....");
      return;
    }

    int index = 1;
    for (Task task : tasks) {
      System.out.println(index++ + ". " + task);
    }
  }

  public List<Task> getTasksAsList() {
    return new ArrayList<>(tasks);
  }


}
