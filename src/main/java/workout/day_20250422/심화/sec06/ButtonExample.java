package workout.day_20250422.심화.sec06;

public class ButtonExample {

  public static void main(String[] args) {
    Button btnOk = new Button();
    btnOk.setClickListener(new Button.ClickListener() {
      @Override
      public void onClick(){
        System.out.println("Ok 버튼을 클릭했습니다.");
      }
    });
    btnOk.click();
  }
}
