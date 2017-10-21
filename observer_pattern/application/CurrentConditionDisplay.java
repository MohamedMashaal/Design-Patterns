package observer_pattern.application;

import observer_pattern.DisplayElement;
import observer_pattern.Subject;

public class CurrentConditionDisplay implements observer_pattern.Observer , DisplayElement{
	private float temperature;
	private float humidity;
	private float pressure; 
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	@Override
	public void update(Subject sb) {
		WeatherData weatherData = (WeatherData)sb;
		this.humidity = weatherData.getHumidity();
		this.temperature = weatherData.getTemperature();
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current Conditions: " + temperature 
			+ "C degrees" + humidity + "% humidity");
	}


}
