package zw.co.chatsfly.Eureka_server_learn;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
@EnableEurekaServer
public class EurekaServerLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerLearnApplication.class, args);
	}

}
