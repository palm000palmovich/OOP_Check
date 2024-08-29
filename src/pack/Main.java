package pack;
public class Main {
    public static void main(String[] args) {

        Vehicle car1 = new Car("car1", 4);
        Vehicle car2 = new Car("car2", 4);

        Vehicle truck1 = new Truck("truck1", 6);
        Vehicle truck2 = new Truck("truck2", 8);

        Vehicle bicycle1 = new Bicycle("bicycle1", 2);
        Vehicle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.check(car1, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle1, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck1);
        station.check(null, null, truck2);

    }
}