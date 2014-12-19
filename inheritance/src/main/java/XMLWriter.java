import java.io.IOException;

/**
 * Author: Alan Christensen
 * 12/19/2014
 */
public class XMLWriter extends MyFileWriter {

  public XMLWriter(String fileName) throws IOException {
    super(fileName);
    this.write("<messages>");
  }

  public void write(String message) throws IOException {
    super.write("<message>" + message + "</message>");
  }

  @Override
  public void close() throws IOException {
    this.write("</messages>");
    super.close();
  }
}
