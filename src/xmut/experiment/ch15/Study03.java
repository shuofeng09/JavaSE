package xmut.experiment.ch15;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class Study03 extends Application {
   @Override
   public void start(Stage stage) {
      try {
         // 最底层的雪球
         Ellipse baseSnowball =new Ellipse(80,210,80,60);
         baseSnowball.setFill(Color.WHITE);
         // 连接的中间雪球
         Ellipse connectSnowball =new Ellipse(80,130,50,40);
         connectSnowball.setFill(Color.WHITE);
         // 头部的雪球
         Circle headerSnowball = new Circle(80,70,30);
         headerSnowball.setFill(Color.WHITE);

         // 眼部
         Circle rightEye = new Circle(70,60,5);
         Circle leftEye = new Circle(90,60,5);
         // 手部
         Line leftArm= new Line(110,130,160,130);
         leftArm.setStrokeWidth(3);
         Line rightArm= new Line(50,130,0,100);
         rightArm.setStrokeWidth(3);
         // 嘴巴
         Arc mouth = new Arc(80,85,15,10,360,180);
         mouth.setFill(null);
         mouth.setStrokeWidth(2);
         mouth.setStroke(Color.BLACK);// 设置画笔颜色
         // 纽扣
         Circle upperButton = new Circle(80,120,6);
         upperButton.setFill(Color.RED);
         Circle lowerButton = new Circle(80,140,6);
         lowerButton.setFill(Color.RED);


         Rectangle upperHat = new Rectangle(60,0,40,50);
         Rectangle lowerHat = new Rectangle(50,45,60,5);

         // 将图案放入面板
         Group hat = new Group(upperHat,lowerHat);
         hat.setTranslateX(10);
         hat.setRotate(15);
         // 组成雪人
         Group snowman = new Group(baseSnowball,connectSnowball,headerSnowball,leftEye,rightEye,leftArm,rightArm,mouth,
               upperButton,lowerButton,hat);
         snowman.setTranslateX(170);
         snowman.setTranslateY(50);
         // 太阳
         Circle sun = new Circle(450,50,30);
         sun.setFill(Color.GOLD);
         // 下面的蓝色背景
         Rectangle ground = new Rectangle(0,250,500,100);
         ground.setFill(Color.STEELBLUE);
         // 文字栏目
         Text bannerName=new Text();
         bannerName.setText("厦门理工大学");
         bannerName.setX(50);
         bannerName.setY(50);
         // 组成图形
         Group root = new Group(ground,sun,snowman,bannerName);
         Scene scene = new Scene(root,500,350,Color.LIGHTBLUE);// 画板背景为浅蓝色
         stage.setScene(scene);
         stage.setTitle("Snowman");
         stage.show();
      } catch(Exception e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      launch(args);
   }
}
