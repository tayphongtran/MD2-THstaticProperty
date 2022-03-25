package cars;

public class TestStaticProperty {

    public static void main(String[] args) {
	// write your code here
        Car car1 = new Car("benz", "chay = nuoc");
        System.out.println(Car.numberOfCars + car1.getName() + car1.getEngine());

        Car car2 = new Car("mec", "chay = com");
        System.out.println(Car.numberOfCars + car2.getName() + car2.getEngine());


    }
}
