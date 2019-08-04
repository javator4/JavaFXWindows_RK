package pl.sda.windows;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import pl.sda.windows.controller.RootController;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader();

        fxmlLoader.setLocation(getClass().getResource("/rootview.fxml"));

        fxmlLoader.load();

        RootController controller = fxmlLoader.getController();
        System.out.println(controller);

        controller.test();


    }
}
