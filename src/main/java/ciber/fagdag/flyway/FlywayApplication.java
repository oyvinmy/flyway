package ciber.fagdag.flyway;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
public class FlywayApplication{

    private static Log logger = LogFactory.getLog(FlywayApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FlywayApplication.class, args);
    }
}
