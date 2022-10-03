package Lesson_6;

import okhttp3.*;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;


public class Main {
    static Properties prop = new Properties();
    public static void main(String[] args) throws IOException {

        loadProperties();
        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host(prop.getProperty("BASE_URL"))
                .addPathSegment(prop.getProperty("API_VERSION"))
                .addPathSegment(prop.getProperty("HEADING"))
                .addQueryParameter("lat",prop.getProperty("SAINT_PETERSBURG_LAT"))
                .addQueryParameter("lon",prop.getProperty("SAINT_PETERSBURG_LON"))
                .addQueryParameter("lang",prop.getProperty("LANG"))
                .addQueryParameter("limit",prop.getProperty("LIMIT"))
                .addQueryParameter("hours",prop.getProperty("HOURS"))
                .addQueryParameter("extra",prop.getProperty("EXTRA"))
                .build();

        System.out.println(url.toString());

        Request request = new Request.Builder()
                .addHeader("X-Yandex-API-Key", prop.getProperty("API_KEY"))
                .url(url)
                .build();
        String jsonResponse = client.newCall(request).execute().body().string();

        System.out.println(jsonResponse);
    }

    private static void loadProperties() throws IOException {
        try(FileInputStream configFile = new FileInputStream("src/Materials/lesson6.properties")){
            prop.load(configFile);
        }
    }
}