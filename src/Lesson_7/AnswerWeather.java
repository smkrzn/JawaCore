package Lesson_7;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AnswerWeather {

    private String lat;
    private String lon;
    private String date;
    private String wetherText;
    private String temperature;

    public AnswerWeather() {
    }
    @JsonGetter("lat")
    public String getLat() {
        return lat;
    }
    @JsonSetter("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }
    @JsonGetter("lon")
    public String getLon() {
        return lon;
    }
    @JsonSetter("lon")
    public void setLon(String lon) {
        this.lon = lon;
    }
    @JsonGetter ("date")
    public String getDate() {
        return date;
    }
    @JsonSetter("date")
    public void setDate(String date) {
        this.date = date;
    }
    @JsonGetter("condition")
    public String getWetherText() {
        return wetherText;
    }
    @JsonSetter("condition")
    public void setWetherText(String wetherText) {
        this.wetherText = wetherText;
    }
    @JsonGetter("temp_avg")
    public String getTemperature() {
        return temperature;
    }
    @JsonSetter("temp_avg")
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
