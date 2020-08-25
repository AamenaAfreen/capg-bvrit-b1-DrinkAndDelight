package dnd.distributordetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@EnableHystrix
@SpringBootApplication
@EnableEurekaClient	

public class DndDistributordetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndDistributordetailsApplication.class, args);
		System.out.println("Springboot app started");
	}

}
