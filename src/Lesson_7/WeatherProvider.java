package Lesson_7;

import Lesson_7.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Integer periods) throws IOException;

}
