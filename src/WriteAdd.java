import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteAdd {
    public void write(String projectInfo) throws IOException {
        try (
                FileWriter f = new FileWriter("projectData.txt", true);
                BufferedWriter b = new BufferedWriter(f);
                PrintWriter p = new PrintWriter(b);
        ) {
            p.println(projectInfo);

        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}

