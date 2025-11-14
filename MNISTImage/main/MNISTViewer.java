import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class MNISTViewer extends Application{
    public static int[][] image;

    @Override
    public void start(Stage stage){
        Canvas canvas = new Canvas(280, 280);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (int r = 0; r < 28; r++) {
            for (int c = 0; c < 28; c++) {
                int gray = image[r][c];
                gc.setFill(javafx.scene.paint.Color.grayRgb(gray));
                gc.fillRect(c * 10, r * 10, 10, 10);
            }
        }


        stage.setScene(new Scene(new StackPane(canvas)));
        stage.setTitle("MNIST Digit Viewer");
        stage.show();


    }

    public static void main(String[] args){
        launch(args);
    }

}