package bai5_access_modifier.thuc_hanh.bai_th2_StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","skyactiv 3");
        System.out.println(Car.numberOfCar);

        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCar);
    }
}
