package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
}
