package dasturlash.uz;

public class Car {
    private String name;
    private Engine engine; // domla
    private Vehicle vehicle; // yordamchi shogirt

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showDetail() {
        System.out.println("Lesson{" +
                "name='" + name + '\'' +
                ", professor=" + engine +
                ", assistant=" + vehicle +
                '}');
    }
}
