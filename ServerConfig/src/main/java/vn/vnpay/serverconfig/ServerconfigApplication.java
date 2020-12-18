package vn.vnpay.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ServerconfigApplication {

    // @EnableConfigServer: biến máy chủ này thành máy chủ cấu hình
    public static void main(String[] args) {
        SpringApplication.run(ServerconfigApplication.class, args);
    }

}
