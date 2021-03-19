import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ListApp {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int menuSelection = 0;

        while(true){
            System.out.println("Enter number for the option you want to select and press Enter:");
            System.out.println("1 - Add new project");
            System.out.println("2 - Print out list of entered projects");
            System.out.println("3 - To finish");
            System.out.println("-------------------------------------------------------------------------------------------");

            menuSelection = scan.nextInt();

            switch (menuSelection){
                case 1:
                    String addAnotherProject = "";
                    do {
                        String inputProjectInfo;
                        System.out.println("Menu Option 1 Selected...");
                        System.out.println("Enter in project info you want to add and then press Enter: ");
                        scan.nextLine();
                        inputProjectInfo = scan.nextLine();
                        WriteAdd add = new WriteAdd();
                        add.write(inputProjectInfo);
                        System.out.println("You just added: " + inputProjectInfo);
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.println("Would you like to add another project? Answer Y/N");
                        addAnotherProject = scan.next();
                    } while (addAnotherProject.equalsIgnoreCase("Y"));
                    System.out.println("Returning to main menu...");
                    break;
                case 2:
                    System.out.println("Menu Option 2 Selected...");
                    System.out.println("Printing out all projects entered into the Project List...");
                    File projList = new File("projectData.txt");
                    ReadProjects reading = new ReadProjects();
                    reading.read(projList);
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Closing. Bye.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not a valid option. Please check the appropriate options and try again.");
                    break;
            }
        }
    }
}
