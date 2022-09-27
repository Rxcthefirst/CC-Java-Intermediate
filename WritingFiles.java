import java.io.*;

public class WritingFiles {
  public static void main(String[] args) throws IOException {
    FileOutputStream output = new FileOutputStream("output.txt");

    String outputText = "test message";
    byte[] outputTextBytes = outputText.getBytes();

    output.write(outputTextBytes);

    output.close();
  }
}