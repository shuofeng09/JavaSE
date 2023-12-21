package xmut.experiment.ch15;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class Study04 extends Application {
   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage stage) {
      // 创建饼图的数据列表
      List<PieChart.Data> pieChartData = Arrays.asList(
            new PieChart.Data("Miscellaneous", 10),
            new PieChart.Data("Education", 25),
            new PieChart.Data("Food", 15),
            new PieChart.Data("Transportation", 15),
            new PieChart.Data("Rent and Utilities", 35)
      );

      // 创建饼图
      PieChart pieChart = new PieChart();
      pieChart.getData().addAll(pieChartData);
      pieChart.setLabelLineLength(0);// 设置标签线长度

      // 设置饼图的颜色
      int colorIndex = 0;
      for (PieChart.Data data : pieChartData) {
         data.getNode().setStyle("-fx-pie-color: " + getColor(colorIndex));
         colorIndex++;
      }

      pieChart.setLegendVisible(false);// 取消图例
      // 创建场景
      Group root = new Group(pieChart);
      Scene scene = new Scene(root);

      stage.setTitle("Expense Pie Chart");
      stage.setScene(scene);
      stage.show();
   }
   // 获取不同的颜色
   private String getColor(int index) {
      String[] colors = { "PINK", "#0000FF", "#00FFFF","GREEN", "#FF0000"};
      return colors[index % colors.length];
   }
}
