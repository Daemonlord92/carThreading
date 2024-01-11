package vehicles;

import vehicles.engines.Engine;

public class Car implements Vehicle{
    protected String name;
    protected int speed;
    protected int milesTravelled;
    protected boolean isMoving;

    private Engine engine;

    public Car(Engine engine, String name) {
        this.name = name;
        this.engine = engine;
        this.speed = 0;
        this.milesTravelled = 0;
        this.isMoving = false;
    }

    @Override
    public void start() {
        if(isMoving) {
            System.out.println("Car is already Started and in motion");
            return;
        }
        engine.start();
    }

    @Override
    public void stop() {
        if(isMoving) {
            speed = 0;
            isMoving = false;
        }
        engine.stop();
    }

    @Override
    public void speedUp() {
        if(!isMoving) isMoving = true;
        speed += 5;
        if(speed < 10) moving();
    }

    @Override
    public void speedDown() {
        speed -= 5;
        if(speed == 0) isMoving = false;
    }

    @Override
    public void moving() {
        Thread moving = new Thread(() -> {
            while (isMoving) {
                milesTravelled += speed;
                System.out.println("You have travelled " + milesTravelled + " miles");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(name + " is stopping after " + milesTravelled + " miles!");
        });
        moving.setDaemon(true);
        moving.start();
    }
}
