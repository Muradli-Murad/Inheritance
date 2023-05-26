public class Main {
    public static void main(String[] args) {

        Car car =new Car();
        car.setMake("Kian");
        car.setModel("Sportage");
        car.setColor("red");
        car.setDoors(4);
        car.setConvertible(false);

        System.out.println("make= "+car.getMake());
        System.out.println("model= "+car.getModel());
        System.out.println("color= "+car.getColor());
        System.out.println("doors= "+car.getDoors());
        System.out.println("convertible "+car.isConvertible());
        car.describeCar();


        Car car1=new Car();
        car1.setMake("Audi");
        car1.setModel("A8");
        car1.setColor("White");
        car1.setDoors(4);
        car1.setConvertible(true);

        System.out.println("make= "+car1.getMake());
        System.out.println("model= "+car1.getModel());
        System.out.println("color= "+car1.getColor());
        System.out.println("doors= "+car1.getDoors());
        System.out.println("convertible "+car1.isConvertible());
        car1.describeCar();
    }

}