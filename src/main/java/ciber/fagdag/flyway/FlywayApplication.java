package ciber.fagdag.flyway;

import org.apache.commons.logging.Log;
        import org.apache.commons.logging.LogFactory;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayApplication{

    private static Log logger = LogFactory.getLog(FlywayApplication.class);

    public static void main(String[] args) {
        //Flyway flyway = new Flyway(url, username);
        //flyway.migrate();
        SpringApplication.run(FlywayApplication.class, args);
    }
}
