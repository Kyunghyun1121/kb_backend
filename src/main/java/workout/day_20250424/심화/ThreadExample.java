package workout.day_20250424.심화;

public class ThreadExample {

  public static void main(String[] args) {
    Thread thread = new Thread() {
      @Override
      public void run() {
        Thread movieThread = new Thread(new MovieThread());
        Thread musicThread = new Thread(new MusicRunnable());

        movieThread.start();
        musicThread.start();
      }
    };

    thread.start();
  }

}
