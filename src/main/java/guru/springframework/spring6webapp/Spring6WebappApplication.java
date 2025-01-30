package guru.springframework.spring6webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Spring6WebappApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Spring6WebappApplication.class, args);
    }

}
