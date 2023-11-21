import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ImageLabelFlowPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10); // Horizontal gap between elements

        // Create and set font for the labels
        Font labelFont = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);

        // Create labels and images
        Label label1 = new Label("Label 1");
        label1.setFont(labelFont);
        Image image1 = new Image("image1.png");
        ImageView imageView1 = new ImageView(image1);

        Label label2 = new Label("Label 2");
        label2.setFont(labelFont);
        Image image2 = new Image("image2.png");
        ImageView imageView2 = new ImageView(image2);

        // Add labels and images to the FlowPane
        flowPane.getChildren().addAll(label1, imageView1, label2, imageView2);

        Scene scene = new Scene(flowPane, 400, 200); // Set your desired width and height

        primaryStage.setTitle("Image and Label FlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}