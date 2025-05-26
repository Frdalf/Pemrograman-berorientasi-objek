import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;
import java.util.Random;

public class Main extends Application {
    private int angkaTebakan;
    private int jumlahPercobaan;
    private final Label feedbackLabel = new Label();
    private final Label percobaanLabel = new Label("Jumlah percobaan: 0");
    private final Button tombolTebak = new Button("Coba Tebak!");
    private final TextField inputField = new TextField();

    private void resetGame() {
        angkaTebakan = new Random().nextInt(100) + 1;
        jumlahPercobaan = 0;
        feedbackLabel.setText("");
        percobaanLabel.setText("Jumlah percobaan: 0");
        tombolTebak.setText("Coba Tebak!");
        inputField.setText("");
        inputField.setDisable(false);
    }

    @Override
    public void start(Stage primaryStage) {
        resetGame();

        Label title = new Label("🔎 Tebak Angka 1–100");
        title.setFont(Font.font("Arial", 24));
        title.setTextFill(Color.DARKBLUE);

        feedbackLabel.setFont(Font.font("Arial", 16));
        percobaanLabel.setFont(Font.font("Arial", 14));

        inputField.setPromptText("Masukkan angka di sini");
        inputField.setMaxWidth(200);

        tombolTebak.setStyle("-fx-background-color: #28a745; -fx-text-fill: white;");

        tombolTebak.setOnAction(e -> {
            if (tombolTebak.getText().equals("Main Lagi")) {
                resetGame();
                return;
            }

            String input = inputField.getText();
            try {
                int tebakan = Integer.parseInt(input);
                jumlahPercobaan++;
                if (tebakan < angkaTebakan) {
                    feedbackLabel.setText("⚡ Terlalu kecil!");
                    feedbackLabel.setTextFill(Color.ORANGE);
                } else if (tebakan > angkaTebakan) {
                    feedbackLabel.setText("⚡ Terlalu besar!");
                    feedbackLabel.setTextFill(Color.ORANGE);
                } else {
                    feedbackLabel.setText("✔ Tebakan benar!");
                    feedbackLabel.setTextFill(Color.DARKGREEN);
                    tombolTebak.setText("Main Lagi");
                    inputField.setDisable(true);
                }
                percobaanLabel.setText("Jumlah percobaan: " + jumlahPercobaan);
            } catch (NumberFormatException ex) {
                feedbackLabel.setText("Masukkan angka valid!");
                feedbackLabel.setTextFill(Color.RED);
            }
        });

        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);

        // Tambahkan background gambar
        Image bgImg = new Image(new File("src/wallpaperflare.com_wallpaper.jpg").toURI().toString());
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImg,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(400, 250, false, false, false, true)
        );
        root.setBackground(new Background(backgroundImage));

        HBox inputBox = new HBox(10);
        inputBox.setAlignment(Pos.CENTER);
        inputBox.getChildren().addAll(inputField, tombolTebak);

        root.getChildren().addAll(title, feedbackLabel, inputBox, percobaanLabel);

        Scene scene = new Scene(root, 400, 250);
        primaryStage.setTitle("Tebak Angka Advance");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
