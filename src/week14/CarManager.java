package week14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class CarManager {
    HashMap<String, Car> parkingCar = new HashMap<>();
    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd HHmm");

    void enter(String number, String type) {
        Date today = new Date();
        Car car = new Car(type, today);
        parkingCar.put(number, car);
    }

    void print() {
        System.out.println("======================");
        System.out.println("num   type    time");
        for (String key : parkingCar.keySet()) {
            Car car = parkingCar.get(key);
            String change = format.format(car.getEnter());
            System.out.println(key + "  " + car.getType() + " " + change);
        }
    }

    void calculatefee(String number) {
        Car car = parkingCar.get(number);
        Date exit = new Date();
        String out = format.format(exit);
        long duration = (exit.getTime() - car.getEnter().getTime()) / (1000 * 60);
        int fee = 0;
        if (duration > 10) {
            long feetime = duration - 10 / 10;
            fee = (int) feetime * 500;
        }
        System.out.println(number + " " + car.getType() + " " + duration + "min, Parking fee " + fee + " (current time "
                + out + ")");
        parkingCar.remove(number);
    }
}
