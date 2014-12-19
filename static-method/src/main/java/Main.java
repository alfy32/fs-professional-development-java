import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Author: Alan Christensen
 * 12/18/2014
 */
public class Main {
  public static void main(String[] args) throws IOException {

    // Line writer with composition. It uses a RandomAccessFile object inside
    MyFileWriter.writeLine("line.txt", "Here is the message");
    MyFileWriter.writeLine("line.txt", "Here is another the message");

    // XML writer with composition. It uses a RandomAccessFile object inside
    RandomAccessFile file = MyFileWriter.startXMLFile("xml.xml");
    MyFileWriter.writeToXML(file, "Here is the message");
    MyFileWriter.writeToXML(file, "Here is another the message");
    MyFileWriter.closeXMLFile(file);
  }
}
