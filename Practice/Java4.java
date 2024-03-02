import java.io.FileInputStream;
import java.io.InputStream;

class Main {
    public static void main(String args[]) {
        byte[] array = new byte[500];
        try {
            InputStream input = new FileInputStream("input.txt");
            System.out.println("Available bytes in file: " + input.available());
            // Reading byte from input stream
            input.read(array);
            System.out.println("Below are the data read: ");
            // Convert byte array into string
            String string = new String(array);
            System.out.println(string);
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

// try = block of code that can be wrong while executing & errors can occur
// catch = block of code that executes when try block has an error
