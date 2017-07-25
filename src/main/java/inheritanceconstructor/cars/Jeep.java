package inheritanceconstructor.cars;

/**
 * Created by Training on 2017. 03. 23..
 */
public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {

        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;

        if( tankCapacity < fuel){
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
    }

    public void drive(int km){
            super.modifyFuelAmount(extraFuel);
            extraFuel = 0;
            super.drive(km);

    }

    public double calculateRefillAmount(){

        return super.calculateRefillAmount() + (extraCapacity - extraFuel);
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
