package com.mousycoder.mycode.jvm;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author: mousycoder
 * @Date: 2019-01-07 11:24
 * @Version 1.0
 */
public class HttpUtil {
    public static void main(String[] args) {
    }

    MyCode


    public static String openUrlTWR(String strUrl,String postParams){
        String message = "";

        try {
            URL webURL = new URL(strUrl);
            HttpURLConnection conn = (HttpURLConnection) webURL.openConnection();
            conn.setDoInput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            conn.connect();

            try (OutputStream os = conn.getOutputStream(); InputStream is = conn.getInputStream()){
                os.write(postParams.toString().getBytes());
                os.flush();
            }
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK){
                System.err.println("response error=" + conn.getResponseCode());
            }
        } catch (Exception e) {

        }
        return message;
    }
}
