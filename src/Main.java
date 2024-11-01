//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Initialize Model, View, and Presenter components
        DataModel model = new DataModel();
        ConsoleView view = new ConsoleView();
        DataPresenter presenter = new DataPresenter(model, view);

        // Start the data update process
        presenter.updateData();
    }
}

// Amina_Tuzelova_SE-2303
// Model just stores data, nothing fancy here
// View handles input/output stuff
// Presenter coordinates between model and view
// Final display showing combined data
// Main class just kicks everything off