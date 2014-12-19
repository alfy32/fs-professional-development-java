import java.io.*;
import java.util.TreeSet;

/**
 * Author: Alan Christensen
 * 12/18/2014
 */
public class Main {
  public static void main(String[] args) throws IOException {
    new Main().sortFile();
  }

  public void sortFile() throws IOException {
    TreeSet<String> lines = new TreeSet<>();

    //noinspection ConstantConditions
    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(this.getClass().getClassLoader().getResource("file.txt").getFile())));

    String readLine;
    while ((readLine = bufferedReader.readLine()) != null) {
      lines.add(readLine);
    }

    bufferedReader.close();

    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("out.txt")));

    for (String writeLine : lines.descendingSet()) {
      bufferedWriter.write(writeLine);
      bufferedWriter.newLine();
    }

    bufferedWriter.close();
  }
}
