package org.example.API;

import com.alibaba.fastjson.JSONObject;
import net.mamoe.mirai.contact.Group;
import net.mamoe.mirai.message.data.Image;
import net.mamoe.mirai.utils.ExternalResource;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

public class Morning {
    private static String getMorningUrl() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://api.2xb.cn/zaob");
        CloseableHttpResponse response = null;
        response = httpClient.execute(httpGet);
        if (response.getStatusLine().getStatusCode() == 200) {
            String content = EntityUtils.toString(response.getEntity(),"utf8");
            JSONObject jsonObject = JSONObject.parseObject(content);
            String result = jsonObject.getString("imageUrl");
            response.close();
            httpClient.close();
            return result;
        }
        return null;
    }
    public static Image getMorningImage(Group group) throws IOException {
        URL url = new URL(Objects.requireNonNull(getMorningUrl()));
        URLConnection uc = url.openConnection();
        InputStream in = uc.getInputStream();
        byte[] bytes = in.readAllBytes();
        ExternalResource ex = ExternalResource.create(bytes);
        Image image = group.uploadImage(ex);
        ex.close();
        return image;
    }

}
