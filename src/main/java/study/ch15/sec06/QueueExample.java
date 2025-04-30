package study.ch15.sec06;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

  public static void main(String[] args) {
    Queue<Message> messageQueue = new LinkedList<Message>();
    messageQueue.add(new Message("sendMail", "홍길동"));
    messageQueue.add(new Message("sendSMS", "신용권"));
    messageQueue.add(new Message("sendKakaoTalk", "감자바"));
  }

}
