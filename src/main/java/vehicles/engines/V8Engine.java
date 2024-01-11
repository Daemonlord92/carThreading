package vehicles.engines;

public class V8Engine implements Engine{
    protected boolean isOn;
    @Override
    public void start() {
        isOn = true;
        System.out.println("Engine is running");
    }

    @Override
    public void stop() {
        isOn = false;
        System.out.println("Engine is off");
    }
}
