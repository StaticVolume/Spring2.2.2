package web.model;

public class Car {

    private String carModel;
    private int carPower;
    private int carAge;

    public Car() {

    }
    public Car(String carModel, int carPower, int carAge) {
        this.carModel = carModel;
        this.carPower = carPower;
        this.carAge = carAge;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarPower() {
        return carPower;
    }

    public void setCarPower(int carPower) {
        this.carPower = carPower;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    @Override
    public String toString() {
        return "Car {" +
                " carModel = '" + carModel + '\'' +
                ", carPower = " + carPower +
                ", carAge = " + carAge +
                " }";
    }
}
