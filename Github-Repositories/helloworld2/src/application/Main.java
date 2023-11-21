package application;
	
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
 
public class Main extends Application {
   public static void main(String[] args) {
       launch(args);
   }
 
   @Override
   public void start(Stage primaryStage) {
       FlowPane flowPane = new FlowPane();
       flowPane.setHgap(10);
       flowPane.setVgap(10);
       Image image1 = new Image("https://cdn.freebiesupply.com/logos/large/2x/swift-15-logo-png-transparent.png");
       Image image2 = new Image("https://tse4.mm.bing.net/th?id=OIP.xTyd7Zo4MdRcEapgrve51AHaHD&pid=Api&P=0&h=180");
       Image image3= new Image("https://tse2.mm.bing.net/th?id=OIP._Lm_T3scKhVEVFC54gcRxwAAAA&pid=Api&P=0&h=180");
   
       Label label1 = new Label("Swift");
       label1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
 
       Label label2 = new Label("C++");
       label2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
 
       Label label3 = new Label("Java");
       label2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
 
       ImageView imageView1 = new ImageView(image1);
       ImageView imageView2 = new ImageView(image2);
       ImageView imageView3 = new ImageView(image3);
 
       flowPane.getChildren().addAll(label1, imageView1, label2, imageView2,label3,imageView3);
 
       Scene scene = new Scene(flowPane, 400, 300);
       primaryStage.setScene(scene);
 
       primaryStage.setTitle("PROGRAMMING LANGUAGES");
 
       primaryStage.show();
   }
}