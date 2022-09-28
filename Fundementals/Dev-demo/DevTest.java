import java.util.ArrayList;
public class DevTest {
    public static void main(String[] args){
        Developer dev1 = new Developer();
        dev1.name = "Bobby";
        dev1.yearsOfExperience = 2;
        dev1.hoursOfSleep = 12;
        dev1.languages = new ArrayList<String>();
        dev1.languages.add("Python");
        dev1.languages.add("MERN");
        dev1.displayStatus();

        Project project1 = new Project();
        project1.title = "Lookify";
        project1.language = "MERN";

        Project project2 = new Project();
        project2.title = "Neflix clone";
        project2.language = "MERN";

        dev1.addProject(project1);
        dev1.addProject(project2);
        dev1.displayStatus();



    }
}
