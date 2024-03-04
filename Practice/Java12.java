import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String args[]) {
        String data = "This is a line of text inside the file.";
        try {
            OutputStream out = new FileOutputStream("output.txt");
            // Converting string into bytes
            byte[] dataBytes = data.getBytes();
            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
