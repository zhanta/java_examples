package classes.venicles;

import classes.details.Engine;
import classes.professions.Driver;

public class Car {
    private String marka;
    private String carClass;
    private Driver driver;
    private Engine engine;

    public void start() {}

    public void stop() {}

    public void turnRight() {}

    public void turnLeft() {}

    @Override
    public String toString() {
        return "marka: " + this.marka
        +"\ncarClass: " + this.carClass
        +"\nDriver: " + this.driver
        +"\nengine: "+ this.engine;
    }
}