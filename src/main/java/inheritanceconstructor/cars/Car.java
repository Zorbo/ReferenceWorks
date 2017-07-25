package inheritanceconstructor.cars;

/**
 * Created by Training on 2017. 03. 23..
 */
public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if(tankCapacity < fuel){
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }

        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {

        if (this.fuel + fuel >= 0 || this.fuel <= this.tankCapacity) {
            this.fuel += fuel;
        }


    }

    public void drive(int km) {

        //this.fuel = this.fuel - (km / 20);
        // Ez a helyes kód! Ne a teszt alapján dolgozz!
        fuel -= km/100 * fuelRate;
        if (fuel < 0) {
            throw new RuntimeException("Not enough fuel available!");
        }

    }

    public double calculateRefillAmount() {

        return tankCapacity - fuel;
    }

    public double getFuel() {
        return fuel;
    }
}
