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
	@Bean
	public Ram myRam(){
		Ram r=new Ram();
		r.setSize(4); 
		r.setModel("Samsung");
		return r;
	}
	//@Bean
	//public Cpu myCpu() {
	//	Cpu c=new Cpu();
	//	c.setSpeed(0);;
		//return c;
	//}
}
