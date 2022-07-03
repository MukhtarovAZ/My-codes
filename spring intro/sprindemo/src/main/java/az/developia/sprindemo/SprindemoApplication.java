package az.developia.sprindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SprindemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c
		=SpringApplication.run(SprindemoApplication.class, args);
		
		Computer comp=c.getBean(Computer.class);
		Computer comp2=c.getBean(Computer.class);
		comp2.setPrice(200);
		System.out.println(comp.getPrice());
		Computer comp3=c.getBean(Computer.class);
		System.out.println(comp3.getPrice());
		
		
		
		
		
		
		
	
		
	    Company company=c.getBean(Company.class);
		System.out.println(company.getName());
		
		/*Computer hp=c.getBean(Computer.class);
		System.out.println(hp.getModel());
		System.out.println(hp.getPrice());
		System.out.println(hp.getRam().getSize());
		System.out.println(hp.getCpu().getSpeed());
		*/
		
		
//		for(String b : beans) {
//			System.out.println(b);
//		}
//		
//		Student s=c.getBean(Student.class);
//		System.out.println(s.name);
//	}

}
}
