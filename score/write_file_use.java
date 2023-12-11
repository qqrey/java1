package score
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

  public class write_file_use(user_score) {
    public static void main(String[] args) {
        try (FileWriter write_file = new FileWriter("leaderboard.txt")) {
            write_file.write(user_score);
            write_file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
  }