import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }


    public void start(Stage primaryStage) throws Exception {

        Stage stage = primaryStage;
        String fxmlFile = "main.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        root = loader.load(getClass().getResourceAsStream(fxmlFile));
        stage.setTitle("ExMod");
        stage.getIcons().add(new Image("icon.png"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
