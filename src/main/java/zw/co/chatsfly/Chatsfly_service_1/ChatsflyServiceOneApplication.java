package zw.co.chatsfly.Chatsfly_service_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableDiscoveryClient
@EnableAdminServer
public class ChatsflyServiceOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatsflyServiceOneApplication.class, args);
    }

    @RequestMapping("/")
    String test() {
        return "Client 4";
    }
    @RequestMapping("/hello")
    String test1() {
        return "Hello World";
    }
}
