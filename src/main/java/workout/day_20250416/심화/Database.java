package workout.day_20250416.심화;

public class Database {
  private String connection = "MySQL";
  private static Database database = new Database();

  public String getConnection() {
    return connection;
  }

  private Database() {}
  public String connect() {
    System.out.println (connection + "에 연결합니다.");
    return connection;
  }
  public void close() {
    System.out.println(connection + "을 닫습니다.");
  }
  public static Database getInstance() {
    return database;
  }
}
