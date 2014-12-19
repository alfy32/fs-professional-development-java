import java.io.IOException;

/**
 * Author: Alan Christensen
 * 12/18/2014
 */
public class Main {
  public static void main(String[] args) throws IOException {
    MyFileWriter fileWriter;

    // Line writer with composition. It uses a RandomAccessFile object inside
    fileWriter = new LineFileWriter("line.txt");
    fileWriter.write("Here is the message");
    fileWriter.write("Here is another the message");
    fileWriter.close();

    // XML writer with composition. It uses a RandomAccessFile object inside
    fileWriter = new XMLWriter("xml.xml");
    fileWriter.write("Here is the message");
    fileWriter.write("Here is another the message");
    fileWriter.close();
  }
}
