import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Cash_withdrawal implements Window {

    Controller controller;
    ToggleGroup group = new ToggleGroup();
    String lang;

    Label nameLabel;
    Label amountLabel;
    TextField passwordPasswordField;
    Button backButton;
    Button nextButton;


    public void createUI(Controller controller, String lang) {
        this.controller = controller;
        this.lang = lang;
        if(lang == "Русский") {
            nameLabel = new Label("Снятие денег:");
            amountLabel = new Label("Количество:");
            backButton = new Button("Назад");
            nextButton = new Button("Снять");
            passwordPasswordField = new TextField();
        }
        if(lang == "English"){
            nameLabel = new Label("Cash withdrawal:");
            amountLabel = new Label("Amount:");
            backButton = new Button("Back");
            nextButton = new Button("Withdrawal");
            passwordPasswordField = new TextField();
        }
        Stage primaryStage = controller.getStage();

        TilePane tilePane = new TilePane(Orientation.VERTICAL);

        HBox h1 = new HBox();
        HBox h2 = new HBox();
        HBox h3 = new HBox();
        HBox h4 = new HBox();

        backButton.setOnAction(event -> {
            controller.interaction_user();
        });

        nextButton.setOnAction(event -> {
            on_cash_withdrawal();
            controller.interaction_user();
        });
        tilePane.getChildren().addAll(h1, h2, h3, h4);
        tilePane.setMaxSize(300, 300);
        VBox root = new VBox(nameLabel, amountLabel, passwordPasswordField, backButton, nextButton);
        root.setAlignment(Pos.CENTER);
       // root.getChildren().addAll(nameLabel, tilePane);
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void createUI() {

    }

    public void on_cash_withdrawal() {

        controller.cash_withdrawal2(Double.parseDouble(passwordPasswordField.getText()));


    }
}