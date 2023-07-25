package dasturlash.uz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "dasturlash.uz")
public class SpringConfig {

    @Bean
    public Engine professor() {
        Engine engine = new Engine();
        engine.setModel("JudaEsgi");
        return engine;
    }

    @Bean
    public Vehicle assistant() {
        Vehicle vehicle = new Vehicle();
        vehicle.setModel("latta");
        return vehicle;
    }

    @Bean
    public Car lesson(Engine engine, Vehicle vehicle) {
        Car car = new Car();
        car.setName("Lacetty");
        car.setVehicle(vehicle);
        car.setEngine(engine);
        return car;
    }
}
