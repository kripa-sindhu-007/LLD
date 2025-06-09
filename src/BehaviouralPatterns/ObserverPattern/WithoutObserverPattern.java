package BehaviouralPatterns.ObserverPattern;


class DisplayDevice{
    public void showTemp(float temp){
        System.out.println("Current temperature: " + temp + " C");
    }
}
class WeatherStation{
    private float temperature;

    private DisplayDevice displayDevice; //can be multiple devices

    public WeatherStation(DisplayDevice displayDevice){
        this.displayDevice = displayDevice;
    }
    public void setTemperature(float temp){
        this.temperature = temp;
        notifyDevice();
    }
    public void notifyDevice(){
        displayDevice.showTemp(temperature);
    }
}
public class WithoutObserverPattern {
    public static void main(String[] args){
        DisplayDevice device = new DisplayDevice();
        WeatherStation station = new WeatherStation(device);

        // tight coupling between station and device
        station.setTemperature(26.9F);
        station.setTemperature(30.1F);
    }
}
