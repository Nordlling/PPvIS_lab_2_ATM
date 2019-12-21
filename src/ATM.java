import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class ATM extends Application {

    private Card_insert card_insert = new Card_insert();
    @Override
    public void start(Stage primaryStage) throws Exception {

        card_insert.createUI();
        primaryStage.setTitle("Lab №2");
        primaryStage.show();
        primaryStage.setOnCloseRequest((WindowEvent t) -> {
            Platform.exit();
            System.exit(0);
        });
        }
    }

