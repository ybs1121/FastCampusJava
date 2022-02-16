package ch19_remind;

public class CarFactory {

    static int serialNum = 10000;

    private static CarFactory carFactory = new CarFactory();

    private CarFactory(){

    }

    public static CarFactory getInstance(){
        return carFactory;
    }

    public Car createCar(){
        Car car = new Car();
        serialNum++;
        car.setCarNum(serialNum);

        return car;
    }
}
