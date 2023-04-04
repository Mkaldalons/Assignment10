package vidmot.hi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class ReiknivelApplication extends Application {
    private Image setIcon(){
        return new Image("icon1.png");
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("reiknivel-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 400);

        stage.setTitle("Vasareiknir");

        stage.setScene(scene);
        stage.getIcons().add(setIcon());
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}