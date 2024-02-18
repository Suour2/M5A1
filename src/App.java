/* Bailey Garrett
 * module 5 assignment 1 
 * 2/15/24 
 * grid image
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Load images
        Image image1 = new Image("file:///C:/Users/Bailey/Downloads/14-1 Images/Images/flag1.gif");
        Image image2 = new Image("file:///C:/Users/Bailey/Downloads/14-1 Images/Images/flag2.gif");
        Image image3 = new Image("file:///C:/Users/Bailey/Downloads/14-1 Images/Images/flag6.gif");
        Image image4 = new Image("file:///C:/Users/Bailey/Downloads/14-1 Images/Images/flag7.gif");

        // Create image views
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);

        // Add images to the grid pane
        gridPane.add(imageView1, 0, 0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 0, 1);
        imageView3.setFitWidth(410); // set width of iamge to match others
        imageView3.setFitHeight(210); // set height of image to match others
        gridPane.add(imageView4, 1, 1);

        // add images to grid pane
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Image Grid Pane");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}