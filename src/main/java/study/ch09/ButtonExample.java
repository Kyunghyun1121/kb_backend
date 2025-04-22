package study.ch09;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ButtonExample extends JFrame {

  private JTextField messageField;
  private JButton sendButton;

  public interface MessageHandler {
    void printMessage(String message);
  }

  public ButtonExample() {
    setTitle("중첩 클래스, 익명 객체 예제");
    setSize(400, 100);
    setLocationRelativeTo(null); // 화면 중앙 배치
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 버튼
    setLayout(new FlowLayout());

    messageField = new JTextField(20);
    sendButton = new JButton("콘솔에 출력");

    add(new JLabel("메시지: "));
    add(messageField);
    add(sendButton);

    /* 중첩 인터페이스를 익명 내부 클래스를 이용해서 구현 */
    MessageHandler handlerA = new MessageHandler() {
      @Override
      public void printMessage(String message) {
        System.out.println("message = " + message);
      }
    };

    MessageHandler handlerB = new MessageHandler() {
      @Override
      public void printMessage(String message) {
        String currentTime =
            LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
            );
        System.out.printf("[%s] %s \n", currentTime, message);
      }
    };

    sendButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String message = messageField.getText();
        if(message.isEmpty()) {
          JOptionPane.showMessageDialog(ButtonExample.this,
              "전송할 메시지를 입력해 주새요.", "오류",
              JOptionPane.ERROR_MESSAGE);
        }else{
          handlerA.printMessage(message);
          handlerB.printMessage(message);

          messageField.setText("");
        }
      }
    });
  }
}
