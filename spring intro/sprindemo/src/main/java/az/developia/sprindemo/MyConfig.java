package az.developia.sprindemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class MyConfig {
	@Bean 
	public Student myStudent() {
		 Student s=new Student();
		 s.name="Adil";
		 return s;
	}
	
	

}
