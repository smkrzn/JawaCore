package Lesson_7;

import Lesson_7.enums.Periods;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class YandexWeatherProvider implements WeatherProvider{
    static Properties prop = new Properties();
    @Override
    public void getWeather(Periods periods) throws IOException {
        loadProperties();
        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host(prop.getProperty("BASE_URL"))
                .addPathSegment(prop.getProperty("API_VERSION"))
                .addPathSegment(prop.getProperty("HEADING"))
                .addQueryParameter("lat",WeatherRequest.getInstance().getCoordinates(0))
                .addQueryParameter("lon",WeatherRequest.getInstance().getCoordinates(1))
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
    }
    private static void loadProperties() throws IOException {
        try(FileInputStream configFile = new FileInputStream("src/Materials/lesson6.properties")){
            prop.load(configFile);
        }
    }
}
