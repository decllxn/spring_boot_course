package munene.tech.springboot_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootLearningApplication {

	public static void main(String[] args) {

		var ctx = SpringApplication.run(SpringbootLearningApplication.class, args);

		MyFirstClass myFirstClass = ctx.getBean("myFirstBean", MyFirstClass.class);
		System.out.println(myFirstClass.sayHello());
	}

}
