package xmut.experiment.ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Study01 extends Application {
   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage primaryStage) {
      Pane root = new Pane();

      // 第一个长方形
      Rectangle rectangle1 = new Rectangle(50, 50, 200, 100);
      rectangle1.setFill(null);
      rectangle1.setStroke(Color.RED);
      root.getChildren().add(rectangle1);

      // 第二个长方形,完全包含在第一个长方形中
      Rectangle rectangle2 = new Rectangle(60, 90, 50, 25);
      rectangle2.setFill(null);
      rectangle2.setStroke(Color.BLACK);
      root.getChildren().add(rectangle2);

      // 第三个长方形，与第一个和第二个长方形有交叉
      Rectangle rectangle3 = new Rectangle(70, 70, 200, 100);
      rectangle3.setFill(null);
      rectangle3.setStroke(Color.YELLOW);
      root.getChildren().add(rectangle3);

      // 第四个长方形，与前三个长方形完全没有交叉
      Rectangle rectangle4 = new Rectangle(300, 300, 200, 100);
      rectangle4.setFill(null);
      rectangle4.setStroke(Color.GREEN);
      root.getChildren().add(rectangle4);

      Scene scene = new Scene(root, 600, 600);
      primaryStage.setTitle("Rectangles");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
