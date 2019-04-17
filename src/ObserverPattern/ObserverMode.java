package ObserverPattern;
public class ObserverMode {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDispaly =
				new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 63.4f);
	}
}
