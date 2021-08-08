package org.example.API;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Sentence {
    public static String getYi() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://v1.hitokoto.cn/?encode=json");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if (response.getStatusLine().getStatusCode() == 200) {
            String content = EntityUtils.toString(response.getEntity(), "utf8");
            JSONObject jsonObject = JSONObject.parseObject(content);
            String sentence = jsonObject.getString("hitokoto");
            String author = jsonObject.getString("from_who");
            String from = jsonObject.getString("from");
            response.close();
            httpClient.close();
            if (author == null){
                return "『" + sentence + "』" + "       ————《" + from + "》";
            }
            return "『" + sentence + "』" + "       ————"+ author+"《" + from + "》";
        }
        return null;
    }
}
