// Zachary Anderson
// Example: JavaFX FlowPane and BorderPane
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowBorderExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // BorderPane as the main layout
        BorderPane borderPane = new BorderPane();

        // Top region of BorderPane: a label
        Label header = new Label("Welcome to JavaFX Layout Example");
        borderPane.setTop(header);

        // Left region of BorderPane: a FlowPane with buttons
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10); // horizontal spacing between nodes
        flowPane.setVgap(10); // vertical spacing between nodes

        // Adding buttons to FlowPane
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");

        flowPane.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);

        // Set FlowPane in the center of BorderPane
        borderPane.setCenter(flowPane);

        // Bottom region of BorderPane: a single button
        Button footerButton = new Button("Footer Action");
        borderPane.setBottom(footerButton);

        // Scene and stage setup
        Scene scene = new Scene(borderPane, 500, 300);
        primaryStage.setTitle("JavaFX FlowPane & BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
