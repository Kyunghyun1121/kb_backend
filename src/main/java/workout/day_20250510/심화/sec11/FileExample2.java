package workout.day_20250510.심화.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample2 {
  public static void main(String[] args) {
    File file = new File("C:/temp/images");

    if (file.exists()) {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
      for(File f : file.listFiles()) {
        System.out.printf("%-25s", sdf.format(new Date(f.lastModified())));
        if(f.isDirectory()) {
          System.out.printf("%-10s%-20s", "<DIR>", f.getName());
        }else{
          System.out.printf("%-10s%-20s", f.length(), f.getName());
        }
        System.out.println();
      }
    }else{
      file.mkdirs();
    }
  }
}
