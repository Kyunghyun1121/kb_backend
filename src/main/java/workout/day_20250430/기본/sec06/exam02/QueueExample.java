package workout.day_20250430.기본.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

  public static void main(String[] args) {
    Queue<Message> queue = new LinkedList<Message>();
    queue.add(new Message("sendMail", "홍길동"));
    queue.add(new Message("sendSMS", "신용권"));
    queue.add(new Message("sendKakaotalk", "감자바"));

    while (!queue.isEmpty()) {
      Message message = queue.poll();
      System.out.print(message.to + "님에게 " + message.command.substring(4));
      if(message.command.equals("sendSMS")) {
        System.out.println("를 보냅니다.");
      }else{
        System.out.println("을 보냅니다.");
      }
    }
  }

}
