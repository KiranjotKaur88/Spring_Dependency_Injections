package co.springlearning.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.Paths;


public class DependencyInjectionApplication {

	public static void main(String[] args)
	{
		ApplicationContext context= new FileSystemXmlApplicationContext(Paths.get("src/main/resources/beans.xml").toString());
		System.out.println(context.getBean("student", Student.class));
	}

}
