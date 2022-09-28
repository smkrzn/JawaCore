package Lesson_6;

import okhttp3.*;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
      //  HttpURLConnection url = (HttpURLConnection) new URL("https://api.weather.yandex.ru/v2/informers?").openConnection();

        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("api.weather.yandex.ru")
                .addPathSegment("/v2/informers?lat=59.938955&lon=30.315644&[lang=ru_RU]")
                .addQueryParameter("X-Yandex-API-Key", "a529bc06-3d90-45c2-9424-5b70150bc97d")
                .build();

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .addHeader("X-Yandex-API-Key", "a529bc06-3d90-45c2-9424-5b70150bc97d")
                .url(url)
                .build();
        String jsonResponse = client.newCall(request).execute().body().string();

        System.out.println(jsonResponse);
    }
}
