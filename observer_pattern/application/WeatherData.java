package observer_pattern.application;

import java.util.ArrayList;

import observer_pattern.Observer;
import observer_pattern.Subject;

public class WeatherData implements Subject {
	private ArrayList observers ;
	private float temperature;
	private float humidity;
	private float pressure; 
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer ob) {
		observers.add(ob);
	}

	@Override
	public void removeObserver(Observer ob) {
		int index = observers.indexOf(ob);
		if(index >= 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for(int i = 0 ; i < observers.size() ; i ++) {
			Observer ob = (Observer)observers.get(i);
			ob.update(this);
		}
	}
	
	public void setMeasurements(float temperature , float humidity , float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	// rest of code here ...
}
