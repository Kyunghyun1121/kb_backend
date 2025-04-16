package workout.day_20250416.심화;

public class DatabaseExample {
  public static void main(String[] args) {
    Database data = Database.getInstance();
    data.connect();
    System.out.println("데이터베이스: " +data.getConnection());
    data.close();
  }
}
