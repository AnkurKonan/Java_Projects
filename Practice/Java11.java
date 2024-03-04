import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Main {
    public static void main(String[] args) {
        int data1 = 5;
        String data2 = "I am Ankur konan nice to meet you";
        try {
            FileOutputStream file = new FileOutputStream("file.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);
            // Writing in file
            output.writeInt(data1);
            output.writeObject(data2);
            FileInputStream fileStream = new FileInputStream("file.txt");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);
            // reading Integer
            System.out.println("Integer data :" + objStream.readInt());
            // reading String
            System.out.println("String data: " + objStream.readObject());
            output.close();
            objStream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
