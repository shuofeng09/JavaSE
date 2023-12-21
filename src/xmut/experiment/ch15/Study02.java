package xmut.experiment.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Study02 extends Application {
   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage primaryStage) {
      Pane root2 = new Pane();

      // 第一个长方形
      Rectangle rectangle1 = new Rectangle(50, 50, 200, 100);
      rectangle1.setFill(Color.RED);
      rectangle1.setStroke(Color.BLACK);
      root2.getChildren().add(rectangle1);

      // 第二个长方形,完全包含在第一个长方形中
      Rectangle rectangle2 = new Rectangle(60, 90, 50, 25);
      rectangle2.setFill(Color.BLACK);
      rectangle2.setStroke(Color.BLACK);
      root2.getChildren().add(rectangle2);

      // 第三个长方形，与第一个和第二个长方形有交叉
      Ellipse ellipse1 = new Ellipse(170, 110, 100, 50);
      ellipse1.setFill(Color.YELLOW);
      ellipse1.setStroke(Color.BLACK);
      root2.getChildren().add(ellipse1);

      // 第四个长方形，与前三个长方形完全没有交叉
      Ellipse ellipse2 = new Ellipse(300, 300, 100, 50);
      ellipse2.setFill(Color.GREEN);
      ellipse2.setStroke(Color.GREEN);
      root2.getChildren().add(ellipse2);

      Scene scene = new Scene(root2, 600, 600);
      primaryStage.setTitle("Rectangles");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
