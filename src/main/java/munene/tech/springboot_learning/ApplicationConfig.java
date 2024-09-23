package munene.tech.springboot_learning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean("bean1")
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("First Bean");
    }

    @Bean
    public MyFirstClass mySecondBean() {
        return new MyFirstClass("my Second Bean");
    }

    @Bean
    // @Primary
    public MyFirstClass myThirdBean() {
        return new MyFirstClass("Third Bean");
    }
}
