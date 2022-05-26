package SensorsAndTemperature;

public class StandardSensor implements Sensor {
    private int intParameter;


    StandardSensor(int num) {
        this.intParameter = num;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return this.intParameter;
    }
}
