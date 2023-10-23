package SingletonLab;

public class App {

    public static void main(String[] args)
    {
        WeatherData weatherData=WeatherData.getInstance();
        weatherData.setCity("Dhaka");
        System.out.println(weatherData.getCity());
    }
}
