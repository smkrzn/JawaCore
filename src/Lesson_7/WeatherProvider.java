package Lesson_7;


import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Integer periods) throws IOException;

}
