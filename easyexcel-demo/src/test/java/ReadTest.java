import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.fastjson.JSON;
import edu.xmut.easyexcel.TestFileUtil;
import edu.xmut.easyexcel.listener.DemoDataListener;
import edu.xmut.easyexcel.pojo.DemoData;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.File;

@Slf4j
public class ReadTest {


    @Test
    public void simpleRead() {


        String fileName = "D:\\Code\\JavaSE\\easyexcel-demo\\src\\main\\resources\\demo.xlsx";

        // 写法1
        EasyExcel.read(fileName, DemoData.class, new PageReadListener<DemoData>(demoData -> {
            for (DemoData data : demoData) {
                log.info("读取到一条数据{}", JSON.toJSONString(data));
                // System.out.println(JSON.toJSONString(data));
            }
        })).sheet().doRead();
        System.out.println("-------------------------------------------------------------");
        // 写法2
        EasyExcel.read(fileName, DemoData.class, new DemoDataListener()).sheet().doRead();

    }

}
