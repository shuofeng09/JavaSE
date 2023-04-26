package test;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author 朔风
 * @createTime 2022-10-21 23:05
 */
public class HttpConnect {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();



        String responseMessage = String.valueOf(urlConnection.getResponseCode());

        System.out.println(responseMessage);

        System.out.println(urlConnection.getContent().toString());


    }
}
