import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadProjects {
    public void read(File projectList) throws FileNotFoundException {
        try{
            Scanner reader = new Scanner(projectList);
            while (reader.hasNextLine()){
                String projectInfo = reader.nextLine();
                System.out.println(projectInfo);

            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred during file reading.");
            e.printStackTrace();
        }

    }
}

