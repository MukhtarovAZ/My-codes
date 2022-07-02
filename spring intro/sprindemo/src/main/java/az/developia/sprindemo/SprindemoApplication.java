package az.developia.sprindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SprindemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c
		=SpringApplication.run(SprindemoApplication.class, args);
		String[] beans=c.getBeanDefinitionNames();
		
		Computer hp=c.getBean(Computer.class);
		System.out.println(hp.getModel());
		System.out.println(hp.getPrice());
		System.out.println(hp.getRam().getSize());
		System.out.println(hp.getCpu().getSpeed());
		
		
//		for(String b : beans) {
//			System.out.println(b);
//		}
//		
//		Student s=c.getBean(Student.class);
//		System.out.println(s.name);
//	}

}
}
