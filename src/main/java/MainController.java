import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    public static Stage stage;


    public void initialize() {

    }


    @FXML
    public void model(){
        stage = new Stage();
        String fxmlFile = "model.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        try {
            root = loader.load(getClass().getResourceAsStream(fxmlFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("ExMod");
        stage.getIcons().add(new Image("icon.png"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void modelInv(){
        stage = new Stage();
        String fxmlFile = "mInvest.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        try {
            root = loader.load(getClass().getResourceAsStream(fxmlFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("ExMod");
        stage.getIcons().add(new Image("icon.png"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void modelTreid(){
        stage = new Stage();
        String fxmlFile = "modelTreid.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        try {
            root = loader.load(getClass().getResourceAsStream(fxmlFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("ExMod");
        stage.getIcons().add(new Image("icon.png"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void mUser(){
        stage = new Stage();
        String fxmlFile = "mUser.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        try {
            root = loader.load(getClass().getResourceAsStream(fxmlFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("ExMod");
        stage.getIcons().add(new Image("icon.png"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void help(){
        stage = new Stage();
        String fxmlFile = "info.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        try {
            root = loader.load(getClass().getResourceAsStream(fxmlFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("ExMod - info");
        stage.getIcons().add(new Image("icon.png"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}

