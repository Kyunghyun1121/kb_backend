package study.ch15.todo.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task implements Comparable<Task> {
    private int priority; // 할 일 우선순위
    private String content; // 할 일 내용

  @Override
  public String toString() {
    return "Task [priority=" + priority + ", content=" + content + "]";
  }

  @Override
  public int compareTo(Task other) {
    int priorityCompare = this.priority - other.priority;
    if(priorityCompare == 0) {
      return this.content.compareTo(other.content);
    }else{
      return priorityCompare;
    }
  }
}
