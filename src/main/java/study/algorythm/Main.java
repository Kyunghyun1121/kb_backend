package study.algorythm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  static int len = 0;
  static int man = 0;
  static int fuel = 0;
  static int[][] map;
  static int[] dx = {0, -1, 0, 1};
  static int[] dy = {1, 0, -1, 0};



  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    len = Integer.parseInt(st.nextToken());
    man = Integer.parseInt(st.nextToken());
    fuel = Integer.parseInt(st.nextToken());
    map = new int[len][len];
    int anwser = -1;

    for (int i = 0; i < len; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < len; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    st = new StringTokenizer(br.readLine());
    int startY = Integer.parseInt(st.nextToken()) - 1;
    int startX = Integer.parseInt(st.nextToken()) - 1;

    customers[] mans = new customers[man];

    for (int i = 0; i < man; i++) {
      st = new StringTokenizer(br.readLine());

      int my = Integer.parseInt(st.nextToken()) - 1;
      int mx = Integer.parseInt(st.nextToken()) - 1;
      int ey = Integer.parseInt(st.nextToken()) - 1;
      int ex = Integer.parseInt(st.nextToken()) - 1;
      mans[i] = new customers(mx, my, ex, ey);
      map[my][mx] = i + 3; // 승객
      //System.out.println(i + " "+ mx + " " + my + " " + ex + " " + ey);
      //System.out.println(mans[i].len);
    }



    for (int i = 0; i < man; i++) {
      Queue<point> q = new ArrayDeque<point>();
      q.add(new point(startX, startY, 0));

      if(map[startY][startX] >= 3) {
        customers temp = mans[map[startY][startX] - 3];
        startX = temp.ex;
        startY = temp.ey;
        if(fuel < temp.len) {
          System.out.println(-1);
          return;
        }
        //System.out.println(temp.len);
        fuel += temp.len;
        continue;
      }

      customers man = null;
      int rem = 100000;
      boolean[][] visited = new boolean[len][len];

      while (!q.isEmpty()) {
        point p = q.poll();
        if(visited[p.my][p.mx])continue;
        visited[p.my][p.mx] = true;

        if(p.len == fuel) break;
        if(man != null && rem <= p.len) break;
        //System.out.println(p.mx + " " + p.my + " " + p.len);

        for (int k = 0; k < 4; k++) {
          int nx = p.mx + dx[k];
          int ny = p.my + dy[k];
          if(nx >= 0 && ny >= 0 && nx < len && ny < len && map[ny][nx] != 1 && !visited[ny][nx]) {
            if(map[ny][nx] >= 3) {
              if(man == null){
                man = mans[map[ny][nx] - 3];
                rem = p.len + 1;
              }else{
                if(man.compare(mans[map[ny][nx] - 3]) < 0 && rem == p.len + 1){
                  man = mans[map[ny][nx] - 3];
                }
              }
            }else{
              q.add(new point(nx, ny, p.len + 1));
            }
          }
        }
      }

      if(man == null || fuel < man.len + rem) {
        System.out.println(-1);
        return;
      }

      map[man.my][man.mx] = 0;
      //mans[map[man.my][man.mx] - 3].ride = true;
      startX = man.ex;
      startY = man.ey;

      fuel -= rem;
      fuel += man.len;
      //System.out.println(man.mx + " " + man.my + " " + rem + " " +man.len  +" "  + fuel);
    }


    if (fuel >= 0) {
      System.out.println(fuel);
    }
    else System.out.println(-1);

    return;
  }

  public static class point{
    int mx;
    int my;
    int len;

    public point(int mx, int my, int len) {
      this.mx = mx;
      this.my = my;
      this.len = len;
    }
  }
  public static class customers {
    int mx;
    int my;
    int ex;
    int ey;
    int len;
    boolean ride = false;

    public customers(int mx, int my, int ex, int ey) {
      this.mx = mx;
      this.my = my;
      this.ex = ex;
      this.ey = ey;
      len = dfs(mx, my, ex, ey);
    }

    public int compare(customers c1){

      if(this.my == c1.my){
        return c1.mx - this.mx;
      }else{
        return c1.my - this.my;
      }
    }
  }

  public static int dfs(int sx, int sy, int ex, int ey) {
    if(sx == ex && sy == ey) return 0;
    boolean[][] visited = new boolean[len][len];

    ArrayDeque<int[]> q = new ArrayDeque<>();
    q.add(new int[]{sx, sy, 0});
    visited[sy][sx] = true;

    while (!q.isEmpty()) {
      int[] curr = q.poll();
      if(curr[0] == ex && curr[1] == ey) return curr[2];

      for (int i = 0; i < 4; i++) {
        int nx = curr[0] + dx[i];
        int ny = curr[1] + dy[i];

        if (nx >= 0 && nx < len && ny >= 0 && ny < len && map[ny][nx] != 1 && !visited[ny][nx]) {
            visited[ny][nx] = true;
            q.add(new int[]{nx, ny, curr[2] + 1});
        }
      }
    }

    return -1;
  }

}
