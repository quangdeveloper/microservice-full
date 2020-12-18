package vn.vnpay.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    //@EnableEurekaServer: chi dingh day la may chu kham pha
    // may chu kham giup giup cac may chu trong he thong co the tim thay nhau
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
