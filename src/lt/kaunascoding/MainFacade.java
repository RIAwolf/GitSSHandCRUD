package lt.kaunascoding;

import lt.kaunascoding.controller.ProjectController;
import lt.kaunascoding.model.FileCRUD;
import lt.kaunascoding.view.CommandLineUI;

public class MainFacade {

    public static void main(String[] args) {
        FileCRUD model = new FileCRUD();
        CommandLineUI ui = new CommandLineUI();
        ProjectController controller = new ProjectController(ui, model);
        controller.dirbam();
    }


}
