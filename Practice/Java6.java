import java.io.FileInputStream;

class Main {
    public static void main(String args[]) {
        try {
            FileInputStream input = new FileInputStream("input.txt");
            System.out.println("Available bytes at the beginning: " + input.available());
            // Reads 3 bytes from the file
            input.read();
            input.read();
            input.read();
            // Returns the number of available bytes
            System.out.println("Available bytes at the end: " + input.available());
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
// .read & .availble functions you already know what it does by its name finding availability of bytes & reading of bytes 
