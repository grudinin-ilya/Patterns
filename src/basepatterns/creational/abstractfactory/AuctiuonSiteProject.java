package basepatterns.creational.abstractfactory;
import basepatterns.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctiuonSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProgectManager();

        System.out.println("Creating site ...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
