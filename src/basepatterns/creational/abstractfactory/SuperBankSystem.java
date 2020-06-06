package basepatterns.creational.abstractfactory;
import basepatterns.creational.abstractfactory.banking.BankindTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankindTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProgectManager();

        System.out.println("Creating bank sistem ...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
