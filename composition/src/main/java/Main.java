import java.io.IOException;

/**
 * Author: Alan Christensen
 * 12/18/2014
 */
public class Main {
  public static void main(String[] args) throws IOException {

    // Line writer with composition. It uses a RandomAccessFile object inside
    LineFileWriter lineFileWriter = new LineFileWriter("line.txt");
    lineFileWriter.write("Here is the message");
    lineFileWriter.write("Here is another the message");
    lineFileWriter.close();

    // XML writer with composition. It uses a RandomAccessFile object inside
    XMLWriter xmlWriter = new XMLWriter("xml.xml");
    xmlWriter.write("Here is the message");
    xmlWriter.write("Here is another the message");
    xmlWriter.close();
  }
}
