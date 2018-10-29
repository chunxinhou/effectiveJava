import builder.Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car.Builder(4,4).
                            color(3).
                            electricSeat(2).
                            headlight(5).build();



    }
}
