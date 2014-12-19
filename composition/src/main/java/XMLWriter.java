import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Author: Alan Christensen
 * 12/19/2014
 */
public class XMLWriter {
  private RandomAccessFile randomAccessFile;

  public XMLWriter(String fileName) throws IOException {
    randomAccessFile = new RandomAccessFile(fileName, "rw");
    randomAccessFile.writeBytes("<messages>");
  }

  public void write(String message) throws IOException {
    randomAccessFile.writeBytes("<message>" + message + "</message>");
  }

  public void close() throws IOException {
    randomAccessFile.writeBytes("</messages>");
    randomAccessFile.close();
  }
}
