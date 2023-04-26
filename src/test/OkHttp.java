package test;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * @author 朔风
 * @createTime 2022-10-21 23:55
 */
public class OkHttp {
    public static void main(String[] args) throws IOException {
        // 创建OkHttpClient对象
        OkHttpClient okHttpClient = new OkHttpClient();
        // 创建请求对象
        Request request = new Request.Builder().url("https://baidu.com").build();

        //  创建响应对象
        Response response = okHttpClient.newCall(request).execute();
        // 获取响应资源
        String s = response.body().string();
        System.out.println(s);



    }
}
