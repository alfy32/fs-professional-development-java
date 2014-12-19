import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Author: Alan Christensen
 * 12/19/2014
 */
public class LineFileWriter {

  private RandomAccessFile randomAccessFile;

  public LineFileWriter(String fileName) throws IOException {
    randomAccessFile = new RandomAccessFile(fileName, "rw");
  }

  public void write(String message) throws IOException {
    randomAccessFile.writeBytes("Message: " + message + System.getProperty("line.separator"));
  }

  public void close() throws IOException {
    randomAccessFile.close();
  }
}
