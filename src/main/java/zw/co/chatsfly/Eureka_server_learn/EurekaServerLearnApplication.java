package zw.co.chatsfly.Eureka_server_learn;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableAdminServer
@EnableAutoConfiguration
@EnableEurekaServer
@EnableDiscoveryClient
public class EurekaServerLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerLearnApplication.class, args);
	}

}
