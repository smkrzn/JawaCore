package Lesson_7;


public class WeatherRequest {

    private String period;
    private static WeatherRequest INSTANCE;
    private Float[] coordinates = new Float[2];

    public static WeatherRequest getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new WeatherRequest();
        }

        return INSTANCE;
    }

    public void setCoordinates (Float lat, Float lon){
        this.coordinates[0] = lat;
        this.coordinates[1] = lon;
    }

    public String getCoordinates(int i) {
        return coordinates[i].toString();
    }

    public String getPeriod() {
        return period;
    }


    public void setPeriod(String period) {
        this.period = period;
    }

}
