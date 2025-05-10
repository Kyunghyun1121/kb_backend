package study.algorythm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class StartTaxi {

  static int len = 0;
  static int man = 0;
  static int fuel = 0;
  static int[][] map;
  int[] dx = {0, -1, 0, 1};
  int[] dy = {1, 0, -1, 0};

  public int dfs(int sx, int sy, int ex, int ey) {
    ArrayDeque<int[]> q = new ArrayDeque<>();
    q.add(new int[]{sx, sy, 0});
    int[][] visited = new int[len][len];
    visited[sx][sy] = 1;

    while (!q.isEmpty()) {
      int[] curr = q.poll();
      if (curr[0] == ex && curr[1] == ey) {
        return curr[2];
      }
      for (int i = 0; i < 4; i++) {
        int nx = curr[0] + dx[i];
        int ny = curr[1] + dy[i];
        if (nx >= 0 && nx < len && ny >= 0 && ny < len && map[nx][ny] == 0) {
          if (visited[nx][ny] > curr[2] + 1) {
            visited[nx][ny] = curr[2];
            q.add(new int[]{nx, ny, 0});
          }
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    len = Integer.parseInt(st.nextToken());
    man = Integer.parseInt(st.nextToken());
    fuel = Integer.parseInt(st.nextToken());
    map = new int[len][len];

    for (int i = 0; i < len; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < len; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    st = new StringTokenizer(br.readLine());
    int startX = Integer.parseInt(st.nextToken());
    int startY = Integer.parseInt(st.nextToken());
    customers[] mans = new customers[man];

    for (int i = 0; i < man; i++) {
      st = new StringTokenizer(br.readLine());
      int my = Integer.parseInt(st.nextToken());
      int mx = Integer.parseInt(st.nextToken());
      int ey = Integer.parseInt(st.nextToken());
      int ex = Integer.parseInt(st.nextToken());
      //mans[i] = new customers(mx, my, ex, ey);
      System.out.println(mans[i].len);
    }

    return;

  }

  class customers {

    int mx;
    int my;
    int ex;
    int ey;
    int len;

    public customers(int mx, int my, int ex, int ey) {
      this.mx = mx;
      this.my = my;
      this.ex = ex;
      this.ey = ey;
      len = dfs(mx, my, ex, ey);
    }
  }

}
