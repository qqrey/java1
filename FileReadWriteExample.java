import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileReadWriteExample {

    public static void main(String[] args) {
        // Example usage
        int[] dataArray = {1, 2, 3, 4, 5};
        write_file_method(dataArray);
        read_file_method();
    }

    static void write_file_method(int[] dataArray) {
        try (FileWriter write_file = new FileWriter("leaderboard.txt")) {
            System.out.println("data to write: " + Arrays.toString(dataArray));
            write_file.write(Arrays.toString(dataArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] read_file_method() {
        int[] readData = null;
        try {
            File read_file = new File("leaderboard.txt");
            Scanner scanner_Read = new Scanner(read_file);

            while (scanner_Read.hasNextLine()) {
                String data = scanner_Read.nextLine();
                System.out.println("data_read: " + data);
            }
            scanner_Read.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("readdata:" + readData);
        return readData;
    }
}
