package WeatherStation1;

public class WeatherData {
	  private CurrentConditionsDisplay currentConditionsDisplay;    
	  private StatisticsDisplay statisticsDisplay;   
	  private ForeCastDisplay forecastDisplay;   
	  private float temperature;   
	  private float humidity;   
      private float pressure;        
      
      public float getTemperature() {       
    	  return temperature;  
    	  } 
	  
	   public float getHumidity() {       
		   return humidity; 
	   }
	 
	   public float getPressure() {   
		   return pressure;
	   }
	 
	   public void measurementsChanged() {   
		   float temp = getTemperature();       
		   float humidity = getHumidity();     
		   float pressure = getPressure();      
		   currentConditionsDisplay.update(temp, humidity, pressure);      
		   statisticsDisplay.update(temp, humidity, pressure);      
		   forecastDisplay.update(temp, humidity, pressure); 
	   }
	 
	   public void setMeasurements(float temperature, float humidity, float pressure) {      
		   this.temperature = temperature;      
		   this.humidity = humidity;      
		   this.pressure = pressure; 
		   measurementsChanged();
	   }	   
	   
	   public void setCurrentConditionsDisplay(         
			   CurrentConditionsDisplay currentConditionsDisplay) {      
		   this.currentConditionsDisplay = currentConditionsDisplay;   
 } 
	 
	   public void setStatisticsDisplay(StatisticsDisplay statisticsDisplay) {     
		   this.statisticsDisplay = statisticsDisplay;   
		} 
	 
	   public void setForecastDisplay(ForeCastDisplay forecastDisplay) {     
		   this.forecastDisplay = forecastDisplay;
	   }

	public void setConditionDisplay(CurrentConditionsDisplay currentConditionsDisplay2) {
		// TODO Auto-generated method stub
		
	}

}
