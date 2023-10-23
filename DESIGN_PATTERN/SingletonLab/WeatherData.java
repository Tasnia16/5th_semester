package SingletonLab;

public class WeatherData {

    private  String city;
    private String temp;

    private  static WeatherData weatherData=null;

    private WeatherData()
    {

    }

    public static WeatherData getInstance()
    {
        if(weatherData==null)
            weatherData=new WeatherData();
        return weatherData;
    }

    public void setCity(String city)
    {
        this.city=city;
    }

    public String getCity()
    {
        return city;
    }
}
