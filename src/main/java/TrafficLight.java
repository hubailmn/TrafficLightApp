import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class TrafficLight extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Traffic Light");
        stage.setResizable(false);
        stage.setWidth(450);
        stage.setHeight(500);

        Rectangle rectangle = new Rectangle(50, 100);
        rectangle.fillProperty().set(Color.BLACK);

        Circle redCircle = new Circle(100, 10, 10);
        redCircle.fillProperty().set(Color.RED);
        redCircle.setOpacity(1);

        Circle yellowCircle = new Circle(100, 10, 10);
        yellowCircle.fillProperty().set(Color.YELLOW);
        yellowCircle.setOpacity(0.3);

        Circle greenCircle = new Circle(100, 10, 10);
        greenCircle.fillProperty().set(Color.GREEN);
        greenCircle.setOpacity(0.3);

        VBox circles = new VBox(10);
        circles.setAlignment(Pos.CENTER);
        circles.getChildren().addAll(redCircle, yellowCircle, greenCircle);

        StackPane pane = new StackPane();
        pane.getChildren().addAll(rectangle, circles);

        Button redButton = new Button();
        redButton.setText("Red Light");

        Button yellowButton = new Button();
        yellowButton.setText("Yellow Light");

        Button greenButton = new Button();
        greenButton.setText("Green Light");

        HBox buttons = new HBox(10);
        buttons.getChildren().addAll(redButton, yellowButton, greenButton);
        buttons.setAlignment(Pos.CENTER);

        Label trafficLabel = new Label("Stop");

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(pane, trafficLabel, buttons);

        redButton.setOnAction(e -> {
            redCircle.setOpacity(1);
            yellowCircle.setOpacity(0.3);
            greenCircle.setOpacity(0.3);
            trafficLabel.setText("Stop");
        });

        yellowButton.setOnAction(e -> {
            redCircle.setOpacity(0.3);
            yellowCircle.setOpacity(1);
            greenCircle.setOpacity(0.3);
            trafficLabel.setText("Wait");
        });

        greenButton.setOnAction(e -> {
            redCircle.setOpacity(0.3);
            yellowCircle.setOpacity(0.3);
            greenCircle.setOpacity(1);
            trafficLabel.setText("GO");
        });

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
