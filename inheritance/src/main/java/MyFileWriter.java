import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Author: Alan Christensen
 * 12/19/2014
 */
public abstract class MyFileWriter extends RandomAccessFile {
  public MyFileWriter(String fileName) throws IOException {
    super(fileName, "rw");
  }

  public void write(String message) throws IOException {
    this.writeBytes(message);
  }
}
