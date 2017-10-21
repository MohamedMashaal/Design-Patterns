package observer_pattern.application;

public class WeatherStation {
	public static void main(String [] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(50, 65, 30.4f);
		weatherData.setMeasurements(35, 150, 21.5f);
		weatherData.setMeasurements(22, 63, 25.1f);
	}
}
