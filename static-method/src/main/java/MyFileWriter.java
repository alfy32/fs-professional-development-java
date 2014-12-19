import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Author: Alan Christensen
 * 12/19/2014
 */
public class MyFileWriter {

  public static RandomAccessFile startXMLFile(String fileName) throws IOException {
    RandomAccessFile file = new RandomAccessFile(fileName, "rw");
    file.writeBytes("<messages>");
    return file;
  }

  public static void writeToXML(RandomAccessFile file, String message) throws IOException {
    file.writeBytes("<message>" + message + "</message>");
  }

  public static void closeXMLFile(RandomAccessFile file) throws IOException {
    file.writeBytes("</messages>");
    file.close();
  }

  public static void writeLine(String fileName, String message) throws IOException {
    RandomAccessFile file = new RandomAccessFile(fileName, "rw");
    file.seek(file.length());
    file.writeBytes("Message: " + message + System.getProperty("line.separator"));
    file.close();
  }
}
