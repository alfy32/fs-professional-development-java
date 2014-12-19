import java.io.IOException;

/**
 * Author: Alan Christensen
 * 12/19/2014
 */
public class LineFileWriter extends MyFileWriter {

  public LineFileWriter(String fileName) throws IOException {
    super(fileName);
  }

  @Override
  public void write(String message) throws IOException {
    super.write("Message: " + message + System.getProperty("line.separator"));
  }
}
