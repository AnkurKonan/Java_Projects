import java.io.FileInputStream;

class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("input.txt");
            System.out.println("Data in the file");
            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
