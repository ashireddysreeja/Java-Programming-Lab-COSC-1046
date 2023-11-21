
package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label; 
import javafx.scene.layout.GridPane; 
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView; 
import javafx.stage.Stage;
public class JavaFXflags extends Application { @Override
  public void start(Stage primaryStage) 
        { GridPane pane = new GridPane();
pane.add(new ImageView(new Image("ukflag.png")), 0, 0);
pane.add(new ImageView(new Image("canada flag.png")), 1, 0);
pane.add(new ImageView(new Image("Flag-China.webp")), 0, 1); 
pane.add(new ImageView(new Image("us flag.png")), 1, 1);
Scene scene = new Scene(pane); primaryStage.setTitle("JavaFXflags"); primaryStage.setScene(scene);
primaryStage.show();
 } 
}