package photoapp.discovery;

import SpringApplication;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppDiscoveryServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(PhotoAppDiscoveryServiceApplication.class, args);
    }
}